package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSetKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.a;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimator<T extends LazyLayoutMeasuredItem> {
    public static final int $stable = 8;
    private DrawModifierNode displayingNode;
    private int firstVisibleIndex;
    private LazyLayoutKeyIndexMap keyIndexMap;
    private final MutableScatterMap<Object, LazyLayoutItemAnimator<T>.ItemInfo> keyToItemInfoMap = ScatterMapKt.mutableScatterMapOf();
    private final MutableScatterSet<Object> movingAwayKeys = ScatterSetKt.mutableScatterSetOf();
    private final List<T> movingInFromStartBound = new ArrayList();
    private final List<T> movingInFromEndBound = new ArrayList();
    private final List<T> movingAwayToStartBound = new ArrayList();
    private final List<T> movingAwayToEndBound = new ArrayList();
    private final List<LazyLayoutItemAnimation> disappearingItems = new ArrayList();

    /* compiled from: WazeSource */
    final class ItemInfo {
        private Constraints constraints;
        private int crossAxisOffset;
        private int lane;
        private int layoutMaxOffset;
        private int layoutMinOffset;
        private LazyLayoutItemAnimation[] animations = LazyLayoutItemAnimatorKt.EmptyArray;
        private int span = 1;

        public ItemInfo() {
        }

        private final boolean isRunningPlacement() {
            for (LazyLayoutItemAnimation lazyLayoutItemAnimation : this.animations) {
                if (lazyLayoutItemAnimation != null && lazyLayoutItemAnimation.isRunningMovingAwayAnimation()) {
                    return true;
                }
            }
            return false;
        }

        public static /* synthetic */ void updateAnimation$default(ItemInfo itemInfo, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, af afVar, GraphicsContext graphicsContext, int i2, int i3, boolean z, int i4, int i5, Object obj) {
            itemInfo.updateAnimation(lazyLayoutMeasuredItem, afVar, graphicsContext, i2, i3, z, (i5 & 64) != 0 ? LazyLayoutItemAnimator.this.crossAxisOffset(lazyLayoutMeasuredItem, z) : i4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ab updateAnimation$lambda$0$0(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
            DrawModifierNode displayingNode = lazyLayoutItemAnimator.getDisplayingNode();
            if (displayingNode != null) {
                DrawModifierNodeKt.invalidateDraw(displayingNode);
            }
            return ab.f48028a;
        }

        public final LazyLayoutItemAnimation[] getAnimations() {
            return this.animations;
        }

        /* renamed from: getConstraints-DWUhwKw, reason: not valid java name */
        public final Constraints m2947getConstraintsDWUhwKw() {
            return this.constraints;
        }

        public final int getCrossAxisOffset() {
            return this.crossAxisOffset;
        }

        public final int getLane() {
            return this.lane;
        }

        public final int getLayoutMaxOffset() {
            return this.layoutMaxOffset;
        }

        public final int getLayoutMinOffset() {
            return this.layoutMinOffset;
        }

        public final int getSpan() {
            return this.span;
        }

        /* renamed from: setConstraints-_Sx5XlM, reason: not valid java name */
        public final void m2948setConstraints_Sx5XlM(Constraints constraints) {
            this.constraints = constraints;
        }

        public final void setCrossAxisOffset(int i2) {
            this.crossAxisOffset = i2;
        }

        public final void setLane(int i2) {
            this.lane = i2;
        }

        public final void setSpan(int i2) {
            this.span = i2;
        }

        public final void updateAnimation(T t, af afVar, GraphicsContext graphicsContext, int i2, int i3, boolean z, int i4) {
            LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr;
            if (!isRunningPlacement()) {
                this.layoutMinOffset = i2;
                this.layoutMaxOffset = i3;
            }
            int placeablesCount = LazyLayoutMeasuredItemKt.getPlaceablesCount(t);
            int length = this.animations.length;
            while (true) {
                lazyLayoutItemAnimationArr = this.animations;
                if (placeablesCount >= length) {
                    break;
                }
                LazyLayoutItemAnimation lazyLayoutItemAnimation = lazyLayoutItemAnimationArr[placeablesCount];
                if (lazyLayoutItemAnimation != null) {
                    lazyLayoutItemAnimation.release();
                }
                placeablesCount++;
            }
            if (lazyLayoutItemAnimationArr.length != LazyLayoutMeasuredItemKt.getPlaceablesCount(t)) {
                Object[] objArrCopyOf = Arrays.copyOf(this.animations, LazyLayoutMeasuredItemKt.getPlaceablesCount(t));
                x.e(objArrCopyOf, "copyOf(...)");
                this.animations = (LazyLayoutItemAnimation[]) objArrCopyOf;
            }
            this.constraints = Constraints.m11094boximpl(t.mo2887getConstraintsmsEJaDk());
            this.crossAxisOffset = i4;
            this.lane = t.getLane();
            this.span = t.getSpan();
            int placeablesCount2 = LazyLayoutMeasuredItemKt.getPlaceablesCount(t);
            final LazyLayoutItemAnimator<T> lazyLayoutItemAnimator = LazyLayoutItemAnimator.this;
            for (int i5 = 0; i5 < placeablesCount2; i5++) {
                LazyLayoutAnimationSpecsNode specs = LazyLayoutItemAnimatorKt.getSpecs(LazyLayoutMeasuredItemKt.getParentData(t, i5));
                LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr2 = this.animations;
                if (specs == null) {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation2 = lazyLayoutItemAnimationArr2[i5];
                    if (lazyLayoutItemAnimation2 != null) {
                        lazyLayoutItemAnimation2.release();
                    }
                    this.animations[i5] = null;
                } else {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation3 = lazyLayoutItemAnimationArr2[i5];
                    if (lazyLayoutItemAnimation3 == null) {
                        lazyLayoutItemAnimation3 = new LazyLayoutItemAnimation(afVar, graphicsContext, new a() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$ItemInfo$$ExternalSyntheticLambda0
                            @Override // h.g.a.a
                            public final Object invoke() {
                                return LazyLayoutItemAnimator.ItemInfo.updateAnimation$lambda$0$0(lazyLayoutItemAnimator);
                            }
                        });
                        this.animations[i5] = lazyLayoutItemAnimation3;
                    }
                    lazyLayoutItemAnimation3.setFadeInSpec(specs.getFadeInSpec());
                    lazyLayoutItemAnimation3.setPlacementSpec(specs.getPlacementSpec());
                    lazyLayoutItemAnimation3.setFadeOutSpec(specs.getFadeOutSpec());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int crossAxisOffset(LazyLayoutMeasuredItem lazyLayoutMeasuredItem, boolean z) {
        long jMo2888getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo2888getOffsetBjo55l4(0);
        return !z ? IntOffset.m11297getYimpl(jMo2888getOffsetBjo55l4) : IntOffset.m11296getXimpl(jMo2888getOffsetBjo55l4);
    }

    private final boolean getHasAnimations(T t) {
        int placeablesCount = LazyLayoutMeasuredItemKt.getPlaceablesCount(t);
        for (int i2 = 0; i2 < placeablesCount; i2++) {
            if (LazyLayoutItemAnimatorKt.getSpecs(LazyLayoutMeasuredItemKt.getParentData(t, i2)) != null) {
                return true;
            }
        }
        return false;
    }

    private final void initializeAnimation(T t, int i2, LazyLayoutItemAnimator<T>.ItemInfo itemInfo, boolean z) {
        int i3 = 0;
        long jMo2888getOffsetBjo55l4 = t.mo2888getOffsetBjo55l4(0);
        long jM11292copyiSbpLlY$default = z ? IntOffset.m11292copyiSbpLlY$default(jMo2888getOffsetBjo55l4, 0, i2, 1, null) : IntOffset.m11292copyiSbpLlY$default(jMo2888getOffsetBjo55l4, i2, 0, 2, null);
        LazyLayoutItemAnimation[] animations = itemInfo.getAnimations();
        int length = animations.length;
        int i4 = 0;
        while (i3 < length) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = animations[i3];
            int i5 = i4 + 1;
            if (lazyLayoutItemAnimation != null) {
                lazyLayoutItemAnimation.m2943setTargetOffsetgyyYBs(IntOffset.m11300plusqkQi6aY(jM11292copyiSbpLlY$default, IntOffset.m11299minusqkQi6aY(t.mo2888getOffsetBjo55l4(i4), jMo2888getOffsetBjo55l4)));
            }
            i3++;
            i4 = i5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void initializeAnimation$default(LazyLayoutItemAnimator lazyLayoutItemAnimator, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, int i2, ItemInfo itemInfo, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            LazyLayoutItemAnimator<T>.ItemInfo itemInfo2 = lazyLayoutItemAnimator.keyToItemInfoMap.get(lazyLayoutMeasuredItem.getKey());
            if (itemInfo2 == null) {
                x.g();
            }
            itemInfo = itemInfo2;
        }
        lazyLayoutItemAnimator.initializeAnimation(lazyLayoutMeasuredItem, i2, itemInfo, z);
    }

    private final int mainAxisOffset(LazyLayoutMeasuredItem lazyLayoutMeasuredItem, boolean z) {
        long jMo2888getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo2888getOffsetBjo55l4(0);
        return z ? IntOffset.m11297getYimpl(jMo2888getOffsetBjo55l4) : IntOffset.m11296getXimpl(jMo2888getOffsetBjo55l4);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void releaseAnimations() {
        /*
            r15 = this;
            androidx.collection.MutableScatterMap<java.lang.Object, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<T>$ItemInfo> r0 = r15.keyToItemInfoMap
            boolean r0 = r0.isNotEmpty()
            if (r0 == 0) goto L65
            androidx.collection.MutableScatterMap<java.lang.Object, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<T>$ItemInfo> r0 = r15.keyToItemInfoMap
            androidx.collection.ScatterMap r0 = (androidx.collection.ScatterMap) r0
            java.lang.Object[] r1 = r0.values
            long[] r0 = r0.metadata
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L60
            r3 = 0
            r4 = r3
        L17:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L5b
            int r7 = r4 - r2
            r8 = r3
        L2a:
            int r9 = ~r7
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            if (r8 >= r9) goto L59
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r5
            r13 = 128(0x80, double:6.3E-322)
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 >= 0) goto L55
            int r9 = r4 << 3
            int r9 = r9 + r8
            r9 = r1[r9]
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$ItemInfo r9 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.ItemInfo) r9
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation[] r9 = r9.getAnimations()
            int r11 = r9.length
            r12 = r3
        L49:
            if (r12 >= r11) goto L55
            r13 = r9[r12]
            if (r13 == 0) goto L52
            r13.release()
        L52:
            int r12 = r12 + 1
            goto L49
        L55:
            long r5 = r5 >> r10
            int r8 = r8 + 1
            goto L2a
        L59:
            if (r9 != r10) goto L60
        L5b:
            if (r4 == r2) goto L60
            int r4 = r4 + 1
            goto L17
        L60:
            androidx.collection.MutableScatterMap<java.lang.Object, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<T>$ItemInfo> r15 = r15.keyToItemInfoMap
            r15.clear()
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.releaseAnimations():void");
    }

    private final void removeInfoForKey(Object obj) {
        LazyLayoutItemAnimation[] animations;
        LazyLayoutItemAnimator<T>.ItemInfo itemInfoRemove = this.keyToItemInfoMap.remove(obj);
        if (itemInfoRemove == null || (animations = itemInfoRemove.getAnimations()) == null) {
            return;
        }
        for (LazyLayoutItemAnimation lazyLayoutItemAnimation : animations) {
            if (lazyLayoutItemAnimation != null) {
                lazyLayoutItemAnimation.release();
            }
        }
    }

    private final void startPlacementAnimationsIfNeeded(T t, boolean z) {
        LazyLayoutItemAnimator<T>.ItemInfo itemInfo = this.keyToItemInfoMap.get(t.getKey());
        if (itemInfo == null) {
            x.g();
        }
        LazyLayoutItemAnimation[] animations = itemInfo.getAnimations();
        int length = animations.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = animations[i2];
            int i4 = i3 + 1;
            if (lazyLayoutItemAnimation != null) {
                long jMo2888getOffsetBjo55l4 = t.mo2888getOffsetBjo55l4(i3);
                long jM2940getTargetOffsetnOccac = lazyLayoutItemAnimation.m2940getTargetOffsetnOccac();
                if (!IntOffset.m11295equalsimpl0(jM2940getTargetOffsetnOccac, LazyLayoutItemAnimation.Companion.m2944getNotInitializednOccac()) && !IntOffset.m11295equalsimpl0(jM2940getTargetOffsetnOccac, jMo2888getOffsetBjo55l4)) {
                    lazyLayoutItemAnimation.m2935animatePlacementDeltaar5cAso(IntOffset.m11299minusqkQi6aY(jMo2888getOffsetBjo55l4, jM2940getTargetOffsetnOccac), z);
                }
                lazyLayoutItemAnimation.m2943setTargetOffsetgyyYBs(jMo2888getOffsetBjo55l4);
            }
            i2++;
            i3 = i4;
        }
    }

    static /* synthetic */ void startPlacementAnimationsIfNeeded$default(LazyLayoutItemAnimator lazyLayoutItemAnimator, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, boolean z, int i2, Object obj) {
        lazyLayoutItemAnimator.startPlacementAnimationsIfNeeded(lazyLayoutMeasuredItem, z & ((i2 & 2) == 0));
    }

    private final int updateAndReturnOffsetFor(int[] iArr, T t, boolean z) {
        int lane = t.getLane();
        int span = t.getSpan() + lane;
        int iMax = 0;
        while (lane < span) {
            int iMainAxisSizeWithSpacings = iArr[lane] + LazyLayoutMeasuredItemKt.mainAxisSizeWithSpacings(t, z);
            iArr[lane] = iMainAxisSizeWithSpacings;
            iMax = Math.max(iMax, iMainAxisSizeWithSpacings);
            lane++;
        }
        return iMax;
    }

    public final LazyLayoutItemAnimation getAnimation(Object obj, int i2) {
        LazyLayoutItemAnimation[] animations;
        LazyLayoutItemAnimator<T>.ItemInfo itemInfo = this.keyToItemInfoMap.get(obj);
        if (itemInfo == null || (animations = itemInfo.getAnimations()) == null) {
            return null;
        }
        return animations[i2];
    }

    public final DrawModifierNode getDisplayingNode() {
        return this.displayingNode;
    }

    /* renamed from: getMinSizeToFitDisappearingItems-YbymL2g, reason: not valid java name */
    public final long m2945getMinSizeToFitDisappearingItemsYbymL2g() {
        long jM11344getZeroYbymL2g = IntSize.Companion.m11344getZeroYbymL2g();
        List<LazyLayoutItemAnimation> list = this.disappearingItems;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = list.get(i2);
            GraphicsLayer layer = lazyLayoutItemAnimation.getLayer();
            if (layer != null) {
                long j2 = jM11344getZeroYbymL2g >> 32;
                int iM11296getXimpl = IntOffset.m11296getXimpl(lazyLayoutItemAnimation.m2940getTargetOffsetnOccac());
                long jM8930getSizeYbymL2g = layer.m8930getSizeYbymL2g() >> 32;
                long j3 = jM11344getZeroYbymL2g & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
                jM11344getZeroYbymL2g = (Math.max((int) j3, IntOffset.m11297getYimpl(lazyLayoutItemAnimation.m2940getTargetOffsetnOccac()) + ((int) (layer.m8930getSizeYbymL2g() & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Math.max((int) j2, iM11296getXimpl + ((int) jM8930getSizeYbymL2g)) << 32);
            }
        }
        return jM11344getZeroYbymL2g;
    }

    public final void onDrawDisappearingItems(DrawScope drawScope) {
        List<LazyLayoutItemAnimation> list = this.disappearingItems;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = list.get(i2);
            GraphicsLayer layer = lazyLayoutItemAnimation.getLayer();
            if (layer != null) {
                int iM11296getXimpl = IntOffset.m11296getXimpl(lazyLayoutItemAnimation.m2939getPlacementOffsetnOccac());
                int iM11297getYimpl = IntOffset.m11297getYimpl(lazyLayoutItemAnimation.m2939getPlacementOffsetnOccac());
                float fM11296getXimpl = iM11296getXimpl - IntOffset.m11296getXimpl(layer.m8932getTopLeftnOccac());
                float fM11297getYimpl = iM11297getYimpl - IntOffset.m11297getYimpl(layer.m8932getTopLeftnOccac());
                drawScope.getDrawContext().getTransform().translate(fM11296getXimpl, fM11297getYimpl);
                float f2 = -fM11296getXimpl;
                float f3 = -fM11297getYimpl;
                try {
                    GraphicsLayerKt.drawLayer(drawScope, layer);
                } finally {
                    drawScope.getDrawContext().getTransform().translate(f2, f3);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017f  */
    /* JADX WARN: Type inference failed for: r15v4, types: [androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$ItemInfo] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasured(int r39, int r40, int r41, java.util.List<T> r42, final androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap r43, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider<T> r44, boolean r45, boolean r46, int r47, boolean r48, int r49, int r50, kotlinx.coroutines.af r51, androidx.compose.ui.graphics.GraphicsContext r52) {
        /*
            Method dump skipped, instructions count: 1459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.onMeasured(int, int, int, java.util.List, androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider, boolean, boolean, int, boolean, int, int, kotlinx.coroutines.af, androidx.compose.ui.graphics.GraphicsContext):void");
    }

    public final void reset() {
        releaseAnimations();
        this.keyIndexMap = null;
        this.firstVisibleIndex = -1;
    }

    public final void setDisplayingNode(DrawModifierNode drawModifierNode) {
        this.displayingNode = drawModifierNode;
    }
}
