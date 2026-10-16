package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dal implements aiuw {
    public final android.view.View a;
    public final aiuw b;
    public final java.util.concurrent.atomic.AtomicReference c = new java.util.concurrent.atomic.AtomicReference(null);
    public final defpackage.fbl d;

    public dal(android.view.View view, defpackage.fbl fblVar, aiuw aiuwVar) {
        this.a = view;
        this.d = fblVar;
        this.b = aiuwVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.bis bisVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        dak dakVar;
        if (afdkVar instanceof dak) {
            dakVar = (dak) afdkVar;
            int i = dakVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dakVar.c = i - Integer.MIN_VALUE;
            } else {
                dakVar = new dak(this, afdkVar);
            }
        } else {
            dakVar = new dak(this, afdkVar);
        }
        java.lang.Object obj = dakVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = dakVar.c;
        if (i2 == 0) {
            defpackage.afga.cz(obj);
            java.util.concurrent.atomic.AtomicReference atomicReference = this.c;
            defpackage.bpn bpnVar = new defpackage.bpn(bisVar, this, 5, null);
            defpackage.dnf dnfVar = new defpackage.dnf(this, (defpackage.afdk) null, 1);
            dakVar.c = 1;
            if (ahoi.a(new cgi(bpnVar, atomicReference, dnfVar, (defpackage.afdk) null), dakVar) == afdrVar) {
                return afdrVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.afga.cz(obj);
        }
        throw new defpackage.afap();
    }

    public final defpackage.afdo c() {
        return this.b.c();
    }
}
