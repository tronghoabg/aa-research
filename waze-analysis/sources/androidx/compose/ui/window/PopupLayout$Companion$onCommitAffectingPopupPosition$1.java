package androidx.compose.ui.window;

import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class PopupLayout$Companion$onCommitAffectingPopupPosition$1 extends y implements l<PopupLayout, ab> {
    public static final PopupLayout$Companion$onCommitAffectingPopupPosition$1 INSTANCE = new PopupLayout$Companion$onCommitAffectingPopupPosition$1();

    PopupLayout$Companion$onCommitAffectingPopupPosition$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PopupLayout popupLayout) {
        if (popupLayout.isAttachedToWindow()) {
            popupLayout.updatePosition();
        }
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(PopupLayout popupLayout) {
        invoke2(popupLayout);
        return ab.f48028a;
    }
}
