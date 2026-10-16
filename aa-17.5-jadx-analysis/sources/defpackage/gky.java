package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class gky implements gkw {
    public static final gky a = new gky();

    private gky() {
    }

    @Override // defpackage.gkw
    public final void a(gkw gkwVar, Intent intent) {
        Intent action;
        String query;
        Integer num;
        if (affa.f(gkwVar, this)) {
            return;
        }
        if (!affa.f(gkwVar, gle.a)) {
            Objects.toString(gkwVar);
            Log.e("CarApp.H.Tem", "[INVALID] MobileConsistent intent cannot be converted to any other format New Intent format: ".concat(gkwVar.toString()));
            return;
        }
        String action2 = intent.getAction();
        Uri data = intent.getData();
        if (gkx.f(intent, "geo.action")) {
            String strN = "geo:0,0?";
            if (data != null && (query = data.getQuery()) != null) {
                Map map = glb.a;
                StringBuilder sb = new StringBuilder("geo:0,0?");
                Iterator it = afyh.K(query, new char[]{'&'}, 0).iterator();
                while (it.hasNext()) {
                    List listK = afyh.K((String) it.next(), new char[]{'='}, 2);
                    String str = (String) listK.get(0);
                    String str2 = (String) listK.get(1);
                    Map map2 = (Map) map.get(str);
                    if (map2 != null && (num = (Integer) map2.get(str2)) != null) {
                        sb.append(str + "=" + num.intValue() + "&");
                    }
                }
                strN = afyh.n(sb.toString(), "&");
            }
            action = intent.setData(Uri.parse(strN));
        } else {
            action = affa.f(action2, "android.intent.action.VIEW") ? intent.setAction("android.intent.action.SEARCH") : intent.setAction("androidx.car.app.action.NAVIGATE");
        }
        action.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gky)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 946269954;
    }

    public final String toString() {
        return "MobileConsistentFormat";
    }
}
