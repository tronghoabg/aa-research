package defpackage;

/* loaded from: classes2.dex */
public final class esf {
    public final Object a;
    public final ert b;
    private final int d = 0;
    public boolean c = false;

    public esf(Object obj, ert ertVar) {
        this.a = obj;
        this.b = ertVar;
    }

    public final void a() {
        this.c = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esf)) {
            return false;
        }
        esf esfVar = (esf) obj;
        if (!affa.f(this.a, esfVar.a) || !affa.f(this.b, esfVar.b)) {
            return false;
        }
        int i = esfVar.d;
        return this.c == esfVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 961) + a.f(this.c);
    }

    public final String toString() {
        return "Entry(key=" + this.a + ", store=" + this.b + ", refCount=0, isDisposable=" + this.c + ")";
    }
}
