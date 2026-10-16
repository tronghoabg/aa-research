package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xrv {
    public final float a;
    private final java.lang.Integer b;
    private final float c;
    private final java.lang.Integer d;
    private final float e;
    private final java.lang.Integer f;
    private final float g;

    public xrv(float f) {
        this.b = null;
        this.c = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.d = null;
        this.e = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.f = null;
        this.g = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.a = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.xrv)) {
            return false;
        }
        defpackage.xrv xrvVar = (defpackage.xrv) obj;
        java.lang.Integer num = xrvVar.b;
        if (!defpackage.afga.f(null, null)) {
            return false;
        }
        float f = xrvVar.c;
        java.lang.Integer num2 = xrvVar.d;
        if (!defpackage.afga.f(null, null)) {
            return false;
        }
        float f2 = xrvVar.e;
        java.lang.Integer num3 = xrvVar.f;
        if (!defpackage.afga.f(null, null)) {
            return false;
        }
        float f3 = xrvVar.g;
        return java.lang.Float.compare(this.a, xrvVar.a) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.a);
    }

    public final java.lang.String toString() {
        return "InteractionStateConfig(hoverColor=null, hoverAlpha=0.0, pressedColor=null, pressedAlpha=0.0, focusedOutlineColor=null, focusedOutlineAlpha=0.0, focusedOutlineStrokeWidth=" + this.a + ")";
    }

    public xrv() {
        this(3.0f);
    }
}
