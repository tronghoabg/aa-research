package defpackage;

/* loaded from: classes.dex */
public final class bco implements bcn {
    private final float a;

    public bco(float f) {
        this.a = f;
    }

    @Override // defpackage.bcn
    public final float a(long j, dlg dlgVar) {
        return dlgVar.eA(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bco) && Float.compare(this.a, ((bco) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}
