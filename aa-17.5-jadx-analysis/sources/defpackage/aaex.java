package defpackage;

import android.graphics.Bitmap;
import android.util.SparseIntArray;

/* loaded from: classes3.dex */
public final class aaex {
    public tpu a;
    public aacl b;
    public too c;
    public boolean d;
    public boolean e;
    public final SparseIntArray f = new SparseIntArray();
    public twq g;
    public gjt h;

    public final tqo a(int i) {
        Bitmap bitmapC = this.h.C(i);
        zkt.g(bitmapC != null, "Unable to load MyLocation resources.");
        int iB = this.b.b(this.g, bitmapC, Float.MAX_VALUE);
        this.f.put(i, iB);
        return ((typ) this.g.b).g.b(iB);
    }

    public final void b() {
        if (this.c == null || !this.e) {
            return;
        }
        this.g.f.d(this.a);
    }

    public final void c(tqq tqqVar) {
        zkt.n(this.a, "dot");
        this.a.g(tqqVar);
    }
}
