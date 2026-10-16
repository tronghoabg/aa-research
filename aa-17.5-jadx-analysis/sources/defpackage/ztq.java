package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public abstract class ztq {
    private static ztq a;

    public static ztq b() {
        if (a == null) {
            a = new ztl();
        }
        return a;
    }

    public abstract Bitmap a(gjt gjtVar);
}
