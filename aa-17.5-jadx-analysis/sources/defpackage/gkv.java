package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.car.app.model.CarLocation;

/* loaded from: classes2.dex */
public final class gkv implements gkw {
    public static final gkv a = new gkv();

    private gkv() {
    }

    public static final boolean b(Intent intent) {
        String action = intent.getAction();
        String scheme = intent.getScheme();
        if (gkx.e(intent)) {
            Log.d("CarApp.H.Tem", "[VALID] CALFormat Intent is a Nav to Home / Work type intent.");
            return true;
        }
        if (gkx.c(intent) && affa.f(action, "androidx.car.app.action.NAVIGATE") && gkx.f(intent, "geo")) {
            Log.d("CarApp.H.Tem", "[VALID] CALFormat Intent is a Nav / Search type intent");
            return true;
        }
        Log.e("CarApp.H.Tem", a.bM(scheme, action, "[INVALID] CALFormat Intent is not in the right format, action: ", " scheme: "));
        return false;
    }

    @Override // defpackage.gkw
    public final void a(gkw gkwVar, Intent intent) {
        Uri uri;
        if (affa.f(gkwVar, this)) {
            return;
        }
        if (!affa.f(gkwVar, gld.a)) {
            Log.e("CarApp.H.Tem", a.bt(intent, gkwVar, "[INVALID] CALFormat intent cannot be transformed to any other format New Intent format: ", ", intent: "));
            return;
        }
        intent.setAction("android.intent.action.VIEW");
        if (gkx.e(intent)) {
            return;
        }
        if (intent.getData() == null) {
            Log.e("CarApp.H.Tem", "[INVALID] CAL Intent data is null");
            return;
        }
        Uri data = intent.getData();
        data.getClass();
        CarLocation carLocationA = gkx.a(data);
        if (carLocationA != null) {
            gks.b("CarApp.H", "Intent data set using location [Latitude and Longitude] data");
            uri = Uri.parse("https://maps.google.com/maps?nav=1&q=" + carLocationA.getLatitude() + "," + carLocationA.getLongitude());
        } else {
            String strB = gkx.b(data);
            if (strB != null) {
                gks.b("CarApp.H.Tem", "Intent data set using query data");
                uri = Uri.parse("https://maps.google.com/maps?nav=1&q=".concat(new aisp("\\s").b(strB, "+")));
            } else {
                uri = null;
            }
        }
        if (uri != null) {
            intent.setData(uri);
            if (gkx.e(intent)) {
                Log.d("CarApp.H.Tem", "[VALID] UnprocessedFormat Intent is a Nav to Home / Work type intent ");
                return;
            }
            if (gkx.c(intent) && affa.f(intent.getAction(), "android.intent.action.VIEW") && gkx.d(intent.getData())) {
                Log.d("CarApp.H.Tem", "[VALID] UnprocessedFormat Intent is a Nav / Search type intent ");
                return;
            }
            Log.e("CarApp.H.Tem", "[INVALID] UnprocessedFormat Consistent Intent is not in the right format, intentScheme: " + intent.getScheme() + ", intentAction: " + intent.getAction());
            Log.e("CarApp.H.Tem", "[INVALID] Converted Intent is not in the right format.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gkv)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -1062381842;
    }

    public final String toString() {
        return "CALFormat";
    }
}
