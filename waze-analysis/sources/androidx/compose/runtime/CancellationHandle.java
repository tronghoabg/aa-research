package androidx.compose.runtime;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface CancellationHandle {
    public static final Companion Companion = Companion.$$INSTANCE;

    void cancel();

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final CancellationHandle Empty = new CancellationHandle() { // from class: androidx.compose.runtime.CancellationHandle$Companion$$ExternalSyntheticLambda0
            @Override // androidx.compose.runtime.CancellationHandle
            public final void cancel() {
            }
        };

        private Companion() {
        }

        public final CancellationHandle getEmpty$runtime() {
            return Empty;
        }

        static final void Empty$lambda$0() {
        }
    }
}
