package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qvj extends defpackage.ijv implements defpackage.qvl {
    public qvj(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICar");
    }

    @Override // defpackage.qvl
    public final defpackage.qwn A() throws android.os.RemoteException {
        defpackage.qwn qwlVar;
        android.os.Parcel parcelFq = fq(18, fp());
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            qwlVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarBluetooth");
            qwlVar = iInterfaceQueryLocalInterface instanceof defpackage.qwn ? (defpackage.qwn) iInterfaceQueryLocalInterface : new defpackage.qwl(strongBinder);
        }
        parcelFq.recycle();
        return qwlVar;
    }

    @Override // defpackage.qvl
    public final qwt B() throws android.os.RemoteException {
        qwt qwrVar;
        android.os.Parcel parcelFq = fq(12, fp());
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            qwrVar = null;
        } else {
            qwt qwtVarQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarCall");
            qwrVar = qwtVarQueryLocalInterface instanceof qwt ? qwtVarQueryLocalInterface : new defpackage.qwr(strongBinder);
        }
        parcelFq.recycle();
        return qwrVar;
    }

    @Override // defpackage.qvl
    public final qxh C() throws android.os.RemoteException {
        qxh qxfVar;
        android.os.Parcel parcelFq = fq(51, fp());
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            qxfVar = null;
        } else {
            qxh qxhVarQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarGalMonitor");
            qxfVar = qxhVarQueryLocalInterface instanceof qxh ? qxhVarQueryLocalInterface : new qxf(strongBinder);
        }
        parcelFq.recycle();
        return qxfVar;
    }

    @Override // defpackage.qvl
    public final defpackage.qxq D() throws android.os.RemoteException {
        defpackage.qxq qxoVar;
        android.os.Parcel parcelFq = fq(14, fp());
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            qxoVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarMediaPlaybackStatus");
            qxoVar = iInterfaceQueryLocalInterface instanceof defpackage.qxq ? (defpackage.qxq) iInterfaceQueryLocalInterface : new defpackage.qxo(strongBinder);
        }
        parcelFq.recycle();
        return qxoVar;
    }

    @Override // defpackage.qvl
    public final defpackage.qxw E() throws android.os.RemoteException {
        defpackage.qxw qxuVar;
        android.os.Parcel parcelFq = fq(17, fp());
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            qxuVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarMessage");
            qxuVar = iInterfaceQueryLocalInterface instanceof defpackage.qxw ? (defpackage.qxw) iInterfaceQueryLocalInterface : new defpackage.qxu(strongBinder);
        }
        parcelFq.recycle();
        return qxuVar;
    }

    @Override // defpackage.qvl
    public final defpackage.qyf F() throws android.os.RemoteException {
        defpackage.qyf qydVar;
        android.os.Parcel parcelFq = fq(9, fp());
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            qydVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarNavigationStatus");
            qydVar = iInterfaceQueryLocalInterface instanceof defpackage.qyf ? (defpackage.qyf) iInterfaceQueryLocalInterface : new defpackage.qyd(strongBinder);
        }
        parcelFq.recycle();
        return qydVar;
    }

    @Override // defpackage.qvl
    public final defpackage.qyl G() throws android.os.RemoteException {
        defpackage.qyl qyjVar;
        android.os.Parcel parcelFq = fq(57, fp());
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            qyjVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarPhoneStatus");
            qyjVar = iInterfaceQueryLocalInterface instanceof defpackage.qyl ? (defpackage.qyl) iInterfaceQueryLocalInterface : new defpackage.qyj(strongBinder);
        }
        parcelFq.recycle();
        return qyjVar;
    }

    @Override // defpackage.qvl
    public final defpackage.qyl H() throws android.os.RemoteException {
        defpackage.qyl qyjVar;
        android.os.Parcel parcelFq = fq(16, fp());
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            qyjVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarPhoneStatus");
            qyjVar = iInterfaceQueryLocalInterface instanceof defpackage.qyl ? (defpackage.qyl) iInterfaceQueryLocalInterface : new defpackage.qyj(strongBinder);
        }
        parcelFq.recycle();
        return qyjVar;
    }

    @Override // defpackage.qvl
    public final defpackage.qyx I() throws android.os.RemoteException {
        defpackage.qyx qyvVar;
        android.os.Parcel parcelFq = fq(35, fp());
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            qyvVar = null;
        } else {
            qyv qyvVarQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarRadio");
            qyvVar = qyvVarQueryLocalInterface instanceof defpackage.qyx ? (defpackage.qyx) qyvVarQueryLocalInterface : new qyv(strongBinder);
        }
        parcelFq.recycle();
        return qyvVar;
    }

    @Override // defpackage.qvl
    public final defpackage.qzd J() throws android.os.RemoteException {
        defpackage.qzd qzbVar;
        android.os.Parcel parcelFq = fq(7, fp());
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            qzbVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarSensor");
            qzbVar = iInterfaceQueryLocalInterface instanceof defpackage.qzd ? (defpackage.qzd) iInterfaceQueryLocalInterface : new defpackage.qzb(strongBinder);
        }
        parcelFq.recycle();
        return qzbVar;
    }

    @Override // defpackage.qvl
    public final defpackage.qzm K(java.lang.String str) throws android.os.RemoteException {
        defpackage.qzm qzkVar;
        android.os.Parcel parcelFp = fp();
        parcelFp.writeString(str);
        android.os.Parcel parcelFq = fq(13, parcelFp);
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            qzkVar = null;
        } else {
            qzk qzkVarQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarVendorExtension");
            qzkVar = qzkVarQueryLocalInterface instanceof defpackage.qzm ? (defpackage.qzm) qzkVarQueryLocalInterface : new qzk(strongBinder);
        }
        parcelFq.recycle();
        return qzkVar;
    }

    @Override // defpackage.qvl
    public final defpackage.rab L() throws android.os.RemoteException {
        defpackage.rab qzzVar;
        android.os.Parcel parcelFq = fq(47, fp());
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            qzzVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarWindowManager");
            qzzVar = iInterfaceQueryLocalInterface instanceof defpackage.rab ? (defpackage.rab) iInterfaceQueryLocalInterface : new defpackage.qzz(strongBinder);
        }
        parcelFq.recycle();
        return qzzVar;
    }

    @Override // defpackage.qvl
    public final defpackage.rae M() throws android.os.RemoteException {
        defpackage.rae racVar;
        android.os.Parcel parcelFq = fq(52, fp());
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            racVar = null;
        } else {
            rac racVarQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.IConnectionController");
            racVar = racVarQueryLocalInterface instanceof defpackage.rae ? (defpackage.rae) racVarQueryLocalInterface : new rac(strongBinder);
        }
        parcelFq.recycle();
        return racVar;
    }

    @Override // defpackage.qvl
    public final defpackage.rik N() throws android.os.RemoteException {
        defpackage.rik riiVar;
        android.os.Parcel parcelFq = fq(99, fp());
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            riiVar = null;
        } else {
            rii riiVarQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.carlocalmedia.ICarLocalMedia");
            riiVar = riiVarQueryLocalInterface instanceof defpackage.rik ? (defpackage.rik) riiVarQueryLocalInterface : new rii(strongBinder);
        }
        parcelFq.recycle();
        return riiVar;
    }

    @Override // defpackage.qvl
    public final defpackage.rji O() throws android.os.RemoteException {
        defpackage.rji rjgVar;
        android.os.Parcel parcelFq = fq(98, fp());
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            rjgVar = null;
        } else {
            rjg rjgVarQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.control.ICarControl");
            rjgVar = rjgVarQueryLocalInterface instanceof defpackage.rji ? (defpackage.rji) rjgVarQueryLocalInterface : new rjg(strongBinder);
        }
        parcelFq.recycle();
        return rjgVar;
    }

    @Override // defpackage.qvl
    public final rjx P() throws android.os.RemoteException {
        rjx rjvVar;
        android.os.Parcel parcelFq = fq(32, fp());
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            rjvVar = null;
        } else {
            rjx rjxVarQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.diagnostics.ICarDiagnostics");
            rjvVar = rjxVarQueryLocalInterface instanceof rjx ? rjxVarQueryLocalInterface : new rjv(strongBinder);
        }
        parcelFq.recycle();
        return rjvVar;
    }

    @Override // defpackage.qvl
    public final defpackage.rki Q(com.google.android.gms.car.display.CarDisplayId carDisplayId) throws android.os.RemoteException {
        defpackage.rki rkgVar;
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carDisplayId);
        android.os.Parcel parcelFq = fq(100, parcelFp);
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            rkgVar = null;
        } else {
            rkg rkgVarQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.display.integratedoverlay.IIntegratedOverlayManager");
            rkgVar = rkgVarQueryLocalInterface instanceof defpackage.rki ? (defpackage.rki) rkgVarQueryLocalInterface : new rkg(strongBinder);
        }
        parcelFq.recycle();
        return rkgVar;
    }

    @Override // defpackage.qvl
    public final defpackage.rkw R() throws android.os.RemoteException {
        defpackage.rkw rkuVar;
        android.os.Parcel parcelFq = fq(95, fp());
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            rkuVar = null;
        } else {
            rku rkuVarQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.display.manager.ICarDisplayActionsController");
            rkuVar = rkuVarQueryLocalInterface instanceof defpackage.rkw ? (defpackage.rkw) rkuVarQueryLocalInterface : new rku(strongBinder);
        }
        parcelFq.recycle();
        return rkuVar;
    }

    @Override // defpackage.qvl
    public final defpackage.rlf S() throws android.os.RemoteException {
        defpackage.rlf rldVar;
        android.os.Parcel parcelFq = fq(77, fp());
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            rldVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.display.manager.ICarDisplayManager");
            rldVar = iInterfaceQueryLocalInterface instanceof defpackage.rlf ? (defpackage.rlf) iInterfaceQueryLocalInterface : new defpackage.rld(strongBinder);
        }
        parcelFq.recycle();
        return rldVar;
    }

    @Override // defpackage.qvl
    public final defpackage.rli T() throws android.os.RemoteException {
        defpackage.rli rlgVar;
        android.os.Parcel parcelFq = fq(102, fp());
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            rlgVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.display.manager.ICarDisplayThemingManager");
            rlgVar = iInterfaceQueryLocalInterface instanceof defpackage.rli ? (defpackage.rli) iInterfaceQueryLocalInterface : new defpackage.rlg(strongBinder);
        }
        parcelFq.recycle();
        return rlgVar;
    }

    @Override // defpackage.qvl
    public final java.lang.String Y(java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeString(str);
        parcelFp.writeString(str2);
        android.os.Parcel parcelFq = fq(23, parcelFp);
        java.lang.String string = parcelFq.readString();
        parcelFq.recycle();
        return string;
    }

    @Override // defpackage.qvl
    public final java.lang.String Z(java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeString(str);
        parcelFp.writeString(str2);
        android.os.Parcel parcelFq = fq(72, parcelFp);
        java.lang.String string = parcelFq.readString();
        parcelFq.recycle();
        return string;
    }

    @Override // defpackage.qvl
    public final void aA(byte[] bArr, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeByteArray(bArr);
        parcelFp.writeInt(i);
        fr(48, parcelFp);
    }

    @Override // defpackage.qvl
    public final void aB(com.google.android.gms.car.CarFacet carFacet) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carFacet);
        fr(28, parcelFp);
    }

    @Override // defpackage.qvl
    public final void aC(com.google.android.gms.car.CarFrxEvent carFrxEvent) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carFrxEvent);
        fr(34, parcelFp);
    }

    @Override // defpackage.qvl
    public final void aJ(qvo qvoVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qvoVar);
        fr(78, parcelFp);
    }

    @Override // defpackage.qvl
    public final void aK(qvr qvrVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qvrVar);
        fr(20, parcelFp);
    }

    @Override // defpackage.qvl
    public final void aL(qvu qvuVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qvuVar);
        fr(92, parcelFp);
    }

    @Override // defpackage.qvl
    public final void aM(defpackage.qxc qxcVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qxcVar);
        fr(5, parcelFp);
    }

    @Override // defpackage.qvl
    public final void aN(defpackage.rqb rqbVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, rqbVar);
        fr(83, parcelFp);
    }

    @Override // defpackage.qvl
    public final void aO(defpackage.qzj qzjVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qzjVar);
        fr(65, parcelFp);
    }

    @Override // defpackage.qvl
    public final void aR(java.lang.String str, boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeString(str);
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(z ? 1 : 0);
        fr(25, parcelFp);
    }

    @Override // defpackage.qvl
    public final void aS(com.google.android.gms.car.CarInfo carInfo, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carInfo);
        parcelFp.writeString(str);
        fr(42, parcelFp);
    }

    @Override // defpackage.qvl
    public final void aT(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(z ? 1 : 0);
        fr(60, parcelFp);
    }

    @Override // defpackage.qvl
    public final void aU(java.lang.String str, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeString(str);
        parcelFp.writeInt(i);
        fr(69, parcelFp);
    }

    @Override // defpackage.qvl
    public final void aV(com.google.android.gms.car.MediaOptions mediaOptions) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, mediaOptions);
        fr(105, parcelFp);
    }

    @Override // defpackage.qvl
    public final void aW(java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeString(str);
        parcelFp.writeString(str2);
        fr(24, parcelFp);
    }

    @Override // defpackage.qvl
    public final void aX(java.lang.String str, java.util.List list) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeString(str);
        parcelFp.writeStringList(list);
        fr(56, parcelFp);
    }

    @Override // defpackage.qvl
    public final void aY(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(z ? 1 : 0);
        fr(104, parcelFp);
    }

    @Override // defpackage.qvl
    public final void aZ(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(z ? 1 : 0);
        fr(85, parcelFp);
    }

    @Override // defpackage.qvl
    public final java.util.List aa() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(37, fp());
        java.util.ArrayList arrayListCreateTypedArrayList = parcelFq.createTypedArrayList(com.google.android.gms.car.CarInfo.CREATOR);
        parcelFq.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.qvl
    public final java.util.List ab(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        android.os.Parcel parcelFq = fq(86, parcelFp);
        java.util.ArrayList arrayListCreateTypedArrayList = parcelFq.createTypedArrayList(android.content.ComponentName.CREATOR);
        parcelFq.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.qvl
    public final java.util.List ac() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(38, fp());
        java.util.ArrayList arrayListCreateTypedArrayList = parcelFq.createTypedArrayList(com.google.android.gms.car.CarInfo.CREATOR);
        parcelFq.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.qvl
    public final java.util.List ad(java.lang.String str, java.util.List list) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeString(str);
        parcelFp.writeStringList(list);
        android.os.Parcel parcelFq = fq(55, parcelFp);
        java.util.ArrayList<java.lang.String> arrayListCreateStringArrayList = parcelFq.createStringArrayList();
        parcelFq.recycle();
        return arrayListCreateStringArrayList;
    }

    @Override // defpackage.qvl
    public final java.util.List ae(android.content.Intent intent, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, intent);
        parcelFp.writeInt(i);
        android.os.Parcel parcelFq = fq(96, parcelFp);
        java.util.ArrayList arrayListCreateTypedArrayList = parcelFq.createTypedArrayList(android.content.ComponentName.CREATOR);
        parcelFq.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.qvl
    public final java.util.List af(android.content.Intent intent, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, intent);
        parcelFp.writeInt(i);
        android.os.Parcel parcelFq = fq(40, parcelFp);
        java.util.ArrayList arrayListCreateTypedArrayList = parcelFq.createTypedArrayList(android.content.pm.ResolveInfo.CREATOR);
        parcelFq.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.qvl
    public final java.util.List ag(android.content.Intent intent, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, intent);
        parcelFp.writeInt(i);
        android.os.Parcel parcelFq = fq(97, parcelFp);
        java.util.ArrayList arrayListCreateTypedArrayList = parcelFq.createTypedArrayList(android.content.ComponentName.CREATOR);
        parcelFq.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.qvl
    public final java.util.List ah(android.content.Intent intent, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, intent);
        parcelFp.writeInt(i);
        android.os.Parcel parcelFq = fq(88, parcelFp);
        java.util.ArrayList arrayListCreateTypedArrayList = parcelFq.createTypedArrayList(android.content.pm.ResolveInfo.CREATOR);
        parcelFq.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.qvl
    public final java.util.List ai(android.content.Intent intent) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, intent);
        android.os.Parcel parcelFq = fq(11, parcelFp);
        java.util.ArrayList arrayListCreateTypedArrayList = parcelFq.createTypedArrayList(android.content.pm.ResolveInfo.CREATOR);
        parcelFq.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.qvl
    public final void ap(com.google.android.gms.car.display.CarDisplayId carDisplayId, com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carDisplayId);
        defpackage.ijx.g(parcelFp, projectionWindowAnimationChoreography);
        fr(94, parcelFp);
    }

    @Override // defpackage.qvl
    public final void aq(qwz qwzVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qwzVar);
        fr(29, parcelFp);
    }

    @Override // defpackage.qvl
    public final void ar(com.google.android.gms.car.display.CarDisplayId carDisplayId, qwz qwzVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carDisplayId);
        defpackage.ijx.i(parcelFp, qwzVar);
        fr(82, parcelFp);
    }

    @Override // defpackage.qvl
    public final void as(com.google.android.gms.car.display.CarRegionId carRegionId, qwz qwzVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carRegionId);
        defpackage.ijx.i(parcelFp, qwzVar);
        fr(106, parcelFp);
    }

    @Override // defpackage.qvl
    public final void av() throws android.os.RemoteException {
        fr(22, fp());
    }

    @Override // defpackage.qvl
    public final void aw(com.google.android.gms.car.CarInfo carInfo) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carInfo);
        fr(39, parcelFp);
    }

    @Override // defpackage.qvl
    public final boolean bA(android.content.Intent intent, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, intent);
        defpackage.ijx.g(parcelFp, bundle);
        android.os.Parcel parcelFq = fq(75, parcelFp);
        int i = parcelFq.readInt();
        parcelFq.recycle();
        return i != 0;
    }

    @Override // defpackage.qvl
    public final byte[] bB() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(87, fp());
        byte[] bArrCreateByteArray = parcelFq.createByteArray();
        parcelFq.recycle();
        return bArrCreateByteArray;
    }

    @Override // defpackage.qvl
    public final qxm bC() throws android.os.RemoteException {
        qxm qxmVar;
        android.os.Parcel parcelFq = fq(15, fp());
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            qxmVar = null;
        } else {
            qxm qxmVarQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarMediaBrowser");
            qxmVar = qxmVarQueryLocalInterface instanceof qxm ? qxmVarQueryLocalInterface : new qxm(strongBinder);
        }
        parcelFq.recycle();
        return qxmVar;
    }

    @Override // defpackage.qvl
    public final void bb(com.google.android.gms.car.display.CarRegionId carRegionId) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carRegionId);
        fr(91, parcelFp);
    }

    @Override // defpackage.qvl
    public final void bd(qvo qvoVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qvoVar);
        fr(79, parcelFp);
    }

    @Override // defpackage.qvl
    public final void be(qvr qvrVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qvrVar);
        fr(21, parcelFp);
    }

    @Override // defpackage.qvl
    public final void bf() throws android.os.RemoteException {
        fr(93, fp());
    }

    @Override // defpackage.qvl
    public final void bg(defpackage.qxc qxcVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qxcVar);
        fr(6, parcelFp);
    }

    @Override // defpackage.qvl
    public final void bh(defpackage.rqb rqbVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, rqbVar);
        fr(84, parcelFp);
    }

    @Override // defpackage.qvl
    public final void bi(defpackage.qzj qzjVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qzjVar);
        fr(66, parcelFp);
    }

    @Override // defpackage.qvl
    public final void bj(com.google.android.gms.car.lifecycle.CarActivityLayoutConfig carActivityLayoutConfig) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carActivityLayoutConfig);
        fr(80, parcelFp);
    }

    @Override // defpackage.qvl
    public final void bl(com.google.android.gms.car.display.CarRegionId carRegionId, android.graphics.Rect rect) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carRegionId);
        defpackage.ijx.g(parcelFp, rect);
        fr(81, parcelFp);
    }

    @Override // defpackage.qvl
    public final boolean bo() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(76, fp());
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.qvl
    public final boolean bp(java.lang.String str, boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeString(str);
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(z ? 1 : 0);
        android.os.Parcel parcelFq = fq(19, parcelFp);
        int i = parcelFq.readInt();
        parcelFq.recycle();
        return i != 0;
    }

    @Override // defpackage.qvl
    public final boolean bq(java.lang.String str, boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeString(str);
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(z ? 1 : 0);
        android.os.Parcel parcelFq = fq(71, parcelFp);
        int i = parcelFq.readInt();
        parcelFq.recycle();
        return i != 0;
    }

    @Override // defpackage.qvl, defpackage.jfe
    public final boolean bs() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(3, fp());
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.qvl
    public final boolean bv(java.lang.String str, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeString(str);
        parcelFp.writeInt(i);
        android.os.Parcel parcelFq = fq(41, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.qvl
    public final boolean bw(java.lang.String str, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeString(str);
        parcelFp.writeInt(i);
        android.os.Parcel parcelFq = fq(58, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.qvl
    public final boolean bx() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(101, fp());
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.qvl
    public final boolean by(android.content.Intent intent) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, intent);
        android.os.Parcel parcelFq = fq(10, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.qvl
    public final double fm(java.lang.String str, double d) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeString(str);
        parcelFp.writeDouble(d);
        android.os.Parcel parcelFq = fq(74, parcelFp);
        double d2 = parcelFq.readDouble();
        parcelFq.recycle();
        return d2;
    }

    @Override // defpackage.qvl
    public final int fn(java.lang.String str, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeString(str);
        parcelFp.writeInt(i);
        android.os.Parcel parcelFq = fq(68, parcelFp);
        int i2 = parcelFq.readInt();
        parcelFq.recycle();
        return i2;
    }

    @Override // defpackage.qvl
    public final int fo() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(107, fp());
        int i = parcelFq.readInt();
        parcelFq.recycle();
        return i;
    }

    @Override // defpackage.qvl, defpackage.jfe
    public final int h() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(4, fp());
        int i = parcelFq.readInt();
        parcelFq.recycle();
        return i;
    }

    @Override // defpackage.qvl
    public final int k(java.lang.String str, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeString(str);
        parcelFp.writeInt(i);
        android.os.Parcel parcelFq = fq(73, parcelFp);
        int i2 = parcelFq.readInt();
        parcelFq.recycle();
        return i2;
    }

    @Override // defpackage.qvl
    public final com.google.android.gms.car.AnalyticsSessionInfo r() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(103, fp());
        com.google.android.gms.car.AnalyticsSessionInfo analyticsSessionInfo = (com.google.android.gms.car.AnalyticsSessionInfo) defpackage.ijx.a(parcelFq, com.google.android.gms.car.AnalyticsSessionInfo.CREATOR);
        parcelFq.recycle();
        return analyticsSessionInfo;
    }

    @Override // defpackage.qvl
    public final com.google.android.gms.car.CarInfo s() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(1, fp());
        com.google.android.gms.car.CarInfo carInfo = (com.google.android.gms.car.CarInfo) defpackage.ijx.a(parcelFq, com.google.android.gms.car.CarInfo.CREATOR);
        parcelFq.recycle();
        return carInfo;
    }

    @Override // defpackage.qvl
    public final com.google.android.gms.car.CarUiInfo u() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(2, fp());
        com.google.android.gms.car.CarUiInfo carUiInfo = (com.google.android.gms.car.CarUiInfo) defpackage.ijx.a(parcelFq, com.google.android.gms.car.CarUiInfo.CREATOR);
        parcelFq.recycle();
        return carUiInfo;
    }

    @Override // defpackage.qvl
    public final qvc w(com.google.android.gms.car.CreateAudioPolicyRequest createAudioPolicyRequest, quz quzVar, qvf qvfVar) throws android.os.RemoteException {
        qvc qvaVar;
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, createAudioPolicyRequest);
        defpackage.ijx.i(parcelFp, quzVar);
        defpackage.ijx.i(parcelFp, qvfVar);
        android.os.Parcel parcelFq = fq(89, parcelFp);
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            qvaVar = null;
        } else {
            qvc qvcVarQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.IAudioPolicy");
            qvaVar = qvcVarQueryLocalInterface instanceof qvc ? qvcVarQueryLocalInterface : new qva(strongBinder);
        }
        parcelFq.recycle();
        return qvaVar;
    }

    @Override // defpackage.qvl
    public final qvi x(com.google.android.gms.car.CreateAudioRecordRequest createAudioRecordRequest, quz quzVar) throws android.os.RemoteException {
        qvi qvgVar;
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, createAudioRecordRequest);
        defpackage.ijx.i(parcelFp, quzVar);
        android.os.Parcel parcelFq = fq(90, parcelFp);
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            qvgVar = null;
        } else {
            qvi qviVarQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.IAudioRecord");
            qvgVar = qviVarQueryLocalInterface instanceof qvi ? qviVarQueryLocalInterface : new qvg(strongBinder);
        }
        parcelFq.recycle();
        return qvgVar;
    }

    @Override // defpackage.qvl
    public final defpackage.qvx z() throws android.os.RemoteException {
        defpackage.qvx qvvVar;
        android.os.Parcel parcelFq = fq(8, fp());
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            qvvVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarAudio");
            qvvVar = iInterfaceQueryLocalInterface instanceof defpackage.qvx ? (defpackage.qvx) iInterfaceQueryLocalInterface : new defpackage.qvv(strongBinder);
        }
        parcelFq.recycle();
        return qvvVar;
    }
}
