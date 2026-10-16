package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
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
        android.graphics.RenderEffect renderEffectM = this.a;
        if (renderEffectM == null) {
            float f = this.c;
            float f2 = this.d;
            renderEffectM = (f == 0.0f && f2 == 0.0f) ? a$.ExternalSyntheticApiModelOutline0.m(0.0f, 0.0f) : a$.ExternalSyntheticApiModelOutline0.m(f, f2, android.graphics.Shader.TileMode.CLAMP);
            this.a = renderEffectM;
        }
        return renderEffectM;
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
