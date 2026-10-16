package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.MotionReferencePlacementDelegate;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.FontScaling;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class Placeable implements Measured {
    public static final int $stable = 8;
    private int height;
    private int width;
    private long measuredSize = 0;
    private long measurementConstraints = PlaceableKt.DefaultConstraints;
    private long apparentToRealOffset = IntOffset.Companion.m11307getZeronOccac();

    private final void onMeasuredSizeChanged() {
        long j2 = this.measuredSize >> 32;
        long j3 = this.measurementConstraints;
        this.width = n.j((int) j2, Constraints.m11109getMinWidthimpl(j3), Constraints.m11107getMaxWidthimpl(j3));
        long j4 = this.measuredSize & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        long j5 = this.measurementConstraints;
        this.height = n.j((int) j4, Constraints.m11108getMinHeightimpl(j5), Constraints.m11106getMaxHeightimpl(j5));
        int i2 = this.width;
        long j6 = this.measuredSize;
        this.apparentToRealOffset = (((i2 - ((int) (j6 >> 32))) / 2) << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & ((r0 - ((int) (j6 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) / 2));
    }

    /* renamed from: getApparentToRealOffset-nOcc-ac, reason: not valid java name */
    protected final long m9807getApparentToRealOffsetnOccac() {
        return this.apparentToRealOffset;
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredHeight() {
        return (int) (this.measuredSize & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: getMeasuredSize-YbymL2g, reason: not valid java name */
    protected final long m9808getMeasuredSizeYbymL2g() {
        return this.measuredSize;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredWidth() {
        return (int) (this.measuredSize >> 32);
    }

    /* renamed from: getMeasurementConstraints-msEJaDk, reason: not valid java name */
    protected final long m9809getMeasurementConstraintsmsEJaDk() {
        return this.measurementConstraints;
    }

    @Override // androidx.compose.ui.layout.Measured
    public /* synthetic */ Object getParentData() {
        return null;
    }

    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: placeAt-f8xVGno, reason: not valid java name */
    public void mo9810placeAtf8xVGno(long j2, float f2, GraphicsLayer graphicsLayer) {
        mo9742placeAtf8xVGno(j2, f2, (l<? super GraphicsLayerScope, ab>) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: placeAt-f8xVGno */
    public abstract void mo9742placeAtf8xVGno(long j2, float f2, l<? super GraphicsLayerScope, ab> lVar);

    /* renamed from: setMeasuredSize-ozmzZPI, reason: not valid java name */
    protected final void m9811setMeasuredSizeozmzZPI(long j2) {
        if (IntSize.m11337equalsimpl0(this.measuredSize, j2)) {
            return;
        }
        this.measuredSize = j2;
        onMeasuredSizeChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: setMeasurementConstraints-BRTryo0, reason: not valid java name */
    public final void m9812setMeasurementConstraintsBRTryo0(long j2) {
        if (Constraints.m11100equalsimpl0(this.measurementConstraints, j2)) {
            return;
        }
        this.measurementConstraints = j2;
        onMeasuredSizeChanged();
    }

    /* compiled from: WazeSource */
    @PlacementScopeMarker
    public abstract class PlacementScope implements Density {
        public static final int $stable = 0;
        private boolean motionFrameOfReferencePlacement;

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final void handleMotionFrameOfReferencePlacement(Placeable placeable) {
            if (placeable instanceof MotionReferencePlacementDelegate) {
                ((MotionReferencePlacementDelegate) placeable).updatePlacedUnderMotionFrameOfReference(this.motionFrameOfReferencePlacement);
            }
        }

        public static /* synthetic */ void place$default(PlacementScope placementScope, Placeable placeable, int i2, int i3, float f2, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i4 & 4) != 0) {
                f2 = 0.0f;
            }
            placementScope.place(placeable, i2, i3, f2);
        }

        /* renamed from: place-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m9813place70tqf50$default(PlacementScope placementScope, Placeable placeable, long j2, float f2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i2 & 2) != 0) {
                f2 = 0.0f;
            }
            placementScope.m9819place70tqf50(placeable, j2, f2);
        }

        public static /* synthetic */ void placeRelative$default(PlacementScope placementScope, Placeable placeable, int i2, int i3, float f2, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i4 & 4) != 0) {
                f2 = 0.0f;
            }
            placementScope.placeRelative(placeable, i2, i3, f2);
        }

        /* renamed from: placeRelative-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m9814placeRelative70tqf50$default(PlacementScope placementScope, Placeable placeable, long j2, float f2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i2 & 2) != 0) {
                f2 = 0.0f;
            }
            placementScope.m9824placeRelative70tqf50(placeable, j2, f2);
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i2, int i3, float f2, l lVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i4 & 4) != 0) {
                f2 = 0.0f;
            }
            float f3 = f2;
            if ((i4 & 8) != 0) {
                lVar = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeRelativeWithLayer(placeable, i2, i3, f3, (l<? super GraphicsLayerScope, ab>) lVar);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m9815placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j2, float f2, l lVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i2 & 2) != 0) {
                f2 = 0.0f;
            }
            float f3 = f2;
            if ((i2 & 4) != 0) {
                lVar = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m9825placeRelativeWithLayeraW9wM(placeable, j2, f3, (l<? super GraphicsLayerScope, ab>) lVar);
        }

        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i2, int i3, float f2, l lVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i4 & 4) != 0) {
                f2 = 0.0f;
            }
            float f3 = f2;
            if ((i4 & 8) != 0) {
                lVar = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeWithLayer(placeable, i2, i3, f3, (l<? super GraphicsLayerScope, ab>) lVar);
        }

        /* renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m9817placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j2, float f2, l lVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i2 & 2) != 0) {
                f2 = 0.0f;
            }
            float f3 = f2;
            if ((i2 & 4) != 0) {
                lVar = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m9827placeWithLayeraW9wM(placeable, j2, f3, (l<? super GraphicsLayerScope, ab>) lVar);
        }

        public LayoutCoordinates getCoordinates() {
            return null;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return 1.0f;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return 1.0f;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract LayoutDirection getParentLayoutDirection();

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract int getParentWidth();

        public final void place(Placeable placeable, int i2, int i3, float f2) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo9742placeAtf8xVGno(IntOffset.m11300plusqkQi6aY((i3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (i2 << 32), placeable.apparentToRealOffset), f2, (l<? super GraphicsLayerScope, ab>) null);
        }

        /* renamed from: place-70tqf50, reason: not valid java name */
        public final void m9819place70tqf50(Placeable placeable, long j2, float f2) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo9742placeAtf8xVGno(IntOffset.m11300plusqkQi6aY(j2, placeable.apparentToRealOffset), f2, (l<? super GraphicsLayerScope, ab>) null);
        }

        /* renamed from: placeApparentToRealOffset-aW-9-wM$ui, reason: not valid java name */
        public final void m9820placeApparentToRealOffsetaW9wM$ui(Placeable placeable, long j2, float f2, GraphicsLayer graphicsLayer) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo9810placeAtf8xVGno(IntOffset.m11300plusqkQi6aY(j2, placeable.apparentToRealOffset), f2, graphicsLayer);
        }

        /* renamed from: placeAutoMirrored-aW-9-wM$ui, reason: not valid java name */
        public final void m9822placeAutoMirroredaW9wM$ui(Placeable placeable, long j2, float f2, GraphicsLayer graphicsLayer) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo9810placeAtf8xVGno(IntOffset.m11300plusqkQi6aY(j2, placeable.apparentToRealOffset), f2, graphicsLayer);
                return;
            }
            int parentWidth = getParentWidth() - placeable.getWidth();
            int iM11296getXimpl = IntOffset.m11296getXimpl(j2);
            int iM11297getYimpl = IntOffset.m11297getYimpl(j2);
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo9810placeAtf8xVGno(IntOffset.m11300plusqkQi6aY((iM11297getYimpl & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | ((parentWidth - iM11296getXimpl) << 32), placeable.apparentToRealOffset), f2, graphicsLayer);
        }

        public final void placeRelative(Placeable placeable, int i2, int i3, float f2) {
            long j2 = (i3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (i2 << 32);
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo9742placeAtf8xVGno(IntOffset.m11300plusqkQi6aY(j2, placeable.apparentToRealOffset), f2, (l<? super GraphicsLayerScope, ab>) null);
                return;
            }
            int parentWidth = getParentWidth() - placeable.getWidth();
            int iM11296getXimpl = IntOffset.m11296getXimpl(j2);
            long jM11297getYimpl = IntOffset.m11297getYimpl(j2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo9742placeAtf8xVGno(IntOffset.m11300plusqkQi6aY(jM11297getYimpl | ((parentWidth - iM11296getXimpl) << 32), placeable.apparentToRealOffset), f2, (l<? super GraphicsLayerScope, ab>) null);
        }

        /* renamed from: placeRelative-70tqf50, reason: not valid java name */
        public final void m9824placeRelative70tqf50(Placeable placeable, long j2, float f2) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo9742placeAtf8xVGno(IntOffset.m11300plusqkQi6aY(j2, placeable.apparentToRealOffset), f2, (l<? super GraphicsLayerScope, ab>) null);
                return;
            }
            int parentWidth = getParentWidth() - placeable.getWidth();
            int iM11296getXimpl = IntOffset.m11296getXimpl(j2);
            int iM11297getYimpl = IntOffset.m11297getYimpl(j2);
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo9742placeAtf8xVGno(IntOffset.m11300plusqkQi6aY((iM11297getYimpl & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | ((parentWidth - iM11296getXimpl) << 32), placeable.apparentToRealOffset), f2, (l<? super GraphicsLayerScope, ab>) null);
        }

        public final void placeRelativeWithLayer(Placeable placeable, int i2, int i3, float f2, l<? super GraphicsLayerScope, ab> lVar) {
            long j2 = (i3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (i2 << 32);
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo9742placeAtf8xVGno(IntOffset.m11300plusqkQi6aY(j2, placeable.apparentToRealOffset), f2, lVar);
                return;
            }
            int parentWidth = getParentWidth() - placeable.getWidth();
            int iM11296getXimpl = IntOffset.m11296getXimpl(j2);
            long jM11297getYimpl = IntOffset.m11297getYimpl(j2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo9742placeAtf8xVGno(IntOffset.m11300plusqkQi6aY(jM11297getYimpl | ((parentWidth - iM11296getXimpl) << 32), placeable.apparentToRealOffset), f2, lVar);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m9825placeRelativeWithLayeraW9wM(Placeable placeable, long j2, float f2, l<? super GraphicsLayerScope, ab> lVar) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo9742placeAtf8xVGno(IntOffset.m11300plusqkQi6aY(j2, placeable.apparentToRealOffset), f2, lVar);
                return;
            }
            int parentWidth = getParentWidth() - placeable.getWidth();
            int iM11296getXimpl = IntOffset.m11296getXimpl(j2);
            int iM11297getYimpl = IntOffset.m11297getYimpl(j2);
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo9742placeAtf8xVGno(IntOffset.m11300plusqkQi6aY((iM11297getYimpl & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | ((parentWidth - iM11296getXimpl) << 32), placeable.apparentToRealOffset), f2, lVar);
        }

        public final void placeWithLayer(Placeable placeable, int i2, int i3, float f2, l<? super GraphicsLayerScope, ab> lVar) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo9742placeAtf8xVGno(IntOffset.m11300plusqkQi6aY((i3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (i2 << 32), placeable.apparentToRealOffset), f2, lVar);
        }

        /* renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m9827placeWithLayeraW9wM(Placeable placeable, long j2, float f2, l<? super GraphicsLayerScope, ab> lVar) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo9742placeAtf8xVGno(IntOffset.m11300plusqkQi6aY(j2, placeable.apparentToRealOffset), f2, lVar);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx--R2X_6o */
        public /* synthetic */ int mo2120roundToPxR2X_6o(long j2) {
            return Density.CC.m11128$default$roundToPxR2X_6o(this, j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx-0680j_4 */
        public /* synthetic */ int mo2121roundToPx0680j_4(float f2) {
            return Density.CC.m11129$default$roundToPx0680j_4(this, f2);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toDp-GaN1DYA */
        public /* synthetic */ float mo2122toDpGaN1DYA(long j2) {
            return FontScaling.CC.m11273$default$toDpGaN1DYA(this, j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public /* synthetic */ float mo2123toDpu2uoSUM(float f2) {
            return Density.CC.m11130$default$toDpu2uoSUM(this, f2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDpSize-k-rfVVM */
        public /* synthetic */ long mo2125toDpSizekrfVVM(long j2) {
            return Density.CC.m11132$default$toDpSizekrfVVM(this, j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx--R2X_6o */
        public /* synthetic */ float mo2126toPxR2X_6o(long j2) {
            return Density.CC.m11133$default$toPxR2X_6o(this, j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx-0680j_4 */
        public /* synthetic */ float mo2127toPx0680j_4(float f2) {
            return Density.CC.m11134$default$toPx0680j_4(this, f2);
        }

        @Override // androidx.compose.ui.unit.Density
        public /* synthetic */ Rect toRect(DpRect dpRect) {
            return Density.CC.$default$toRect(this, dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSize-XkaWNTQ */
        public /* synthetic */ long mo2128toSizeXkaWNTQ(long j2) {
            return Density.CC.m11135$default$toSizeXkaWNTQ(this, j2);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toSp-0xMU5do */
        public /* synthetic */ long mo2129toSp0xMU5do(float f2) {
            return FontScaling.CC.m11274$default$toSp0xMU5do(this, f2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public /* synthetic */ long mo2130toSpkPz2Gy4(float f2) {
            return Density.CC.m11136$default$toSpkPz2Gy4(this, f2);
        }

        public final void withMotionFrameOfReferencePlacement(l<? super PlacementScope, ab> lVar) {
            this.motionFrameOfReferencePlacement = true;
            lVar.invoke(this);
            this.motionFrameOfReferencePlacement = false;
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public /* synthetic */ float mo2124toDpu2uoSUM(int i2) {
            return Density.CC.m11131$default$toDpu2uoSUM((Density) this, i2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public /* synthetic */ long mo2131toSpkPz2Gy4(int i2) {
            return Density.CC.m11137$default$toSpkPz2Gy4((Density) this, i2);
        }

        /* renamed from: placeApparentToRealOffset-aW-9-wM$ui, reason: not valid java name */
        public final void m9821placeApparentToRealOffsetaW9wM$ui(Placeable placeable, long j2, float f2, l<? super GraphicsLayerScope, ab> lVar) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo9742placeAtf8xVGno(IntOffset.m11300plusqkQi6aY(j2, placeable.apparentToRealOffset), f2, lVar);
        }

        /* renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m9828placeWithLayeraW9wM(Placeable placeable, long j2, GraphicsLayer graphicsLayer, float f2) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo9810placeAtf8xVGno(IntOffset.m11300plusqkQi6aY(j2, placeable.apparentToRealOffset), f2, graphicsLayer);
        }

        public final void placeWithLayer(Placeable placeable, int i2, int i3, GraphicsLayer graphicsLayer, float f2) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo9810placeAtf8xVGno(IntOffset.m11300plusqkQi6aY((i3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (i2 << 32), placeable.apparentToRealOffset), f2, graphicsLayer);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m9816placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j2, GraphicsLayer graphicsLayer, float f2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i2 & 4) != 0) {
                f2 = 0.0f;
            }
            placementScope.m9826placeRelativeWithLayeraW9wM(placeable, j2, graphicsLayer, f2);
        }

        /* renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m9818placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j2, GraphicsLayer graphicsLayer, float f2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i2 & 4) != 0) {
                f2 = 0.0f;
            }
            placementScope.m9828placeWithLayeraW9wM(placeable, j2, graphicsLayer, f2);
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i2, int i3, GraphicsLayer graphicsLayer, float f2, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i4 & 8) != 0) {
                f2 = 0.0f;
            }
            placementScope.placeRelativeWithLayer(placeable, i2, i3, graphicsLayer, f2);
        }

        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i2, int i3, GraphicsLayer graphicsLayer, float f2, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i4 & 8) != 0) {
                f2 = 0.0f;
            }
            placementScope.placeWithLayer(placeable, i2, i3, graphicsLayer, f2);
        }

        public float current(Ruler ruler, float f2) {
            return f2;
        }

        /* renamed from: placeAutoMirrored-aW-9-wM$ui, reason: not valid java name */
        public final void m9823placeAutoMirroredaW9wM$ui(Placeable placeable, long j2, float f2, l<? super GraphicsLayerScope, ab> lVar) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo9742placeAtf8xVGno(IntOffset.m11300plusqkQi6aY(j2, placeable.apparentToRealOffset), f2, lVar);
                return;
            }
            int parentWidth = getParentWidth() - placeable.getWidth();
            int iM11296getXimpl = IntOffset.m11296getXimpl(j2);
            int iM11297getYimpl = IntOffset.m11297getYimpl(j2);
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo9742placeAtf8xVGno(IntOffset.m11300plusqkQi6aY((iM11297getYimpl & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | ((parentWidth - iM11296getXimpl) << 32), placeable.apparentToRealOffset), f2, lVar);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m9826placeRelativeWithLayeraW9wM(Placeable placeable, long j2, GraphicsLayer graphicsLayer, float f2) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo9810placeAtf8xVGno(IntOffset.m11300plusqkQi6aY(j2, placeable.apparentToRealOffset), f2, graphicsLayer);
                return;
            }
            int parentWidth = getParentWidth() - placeable.getWidth();
            int iM11296getXimpl = IntOffset.m11296getXimpl(j2);
            int iM11297getYimpl = IntOffset.m11297getYimpl(j2);
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo9810placeAtf8xVGno(IntOffset.m11300plusqkQi6aY((iM11297getYimpl & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | ((parentWidth - iM11296getXimpl) << 32), placeable.apparentToRealOffset), f2, graphicsLayer);
        }

        public final void placeRelativeWithLayer(Placeable placeable, int i2, int i3, GraphicsLayer graphicsLayer, float f2) {
            long j2 = (i3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (i2 << 32);
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo9810placeAtf8xVGno(IntOffset.m11300plusqkQi6aY(j2, placeable.apparentToRealOffset), f2, graphicsLayer);
                return;
            }
            int parentWidth = getParentWidth() - placeable.getWidth();
            int iM11296getXimpl = IntOffset.m11296getXimpl(j2);
            long jM11297getYimpl = IntOffset.m11297getYimpl(j2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo9810placeAtf8xVGno(IntOffset.m11300plusqkQi6aY(jM11297getYimpl | ((parentWidth - iM11296getXimpl) << 32), placeable.apparentToRealOffset), f2, graphicsLayer);
        }
    }
}
