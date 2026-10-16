package defpackage;

/* loaded from: classes.dex */
public final class djt implements diz {
    public final int a;
    private final deu b;

    public djt(String str, int i) {
        this.b = new deu(str);
        this.a = i;
    }

    @Override // defpackage.diz
    public final void a(dja djaVar) {
        if (djaVar.k()) {
            int i = djaVar.c;
            djaVar.h(i, djaVar.d, b());
            if (b().length() > 0) {
                djaVar.i(i, b().length() + i);
            }
        } else {
            int i2 = djaVar.a;
            djaVar.h(i2, djaVar.b, b());
            if (b().length() > 0) {
                djaVar.i(i2, b().length() + i2);
            }
        }
        int iB = djaVar.b();
        int i3 = this.a;
        int i4 = iB + i3;
        int iG = afpt.g(i3 > 0 ? i4 - 1 : i4 - b().length(), 0, djaVar.c());
        djaVar.j(iG, iG);
    }

    public final String b() {
        return this.b.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djt)) {
            return false;
        }
        djt djtVar = (djt) obj;
        return affa.f(b(), djtVar.b()) && this.a == djtVar.a;
    }

    public final int hashCode() {
        return (b().hashCode() * 31) + this.a;
    }

    public final String toString() {
        return "SetComposingTextCommand(text='" + b() + "', newCursorPosition=" + this.a + ")";
    }
}
