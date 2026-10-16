package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dxb extends defpackage.dyb {
    public static final java.lang.String a = defpackage.afgw.b(defpackage.dxb.class).getSimpleName();
    public defpackage.dzg c;
    private java.lang.String d = "No error occurred";
    public final java.util.concurrent.CountDownLatch b = new java.util.concurrent.CountDownLatch(1);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.dxa dxaVar;
        if (afdkVar instanceof defpackage.dxa) {
            dxaVar = (defpackage.dxa) afdkVar;
            int i = dxaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dxaVar.c = i - Integer.MIN_VALUE;
            } else {
                dxaVar = new defpackage.dxa(this, afdkVar);
            }
        } else {
            dxaVar = new defpackage.dxa(this, afdkVar);
        }
        java.lang.Object obj = dxaVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = dxaVar.c;
        try {
            if (i2 == 0) {
                defpackage.afga.cz(obj);
                defpackage.dxp dxpVar = new defpackage.dxp(this, (defpackage.afdk) null, 1);
                dxaVar.c = 1;
                if (defpackage.aibv.a(1000L, dxpVar, dxaVar) == afdrVar) {
                    return afdrVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.afga.cz(obj);
            }
        } catch (defpackage.aixk unused) {
            android.util.Log.i(a, "waitForResponse: coroutine timeout reached");
            this.c = new defpackage.dwv(6);
        }
        defpackage.dzg dzgVar = this.c;
        if (dzgVar != null) {
            return dzgVar;
        }
        defpackage.afga.d("result");
        return null;
    }

    @Override // defpackage.dyc
    public final void b(int i, java.lang.String str) {
        this.c = new defpackage.dwv(i);
        if (str != null) {
            this.d = str;
            android.util.Log.i(a, "onFailure: ".concat(java.lang.String.valueOf(str)));
        }
        this.b.countDown();
    }

    @Override // defpackage.dyc
    public final void c() {
        this.c = new defpackage.dww();
        this.b.countDown();
    }
}
