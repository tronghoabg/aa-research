package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;
import h.g.a.q;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1 extends y implements q<MeasureScope, Measurable, Constraints, MeasureResult> {
    final /* synthetic */ Transition $transition;
    final /* synthetic */ l $visible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1(l lVar, Transition transition) {
        super(3);
        this.$visible = lVar;
        this.$transition = transition;
    }

    @Override // h.g.a.q
    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        return m1735invoke3p2s80s(measureScope, measurable, constraints.m11113unboximpl());
    }

    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final MeasureResult m1735invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        long width;
        Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(j2);
        if (!measureScope.isLookingAhead() || ((Boolean) this.$visible.invoke(this.$transition.getTargetState())).booleanValue()) {
            width = (placeableMo9741measureBRTryo0.getWidth() << 32) | (placeableMo9741measureBRTryo0.getHeight() & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        } else {
            width = IntSize.Companion.m11344getZeroYbymL2g();
        }
        return MeasureScope.CC.layout$default(measureScope, (int) (width >> 32), (int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & width), null, new AnonymousClass1(placeableMo9741measureBRTryo0), 4, null);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements l<Placeable.PlacementScope, ab> {
        final /* synthetic */ Placeable $placeable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Placeable placeable) {
            super(1);
            this.$placeable = placeable;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope.place$default(placementScope, this.$placeable, 0, 0, 0.0f, 4, null);
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ ab invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return ab.f48028a;
        }
    }
}
