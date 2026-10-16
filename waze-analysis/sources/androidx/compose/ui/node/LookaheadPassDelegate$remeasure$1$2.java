package androidx.compose.ui.node;

import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class LookaheadPassDelegate$remeasure$1$2 extends y implements l<AlignmentLinesOwner, ab> {
    public static final LookaheadPassDelegate$remeasure$1$2 INSTANCE = new LookaheadPassDelegate$remeasure$1$2();

    LookaheadPassDelegate$remeasure$1$2() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AlignmentLinesOwner alignmentLinesOwner) {
        alignmentLinesOwner.getAlignmentLines().setUsedDuringParentMeasurement$ui(false);
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(AlignmentLinesOwner alignmentLinesOwner) {
        invoke2(alignmentLinesOwner);
        return ab.f48028a;
    }
}
