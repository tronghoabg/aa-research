package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fem extends android.util.Property {
    public fem(java.lang.Class cls) {
        super(cls, "translations");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.fep fepVar = (defpackage.fep) obj;
        android.graphics.PointF pointF = (android.graphics.PointF) obj2;
        fepVar.c = pointF.x;
        fepVar.d = pointF.y;
        fepVar.a();
    }
}
