package androidx.compose.ui.tooling;

import androidx.compose.runtime.tooling.CompositionData;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface CompositionDataRecord {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final CompositionDataRecord create() {
            return new CompositionDataRecordImpl();
        }
    }

    Set<CompositionData> getStore();
}
