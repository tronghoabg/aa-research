package defpackage;

import java.net.URL;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class hyx implements hui {
    public final hyy b;
    public final URL c;
    public final String d;
    public String e;
    public URL f;
    private volatile byte[] g;
    private int h;

    public hyx(String str) {
        hyy hyyVar = hyy.a;
        this.c = null;
        fxy.h(str);
        this.d = str;
        a.al(hyyVar, "Argument must not be null");
        this.b = hyyVar;
    }

    @Override // defpackage.hui
    public final void a(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = b().getBytes(a);
        }
        messageDigest.update(this.g);
    }

    public final String b() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        URL url = this.c;
        a.al(url, "Argument must not be null");
        return url.toString();
    }

    @Override // defpackage.hui
    public final boolean equals(Object obj) {
        if (obj instanceof hyx) {
            hyx hyxVar = (hyx) obj;
            if (b().equals(hyxVar.b()) && this.b.equals(hyxVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hui
    public final int hashCode() {
        int i = this.h;
        if (i != 0) {
            return i;
        }
        int iHashCode = b().hashCode();
        this.h = iHashCode;
        int iHashCode2 = (iHashCode * 31) + this.b.hashCode();
        this.h = iHashCode2;
        return iHashCode2;
    }

    public final String toString() {
        return b();
    }

    public hyx(URL url) {
        hyy hyyVar = hyy.a;
        a.al(url, "Argument must not be null");
        this.c = url;
        this.d = null;
        a.al(hyyVar, "Argument must not be null");
        this.b = hyyVar;
    }
}
