package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;

/* loaded from: classes2.dex */
public class mob {
    public Uri A;
    public Uri B;
    public mnz C;
    public int D;
    public long h;
    public String i;
    public yzr j;
    public yzr k;
    public final yzq l;
    public long m;
    public int n;
    public boolean o;
    public int p;
    public String q;
    public mny r;
    public CharSequence s;
    public CharSequence t;
    public CharSequence u;
    public int v;
    public int w;
    public int x;
    public int y;
    public Bitmap z;

    public mob() {
        this.i = "";
        yzr yzrVar = yzr.UNKNOWN;
        this.j = yzrVar;
        this.k = yzrVar;
        this.l = yzq.UNKNOWN_EXTRA;
        this.r = moc.i;
        this.s = "";
        this.t = "";
        this.u = "";
        this.D = 3;
    }

    public final void c(String str) {
        yph yphVar = moc.h;
        int i = ysy.a;
        this.h = ysq.a.b(str).c();
    }

    public final void d(Bitmap bitmap) {
        this.z = bitmap;
        if (bitmap == null || this.A == null) {
            return;
        }
        ((ype) ((ype) moc.h.h()).ai((char) 5111)).u("Set LargeIcon when URI is already present.");
    }

    public final void e(Uri uri) {
        this.A = uri;
        if (this.z == null || uri == null) {
            return;
        }
        ((ype) ((ype) moc.h.h()).ai((char) 5112)).u("Set LargeIconURI when bitmap is already present.");
    }

    public mob(byte[] bArr) {
        this();
        this.r = mny.a;
    }
}
