package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import h.c;
import h.g.a.a;
import h.g.b.r;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final /* synthetic */ class SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0 implements OffsetProvider, r {
    private final /* synthetic */ a function;

    SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0(a aVar) {
        this.function = aVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof OffsetProvider) && (obj instanceof r)) {
            return x.n(getFunctionDelegate(), ((r) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // h.g.b.r
    public final c<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.compose.foundation.text.selection.OffsetProvider
    /* renamed from: provide-F1C5BW0 */
    public final /* synthetic */ long mo3222provideF1C5BW0() {
        return ((Offset) this.function.invoke()).m7990unboximpl();
    }
}
