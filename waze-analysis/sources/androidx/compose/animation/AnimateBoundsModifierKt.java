package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.muxer.MuxerUtil;
import h.g.a.p;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AnimateBoundsModifierKt {
    private static final BoundsTransform DefaultBoundsTransform = new BoundsTransform() { // from class: androidx.compose.animation.AnimateBoundsModifierKt$$ExternalSyntheticLambda0
        @Override // androidx.compose.animation.BoundsTransform
        public final FiniteAnimationSpec createAnimationSpec(Rect rect, Rect rect2) {
            return AnimationSpecKt.spring(1.0f, 400.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion));
        }
    };

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.AnimateBoundsModifierKt$animateBounds$2, reason: invalid class name */
    final class AnonymousClass2 extends y implements p<IntSize, Constraints, Constraints> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(2);
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ Constraints invoke(IntSize intSize, Constraints constraints) {
            return Constraints.m11094boximpl(m1701invoke2pbfIzA(intSize.m11343unboximpl(), constraints.m11113unboximpl()));
        }

        /* renamed from: invoke-2pbfIzA, reason: not valid java name */
        public final long m1701invoke2pbfIzA(long j2, long j3) {
            return Constraints.Companion.m11117fixedJhjzzOo((int) (j2 >> 32), (int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2));
        }
    }

    public static final Modifier animateBounds(Modifier modifier, LookaheadScope lookaheadScope, Modifier modifier2, BoundsTransform boundsTransform, boolean z) {
        return modifier.then(new BoundsAnimationElement(lookaheadScope, boundsTransform, AnonymousClass1.INSTANCE, z)).then(modifier2).then(new BoundsAnimationElement(lookaheadScope, boundsTransform, AnonymousClass2.INSTANCE, z));
    }

    public static /* synthetic */ Modifier animateBounds$default(Modifier modifier, LookaheadScope lookaheadScope, Modifier modifier2, BoundsTransform boundsTransform, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            modifier2 = Modifier.Companion;
        }
        if ((i2 & 4) != 0) {
            boundsTransform = DefaultBoundsTransform;
        }
        return animateBounds(modifier, lookaheadScope, modifier2, boundsTransform, z & ((i2 & 8) == 0));
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.AnimateBoundsModifierKt$animateBounds$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements p<IntSize, Constraints, Constraints> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2);
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ Constraints invoke(IntSize intSize, Constraints constraints) {
            intSize.m11343unboximpl();
            return Constraints.m11094boximpl(constraints.m11113unboximpl());
        }

        /* renamed from: invoke-2pbfIzA, reason: not valid java name */
        public final long m1700invoke2pbfIzA(long j2, long j3) {
            return j3;
        }
    }
}
