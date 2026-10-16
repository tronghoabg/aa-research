package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.car.app.model.CarLocation;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class gkx {
    public static final CarLocation a(Uri uri) {
        String strB = b(uri);
        if (strB == null) {
            strB = uri.getEncodedSchemeSpecificPart();
        }
        List listL = strB != null ? afyh.L(strB, new String[]{","}, 0) : null;
        if (listL != null && listL.size() == 2) {
            Double dB = afyh.b((String) listL.get(0));
            Double dB2 = afyh.b((String) listL.get(1));
            if (dB != null && dB2 != null) {
                return CarLocation.create(dB.doubleValue(), dB2.doubleValue());
            }
        }
        return null;
    }

    public static final String b(Uri uri) {
        String encodedSchemeSpecificPart = uri.getEncodedSchemeSpecificPart();
        for (String str : woy.bi("q", "daddr")) {
            encodedSchemeSpecificPart.getClass();
            List listL = afyh.L(encodedSchemeSpecificPart, new String[]{String.valueOf(str).concat("=")}, 2);
            if (listL.size() > 1) {
                return (String) woy.bH(afyh.L((CharSequence) listL.get(1), new String[]{"&"}, 2));
            }
        }
        return null;
    }

    public static final boolean c(Intent intent) {
        intent.getClass();
        Uri data = intent.getData();
        if (data == null) {
            return false;
        }
        String dataString = intent.getDataString();
        if (dataString == null) {
            dataString = "";
        }
        if (woy.cn(glc.a, data.getScheme())) {
            return true;
        }
        Set set = glc.b;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (afyh.g(dataString, (String) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean d(Uri uri) {
        if (uri == null) {
            return false;
        }
        String string = uri.toString();
        string.getClass();
        return afyh.u(string, "q", false) || a(uri) != null;
    }

    public static final boolean e(Intent intent) {
        gks.b("CarApp.H", "Intent data using specific Location Alias for Home / Work navigation");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            return extras.containsKey("com.google.android.googlequicksearchbox.LocationAlias");
        }
        return false;
    }

    public static final boolean f(Intent intent, String str) {
        if (affa.f(intent.getScheme(), str)) {
            return true;
        }
        String dataString = intent.getDataString();
        if (dataString == null) {
            dataString = "";
        }
        return afyh.g(dataString, str.concat(":"), false);
    }

    public static final boolean g(String str) {
        if (str != null) {
            return afyh.u(str, "act", false);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
