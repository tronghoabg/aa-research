package defpackage;

/* loaded from: classes.dex */
public final class diu implements diz {
    public final int a;
    private final deu b;

    public diu(String str, int i) {
        this(new deu(str), i);
    }

    @Override // defpackage.diz
    public final void a(dja djaVar) {
        if (djaVar.k()) {
            djaVar.h(djaVar.c, djaVar.d, b());
        } else {
            djaVar.h(djaVar.a, djaVar.b, b());
        }
        int iB = djaVar.b();
        int i = this.a;
        int i2 = iB + i;
        int iG = afpt.g(i > 0 ? i2 - 1 : i2 - b().length(), 0, djaVar.c());
        djaVar.j(iG, iG);
    }

    public final String b() {
        return this.b.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof diu)) {
            return false;
        }
        diu diuVar = (diu) obj;
        return affa.f(b(), diuVar.b()) && this.a == diuVar.a;
    }

    public final int hashCode() {
        return (b().hashCode() * 31) + this.a;
    }

    public final String toString() {
        return "CommitTextCommand(text='" + b() + "', newCursorPosition=" + this.a + ")";
    }

    public diu(deu deuVar, int i) {
        this.b = deuVar;
        this.a = i;
    }
}
