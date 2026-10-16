package kotlin.reflect.jvm.internal.impl.storage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.l;

/* loaded from: classes5.dex */
public interface SimpleLock {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final DefaultSimpleLock simpleLock(@Nullable Runnable runnable, @Nullable l lVar) {
            return (runnable == null || lVar == null) ? new DefaultSimpleLock(null, 1, null) : new CancellableSimpleLock(runnable, lVar);
        }
    }

    void lock();

    void unlock();
}
