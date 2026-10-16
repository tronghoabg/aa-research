package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
final class ajxn implements defpackage.ajse {
    public final defpackage.ajsd a;

    public ajxn(defpackage.ajsd ajsdVar) {
        this.a = ajsdVar;
    }

    @Override // defpackage.ajse
    public final defpackage.ajst a(defpackage.ajqh ajqhVar, defpackage.ajqj ajqjVar, defpackage.akca akcaVar) throws defpackage.ajqs {
        java.net.URI uriA = this.a.a(ajqjVar, akcaVar);
        return ajqhVar.p().b.equalsIgnoreCase("HEAD") ? new defpackage.ajsr(uriA) : new defpackage.ajsq(uriA);
    }

    @Override // defpackage.ajse
    public final boolean b(defpackage.ajqh ajqhVar, defpackage.ajqj ajqjVar, defpackage.akca akcaVar) throws defpackage.ajqs {
        return this.a.b(ajqjVar, akcaVar);
    }
}
