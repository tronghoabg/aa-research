package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class bym extends defpackage.cfe {
    public java.lang.Object a;

    public bym(long j, java.lang.Object obj) {
        super(j);
        this.a = obj;
    }

    @Override // defpackage.cfe
    public final /* bridge */ /* synthetic */ defpackage.cfe a(long j) {
        return new defpackage.bym(j, this.a);
    }

    @Override // defpackage.cfe
    public final void b(defpackage.cfe cfeVar) {
        cfeVar.getClass();
        this.a = ((defpackage.bym) cfeVar).a;
    }
}
