package defpackage;

/* loaded from: classes2.dex */
public final class oba implements obb {
    public static final oba a = new oba();
    private static final float b;
    private static final float c;
    private static final cjm d;

    static {
        cjm cjmVar = new cjm((byte[]) null);
        cjmVar.l(1);
        czz.W(cjmVar, "M4.248,0C4.745,0 5.148,0.403 5.148,0.9V3.35H7.6C8.097,3.35 8.5,3.753 8.5,4.25C8.5,4.747 8.097,5.149 7.6,5.149H5.148V7.6C5.148,8.097 4.745,8.5 4.248,8.5C3.751,8.5 3.349,8.097 3.349,7.6V5.149H0.9C0.403,5.149 0,4.747 0,4.25C0,3.753 0.403,3.35 0.9,3.35H3.349V0.9C3.349,0.403 3.751,0 4.248,0Z");
        d = cjmVar;
        b = 8.5f;
        c = 8.5f;
    }

    private oba() {
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
        if (!(obj instanceof oba)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -1537385974;
    }

    public final String toString() {
        return "Plus";
    }
}
