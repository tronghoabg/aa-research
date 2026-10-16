package defpackage;

/* loaded from: classes3.dex */
public final class uie {
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public final ujf a(uju ujuVar, int i) {
        return b(ujuVar, i, aekj.a);
    }

    public final ujf b(uju ujuVar, int i, aekf aekfVar) {
        if (ujuVar.c()) {
            return ujf.c;
        }
        if (!ujuVar.b()) {
            ukf ukfVarE = ujuVar.e((ukh) this.a, null, null);
            Object obj = this.c;
            ukf ukfVarI = obj != null ? ukfVarE.i(((ujk) obj).L) : null;
            return ukfVarI != null ? ukfVarI.g(i) : ukfVarE.g(i);
        }
        Object obj2 = this.b;
        Object obj3 = this.d;
        if (obj2 == null) {
            return ujf.c;
        }
        int i2 = ujuVar.e;
        if (i2 != 0) {
            return ((ukh) obj2).b(i2).f(i);
        }
        long j = ujuVar.c;
        if (j != -1) {
            return ((ukh) obj2).c(uju.d(j, (rhj) obj3, aekfVar)).g(i);
        }
        int i3 = ujuVar.d;
        if (i3 != -1) {
            return ((ukh) obj2).c(i3).g(i);
        }
        return ujf.c;
    }

    public final ukf c(uju ujuVar) {
        return d(ujuVar, aekj.a);
    }

    public final ukf d(uju ujuVar, aekf aekfVar) {
        if (ujuVar.c()) {
            return ukf.a;
        }
        if (ujuVar.b()) {
            return ujuVar.e((ukh) this.b, (rhj) this.d, aekfVar);
        }
        ukf ukfVarE = ujuVar.e((ukh) this.a, null, null);
        Object obj = this.c;
        ukf ukfVarI = obj != null ? ukfVarE.i(((ujk) obj).L) : null;
        return ukfVarI != null ? ukfVarI : ukfVarE;
    }

    public final ujf e(ukd ukdVar) {
        return b(ukdVar.v, ukdVar.w, aekj.a);
    }

    public final ujf f(ukd ukdVar, aekf aekfVar) {
        return b(ukdVar.v, ukdVar.w, aekfVar);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, ywg] */
    public final qak g() {
        Object obj = this.c;
        obj.getClass();
        Object obj2 = this.a;
        obj2.getClass();
        return new qak((pzw) obj, (sm) obj2, this.b, (ywb) this.d);
    }

    public final synchronized void h(ywb ywbVar) {
        this.d = ywbVar;
    }

    public final olt i() {
        if (this.d == null) {
            int i = yfq.d;
            this.d = yls.a;
        }
        Object obj = this.c;
        Object obj2 = this.b;
        return new olt((olv) obj, (String) obj2, (olu) this.a, (yfq) this.d);
    }
}
