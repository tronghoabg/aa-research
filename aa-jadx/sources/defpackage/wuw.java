package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wuw implements defpackage.wuy {
    private final defpackage.wuy a;
    private final float b;

    public wuw(float f, defpackage.wuy wuyVar) {
        while (wuyVar instanceof defpackage.wuw) {
            wuyVar = ((defpackage.wuw) wuyVar).a;
            f += ((defpackage.wuw) wuyVar).b;
        }
        this.a = wuyVar;
        this.b = f;
    }

    @Override // defpackage.wuy
    public final float a(android.graphics.RectF rectF) {
        return java.lang.Math.max(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, this.a.a(rectF) + this.b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.wuw)) {
            return false;
        }
        defpackage.wuw wuwVar = (defpackage.wuw) obj;
        return this.a.equals(wuwVar.a) && this.b == wuwVar.b;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.a, java.lang.Float.valueOf(this.b)});
    }
}
