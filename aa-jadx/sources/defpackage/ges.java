package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ges implements defpackage.gdu {
    public final defpackage.gdu a;
    public boolean b;
    final /* synthetic */ defpackage.get c;

    public ges(defpackage.get getVar, defpackage.epy epyVar, defpackage.gdu gduVar) {
        this.c = getVar;
        this.a = gduVar;
        epyVar.c(new defpackage.ger(this, getVar));
    }

    @Override // defpackage.gdu
    public final boolean a() {
        if (this.b) {
            return this.a.a();
        }
        return false;
    }
}
