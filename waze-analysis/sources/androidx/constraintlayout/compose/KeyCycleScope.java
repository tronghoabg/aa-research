package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import h.g.b.ad;
import h.i.a;
import h.l.r;

/* compiled from: WazeSource */
@LayoutScopeMarker
/* loaded from: classes3.dex */
public final class KeyCycleScope extends BaseKeyFrameScope {
    static final /* synthetic */ r<Object>[] $$delegatedProperties = {new ad(KeyCycleScope.class, "alpha", "getAlpha()F", 0), new ad(KeyCycleScope.class, "scaleX", "getScaleX()F", 0), new ad(KeyCycleScope.class, "scaleY", "getScaleY()F", 0), new ad(KeyCycleScope.class, "rotationX", "getRotationX()F", 0), new ad(KeyCycleScope.class, "rotationY", "getRotationY()F", 0), new ad(KeyCycleScope.class, "rotationZ", "getRotationZ()F", 0), new ad(KeyCycleScope.class, "translationX", "getTranslationX-D9Ej5fM()F", 0), new ad(KeyCycleScope.class, "translationY", "getTranslationY-D9Ej5fM()F", 0), new ad(KeyCycleScope.class, "translationZ", "getTranslationZ-D9Ej5fM()F", 0), new ad(KeyCycleScope.class, TypedValues.CycleType.S_WAVE_PERIOD, "getPeriod()F", 0), new ad(KeyCycleScope.class, TypedValues.CycleType.S_WAVE_OFFSET, "getOffset()F", 0), new ad(KeyCycleScope.class, TypedValues.CycleType.S_WAVE_PHASE, "getPhase()F", 0)};
    public static final int $stable = 8;
    private final a alpha$delegate;
    private final a offset$delegate;
    private final a period$delegate;
    private final a phase$delegate;
    private final a rotationX$delegate;
    private final a rotationY$delegate;
    private final a rotationZ$delegate;
    private final a scaleX$delegate;
    private final a scaleY$delegate;
    private final a translationX$delegate;
    private final a translationY$delegate;
    private final a translationZ$delegate;

    public KeyCycleScope() {
        super(null);
        KeyCycleScope keyCycleScope = this;
        Float fValueOf = Float.valueOf(1.0f);
        this.alpha$delegate = BaseKeyFrameScope.addOnPropertyChange$default(keyCycleScope, fValueOf, null, 2, null);
        this.scaleX$delegate = BaseKeyFrameScope.addOnPropertyChange$default(keyCycleScope, fValueOf, null, 2, null);
        this.scaleY$delegate = BaseKeyFrameScope.addOnPropertyChange$default(keyCycleScope, fValueOf, null, 2, null);
        Float fValueOf2 = Float.valueOf(0.0f);
        this.rotationX$delegate = BaseKeyFrameScope.addOnPropertyChange$default(keyCycleScope, fValueOf2, null, 2, null);
        this.rotationY$delegate = BaseKeyFrameScope.addOnPropertyChange$default(keyCycleScope, fValueOf2, null, 2, null);
        this.rotationZ$delegate = BaseKeyFrameScope.addOnPropertyChange$default(keyCycleScope, fValueOf2, null, 2, null);
        this.translationX$delegate = BaseKeyFrameScope.addOnPropertyChange$default(keyCycleScope, Dp.m11162boximpl(0.0f), null, 2, null);
        this.translationY$delegate = BaseKeyFrameScope.addOnPropertyChange$default(keyCycleScope, Dp.m11162boximpl(0.0f), null, 2, null);
        this.translationZ$delegate = BaseKeyFrameScope.addOnPropertyChange$default(keyCycleScope, Dp.m11162boximpl(0.0f), null, 2, null);
        this.period$delegate = BaseKeyFrameScope.addOnPropertyChange$default(keyCycleScope, fValueOf2, null, 2, null);
        this.offset$delegate = BaseKeyFrameScope.addOnPropertyChange$default(keyCycleScope, fValueOf2, null, 2, null);
        this.phase$delegate = BaseKeyFrameScope.addOnPropertyChange$default(keyCycleScope, fValueOf2, null, 2, null);
    }

    public final float getAlpha() {
        return ((Number) this.alpha$delegate.getValue(this, $$delegatedProperties[0])).floatValue();
    }

    public final float getOffset() {
        return ((Number) this.offset$delegate.getValue(this, $$delegatedProperties[10])).floatValue();
    }

    public final float getPeriod() {
        return ((Number) this.period$delegate.getValue(this, $$delegatedProperties[9])).floatValue();
    }

    public final float getPhase() {
        return ((Number) this.phase$delegate.getValue(this, $$delegatedProperties[11])).floatValue();
    }

    public final float getRotationX() {
        return ((Number) this.rotationX$delegate.getValue(this, $$delegatedProperties[3])).floatValue();
    }

    public final float getRotationY() {
        return ((Number) this.rotationY$delegate.getValue(this, $$delegatedProperties[4])).floatValue();
    }

    public final float getRotationZ() {
        return ((Number) this.rotationZ$delegate.getValue(this, $$delegatedProperties[5])).floatValue();
    }

    public final float getScaleX() {
        return ((Number) this.scaleX$delegate.getValue(this, $$delegatedProperties[1])).floatValue();
    }

    public final float getScaleY() {
        return ((Number) this.scaleY$delegate.getValue(this, $$delegatedProperties[2])).floatValue();
    }

    /* renamed from: getTranslationX-D9Ej5fM, reason: not valid java name */
    public final float m11555getTranslationXD9Ej5fM() {
        return ((Dp) this.translationX$delegate.getValue(this, $$delegatedProperties[6])).m11178unboximpl();
    }

    /* renamed from: getTranslationY-D9Ej5fM, reason: not valid java name */
    public final float m11556getTranslationYD9Ej5fM() {
        return ((Dp) this.translationY$delegate.getValue(this, $$delegatedProperties[7])).m11178unboximpl();
    }

    /* renamed from: getTranslationZ-D9Ej5fM, reason: not valid java name */
    public final float m11557getTranslationZD9Ej5fM() {
        return ((Dp) this.translationZ$delegate.getValue(this, $$delegatedProperties[8])).m11178unboximpl();
    }

    public final void setAlpha(float f2) {
        this.alpha$delegate.setValue(this, $$delegatedProperties[0], Float.valueOf(f2));
    }

    public final void setOffset(float f2) {
        this.offset$delegate.setValue(this, $$delegatedProperties[10], Float.valueOf(f2));
    }

    public final void setPeriod(float f2) {
        this.period$delegate.setValue(this, $$delegatedProperties[9], Float.valueOf(f2));
    }

    public final void setPhase(float f2) {
        this.phase$delegate.setValue(this, $$delegatedProperties[11], Float.valueOf(f2));
    }

    public final void setRotationX(float f2) {
        this.rotationX$delegate.setValue(this, $$delegatedProperties[3], Float.valueOf(f2));
    }

    public final void setRotationY(float f2) {
        this.rotationY$delegate.setValue(this, $$delegatedProperties[4], Float.valueOf(f2));
    }

    public final void setRotationZ(float f2) {
        this.rotationZ$delegate.setValue(this, $$delegatedProperties[5], Float.valueOf(f2));
    }

    public final void setScaleX(float f2) {
        this.scaleX$delegate.setValue(this, $$delegatedProperties[1], Float.valueOf(f2));
    }

    public final void setScaleY(float f2) {
        this.scaleY$delegate.setValue(this, $$delegatedProperties[2], Float.valueOf(f2));
    }

    /* renamed from: setTranslationX-0680j_4, reason: not valid java name */
    public final void m11558setTranslationX0680j_4(float f2) {
        this.translationX$delegate.setValue(this, $$delegatedProperties[6], Dp.m11162boximpl(f2));
    }

    /* renamed from: setTranslationY-0680j_4, reason: not valid java name */
    public final void m11559setTranslationY0680j_4(float f2) {
        this.translationY$delegate.setValue(this, $$delegatedProperties[7], Dp.m11162boximpl(f2));
    }

    /* renamed from: setTranslationZ-0680j_4, reason: not valid java name */
    public final void m11560setTranslationZ0680j_4(float f2) {
        this.translationZ$delegate.setValue(this, $$delegatedProperties[8], Dp.m11162boximpl(f2));
    }
}
