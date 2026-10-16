package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public final class aact {
    public final /* synthetic */ Bitmap a;
    final /* synthetic */ boolean b;
    final /* synthetic */ vip c;
    public final /* synthetic */ aacu d;

    public aact(aacu aacuVar, Bitmap bitmap, boolean z, vip vipVar) {
        this.a = bitmap;
        this.b = z;
        this.c = vipVar;
        this.d = aacuVar;
    }

    public final void a(Bitmap bitmap) {
        this.d.b.execute(new isq(this, bitmap, this.b, this.c, 12));
    }
}
