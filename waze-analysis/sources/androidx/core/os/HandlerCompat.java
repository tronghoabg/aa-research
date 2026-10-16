package androidx.core.os;

import android.os.Handler;
import android.os.Looper;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class HandlerCompat {
    private static final String TAG = "HandlerCompat";

    /* compiled from: WazeSource */
    class Api29Impl {
        private Api29Impl() {
        }

        public static boolean hasCallbacks(Handler handler, Runnable runnable) {
            return handler.hasCallbacks(runnable);
        }
    }

    private HandlerCompat() {
    }

    public static Handler createAsync(Looper looper) {
        return Api28Impl.createAsync(looper);
    }

    public static boolean hasCallbacks(Handler handler, Runnable runnable) {
        return Api29Impl.hasCallbacks(handler, runnable);
    }

    public static boolean postDelayed(Handler handler, Runnable runnable, Object obj, long j2) {
        return Api28Impl.postDelayed(handler, runnable, obj, j2);
    }

    /* compiled from: WazeSource */
    class Api28Impl {
        private Api28Impl() {
        }

        public static Handler createAsync(Looper looper) {
            return Handler.createAsync(looper);
        }

        public static boolean postDelayed(Handler handler, Runnable runnable, Object obj, long j2) {
            return handler.postDelayed(runnable, obj, j2);
        }

        public static Handler createAsync(Looper looper, Handler.Callback callback) {
            return Handler.createAsync(looper, callback);
        }
    }

    public static Handler createAsync(Looper looper, Handler.Callback callback) {
        return Api28Impl.createAsync(looper, callback);
    }
}
