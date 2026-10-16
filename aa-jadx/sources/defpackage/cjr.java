package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cjr {
    public final android.graphics.Bitmap a;

    public cjr(android.graphics.Bitmap bitmap) {
        this.a = bitmap;
    }

    public final int a() {
        android.graphics.Bitmap.Config config = this.a.getConfig();
        config.getClass();
        if (config == android.graphics.Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == android.graphics.Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == android.graphics.Bitmap.Config.ARGB_4444) {
            return 0;
        }
        if (config == android.graphics.Bitmap.Config.RGBA_F16) {
            return 3;
        }
        return config == android.graphics.Bitmap.Config.HARDWARE ? 4 : 0;
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
