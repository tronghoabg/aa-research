package defpackage;

import android.util.Log;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes3.dex */
public abstract class zsm implements zsr {
    private static final String b = "zsm";
    volatile long a = 0;
    private int c;

    public zsm() {
        synchronized (this) {
            this.c = 0;
        }
    }

    private final String k() {
        int iH = h();
        return iH != 15 ? iH != 36 ? iH != 45 ? iH != 50 ? iH != 62 ? iH != 75 ? iH != 108 ? iH != 118 ? iH != 132 ? iH != 147 ? iH != 39 ? iH != 40 ? a.bp(iH, "UNKNOWN_TYPE ") : "STREETVIEW_REQUEST" : "RESOURCE_REQUEST" : "API_QUOTA_EVENT_REQUEST" : "API_TOKEN_REQUEST" : "INDOOR_BUILDING_REQUEST" : "MAP_TILE_4_REQUEST" : "CLIENT_PARAMETERS_REQUEST" : "CLIENT_PROPERTIES_2_REQUEST" : "REVERSE_GEOCODE_REQUEST" : "STREET_VIEW_REPORT" : "LAYER_TILE_REQUEST" : "COOKIE_REQUEST";
    }

    @Override // defpackage.zsr
    public void a() {
        g("onComplete");
    }

    @Override // defpackage.zsr
    public void b() {
        g("onPermanentFailure");
    }

    @Override // defpackage.zsr
    public final synchronized void c() {
        this.c++;
    }

    @Override // defpackage.zsr
    public final void d() {
        String str = b;
        if (zrn.e(str, 3)) {
            Log.d(str, "REQUEST  type = ".concat(k()));
        }
        this.a = System.currentTimeMillis();
    }

    @Override // defpackage.zsr
    public boolean e() {
        return true;
    }

    @Override // defpackage.zsr
    public boolean f() {
        boolean z;
        g("onRetry");
        synchronized (this) {
            z = this.c < 3;
        }
        return z;
    }

    @ResultIgnorabilityUnspecified
    public final void g(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.a;
        if (this.a <= 0) {
            String str2 = b;
            if (zrn.e(str2, 3)) {
                Log.d(str2, str + ", " + k() + ", no request time");
                return;
            }
            return;
        }
        String str3 = b;
        if (zrn.e(str3, 3)) {
            Log.d(str3, str + ", " + k() + ", elapsed time (ms) = " + jCurrentTimeMillis);
        }
    }

    public String toString() {
        return k();
    }
}
