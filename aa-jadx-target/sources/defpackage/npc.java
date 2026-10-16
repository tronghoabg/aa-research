package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class npc {
    public final java.lang.Object a;

    public npc(android.content.Context context) {
        defpackage.qdm qdmVar = new defpackage.qdm();
        qdmVar.c = "com.google.android.enterprise.connectedapps.CrossProfileConnector_Service";
        qdmVar.a = defpackage.qef.DEFAULT;
        qdmVar.b = context;
        this.a = new defpackage.qdn(qdmVar);
    }

    public final defpackage.acaq a(long j) {
        defpackage.abor aborVarA = ((defpackage.abor) this.a).a();
        aborVarA.t();
        defpackage.acaq acaqVar = (defpackage.acaq) aborVarA.b;
        defpackage.acaq acaqVar2 = defpackage.acaq.a;
        acaqVar.b |= 1;
        acaqVar.c = j;
        return (defpackage.acaq) aborVarA.q();
    }

    public final boolean b() {
        return j$.util.DesugarCollections.unmodifiableList(((defpackage.acaq) ((defpackage.abor) this.a).b).d).isEmpty();
    }

    public final void c(defpackage.abor aborVar) {
        defpackage.abor aborVar2 = (defpackage.abor) this.a;
        aborVar2.t();
        defpackage.acaq acaqVar = (defpackage.acaq) aborVar2.b;
        defpackage.acar acarVar = (defpackage.acar) aborVar.q();
        defpackage.acaq acaqVar2 = defpackage.acaq.a;
        acarVar.getClass();
        acaqVar.b();
        acaqVar.d.add(acarVar);
    }

    public final void d(java.lang.String str, java.lang.String str2) {
        defpackage.abor aborVarN = defpackage.acar.a.n();
        if (str != null) {
            aborVarN.t();
            defpackage.acar acarVar = (defpackage.acar) aborVarN.b;
            acarVar.b |= 1;
            acarVar.e = str;
            if (str2 != null) {
                aborVarN.t();
                defpackage.acar acarVar2 = (defpackage.acar) aborVarN.b;
                acarVar2.c = 24;
                acarVar2.d = str2;
                c(aborVarN);
                return;
            }
        }
        throw null;
    }

    public final boolean e() {
        return ((defpackage.qdn) this.a).e().a();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection] */
    public final /* synthetic */ void f(defpackage.eqp eqpVar, java.lang.Object obj) {
        eqpVar.getClass();
        defpackage.afdo afdoVar = defpackage.tcu.a;
        this.a.add(new defpackage.afau(eqpVar, new defpackage.eqs(obj)));
    }

    public npc(byte[] bArr) {
        this.a = defpackage.acaq.a.n();
    }

    public npc(char[] cArr) {
        this.a = new java.util.ArrayList();
    }

    public npc() {
        this.a = new defpackage.lsn(5);
    }
}
