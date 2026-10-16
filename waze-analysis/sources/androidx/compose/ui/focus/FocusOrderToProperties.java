package androidx.compose.ui.focus;

import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FocusOrderToProperties implements FocusPropertiesScope {
    public static final int $stable = 0;
    private final l<FocusOrder, ab> focusOrderReceiver;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusOrderToProperties(l<? super FocusOrder, ab> lVar) {
        this.focusOrderReceiver = lVar;
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesScope
    public void apply(FocusProperties focusProperties) {
        this.focusOrderReceiver.invoke(new FocusOrder(focusProperties));
    }

    public final l<FocusOrder, ab> getFocusOrderReceiver() {
        return this.focusOrderReceiver;
    }
}
