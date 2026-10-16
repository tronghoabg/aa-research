package defpackage;

/* loaded from: classes2.dex */
final class fgl extends fge {
    final fgm a;

    public fgl(fgm fgmVar) {
        this.a = fgmVar;
    }

    @Override // defpackage.fge, defpackage.ffz
    public final void b(fgc fgcVar) {
        fgm fgmVar = this.a;
        int i = fgmVar.z - 1;
        fgmVar.z = i;
        if (i == 0) {
            fgmVar.A = false;
            fgmVar.t();
        }
        fgcVar.P(this);
    }

    @Override // defpackage.fge, defpackage.ffz
    public final void f() {
        fgm fgmVar = this.a;
        if (fgmVar.A) {
            return;
        }
        fgmVar.D();
        fgmVar.A = true;
    }
}
