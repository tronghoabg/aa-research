package androidx.compose.ui.viewinterop;

import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class AndroidViewHolder$layoutNode$1$4 extends y implements l<Owner, ab> {
    final /* synthetic */ AndroidViewHolder $this_run;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidViewHolder$layoutNode$1$4(AndroidViewHolder androidViewHolder) {
        super(1);
        this.$this_run = androidViewHolder;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Owner owner) {
        if (ComposeUiFlags.isViewFocusFixEnabled && this.$this_run.hasFocus()) {
            owner.getFocusOwner().clearFocus(true);
        }
        AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
        if (androidComposeView != null) {
            androidComposeView.removeAndroidView(this.$this_run);
        }
        this.$this_run.removeAllViewsInLayout();
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(Owner owner) {
        invoke2(owner);
        return ab.f48028a;
    }
}
