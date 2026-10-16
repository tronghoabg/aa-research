package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class cjj {
    public final Bitmap a;

    public cjj(Bitmap bitmap) {
        this.a = bitmap;
    }

    public final int a() {
        Bitmap.Config config = this.a.getConfig();
        config.getClass();
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        if (config == Bitmap.Config.RGBA_F16) {
            return 3;
        }
        return config == Bitmap.Config.HARDWARE ? 4 : 0;
    }

    public final int b() {
        return this.a.getHeight();
    }

    public final int c() {
        return this.a.getWidth();
    }

    public final void d() {
        this.a.prepareToDraw();
    }
}
