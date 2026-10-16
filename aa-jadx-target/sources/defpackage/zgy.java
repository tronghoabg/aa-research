package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class zgy implements defpackage.zgm {
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public zgy(defpackage.xvq xvqVar, defpackage.zgm zgmVar, int i) {
        this.c = i;
        this.b = xvqVar;
        this.a = zgmVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, xvq] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, zgm] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, zgm] */
    @Override // defpackage.zgm
    public final defpackage.zhs a() throws java.lang.Exception {
        if (this.c == 0) {
            if (((defpackage.zha) this.a).compareAndSet(defpackage.zgz.a, defpackage.zgz.c)) {
                return this.b.a();
            }
            defpackage.zhn zhnVar = defpackage.zhn.a;
            return zhnVar == null ? new defpackage.zhn() : zhnVar;
        }
        defpackage.nrr nrrVar = (defpackage.nrr) defpackage.xuy.c.get();
        java.lang.Object obj = nrrVar.b;
        defpackage.xvq xvqVarH = defpackage.xuy.h(nrrVar, this.b);
        try {
            defpackage.zhs zhsVarA = this.a.a();
            java.lang.Object obj2 = nrrVar.b;
            defpackage.xuy.h(nrrVar, xvqVarH);
            zhsVarA.getClass();
            return zhsVarA;
        } catch (java.lang.Throwable th) {
            try {
                xuu.a(th);
                throw th;
            } catch (java.lang.Throwable th2) {
                java.lang.Object obj3 = nrrVar.b;
                defpackage.xuy.h(nrrVar, xvqVarH);
                throw th2;
            }
        }
    }

    public final java.lang.String toString() {
        if (this.c == 0) {
            return this.b.toString();
        }
        return "propagating=[" + this.a + "]";
    }

    public zgy(defpackage.zha zhaVar, defpackage.zgm zgmVar, int i) {
        this.c = i;
        this.a = zhaVar;
        this.b = zgmVar;
    }
}
