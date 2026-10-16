package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.ui.unit.Dp;
import h.g.b.ad;
import h.i.a;
import h.l.r;

/* compiled from: WazeSource */
@LayoutScopeMarker
/* loaded from: classes3.dex */
public final class KeyAttributeScope extends BaseKeyFrameScope {
    static final /* synthetic */ r<Object>[] $$delegatedProperties = {new ad(KeyAttributeScope.class, "alpha", "getAlpha()F", 0), new ad(KeyAttributeScope.class, "scaleX", "getScaleX()F", 0), new ad(KeyAttributeScope.class, "scaleY", "getScaleY()F", 0), new ad(KeyAttributeScope.class, "rotationX", "getRotationX()F", 0), new ad(KeyAttributeScope.class, "rotationY", "getRotationY()F", 0), new ad(KeyAttributeScope.class, "rotationZ", "getRotationZ()F", 0), new ad(KeyAttributeScope.class, "translationX", "getTranslationX-D9Ej5fM()F", 0), new ad(KeyAttributeScope.class, "translationY", "getTranslationY-D9Ej5fM()F", 0), new ad(KeyAttributeScope.class, "translationZ", "getTranslationZ-D9Ej5fM()F", 0)};
    public static final int $stable = 8;
    private final a alpha$delegate;
    private final a rotationX$delegate;
    private final a rotationY$delegate;
    private final a rotationZ$delegate;
    private final a scaleX$delegate;
    private final a scaleY$delegate;
    private final a translationX$delegate;
    private final a translationY$delegate;
    private final a translationZ$delegate;

    public KeyAttributeScope() {
        super(null);
        Float fValueOf = Float.valueOf(1.0f);
        this.alpha$delegate = addOnPropertyChange(fValueOf, "alpha");
        this.scaleX$delegate = addOnPropertyChange(fValueOf, "scaleX");
        this.scaleY$delegate = addOnPropertyChange(fValueOf, "scaleY");
        Float fValueOf2 = Float.valueOf(0.0f);
        this.rotationX$delegate = addOnPropertyChange(fValueOf2, "rotationX");
        this.rotationY$delegate = addOnPropertyChange(fValueOf2, "rotationY");
        this.rotationZ$delegate = addOnPropertyChange(fValueOf2, "rotationZ");
        this.translationX$delegate = addOnPropertyChange(Dp.m11162boximpl(0.0f), "translationX");
        this.translationY$delegate = addOnPropertyChange(Dp.m11162boximpl(0.0f), "translationY");
        this.translationZ$delegate = addOnPropertyChange(Dp.m11162boximpl(0.0f), "translationZ");
    }

    public final float getAlpha() {
        return ((Number) this.alpha$delegate.getValue(this, $$delegatedProperties[0])).floatValue();
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
    public final float m11549getTranslationXD9Ej5fM() {
        return ((Dp) this.translationX$delegate.getValue(this, $$delegatedProperties[6])).m11178unboximpl();
    }

    /* renamed from: getTranslationY-D9Ej5fM, reason: not valid java name */
    public final float m11550getTranslationYD9Ej5fM() {
        return ((Dp) this.translationY$delegate.getValue(this, $$delegatedProperties[7])).m11178unboximpl();
    }

    /* renamed from: getTranslationZ-D9Ej5fM, reason: not valid java name */
    public final float m11551getTranslationZD9Ej5fM() {
        return ((Dp) this.translationZ$delegate.getValue(this, $$delegatedProperties[8])).m11178unboximpl();
    }

    public final void setAlpha(float f2) {
        this.alpha$delegate.setValue(this, $$delegatedProperties[0], Float.valueOf(f2));
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
    public final void m11552setTranslationX0680j_4(float f2) {
        this.translationX$delegate.setValue(this, $$delegatedProperties[6], Dp.m11162boximpl(f2));
    }

    /* renamed from: setTranslationY-0680j_4, reason: not valid java name */
    public final void m11553setTranslationY0680j_4(float f2) {
        this.translationY$delegate.setValue(this, $$delegatedProperties[7], Dp.m11162boximpl(f2));
    }

    /* renamed from: setTranslationZ-0680j_4, reason: not valid java name */
    public final void m11554setTranslationZ0680j_4(float f2) {
        this.translationZ$delegate.setValue(this, $$delegatedProperties[8], Dp.m11162boximpl(f2));
    }
}
