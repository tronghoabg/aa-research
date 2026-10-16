package androidx.compose.ui.window;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$1$1 extends y implements l<SemanticsPropertyReceiver, ab> {
    public static final AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$1$1 INSTANCE = new AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$1$1();

    AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$1$1() {
        super(1);
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return ab.f48028a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.popup(semanticsPropertyReceiver);
    }
}
