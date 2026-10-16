package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class pyk {
    public final java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public pyk(lhb lhbVar) {
        this.b = lhbVar;
        this.a = defpackage.nte.c().b().r(defpackage.nta.y);
    }

    public final defpackage.oxp a() throws android.os.RemoteException {
        defpackage.oxj oxjVar = ((defpackage.mac) this.b).f;
        if (oxjVar != null) {
            return oxjVar.f();
        }
        ((defpackage.yqj) ((defpackage.yqj) defpackage.mac.a.g()).ai((char) 4538)).u("Nav service is null when dismissing a suggestion");
        return null;
    }

    public pyk(pym pymVar, pyl pylVar) {
        this.b = pymVar;
        this.a = pylVar;
    }

    public pyk(defpackage.mac macVar) {
        this.b = macVar;
        this.a = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());
    }
}
