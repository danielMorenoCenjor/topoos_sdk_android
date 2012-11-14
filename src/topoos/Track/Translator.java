package topoos.Track;

import android.content.Context;
import topoos.AccessTokenOAuth;
import topoos.APIAccess.APICaller;
import topoos.APIAccess.Operations.*;
import topoos.APIAccess.Results.*;
import topoos.APIAccess.Results.Objects.*;
/**
 * 
 * @author MAJS
 *
 */
class Translator {

	private static String method = "GET";
	private static String format = "json";
	private static Integer version = topoos.Constants.APIVERSION;

	/**
	 * 
	 * @param name
	 * @param accessTokenPregenerated
	 * @return
	 */
	public static Track Add(String name,
			AccessTokenOAuth accessTokenPregenerated) {

		Track track = null;
		if (accessTokenPregenerated.isValid()) {
			TracksAdd tracksAdd = new TracksAdd("Add", method, format, version,
					accessTokenPregenerated.getAccessToken(), null, name);
			TrackResult trackResult = new TrackResult();
			APICaller.ExecuteOperation(tracksAdd, trackResult);
			track = trackResult.getTrack();
		}
		return track;

	}

	/**
	 * 
	 * @param trackID
	 * @param numberPositions
	 * @param layers
	 * @param accessTokenPregenerated
	 * @return
	 */
	public static Track Get(Integer trackID, Integer numberPositions,
			String[] layers, AccessTokenOAuth accessTokenPregenerated) {
		Track track = null;
		if (accessTokenPregenerated.isValid()) {
			TracksGet tracksGet = new TracksGet("Get", method, format, version,
					accessTokenPregenerated.getAccessToken(), trackID,
					numberPositions, null, null, layers);
			TrackResult trackResult = new TrackResult();
			APICaller.ExecuteOperation(tracksGet, trackResult);
			track = trackResult.getTrack();
		}
		return track;

	}

	/**
	 * 
	 * @param numberPOIS
	 * @param layers
	 * @param accessTokenPregenerated
	 * @return
	 */
	public static Track GetLast(Integer numberPOIS, String[] layers,
			AccessTokenOAuth accessTokenPregenerated) {
		Track track = null;
		if (accessTokenPregenerated.isValid()) {
			TracksGet_last tracksGet_last = new TracksGet_last("GetLast", method, format,
					version, accessTokenPregenerated.getAccessToken(), null,
					numberPOIS, layers);
			TrackResult trackResult = new TrackResult();
			APICaller.ExecuteOperation(tracksGet_last, trackResult);
			track = trackResult.getTrack();
		}
		return track;

	}

	/**
	 * 
	 * @param context
	 * @param name
	 * @return
	 */
	public static Track Add(Context context, String name) {
		AccessTokenOAuth accessTokenPregenerated = new AccessTokenOAuth();
		accessTokenPregenerated.Load_Token(context);
		Track track = null;
		if (accessTokenPregenerated.isValid()) {
			TracksAdd tracksAdd = new TracksAdd("Add", method, format, version,
					accessTokenPregenerated.getAccessToken(), null, name);
			TrackResult trackResult = new TrackResult();
			APICaller.ExecuteOperation(tracksAdd, trackResult);
			track = trackResult.getTrack();
		}
		return track;

	}
	
	/**
	 * 
	 * @param context
	 * @param trackID
	 * @param numberPositions
	 * @param layers
	 * @return
	 */
	public static Track Get(Context context, Integer trackID, Integer numberPositions,
			String[] layers) {
		AccessTokenOAuth accessTokenPregenerated = new AccessTokenOAuth();
		accessTokenPregenerated.Load_Token(context);
		Track track = null;
		if (accessTokenPregenerated.isValid()) {
			TracksGet tracksGet = new TracksGet("Get", method, format, version,
					accessTokenPregenerated.getAccessToken(), trackID,
					numberPositions, null, null, layers);
			TrackResult trackResult = new TrackResult();
			APICaller.ExecuteOperation(tracksGet, trackResult);
			track = trackResult.getTrack();
		}
		return track;

	}
	
	/**
	 * 
	 * @param context
	 * @param numberPOIS
	 * @param layers
	 * @return
	 */
	public static Track GetLast(Context context, Integer numberPOIS, String[] layers) {
		AccessTokenOAuth accessTokenPregenerated = new AccessTokenOAuth();
		accessTokenPregenerated.Load_Token(context);
		Track track = null;
		if (accessTokenPregenerated.isValid()) {
			TracksGet_last tracksGet_last = new TracksGet_last("GetLast", method, format,
					version, accessTokenPregenerated.getAccessToken(), null,
					numberPOIS, layers);
			TrackResult trackResult = new TrackResult();
			APICaller.ExecuteOperation(tracksGet_last, trackResult);
			track = trackResult.getTrack();
		}
		return track;

	}
	
	
}