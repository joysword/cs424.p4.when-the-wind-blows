/**
 * 
 */
package Util;

import main.CS424_Project4_Group4;
import markers.AbstractMarker;
import markers.DefaultMarker;
import markers.MarkerType;
import processing.core.PFont;
import processing.core.PShape;

/**
 * @author giric
 *
 */
public class Utilities {
	
	// configuration
	public static boolean isWall = false;
	public static boolean drawGridLine = true;
	public static int dayButtonLowerBound = 0;
	
	// variables
	public static int currentDay = 17;
	public static String currentWord = "accident";
	public static int bHalf = 20; // include
	public static int eHalf = 28; // exclude
	public static int bHalf_temp;
	public static int eHalf_temp;
	public static String currentTweet = "";
	public static String tweetTime = "";
	public static int tweetPid = -1;
	
	// constants
	public static final int NEITHER = -1;
	public static final int LEFT = 0;
	public static final int RIGHT = 1;
	
	public static float Converter(float pixel) {
		if (isWall)
			return 12*pixel;
		else
			return 2*pixel;
	}
	
	public static float Converter(double pixel) {
		if (isWall)
			return (float)(12*pixel);
		else
			return (float)(2*pixel);
	}
	
	public static float width = Converter(680);
	public static float height = Converter(192);
	
	public static CS424_Project4_Group4 CS424_Project4_Group4;
	
	public static PFont font;
	
	public static boolean sampleText = false;
	
	public static int mapMaxW = 5215;
	public static int mapMaxH = 2652;
	
	public static PShape rain;
	public static PShape cloudy;
	public static PShape clear;
	public static PShape showers;
	
	public static int selectedLocationId = 0; // this is equal to 0 if all locations are selected
	
	public static boolean suggestionBox = false;
	
	
	public static AbstractMarker getMarkerType(AbstractMarker marker, MarkerType markerType) {

		switch (markerType) {
		case DEFAULT_MARKER:
		    return new DefaultMarker(marker.getP(), marker.getX(), marker.getY(), marker.getPid(), marker.getHour(), marker.getMin(), marker.getTweet());
		default:
		    return null;
	    }
	}
	
	// total number of Tweets of each day
	public static final int[] totalTweets = {
		44336, 45257, 45082, 44384, 46669, 44400, 44978,
		46302, 44446, 44717, 44766, 46785, 45239, 46667,
		45556, 44964, 48975, 46534, 61871, 71279, 69870
	};
	public static final int maxTweets = 71279; // day 19 (second last day)
	
	public static final float markerHalfWidth = U.Converter(5);
	public static final float markerHalfHeight = U.Converter(5);
}
	
