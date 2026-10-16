package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class esl {
    public final java.lang.Object a;
    public final defpackage.erz b;
    private final int d = 0;
    public boolean c = false;

    public esl(java.lang.Object obj, defpackage.erz erzVar) {
        this.a = obj;
        this.b = erzVar;
    }

    public final void a() {
        this.c = true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.esl)) {
            return false;
        }
        defpackage.esl eslVar = (defpackage.esl) obj;
        if (!defpackage.afga.f(this.a, eslVar.a) || !defpackage.afga.f(this.b, eslVar.b)) {
            return false;
        }
        int i = eslVar.d;
        return this.c == eslVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 961) + defpackage.a.e(this.c);
    }

    public final java.lang.String toString() {
        return "Entry(key=" + this.a + ", store=" + this.b + ", refCount=0, isDisposable=" + this.c + ")";
    }
}
