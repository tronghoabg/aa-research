package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ydj<F, T> extends defpackage.yms<F> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final defpackage.xyd a;
    final defpackage.yms b;

    public ydj(defpackage.xyd xydVar, defpackage.yms ymsVar) {
        this.a = xydVar;
        this.b = ymsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yms, java.util.Comparator
    public final int compare(F f, F f2) {
        defpackage.xyd xydVar = this.a;
        return this.b.compare(xydVar.a(f), xydVar.a(f2));
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ydj) {
            defpackage.ydj ydjVar = (defpackage.ydj) obj;
            if (this.a.equals(ydjVar.a) && this.b.equals(ydjVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.a, this.b);
    }

    public final java.lang.String toString() {
        return "Ordering.natural().reverse().onResultOf(" + this.a.toString() + ")";
    }
}
