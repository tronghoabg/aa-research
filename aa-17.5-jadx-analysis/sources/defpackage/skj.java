package defpackage;

import android.util.Log;

/* loaded from: classes.dex */
public class skj {
    public static final skj a = new skj(true, null, null);
    final boolean b;
    final String c;
    final Throwable d;

    public skj(boolean z, String str, Throwable th) {
        this.b = z;
        this.c = str;
        this.d = th;
    }

    public String a() {
        return this.c;
    }

    final void b() {
        if (this.b || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        Throwable th = this.d;
        if (th != null) {
            Log.d("GoogleCertificatesRslt", a(), th);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }
}
