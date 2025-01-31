import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;

public class ReadImageTypes {

	public static void main(String[] args) {
		  //Loading the OpenCV core library  
	      System.loadLibrary( Core.NATIVE_LIBRARY_NAME ); 
	      
	      //Reading the Image from the file and storing it in to a Matrix object 
	      String file = "./test_images/lena_color_512.bmp";       
	      
		  // Reading the image as gray image + scale
	      Mat image = Imgcodecs.imread(file, Imgcodecs.IMREAD_REDUCED_GRAYSCALE_2);

	      //Display image
		HighGui.imshow("Image",image);

		HighGui.waitKey();
		HighGui.destroyAllWindows();
		System.exit(0);
	}
}