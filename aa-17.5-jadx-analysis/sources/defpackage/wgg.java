package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class wgg {
    public wgu a;
    public boolean b;
    public byte c;
    private Uri d;
    private abow e;
    private xxh f = xvy.a;
    private yfq g;

    public final wgh a() {
        Uri uri;
        abow abowVar;
        wgu wguVar;
        if (this.g == null) {
            int i = yfq.d;
            this.g = yls.a;
        }
        if (this.c == 3 && (uri = this.d) != null && (abowVar = this.e) != null && (wguVar = this.a) != null) {
            return new wgh(uri, abowVar, this.f, this.g, wguVar, this.b);
        }
        StringBuilder sb = new StringBuilder();
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
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b() {
        this.c = (byte) (this.c | 2);
    }

    public final void c(abow abowVar) {
        if (abowVar == null) {
            throw new NullPointerException("Null schema");
        }
        this.e = abowVar;
    }

    public final void d(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.d = uri;
    }

    public final void e(kwp kwpVar) {
        this.f = xxh.h(kwpVar);
    }
}
