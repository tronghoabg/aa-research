package androidx.compose.runtime;

import h.g.b.o;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class HotReloader {
    public static final Companion Companion = new Companion(null);

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        private final void loadStateAndCompose(Object obj) {
            Recomposer.Companion.loadStateAndComposeForHotReload$runtime(obj);
        }

        private final Object saveStateAndDispose(Object obj) {
            return Recomposer.Companion.saveStateAndDisposeForHotReload$runtime();
        }

        public final void clearErrors() {
            Recomposer.Companion.clearErrors$runtime();
        }

        public final List<RecomposerErrorInfo> getCurrentErrors() {
            return Recomposer.Companion.getCurrentErrors$runtime();
        }

        public final List<RecomposerErrorInformation> getRecomposerErrors() {
            return Recomposer.Companion.getRecomposerErrors$runtime();
        }

        public final void invalidateGroupsWithKey(int i2) {
            Recomposer.Companion.invalidateGroupsWithKey$runtime(i2);
        }

        public final void simulateHotReload$runtime(Object obj) {
            loadStateAndCompose(saveStateAndDispose(obj));
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
