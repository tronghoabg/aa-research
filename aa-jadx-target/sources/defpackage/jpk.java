package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class jpk implements jpx {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ jpk(defpackage.jpy jpyVar, com.google.android.gms.car.display.CarRegionId carRegionId, android.graphics.Rect rect, int i) {
        this.d = i;
        this.c = jpyVar;
        this.b = carRegionId;
        this.a = rect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, qwz] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, qwz] */
    public final void a() throws defpackage.jny, android.os.RemoteException {
        int i = this.d;
        if (i == 0) {
            ((defpackage.jpy) this.a).m().ar((com.google.android.gms.car.display.CarDisplayId) this.b, this.c);
            return;
        }
        if (i == 1) {
            ((defpackage.jpy) this.a).m().aS((com.google.android.gms.car.CarInfo) this.c, (java.lang.String) this.b);
            return;
        }
        if (i == 2) {
            ((defpackage.jpy) this.a).m().as((com.google.android.gms.car.display.CarRegionId) this.b, this.c);
            return;
        }
        if (i == 3) {
            ((defpackage.jpy) this.a).m().ap((com.google.android.gms.car.display.CarDisplayId) this.b, (com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography) this.c);
        } else if (i == 4) {
            ((defpackage.jpy) this.a).m().aW((java.lang.String) this.c, (java.lang.String) this.b);
        } else if (i != 5) {
            ((defpackage.jpy) this.a).m().aX((java.lang.String) this.c, this.b);
        } else {
            ((defpackage.jpy) this.c).m().bl((com.google.android.gms.car.display.CarRegionId) this.b, (android.graphics.Rect) this.a);
        }
    }

    public /* synthetic */ jpk(defpackage.jpy jpyVar, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable abstractSafeParcelable, java.lang.Object obj, int i) {
        this.d = i;
        this.a = jpyVar;
        this.b = abstractSafeParcelable;
        this.c = obj;
    }

    public /* synthetic */ jpk(defpackage.jpy jpyVar, java.lang.Object obj, java.lang.Object obj2, int i) {
        this.d = i;
        this.a = jpyVar;
        this.c = obj;
        this.b = obj2;
    }
}
