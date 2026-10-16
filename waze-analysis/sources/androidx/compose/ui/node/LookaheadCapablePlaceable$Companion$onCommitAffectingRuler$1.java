package androidx.compose.ui.node;

import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1 extends y implements l<PlaceableResult, ab> {
    public static final LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1 INSTANCE = new LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1();

    LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PlaceableResult placeableResult) {
        if (placeableResult.isValidOwnerScope()) {
            placeableResult.getPlaceable().captureRulersIfNeeded(placeableResult);
        }
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(PlaceableResult placeableResult) {
        invoke2(placeableResult);
        return ab.f48028a;
    }
}
