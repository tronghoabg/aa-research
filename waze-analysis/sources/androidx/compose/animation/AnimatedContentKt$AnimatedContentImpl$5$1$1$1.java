package androidx.compose.animation;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import h.ab;
import h.g.a.l;
import h.g.a.q;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AnimatedContentKt$AnimatedContentImpl$5$1$1$1 extends y implements q<MeasureScope, Measurable, Constraints, MeasureResult> {
    final /* synthetic */ ContentTransform $specOnEnter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnimatedContentKt$AnimatedContentImpl$5$1$1$1(ContentTransform contentTransform) {
        super(3);
        this.$specOnEnter = contentTransform;
    }

    @Override // h.g.a.q
    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        return m1702invoke3p2s80s(measureScope, measurable, constraints.m11113unboximpl());
    }

    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final MeasureResult m1702invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(j2);
        return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo0.getWidth(), placeableMo9741measureBRTryo0.getHeight(), null, new AnonymousClass1(placeableMo9741measureBRTryo0, this.$specOnEnter), 4, null);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContentImpl$5$1$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements l<Placeable.PlacementScope, ab> {
        final /* synthetic */ Placeable $placeable;
        final /* synthetic */ ContentTransform $specOnEnter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Placeable placeable, ContentTransform contentTransform) {
            super(1);
            this.$placeable = placeable;
            this.$specOnEnter = contentTransform;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Placeable.PlacementScope placementScope) {
            placementScope.place(this.$placeable, 0, 0, this.$specOnEnter.getTargetContentZIndex());
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ ab invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return ab.f48028a;
        }
    }
}
