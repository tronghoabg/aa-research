package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fip {
    private final defpackage.fio a;
    private final float b;

    public fip(android.graphics.Rect rect, float f) {
        this(new defpackage.fio(rect), f);
    }

    public final android.graphics.Rect a() {
        defpackage.fio fioVar = this.a;
        return new android.graphics.Rect(fioVar.a, fioVar.b, fioVar.c, fioVar.d);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!defpackage.afga.f(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        defpackage.fip fipVar = (defpackage.fip) obj;
        return defpackage.afga.f(this.a, fipVar.a) && this.b == fipVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        return "WindowMetrics(_bounds=" + this.a + ", density=" + this.b + ")";
    }

    public fip(defpackage.fio fioVar, float f) {
        this.a = fioVar;
        this.b = f;
    }
}
