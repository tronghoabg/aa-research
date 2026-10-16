package Ff;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import ef.C2529m;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4118a = 0;

    @Nullable
    private static volatile Choreographer choreographer;

    static {
        Object objZ;
        try {
            objZ = new e(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            objZ = Fe.e.z(th);
        }
        if (objZ instanceof C2529m) {
            objZ = null;
        }
    }

    public static final Handler a(Looper looper) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        AbstractC3340k.c(objInvoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) objInvoke;
    }
}
