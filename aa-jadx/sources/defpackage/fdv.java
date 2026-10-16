package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fdv extends android.util.Property {
    public fdv(java.lang.Class cls) {
        super(cls, "bottomRight");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.fec fecVar = (defpackage.fec) obj;
        android.graphics.PointF pointF = (android.graphics.PointF) obj2;
        fecVar.c = java.lang.Math.round(pointF.x);
        fecVar.d = java.lang.Math.round(pointF.y);
        int i = fecVar.f + 1;
        fecVar.f = i;
        if (fecVar.e == i) {
            fecVar.a();
        }
    }
}
