package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BoundsTransformDeferredAnimation {
    public static final int $stable = 8;
    private Animatable<Rect, AnimationVector4D> animatable;
    private List<LayoutCoordinates> directManipulationParents;
    private boolean isPending;
    private LookaheadAnimationVisualDebugHelper lookaheadAnimationVisualDebugHelper;
    private long targetSize = Size.Companion.m8057getUnspecifiedNHjbRc();
    private long targetOffset = Offset.Companion.m7995getUnspecifiedF1C5BW0();
    private long currentPosition = Offset.Companion.m7995getUnspecifiedF1C5BW0();
    private long currentSize = Size.Companion.m8057getUnspecifiedNHjbRc();
    private final MutableState animatedValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private long additionalOffset = Offset.Companion.m7996getZeroF1C5BW0();

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.BoundsTransformDeferredAnimation$animate$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ Animatable<Rect, AnimationVector4D> $anim;
        final /* synthetic */ BoundsTransform $boundsTransform;
        final /* synthetic */ Rect $target;
        int label;
        final /* synthetic */ BoundsTransformDeferredAnimation this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Animatable<Rect, AnimationVector4D> animatable, Rect rect, BoundsTransform boundsTransform, BoundsTransformDeferredAnimation boundsTransformDeferredAnimation, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$anim = animatable;
            this.$target = rect;
            this.$boundsTransform = boundsTransform;
            this.this$0 = boundsTransformDeferredAnimation;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass1(this.$anim, this.$target, this.$boundsTransform, this.this$0, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                Animatable<Rect, AnimationVector4D> animatable = this.$anim;
                Rect rect = this.$target;
                BoundsTransform boundsTransform = this.$boundsTransform;
                Rect currentBounds = this.this$0.getCurrentBounds();
                x.c(currentBounds);
                this.label = 1;
                if (Animatable.animateTo$default(animatable, rect, boundsTransform.createAnimationSpec(currentBounds, this.$target), null, null, this, 12, null) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.compose.ui.geometry.Rect animate(kotlinx.coroutines.af r13, androidx.compose.animation.BoundsTransform r14) {
        /*
            r12 = this;
            long r0 = r12.targetOffset
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r2 = r2 & r0
            r4 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L4d
            long r2 = r12.targetSize
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L4d
            androidx.compose.ui.geometry.Rect r6 = androidx.compose.ui.geometry.RectKt.m8020Recttz77jQw(r0, r2)
            androidx.compose.animation.core.Animatable<androidx.compose.ui.geometry.Rect, androidx.compose.animation.core.AnimationVector4D> r0 = r12.animatable
            if (r0 != 0) goto L30
            androidx.compose.animation.core.Animatable r5 = new androidx.compose.animation.core.Animatable
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.Companion
            androidx.compose.animation.core.TwoWayConverter r7 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(r0)
            r10 = 12
            r11 = 0
            r8 = 0
            r9 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0 = r5
        L30:
            r12.animatable = r0
            boolean r1 = r12.isPending
            if (r1 == 0) goto L4d
            r1 = 0
            r12.isPending = r1
            kotlinx.coroutines.ag r1 = kotlinx.coroutines.ag.f51345d
            androidx.compose.animation.BoundsTransformDeferredAnimation$animate$1 r5 = new androidx.compose.animation.BoundsTransformDeferredAnimation$animate$1
            r10 = 0
            r9 = r12
            r8 = r14
            r7 = r6
            r6 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            h.g.a.p r5 = (h.g.a.p) r5
            r12 = 1
            r14 = 0
            kotlinx.coroutines.aj.z(r13, r14, r1, r5, r12)
            goto L4e
        L4d:
            r9 = r12
        L4e:
            androidx.compose.animation.core.Animatable<androidx.compose.ui.geometry.Rect, androidx.compose.animation.core.AnimationVector4D> r12 = r9.animatable
            if (r12 == 0) goto L5c
            java.lang.Object r12 = r12.getValue()
            androidx.compose.ui.geometry.Rect r12 = (androidx.compose.ui.geometry.Rect) r12
            if (r12 != 0) goto L5b
            goto L5c
        L5b:
            return r12
        L5c:
            androidx.compose.ui.geometry.Rect$Companion r12 = androidx.compose.ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r12 = r12.getZero()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.BoundsTransformDeferredAnimation.animate(kotlinx.coroutines.af, androidx.compose.animation.BoundsTransform):androidx.compose.ui.geometry.Rect");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Rect getAnimatedValue() {
        return (Rect) this.animatedValue$delegate.getValue();
    }

    private final void setAnimatedValue(Rect rect) {
        this.animatedValue$delegate.setValue(rect);
    }

    /* renamed from: updateTargetOffset-k-4lQ0M, reason: not valid java name */
    private final void m1739updateTargetOffsetk4lQ0M(long j2) {
        if ((this.targetOffset & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats && !IntOffset.m11295equalsimpl0(IntOffsetKt.m11313roundk4lQ0M(j2), IntOffsetKt.m11313roundk4lQ0M(this.targetOffset))) {
            this.isPending = true;
        }
        this.targetOffset = j2;
        if ((this.currentPosition & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.currentPosition = j2;
        }
    }

    public final Rect getCurrentBounds() {
        long j2 = this.currentSize;
        long j3 = this.currentPosition;
        if ((9223372034707292159L & j3) == InlineClassHelperKt.UnspecifiedPackedFloats || j2 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return null;
        }
        return RectKt.m8020Recttz77jQw(j3, j2);
    }

    /* renamed from: getCurrentSize-NH-jbRc, reason: not valid java name */
    public final long m1740getCurrentSizeNHjbRc() {
        return this.currentSize;
    }

    public final LookaheadAnimationVisualDebugHelper getLookaheadAnimationVisualDebugHelper() {
        return this.lookaheadAnimationVisualDebugHelper;
    }

    /* renamed from: getTargetOffset-F1C5BW0, reason: not valid java name */
    public final long m1741getTargetOffsetF1C5BW0() {
        return this.targetOffset;
    }

    /* renamed from: getTargetSize-NH-jbRc, reason: not valid java name */
    public final long m1742getTargetSizeNHjbRc() {
        return this.targetSize;
    }

    public final Rect getValue() {
        if (isIdle()) {
            return null;
        }
        return getAnimatedValue();
    }

    public final boolean isIdle() {
        if (this.isPending) {
            return false;
        }
        Animatable<Rect, AnimationVector4D> animatable = this.animatable;
        return animatable == null || !animatable.isRunning();
    }

    /* renamed from: setCurrentSize-uvyYCjk, reason: not valid java name */
    public final void m1743setCurrentSizeuvyYCjk(long j2) {
        this.currentSize = j2;
    }

    public final void setLookaheadAnimationVisualDebugHelper(LookaheadAnimationVisualDebugHelper lookaheadAnimationVisualDebugHelper) {
        this.lookaheadAnimationVisualDebugHelper = lookaheadAnimationVisualDebugHelper;
    }

    /* renamed from: updateCurrentBounds-tz77jQw, reason: not valid java name */
    public final void m1744updateCurrentBoundstz77jQw(long j2, long j3) {
        this.currentPosition = j2;
        this.currentSize = j3;
    }

    public final void updateTargetOffsetAndAnimate(LookaheadScope lookaheadScope, Placeable.PlacementScope placementScope, af afVar, boolean z, boolean z2, BoundsTransform boundsTransform) {
        LayoutCoordinates coordinates = placementScope.getCoordinates();
        if (coordinates != null) {
            LayoutCoordinates lookaheadScopeCoordinates = lookaheadScope.getLookaheadScopeCoordinates(placementScope);
            long jM7996getZeroF1C5BW0 = Offset.Companion.m7996getZeroF1C5BW0();
            if (!z2 && z) {
                ArrayList arrayList = this.directManipulationParents;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                int i2 = 0;
                LayoutCoordinates parentCoordinates = coordinates;
                while (!x.n(lookaheadScope.toLookaheadCoordinates(parentCoordinates), lookaheadScopeCoordinates)) {
                    if (parentCoordinates.getIntroducesMotionFrameOfReference()) {
                        if (arrayList.size() == i2) {
                            arrayList.add(parentCoordinates);
                            jM7996getZeroF1C5BW0 = Offset.m7985plusMKHz9U(jM7996getZeroF1C5BW0, LayoutCoordinatesKt.positionInParent(parentCoordinates));
                        } else if (!x.n(arrayList.get(i2), parentCoordinates)) {
                            long jM7984minusMKHz9U = Offset.m7984minusMKHz9U(jM7996getZeroF1C5BW0, LayoutCoordinatesKt.positionInParent(arrayList.get(i2)));
                            arrayList.set(i2, parentCoordinates);
                            jM7996getZeroF1C5BW0 = Offset.m7985plusMKHz9U(jM7984minusMKHz9U, LayoutCoordinatesKt.positionInParent(parentCoordinates));
                        }
                        i2++;
                    }
                    parentCoordinates = parentCoordinates.getParentCoordinates();
                    if (parentCoordinates == null) {
                        break;
                    }
                }
                int size = arrayList.size() - 1;
                if (i2 <= size) {
                    while (true) {
                        jM7996getZeroF1C5BW0 = Offset.m7984minusMKHz9U(jM7996getZeroF1C5BW0, LayoutCoordinatesKt.positionInParent(arrayList.get(size)));
                        arrayList.remove(arrayList.size() - 1);
                        if (size == i2) {
                            break;
                        } else {
                            size--;
                        }
                    }
                }
                this.directManipulationParents = arrayList;
            }
            this.additionalOffset = Offset.m7985plusMKHz9U(this.additionalOffset, jM7996getZeroF1C5BW0);
            m1739updateTargetOffsetk4lQ0M(Offset.m7985plusMKHz9U(LookaheadScope.CC.m9777localLookaheadPositionOfauaQtc$default(lookaheadScope, lookaheadScopeCoordinates, coordinates, 0L, z2, 2, null), this.additionalOffset));
            setAnimatedValue(animate(afVar, boundsTransform).m8017translatek4lQ0M(this.additionalOffset ^ (-9223372034707292160L)));
        }
    }

    /* renamed from: updateTargetSize-uvyYCjk, reason: not valid java name */
    public final void m1745updateTargetSizeuvyYCjk(long j2) {
        if (this.targetSize != InlineClassHelperKt.UnspecifiedPackedFloats && !IntSize.m11337equalsimpl0(IntSizeKt.m11347roundToIntSizeuvyYCjk(j2), IntSizeKt.m11347roundToIntSizeuvyYCjk(this.targetSize))) {
            this.isPending = true;
        }
        this.targetSize = j2;
        if (this.currentSize == InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.currentSize = j2;
        }
    }
}
