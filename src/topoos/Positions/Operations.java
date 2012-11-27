package topoos.Positions;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import topoos.AccessTokenOAuth;
import topoos.Exception.TopoosException;
import topoos.Objects.Position;
import android.content.Context;

/**
 * Operations related to position management
 * 
 * @author MAJS
 * 
 */
public class Operations {
	/**
	 * Register a new position. This may be an isolated position or the position
	 * of an existing track.
	 * 
	 * @param lat
	 *            (required) latitude in decimal degrees of the new position.
	 * @param lng
	 *            (required) longitude in decimal degrees of the new position.
	 * @param trackID
	 *            (optional) Track identifier to which the position
	 * @param accuracy
	 *            (optional) accuracy of the position (latitude, longitude)
	 * @param vaccuracy
	 *            (optional) elevation accuracy
	 * @param elevation
	 *            (optional) elevation relative to sea level
	 * @param timestamp
	 *            (optional) local time with UTC offset conversion capture the
	 *            position
	 * @param velocity
	 *            (optional) movement speed at the moment that captured the
	 *            position, in meters per second
	 * @param bearing
	 *            (optional) motion direction (value between 0 and 360)
	 * @param accessTokenPregenerated
	 *            (required) access_token to user resources
	 * @return Position
	 * @throws IOException
	 * @throws TopoosException
	 */
	public static Position Add(AccessTokenOAuth accessTokenPregenerated,
			Double lat, Double lng, Integer trackID, Integer accuracy,
			Integer vaccuracy, Integer elevation, Date timestamp,
			Integer velocity, Integer bearing) throws IOException,
			TopoosException {
		return Translator.Add(lat, lng, trackID, accuracy, vaccuracy,
				elevation, timestamp, velocity, bearing,
				accessTokenPregenerated);
	}

	/**
	 * Register a new Alarm_End position. This may be an isolated position or
	 * the position of an existing track.
	 * 
	 * @param lat
	 *            (required) latitude in decimal degrees of the new position.
	 * @param lng
	 *            (required) longitude in decimal degrees of the new position.
	 * @param trackID
	 *            (optional) Track identifier to which the position
	 * @param accuracy
	 *            (optional) accuracy of the position (latitude, longitude)
	 * @param vaccuracy
	 *            (optional) elevation accuracy
	 * @param elevation
	 *            (optional) elevation relative to sea level
	 * @param timestamp
	 *            (optional) local time with UTC offset conversion capture the
	 *            position
	 * @param velocity
	 *            (optional) movement speed at the moment that captured the
	 *            position, in meters per second
	 * @param bearing
	 *            (optional) motion direction (value between 0 and 360)
	 * @param accessTokenPregenerated
	 *            (required) access_token to user resources
	 * @return Position
	 * @throws IOException
	 * @throws TopoosException
	 */
	public static Position AddAlarmEnd(
			AccessTokenOAuth accessTokenPregenerated, Double lat, Double lng,
			Integer trackID, Integer accuracy, Integer vaccuracy,
			Integer elevation, Date timestamp, Integer velocity, Integer bearing)
			throws IOException, TopoosException {
		return Translator.AddAlarmEnd(lat, lng, trackID, accuracy, vaccuracy,
				elevation, timestamp, velocity, bearing,
				accessTokenPregenerated);
	}

	/**
	 * Register a new Alarm Init position. This may be an isolated position or
	 * the position of an existing track.
	 * 
	 * @param lat
	 *            (required) latitude in decimal degrees of the new position.
	 * @param lng
	 *            (required) longitude in decimal degrees of the new position.
	 * @param trackID
	 *            (optional) Track identifier to which the position
	 * @param accuracy
	 *            (optional) accuracy of the position (latitude, longitude)
	 * @param vaccuracy
	 *            (optional) elevation accuracy
	 * @param elevation
	 *            (optional) elevation relative to sea level
	 * @param timestamp
	 *            (optional) local time with UTC offset conversion capture the
	 *            position
	 * @param velocity
	 *            (optional) movement speed at the moment that captured the
	 *            position, in meters per second
	 * @param bearing
	 *            (optional) motion direction (value between 0 and 360)
	 * @param accessTokenPregenerated
	 *            (required) access_token to user resources
	 * @return Position
	 * @throws IOException
	 * @throws TopoosException
	 */
	public static Position AddAlarmInit(
			AccessTokenOAuth accessTokenPregenerated, Double lat, Double lng,
			Integer trackID, Integer accuracy, Integer vaccuracy,
			Integer elevation, Date timestamp, Integer velocity, Integer bearing)
			throws IOException, TopoosException {
		return Translator.AddAlarmInit(lat, lng, trackID, accuracy, vaccuracy,
				elevation, timestamp, velocity, bearing,
				accessTokenPregenerated);
	}

	/**
	 * Register a new GPSNo position. This may be an isolated position or the
	 * position of an existing track.
	 * 
	 * @param lat
	 *            (required) latitude in decimal degrees of the new position.
	 * @param lng
	 *            (required) longitude in decimal degrees of the new position.
	 * @param trackID
	 *            (optional) Track identifier to which the position
	 * @param accuracy
	 *            (optional) accuracy of the position (latitude, longitude)
	 * @param vaccuracy
	 *            (optional) elevation accuracy
	 * @param elevation
	 *            (optional) elevation relative to sea level
	 * @param timestamp
	 *            (optional) local time with UTC offset conversion capture the
	 *            position
	 * @param velocity
	 *            (optional) movement speed at the moment that captured the
	 *            position, in meters per second
	 * @param bearing
	 *            (optional) motion direction (value between 0 and 360)
	 * @param accessTokenPregenerated
	 *            (required) access_token to user resources
	 * @return Position
	 * @throws IOException
	 * @throws TopoosException
	 */
	public static Position AddGPSNo(AccessTokenOAuth accessTokenPregenerated,
			Double lat, Double lng, Integer trackID, Integer accuracy,
			Integer vaccuracy, Integer elevation, Date timestamp,
			Integer velocity, Integer bearing) throws IOException,
			TopoosException {
		return Translator.AddGPSNo(lat, lng, trackID, accuracy, vaccuracy,
				elevation, timestamp, velocity, bearing,
				accessTokenPregenerated);
	}

	/**
	 * Register a new GPSOk position. This may be an isolated position or the
	 * position of an existing track.
	 * 
	 * @param lat
	 *            (required) latitude in decimal degrees of the new position.
	 * @param lng
	 *            (required) longitude in decimal degrees of the new position.
	 * @param trackID
	 *            (optional) Track identifier to which the position
	 * @param accuracy
	 *            (optional) accuracy of the position (latitude, longitude)
	 * @param vaccuracy
	 *            (optional) elevation accuracy
	 * @param elevation
	 *            (optional) elevation relative to sea level
	 * @param timestamp
	 *            (optional) local time with UTC offset conversion capture the
	 *            position
	 * @param velocity
	 *            (optional) movement speed at the moment that captured the
	 *            position, in meters per second
	 * @param bearing
	 *            (optional) motion direction (value between 0 and 360)
	 * @param accessTokenPregenerated
	 *            (required) access_token to user resources
	 * @return Position
	 * @throws IOException
	 * @throws TopoosException
	 */
	public static Position AddGPSOk(AccessTokenOAuth accessTokenPregenerated,
			Double lat, Double lng, Integer trackID, Integer accuracy,
			Integer vaccuracy, Integer elevation, Date timestamp,
			Integer velocity, Integer bearing) throws IOException,
			TopoosException {
		return Translator.AddGPSOk(lat, lng, trackID, accuracy, vaccuracy,
				elevation, timestamp, velocity, bearing,
				accessTokenPregenerated);
	}

	/**
	 * Register a new Track End position. This may be an isolated position or
	 * the position of an existing track.
	 * 
	 * @param lat
	 *            (required) latitude in decimal degrees of the new position.
	 * @param lng
	 *            (required) longitude in decimal degrees of the new position.
	 * @param trackID
	 *            (optional) Track identifier to which the position
	 * @param accuracy
	 *            (optional) accuracy of the position (latitude, longitude)
	 * @param vaccuracy
	 *            (optional) elevation accuracy
	 * @param elevation
	 *            (optional) elevation relative to sea level
	 * @param timestamp
	 *            (optional) local time with UTC offset conversion capture the
	 *            position
	 * @param velocity
	 *            (optional) movement speed at the moment that captured the
	 *            position, in meters per second
	 * @param bearing
	 *            (optional) motion direction (value between 0 and 360)
	 * @param accessTokenPregenerated
	 *            (required) access_token to user resources
	 * @return Position
	 * @throws IOException
	 * @throws TopoosException
	 */
	public static Position AddTrackEnd(
			AccessTokenOAuth accessTokenPregenerated, Double lat, Double lng,
			Integer trackID, Integer accuracy, Integer vaccuracy,
			Integer elevation, Date timestamp, Integer velocity, Integer bearing)
			throws IOException, TopoosException {
		return Translator.AddTrackEnd(lat, lng, trackID, accuracy, vaccuracy,
				elevation, timestamp, velocity, bearing,
				accessTokenPregenerated);
	}

	/**
	 * Obtains information of a position
	 * 
	 * @param posID
	 *            (required) identifier of a particular position.
	 * @param accessTokenPregenerated
	 *            (required) access_token to user resources
	 * @return Position
	 * @throws IOException
	 * @throws TopoosException
	 */
	public static Position Get(AccessTokenOAuth accessTokenPregenerated,
			Integer posID) throws IOException, TopoosException {
		return Translator.Get(posID, accessTokenPregenerated);
	}

	/**
	 * Obtains information of a position
	 * 
	 * @param userID
	 *            (required) user identifier, if not stated it will get the last
	 *            position of the current user.
	 * @param accessTokenPregenerated
	 *            (required) access_token to user resources
	 * @return Position
	 * @throws IOException
	 * @throws TopoosException
	 */
	public static Position GetLastUser(
			AccessTokenOAuth accessTokenPregenerated, String userID)
			throws IOException, TopoosException {
		return Translator.GetLastUser(userID, accessTokenPregenerated);
	}

	/**
	 * Gets a collection of positions recorded in a date range
	 * 
	 * @param initDate
	 *            (required) start date
	 * @param endDate
	 *            (required) ending date
	 * @param accessTokenPregenerated
	 *            (required) access_token to user resources
	 * @return
	 * @throws TopoosException
	 * @throws IOException
	 */
	public static List<Position> GetBetweenDays(
			AccessTokenOAuth accessTokenPregenerated, Date initDate,
			Date endDate) throws IOException, TopoosException {
		return Translator.GetBetweenDays(initDate, endDate,
				accessTokenPregenerated);
	}

	/**
	 * Register a new position. This may be an isolated position or the position
	 * of an existing track.
	 * 
	 * @param context
	 *            (required) Interface to global information about an
	 *            application environment
	 * @param lat
	 *            (required) latitude in decimal degrees of the new position.
	 * @param lng
	 *            (required) longitude in decimal degrees of the new position.
	 * @param trackID
	 *            (optional) Track identifier to which the position
	 * @param accuracy
	 *            (optional) accuracy of the position (latitude, longitude)
	 * @param vaccuracy
	 *            (optional) elevation accuracy
	 * @param elevation
	 *            (optional) elevation relative to sea level
	 * @param timestamp
	 *            (optional) local time with UTC offset conversion capture the
	 *            position
	 * @param velocity
	 *            (optional) movement speed at the moment that captured the
	 *            position, in meters per second
	 * @param bearing
	 *            (optional) motion direction (value between 0 and 360)
	 * @return Position
	 * @throws IOException
	 * @throws TopoosException
	 */
	public static Position Add(Context context, Double lat, Double lng,
			Integer trackID, Integer accuracy, Integer vaccuracy,
			Integer elevation, Date timestamp, Integer velocity, Integer bearing)
			throws IOException, TopoosException {
		return Translator.Add(context, lat, lng, trackID, accuracy, vaccuracy,
				elevation, timestamp, velocity, bearing);
	}

	/**
	 * Register a new Alarm End position. This may be an isolated position or
	 * the position of an existing track.
	 * 
	 * @param context
	 *            (required) Interface to global information about an
	 *            application environment
	 * @param lat
	 *            (required) latitude in decimal degrees of the new position.
	 * @param lng
	 *            (required) longitude in decimal degrees of the new position.
	 * @param trackID
	 *            (optional) Track identifier to which the position
	 * @param accuracy
	 *            (optional) accuracy of the position (latitude, longitude)
	 * @param vaccuracy
	 *            (optional) elevation accuracy
	 * @param elevation
	 *            (optional) elevation relative to sea level
	 * @param timestamp
	 *            (optional) local time with UTC offset conversion capture the
	 *            position
	 * @param velocity
	 *            (optional) movement speed at the moment that captured the
	 *            position, in meters per second
	 * @param bearing
	 *            (optional) motion direction (value between 0 and 360)
	 * @return Position
	 * @throws IOException
	 * @throws TopoosException
	 */
	public static Position AddAlarmEnd(Context context, Double lat, Double lng,
			Integer trackID, Integer accuracy, Integer vaccuracy,
			Integer elevation, Date timestamp, Integer velocity, Integer bearing)
			throws IOException, TopoosException {
		return Translator.AddAlarmEnd(context, lat, lng, trackID, accuracy,
				vaccuracy, elevation, timestamp, velocity, bearing);
	}

	/**
	 * Register a new Alarm Init position. This may be an isolated position or
	 * the position of an existing track.
	 * 
	 * @param context
	 *            (required) Interface to global information about an
	 *            application environment
	 * @param lat
	 *            (required) latitude in decimal degrees of the new position.
	 * @param lng
	 *            (required) longitude in decimal degrees of the new position.
	 * @param trackID
	 *            (optional) Track identifier to which the position
	 * @param accuracy
	 *            (optional) accuracy of the position (latitude, longitude)
	 * @param vaccuracy
	 *            (optional) elevation accuracy
	 * @param elevation
	 *            (optional) elevation relative to sea level
	 * @param timestamp
	 *            (optional) local time with UTC offset conversion capture the
	 *            position
	 * @param velocity
	 *            (optional) movement speed at the moment that captured the
	 *            position, in meters per second
	 * @param bearing
	 *            (optional) motion direction (value between 0 and 360)
	 * @return Position
	 * @throws IOException
	 * @throws TopoosException
	 */
	public static Position AddAlarmInit(Context context, Double lat,
			Double lng, Integer trackID, Integer accuracy, Integer vaccuracy,
			Integer elevation, Date timestamp, Integer velocity, Integer bearing)
			throws IOException, TopoosException {
		return Translator.AddAlarmInit(context, lat, lng, trackID, accuracy,
				vaccuracy, elevation, timestamp, velocity, bearing);
	}

	/**
	 * Register a new GPSNo position. This may be an isolated position or the
	 * position of an existing track.
	 * 
	 * @param context
	 *            (required) Interface to global information about an
	 *            application environment
	 * @param lat
	 *            (required) latitude in decimal degrees of the new position.
	 * @param lng
	 *            (required) longitude in decimal degrees of the new position.
	 * @param trackID
	 *            (optional) Track identifier to which the position
	 * @param accuracy
	 *            (optional) accuracy of the position (latitude, longitude)
	 * @param vaccuracy
	 *            (optional) elevation accuracy
	 * @param elevation
	 *            (optional) elevation relative to sea level
	 * @param timestamp
	 *            (optional) local time with UTC offset conversion capture the
	 *            position
	 * @param velocity
	 *            (optional) movement speed at the moment that captured the
	 *            position, in meters per second
	 * @param bearing
	 *            (optional) motion direction (value between 0 and 360)
	 * @return Position
	 * @throws IOException
	 * @throws TopoosException
	 */
	public static Position AddGPSNo(Context context, Double lat, Double lng,
			Integer trackID, Integer accuracy, Integer vaccuracy,
			Integer elevation, Date timestamp, Integer velocity, Integer bearing)
			throws IOException, TopoosException {
		return Translator.AddGPSNo(context, lat, lng, trackID, accuracy,
				vaccuracy, elevation, timestamp, velocity, bearing);
	}

	/**
	 * Register a new GPSOk position. This may be an isolated position or the
	 * position of an existing track.
	 * 
	 * @param context
	 *            (required) Interface to global information about an
	 *            application environment
	 * @param lat
	 *            (required) latitude in decimal degrees of the new position.
	 * @param lng
	 *            (required) longitude in decimal degrees of the new position.
	 * @param trackID
	 *            (optional) Track identifier to which the position
	 * @param accuracy
	 *            (optional) accuracy of the position (latitude, longitude)
	 * @param vaccuracy
	 *            (optional) elevation accuracy
	 * @param elevation
	 *            (optional) elevation relative to sea level
	 * @param timestamp
	 *            (optional) local time with UTC offset conversion capture the
	 *            position
	 * @param velocity
	 *            (optional) movement speed at the moment that captured the
	 *            position, in meters per second
	 * @param bearing
	 *            (optional) motion direction (value between 0 and 360)
	 * @return Position
	 * @throws IOException
	 * @throws TopoosException
	 */
	public static Position AddGPSOk(Context context, Double lat, Double lng,
			Integer trackID, Integer accuracy, Integer vaccuracy,
			Integer elevation, Date timestamp, Integer velocity, Integer bearing)
			throws IOException, TopoosException {
		return Translator.AddGPSOk(context, lat, lng, trackID, accuracy,
				vaccuracy, elevation, timestamp, velocity, bearing);
	}

	/**
	 * Register a new Track End position. This may be an isolated position or
	 * the position of an existing track.
	 * 
	 * @param context
	 *            (required) Interface to global information about an
	 *            application environment
	 * @param lat
	 *            (required) latitude in decimal degrees of the new position.
	 * @param lng
	 *            (required) longitude in decimal degrees of the new position.
	 * @param trackID
	 *            (optional) Track identifier to which the position
	 * @param accuracy
	 *            (optional) accuracy of the position (latitude, longitude)
	 * @param vaccuracy
	 *            (optional) elevation accuracy
	 * @param elevation
	 *            (optional) elevation relative to sea level
	 * @param timestamp
	 *            (optional) local time with UTC offset conversion capture the
	 *            position
	 * @param velocity
	 *            (optional) movement speed at the moment that captured the
	 *            position, in meters per second
	 * @param bearing
	 *            (optional) motion direction (value between 0 and 360)
	 * @return Position
	 * @throws IOException
	 * @throws TopoosException
	 */
	public static Position AddTrackEnd(Context context, Double lat, Double lng,
			Integer trackID, Integer accuracy, Integer vaccuracy,
			Integer elevation, Date timestamp, Integer velocity, Integer bearing)
			throws IOException, TopoosException {
		return Translator.AddTrackEnd(context, lat, lng, trackID, accuracy,
				vaccuracy, elevation, timestamp, velocity, bearing);
	}

	/**
	 * Obtains information of a position
	 * 
	 * @param context
	 * @param posID
	 *            (required) identifier of a particular position.
	 * @return Position
	 * @throws IOException
	 * @throws TopoosException
	 */
	public static Position Get(Context context, Integer posID)
			throws IOException, TopoosException {
		return Translator.Get(context, posID);
	}

	/**
	 * Obtains information of a position
	 * 
	 * @param context
	 *            (required) Interface to global information about an
	 *            application environment
	 * @param userID
	 *            (required) user identifier, if not stated it will get the last
	 *            position of the current user.
	 * @return Position
	 * @throws IOException
	 * @throws TopoosException
	 */
	public static Position GetLastUser(Context context, String userID)
			throws IOException, TopoosException {
		return Translator.GetLastUser(context, userID);

	}

	/**
	 * Gets a collection of positions recorded in a date range
	 * 
	 * @param context
	 *            (required) Interface to global information about an
	 *            application environment
	 * @param initDate
	 *            (required) start date
	 * @param endDate
	 *            (required) ending date
	 * @return Position
	 * @throws TopoosException
	 * @throws IOException
	 */
	public static List<Position> GetBetweenDays(Context context, Date initDate,
			Date endDate) throws IOException, TopoosException {
		return Translator.GetBetweenDays(context, initDate, endDate);
	}

}
