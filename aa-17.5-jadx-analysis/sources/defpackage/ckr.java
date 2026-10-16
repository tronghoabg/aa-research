package defpackage;

import android.graphics.RenderEffect;
import android.graphics.Shader;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class ckr {
    private RenderEffect a;
    private final ckr b;
    private final float c;
    private final float d;
    private final int e;

    public ckr(float f, float f2) {
        this.b = null;
        this.c = f;
        this.d = f2;
        this.e = 0;
    }

    public final RenderEffect a() {
        RenderEffect renderEffectCreateOffsetEffect = this.a;
        if (renderEffectCreateOffsetEffect == null) {
            float f = this.c;
            float f2 = this.d;
            renderEffectCreateOffsetEffect = (f == BitmapDescriptorFactory.HUE_RED && f2 == BitmapDescriptorFactory.HUE_RED) ? RenderEffect.createOffsetEffect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) : RenderEffect.createBlurEffect(f, f2, Shader.TileMode.CLAMP);
            this.a = renderEffectCreateOffsetEffect;
        }
        return renderEffectCreateOffsetEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckr)) {
            return false;
        }
        ckr ckrVar = (ckr) obj;
        if (this.c != ckrVar.c || this.d != ckrVar.d) {
            return false;
        }
        int i = ckrVar.e;
        ckr ckrVar2 = ckrVar.b;
        return true;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d)) * 31;
    }

    public final String toString() {
        return "BlurEffect(renderEffect=null, radiusX=" + this.c + ", radiusY=" + this.d + ", edgeTreatment=Clamp)";
    }

    public ckr() {
        throw null;
    }
}
