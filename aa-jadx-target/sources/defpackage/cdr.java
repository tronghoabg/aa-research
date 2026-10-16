package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cdr implements defpackage.bxw {
    public defpackage.cdv a;
    public java.lang.String b;
    public java.lang.Object c;
    public java.lang.Object[] d;
    public defpackage.cdz e;
    public defpackage.rqj f;
    private final defpackage.afer g = new defpackage.bjd(this, 20);

    public cdr(defpackage.cdz cdzVar, defpackage.cdv cdvVar, java.lang.String str, java.lang.Object obj, java.lang.Object[] objArr) {
        this.e = cdzVar;
        this.a = cdvVar;
        this.b = str;
        this.c = obj;
        this.d = objArr;
    }

    public final void d() {
        java.lang.String strG;
        defpackage.cdv cdvVar = this.a;
        defpackage.rqj rqjVar = this.f;
        if (rqjVar != null) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bl(rqjVar, "entry(", ") is not null"));
        }
        if (cdvVar != null) {
            defpackage.afer aferVar = this.g;
            java.lang.Object objInvoke = aferVar.invoke();
            if (objInvoke == null || cdvVar.d(objInvoke)) {
                this.f = cdvVar.e(this.b, aferVar);
                return;
            }
            if (objInvoke instanceof defpackage.ces) {
                defpackage.ces cesVar = (defpackage.ces) objInvoke;
                if (cesVar.f() == defpackage.bxv.b || cesVar.f() == defpackage.bxv.c || cesVar.f() == defpackage.bxv.a) {
                    strG = "MutableState containing " + cesVar.a() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strG = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strG = defpackage.bxi.g(objInvoke);
            }
            throw new java.lang.IllegalArgumentException(strG);
        }
    }

    @Override // defpackage.bxw
    public final void dw() {
        d();
    }

    @Override // defpackage.bxw
    public final void ee() {
        defpackage.rqj rqjVar = this.f;
        if (rqjVar != null) {
            rqjVar.b();
        }
    }

    @Override // defpackage.bxw
    public final void ef() {
        defpackage.rqj rqjVar = this.f;
        if (rqjVar != null) {
            rqjVar.b();
        }
    }
}
