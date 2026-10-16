package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.gms.car.AnalyticsSessionInfo;
import com.google.android.gms.car.CarFacet;
import com.google.android.gms.car.CarFrxEvent;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.CarUiInfo;
import com.google.android.gms.car.CreateAudioPolicyRequest;
import com.google.android.gms.car.CreateAudioRecordRequest;
import com.google.android.gms.car.MediaOptions;
import com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.gms.car.lifecycle.CarActivityLayoutConfig;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class qun extends ijn implements qup {
    public qun(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICar");
    }

    @Override // defpackage.qup
    public final qvr A() throws RemoteException {
        qvr qvpVar;
        Parcel parcelGi = gi(18, gh());
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            qvpVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarBluetooth");
            qvpVar = iInterfaceQueryLocalInterface instanceof qvr ? (qvr) iInterfaceQueryLocalInterface : new qvp(strongBinder);
        }
        parcelGi.recycle();
        return qvpVar;
    }

    @Override // defpackage.qup
    public final qvx B() throws RemoteException {
        qvx qvvVar;
        Parcel parcelGi = gi(12, gh());
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            qvvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarCall");
            qvvVar = iInterfaceQueryLocalInterface instanceof qvx ? (qvx) iInterfaceQueryLocalInterface : new qvv(strongBinder);
        }
        parcelGi.recycle();
        return qvvVar;
    }

    @Override // defpackage.qup
    public final qwl C() throws RemoteException {
        qwl qwjVar;
        Parcel parcelGi = gi(51, gh());
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            qwjVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarGalMonitor");
            qwjVar = iInterfaceQueryLocalInterface instanceof qwl ? (qwl) iInterfaceQueryLocalInterface : new qwj(strongBinder);
        }
        parcelGi.recycle();
        return qwjVar;
    }

    @Override // defpackage.qup
    public final qwu D() throws RemoteException {
        qwu qwsVar;
        Parcel parcelGi = gi(14, gh());
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            qwsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarMediaPlaybackStatus");
            qwsVar = iInterfaceQueryLocalInterface instanceof qwu ? (qwu) iInterfaceQueryLocalInterface : new qws(strongBinder);
        }
        parcelGi.recycle();
        return qwsVar;
    }

    @Override // defpackage.qup
    public final qxa E() throws RemoteException {
        qxa qwyVar;
        Parcel parcelGi = gi(17, gh());
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            qwyVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarMessage");
            qwyVar = iInterfaceQueryLocalInterface instanceof qxa ? (qxa) iInterfaceQueryLocalInterface : new qwy(strongBinder);
        }
        parcelGi.recycle();
        return qwyVar;
    }

    @Override // defpackage.qup
    public final qxj F() throws RemoteException {
        qxj qxhVar;
        Parcel parcelGi = gi(9, gh());
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            qxhVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarNavigationStatus");
            qxhVar = iInterfaceQueryLocalInterface instanceof qxj ? (qxj) iInterfaceQueryLocalInterface : new qxh(strongBinder);
        }
        parcelGi.recycle();
        return qxhVar;
    }

    @Override // defpackage.qup
    public final qxp G() throws RemoteException {
        qxp qxnVar;
        Parcel parcelGi = gi(57, gh());
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            qxnVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarPhoneStatus");
            qxnVar = iInterfaceQueryLocalInterface instanceof qxp ? (qxp) iInterfaceQueryLocalInterface : new qxn(strongBinder);
        }
        parcelGi.recycle();
        return qxnVar;
    }

    @Override // defpackage.qup
    public final qxp H() throws RemoteException {
        qxp qxnVar;
        Parcel parcelGi = gi(16, gh());
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            qxnVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarPhoneStatus");
            qxnVar = iInterfaceQueryLocalInterface instanceof qxp ? (qxp) iInterfaceQueryLocalInterface : new qxn(strongBinder);
        }
        parcelGi.recycle();
        return qxnVar;
    }

    @Override // defpackage.qup
    public final qyb I() throws RemoteException {
        qyb qxzVar;
        Parcel parcelGi = gi(35, gh());
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            qxzVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarRadio");
            qxzVar = iInterfaceQueryLocalInterface instanceof qyb ? (qyb) iInterfaceQueryLocalInterface : new qxz(strongBinder);
        }
        parcelGi.recycle();
        return qxzVar;
    }

    @Override // defpackage.qup
    public final qyh J() throws RemoteException {
        qyh qyfVar;
        Parcel parcelGi = gi(7, gh());
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            qyfVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarSensor");
            qyfVar = iInterfaceQueryLocalInterface instanceof qyh ? (qyh) iInterfaceQueryLocalInterface : new qyf(strongBinder);
        }
        parcelGi.recycle();
        return qyfVar;
    }

    @Override // defpackage.qup
    public final qyq K(String str) throws RemoteException {
        qyq qyoVar;
        Parcel parcelGh = gh();
        parcelGh.writeString(str);
        Parcel parcelGi = gi(13, parcelGh);
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            qyoVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarVendorExtension");
            qyoVar = iInterfaceQueryLocalInterface instanceof qyq ? (qyq) iInterfaceQueryLocalInterface : new qyo(strongBinder);
        }
        parcelGi.recycle();
        return qyoVar;
    }

    @Override // defpackage.qup
    public final qzf L() throws RemoteException {
        qzf qzdVar;
        Parcel parcelGi = gi(47, gh());
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            qzdVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarWindowManager");
            qzdVar = iInterfaceQueryLocalInterface instanceof qzf ? (qzf) iInterfaceQueryLocalInterface : new qzd(strongBinder);
        }
        parcelGi.recycle();
        return qzdVar;
    }

    @Override // defpackage.qup
    public final qzi M() throws RemoteException {
        qzi qzgVar;
        Parcel parcelGi = gi(52, gh());
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            qzgVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.IConnectionController");
            qzgVar = iInterfaceQueryLocalInterface instanceof qzi ? (qzi) iInterfaceQueryLocalInterface : new qzg(strongBinder);
        }
        parcelGi.recycle();
        return qzgVar;
    }

    @Override // defpackage.qup
    public final rho N() throws RemoteException {
        rho rhmVar;
        Parcel parcelGi = gi(99, gh());
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            rhmVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.carlocalmedia.ICarLocalMedia");
            rhmVar = iInterfaceQueryLocalInterface instanceof rho ? (rho) iInterfaceQueryLocalInterface : new rhm(strongBinder);
        }
        parcelGi.recycle();
        return rhmVar;
    }

    @Override // defpackage.qup
    public final rim O() throws RemoteException {
        rim rikVar;
        Parcel parcelGi = gi(98, gh());
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            rikVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.control.ICarControl");
            rikVar = iInterfaceQueryLocalInterface instanceof rim ? (rim) iInterfaceQueryLocalInterface : new rik(strongBinder);
        }
        parcelGi.recycle();
        return rikVar;
    }

    @Override // defpackage.qup
    public final rjb P() throws RemoteException {
        rjb rizVar;
        Parcel parcelGi = gi(32, gh());
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            rizVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.diagnostics.ICarDiagnostics");
            rizVar = iInterfaceQueryLocalInterface instanceof rjb ? (rjb) iInterfaceQueryLocalInterface : new riz(strongBinder);
        }
        parcelGi.recycle();
        return rizVar;
    }

    @Override // defpackage.qup
    public final rjm Q(CarDisplayId carDisplayId) throws RemoteException {
        rjm rjkVar;
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carDisplayId);
        Parcel parcelGi = gi(100, parcelGh);
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            rjkVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.display.integratedoverlay.IIntegratedOverlayManager");
            rjkVar = iInterfaceQueryLocalInterface instanceof rjm ? (rjm) iInterfaceQueryLocalInterface : new rjk(strongBinder);
        }
        parcelGi.recycle();
        return rjkVar;
    }

    @Override // defpackage.qup
    public final rka R() throws RemoteException {
        rka rjyVar;
        Parcel parcelGi = gi(95, gh());
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            rjyVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.display.manager.ICarDisplayActionsController");
            rjyVar = iInterfaceQueryLocalInterface instanceof rka ? (rka) iInterfaceQueryLocalInterface : new rjy(strongBinder);
        }
        parcelGi.recycle();
        return rjyVar;
    }

    @Override // defpackage.qup
    public final rkj S() throws RemoteException {
        rkj rkhVar;
        Parcel parcelGi = gi(77, gh());
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            rkhVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.display.manager.ICarDisplayManager");
            rkhVar = iInterfaceQueryLocalInterface instanceof rkj ? (rkj) iInterfaceQueryLocalInterface : new rkh(strongBinder);
        }
        parcelGi.recycle();
        return rkhVar;
    }

    @Override // defpackage.qup
    public final rkm T() throws RemoteException {
        rkm rkkVar;
        Parcel parcelGi = gi(102, gh());
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            rkkVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.display.manager.ICarDisplayThemingManager");
            rkkVar = iInterfaceQueryLocalInterface instanceof rkm ? (rkm) iInterfaceQueryLocalInterface : new rkk(strongBinder);
        }
        parcelGi.recycle();
        return rkkVar;
    }

    @Override // defpackage.qup
    public final String Y(String str, String str2) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeString(str);
        parcelGh.writeString(str2);
        Parcel parcelGi = gi(23, parcelGh);
        String string = parcelGi.readString();
        parcelGi.recycle();
        return string;
    }

    @Override // defpackage.qup
    public final String Z(String str, String str2) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeString(str);
        parcelGh.writeString(str2);
        Parcel parcelGi = gi(72, parcelGh);
        String string = parcelGi.readString();
        parcelGi.recycle();
        return string;
    }

    @Override // defpackage.qup
    public final void aA(byte[] bArr, int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeByteArray(bArr);
        parcelGh.writeInt(i);
        gj(48, parcelGh);
    }

    @Override // defpackage.qup
    public final void aB(CarFacet carFacet) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carFacet);
        gj(28, parcelGh);
    }

    @Override // defpackage.qup
    public final void aC(CarFrxEvent carFrxEvent) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carFrxEvent);
        gj(34, parcelGh);
    }

    @Override // defpackage.qup
    public final void aJ(qus qusVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qusVar);
        gj(78, parcelGh);
    }

    @Override // defpackage.qup
    public final void aK(quv quvVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, quvVar);
        gj(20, parcelGh);
    }

    @Override // defpackage.qup
    public final void aL(quy quyVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, quyVar);
        gj(92, parcelGh);
    }

    @Override // defpackage.qup
    public final void aM(qwg qwgVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qwgVar);
        gj(5, parcelGh);
    }

    @Override // defpackage.qup
    public final void aN(rpg rpgVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, rpgVar);
        gj(83, parcelGh);
    }

    @Override // defpackage.qup
    public final void aO(qyn qynVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qynVar);
        gj(65, parcelGh);
    }

    @Override // defpackage.qup
    public final void aR(String str, boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeString(str);
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gj(25, parcelGh);
    }

    @Override // defpackage.qup
    public final void aS(CarInfo carInfo, String str) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carInfo);
        parcelGh.writeString(str);
        gj(42, parcelGh);
    }

    @Override // defpackage.qup
    public final void aT(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gj(60, parcelGh);
    }

    @Override // defpackage.qup
    public final void aU(String str, int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeString(str);
        parcelGh.writeInt(i);
        gj(69, parcelGh);
    }

    @Override // defpackage.qup
    public final void aV(MediaOptions mediaOptions) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, mediaOptions);
        gj(105, parcelGh);
    }

    @Override // defpackage.qup
    public final void aW(String str, String str2) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeString(str);
        parcelGh.writeString(str2);
        gj(24, parcelGh);
    }

    @Override // defpackage.qup
    public final void aX(String str, List list) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeString(str);
        parcelGh.writeStringList(list);
        gj(56, parcelGh);
    }

    @Override // defpackage.qup
    public final void aY(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gj(104, parcelGh);
    }

    @Override // defpackage.qup
    public final void aZ(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gj(85, parcelGh);
    }

    @Override // defpackage.qup
    public final List aa() throws RemoteException {
        Parcel parcelGi = gi(37, gh());
        ArrayList arrayListCreateTypedArrayList = parcelGi.createTypedArrayList(CarInfo.CREATOR);
        parcelGi.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.qup
    public final List ab(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        Parcel parcelGi = gi(86, parcelGh);
        ArrayList arrayListCreateTypedArrayList = parcelGi.createTypedArrayList(ComponentName.CREATOR);
        parcelGi.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.qup
    public final List ac() throws RemoteException {
        Parcel parcelGi = gi(38, gh());
        ArrayList arrayListCreateTypedArrayList = parcelGi.createTypedArrayList(CarInfo.CREATOR);
        parcelGi.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.qup
    public final List ad(String str, List list) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeString(str);
        parcelGh.writeStringList(list);
        Parcel parcelGi = gi(55, parcelGh);
        ArrayList<String> arrayListCreateStringArrayList = parcelGi.createStringArrayList();
        parcelGi.recycle();
        return arrayListCreateStringArrayList;
    }

    @Override // defpackage.qup
    public final List ae(Intent intent, int i) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, intent);
        parcelGh.writeInt(i);
        Parcel parcelGi = gi(96, parcelGh);
        ArrayList arrayListCreateTypedArrayList = parcelGi.createTypedArrayList(ComponentName.CREATOR);
        parcelGi.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.qup
    public final List af(Intent intent, int i) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, intent);
        parcelGh.writeInt(i);
        Parcel parcelGi = gi(40, parcelGh);
        ArrayList arrayListCreateTypedArrayList = parcelGi.createTypedArrayList(ResolveInfo.CREATOR);
        parcelGi.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.qup
    public final List ag(Intent intent, int i) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, intent);
        parcelGh.writeInt(i);
        Parcel parcelGi = gi(97, parcelGh);
        ArrayList arrayListCreateTypedArrayList = parcelGi.createTypedArrayList(ComponentName.CREATOR);
        parcelGi.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.qup
    public final List ah(Intent intent, int i) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, intent);
        parcelGh.writeInt(i);
        Parcel parcelGi = gi(88, parcelGh);
        ArrayList arrayListCreateTypedArrayList = parcelGi.createTypedArrayList(ResolveInfo.CREATOR);
        parcelGi.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.qup
    public final List ai(Intent intent) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, intent);
        Parcel parcelGi = gi(11, parcelGh);
        ArrayList arrayListCreateTypedArrayList = parcelGi.createTypedArrayList(ResolveInfo.CREATOR);
        parcelGi.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.qup
    public final void ap(CarDisplayId carDisplayId, ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carDisplayId);
        ijp.g(parcelGh, projectionWindowAnimationChoreography);
        gj(94, parcelGh);
    }

    @Override // defpackage.qup
    public final void aq(qwd qwdVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qwdVar);
        gj(29, parcelGh);
    }

    @Override // defpackage.qup
    public final void ar(CarDisplayId carDisplayId, qwd qwdVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carDisplayId);
        ijp.i(parcelGh, qwdVar);
        gj(82, parcelGh);
    }

    @Override // defpackage.qup
    public final void as(CarRegionId carRegionId, qwd qwdVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carRegionId);
        ijp.i(parcelGh, qwdVar);
        gj(106, parcelGh);
    }

    @Override // defpackage.qup
    public final void av() throws RemoteException {
        gj(22, gh());
    }

    @Override // defpackage.qup
    public final void aw(CarInfo carInfo) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carInfo);
        gj(39, parcelGh);
    }

    @Override // defpackage.qup
    public final boolean bA(Intent intent, Bundle bundle) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, intent);
        ijp.g(parcelGh, bundle);
        Parcel parcelGi = gi(75, parcelGh);
        int i = parcelGi.readInt();
        parcelGi.recycle();
        return i != 0;
    }

    @Override // defpackage.qup
    public final byte[] bB() throws RemoteException {
        Parcel parcelGi = gi(87, gh());
        byte[] bArrCreateByteArray = parcelGi.createByteArray();
        parcelGi.recycle();
        return bArrCreateByteArray;
    }

    @Override // defpackage.qup
    public final qwq bC() throws RemoteException {
        qwq qwqVar;
        Parcel parcelGi = gi(15, gh());
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            qwqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarMediaBrowser");
            qwqVar = iInterfaceQueryLocalInterface instanceof qwq ? (qwq) iInterfaceQueryLocalInterface : new qwq(strongBinder);
        }
        parcelGi.recycle();
        return qwqVar;
    }

    @Override // defpackage.qup
    public final void bb(CarRegionId carRegionId) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carRegionId);
        gj(91, parcelGh);
    }

    @Override // defpackage.qup
    public final void bd(qus qusVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qusVar);
        gj(79, parcelGh);
    }

    @Override // defpackage.qup
    public final void be(quv quvVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, quvVar);
        gj(21, parcelGh);
    }

    @Override // defpackage.qup
    public final void bf() throws RemoteException {
        gj(93, gh());
    }

    @Override // defpackage.qup
    public final void bg(qwg qwgVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qwgVar);
        gj(6, parcelGh);
    }

    @Override // defpackage.qup
    public final void bh(rpg rpgVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, rpgVar);
        gj(84, parcelGh);
    }

    @Override // defpackage.qup
    public final void bi(qyn qynVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qynVar);
        gj(66, parcelGh);
    }

    @Override // defpackage.qup
    public final void bj(CarActivityLayoutConfig carActivityLayoutConfig) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carActivityLayoutConfig);
        gj(80, parcelGh);
    }

    @Override // defpackage.qup
    public final void bl(CarRegionId carRegionId, Rect rect) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carRegionId);
        ijp.g(parcelGh, rect);
        gj(81, parcelGh);
    }

    @Override // defpackage.qup
    public final boolean bo() throws RemoteException {
        Parcel parcelGi = gi(76, gh());
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.qup
    public final boolean bp(String str, boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeString(str);
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        Parcel parcelGi = gi(19, parcelGh);
        int i = parcelGi.readInt();
        parcelGi.recycle();
        return i != 0;
    }

    @Override // defpackage.qup
    public final boolean bq(String str, boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeString(str);
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        Parcel parcelGi = gi(71, parcelGh);
        int i = parcelGi.readInt();
        parcelGi.recycle();
        return i != 0;
    }

    @Override // defpackage.qup, defpackage.jew
    public final boolean bs() throws RemoteException {
        Parcel parcelGi = gi(3, gh());
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.qup
    public final boolean bv(String str, int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeString(str);
        parcelGh.writeInt(i);
        Parcel parcelGi = gi(41, parcelGh);
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.qup
    public final boolean bw(String str, int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeString(str);
        parcelGh.writeInt(i);
        Parcel parcelGi = gi(58, parcelGh);
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.qup
    public final boolean bx() throws RemoteException {
        Parcel parcelGi = gi(EnergyProfile.EVCONNECTOR_TYPE_OTHER, gh());
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.qup
    public final boolean by(Intent intent) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, intent);
        Parcel parcelGi = gi(10, parcelGh);
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.qup
    public final double ge(String str, double d) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeString(str);
        parcelGh.writeDouble(d);
        Parcel parcelGi = gi(74, parcelGh);
        double d2 = parcelGi.readDouble();
        parcelGi.recycle();
        return d2;
    }

    @Override // defpackage.qup
    public final int gf(String str, int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeString(str);
        parcelGh.writeInt(i);
        Parcel parcelGi = gi(68, parcelGh);
        int i2 = parcelGi.readInt();
        parcelGi.recycle();
        return i2;
    }

    @Override // defpackage.qup
    public final int gg() throws RemoteException {
        Parcel parcelGi = gi(107, gh());
        int i = parcelGi.readInt();
        parcelGi.recycle();
        return i;
    }

    @Override // defpackage.qup, defpackage.jew
    public final int h() throws RemoteException {
        Parcel parcelGi = gi(4, gh());
        int i = parcelGi.readInt();
        parcelGi.recycle();
        return i;
    }

    @Override // defpackage.qup
    public final int k(String str, int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeString(str);
        parcelGh.writeInt(i);
        Parcel parcelGi = gi(73, parcelGh);
        int i2 = parcelGi.readInt();
        parcelGi.recycle();
        return i2;
    }

    @Override // defpackage.qup
    public final AnalyticsSessionInfo r() throws RemoteException {
        Parcel parcelGi = gi(103, gh());
        AnalyticsSessionInfo analyticsSessionInfo = (AnalyticsSessionInfo) ijp.a(parcelGi, AnalyticsSessionInfo.CREATOR);
        parcelGi.recycle();
        return analyticsSessionInfo;
    }

    @Override // defpackage.qup
    public final CarInfo s() throws RemoteException {
        Parcel parcelGi = gi(1, gh());
        CarInfo carInfo = (CarInfo) ijp.a(parcelGi, CarInfo.CREATOR);
        parcelGi.recycle();
        return carInfo;
    }

    @Override // defpackage.qup
    public final CarUiInfo u() throws RemoteException {
        Parcel parcelGi = gi(2, gh());
        CarUiInfo carUiInfo = (CarUiInfo) ijp.a(parcelGi, CarUiInfo.CREATOR);
        parcelGi.recycle();
        return carUiInfo;
    }

    @Override // defpackage.qup
    public final qug w(CreateAudioPolicyRequest createAudioPolicyRequest, qud qudVar, quj qujVar) throws RemoteException {
        qug queVar;
        Parcel parcelGh = gh();
        ijp.g(parcelGh, createAudioPolicyRequest);
        ijp.i(parcelGh, qudVar);
        ijp.i(parcelGh, qujVar);
        Parcel parcelGi = gi(89, parcelGh);
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            queVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.IAudioPolicy");
            queVar = iInterfaceQueryLocalInterface instanceof qug ? (qug) iInterfaceQueryLocalInterface : new que(strongBinder);
        }
        parcelGi.recycle();
        return queVar;
    }

    @Override // defpackage.qup
    public final qum x(CreateAudioRecordRequest createAudioRecordRequest, qud qudVar) throws RemoteException {
        qum qukVar;
        Parcel parcelGh = gh();
        ijp.g(parcelGh, createAudioRecordRequest);
        ijp.i(parcelGh, qudVar);
        Parcel parcelGi = gi(90, parcelGh);
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            qukVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.IAudioRecord");
            qukVar = iInterfaceQueryLocalInterface instanceof qum ? (qum) iInterfaceQueryLocalInterface : new quk(strongBinder);
        }
        parcelGi.recycle();
        return qukVar;
    }

    @Override // defpackage.qup
    public final qvb z() throws RemoteException {
        qvb quzVar;
        Parcel parcelGi = gi(8, gh());
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            quzVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarAudio");
            quzVar = iInterfaceQueryLocalInterface instanceof qvb ? (qvb) iInterfaceQueryLocalInterface : new quz(strongBinder);
        }
        parcelGi.recycle();
        return quzVar;
    }
}
