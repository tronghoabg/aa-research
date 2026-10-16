package androidx.compose.ui.tooling;

import androidx.compose.runtime.tooling.CompositionData;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class CompositionDataRecordImpl implements CompositionDataRecord {
    private final Set<CompositionData> store = Collections.newSetFromMap(new WeakHashMap());

    @Override // androidx.compose.ui.tooling.CompositionDataRecord
    public Set<CompositionData> getStore() {
        return this.store;
    }
}
