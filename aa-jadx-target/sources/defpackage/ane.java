package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ane implements defpackage.and {
    @Override // defpackage.and
    public final float a(float f, float f2, float f3) {
        float fAbs = java.lang.Math.abs((f2 + f) - f);
        float f4 = (0.3f * f3) - (0.0f * fAbs);
        if (fAbs <= f3 && f3 - f4 < fAbs) {
            f4 = f3 - fAbs;
        }
        return f - f4;
    }

    @Override // defpackage.and
    public final /* synthetic */ defpackage.aej b() {
        return defpackage.anc.a;
    }
}
