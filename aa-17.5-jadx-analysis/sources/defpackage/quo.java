package defpackage;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
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
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class quo extends ijo implements qup {
    public quo() {
        super("com.google.android.gms.car.ICar");
    }

    @ResultIgnorabilityUnspecified
    public qwl C() {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    @ResultIgnorabilityUnspecified
    public qwu D() {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    @ResultIgnorabilityUnspecified
    public qxa E() {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    @ResultIgnorabilityUnspecified
    public qxj F() {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    @ResultIgnorabilityUnspecified
    public qxp G() {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    @ResultIgnorabilityUnspecified
    public qxp H() {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    @ResultIgnorabilityUnspecified
    public qyb I() {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    @ResultIgnorabilityUnspecified
    public qyq K(String str) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    @ResultIgnorabilityUnspecified
    public qzf L() {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    @ResultIgnorabilityUnspecified
    public qzi M() {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    public rho N() {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    public rim O() {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    public rjm Q(CarDisplayId carDisplayId) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    public rka R() {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    @ResultIgnorabilityUnspecified
    public rkj S() {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    public rkm T() {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    @ResultIgnorabilityUnspecified
    public String Z(String str, String str2) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    public void aB(CarFacet carFacet) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    public void aJ(qus qusVar) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    @Deprecated
    public void aK(quv quvVar) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    public void aL(quy quyVar) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    public void aN(rpg rpgVar) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    public void aO(qyn qynVar) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    public void aS(CarInfo carInfo, String str) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    public void aT(boolean z) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    public void aU(String str, int i) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    public void aV(MediaOptions mediaOptions) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    public void aX(String str, List list) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    public void aY(boolean z) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    public void aZ(boolean z) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    @ResultIgnorabilityUnspecified
    public List aa() {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    @ResultIgnorabilityUnspecified
    public List ab(int i) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    @ResultIgnorabilityUnspecified
    public List ac() {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    @ResultIgnorabilityUnspecified
    public List ae(Intent intent, int i) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    @ResultIgnorabilityUnspecified
    public List af(Intent intent, int i) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    @ResultIgnorabilityUnspecified
    public List ag(Intent intent, int i) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    @ResultIgnorabilityUnspecified
    public List ah(Intent intent, int i) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    @ResultIgnorabilityUnspecified
    public List ai(Intent intent) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    public void ap(CarDisplayId carDisplayId, ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    public void aq(qwd qwdVar) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    public void ar(CarDisplayId carDisplayId, qwd qwdVar) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    public void as(CarRegionId carRegionId, qwd qwdVar) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    public void av() {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    public void aw(CarInfo carInfo) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    @ResultIgnorabilityUnspecified
    public boolean bA(Intent intent, Bundle bundle) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    @ResultIgnorabilityUnspecified
    public byte[] bB() {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    @ResultIgnorabilityUnspecified
    public qwq bC() {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    public void bb(CarRegionId carRegionId) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    public void bd(qus qusVar) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    @Deprecated
    public void be(quv quvVar) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    public void bf() {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    public void bh(rpg rpgVar) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    public void bi(qyn qynVar) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    public void bj(CarActivityLayoutConfig carActivityLayoutConfig) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    public void bl(CarRegionId carRegionId, Rect rect) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    @ResultIgnorabilityUnspecified
    public boolean bo() {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    @ResultIgnorabilityUnspecified
    public boolean bv(String str, int i) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    @ResultIgnorabilityUnspecified
    public boolean bw(String str, int i) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    public boolean bx() {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    @ResultIgnorabilityUnspecified
    public boolean by(Intent intent) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        boolean z;
        qud qubVar;
        qwg qweVar = null;
        qwd qwbVar = null;
        quy quwVar = null;
        qud qubVar2 = null;
        quj quhVar = null;
        rpg rpeVar = null;
        rpg rpeVar2 = null;
        qwd qwbVar2 = null;
        qus quqVar = null;
        qus quqVar2 = null;
        qyn qylVar = null;
        qyn qylVar2 = null;
        qwd qwbVar3 = null;
        quv qutVar = null;
        quv qutVar2 = null;
        qwg qweVar2 = null;
        switch (i) {
            case 1:
                CarInfo carInfoS = s();
                parcel2.writeNoException();
                ijp.h(parcel2, carInfoS);
                return true;
            case 2:
                CarUiInfo carUiInfoU = u();
                parcel2.writeNoException();
                ijp.h(parcel2, carUiInfoU);
                return true;
            case 3:
                boolean zBs = bs();
                parcel2.writeNoException();
                ClassLoader classLoader = ijp.a;
                parcel2.writeInt(zBs ? 1 : 0);
                return true;
            case 4:
                int iH = h();
                parcel2.writeNoException();
                parcel2.writeInt(iH);
                return true;
            case 5:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarConnectionListener");
                    qweVar = iInterfaceQueryLocalInterface instanceof qwg ? (qwg) iInterfaceQueryLocalInterface : new qwe(strongBinder);
                }
                ijp.d(parcel);
                aM(qweVar);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.ICarConnectionListener");
                    qweVar2 = iInterfaceQueryLocalInterface2 instanceof qwg ? (qwg) iInterfaceQueryLocalInterface2 : new qwe(strongBinder2);
                }
                ijp.d(parcel);
                bg(qweVar2);
                parcel2.writeNoException();
                return true;
            case 7:
                qyh qyhVarJ = J();
                parcel2.writeNoException();
                ijp.i(parcel2, qyhVarJ);
                return true;
            case 8:
                qvb qvbVarZ = z();
                parcel2.writeNoException();
                ijp.i(parcel2, qvbVarZ);
                return true;
            case 9:
                qxj qxjVarF = F();
                parcel2.writeNoException();
                ijp.i(parcel2, qxjVarF);
                return true;
            case 10:
                Intent intent = (Intent) ijp.a(parcel, Intent.CREATOR);
                ijp.d(parcel);
                boolean zBy = by(intent);
                parcel2.writeNoException();
                parcel2.writeInt(zBy ? 1 : 0);
                return true;
            case 11:
                Intent intent2 = (Intent) ijp.a(parcel, Intent.CREATOR);
                ijp.d(parcel);
                List listAi = ai(intent2);
                parcel2.writeNoException();
                parcel2.writeTypedList(listAi);
                return true;
            case 12:
                qvx qvxVarB = B();
                parcel2.writeNoException();
                ijp.i(parcel2, qvxVarB);
                return true;
            case 13:
                String string = parcel.readString();
                ijp.d(parcel);
                qyq qyqVarK = K(string);
                parcel2.writeNoException();
                ijp.i(parcel2, qyqVarK);
                return true;
            case 14:
                qwu qwuVarD = D();
                parcel2.writeNoException();
                ijp.i(parcel2, qwuVarD);
                return true;
            case 15:
                qwq qwqVarBC = bC();
                parcel2.writeNoException();
                ijp.i(parcel2, qwqVarBC);
                return true;
            case 16:
                qxp qxpVarH = H();
                parcel2.writeNoException();
                ijp.i(parcel2, qxpVarH);
                return true;
            case 17:
                qxa qxaVarE = E();
                parcel2.writeNoException();
                ijp.i(parcel2, qxaVarE);
                return true;
            case 18:
                qvr qvrVarA = A();
                parcel2.writeNoException();
                ijp.i(parcel2, qvrVarA);
                return true;
            case 19:
                String string2 = parcel.readString();
                ClassLoader classLoader2 = ijp.a;
                z = parcel.readInt() != 0;
                ijp.d(parcel);
                boolean zBp = bp(string2, z);
                parcel2.writeNoException();
                parcel2.writeInt(zBp ? 1 : 0);
                return true;
            case 20:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.car.ICarActivityStartListener");
                    qutVar2 = iInterfaceQueryLocalInterface3 instanceof quv ? (quv) iInterfaceQueryLocalInterface3 : new qut(strongBinder3);
                }
                ijp.d(parcel);
                aK(qutVar2);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.car.ICarActivityStartListener");
                    qutVar = iInterfaceQueryLocalInterface4 instanceof quv ? (quv) iInterfaceQueryLocalInterface4 : new qut(strongBinder4);
                }
                ijp.d(parcel);
                be(qutVar);
                parcel2.writeNoException();
                return true;
            case 22:
                av();
                parcel2.writeNoException();
                return true;
            case 23:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                ijp.d(parcel);
                String strY = Y(string3, string4);
                parcel2.writeNoException();
                parcel2.writeString(strY);
                return true;
            case 24:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                ijp.d(parcel);
                aW(string5, string6);
                parcel2.writeNoException();
                return true;
            case 25:
                String string7 = parcel.readString();
                ClassLoader classLoader3 = ijp.a;
                z = parcel.readInt() != 0;
                ijp.d(parcel);
                aR(string7, z);
                parcel2.writeNoException();
                return true;
            case 26:
            case 27:
            case 30:
            case 31:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
            case Maneuver.TYPE_STRAIGHT /* 36 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
            case 53:
            case 54:
            case 59:
            case 61:
            case 62:
            case 63:
            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
            case 67:
            case 70:
            default:
                return false;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                CarFacet carFacet = (CarFacet) ijp.a(parcel, CarFacet.CREATOR);
                ijp.d(parcel);
                aB(carFacet);
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.car.ICarCallback");
                    qwbVar3 = iInterfaceQueryLocalInterface5 instanceof qwd ? (qwd) iInterfaceQueryLocalInterface5 : new qwb(strongBinder5);
                }
                ijp.d(parcel);
                aq(qwbVar3);
                parcel2.writeNoException();
                return true;
            case 32:
                rjb rjbVarP = P();
                parcel2.writeNoException();
                ijp.i(parcel2, rjbVarP);
                return true;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                CarFrxEvent carFrxEvent = (CarFrxEvent) ijp.a(parcel, CarFrxEvent.CREATOR);
                ijp.d(parcel);
                aC(carFrxEvent);
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                qyb qybVarI = I();
                parcel2.writeNoException();
                ijp.i(parcel2, qybVarI);
                return true;
            case 37:
                List listAa = aa();
                parcel2.writeNoException();
                parcel2.writeTypedList(listAa);
                return true;
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                List listAc = ac();
                parcel2.writeNoException();
                parcel2.writeTypedList(listAc);
                return true;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                CarInfo carInfo = (CarInfo) ijp.a(parcel, CarInfo.CREATOR);
                ijp.d(parcel);
                aw(carInfo);
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                Intent intent3 = (Intent) ijp.a(parcel, Intent.CREATOR);
                int i2 = parcel.readInt();
                ijp.d(parcel);
                List listAf = af(intent3, i2);
                parcel2.writeNoException();
                parcel2.writeTypedList(listAf);
                return true;
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                String string8 = parcel.readString();
                int i3 = parcel.readInt();
                ijp.d(parcel);
                boolean zBv = bv(string8, i3);
                parcel2.writeNoException();
                parcel2.writeInt(zBv ? 1 : 0);
                return true;
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                CarInfo carInfo2 = (CarInfo) ijp.a(parcel, CarInfo.CREATOR);
                String string9 = parcel.readString();
                ijp.d(parcel);
                aS(carInfo2, string9);
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                qzf qzfVarL = L();
                parcel2.writeNoException();
                ijp.i(parcel2, qzfVarL);
                return true;
            case 48:
                byte[] bArrCreateByteArray = parcel.createByteArray();
                int i4 = parcel.readInt();
                ijp.d(parcel);
                aA(bArrCreateByteArray, i4);
                parcel2.writeNoException();
                return true;
            case 51:
                qwl qwlVarC = C();
                parcel2.writeNoException();
                ijp.i(parcel2, qwlVarC);
                return true;
            case 52:
                qzi qziVarM = M();
                parcel2.writeNoException();
                ijp.i(parcel2, qziVarM);
                return true;
            case 55:
                String string10 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                ijp.d(parcel);
                List<String> listAd = ad(string10, arrayListCreateStringArrayList);
                parcel2.writeNoException();
                parcel2.writeStringList(listAd);
                return true;
            case 56:
                String string11 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                ijp.d(parcel);
                aX(string11, arrayListCreateStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 57:
                qxp qxpVarG = G();
                parcel2.writeNoException();
                ijp.i(parcel2, qxpVarG);
                return true;
            case 58:
                String string12 = parcel.readString();
                int i5 = parcel.readInt();
                ijp.d(parcel);
                boolean zBw = bw(string12, i5);
                parcel2.writeNoException();
                parcel2.writeInt(zBw ? 1 : 0);
                return true;
            case 60:
                ClassLoader classLoader4 = ijp.a;
                z = parcel.readInt() != 0;
                ijp.d(parcel);
                aT(z);
                parcel2.writeNoException();
                return true;
            case 65:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.car.ICarUiInfoChangedListener");
                    qylVar2 = iInterfaceQueryLocalInterface6 instanceof qyn ? (qyn) iInterfaceQueryLocalInterface6 : new qyl(strongBinder6);
                }
                ijp.d(parcel);
                aO(qylVar2);
                parcel2.writeNoException();
                return true;
            case 66:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.car.ICarUiInfoChangedListener");
                    qylVar = iInterfaceQueryLocalInterface7 instanceof qyn ? (qyn) iInterfaceQueryLocalInterface7 : new qyl(strongBinder7);
                }
                ijp.d(parcel);
                bi(qylVar);
                parcel2.writeNoException();
                return true;
            case 68:
                String string13 = parcel.readString();
                int i6 = parcel.readInt();
                ijp.d(parcel);
                int iGf = gf(string13, i6);
                parcel2.writeNoException();
                parcel2.writeInt(iGf);
                return true;
            case 69:
                String string14 = parcel.readString();
                int i7 = parcel.readInt();
                ijp.d(parcel);
                aU(string14, i7);
                parcel2.writeNoException();
                return true;
            case 71:
                String string15 = parcel.readString();
                ClassLoader classLoader5 = ijp.a;
                z = parcel.readInt() != 0;
                ijp.d(parcel);
                boolean zBq = bq(string15, z);
                parcel2.writeNoException();
                parcel2.writeInt(zBq ? 1 : 0);
                return true;
            case 72:
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                ijp.d(parcel);
                String strZ = Z(string16, string17);
                parcel2.writeNoException();
                parcel2.writeString(strZ);
                return true;
            case 73:
                String string18 = parcel.readString();
                int i8 = parcel.readInt();
                ijp.d(parcel);
                int iK = k(string18, i8);
                parcel2.writeNoException();
                parcel2.writeInt(iK);
                return true;
            case 74:
                String string19 = parcel.readString();
                double d = parcel.readDouble();
                ijp.d(parcel);
                double dGe = ge(string19, d);
                parcel2.writeNoException();
                parcel2.writeDouble(dGe);
                return true;
            case 75:
                Intent intent4 = (Intent) ijp.a(parcel, Intent.CREATOR);
                Bundle bundle = (Bundle) ijp.a(parcel, Bundle.CREATOR);
                ijp.d(parcel);
                boolean zBA = bA(intent4, bundle);
                parcel2.writeNoException();
                parcel2.writeInt(zBA ? 1 : 0);
                return true;
            case 76:
                boolean zBo = bo();
                parcel2.writeNoException();
                ClassLoader classLoader6 = ijp.a;
                parcel2.writeInt(zBo ? 1 : 0);
                return true;
            case 77:
                rkj rkjVarS = S();
                parcel2.writeNoException();
                ijp.i(parcel2, rkjVarS);
                return true;
            case 78:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.car.ICarActivityLifecycleEventListener");
                    quqVar2 = iInterfaceQueryLocalInterface8 instanceof qus ? (qus) iInterfaceQueryLocalInterface8 : new quq(strongBinder8);
                }
                ijp.d(parcel);
                aJ(quqVar2);
                parcel2.writeNoException();
                return true;
            case 79:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.car.ICarActivityLifecycleEventListener");
                    quqVar = iInterfaceQueryLocalInterface9 instanceof qus ? (qus) iInterfaceQueryLocalInterface9 : new quq(strongBinder9);
                }
                ijp.d(parcel);
                bd(quqVar);
                parcel2.writeNoException();
                return true;
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                CarActivityLayoutConfig carActivityLayoutConfig = (CarActivityLayoutConfig) ijp.a(parcel, CarActivityLayoutConfig.CREATOR);
                ijp.d(parcel);
                bj(carActivityLayoutConfig);
                parcel2.writeNoException();
                return true;
            case 81:
                CarRegionId carRegionId = (CarRegionId) ijp.a(parcel, CarRegionId.CREATOR);
                Rect rect = (Rect) ijp.a(parcel, Rect.CREATOR);
                ijp.d(parcel);
                bl(carRegionId, rect);
                parcel2.writeNoException();
                return true;
            case 82:
                CarDisplayId carDisplayId = (CarDisplayId) ijp.a(parcel, CarDisplayId.CREATOR);
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.car.ICarCallback");
                    qwbVar2 = iInterfaceQueryLocalInterface10 instanceof qwd ? (qwd) iInterfaceQueryLocalInterface10 : new qwb(strongBinder10);
                }
                ijp.d(parcel);
                ar(carDisplayId, qwbVar2);
                parcel2.writeNoException();
                return true;
            case 83:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.car.lifecycle.ICarDisplayLayoutUpdateCompleteListener");
                    rpeVar2 = iInterfaceQueryLocalInterface11 instanceof rpg ? (rpg) iInterfaceQueryLocalInterface11 : new rpe(strongBinder11);
                }
                ijp.d(parcel);
                aN(rpeVar2);
                parcel2.writeNoException();
                return true;
            case 84:
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.car.lifecycle.ICarDisplayLayoutUpdateCompleteListener");
                    rpeVar = iInterfaceQueryLocalInterface12 instanceof rpg ? (rpg) iInterfaceQueryLocalInterface12 : new rpe(strongBinder12);
                }
                ijp.d(parcel);
                bh(rpeVar);
                parcel2.writeNoException();
                return true;
            case 85:
                ClassLoader classLoader7 = ijp.a;
                z = parcel.readInt() != 0;
                ijp.d(parcel);
                aZ(z);
                parcel2.writeNoException();
                return true;
            case 86:
                int i9 = parcel.readInt();
                ijp.d(parcel);
                List listAb = ab(i9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listAb);
                return true;
            case 87:
                byte[] bArrBB = bB();
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrBB);
                return true;
            case 88:
                Intent intent5 = (Intent) ijp.a(parcel, Intent.CREATOR);
                int i10 = parcel.readInt();
                ijp.d(parcel);
                List listAh = ah(intent5, i10);
                parcel2.writeNoException();
                parcel2.writeTypedList(listAh);
                return true;
            case 89:
                CreateAudioPolicyRequest createAudioPolicyRequest = (CreateAudioPolicyRequest) ijp.a(parcel, CreateAudioPolicyRequest.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 == null) {
                    qubVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.car.IAudioDeathNotifier");
                    qubVar = iInterfaceQueryLocalInterface13 instanceof qud ? (qud) iInterfaceQueryLocalInterface13 : new qub(strongBinder13);
                }
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.car.IAudioPolicyFocusListener");
                    quhVar = iInterfaceQueryLocalInterface14 instanceof quj ? (quj) iInterfaceQueryLocalInterface14 : new quh(strongBinder14);
                }
                ijp.d(parcel);
                qug qugVarW = w(createAudioPolicyRequest, qubVar, quhVar);
                parcel2.writeNoException();
                ijp.i(parcel2, qugVarW);
                return true;
            case 90:
                CreateAudioRecordRequest createAudioRecordRequest = (CreateAudioRecordRequest) ijp.a(parcel, CreateAudioRecordRequest.CREATOR);
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.car.IAudioDeathNotifier");
                    qubVar2 = iInterfaceQueryLocalInterface15 instanceof qud ? (qud) iInterfaceQueryLocalInterface15 : new qub(strongBinder15);
                }
                ijp.d(parcel);
                qum qumVarX = x(createAudioRecordRequest, qubVar2);
                parcel2.writeNoException();
                ijp.i(parcel2, qumVarX);
                return true;
            case 91:
                CarRegionId carRegionId2 = (CarRegionId) ijp.a(parcel, CarRegionId.CREATOR);
                ijp.d(parcel);
                bb(carRegionId2);
                parcel2.writeNoException();
                return true;
            case 92:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.car.ICarActivityStartProcessor");
                    quwVar = iInterfaceQueryLocalInterface16 instanceof quy ? (quy) iInterfaceQueryLocalInterface16 : new quw(strongBinder16);
                }
                ijp.d(parcel);
                aL(quwVar);
                parcel2.writeNoException();
                return true;
            case 93:
                bf();
                parcel2.writeNoException();
                return true;
            case 94:
                CarDisplayId carDisplayId2 = (CarDisplayId) ijp.a(parcel, CarDisplayId.CREATOR);
                ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography = (ProjectionWindowAnimationChoreography) ijp.a(parcel, ProjectionWindowAnimationChoreography.CREATOR);
                ijp.d(parcel);
                ap(carDisplayId2, projectionWindowAnimationChoreography);
                parcel2.writeNoException();
                return true;
            case 95:
                rka rkaVarR = R();
                parcel2.writeNoException();
                ijp.i(parcel2, rkaVarR);
                return true;
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                Intent intent6 = (Intent) ijp.a(parcel, Intent.CREATOR);
                int i11 = parcel.readInt();
                ijp.d(parcel);
                List listAe = ae(intent6, i11);
                parcel2.writeNoException();
                parcel2.writeTypedList(listAe);
                return true;
            case 97:
                Intent intent7 = (Intent) ijp.a(parcel, Intent.CREATOR);
                int i12 = parcel.readInt();
                ijp.d(parcel);
                List listAg = ag(intent7, i12);
                parcel2.writeNoException();
                parcel2.writeTypedList(listAg);
                return true;
            case 98:
                rim rimVarO = O();
                parcel2.writeNoException();
                ijp.i(parcel2, rimVarO);
                return true;
            case 99:
                rho rhoVarN = N();
                parcel2.writeNoException();
                ijp.i(parcel2, rhoVarN);
                return true;
            case 100:
                CarDisplayId carDisplayId3 = (CarDisplayId) ijp.a(parcel, CarDisplayId.CREATOR);
                ijp.d(parcel);
                rjm rjmVarQ = Q(carDisplayId3);
                parcel2.writeNoException();
                ijp.i(parcel2, rjmVarQ);
                return true;
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                boolean zBx = bx();
                parcel2.writeNoException();
                ClassLoader classLoader8 = ijp.a;
                parcel2.writeInt(zBx ? 1 : 0);
                return true;
            case 102:
                rkm rkmVarT = T();
                parcel2.writeNoException();
                ijp.i(parcel2, rkmVarT);
                return true;
            case 103:
                AnalyticsSessionInfo analyticsSessionInfoR = r();
                parcel2.writeNoException();
                ijp.h(parcel2, analyticsSessionInfoR);
                return true;
            case 104:
                ClassLoader classLoader9 = ijp.a;
                z = parcel.readInt() != 0;
                ijp.d(parcel);
                aY(z);
                parcel2.writeNoException();
                return true;
            case 105:
                MediaOptions mediaOptions = (MediaOptions) ijp.a(parcel, MediaOptions.CREATOR);
                ijp.d(parcel);
                aV(mediaOptions);
                parcel2.writeNoException();
                return true;
            case 106:
                CarRegionId carRegionId3 = (CarRegionId) ijp.a(parcel, CarRegionId.CREATOR);
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.car.ICarCallback");
                    qwbVar = iInterfaceQueryLocalInterface17 instanceof qwd ? (qwd) iInterfaceQueryLocalInterface17 : new qwb(strongBinder17);
                }
                ijp.d(parcel);
                as(carRegionId3, qwbVar);
                parcel2.writeNoException();
                return true;
            case 107:
                int iGg = gg();
                parcel2.writeNoException();
                parcel2.writeInt(iGg);
                return true;
        }
    }

    @ResultIgnorabilityUnspecified
    public double ge(String str, double d) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    @ResultIgnorabilityUnspecified
    public int gf(String str, int i) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    @ResultIgnorabilityUnspecified
    public int gg() {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    @ResultIgnorabilityUnspecified
    public int k(String str, int i) {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    public AnalyticsSessionInfo r() {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }

    @ResultIgnorabilityUnspecified
    public CarUiInfo u() {
        throw new UnsupportedOperationException("This method should only be called on the car module living in Gearhead");
    }
}
