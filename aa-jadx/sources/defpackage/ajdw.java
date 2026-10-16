package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class ajdw extends defpackage.aitz implements defpackage.afeb {
    public final defpackage.afdk c;

    public ajdw(defpackage.afdo afdoVar, defpackage.afdk afdkVar) {
        super(afdoVar, true);
        this.c = afdkVar;
    }

    @Override // defpackage.afeb
    public final java.lang.StackTraceElement di() {
        return null;
    }

    @Override // defpackage.afeb
    public final defpackage.afeb dj() {
        defpackage.afdk afdkVar = this.c;
        if (afdkVar instanceof defpackage.afeb) {
            return (defpackage.afeb) afdkVar;
        }
        return null;
    }

    @Override // defpackage.aitz
    protected void f(java.lang.Object obj) {
        defpackage.afdk afdkVar = this.c;
        afdkVar.w(defpackage.ahog.a(obj, afdkVar));
    }

    @Override // defpackage.aiwn
    protected void l(java.lang.Object obj) throws defpackage.aivh {
        defpackage.afdk afdkVar = this.c;
        defpackage.ajdb.a(defpackage.afga.s(afdkVar), defpackage.ahog.a(obj, afdkVar));
    }

    @Override // defpackage.aiwn
    protected final boolean m() {
        return true;
    }

    public void k() {
    }
}
