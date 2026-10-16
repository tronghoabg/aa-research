package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ckz {
    private android.graphics.RenderEffect a;
    private final defpackage.ckz b;
    private final float c;
    private final float d;
    private final int e;

    public ckz(float f, float f2) {
        this.b = null;
        this.c = f;
        this.d = f2;
        this.e = 0;
    }

    public final android.graphics.RenderEffect a() {
        android.graphics.RenderEffect renderEffectCreateOffsetEffect = this.a;
        if (renderEffectCreateOffsetEffect == null) {
            float f = this.c;
            float f2 = this.d;
            renderEffectCreateOffsetEffect = (f == com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED && f2 == com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) ? android.graphics.RenderEffect.createOffsetEffect(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) : android.graphics.RenderEffect.createBlurEffect(f, f2, android.graphics.Shader.TileMode.CLAMP);
            this.a = renderEffectCreateOffsetEffect;
        }
        return renderEffectCreateOffsetEffect;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ckz)) {
            return false;
        }
        defpackage.ckz ckzVar = (defpackage.ckz) obj;
        if (this.c != ckzVar.c || this.d != ckzVar.d) {
            return false;
        }
        int i = ckzVar.e;
        defpackage.ckz ckzVar2 = ckzVar.b;
        return true;
    }

    public final int hashCode() {
        return ((java.lang.Float.floatToIntBits(this.c) * 31) + java.lang.Float.floatToIntBits(this.d)) * 31;
    }

    public final java.lang.String toString() {
        return "BlurEffect(renderEffect=null, radiusX=" + this.c + ", radiusY=" + this.d + ", edgeTreatment=Clamp)";
    }

    public ckz() {
        throw null;
    }
}
