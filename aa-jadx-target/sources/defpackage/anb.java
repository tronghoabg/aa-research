package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class anb implements defpackage.and {
    @Override // defpackage.and
    public final /* synthetic */ float a(float f, float f2, float f3) {
        float f4 = f2 + f;
        if (f >= 0.0f && f4 <= f3) {
            return 0.0f;
        }
        if (f < 0.0f && f4 > f3) {
            return 0.0f;
        }
        float f5 = f4 - f3;
        return java.lang.Math.abs(f) >= java.lang.Math.abs(f5) ? f5 : f;
    }

    @Override // defpackage.and
    public final /* synthetic */ defpackage.aej b() {
        return defpackage.anc.a;
    }
}
