package androidx.compose.ui.window;

import androidx.compose.ui.layout.LayoutCoordinates;
import h.g.a.a;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class PopupLayout$canCalculatePosition$2 extends y implements a<Boolean> {
    final /* synthetic */ PopupLayout this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PopupLayout$canCalculatePosition$2(PopupLayout popupLayout) {
        super(0);
        this.this$0 = popupLayout;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h.g.a.a
    public final Boolean invoke() {
        LayoutCoordinates parentLayoutCoordinates = this.this$0.getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null || !parentLayoutCoordinates.isAttached()) {
            parentLayoutCoordinates = null;
        }
        boolean z = false;
        if (parentLayoutCoordinates != null && this.this$0.m11423getPopupContentSizebOM6tXw() != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
