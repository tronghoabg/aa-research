package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.LayoutScopeMarker;
import h.g.b.ad;
import h.i.a;
import h.l.r;

/* compiled from: WazeSource */
@LayoutScopeMarker
/* loaded from: classes3.dex */
public final class KeyPositionScope extends BaseKeyFrameScope {
    static final /* synthetic */ r<Object>[] $$delegatedProperties = {new ad(KeyPositionScope.class, "percentX", "getPercentX()F", 0), new ad(KeyPositionScope.class, "percentY", "getPercentY()F", 0), new ad(KeyPositionScope.class, "percentWidth", "getPercentWidth()F", 0), new ad(KeyPositionScope.class, "percentHeight", "getPercentHeight()F", 0), new ad(KeyPositionScope.class, "curveFit", "getCurveFit()Landroidx/constraintlayout/compose/CurveFit;", 0)};
    public static final int $stable = 8;
    private final a curveFit$delegate;
    private final a percentHeight$delegate;
    private final a percentWidth$delegate;
    private final a percentX$delegate;
    private final a percentY$delegate;

    public KeyPositionScope() {
        super(null);
        KeyPositionScope keyPositionScope = this;
        Float fValueOf = Float.valueOf(1.0f);
        this.percentX$delegate = BaseKeyFrameScope.addOnPropertyChange$default(keyPositionScope, fValueOf, null, 2, null);
        this.percentY$delegate = BaseKeyFrameScope.addOnPropertyChange$default(keyPositionScope, fValueOf, null, 2, null);
        this.percentWidth$delegate = BaseKeyFrameScope.addOnPropertyChange$default(keyPositionScope, fValueOf, null, 2, null);
        this.percentHeight$delegate = BaseKeyFrameScope.addOnPropertyChange$default(keyPositionScope, Float.valueOf(0.0f), null, 2, null);
        this.curveFit$delegate = BaseKeyFrameScope.addNameOnPropertyChange$default(keyPositionScope, null, null, 2, null);
    }

    public final CurveFit getCurveFit() {
        return (CurveFit) this.curveFit$delegate.getValue(this, $$delegatedProperties[4]);
    }

    public final float getPercentHeight() {
        return ((Number) this.percentHeight$delegate.getValue(this, $$delegatedProperties[3])).floatValue();
    }

    public final float getPercentWidth() {
        return ((Number) this.percentWidth$delegate.getValue(this, $$delegatedProperties[2])).floatValue();
    }

    public final float getPercentX() {
        return ((Number) this.percentX$delegate.getValue(this, $$delegatedProperties[0])).floatValue();
    }

    public final float getPercentY() {
        return ((Number) this.percentY$delegate.getValue(this, $$delegatedProperties[1])).floatValue();
    }

    public final void setCurveFit(CurveFit curveFit) {
        this.curveFit$delegate.setValue(this, $$delegatedProperties[4], curveFit);
    }

    public final void setPercentHeight(float f2) {
        this.percentHeight$delegate.setValue(this, $$delegatedProperties[3], Float.valueOf(f2));
    }

    public final void setPercentWidth(float f2) {
        this.percentWidth$delegate.setValue(this, $$delegatedProperties[2], Float.valueOf(f2));
    }

    public final void setPercentX(float f2) {
        this.percentX$delegate.setValue(this, $$delegatedProperties[0], Float.valueOf(f2));
    }

    public final void setPercentY(float f2) {
        this.percentY$delegate.setValue(this, $$delegatedProperties[1], Float.valueOf(f2));
    }
}
