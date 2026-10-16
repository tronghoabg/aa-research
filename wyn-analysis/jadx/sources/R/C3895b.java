package r;

import Fe.e;
import R8.x;
import Y0.c;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: r.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3895b extends e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f44286a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f44287b = Executors.newFixedThreadPool(4, new x());

    /* renamed from: c, reason: collision with root package name */
    public volatile Handler f44288c;

    public static Handler h0(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
