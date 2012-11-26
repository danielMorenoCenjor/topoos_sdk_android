package topoos.Positions;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import topoos.AccessTokenOAuth;
import topoos.Exception.TopoosException;
import topoos.Objects.Position;
import android.content.Context;
/**
 * 
 * @author MAJS
 *
 */
public class Operations {
	/**
	 * Register a new position. This may be an isolated position or the position of an existing track.
	 * 
	 * @param lat
	 * @param lng
	 * @param trackID
	 * @param accuracy
	 * @param vaccuracy
	 * @param elevation
	 * @param timestamp
	 * @param velocity
	 * @param bearing
	 * @param accessTokenPregenerated
	 * @return
	 * @throws IOException 
	 * @throws TopoosException 
	 */
	public static 	Position Add (Double lat,Double lng, Integer trackID ,Integer accuracy,Integer vaccuracy, Integer elevation,Date timestamp,Integer velocity,Integer bearing, AccessTokenOAuth accessTokenPregenerated) throws IOException, TopoosException{
		return Translator.Add(lat, lng, trackID, accuracy, vaccuracy, elevation, timestamp, velocity, bearing, accessTokenPregenerated);
	}
	/**
	 * 
	 * @param lat
	 * @param lng
	 * @param trackID
	 * @param accuracy
	 * @param vaccuracy
	 * @param elevation
	 * @param timestamp
	 * @param velocity
	 * @param bearing
	 * @param accessTokenPregenerated
	 * @return
	 * @throws IOException 
	 * @throws TopoosException 
	 */
	public static	Position AddAlarmEnd(Double lat,Double lng, Integer trackID ,Integer accuracy,Integer vaccuracy, Integer elevation,Date timestamp,Integer velocity,Integer bearing, AccessTokenOAuth accessTokenPregenerated) throws IOException, TopoosException{
		return Translator.AddAlarmEnd(lat, lng, trackID, accuracy, vaccuracy, elevation, timestamp, velocity, bearing, accessTokenPregenerated);
	}
	/**
	 * 
	 * @param lat
	 * @param lng
	 * @param trackID
	 * @param accuracy
	 * @param vaccuracy
	 * @param elevation
	 * @param timestamp
	 * @param velocity
	 * @param bearing
	 * @param accessTokenPregenerated
	 * @return
	 * @throws IOException 
	 * @throws TopoosException 
	 */
	public static	Position AddAlarmInit (Double lat,Double lng, Integer trackID ,Integer accuracy,Integer vaccuracy, Integer elevation,Date timestamp,Integer velocity,Integer bearing, AccessTokenOAuth accessTokenPregenerated) throws IOException, TopoosException{
		return Translator.AddAlarmInit(lat, lng, trackID, accuracy, vaccuracy, elevation, timestamp, velocity, bearing, accessTokenPregenerated);
	}
	/**
	 * 
	 * @param lat
	 * @param lng
	 * @param trackID
	 * @param accuracy
	 * @param vaccuracy
	 * @param elevation
	 * @param timestamp
	 * @param velocity
	 * @param bearing
	 * @param accessTokenPregenerated
	 * @return
	 * @throws IOException 
	 * @throws TopoosException 
	 */
	public static	Position AddGPSNo (Double lat,Double lng, Integer trackID ,Integer accuracy,Integer vaccuracy, Integer elevation,Date timestamp,Integer velocity,Integer bearing, AccessTokenOAuth accessTokenPregenerated) throws IOException, TopoosException{
		return Translator.AddGPSNo(lat, lng, trackID, accuracy, vaccuracy, elevation, timestamp, velocity, bearing, accessTokenPregenerated);
	}
	/**
	 * 
	 * @param lat
	 * @param lng
	 * @param trackID
	 * @param accuracy
	 * @param vaccuracy
	 * @param elevation
	 * @param timestamp
	 * @param velocity
	 * @param bearing
	 * @param accessTokenPregenerated
	 * @return
	 * @throws IOException 
	 * @throws TopoosException 
	 */
	public static	Position AddGPSOk (Double lat,Double lng, Integer trackID ,Integer accuracy,Integer vaccuracy, Integer elevation,Date timestamp,Integer velocity,Integer bearing, AccessTokenOAuth accessTokenPregenerated) throws IOException, TopoosException{
		return Translator.AddGPSOk(lat, lng, trackID, accuracy, vaccuracy, elevation, timestamp, velocity, bearing, accessTokenPregenerated);}
	/**
	 * 
	 * @param lat
	 * @param lng
	 * @param trackID
	 * @param accuracy
	 * @param vaccuracy
	 * @param elevation
	 * @param timestamp
	 * @param velocity
	 * @param bearing
	 * @param accessTokenPregenerated
	 * @return
	 * @throws IOException 
	 * @throws TopoosException 
	 */
	public static	Position AddTrackEnd (Double lat,Double lng, Integer trackID ,Integer accuracy,Integer vaccuracy, Integer elevation,Date timestamp,Integer velocity,Integer bearing, AccessTokenOAuth accessTokenPregenerated) throws IOException, TopoosException{
		return Translator.AddTrackEnd(lat, lng, trackID, accuracy, vaccuracy, elevation, timestamp, velocity, bearing, accessTokenPregenerated);
	}
	/**
	 * 
	 * @param posID
	 * @param accessTokenPregenerated
	 * @return
	 * @throws IOException 
	 * @throws TopoosException 
	 */
	public static	Position Get (Integer posID, AccessTokenOAuth accessTokenPregenerated) throws IOException, TopoosException{
		return Translator.Get(posID, accessTokenPregenerated);
	}
	/**
	 * 
	 * @param userID
	 * @param accessTokenPregenerated
	 * @return
	 * @throws IOException 
	 * @throws TopoosException 
	 */
	public static	Position GetLastUser (String userID, AccessTokenOAuth accessTokenPregenerated) throws IOException, TopoosException{
		return Translator.GetLastUser(userID, accessTokenPregenerated);
	}
	/**
	 * 
	 * @param initDate
	 * @param endDate
	 * @param accessTokenPregenerated
	 * @return
	 * @throws TopoosException 
	 * @throws IOException 
	 */
	public static	List<Position> GetBetweenDays (Date initDate, Date endDate, AccessTokenOAuth accessTokenPregenerated) throws IOException, TopoosException{
		return Translator.GetBetweenDays(initDate, endDate, accessTokenPregenerated);	
	}
	/**
	 * 
	 * @param context
	 * @param lat
	 * @param lng
	 * @param trackID
	 * @param accuracy
	 * @param vaccuracy
	 * @param elevation
	 * @param timestamp
	 * @param velocity
	 * @param bearing
	 * @return
	 * @throws IOException 
	 * @throws TopoosException 
	 */
	public static 	Position Add (Context context, Double lat,Double lng, Integer trackID ,Integer accuracy,Integer vaccuracy, Integer elevation,Date timestamp,Integer velocity,Integer bearing) throws IOException, TopoosException{
		return Translator.Add(context, lat, lng, trackID, accuracy, vaccuracy, elevation, timestamp, velocity, bearing);
	}
	/**
	 * 
	 * @param context
	 * @param lat
	 * @param lng
	 * @param trackID
	 * @param accuracy
	 * @param vaccuracy
	 * @param elevation
	 * @param timestamp
	 * @param velocity
	 * @param bearing
	 * @return
	 * @throws IOException 
	 * @throws TopoosException 
	 */
	public static	Position AddAlarmEnd(Context context, Double lat,Double lng, Integer trackID ,Integer accuracy,Integer vaccuracy, Integer elevation,Date timestamp,Integer velocity,Integer bearing) throws IOException, TopoosException{
		return Translator.AddAlarmEnd(context, lat, lng, trackID, accuracy, vaccuracy, elevation, timestamp, velocity, bearing);
	}	
	/**
	 * 
	 * @param context
	 * @param lat
	 * @param lng
	 * @param trackID
	 * @param accuracy
	 * @param vaccuracy
	 * @param elevation
	 * @param timestamp
	 * @param velocity
	 * @param bearing
	 * @return
	 * @throws IOException 
	 * @throws TopoosException 
	 */
	public static	Position AddAlarmInit (Context context, Double lat,Double lng, Integer trackID ,Integer accuracy,Integer vaccuracy, Integer elevation,Date timestamp,Integer velocity,Integer bearing) throws IOException, TopoosException{
		return Translator.AddAlarmInit(context, lat, lng, trackID, accuracy, vaccuracy, elevation, timestamp, velocity, bearing);
	}
	/**
	 * 
	 * @param context
	 * @param lat
	 * @param lng
	 * @param trackID
	 * @param accuracy
	 * @param vaccuracy
	 * @param elevation
	 * @param timestamp
	 * @param velocity
	 * @param bearing
	 * @return
	 * @throws IOException 
	 * @throws TopoosException 
	 */
	public static	Position AddGPSNo (Context context, Double lat,Double lng, Integer trackID ,Integer accuracy,Integer vaccuracy, Integer elevation,Date timestamp,Integer velocity,Integer bearing) throws IOException, TopoosException{
		return Translator.AddGPSNo(context, lat, lng, trackID, accuracy, vaccuracy, elevation, timestamp, velocity, bearing);
	}
	/**
	 * 
	 * @param context
	 * @param lat
	 * @param lng
	 * @param trackID
	 * @param accuracy
	 * @param vaccuracy
	 * @param elevation
	 * @param timestamp
	 * @param velocity
	 * @param bearing
	 * @return
	 * @throws IOException 
	 * @throws TopoosException 
	 */
	public static	Position AddGPSOk (Context context, Double lat,Double lng, Integer trackID ,Integer accuracy,Integer vaccuracy, Integer elevation,Date timestamp,Integer velocity,Integer bearing) throws IOException, TopoosException{
		return Translator.AddGPSOk(context, lat, lng, trackID, accuracy, vaccuracy, elevation, timestamp, velocity, bearing);
	}
	/**
	 * 
	 * @param context
	 * @param lat
	 * @param lng
	 * @param trackID
	 * @param accuracy
	 * @param vaccuracy
	 * @param elevation
	 * @param timestamp
	 * @param velocity
	 * @param bearing
	 * @return
	 * @throws IOException 
	 * @throws TopoosException 
	 */
	public static	Position AddTrackEnd (Context context, Double lat,Double lng, Integer trackID ,Integer accuracy,Integer vaccuracy, Integer elevation,Date timestamp,Integer velocity,Integer bearing) throws IOException, TopoosException{
		return Translator.AddTrackEnd(context, lat, lng, trackID, accuracy, vaccuracy, elevation, timestamp, velocity, bearing);
	}
	/**
	 * 
	 * @param context
	 * @param posID
	 * @return
	 * @throws IOException 
	 * @throws TopoosException 
	 */
	public static	Position Get (Context context, Integer posID) throws IOException, TopoosException{
		return Translator.Get(context, posID);
	}
	/**
	 * 
	 * @param context
	 * @param userID
	 * @return
	 * @throws IOException 
	 * @throws TopoosException 
	 */
	public static	Position GetLastUser (Context context, String userID) throws IOException, TopoosException{
		return Translator.GetLastUser(context, userID);

	}
	/**
	 * 
	 * @param context
	 * @param initDate
	 * @param endDate
	 * @return
	 * @throws TopoosException 
	 * @throws IOException 
	 */
	public static	List<Position> GetBetweenDays (Context context, Date initDate, Date endDate) throws IOException, TopoosException{
		return Translator.GetBetweenDays(context, initDate, endDate);
	}
	
}
