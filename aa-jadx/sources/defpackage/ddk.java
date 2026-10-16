package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ddk {
    public final int a;
    public float b;
    private final defpackage.affg c;

    public ddk(int i, defpackage.affg affgVar) {
        this.a = i;
        this.c = affgVar;
    }

    public final int a(int i) {
        return defpackage.afqt.g(i - defpackage.afhi.k(this.b), 0, this.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(float f, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.ddj ddjVar;
        if (afdkVar instanceof defpackage.ddj) {
            ddjVar = (defpackage.ddj) afdkVar;
            int i = ddjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ddjVar.c = i - Integer.MIN_VALUE;
            } else {
                ddjVar = new defpackage.ddj(this, afdkVar);
            }
        } else {
            ddjVar = new defpackage.ddj(this, afdkVar);
        }
        java.lang.Object objInvoke = ddjVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = ddjVar.c;
        if (i2 == 0) {
            defpackage.afga.cz(objInvoke);
            defpackage.affg affgVar = this.c;
            java.lang.Float f2 = new java.lang.Float(f);
            ddjVar.c = 1;
            objInvoke = affgVar.invoke(f2, ddjVar);
            if (objInvoke == afdrVar) {
                return afdrVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.afga.cz(objInvoke);
        }
        this.b += ((java.lang.Number) objInvoke).floatValue();
        return defpackage.afbk.a;
    }

    public final java.lang.Object c(float f, defpackage.afdk afdkVar) throws java.lang.Throwable {
        java.lang.Object objB = b(f - this.b, afdkVar);
        return objB == defpackage.afdr.a ? objB : defpackage.afbk.a;
    }
}
