package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wux implements defpackage.wuy {
    private final float a;

    public wux(float f) {
        this.a = f;
    }

    @Override // defpackage.wuy
    public final float a(android.graphics.RectF rectF) {
        return defpackage.duc.b(this.a, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, java.lang.Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.wux) && this.a == ((defpackage.wux) obj).a;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Float.valueOf(this.a)});
    }
}
