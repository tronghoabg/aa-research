package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class moh {
    public android.net.Uri A;
    public android.net.Uri B;
    public defpackage.mof C;
    public int D;
    public long h;
    public java.lang.String i;
    public defpackage.zaw j;
    public defpackage.zaw k;
    public final defpackage.zav l;
    public long m;
    public int n;
    public boolean o;
    public int p;
    public java.lang.String q;
    public defpackage.moe r;
    public java.lang.CharSequence s;
    public java.lang.CharSequence t;
    public java.lang.CharSequence u;
    public int v;
    public int w;
    public int x;
    public int y;
    public android.graphics.Bitmap z;

    public moh() {
        this.i = "";
        defpackage.zaw zawVar = defpackage.zaw.UNKNOWN;
        this.j = zawVar;
        this.k = zawVar;
        this.l = defpackage.zav.UNKNOWN_EXTRA;
        this.r = defpackage.moi.i;
        this.s = "";
        this.t = "";
        this.u = "";
        this.D = 3;
    }

    public final void c(java.lang.String str) {
        defpackage.yqm yqmVar = defpackage.moi.h;
        int i = defpackage.yud.a;
        this.h = defpackage.ytv.a.b(str).c();
    }

    public final void d(android.graphics.Bitmap bitmap) {
        this.z = bitmap;
        if (bitmap == null || this.A == null) {
            return;
        }
        ((defpackage.yqj) ((defpackage.yqj) defpackage.moi.h.h()).ai((char) 5113)).u("Set LargeIcon when URI is already present.");
    }

    public final void e(android.net.Uri uri) {
        this.A = uri;
        if (this.z == null || uri == null) {
            return;
        }
        ((defpackage.yqj) ((defpackage.yqj) defpackage.moi.h.h()).ai((char) 5114)).u("Set LargeIconURI when bitmap is already present.");
    }

    public moh(byte[] bArr) {
        this();
        this.r = defpackage.moe.a;
    }
}
