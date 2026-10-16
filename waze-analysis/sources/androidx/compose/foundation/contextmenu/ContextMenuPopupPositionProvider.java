package androidx.compose.foundation.contextmenu;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.a;
import h.g.a.p;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ContextMenuPopupPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final a<IntOffset> anchorPositionBlock;
    private final p<IntOffset, IntRect, ab> onPositionCalculated;

    public /* synthetic */ ContextMenuPopupPositionProvider(long j2, p pVar, int i2, o oVar) {
        this(j2, (i2 & 2) != 0 ? null : pVar, null);
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4, reason: not valid java name */
    public long mo2094calculatePositionllwVHH4(IntRect intRect, long j2, LayoutDirection layoutDirection, long j3) {
        long jM11305unboximpl = this.anchorPositionBlock.invoke().m11305unboximpl();
        int left = intRect.getLeft() + IntOffset.m11296getXimpl(jM11305unboximpl);
        int iM11297getYimpl = IntOffset.m11297getYimpl(jM11305unboximpl);
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        int top = intRect.getTop() + iM11297getYimpl;
        int iAlignPopupAxis = ContextMenuPopupPositionProviderKt.alignPopupAxis(left, (int) (j3 >> 32), (int) (j2 >> 32), layoutDirection == layoutDirection2);
        int iAlignPopupAxis2 = ContextMenuPopupPositionProviderKt.alignPopupAxis(top, (int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE), (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE), false | (!((8 & 8) == 0)));
        p<IntOffset, IntRect, ab> pVar = this.onPositionCalculated;
        long j4 = (iAlignPopupAxis << 32) | (iAlignPopupAxis2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        if (pVar != null) {
            pVar.invoke(IntOffset.m11287boximpl(jM11305unboximpl), IntRectKt.m11329IntRectVbeCjmY(j4, j3));
        }
        return j4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContextMenuPopupPositionProvider(a<IntOffset> aVar, p<? super IntOffset, ? super IntRect, ab> pVar) {
        this.anchorPositionBlock = aVar;
        this.onPositionCalculated = pVar;
    }

    private ContextMenuPopupPositionProvider(final long j2, p<? super IntOffset, ? super IntRect, ab> pVar) {
        this((a<IntOffset>) new a() { // from class: androidx.compose.foundation.contextmenu.ContextMenuPopupPositionProvider$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return IntOffset.m11287boximpl(j2);
            }
        }, pVar);
    }

    public /* synthetic */ ContextMenuPopupPositionProvider(a aVar, p pVar, int i2, o oVar) {
        this((a<IntOffset>) aVar, (p<? super IntOffset, ? super IntRect, ab>) ((i2 & 2) != 0 ? null : pVar));
    }

    public /* synthetic */ ContextMenuPopupPositionProvider(long j2, p pVar, o oVar) {
        this(j2, (p<? super IntOffset, ? super IntRect, ab>) pVar);
    }
}
