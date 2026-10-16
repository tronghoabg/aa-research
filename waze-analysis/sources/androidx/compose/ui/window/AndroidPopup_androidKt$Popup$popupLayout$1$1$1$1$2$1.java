package androidx.compose.ui.window;

import androidx.compose.ui.unit.IntSize;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$2$1 extends y implements l<IntSize, ab> {
    final /* synthetic */ PopupLayout $this_apply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$2$1(PopupLayout popupLayout) {
        super(1);
        this.$this_apply = popupLayout;
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(IntSize intSize) {
        m11421invokeozmzZPI(intSize.m11343unboximpl());
        return ab.f48028a;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m11421invokeozmzZPI(long j2) {
        this.$this_apply.m11424setPopupContentSizefhxjrPA(IntSize.m11331boximpl(j2));
        this.$this_apply.updatePosition();
    }
}
