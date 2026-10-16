package androidx.camera.core.internal;

import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ReadableConfig;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface ThreadConfig extends ReadableConfig {
    public static final Config.Option<Executor> OPTION_BACKGROUND_EXECUTOR = Config.Option.create("camerax.core.thread.backgroundExecutor", Executor.class);

    /* compiled from: WazeSource */
    public interface Builder<B> {
        B setBackgroundExecutor(Executor executor);
    }

    Executor getBackgroundExecutor();

    Executor getBackgroundExecutor(Executor executor);

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.core.internal.ThreadConfig$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Executor $default$getBackgroundExecutor(ThreadConfig threadConfig) {
            return (Executor) threadConfig.retrieveOption(ThreadConfig.OPTION_BACKGROUND_EXECUTOR);
        }

        public static Executor $default$getBackgroundExecutor(ThreadConfig threadConfig, Executor executor) {
            return (Executor) threadConfig.retrieveOption(ThreadConfig.OPTION_BACKGROUND_EXECUTOR, executor);
        }
    }
}
