package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zxc implements defpackage.zys {
    public final defpackage.accg b;
    private java.lang.String d;
    private java.lang.String e;
    private java.lang.String f;
    private final defpackage.gka h;
    public final j$.util.concurrent.ConcurrentHashMap a = new j$.util.concurrent.ConcurrentHashMap();
    private volatile boolean c = true;
    private volatile int g = 1;

    public zxc(defpackage.gka gkaVar, defpackage.accg accgVar) {
        this.h = gkaVar;
        this.b = accgVar;
    }

    private final java.lang.String e() {
        java.lang.String str = this.d;
        if (str != null) {
            return str;
        }
        java.lang.String strF = this.h.F(com.google.android.projection.gearhead.R.string.maps_default_user_error_message);
        this.d = strF;
        return strF;
    }

    private final void f() {
        for (defpackage.zxt zxtVar : this.a.values()) {
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
                    zxtVar.c(this.b, g(this.g, this.e));
                } else {
                    zxtVar.b(g(this.g, this.e));
                }
                h(this.g, this.f);
            }
        }
    }

    private final java.lang.String g(int i, java.lang.String str) {
        if (this.c && str != null) {
            return str;
        }
        if (i == 0) {
            throw null;
        }
        if (i == 3) {
            return this.h.F(com.google.android.projection.gearhead.R.string.maps_out_of_quota_user_error_message);
        }
        return i == 2 ? this.h.F(com.google.android.projection.gearhead.R.string.maps_quota_blocked_user_error_message) : e();
    }

    private final void h(int i, java.lang.String str) {
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
            defpackage.zsr.b(str);
        }
    }

    public final synchronized void a() {
        if (this.c) {
            this.c = false;
            if (!defpackage.adfa.c()) {
                f();
                return;
            }
            java.util.Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((defpackage.zxt) it.next()).b(e());
            }
            defpackage.zsr.b("The Google Maps SDK has been disabled for this application. This might be because of an incorrectly configured project, or an invalid API key. See the Google API console: https://console.developers.google.com, and information about Obtaining an API key: https://developers.google.com/maps/documentation/android-sdk/signup.");
        }
    }

    public final synchronized void b() {
        if (!this.c) {
            this.c = true;
            if (!defpackage.adfa.c()) {
                f();
            }
        }
    }

    @Override // defpackage.zys
    public final synchronized void c(defpackage.zyt zytVar) {
        defpackage.zxm zxmVar;
        defpackage.zxt zxtVar;
        int i = zytVar.e;
        this.g = i;
        java.lang.String str = zytVar.a;
        this.e = str;
        java.lang.String str2 = zytVar.b;
        this.f = str2;
        if (!defpackage.adfa.c()) {
            f();
            return;
        }
        if (this.c && (zxmVar = zytVar.d) != null && (zxtVar = (defpackage.zxt) this.a.get(zxmVar)) != null) {
            int i2 = i - 1;
            if (i2 == 1) {
                zxtVar.b(g(2, str));
                h(2, str2);
            } else if (i2 == 2) {
                zxtVar.c(this.b, g(3, str));
                h(3, str2);
            }
        }
    }

    public final void d(defpackage.zxt zxtVar) {
        this.a.remove(zxtVar.c);
    }
}
