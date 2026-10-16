package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.tooling.CompositionObserverHandle;
import androidx.compose.runtime.tooling.CompositionRegistrationObserver;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface RecomposerInfo {
    public static final /* synthetic */ Companion Companion = Companion.$$INSTANCE;

    long getChangeCount();

    ch<RecomposerErrorInformation> getErrorState();

    boolean getHasPendingWork();

    k<Recomposer.State> getState();

    CompositionObserverHandle observe(CompositionRegistrationObserver compositionRegistrationObserver);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.runtime.RecomposerInfo$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static CompositionObserverHandle $default$observe(RecomposerInfo recomposerInfo, CompositionRegistrationObserver compositionRegistrationObserver) {
            return null;
        }

        static {
            Companion companion = RecomposerInfo.Companion;
        }

        public static /* synthetic */ void getErrorState$annotations() {
        }
    }

    /* compiled from: WazeSource */
    final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final ch<RecomposerErrorInformation> DefaultErrorStateFlow = ck.b(null);

        private Companion() {
        }

        private static /* synthetic */ void getDefaultErrorStateFlow$annotations() {
        }
    }
}
