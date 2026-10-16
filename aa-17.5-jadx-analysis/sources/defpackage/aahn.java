package defpackage;

import android.opengl.GLSurfaceView;
import android.util.Log;

/* loaded from: classes3.dex */
public abstract class aahn {
    public static final String a = "aahn";
    public volatile GLSurfaceView b = null;

    protected abstract void a();

    public final void b(String str) {
        String str2 = a;
        if (zrn.e(str2, 3)) {
            Log.d(str2, String.format("requestFrame(%s)", str));
        }
        a();
    }
}
