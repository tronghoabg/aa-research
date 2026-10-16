package e.a.b.a;

import android.content.Context;
import android.os.UserHandle;
import java.lang.reflect.Method;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ar {

    /* renamed from: a, reason: collision with root package name */
    private static volatile Method f46358a;

    private ar() {
    }

    public static Context a(Context context, UserHandle userHandle) {
        if (f46358a == null) {
            synchronized (ar.class) {
                if (f46358a == null) {
                    f46358a = Context.class.getMethod("createContextAsUser", UserHandle.class, Integer.TYPE);
                }
            }
        }
        return (Context) f46358a.invoke(context, userHandle, 0);
    }

    final synchronized void b() {
    }

    ar(byte[] bArr) {
    }
}
