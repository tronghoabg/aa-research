package androidx.compose.ui.graphics;

import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BlurEffect extends RenderEffect {
    public static final int $stable = 0;
    private final int edgeTreatment;
    private final float radiusX;
    private final float radiusY;
    private final RenderEffect renderEffect;

    public /* synthetic */ BlurEffect(RenderEffect renderEffect, float f2, float f3, int i2, int i3, o oVar) {
        this(renderEffect, f2, (i3 & 4) != 0 ? f2 : f3, (i3 & 8) != 0 ? TileMode.Companion.m8653getClamp3opZhB0() : i2, null);
    }

    @Override // androidx.compose.ui.graphics.RenderEffect
    protected android.graphics.RenderEffect createRenderEffect() {
        return RenderEffectVerificationHelper.INSTANCE.m8584createBlurEffect8A3gB4(this.renderEffect, this.radiusX, this.radiusY, this.edgeTreatment);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlurEffect)) {
            return false;
        }
        BlurEffect blurEffect = (BlurEffect) obj;
        return this.radiusX == blurEffect.radiusX && this.radiusY == blurEffect.radiusY && TileMode.m8649equalsimpl0(this.edgeTreatment, blurEffect.edgeTreatment) && x.n(this.renderEffect, blurEffect.renderEffect);
    }

    public int hashCode() {
        RenderEffect renderEffect = this.renderEffect;
        return ((((((renderEffect != null ? renderEffect.hashCode() : 0) * 31) + Float.floatToIntBits(this.radiusX)) * 31) + Float.floatToIntBits(this.radiusY)) * 31) + this.edgeTreatment;
    }

    public String toString() {
        return "BlurEffect(renderEffect=" + this.renderEffect + ", radiusX=" + this.radiusX + ", radiusY=" + this.radiusY + ", edgeTreatment=" + ((Object) TileMode.m8651toStringimpl(this.edgeTreatment)) + ')';
    }

    public /* synthetic */ BlurEffect(RenderEffect renderEffect, float f2, float f3, int i2, o oVar) {
        this(renderEffect, f2, f3, i2);
    }

    private BlurEffect(RenderEffect renderEffect, float f2, float f3, int i2) {
        super(null);
        this.renderEffect = renderEffect;
        this.radiusX = f2;
        this.radiusY = f3;
        this.edgeTreatment = i2;
    }
}
