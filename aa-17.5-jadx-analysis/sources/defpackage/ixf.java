package defpackage;

import android.content.Context;
import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class ixf {
    public volatile boolean a;
    public final Context b;
    public final ixe c = new ixe(this);
    public final int d;
    public final int e;
    final Bitmap.Config f;

    public ixf(Context context, int i, int i2, int i3) {
        this.a = false;
        this.e = i;
        this.d = i2;
        this.b = context;
        if (i3 == 32) {
            this.f = Bitmap.Config.ARGB_8888;
        } else {
            this.f = i3 == 16 ? Bitmap.Config.RGB_565 : Bitmap.Config.ALPHA_8;
        }
        this.a = acwf.a.gu().a();
    }

    public final byte[] a(String str) {
        return this.c.a(str, false);
    }
}
