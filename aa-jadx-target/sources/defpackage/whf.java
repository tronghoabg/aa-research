package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class whf {
    public defpackage.wht a;
    public boolean b;
    public byte c;
    private android.net.Uri d;
    private defpackage.abpy e;
    private defpackage.xyn f = defpackage.xxe.a;
    private defpackage.ygw g;

    public final defpackage.whg a() {
        android.net.Uri uri;
        defpackage.abpy abpyVar;
        defpackage.wht whtVar;
        if (this.g == null) {
            int i = defpackage.ygw.d;
            this.g = defpackage.ymx.a;
        }
        if (this.c == 3 && (uri = this.d) != null && (abpyVar = this.e) != null && (whtVar = this.a) != null) {
            return new defpackage.whg(uri, abpyVar, this.f, this.g, whtVar, this.b);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.d == null) {
            sb.append(" uri");
        }
        if (this.e == null) {
            sb.append(" schema");
        }
        if (this.a == null) {
            sb.append(" variantConfig");
        }
        if ((this.c & 1) == 0) {
            sb.append(" useGeneratedExtensionRegistry");
        }
        if ((this.c & 2) == 0) {
            sb.append(" enableTracing");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b() {
        this.c = (byte) (this.c | 2);
    }

    public final void c(defpackage.abpy abpyVar) {
        if (abpyVar == null) {
            throw new java.lang.NullPointerException("Null schema");
        }
        this.e = abpyVar;
    }

    public final void d(android.net.Uri uri) {
        if (uri == null) {
            throw new java.lang.NullPointerException("Null uri");
        }
        this.d = uri;
    }

    public final void e(defpackage.kwv kwvVar) {
        this.f = defpackage.xyn.h(kwvVar);
    }
}
