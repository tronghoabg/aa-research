package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dtx extends defpackage.dtz {
    public final java.lang.String a;
    public final java.lang.String b;

    public dtx(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        charSequence.getClass();
        this.a = defpackage.dte.d(charSequence);
        this.b = defpackage.dte.d(charSequence2);
    }

    @Override // defpackage.dtz
    public final void a(android.os.Bundle bundle) {
        bundle.putString("value", this.a);
        bundle.putString("unit", this.b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.dtx)) {
            return false;
        }
        defpackage.dtx dtxVar = (defpackage.dtx) obj;
        if (this == dtxVar) {
            return true;
        }
        return j$.util.Objects.equals(this.a, dtxVar.a) && j$.util.Objects.equals(this.b, dtxVar.b);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.a, this.b);
    }

    public final java.lang.String toString() {
        return getClass().getSimpleName() + "{mValue=" + this.a + ", mUnit=" + this.b + "}";
    }
}
