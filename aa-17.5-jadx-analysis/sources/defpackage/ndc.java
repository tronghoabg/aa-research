package defpackage;

/* loaded from: classes2.dex */
final class ndc implements afdr {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ bym d;

    public ndc(boolean z, boolean z2, boolean z3, bym bymVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = bymVar;
    }

    @Override // defpackage.afdr
    public final /* bridge */ /* synthetic */ Object invoke() {
        if ((!this.a || this.b) && !this.c) {
            return ndj.c(this.d);
        }
        return null;
    }
}
