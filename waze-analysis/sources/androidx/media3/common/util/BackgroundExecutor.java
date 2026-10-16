package androidx.media3.common.util;

import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class BackgroundExecutor {
    private static Executor staticInstance;

    private BackgroundExecutor() {
    }

    public static synchronized Executor get() {
        if (staticInstance == null) {
            staticInstance = Util.newSingleThreadExecutor("ExoPlayer:BackgroundExecutor");
        }
        return staticInstance;
    }

    public static synchronized void set(Executor executor) {
        staticInstance = executor;
    }
}
