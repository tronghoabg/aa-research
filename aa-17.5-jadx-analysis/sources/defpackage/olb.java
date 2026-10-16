package defpackage;

import android.content.Context;
import com.google.android.gms.car.navigation.DestinationDistance;
import com.google.android.gms.car.navigation.Distance;
import com.google.android.projection.gearhead.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes2.dex */
public final class olb {
    public static final yph a = yph.c("GH.TurnCardUtil");

    public static String a(Context context, Distance distance) {
        int i;
        switch (distance.c) {
            case 1:
                i = R.string.navigation_distance_meters;
                break;
            case 2:
            case 3:
                i = R.string.navigation_distance_kilometers;
                break;
            case 4:
            case 5:
                i = R.string.navigation_distance_miles;
                break;
            case 6:
                i = R.string.navigation_distance_feet;
                break;
            case 7:
                i = R.string.navigation_distance_yards;
                break;
            default:
                return null;
        }
        String str = distance.b;
        if (woy.am(str)) {
            return null;
        }
        return context.getString(R.string.navigation_distance_display_format, str, context.getString(i));
    }

    public static String b(DestinationDistance destinationDistance) throws ParseException {
        String str;
        if (destinationDistance != null && (str = destinationDistance.b) != null) {
            try {
                Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ").parse(str);
                if (date != null) {
                    return new SimpleDateFormat("h:mm a").format(date);
                }
                ((ype) ((ype) a.h()).ai(5994)).u("Failed to parse estimated time of arrival");
                return null;
            } catch (ParseException e) {
                ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 5993)).u("Unable to parse the estimated time of arrival");
            }
        }
        return null;
    }
}
