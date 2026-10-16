package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class tfs implements defpackage.yqt {
    private final defpackage.yqt a;
    private java.lang.Object[] b;

    public tfs(defpackage.yqt yqtVar) {
        this.a = yqtVar;
    }

    @Override // defpackage.yqt
    public final long am() {
        return this.a.am();
    }

    @Override // defpackage.yqt
    public final defpackage.ypp an() {
        return this.a.an();
    }

    @Override // defpackage.yqt
    public final defpackage.yqy c() {
        return this.a.c();
    }

    @Override // defpackage.yqt
    public final defpackage.yrv d() {
        return this.a.d();
    }

    @Override // defpackage.yqt
    public final java.lang.Object e() {
        return this.a.e();
    }

    @Override // defpackage.yqt
    public final java.lang.String f() {
        throw null;
    }

    @Override // defpackage.yqt
    public final java.util.logging.Level g() {
        return this.a.g();
    }

    @Override // defpackage.yqt
    public final boolean h() {
        throw null;
    }

    @Override // defpackage.yqt
    public final java.lang.Object[] i() {
        vqr vqrVar;
        java.lang.Object[] objArr = this.b;
        if (objArr != null) {
            return objArr;
        }
        java.lang.Object[] objArrI = this.a.i();
        int i = 0;
        for (java.lang.Object obj : objArrI) {
            if (obj instanceof defpackage.zkf) {
                this.b = new java.lang.Object[objArrI.length];
                while (true) {
                    int length = objArrI.length;
                    java.lang.Object[] objArr2 = this.b;
                    if (i >= length) {
                        return objArr2;
                    }
                    java.lang.Object vqoVar = objArrI[i];
                    if (vqoVar instanceof defpackage.zkf) {
                        java.lang.Object obj2 = ((defpackage.zkf) vqoVar).b;
                        if (obj2 instanceof java.lang.Boolean) {
                            vqrVar = new defpackage.vqp(((java.lang.Boolean) obj2).booleanValue());
                        } else if (obj2 instanceof java.lang.Class) {
                            vqrVar = new defpackage.vqs((java.lang.Class) obj2);
                        } else if (obj2 instanceof defpackage.vlu) {
                            vqrVar = new defpackage.vqs((defpackage.vlu) obj2);
                        } else if (obj2 instanceof java.lang.Character) {
                            vqrVar = new defpackage.vqs(((java.lang.Character) obj2).charValue());
                        } else if (obj2 instanceof java.lang.Enum) {
                            vqrVar = new defpackage.vqs((java.lang.Enum) obj2);
                        } else if (obj2 instanceof defpackage.aboj) {
                            vqrVar = new vqr(((defpackage.aboj) obj2).a());
                        } else if (obj2 instanceof java.lang.Float) {
                            vqoVar = new vqm(((java.lang.Number) obj2).doubleValue());
                        } else if (obj2 instanceof java.lang.Double) {
                            vqoVar = new vqm(((java.lang.Double) obj2).doubleValue());
                        } else {
                            vqoVar = obj2 instanceof java.lang.Number ? new defpackage.vqo(((java.lang.Number) obj2).longValue()) : new defpackage.vqs("CLP conversion failed");
                        }
                        vqoVar = vqrVar;
                    }
                    objArr2[i] = vqoVar;
                    i++;
                }
            }
        }
        this.b = objArrI;
        return objArrI;
    }
}
