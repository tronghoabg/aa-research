package defpackage;

/* loaded from: classes2.dex */
public final class bss<T> extends cxt<bst<T>> {
    private final amv a;
    private final afeg b;
    private final api c;

    public bss(amv amvVar, afeg afegVar, api apiVar) {
        this.a = amvVar;
        this.b = afegVar;
        this.c = apiVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new bst(this.a, this.b, this.c);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        bst bstVar = (bst) cfxVar;
        amv amvVar = bstVar.a;
        amv amvVar2 = this.a;
        boolean zF = affa.f(amvVar, amvVar2);
        bstVar.a = amvVar2;
        bstVar.b = this.b;
        bstVar.c = this.c;
        if (zF) {
            return;
        }
        bstVar.d = false;
        cjn.u(bstVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bss)) {
            return false;
        }
        bss bssVar = (bss) obj;
        return affa.f(this.a, bssVar.a) && this.b == bssVar.b && this.c == bssVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
