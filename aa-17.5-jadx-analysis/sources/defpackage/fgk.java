package defpackage;

/* loaded from: classes2.dex */
final class fgk extends fge {
    final /* synthetic */ fgm a;

    public fgk(fgm fgmVar) {
        this.a = fgmVar;
    }

    @Override // defpackage.fge, defpackage.ffz
    public final void a(fgc fgcVar) {
        fgm fgmVar = this.a;
        fgmVar.a.remove(fgcVar);
        if (fgmVar.E()) {
            return;
        }
        fgmVar.u(fgmVar, fgb.c, false);
        fgmVar.q = true;
        fgmVar.u(fgmVar, fgb.b, false);
    }
}
