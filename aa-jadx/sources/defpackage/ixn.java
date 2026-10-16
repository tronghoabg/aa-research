package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ixn {
    public volatile boolean a;
    public final android.content.Context b;
    public final defpackage.ixm c = new defpackage.ixm(this);
    public final int d;
    public final int e;
    final android.graphics.Bitmap.Config f;

    public ixn(android.content.Context context, int i, int i2, int i3) {
        this.a = false;
        this.e = i;
        this.d = i2;
        this.b = context;
        if (i3 == 32) {
            this.f = android.graphics.Bitmap.Config.ARGB_8888;
        } else {
            this.f = i3 == 16 ? android.graphics.Bitmap.Config.RGB_565 : android.graphics.Bitmap.Config.ALPHA_8;
        }
        this.a = defpackage.acxh.a.fF().a();
    }

    public final byte[] a(java.lang.String str) {
        return this.c.a(str, false);
    }
}
