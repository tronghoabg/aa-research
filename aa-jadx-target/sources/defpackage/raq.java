package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class raq extends defpackage.ijw implements defpackage.rar {
    private final java.lang.ref.WeakReference a;

    public raq(defpackage.imr imrVar) {
        super("com.google.android.gms.car.IProjectionLifecycleCallback");
        this.a = new java.lang.ref.WeakReference(imrVar);
    }

    @Override // defpackage.rar
    public final void e(int i, android.os.Bundle bundle) {
        ((defpackage.yqj) defpackage.imr.a.l().ai(418)).D("onAuthorizationComplete(version:%d, bundle:%s)", i, bundle);
        defpackage.imr imrVar = (defpackage.imr) this.a.get();
        if (imrVar == null) {
            return;
        }
        new defpackage.stq(android.os.Looper.getMainLooper()).post(new defpackage.aq(imrVar, bundle, 10));
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i == 1) {
            int i2 = parcel.readInt();
            android.os.Bundle bundle = (android.os.Bundle) defpackage.ijx.a(parcel, android.os.Bundle.CREATOR);
            defpackage.ijx.d(parcel);
            f(i2, bundle);
        } else {
            if (i != 2) {
                return false;
            }
            int i3 = parcel.readInt();
            android.os.Bundle bundle2 = (android.os.Bundle) defpackage.ijx.a(parcel, android.os.Bundle.CREATOR);
            defpackage.ijx.d(parcel);
            e(i3, bundle2);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.rar
    public final void f(int i, android.os.Bundle bundle) {
        ((defpackage.yqj) defpackage.imr.a.l().ai(419)).D("onProjectionStartComplete(version:%d, bundle:%s)", i, bundle);
        defpackage.imr imrVar = (defpackage.imr) this.a.get();
        if (imrVar == null) {
            return;
        }
        defpackage.imv imvVar = new defpackage.imv(bundle, 1);
        j$.util.Optional optional = imrVar.i;
        if (true == optional.isPresent()) {
            optional.get();
            byte[] byteArray = ((android.os.Bundle) imvVar.a).getByteArray("activity_layout_config");
            if (byteArray == null) {
                throw new java.lang.IllegalStateException("ProjectionLifecycleService must pass a CarActivityLayoutConfig");
            }
            com.google.android.gms.car.lifecycle.CarActivityLayoutConfig carActivityLayoutConfig = (com.google.android.gms.car.lifecycle.CarActivityLayoutConfig) defpackage.sqs.l(byteArray, com.google.android.gms.car.lifecycle.CarActivityLayoutConfig.CREATOR);
            defpackage.dmh.I(carActivityLayoutConfig);
            defpackage.dmh.J(carActivityLayoutConfig);
        }
        new defpackage.stq(android.os.Looper.getMainLooper()).post(new defpackage.aq(imrVar, bundle, 11));
    }
}
