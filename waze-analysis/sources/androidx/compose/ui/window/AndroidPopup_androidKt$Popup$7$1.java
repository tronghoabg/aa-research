package androidx.compose.ui.window;

import androidx.compose.ui.layout.LayoutCoordinates;
import h.ab;
import h.g.a.l;
import h.g.b.x;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class AndroidPopup_androidKt$Popup$7$1 extends y implements l<LayoutCoordinates, ab> {
    final /* synthetic */ PopupLayout $popupLayout;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidPopup_androidKt$Popup$7$1(PopupLayout popupLayout) {
        super(1);
        this.$popupLayout = popupLayout;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        x.c(parentLayoutCoordinates);
        this.$popupLayout.updateParentLayoutCoordinates(parentLayoutCoordinates);
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(LayoutCoordinates layoutCoordinates) {
        invoke2(layoutCoordinates);
        return ab.f48028a;
    }
}
