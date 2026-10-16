package androidx.camera.core.internal;

import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ReadableConfig;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface IoConfig extends ReadableConfig {
    public static final Config.Option<Executor> OPTION_IO_EXECUTOR = Config.Option.create("camerax.core.io.ioExecutor", Executor.class);

    /* compiled from: WazeSource */
    public interface Builder<B> {
        B setIoExecutor(Executor executor);
    }

    Executor getIoExecutor();

    Executor getIoExecutor(Executor executor);

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.core.internal.IoConfig$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Executor $default$getIoExecutor(IoConfig ioConfig) {
            return (Executor) ioConfig.retrieveOption(IoConfig.OPTION_IO_EXECUTOR);
        }

        public static Executor $default$getIoExecutor(IoConfig ioConfig, Executor executor) {
            return (Executor) ioConfig.retrieveOption(IoConfig.OPTION_IO_EXECUTOR, executor);
        }
    }
}
