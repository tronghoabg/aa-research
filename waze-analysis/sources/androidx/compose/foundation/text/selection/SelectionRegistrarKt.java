package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SelectionRegistrarKt {
    private static final ProvidableCompositionLocal<SelectionRegistrar> LocalSelectionRegistrar = CompositionLocalKt.compositionLocalOf$default(null, new a() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarKt$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            int i2 = SelectionRegistrarKt.f1655a;
            return null;
        }
    }, 1, null);

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1655a = 0;

    static final SelectionRegistrar LocalSelectionRegistrar$lambda$0() {
        return null;
    }

    public static final ProvidableCompositionLocal<SelectionRegistrar> getLocalSelectionRegistrar() {
        return LocalSelectionRegistrar;
    }

    public static final boolean hasSelection(SelectionRegistrar selectionRegistrar, long j2) {
        LongObjectMap<Selection> subselections;
        if (selectionRegistrar == null || (subselections = selectionRegistrar.getSubselections()) == null) {
            return false;
        }
        return subselections.containsKey(j2);
    }
}
