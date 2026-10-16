package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kvo implements defpackage.and {
    private final float a;
    private final float b;

    public kvo(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.and
    public final float a(float f, float f2, float f3) {
        float f4 = this.a;
        float f5 = f2 + f;
        float f6 = f3 - this.b;
        if (f >= f4 && f5 <= f6) {
            return com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        }
        float f7 = f - f4;
        if (f >= f4 || f5 <= f6) {
            float f8 = f5 - f6;
            if (java.lang.Math.abs(f7) >= java.lang.Math.abs(f8)) {
                return f8;
            }
        }
        return f7;
    }

    @Override // defpackage.and
    public final /* synthetic */ defpackage.aej b() {
        return defpackage.anc.a;
    }
}
