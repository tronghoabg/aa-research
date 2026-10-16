package androidx.compose.ui.node;

import androidx.compose.ui.layout.RulerScope;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class LookaheadCapablePlaceable$captureRulers$1 extends y implements a<ab> {
    final /* synthetic */ PlaceableResult $placeableResult;
    final /* synthetic */ long $positionOnScreen;
    final /* synthetic */ long $size;
    final /* synthetic */ LookaheadCapablePlaceable this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LookaheadCapablePlaceable$captureRulers$1(LookaheadCapablePlaceable lookaheadCapablePlaceable, long j2, long j3, PlaceableResult placeableResult) {
        super(0);
        this.this$0 = lookaheadCapablePlaceable;
        this.$positionOnScreen = j2;
        this.$size = j3;
        this.$placeableResult = placeableResult;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.getRulerScope().setCoordinatesAccessed(false);
        this.this$0.getRulerScope().m9998setPositionOnScreengyyYBs(this.$positionOnScreen);
        this.this$0.getRulerScope().m9999setSizeozmzZPI(this.$size);
        l<RulerScope, ab> rulers = this.$placeableResult.getResult().getRulers();
        if (rulers != null) {
            rulers.invoke(this.this$0.getRulerScope());
        }
    }

    @Override // h.g.a.a
    public /* bridge */ /* synthetic */ ab invoke() {
        invoke2();
        return ab.f48028a;
    }
}
