package androidx.media3.exoplayer.util;

import androidx.media3.common.util.Consumer;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface ReleasableExecutor extends Executor {

    /* compiled from: WazeSource */
    /* renamed from: androidx.media3.exoplayer.util.ReleasableExecutor$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static <T extends Executor> ReleasableExecutor from(final T t, final Consumer<T> consumer) {
            return new ReleasableExecutor() { // from class: androidx.media3.exoplayer.util.ReleasableExecutor.1
                @Override // java.util.concurrent.Executor
                public void execute(Runnable runnable) {
                    t.execute(runnable);
                }

                @Override // androidx.media3.exoplayer.util.ReleasableExecutor
                public void release() {
                    consumer.accept(t);
                }
            };
        }
    }

    void release();
}
