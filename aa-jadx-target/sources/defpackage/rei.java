package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rei extends defpackage.ref {
    public final defpackage.reh l;
    public final defpackage.zhs m;

    public rei(defpackage.reh rehVar, android.os.Looper looper) {
        super(looper);
        this.l = rehVar;
        this.f = (defpackage.rps) new defpackage.nub((java.lang.Object) null).h(new defpackage.ryo(this, 1));
        this.m = defpackage.zhm.v(rehVar.b()).w(new defpackage.kpl(this, 2), new defpackage.tea(new defpackage.stq(android.os.Looper.getMainLooper()), 1));
    }

    @Override // defpackage.ref
    public final defpackage.qvl C() {
        defpackage.reh rehVar = this.l;
        defpackage.ysr.bk(rehVar != null, "Client is not connected yet.");
        defpackage.qvl qvlVarA = rehVar.a();
        qvlVarA.getClass();
        return qvlVarA;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        defpackage.reh rehVar = this.l;
        if (rehVar != null) {
            str = java.lang.String.valueOf(rehVar.getClass()) + "@" + rehVar.hashCode();
        } else {
            str = "null";
        }
        return java.lang.String.valueOf(getClass()) + "@" + hashCode() + "/" + str;
    }
}
