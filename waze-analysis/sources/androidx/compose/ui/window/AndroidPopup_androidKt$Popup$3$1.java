package androidx.compose.ui.window;

import androidx.compose.ui.unit.LayoutDirection;
import h.ab;
import h.g.a.a;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class AndroidPopup_androidKt$Popup$3$1 extends y implements a<ab> {
    final /* synthetic */ LayoutDirection $layoutDirection;
    final /* synthetic */ a<ab> $onDismissRequest;
    final /* synthetic */ PopupLayout $popupLayout;
    final /* synthetic */ PopupProperties $properties;
    final /* synthetic */ String $testTag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidPopup_androidKt$Popup$3$1(PopupLayout popupLayout, a<ab> aVar, PopupProperties popupProperties, String str, LayoutDirection layoutDirection) {
        super(0);
        this.$popupLayout = popupLayout;
        this.$onDismissRequest = aVar;
        this.$properties = popupProperties;
        this.$testTag = str;
        this.$layoutDirection = layoutDirection;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$popupLayout.updateParameters(this.$onDismissRequest, this.$properties, this.$testTag, this.$layoutDirection);
    }

    @Override // h.g.a.a
    public /* bridge */ /* synthetic */ ab invoke() {
        invoke2();
        return ab.f48028a;
    }
}
