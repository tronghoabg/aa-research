package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f51363a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object objA;
        try {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, Looper.getMainLooper());
            x.d(objInvoke, "null cannot be cast to non-null type android.os.Handler");
            objA = new c((Handler) objInvoke, null);
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
    }

    public static final d a(Handler handler, String str) {
        return new c(handler, str);
    }
}
