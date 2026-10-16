package defpackage;

import com.google.android.projection.gearhead.R;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zvz implements zxp {
    public final acbe b;
    private String d;
    private String e;
    private String f;
    private final gjt h;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    private volatile boolean c = true;
    private volatile int g = 1;

    public zvz(gjt gjtVar, acbe acbeVar) {
        this.h = gjtVar;
        this.b = acbeVar;
    }

    private final String e() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        String strF = this.h.F(R.string.maps_default_user_error_message);
        this.d = strF;
        return strF;
    }

    private final void f() {
        for (zwq zwqVar : this.a.values()) {
            int i = this.g;
            if (i == 0) {
                throw null;
            }
            if (i != 1 || !this.c) {
                int i2 = this.g;
                if (i2 == 0) {
                    throw null;
                }
                if (i2 == 3 && this.c) {
                    zwqVar.c(this.b, g(this.g, this.e));
                } else {
                    zwqVar.b(g(this.g, this.e));
                }
                h(this.g, this.f);
            }
        }
    }

    private final String g(int i, String str) {
        if (this.c && str != null) {
            return str;
        }
        if (i != 0) {
            return i == 3 ? this.h.F(R.string.maps_out_of_quota_user_error_message) : i == 2 ? this.h.F(R.string.maps_quota_blocked_user_error_message) : e();
        }
        throw null;
    }

    private final void h(int i, String str) {
        if (!this.c || str == null) {
            str = null;
            if (i == 0) {
                throw null;
            }
            if (i == 3) {
                str = "The number of requests has exceeded the usage limits for the Google Maps SDK.";
            } else if (i == 2) {
                str = "The Google Maps SDK has been disabled for this application. This might be because of an incorrectly configured project, or an invalid API key. See the Google API console: https://console.developers.google.com, and information about Obtaining an API key: https://developers.google.com/maps/documentation/android-sdk/signup.";
            }
        }
        if (str != null) {
            zrn.b(str);
        }
    }

    public final synchronized void a() {
        if (this.c) {
            this.c = false;
            if (!adeb.c()) {
                f();
                return;
            }
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((zwq) it.next()).b(e());
            }
            zrn.b("The Google Maps SDK has been disabled for this application. This might be because of an incorrectly configured project, or an invalid API key. See the Google API console: https://console.developers.google.com, and information about Obtaining an API key: https://developers.google.com/maps/documentation/android-sdk/signup.");
        }
    }

    public final synchronized void b() {
        if (!this.c) {
            this.c = true;
            if (!adeb.c()) {
                f();
            }
        }
    }

    @Override // defpackage.zxp
    public final synchronized void c(zxq zxqVar) {
        zwj zwjVar;
        zwq zwqVar;
        int i = zxqVar.e;
        this.g = i;
        String str = zxqVar.a;
        this.e = str;
        String str2 = zxqVar.b;
        this.f = str2;
        if (!adeb.c()) {
            f();
            return;
        }
        if (this.c && (zwjVar = zxqVar.d) != null && (zwqVar = (zwq) this.a.get(zwjVar)) != null) {
            int i2 = i - 1;
            if (i2 == 1) {
                zwqVar.b(g(2, str));
                h(2, str2);
            } else if (i2 == 2) {
                zwqVar.c(this.b, g(3, str));
                h(3, str2);
            }
        }
    }

    public final void d(zwq zwqVar) {
        this.a.remove(zwqVar.c);
    }
}
