import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class ReadingImages {

    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
//        System.out.println("Static");
    }

    public static void main(String[] args) {

        String file ="./test_images/halloween.png";
        Mat matrix = Imgcodecs.imread(file, Imgcodecs.IMREAD_REDUCED_COLOR_2);
        System.out.println("Image Loaded");
        System.out.println(CvType.typeToString(matrix.type()));

        Mat gray = new Mat();
        Mat binary = new Mat();

        Imgproc.cvtColor(matrix,gray,Imgproc.COLOR_BGR2GRAY);
        Imgproc.threshold(gray, binary,127,255, Imgproc.THRESH_BINARY);

        //Writing the image
//        String fileSave ="./Desert_out.jpg";
//        Imgcodecs.imwrite(fileSave, binary);
//        System.out.println("Image Saved");

        HighGui.imshow("Original image", matrix);
        HighGui.imshow("Gray", gray);
        HighGui.imshow("Binary", binary);

        HighGui.waitKey();
        HighGui.destroyAllWindows();
        System.exit(0);


    }
}
