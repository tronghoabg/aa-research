package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xvv implements defpackage.zgn {
    final /* synthetic */ defpackage.xvq a;
    final /* synthetic */ defpackage.zgn b;

    public xvv(defpackage.xvq xvqVar, defpackage.zgn zgnVar) {
        this.a = xvqVar;
        this.b = zgnVar;
    }

    @Override // defpackage.zgn
    public final defpackage.zhs a(java.lang.Object obj) {
        defpackage.nrr nrrVar = (defpackage.nrr) defpackage.xuy.c.get();
        java.lang.Object obj2 = nrrVar.b;
        defpackage.xvq xvqVarH = defpackage.xuy.h(nrrVar, this.a);
        try {
            defpackage.zhs zhsVarA = this.b.a(obj);
            if (zhsVarA == null) {
                throw new java.lang.IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
            }
            java.lang.Object obj3 = nrrVar.b;
            defpackage.xuy.h(nrrVar, xvqVarH);
            return zhsVarA;
        } catch (java.lang.Throwable th) {
            try {
                xuu.a(th);
                throw th;
            } catch (java.lang.Throwable th2) {
                java.lang.Object obj4 = nrrVar.b;
                defpackage.xuy.h(nrrVar, xvqVarH);
                throw th2;
            }
        }
    }

    public final java.lang.String toString() {
        return "propagating=[" + this.b + "]";
    }
}
