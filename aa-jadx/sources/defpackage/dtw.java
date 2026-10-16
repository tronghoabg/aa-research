package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dtw extends defpackage.dtz {
    public final int a;
    public final java.lang.String b;

    public dtw(int i, java.lang.CharSequence charSequence) {
        this.a = i;
        this.b = defpackage.dte.d(charSequence);
    }

    @Override // defpackage.dtz
    public final void a(android.os.Bundle bundle) {
        bundle.putInt("value", this.a);
        bundle.putString("unit", this.b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.dtw)) {
            return false;
        }
        defpackage.dtw dtwVar = (defpackage.dtw) obj;
        if (this == dtwVar) {
            return true;
        }
        return this.a == dtwVar.a && j$.util.Objects.equals(this.b, dtwVar.b);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(java.lang.Integer.valueOf(this.a), this.b);
    }

    public final java.lang.String toString() {
        return getClass().getSimpleName() + "{mValue=" + this.a + ", mUnit=" + this.b + "}";
    }
}
