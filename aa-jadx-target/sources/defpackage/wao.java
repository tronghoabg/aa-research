package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class wao implements java.util.function.Function {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ wao(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return this.c != 0 ? j$.util.function.Function.-CC.$default$andThen(this, function) : j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        if (this.c == 0) {
            return new defpackage.waq((android.content.ContentResolver) this.a, (android.net.Uri) this.b);
        }
        com.google.android.gms.car.display.CarRegionGroup carRegionGroup = (com.google.android.gms.car.display.CarRegionGroup) obj;
        for (com.google.android.gms.car.display.CarRegionGroup carRegionGroup2 : ((defpackage.ntb) this.a).j.x()) {
            if (carRegionGroup2.a == carRegionGroup.a) {
                carRegionGroup = carRegionGroup2;
            }
        }
        ((defpackage.yqj) defpackage.ntb.a.l().ai(5401)).M("Adding %s to group %s", this.b, carRegionGroup);
        return carRegionGroup;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return this.c != 0 ? j$.util.function.Function.-CC.$default$compose(this, function) : j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
