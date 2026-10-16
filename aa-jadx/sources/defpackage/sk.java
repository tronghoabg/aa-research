package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sk {
    public java.lang.Object a;

    public sk(java.lang.String str) {
        this.a = new java.util.HashMap();
        for (java.lang.String str2 : str.split(";")) {
            java.lang.String[] strArrSplit = str2.split(":");
            if (strArrSplit.length == 2) {
                ((java.util.HashMap) this.a).put(strArrSplit[0], strArrSplit[1]);
            }
        }
    }

    public final void a(int i) {
        this.a = java.lang.Integer.valueOf(i | (-16777216));
    }

    public final defpackage.sr b() {
        return new defpackage.sr(this.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final synchronized void c() {
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.ucc) it.next()).x(128);
        }
        this.a = new java.util.ArrayList();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, ucc] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    public final synchronized void d(defpackage.ueq ueqVar) {
        c();
        java.util.Iterator it = defpackage.yfh.a(ueqVar.b, defpackage.yfh.d(ueqVar.c).e(new defpackage.txx(8))).iterator();
        while (it.hasNext()) {
            ?? B = ((defpackage.uel) it.next()).c.b();
            B.w(128);
            this.a.add(B);
        }
    }

    public final java.lang.String e(java.lang.String str) {
        return (java.lang.String) ((java.util.HashMap) this.a).get(str);
    }

    public sk(byte[] bArr) {
    }

    public sk() {
        this.a = androidx.car.app.hardware.common.CarValue.UNKNOWN_INTEGER;
    }

    public sk(defpackage.xrr xrrVar) {
        this.a = xrrVar;
    }

    public sk(byte[] bArr, char[] cArr) {
        this.a = new java.util.ArrayList();
    }

    public sk(com.google.android.material.behavior.SwipeDismissBehavior swipeDismissBehavior) {
        swipeDismissBehavior.d = com.google.android.material.behavior.SwipeDismissBehavior.z(0.1f);
        swipeDismissBehavior.e = com.google.android.material.behavior.SwipeDismissBehavior.z(0.6f);
        swipeDismissBehavior.c = 0;
    }
}
