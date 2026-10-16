package androidx.compose.ui.viewinterop;

import androidx.compose.ui.geometry.Rect;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class AndroidViewHolder$layoutNode$1$coreModifier$4 extends y implements l<l<? super Rect, ? extends ab>, ab> {
    final /* synthetic */ AndroidViewHolder $this_run;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidViewHolder$layoutNode$1$coreModifier$4(AndroidViewHolder androidViewHolder) {
        super(1);
        this.$this_run = androidViewHolder;
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(l<? super Rect, ? extends ab> lVar) {
        invoke2((l<? super Rect, ab>) lVar);
        return ab.f48028a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(l<? super Rect, ab> lVar) {
        this.$this_run.bringIntoViewRequester = lVar;
    }
}
