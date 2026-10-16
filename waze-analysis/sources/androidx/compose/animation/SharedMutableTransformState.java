package androidx.compose.animation;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SharedMutableTransformState {
    public static final int $stable = 8;
    private MutableTransform mutableData;
    private final MutableState<Boolean> _isMutating = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private final MutableState isHandoffActive$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private final TransformScopeImpl transformScope = new TransformScopeImpl();
    private long lastVeil = Color.Companion.m8263getTransparent0d7_KjU();
    private float lastAlpha = 1.0f;
    private float lastScale = 1.0f;
    private long lastTransformOrigin = TransformOrigin.Companion.m8671getCenterSzJe1aQ();
    private long lastSlide = IntOffset.Companion.m11307getZeronOccac();

    private final void setHandoffActive(boolean z) {
        this.isHandoffActive$delegate.setValue(Boolean.valueOf(z));
    }

    public final void clear() {
        setHandoffActive(false);
        setMutating(false);
        this.transformScope.reset();
        this.lastVeil = Color.Companion.m8263getTransparent0d7_KjU();
        this.lastAlpha = 1.0f;
        this.lastScale = 1.0f;
        this.lastTransformOrigin = TransformOrigin.Companion.m8671getCenterSzJe1aQ();
        this.lastSlide = IntOffset.Companion.m11307getZeronOccac();
        this.mutableData = null;
    }

    public final float combinedAlpha(float f2) {
        float alpha = 1.0f;
        if (isMutating() && this.transformScope.isAlphaMutated()) {
            alpha = this.transformScope.getAlpha();
        }
        float f3 = f2 * alpha;
        if (isMutating()) {
            this.lastAlpha = f3;
        }
        return f3;
    }

    public final float combinedScale(float f2) {
        float scale = 1.0f;
        if (isMutating() && this.transformScope.isScaleMutated()) {
            scale = this.transformScope.getScale();
        }
        float f3 = f2 * scale;
        if (isMutating()) {
            this.lastScale = f3;
        }
        return f3;
    }

    /* renamed from: combinedSlide-zPqKDFQ, reason: not valid java name */
    public final long m1810combinedSlidezPqKDFQ(long j2, long j3) {
        m1813evaluateTransformBlockozmzZPI(j3);
        long jM11300plusqkQi6aY = IntOffset.m11300plusqkQi6aY(j2, (isMutating() && this.transformScope.isOffsetMutated()) ? this.transformScope.mo1852getOffsetnOccac() : IntOffset.Companion.m11307getZeronOccac());
        if (isMutating()) {
            this.lastSlide = jM11300plusqkQi6aY;
        }
        return jM11300plusqkQi6aY;
    }

    /* renamed from: combinedTransformOrigin-488XkdY, reason: not valid java name */
    public final long m1811combinedTransformOrigin488XkdY(long j2) {
        if (isMutating() && this.transformScope.isTransformOriginMutated()) {
            j2 = this.transformScope.mo1853getTransformOriginSzJe1aQ();
        }
        if (isMutating()) {
            this.lastTransformOrigin = j2;
        }
        return j2;
    }

    /* renamed from: combinedVeil-l2rxGTc, reason: not valid java name */
    public final long m1812combinedVeill2rxGTc(long j2) {
        if (isMutating() && this.transformScope.isVeilMutated()) {
            j2 = this.transformScope.mo1854getVeil0d7_KjU();
        }
        if (isMutating()) {
            this.lastVeil = j2;
        }
        return j2;
    }

    /* renamed from: evaluateTransformBlock-ozmzZPI, reason: not valid java name */
    public final void m1813evaluateTransformBlockozmzZPI(long j2) {
        MutableTransform mutableTransform;
        p<TransformScope, IntSize, ab> block$animation;
        if (!isMutating() || (mutableTransform = this.mutableData) == null || (block$animation = mutableTransform.getBlock$animation()) == null) {
            return;
        }
        block$animation.invoke(this.transformScope, IntSize.m11331boximpl(j2));
    }

    public final Float getAlphaHandoffValue() {
        if (isHandoffActive()) {
            return Float.valueOf(this.lastAlpha);
        }
        return null;
    }

    public final boolean getAlphaRequiresAnimation() {
        MutableTransform mutableTransform = this.mutableData;
        return ((mutableTransform != null ? mutableTransform.getBlock$animation() : null) != null && this.transformScope.isAlphaMutated()) || this.lastAlpha != 1.0f;
    }

    public final float getLastAlpha() {
        return this.lastAlpha;
    }

    public final float getLastScale() {
        return this.lastScale;
    }

    /* renamed from: getLastSlide-nOcc-ac, reason: not valid java name */
    public final long m1814getLastSlidenOccac() {
        return this.lastSlide;
    }

    /* renamed from: getLastTransformOrigin-SzJe1aQ, reason: not valid java name */
    public final long m1815getLastTransformOriginSzJe1aQ() {
        return this.lastTransformOrigin;
    }

    /* renamed from: getLastVeil-0d7_KjU, reason: not valid java name */
    public final long m1816getLastVeil0d7_KjU() {
        return this.lastVeil;
    }

    public final MutableTransform getMutableData() {
        return this.mutableData;
    }

    public final Float getScaleHandoffValue() {
        if (isHandoffActive()) {
            return Float.valueOf(this.lastScale);
        }
        return null;
    }

    public final boolean getScaleRequiresAnimation() {
        MutableTransform mutableTransform = this.mutableData;
        return ((mutableTransform != null ? mutableTransform.getBlock$animation() : null) != null && this.transformScope.isScaleMutated()) || this.lastScale != 1.0f;
    }

    /* renamed from: getSlideHandoffValue-JyOPPKE, reason: not valid java name */
    public final IntOffset m1817getSlideHandoffValueJyOPPKE() {
        if (isHandoffActive()) {
            return IntOffset.m11287boximpl(this.lastSlide);
        }
        return null;
    }

    public final boolean getSlideRequiresAnimation() {
        MutableTransform mutableTransform = this.mutableData;
        return ((mutableTransform != null ? mutableTransform.getBlock$animation() : null) != null && this.transformScope.isOffsetMutated()) || !IntOffset.m11295equalsimpl0(this.lastSlide, IntOffset.Companion.m11307getZeronOccac());
    }

    /* renamed from: getTransformOriginHandoffValue-0uW6WK0, reason: not valid java name */
    public final TransformOrigin m1818getTransformOriginHandoffValue0uW6WK0() {
        if (isHandoffActive()) {
            return TransformOrigin.m8658boximpl(this.lastTransformOrigin);
        }
        return null;
    }

    public final boolean getTransformOriginRequiresAnimation() {
        MutableTransform mutableTransform = this.mutableData;
        return ((mutableTransform != null ? mutableTransform.getBlock$animation() : null) != null && this.transformScope.isTransformOriginMutated()) || !TransformOrigin.m8665equalsimpl0(this.lastTransformOrigin, TransformOrigin.Companion.m8671getCenterSzJe1aQ());
    }

    public final TransformScopeImpl getTransformScope$animation() {
        return this.transformScope;
    }

    /* renamed from: getVeilHandoffValue-QN2ZGVo, reason: not valid java name */
    public final Color m1819getVeilHandoffValueQN2ZGVo() {
        if (isHandoffActive()) {
            return Color.m8218boximpl(this.lastVeil);
        }
        return null;
    }

    public final boolean getVeilRequiresAnimation() {
        MutableTransform mutableTransform = this.mutableData;
        return ((mutableTransform != null ? mutableTransform.getBlock$animation() : null) != null && this.transformScope.isVeilMutated()) || !Color.m8229equalsimpl0(this.lastVeil, Color.Companion.m8263getTransparent0d7_KjU());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isHandoffActive() {
        return ((Boolean) this.isHandoffActive$delegate.getValue()).booleanValue();
    }

    public final boolean isMutating() {
        return this._isMutating.getValue().booleanValue();
    }

    public final void setLastAlpha(float f2) {
        this.lastAlpha = f2;
    }

    public final void setLastScale(float f2) {
        this.lastScale = f2;
    }

    /* renamed from: setLastSlide--gyyYBs, reason: not valid java name */
    public final void m1820setLastSlidegyyYBs(long j2) {
        this.lastSlide = j2;
    }

    /* renamed from: setLastTransformOrigin-__ExYCQ, reason: not valid java name */
    public final void m1821setLastTransformOrigin__ExYCQ(long j2) {
        this.lastTransformOrigin = j2;
    }

    /* renamed from: setLastVeil-8_81llA, reason: not valid java name */
    public final void m1822setLastVeil8_81llA(long j2) {
        this.lastVeil = j2;
    }

    public final void setMutableData(MutableTransform mutableTransform) {
        this.mutableData = mutableTransform;
    }

    public final void setMutating(boolean z) {
        if (this._isMutating.getValue().booleanValue() && !z) {
            setHandoffActive(true);
        } else if (z) {
            setHandoffActive(false);
        }
        this._isMutating.setValue(Boolean.valueOf(z));
    }
}
