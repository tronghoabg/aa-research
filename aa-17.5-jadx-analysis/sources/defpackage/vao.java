package defpackage;

import android.opengl.GLES32;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class vao {
    private static final san b = new san(2);
    private static final AtomicBoolean a = new AtomicBoolean(false);

    public static final boolean a() {
        return a.get();
    }

    public static san b(String str) {
        if (a()) {
            return d(str);
        }
        return null;
    }

    public static final san c(String str, Enum r2) {
        if (a()) {
            return d(str.concat(String.valueOf(r2.name())));
        }
        return null;
    }

    private static san d(String str) {
        if (a()) {
            GLES32.glPushDebugGroup(33354, 1, str.length(), str);
        }
        return b;
    }
}
