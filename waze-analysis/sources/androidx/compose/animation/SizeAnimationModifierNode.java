package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SizeAnimationModifierNode extends LayoutModifierNodeWithPassThroughIntrinsics {
    private Alignment alignment;
    private final MutableState animData$delegate;
    private AnimationSpec<IntSize> animationSpec;
    private p<? super IntSize, ? super IntSize, ab> listener;
    private long lookaheadConstraints;
    private boolean lookaheadConstraintsAvailable;
    private long lookaheadSize;

    public SizeAnimationModifierNode(AnimationSpec<IntSize> animationSpec, Alignment alignment, p<? super IntSize, ? super IntSize, ab> pVar) {
        this.animationSpec = animationSpec;
        this.alignment = alignment;
        this.listener = pVar;
        this.lookaheadSize = AnimationModifierKt.getInvalidSize();
        this.lookaheadConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.animData$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    /* renamed from: setLookaheadConstraints-BRTryo0, reason: not valid java name */
    private final void m1835setLookaheadConstraintsBRTryo0(long j2) {
        this.lookaheadConstraints = j2;
        this.lookaheadConstraintsAvailable = true;
    }

    /* renamed from: targetConstraints-ZezNO4M, reason: not valid java name */
    private final long m1836targetConstraintsZezNO4M(long j2) {
        return this.lookaheadConstraintsAvailable ? this.lookaheadConstraints : j2;
    }

    /* renamed from: animateTo-mzRDjE0, reason: not valid java name */
    public final long m1837animateTomzRDjE0(long j2) {
        AnimData animData = getAnimData();
        o oVar = null;
        if (animData != null) {
            boolean z = false;
            if (!IntSize.m11337equalsimpl0(j2, animData.getAnim().getValue().m11343unboximpl()) && !animData.getAnim().isRunning()) {
                z = true;
            }
            if (!IntSize.m11337equalsimpl0(j2, animData.getAnim().getTargetValue().m11343unboximpl()) || z) {
                animData.m1842setStartSizeozmzZPI(animData.getAnim().getValue().m11343unboximpl());
                aj.z(getCoroutineScope(), null, null, new SizeAnimationModifierNode$animateTo$data$1$1(animData, j2, this, null), 3);
            }
        } else {
            animData = new AnimData(new Animatable(IntSize.m11331boximpl(j2), VectorConvertersKt.getVectorConverter(IntSize.Companion), IntSize.m11331boximpl(InlineClassHelperKt.Uint64Low32), null, 8, null), j2, oVar);
        }
        setAnimData(animData);
        return animData.getAnim().getValue().m11343unboximpl();
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AnimData getAnimData() {
        return (AnimData) this.animData$delegate.getValue();
    }

    public final AnimationSpec<IntSize> getAnimationSpec() {
        return this.animationSpec;
    }

    public final p<IntSize, IntSize, ab> getListener() {
        return this.listener;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1732measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable placeableMo9741measureBRTryo0;
        long jM11121constrain4WqzIAM;
        if (measureScope.isLookingAhead()) {
            m1835setLookaheadConstraintsBRTryo0(j2);
            placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(j2);
        } else {
            placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(m1836targetConstraintsZezNO4M(j2));
        }
        Placeable placeable = placeableMo9741measureBRTryo0;
        long width = placeable.getWidth();
        long height = placeable.getHeight();
        boolean zIsLookingAhead = measureScope.isLookingAhead();
        long j3 = (width << 32) | (height & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        if (zIsLookingAhead) {
            this.lookaheadSize = j3;
            jM11121constrain4WqzIAM = j3;
        } else {
            long j4 = this.lookaheadSize;
            if (true != AnimationModifierKt.m1736isValidozmzZPI(j4)) {
                j4 = j3;
            }
            jM11121constrain4WqzIAM = ConstraintsKt.m11121constrain4WqzIAM(j2, m1837animateTomzRDjE0(j4));
        }
        int i2 = (int) (jM11121constrain4WqzIAM >> 32);
        int i3 = (int) (jM11121constrain4WqzIAM & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        return MeasureScope.CC.layout$default(measureScope, i2, i3, null, new SizeAnimationModifierNode$measure$2(this, j3, i2, i3, measureScope, placeable), 4, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.lookaheadSize = AnimationModifierKt.getInvalidSize();
        this.lookaheadConstraintsAvailable = false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        setAnimData(null);
    }

    public final void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public final void setAnimData(AnimData animData) {
        this.animData$delegate.setValue(animData);
    }

    public final void setAnimationSpec(AnimationSpec<IntSize> animationSpec) {
        this.animationSpec = animationSpec;
    }

    public final void setListener(p<? super IntSize, ? super IntSize, ab> pVar) {
        this.listener = pVar;
    }

    /* compiled from: WazeSource */
    public final class AnimData {
        public static final int $stable = 8;
        private final Animatable<IntSize, AnimationVector2D> anim;
        private long startSize;

        private AnimData(Animatable<IntSize, AnimationVector2D> animatable, long j2) {
            this.anim = animatable;
            this.startSize = j2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: copy-O0kMr_c$default, reason: not valid java name */
        public static /* synthetic */ AnimData m1838copyO0kMr_c$default(AnimData animData, Animatable animatable, long j2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                animatable = animData.anim;
            }
            if ((i2 & 2) != 0) {
                j2 = animData.startSize;
            }
            return animData.m1840copyO0kMr_c(animatable, j2);
        }

        public final Animatable<IntSize, AnimationVector2D> component1() {
            return this.anim;
        }

        /* renamed from: component2-YbymL2g, reason: not valid java name */
        public final long m1839component2YbymL2g() {
            return this.startSize;
        }

        /* renamed from: copy-O0kMr_c, reason: not valid java name */
        public final AnimData m1840copyO0kMr_c(Animatable<IntSize, AnimationVector2D> animatable, long j2) {
            return new AnimData(animatable, j2, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnimData)) {
                return false;
            }
            AnimData animData = (AnimData) obj;
            return x.n(this.anim, animData.anim) && IntSize.m11337equalsimpl0(this.startSize, animData.startSize);
        }

        public final Animatable<IntSize, AnimationVector2D> getAnim() {
            return this.anim;
        }

        /* renamed from: getStartSize-YbymL2g, reason: not valid java name */
        public final long m1841getStartSizeYbymL2g() {
            return this.startSize;
        }

        public int hashCode() {
            return (this.anim.hashCode() * 31) + IntSize.m11340hashCodeimpl(this.startSize);
        }

        /* renamed from: setStartSize-ozmzZPI, reason: not valid java name */
        public final void m1842setStartSizeozmzZPI(long j2) {
            this.startSize = j2;
        }

        public String toString() {
            return "AnimData(anim=" + this.anim + ", startSize=" + ((Object) IntSize.m11342toStringimpl(this.startSize)) + ')';
        }

        public /* synthetic */ AnimData(Animatable animatable, long j2, o oVar) {
            this(animatable, j2);
        }
    }

    public /* synthetic */ SizeAnimationModifierNode(AnimationSpec animationSpec, Alignment alignment, p pVar, int i2, o oVar) {
        this(animationSpec, (i2 & 2) != 0 ? Alignment.Companion.getTopStart() : alignment, (i2 & 4) != 0 ? null : pVar);
    }
}
