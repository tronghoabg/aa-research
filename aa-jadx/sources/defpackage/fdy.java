package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fdy extends android.util.Property {
    public fdy(java.lang.Class cls) {
        super(cls, "position");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        android.view.View view = (android.view.View) obj;
        android.graphics.PointF pointF = (android.graphics.PointF) obj2;
        int iRound = java.lang.Math.round(pointF.x);
        int iRound2 = java.lang.Math.round(pointF.y);
        defpackage.fha.c(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
    }
}
