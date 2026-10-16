package androidx.compose.animation;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.unit.IntOffset;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TransformScopeImpl implements TransformScope {
    public static final int $stable = 8;
    private boolean isOffsetMutated;
    private final MutableState isAlphaMutated$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private final MutableFloatState _alpha = PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);
    private final MutableState isScaleMutated$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private final MutableFloatState _scale = PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);
    private long offset = IntOffset.Companion.m11307getZeronOccac();
    private final MutableState isTransformOriginMutated$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private final MutableState<TransformOrigin> _transformOrigin = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m8658boximpl(TransformOrigin.Companion.m8671getCenterSzJe1aQ()), null, 2, null);
    private final MutableState isVeilMutated$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private final MutableState<Color> _veil = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Color.m8218boximpl(Color.Companion.m8263getTransparent0d7_KjU()), null, 2, null);

    @Override // androidx.compose.animation.TransformScope
    public float getAlpha() {
        return this._alpha.getFloatValue();
    }

    @Override // androidx.compose.animation.TransformScope
    /* renamed from: getOffset-nOcc-ac */
    public long mo1852getOffsetnOccac() {
        return this.offset;
    }

    @Override // androidx.compose.animation.TransformScope
    public float getScale() {
        return this._scale.getFloatValue();
    }

    @Override // androidx.compose.animation.TransformScope
    /* renamed from: getTransformOrigin-SzJe1aQ */
    public long mo1853getTransformOriginSzJe1aQ() {
        return this._transformOrigin.getValue().m8670unboximpl();
    }

    @Override // androidx.compose.animation.TransformScope
    /* renamed from: getVeil-0d7_KjU */
    public long mo1854getVeil0d7_KjU() {
        return this._veil.getValue().m8238unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isAlphaMutated() {
        return ((Boolean) this.isAlphaMutated$delegate.getValue()).booleanValue();
    }

    public final boolean isOffsetMutated() {
        return this.isOffsetMutated;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isScaleMutated() {
        return ((Boolean) this.isScaleMutated$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isTransformOriginMutated() {
        return ((Boolean) this.isTransformOriginMutated$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isVeilMutated() {
        return ((Boolean) this.isVeilMutated$delegate.getValue()).booleanValue();
    }

    public final void reset() {
        setAlphaMutated(false);
        setScaleMutated(false);
        this.isOffsetMutated = false;
        setTransformOriginMutated(false);
        setVeilMutated(false);
    }

    @Override // androidx.compose.animation.TransformScope
    public void setAlpha(float f2) {
        this._alpha.setFloatValue(f2);
        setAlphaMutated(true);
    }

    public final void setAlphaMutated(boolean z) {
        this.isAlphaMutated$delegate.setValue(Boolean.valueOf(z));
    }

    @Override // androidx.compose.animation.TransformScope
    /* renamed from: setOffset--gyyYBs */
    public void mo1855setOffsetgyyYBs(long j2) {
        this.offset = j2;
        this.isOffsetMutated = true;
    }

    public final void setOffsetMutated(boolean z) {
        this.isOffsetMutated = z;
    }

    @Override // androidx.compose.animation.TransformScope
    public void setScale(float f2) {
        this._scale.setFloatValue(f2);
        setScaleMutated(true);
    }

    public final void setScaleMutated(boolean z) {
        this.isScaleMutated$delegate.setValue(Boolean.valueOf(z));
    }

    @Override // androidx.compose.animation.TransformScope
    /* renamed from: setTransformOrigin-__ExYCQ */
    public void mo1856setTransformOrigin__ExYCQ(long j2) {
        this._transformOrigin.setValue(TransformOrigin.m8658boximpl(j2));
        setTransformOriginMutated(true);
    }

    public final void setTransformOriginMutated(boolean z) {
        this.isTransformOriginMutated$delegate.setValue(Boolean.valueOf(z));
    }

    @Override // androidx.compose.animation.TransformScope
    /* renamed from: setVeil-8_81llA */
    public void mo1857setVeil8_81llA(long j2) {
        this._veil.setValue(Color.m8218boximpl(j2));
        setVeilMutated(true);
    }

    public final void setVeilMutated(boolean z) {
        this.isVeilMutated$delegate.setValue(Boolean.valueOf(z));
    }
}
