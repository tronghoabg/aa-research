package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import h.ab;
import h.g.a.a;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AndroidComposeView$layoutChildViewsIfNeeded$1 extends y implements a<ab> {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidComposeView$layoutChildViewsIfNeeded$1(AndroidComposeView androidComposeView) {
        super(0);
        this.this$0 = androidComposeView;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AndroidViewsHandler androidViewsHandler = this.this$0._androidViewsHandler;
        if (androidViewsHandler != null) {
            int childCount = androidViewsHandler.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = androidViewsHandler.getChildAt(i2);
                AndroidViewHolder androidViewHolder = childAt instanceof AndroidViewHolder ? (AndroidViewHolder) childAt : null;
                if (androidViewHolder != null && androidViewHolder.isLayoutRequested()) {
                    androidViewHolder.layout(androidViewHolder.getLeft(), androidViewHolder.getTop(), androidViewHolder.getRight(), androidViewHolder.getBottom());
                }
            }
        }
    }

    @Override // h.g.a.a
    public /* bridge */ /* synthetic */ ab invoke() {
        invoke2();
        return ab.f48028a;
    }
}
