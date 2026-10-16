package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uem {
    public final java.lang.Object a;
    public java.lang.Object b;

    public uem() {
        this.a = new java.util.HashMap();
    }

    public final com.google.android.gms.car.RadioProgramInfo a() {
        return new com.google.android.gms.car.RadioProgramInfo((com.google.android.gms.car.RadioProgramSelector) this.a, (com.google.android.gms.car.RadioMetadata) this.b);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final defpackage.pxg b(java.lang.String str) {
        return (defpackage.pxg) this.a.get(str);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void c(defpackage.pxg pxgVar) {
        this.a.put(pxgVar.a, pxgVar);
    }

    public uem(defpackage.ueu ueuVar) {
        this.a = ueuVar;
        this.b = defpackage.xxe.a;
    }

    public uem(com.google.android.gms.car.RadioProgramSelector radioProgramSelector) {
        this.a = radioProgramSelector;
    }
}
