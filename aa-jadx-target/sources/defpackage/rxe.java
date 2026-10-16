package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rxe extends defpackage.ijw implements defpackage.rxf {
    public final /* synthetic */ defpackage.shu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rxe(defpackage.shu shuVar) {
        super("com.google.android.gms.car.startup.ICarServiceCallback");
        this.a = shuVar;
    }

    @Override // defpackage.rxf
    public final void e(boolean z) {
        defpackage.yqk yqkVar = defpackage.shu.a;
        if (z) {
            return;
        }
        defpackage.shu.a.h().ai(8961).u("startAdditionalServices failed");
        defpackage.shu shuVar = this.a;
        shuVar.d.post(new defpackage.sho(shuVar.h, 4));
        shuVar.a();
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i == 1) {
            f(true);
        } else if (i == 2) {
            boolean zJ = defpackage.ijx.j(parcel);
            defpackage.ijx.d(parcel);
            f(zJ);
        } else {
            if (i != 3) {
                return false;
            }
            boolean zJ2 = defpackage.ijx.j(parcel);
            defpackage.ijx.d(parcel);
            e(zJ2);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.rxf
    public final void f(boolean z) {
        defpackage.yqk yqkVar = defpackage.shu.a;
        yqkVar.f().ai(8962).y("onStartRequiredServicesComplete: success=%b", java.lang.Boolean.valueOf(z));
        if (z) {
            defpackage.shu shuVar = this.a;
            shuVar.d.post(new defpackage.rzu(this, 7));
        } else {
            yqkVar.h().ai(8963).u("startRequiredServices failed");
            defpackage.shu shuVar2 = this.a;
            shuVar2.d.post(new defpackage.sho(this, 5));
            shuVar2.a();
        }
    }
}
