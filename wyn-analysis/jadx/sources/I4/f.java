package I4;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class f implements B4.d {

    /* renamed from: b, reason: collision with root package name */
    public final j f5332b;

    /* renamed from: c, reason: collision with root package name */
    public final URL f5333c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5334d;

    /* renamed from: e, reason: collision with root package name */
    public String f5335e;

    /* renamed from: f, reason: collision with root package name */
    public URL f5336f;

    /* renamed from: g, reason: collision with root package name */
    public volatile byte[] f5337g;

    /* renamed from: h, reason: collision with root package name */
    public int f5338h;

    public f(URL url) {
        j jVar = g.f5339a;
        gc.b.k(url, "Argument must not be null");
        this.f5333c = url;
        this.f5334d = null;
        gc.b.k(jVar, "Argument must not be null");
        this.f5332b = jVar;
    }

    @Override // B4.d
    public final void b(MessageDigest messageDigest) {
        if (this.f5337g == null) {
            this.f5337g = c().getBytes(B4.d.f1583a);
        }
        messageDigest.update(this.f5337g);
    }

    public final String c() {
        String str = this.f5334d;
        if (str != null) {
            return str;
        }
        URL url = this.f5333c;
        gc.b.k(url, "Argument must not be null");
        return url.toString();
    }

    public final URL d() {
        if (this.f5336f == null) {
            if (TextUtils.isEmpty(this.f5335e)) {
                String string = this.f5334d;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.f5333c;
                    gc.b.k(url, "Argument must not be null");
                    string = url.toString();
                }
                this.f5335e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f5336f = new URL(this.f5335e);
        }
        return this.f5336f;
    }

    @Override // B4.d
    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return c().equals(fVar.c()) && this.f5332b.equals(fVar.f5332b);
    }

    @Override // B4.d
    public final int hashCode() {
        if (this.f5338h == 0) {
            int iHashCode = c().hashCode();
            this.f5338h = iHashCode;
            this.f5338h = this.f5332b.f5343b.hashCode() + (iHashCode * 31);
        }
        return this.f5338h;
    }

    public final String toString() {
        return c();
    }

    public f(String str) {
        this(str, g.f5339a);
    }

    public f(String str, j jVar) {
        this.f5333c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f5334d = str;
            gc.b.k(jVar, "Argument must not be null");
            this.f5332b = jVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
