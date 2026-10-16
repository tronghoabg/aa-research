package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nwi {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.AsstHunPresenter");
    public nuv e;
    private defpackage.nxg f;
    public final android.os.Handler b = new android.os.Handler();
    public java.lang.Runnable d = new defpackage.iri(4);
    private java.lang.Runnable g = new defpackage.iri(5);
    public final defpackage.kxd c = new defpackage.nwh(this, 0);

    public final void a(nuv nuvVar, defpackage.nxg nxgVar, java.lang.Runnable runnable) {
        this.e = nuvVar;
        this.f = nxgVar;
        this.g = runnable;
    }

    public final void b(defpackage.zbd zbdVar) {
        ((defpackage.yqj) a.l().ai((char) 5496)).u("AssistantHunPresenter.logHunEvent");
        defpackage.nxg nxgVar = this.f;
        nvh nvhVar = this.e.c;
        android.app.PendingIntent pendingIntent = nvhVar.c;
        nvb nvbVar = nvhVar.p;
        nvb nvbVar2 = nvhVar.q;
        nvb nvbVar3 = nvhVar.r;
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.SYSTEM_UI_NOTIFICATION, zbdVar);
        defpackage.abor aborVarE = rrvVarH.E();
        aborVarE.t();
        defpackage.zaf zafVar = (defpackage.zaf) aborVarE.b;
        defpackage.zaf zafVar2 = defpackage.zaf.a;
        zafVar.b |= 4;
        zafVar.e = (pendingIntent == null ? 0 : 1) + (nvbVar == null ? 0 : 1) + (nvbVar2 == null ? 0 : 1) + (nvbVar3 != null ? 1 : 0);
        java.lang.String str = nxgVar.b;
        aborVarE.t();
        defpackage.zaf zafVar3 = (defpackage.zaf) aborVarE.b;
        str.getClass();
        zafVar3.b |= 1;
        zafVar3.c = str;
        int iA = nxgVar.c.a();
        aborVarE.t();
        defpackage.zaf zafVar4 = (defpackage.zaf) aborVarE.b;
        zafVar4.d = iA - 1;
        zafVar4.b |= 2;
        long j = nxgVar.d;
        aborVarE.t();
        defpackage.zaf zafVar5 = (defpackage.zaf) aborVarE.b;
        zafVar5.b |= 8;
        zafVar5.f = j;
        boolean z = nxgVar.e;
        aborVarE.t();
        defpackage.zaf zafVar6 = (defpackage.zaf) aborVarE.b;
        zafVar6.b |= 16;
        zafVar6.g = z;
        defpackage.omf.u().f(rrvVarH);
    }

    public final void c() {
        try {
            this.d = this.g;
            defpackage.ebo.n().r(this.c);
            nur nurVar = this.e.c.t;
            nurVar.getClass();
            android.app.PendingIntent pendingIntent = nurVar.i;
            pendingIntent.getClass();
            pendingIntent.send();
            b(defpackage.zbd.oI);
        } catch (android.app.PendingIntent.CanceledException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai((char) 5502)).u("onShow action intent canceled");
            defpackage.ebo.n().I(this.c);
        }
    }

    public final boolean d(nuv nuvVar) {
        nuv nuvVar2 = this.e;
        return nuvVar2 != null && j$.util.Objects.equals(nuvVar.d, nuvVar2.d);
    }

    public final java.lang.String toString() {
        return getClass().getName();
    }
}
