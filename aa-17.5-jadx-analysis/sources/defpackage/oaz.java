package defpackage;

/* loaded from: classes.dex */
public final class oaz implements obb {
    public static final oaz a = new oaz();
    private static final float b;
    private static final float c;
    private static final cjm d;

    static {
        cjm cjmVar = new cjm((byte[]) null);
        cjmVar.l(1);
        czz.W(cjmVar, "M7.672,3.375L4.302,3.375L5.038,0.563C5.113,0.281 4.91,0 4.633,0C4.515,0 4.398,0.056 4.324,0.146L0.09,5.051C-0.102,5.276 0.047,5.625 0.335,5.625L3.705,5.625L2.969,8.438C2.895,8.719 3.097,9 3.374,9C3.492,9 3.609,8.944 3.684,8.854L7.917,3.949C8.109,3.724 7.96,3.375 7.672,3.375Z");
        d = cjmVar;
        b = 8.0f;
        c = 9.0f;
    }

    private oaz() {
    }

    @Override // defpackage.obh
    public final float a() {
        return c;
    }

    @Override // defpackage.obh
    public final float b() {
        return b;
    }

    @Override // defpackage.obb
    public final /* synthetic */ float c(float f, float f2) {
        return Math.min(f / b, f2 / c);
    }

    @Override // defpackage.obb
    public final /* synthetic */ long d(float f) {
        return ebf.I(this, f);
    }

    @Override // defpackage.obh
    public final cjm e() {
        return d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oaz)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -1537800443;
    }

    public final String toString() {
        return "Bolt";
    }
}
