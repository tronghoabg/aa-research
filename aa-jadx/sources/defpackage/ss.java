package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ss {
    public static int c;
    public final java.lang.Object a;
    public java.lang.Object b;

    public ss(defpackage.drr drrVar) {
        this.b = null;
        this.a = new java.util.ArrayList();
        c++;
        this.b = drrVar;
    }

    public final long a(defpackage.drj drjVar, long j) {
        defpackage.drr drrVar = drjVar.d;
        if (drrVar instanceof defpackage.drn) {
            return j;
        }
        java.util.List list = drjVar.j;
        int size = list.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            defpackage.drh drhVar = (defpackage.drh) list.get(i);
            if (drhVar instanceof defpackage.drj) {
                defpackage.drj drjVar2 = (defpackage.drj) drhVar;
                if (drjVar2.d != drrVar) {
                    jMin = java.lang.Math.min(jMin, a(drjVar2, ((long) drjVar2.e) + j));
                }
            }
        }
        if (drjVar != drrVar.i) {
            return jMin;
        }
        long jA = drrVar.a();
        defpackage.drj drjVar3 = drrVar.h;
        long j2 = j - jA;
        return java.lang.Math.min(java.lang.Math.min(jMin, a(drjVar3, j2)), j2 - ((long) drjVar3.e));
    }

    public final long b(defpackage.drj drjVar, long j) {
        defpackage.drr drrVar = drjVar.d;
        if (drrVar instanceof defpackage.drn) {
            return j;
        }
        java.util.List list = drjVar.j;
        int size = list.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            defpackage.drh drhVar = (defpackage.drh) list.get(i);
            if (drhVar instanceof defpackage.drj) {
                defpackage.drj drjVar2 = (defpackage.drj) drhVar;
                if (drjVar2.d != drrVar) {
                    jMax = java.lang.Math.max(jMax, b(drjVar2, ((long) drjVar2.e) + j));
                }
            }
        }
        if (drjVar != drrVar.h) {
            return jMax;
        }
        long jA = drrVar.a();
        defpackage.drj drjVar3 = drrVar.i;
        long j2 = j + jA;
        return java.lang.Math.max(java.lang.Math.max(jMax, b(drjVar3, j2)), j2 - ((long) drjVar3.e));
    }

    public ss(defpackage.so soVar) {
        this.a = androidx.car.app.media.CarAudioCallbackDelegate.create(soVar);
    }
}
