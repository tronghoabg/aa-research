package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class obu implements defpackage.obw {
    public static final defpackage.obu a = new defpackage.obu();
    private static final float b;
    private static final float c;
    private static final defpackage.cju d;

    static {
        defpackage.cju cjuVar = new defpackage.cju((byte[]) null);
        cjuVar.m(1);
        defpackage.dai.ai(cjuVar, "M7.672,3.375L4.302,3.375L5.038,0.563C5.113,0.281 4.91,0 4.633,0C4.515,0 4.398,0.056 4.324,0.146L0.09,5.051C-0.102,5.276 0.047,5.625 0.335,5.625L3.705,5.625L2.969,8.438C2.895,8.719 3.097,9 3.374,9C3.492,9 3.609,8.944 3.684,8.854L7.917,3.949C8.109,3.724 7.96,3.375 7.672,3.375Z");
        d = cjuVar;
        b = 8.0f;
        c = 9.0f;
    }

    private obu() {
    }

    @Override // defpackage.occ
    public final float a() {
        return c;
    }

    @Override // defpackage.occ
    public final float b() {
        return b;
    }

    @Override // defpackage.obw
    public final /* synthetic */ float c(float f, float f2) {
        return java.lang.Math.min(f / b, f2 / c);
    }

    @Override // defpackage.obw
    public final /* synthetic */ long d(float f) {
        return defpackage.edd.u(this, f);
    }

    @Override // defpackage.occ
    public final defpackage.cju e() {
        return d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.obu)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -1537800443;
    }

    public final java.lang.String toString() {
        return "Bolt";
    }
}
