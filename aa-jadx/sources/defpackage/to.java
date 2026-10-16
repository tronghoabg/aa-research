package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class to {
    public final int a;
    public final java.lang.Object b;
    public java.lang.Object c;

    public to(androidx.core.graphics.drawable.IconCompat iconCompat) {
        defpackage.wo woVar = defpackage.wo.a;
        iconCompat.getClass();
        woVar.b(iconCompat);
        this.a = 1;
        this.b = iconCompat;
        this.c = null;
    }

    @java.lang.Deprecated
    public final void a(androidx.car.app.model.CarColor carColor) {
        defpackage.wn.a.a(carColor);
        java.lang.Object obj = this.c;
        if (obj == null) {
            defpackage.tp tpVar = new defpackage.tp();
            tpVar.b(carColor);
            this.c = tpVar.a();
        } else {
            defpackage.tp tpVar2 = new defpackage.tp((androidx.car.app.model.CarIconStyle) obj);
            tpVar2.b(carColor);
            this.c = tpVar2.a();
        }
    }

    public to(java.util.List list, android.view.MotionEvent motionEvent, int i) {
        this.b = list;
        this.c = motionEvent;
        this.a = i;
    }
}
