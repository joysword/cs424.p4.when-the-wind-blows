/**
 * 
 */
package main;

import com.jogamp.opengl.util.texture.TextureData.Flusher;

/**
 * @author giric
 *
 */
public class Positions {
	
	/**
	 * positions coordinates for sample items
	 */
	public static float sampleBoxWidth = Utilities.width - Utilities.Converter(50);
	public static float sampleBoxHeight = Utilities.height - Utilities.Converter(50);
	public static float sampleBoxX = Utilities.Converter(25);
	public static float sampleBoxY = Utilities.Converter(25);
	
	//public static float buttonSampleWidth = Utilities.Converter(50);
	//public static float buttonSampleHeight = Utilities.Converter(15);
	//public static float buttonSampleX = Utilities.Converter(2);
	//public static float buttonSampleY = Utilities.height - Utilities.Converter(2) - Positions.buttonSampleHeight;

	public static float sampleTextX = Utilities.width/2;
	public static float sampleTextY = Utilities.height/2;
	
	// day buttons
	public static float dayButtonW = Utilities.Converter(15);
	public static float dayButtonH = Utilities.Converter(10);
	public static float dayButtonX = Utilities.Converter(40);
	public static float dayButtonY = Utilities.height - Utilities.Converter(2) - Positions.dayButtonH;
	
	/**
	 * positions coordinates for the items on the screen
	 * Positions are relative to each other.
	 * Do study their structure before changing any value
	 */
	
	// map
	public static float mapWidth = Utilities.width * 3 / 6 - Utilities.Converter(3);
	public static float mapHeight = Utilities.height * 2 / 3 - Utilities.Converter(3);
	public static float mapX = 0 + Utilities.Converter(2);
	public static float mapY = 0 + Utilities.Converter(2);
	
	// weatherPanel
	public static float weatherPanelWidth = U.width / 9;
	public static float weatherPanelHeight = U.height / 8;
	public static float weatherPanelX = mapX;
	public static float weatherPanelY = mapY;

	// daySlider
	public static float daySliderWidth = Positions.mapWidth;
	public static float daySliderHeight = Utilities.height / (3*2) - Utilities.Converter(10);
	public static float daySliderX = Positions.mapX;
	public static float daySliderY = Utilities.height - Positions.daySliderHeight + Utilities.Converter(2);

	// timeSlider
	public static float timeSliderWidth = Positions.mapWidth;
	public static float timeSliderHeight = Utilities.height / (3*2) - Utilities.Converter(2);
	public static float timeSliderX = Positions.mapX;
	public static float timeSliderY = Utilities.height * 2 / 3 - Utilities.Converter(2);
	
	// tweetWindow
	public static float tweetWindowHeight = Utilities.height / 3 - Utilities.Converter(3);
	public static float tweetWindowWidth = Utilities.width / 6 - Utilities.Converter(3);
	public static float tweetWindowX = Positions.mapX + Positions.mapWidth + Utilities.Converter(2);
	public static float tweetWindowY = 0 + Utilities.Converter(2);
	
	// wordCloud
	public static float wordCloudBeforeWidth = Utilities.width / 6 - Utilities.Converter(3);
	public static float wordCloudBeforeHeight = Utilities.height / 3 - Utilities.Converter(3);
	public static float wordCloudBeforeX = Positions.tweetWindowX + Positions.tweetWindowWidth + Utilities.Converter(2);
	public static float wordCloudBeforeY = 0 + Utilities.Converter(2);
	
	// wordCloud
	public static float wordCloudAfterWidth = Utilities.width / 6 - Utilities.Converter(3);
	public static float wordCloudAfterHeight = Utilities.height / 3 - Utilities.Converter(3);
	public static float wordCloudAfterX = Positions.wordCloudBeforeX + Positions.wordCloudBeforeWidth + Utilities.Converter(2);
	public static float wordCloudAfterY = 0 + Utilities.Converter(2);
	
	// keyboard
	public static float keyboardWidth = Utilities.width / 6 - Utilities.Converter(3);
	public static float keyboardHeight = Utilities.height / 3 - Utilities.Converter(3);
	public static float keyboardX = Positions.wordCloudAfterX;
	public static float keyboardY = Utilities.height * 2 / 3 + Utilities.Converter(1);
	
	// zoom buttons
	// FIXME: right side of zoom buttons should be aligned with map, but not 
	public static float zoomInButtonW = Utilities.Converter(20);
	public static float zoomInButtonH = Utilities.Converter(15);
	public static float zoomInButtonX = Pos.mapX + Pos.mapWidth - zoomInButtonW;
	public static float zoomInButtonY = Pos.mapY + Pos.mapHeight / 2 - Utilities.Converter(18);
	
	public static float zoomOutButtonW = zoomInButtonW;
	public static float zoomOutButtonH = zoomInButtonH;
	public static float zoomOutButtonX = zoomInButtonX;
	public static float zoomOutButtonY = Pos.mapY + Pos.mapHeight / 2 + Utilities.Converter(3);
	

}

