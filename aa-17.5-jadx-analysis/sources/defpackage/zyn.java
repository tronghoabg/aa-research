package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zyn {
    private static final String d = "zyn";
    public final zrc a;
    public final zrt b;
    final Map c;
    private final zxs e;

    public zyn(zxs zxsVar, zrc zrcVar, zrt zrtVar) {
        this.e = zxsVar;
        this.a = zrcVar;
        zkt.n(zrtVar, "threadChecker");
        this.b = zrtVar;
        this.c = new HashMap();
    }

    public final void a(String str) {
        this.b.a();
        if (c(str)) {
            this.e.b(acbe.STREETVIEW_CREATE_DYNAMIC, null, null, null);
            String str2 = d;
            if (zrn.e(str2, 3)) {
                Log.d(str2, String.format("Added new quota event for:[%s]", str));
            }
        } else {
            String str3 = d;
            if (zrn.e(str3, 3)) {
                Log.d(str3, String.format("Reused quota event for:[%s]", str));
            }
        }
        b();
    }

    final void b() {
        Iterator it = this.c.keySet().iterator();
        while (it.hasNext()) {
            if (c((String) it.next())) {
                it.remove();
            }
        }
    }

    final boolean c(String str) {
        if (str == null) {
            return true;
        }
        Map map = this.c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l = (Long) map.get(str);
        return l == null || jCurrentTimeMillis - l.longValue() > 5000;
    }
}
