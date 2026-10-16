package defpackage;

import androidx.car.app.model.Distance;
import com.google.android.projection.gearhead.R;
import java.text.DecimalFormat;

/* loaded from: classes2.dex */
public final class hly {
    private static final DecimalFormat a = new DecimalFormat("#0.#");
    private static final DecimalFormat b = new DecimalFormat("#0.0");

    public static int a(Distance distance) {
        long jRound;
        int displayUnit = distance.getDisplayUnit();
        switch (displayUnit) {
            case 1:
                jRound = Math.round(distance.getDisplayDistance());
                break;
            case 2:
            case 3:
                jRound = Math.round(distance.getDisplayDistance() * 1000.0d);
                break;
            case 4:
            case 5:
                jRound = Math.round(distance.getDisplayDistance() * 1609.34d);
                break;
            case 6:
                jRound = Math.round(distance.getDisplayDistance() * 0.3048d);
                break;
            case 7:
                jRound = Math.round(distance.getDisplayDistance() * 0.9144d);
                break;
            default:
                throw new UnsupportedOperationException(a.bp(displayUnit, "Unsupported distance unit type: "));
        }
        return (int) jRound;
    }

    public static String b(geu geuVar, Distance distance) {
        int displayUnit = distance.getDisplayUnit();
        geuVar.u();
        String strC = c(distance);
        switch (displayUnit) {
            case 1:
                return geuVar.getString(R.string.meter_text, new Object[]{strC});
            case 2:
            case 3:
                return geuVar.getString(R.string.kilometer_text, new Object[]{strC});
            case 4:
            case 5:
                return geuVar.getString(R.string.mile_text, new Object[]{strC});
            case 6:
                return geuVar.getString(R.string.feet_text, new Object[]{strC});
            case 7:
                return geuVar.getString(R.string.yard_text, new Object[]{strC});
            default:
                throw new UnsupportedOperationException(a.bp(displayUnit, "Unsupported distance unit type: "));
        }
    }

    public static String c(Distance distance) {
        int displayUnit = distance.getDisplayUnit();
        return ((displayUnit == 3 || displayUnit == 5) ? b : a).format(distance.getDisplayDistance());
    }
}
