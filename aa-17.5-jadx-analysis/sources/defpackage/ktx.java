package defpackage;

/* loaded from: classes2.dex */
public final class ktx implements bcn {
    private final float a;
    private final bcn b;

    public ktx(float f, bcn bcnVar) {
        bcnVar.getClass();
        this.a = f;
        this.b = bcnVar;
    }

    @Override // defpackage.bcn
    public final float a(long j, dlg dlgVar) {
        dlgVar.getClass();
        return this.b.a(j, dlgVar) + dlgVar.eA(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ktx)) {
            return false;
        }
        ktx ktxVar = (ktx) obj;
        return dlj.c(this.a, ktxVar.a) && affa.f(this.b, ktxVar.b);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".dp + " + this.b + ")";
    }
}
