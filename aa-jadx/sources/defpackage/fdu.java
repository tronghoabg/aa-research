package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fdu extends android.util.Property {
    public fdu(java.lang.Class cls) {
        super(cls, "topLeft");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.fec fecVar = (defpackage.fec) obj;
        android.graphics.PointF pointF = (android.graphics.PointF) obj2;
        fecVar.a = java.lang.Math.round(pointF.x);
        fecVar.b = java.lang.Math.round(pointF.y);
        int i = fecVar.e + 1;
        fecVar.e = i;
        if (i == fecVar.f) {
            fecVar.a();
        }
    }
}
