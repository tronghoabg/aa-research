package defpackage;

import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.libraries.maps.model.CameraPosition;
import com.google.android.libraries.maps.model.CircleOptions;
import com.google.android.libraries.maps.model.FeatureLayerOptions;
import com.google.android.libraries.maps.model.GroundOverlayOptions;
import com.google.android.libraries.maps.model.LatLngBounds;
import com.google.android.libraries.maps.model.MapStyleOptions;
import com.google.android.libraries.maps.model.MarkerOptions;
import com.google.android.libraries.maps.model.PolygonOptions;
import com.google.android.libraries.maps.model.PolylineOptions;
import com.google.android.libraries.maps.model.TileOverlayOptions;
import com.google.android.libraries.maps.model.internal.ICircleDelegate;
import com.google.android.libraries.maps.model.internal.IFeatureLayerDelegate;
import com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate;
import com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate;
import com.google.android.libraries.maps.model.internal.IMapCapabilitiesDelegate;
import com.google.android.libraries.maps.model.internal.IMarkerDelegate;
import com.google.android.libraries.maps.model.internal.IPolygonDelegate;
import com.google.android.libraries.maps.model.internal.IPolylineDelegate;
import com.google.android.libraries.maps.model.internal.ITileOverlayDelegate;

/* loaded from: classes3.dex */
public abstract class vef extends ijo implements veg {
    public vef() {
        super("com.google.android.libraries.maps.internal.IGoogleMapDelegate");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        sqj sqhVar;
        sqj sqhVar2;
        vip vinVar;
        if (i == 44) {
            IIndoorBuildingDelegate iIndoorBuildingDelegateP = p();
            parcel2.writeNoException();
            ijp.i(parcel2, iIndoorBuildingDelegateP);
            return true;
        }
        vfu vfsVar = null;
        vgj vghVar = null;
        vgj vghVar2 = null;
        vhk vhiVar = null;
        vfc vfaVar = null;
        vff vfdVar = null;
        vfi vfgVar = null;
        vfl vfjVar = null;
        vht vhrVar = null;
        vga vfyVar = null;
        vhq vhoVar = null;
        vgd vgbVar = null;
        vfr vfpVar = null;
        vhn vhlVar = null;
        vgv vgtVar = null;
        vgp vgnVar = null;
        sqj sqhVar3 = null;
        vhe vhcVar = null;
        vhh vhfVar = null;
        vej vehVar = null;
        vfx vfvVar = null;
        vhb vgzVar = null;
        vgy vgwVar = null;
        vgs vgqVar = null;
        vgm vgkVar = null;
        vez vexVar = null;
        vem vekVar = null;
        veb vdzVar = null;
        veb vdzVar2 = null;
        sqj sqhVar4 = null;
        sqj sqhVar5 = null;
        vfo vfmVar = null;
        vip vinVar2 = null;
        if (i == 45) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.libraries.maps.internal.IOnIndoorStateChangeListener");
                vfsVar = iInterfaceQueryLocalInterface instanceof vfu ? (vfu) iInterfaceQueryLocalInterface : new vfs(strongBinder);
            }
            ijp.d(parcel);
            ah(vfsVar);
            parcel2.writeNoException();
            return true;
        }
        if (i == 51) {
            boolean zJ = ijp.j(parcel);
            ijp.d(parcel);
            az(zJ);
            parcel2.writeNoException();
            return true;
        }
        if (i == 71) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.libraries.maps.internal.ISnapshotReadyCallback");
                vinVar2 = iInterfaceQueryLocalInterface2 instanceof vip ? (vip) iInterfaceQueryLocalInterface2 : new vin(strongBinder2);
            }
            ijp.d(parcel);
            aB(vinVar2);
            parcel2.writeNoException();
            return true;
        }
        if (i == 89) {
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.libraries.maps.internal.IOnCircleClickListener");
                vfmVar = iInterfaceQueryLocalInterface3 instanceof vfo ? (vfo) iInterfaceQueryLocalInterface3 : new vfm(strongBinder3);
            }
            ijp.d(parcel);
            af(vfmVar);
            parcel2.writeNoException();
            return true;
        }
        if (i == 101) {
            M();
            parcel2.writeNoException();
            return true;
        }
        if (i == 102) {
            N();
            parcel2.writeNoException();
            return true;
        }
        switch (i) {
            case 1:
                CameraPosition cameraPositionL = l();
                parcel2.writeNoException();
                ijp.h(parcel2, cameraPositionL);
                return true;
            case 2:
                float fE = e();
                parcel2.writeNoException();
                parcel2.writeFloat(fE);
                return true;
            case 3:
                float f = f();
                parcel2.writeNoException();
                parcel2.writeFloat(f);
                return true;
            case 4:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    sqhVar5 = iInterfaceQueryLocalInterface4 instanceof sqj ? (sqj) iInterfaceQueryLocalInterface4 : new sqh(strongBinder4);
                }
                ijp.d(parcel);
                C(sqhVar5);
                parcel2.writeNoException();
                return true;
            case 5:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    sqhVar4 = iInterfaceQueryLocalInterface5 instanceof sqj ? (sqj) iInterfaceQueryLocalInterface5 : new sqh(strongBinder5);
                }
                ijp.d(parcel);
                x(sqhVar4);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 == null) {
                    sqhVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    sqhVar = iInterfaceQueryLocalInterface6 instanceof sqj ? (sqj) iInterfaceQueryLocalInterface6 : new sqh(strongBinder6);
                }
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.libraries.maps.internal.ICancelableCallback");
                    vdzVar2 = iInterfaceQueryLocalInterface7 instanceof veb ? (veb) iInterfaceQueryLocalInterface7 : new vdz(strongBinder7);
                }
                ijp.d(parcel);
                y(sqhVar, vdzVar2);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 == null) {
                    sqhVar2 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    sqhVar2 = iInterfaceQueryLocalInterface8 instanceof sqj ? (sqj) iInterfaceQueryLocalInterface8 : new sqh(strongBinder8);
                }
                int i2 = parcel.readInt();
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.libraries.maps.internal.ICancelableCallback");
                    vdzVar = iInterfaceQueryLocalInterface9 instanceof veb ? (veb) iInterfaceQueryLocalInterface9 : new vdz(strongBinder9);
                }
                ijp.d(parcel);
                z(sqhVar2, i2, vdzVar);
                parcel2.writeNoException();
                return true;
            case 8:
                aC();
                parcel2.writeNoException();
                return true;
            case 9:
                PolylineOptions polylineOptions = (PolylineOptions) ijp.a(parcel, PolylineOptions.CREATOR);
                ijp.d(parcel);
                IPolylineDelegate iPolylineDelegateT = t(polylineOptions);
                parcel2.writeNoException();
                ijp.i(parcel2, iPolylineDelegateT);
                return true;
            case 10:
                PolygonOptions polygonOptions = (PolygonOptions) ijp.a(parcel, PolygonOptions.CREATOR);
                ijp.d(parcel);
                IPolygonDelegate iPolygonDelegateS = s(polygonOptions);
                parcel2.writeNoException();
                ijp.i(parcel2, iPolygonDelegateS);
                return true;
            case 11:
                MarkerOptions markerOptions = (MarkerOptions) ijp.a(parcel, MarkerOptions.CREATOR);
                ijp.d(parcel);
                IMarkerDelegate iMarkerDelegateR = r(markerOptions);
                parcel2.writeNoException();
                ijp.i(parcel2, iMarkerDelegateR);
                return true;
            case 12:
                GroundOverlayOptions groundOverlayOptions = (GroundOverlayOptions) ijp.a(parcel, GroundOverlayOptions.CREATOR);
                ijp.d(parcel);
                IGroundOverlayDelegate iGroundOverlayDelegateO = o(groundOverlayOptions);
                parcel2.writeNoException();
                ijp.i(parcel2, iGroundOverlayDelegateO);
                return true;
            case 13:
                TileOverlayOptions tileOverlayOptions = (TileOverlayOptions) ijp.a(parcel, TileOverlayOptions.CREATOR);
                ijp.d(parcel);
                ITileOverlayDelegate iTileOverlayDelegateU = u(tileOverlayOptions);
                parcel2.writeNoException();
                ijp.i(parcel2, iTileOverlayDelegateU);
                return true;
            case 14:
                A();
                parcel2.writeNoException();
                return true;
            case 15:
                int iH = h();
                parcel2.writeNoException();
                parcel2.writeInt(iH);
                return true;
            case 16:
                int i3 = parcel.readInt();
                ijp.d(parcel);
                W(i3);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean zAG = aG();
                parcel2.writeNoException();
                ClassLoader classLoader = ijp.a;
                parcel2.writeInt(zAG ? 1 : 0);
                return true;
            case 18:
                boolean zJ2 = ijp.j(parcel);
                ijp.d(parcel);
                ax(zJ2);
                parcel2.writeNoException();
                return true;
            case 19:
                boolean zAE = aE();
                parcel2.writeNoException();
                ClassLoader classLoader2 = ijp.a;
                parcel2.writeInt(zAE ? 1 : 0);
                return true;
            case 20:
                boolean zJ3 = ijp.j(parcel);
                ijp.d(parcel);
                boolean zAI = aI(zJ3);
                parcel2.writeNoException();
                parcel2.writeInt(zAI ? 1 : 0);
                return true;
            case 21:
                boolean zAF = aF();
                parcel2.writeNoException();
                ClassLoader classLoader3 = ijp.a;
                parcel2.writeInt(zAF ? 1 : 0);
                return true;
            case 22:
                boolean zJ4 = ijp.j(parcel);
                ijp.d(parcel);
                Z(zJ4);
                parcel2.writeNoException();
                return true;
            case 23:
                Location locationI = i();
                parcel2.writeNoException();
                ijp.h(parcel2, locationI);
                return true;
            case 24:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.libraries.maps.internal.ILocationSourceDelegate");
                    vekVar = iInterfaceQueryLocalInterface10 instanceof vem ? (vem) iInterfaceQueryLocalInterface10 : new vek(strongBinder10);
                }
                ijp.d(parcel);
                U(vekVar);
                parcel2.writeNoException();
                return true;
            case 25:
                viz vizVarK = k();
                parcel2.writeNoException();
                ijp.i(parcel2, vizVarK);
                return true;
            case 26:
                vim vimVarJ = j();
                parcel2.writeNoException();
                ijp.i(parcel2, vimVarJ);
                return true;
            case 27:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.libraries.maps.internal.IOnCameraChangeListener");
                    vexVar = iInterfaceQueryLocalInterface11 instanceof vez ? (vez) iInterfaceQueryLocalInterface11 : new vex(strongBinder11);
                }
                ijp.d(parcel);
                aa(vexVar);
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.libraries.maps.internal.IOnMapClickListener");
                    vgkVar = iInterfaceQueryLocalInterface12 instanceof vgm ? (vgm) iInterfaceQueryLocalInterface12 : new vgk(strongBinder12);
                }
                ijp.d(parcel);
                al(vgkVar);
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.libraries.maps.internal.IOnMapLongClickListener");
                    vgqVar = iInterfaceQueryLocalInterface13 instanceof vgs ? (vgs) iInterfaceQueryLocalInterface13 : new vgq(strongBinder13);
                }
                ijp.d(parcel);
                an(vgqVar);
                parcel2.writeNoException();
                return true;
            case 30:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.libraries.maps.internal.IOnMarkerClickListener");
                    vgwVar = iInterfaceQueryLocalInterface14 instanceof vgy ? (vgy) iInterfaceQueryLocalInterface14 : new vgw(strongBinder14);
                }
                ijp.d(parcel);
                ao(vgwVar);
                parcel2.writeNoException();
                return true;
            case 31:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.libraries.maps.internal.IOnMarkerDragListener");
                    vgzVar = iInterfaceQueryLocalInterface15 instanceof vhb ? (vhb) iInterfaceQueryLocalInterface15 : new vgz(strongBinder15);
                }
                ijp.d(parcel);
                ap(vgzVar);
                parcel2.writeNoException();
                return true;
            case 32:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.libraries.maps.internal.IOnInfoWindowClickListener");
                    vfvVar = iInterfaceQueryLocalInterface16 instanceof vfx ? (vfx) iInterfaceQueryLocalInterface16 : new vfv(strongBinder16);
                }
                ijp.d(parcel);
                ai(vfvVar);
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.libraries.maps.internal.IInfoWindowAdapter");
                    vehVar = iInterfaceQueryLocalInterface17 instanceof vej ? (vej) iInterfaceQueryLocalInterface17 : new veh(strongBinder17);
                }
                ijp.d(parcel);
                S(vehVar);
                parcel2.writeNoException();
                return true;
            default:
                switch (i) {
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                        CircleOptions circleOptions = (CircleOptions) ijp.a(parcel, CircleOptions.CREATOR);
                        ijp.d(parcel);
                        ICircleDelegate iCircleDelegateM = m(circleOptions);
                        parcel2.writeNoException();
                        ijp.i(parcel2, iCircleDelegateM);
                        return true;
                    case Maneuver.TYPE_STRAIGHT /* 36 */:
                        IBinder strongBinder18 = parcel.readStrongBinder();
                        if (strongBinder18 != null) {
                            IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.libraries.maps.internal.IOnMyLocationChangeListener");
                            vhfVar = iInterfaceQueryLocalInterface18 instanceof vhh ? (vhh) iInterfaceQueryLocalInterface18 : new vhf(strongBinder18);
                        }
                        ijp.d(parcel);
                        ar(vhfVar);
                        parcel2.writeNoException();
                        return true;
                    case 37:
                        IBinder strongBinder19 = parcel.readStrongBinder();
                        if (strongBinder19 != null) {
                            IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.libraries.maps.internal.IOnMyLocationButtonClickListener");
                            vhcVar = iInterfaceQueryLocalInterface19 instanceof vhe ? (vhe) iInterfaceQueryLocalInterface19 : new vhc(strongBinder19);
                        }
                        ijp.d(parcel);
                        aq(vhcVar);
                        parcel2.writeNoException();
                        return true;
                    case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                        IBinder strongBinder20 = parcel.readStrongBinder();
                        if (strongBinder20 == null) {
                            vinVar = null;
                        } else {
                            IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.libraries.maps.internal.ISnapshotReadyCallback");
                            vinVar = iInterfaceQueryLocalInterface20 instanceof vip ? (vip) iInterfaceQueryLocalInterface20 : new vin(strongBinder20);
                        }
                        IBinder strongBinder21 = parcel.readStrongBinder();
                        if (strongBinder21 != null) {
                            IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                            sqhVar3 = iInterfaceQueryLocalInterface21 instanceof sqj ? (sqj) iInterfaceQueryLocalInterface21 : new sqh(strongBinder21);
                        }
                        ijp.d(parcel);
                        aA(vinVar, sqhVar3);
                        parcel2.writeNoException();
                        return true;
                    case Maneuver.TYPE_DESTINATION /* 39 */:
                        int i4 = parcel.readInt();
                        int i5 = parcel.readInt();
                        int i6 = parcel.readInt();
                        int i7 = parcel.readInt();
                        ijp.d(parcel);
                        aw(i4, i5, i6, i7);
                        parcel2.writeNoException();
                        return true;
                    case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                        boolean zAD = aD();
                        parcel2.writeNoException();
                        ClassLoader classLoader4 = ijp.a;
                        parcel2.writeInt(zAD ? 1 : 0);
                        return true;
                    case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                        boolean zJ5 = ijp.j(parcel);
                        ijp.d(parcel);
                        Q(zJ5);
                        parcel2.writeNoException();
                        return true;
                    case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                        IBinder strongBinder22 = parcel.readStrongBinder();
                        if (strongBinder22 != null) {
                            IInterface iInterfaceQueryLocalInterface22 = strongBinder22.queryLocalInterface("com.google.android.libraries.maps.internal.IOnMapLoadedCallback");
                            vgnVar = iInterfaceQueryLocalInterface22 instanceof vgp ? (vgp) iInterfaceQueryLocalInterface22 : new vgn(strongBinder22);
                        }
                        ijp.d(parcel);
                        am(vgnVar);
                        parcel2.writeNoException();
                        return true;
                    default:
                        switch (i) {
                            case 53:
                                IBinder strongBinder23 = parcel.readStrongBinder();
                                if (strongBinder23 != null) {
                                    IInterface iInterfaceQueryLocalInterface23 = strongBinder23.queryLocalInterface("com.google.android.libraries.maps.internal.IOnMapReadyCallback");
                                    vgtVar = iInterfaceQueryLocalInterface23 instanceof vgv ? (vgv) iInterfaceQueryLocalInterface23 : new vgt(strongBinder23);
                                }
                                ijp.d(parcel);
                                B(vgtVar);
                                parcel2.writeNoException();
                                return true;
                            case 54:
                                Bundle bundle = (Bundle) ijp.a(parcel, Bundle.CREATOR);
                                ijp.d(parcel);
                                E(bundle);
                                parcel2.writeNoException();
                                return true;
                            case 55:
                                K();
                                parcel2.writeNoException();
                                return true;
                            case 56:
                                J();
                                parcel2.writeNoException();
                                return true;
                            case 57:
                                F();
                                parcel2.writeNoException();
                                return true;
                            case 58:
                                I();
                                parcel2.writeNoException();
                                return true;
                            case 59:
                                boolean zAK = aK();
                                parcel2.writeNoException();
                                ClassLoader classLoader5 = ijp.a;
                                parcel2.writeInt(zAK ? 1 : 0);
                                return true;
                            case 60:
                                Bundle bundle2 = (Bundle) ijp.a(parcel, Bundle.CREATOR);
                                ijp.d(parcel);
                                L(bundle2);
                                parcel2.writeNoException();
                                ijp.h(parcel2, bundle2);
                                return true;
                            case 61:
                                String string = parcel.readString();
                                ijp.d(parcel);
                                R(string);
                                parcel2.writeNoException();
                                return true;
                            default:
                                switch (i) {
                                    case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                                        IBinder strongBinder24 = parcel.readStrongBinder();
                                        if (strongBinder24 != null) {
                                            IInterface iInterfaceQueryLocalInterface24 = strongBinder24.queryLocalInterface("com.google.android.libraries.maps.internal.IOnPoiClickListener");
                                            vhlVar = iInterfaceQueryLocalInterface24 instanceof vhn ? (vhn) iInterfaceQueryLocalInterface24 : new vhl(strongBinder24);
                                        }
                                        ijp.d(parcel);
                                        at(vhlVar);
                                        parcel2.writeNoException();
                                        return true;
                                    case 81:
                                        Bundle bundle3 = (Bundle) ijp.a(parcel, Bundle.CREATOR);
                                        ijp.d(parcel);
                                        G(bundle3);
                                        parcel2.writeNoException();
                                        return true;
                                    case 82:
                                        H();
                                        parcel2.writeNoException();
                                        return true;
                                    case 83:
                                        IBinder strongBinder25 = parcel.readStrongBinder();
                                        if (strongBinder25 != null) {
                                            IInterface iInterfaceQueryLocalInterface25 = strongBinder25.queryLocalInterface("com.google.android.libraries.maps.internal.IOnGroundOverlayClickListener");
                                            vfpVar = iInterfaceQueryLocalInterface25 instanceof vfr ? (vfr) iInterfaceQueryLocalInterface25 : new vfp(strongBinder25);
                                        }
                                        ijp.d(parcel);
                                        ag(vfpVar);
                                        parcel2.writeNoException();
                                        return true;
                                    case 84:
                                        IBinder strongBinder26 = parcel.readStrongBinder();
                                        if (strongBinder26 != null) {
                                            IInterface iInterfaceQueryLocalInterface26 = strongBinder26.queryLocalInterface("com.google.android.libraries.maps.internal.IOnInfoWindowLongClickListener");
                                            vgbVar = iInterfaceQueryLocalInterface26 instanceof vgd ? (vgd) iInterfaceQueryLocalInterface26 : new vgb(strongBinder26);
                                        }
                                        ijp.d(parcel);
                                        ak(vgbVar);
                                        parcel2.writeNoException();
                                        return true;
                                    case 85:
                                        IBinder strongBinder27 = parcel.readStrongBinder();
                                        if (strongBinder27 != null) {
                                            IInterface iInterfaceQueryLocalInterface27 = strongBinder27.queryLocalInterface("com.google.android.libraries.maps.internal.IOnPolygonClickListener");
                                            vhoVar = iInterfaceQueryLocalInterface27 instanceof vhq ? (vhq) iInterfaceQueryLocalInterface27 : new vho(strongBinder27);
                                        }
                                        ijp.d(parcel);
                                        au(vhoVar);
                                        parcel2.writeNoException();
                                        return true;
                                    case 86:
                                        IBinder strongBinder28 = parcel.readStrongBinder();
                                        if (strongBinder28 != null) {
                                            IInterface iInterfaceQueryLocalInterface28 = strongBinder28.queryLocalInterface("com.google.android.libraries.maps.internal.IOnInfoWindowCloseListener");
                                            vfyVar = iInterfaceQueryLocalInterface28 instanceof vga ? (vga) iInterfaceQueryLocalInterface28 : new vfy(strongBinder28);
                                        }
                                        ijp.d(parcel);
                                        aj(vfyVar);
                                        parcel2.writeNoException();
                                        return true;
                                    case 87:
                                        IBinder strongBinder29 = parcel.readStrongBinder();
                                        if (strongBinder29 != null) {
                                            IInterface iInterfaceQueryLocalInterface29 = strongBinder29.queryLocalInterface("com.google.android.libraries.maps.internal.IOnPolylineClickListener");
                                            vhrVar = iInterfaceQueryLocalInterface29 instanceof vht ? (vht) iInterfaceQueryLocalInterface29 : new vhr(strongBinder29);
                                        }
                                        ijp.d(parcel);
                                        av(vhrVar);
                                        parcel2.writeNoException();
                                        return true;
                                    default:
                                        switch (i) {
                                            case 91:
                                                MapStyleOptions mapStyleOptions = (MapStyleOptions) ijp.a(parcel, MapStyleOptions.CREATOR);
                                                ijp.d(parcel);
                                                boolean zAJ = aJ(mapStyleOptions);
                                                parcel2.writeNoException();
                                                parcel2.writeInt(zAJ ? 1 : 0);
                                                return true;
                                            case 92:
                                                float f2 = parcel.readFloat();
                                                ijp.d(parcel);
                                                Y(f2);
                                                parcel2.writeNoException();
                                                return true;
                                            case 93:
                                                float f3 = parcel.readFloat();
                                                ijp.d(parcel);
                                                X(f3);
                                                parcel2.writeNoException();
                                                return true;
                                            case 94:
                                                P();
                                                parcel2.writeNoException();
                                                return true;
                                            case 95:
                                                LatLngBounds latLngBounds = (LatLngBounds) ijp.a(parcel, LatLngBounds.CREATOR);
                                                ijp.d(parcel);
                                                T(latLngBounds);
                                                parcel2.writeNoException();
                                                return true;
                                            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                                                IBinder strongBinder30 = parcel.readStrongBinder();
                                                if (strongBinder30 != null) {
                                                    IInterface iInterfaceQueryLocalInterface30 = strongBinder30.queryLocalInterface("com.google.android.libraries.maps.internal.IOnCameraMoveStartedListener");
                                                    vfjVar = iInterfaceQueryLocalInterface30 instanceof vfl ? (vfl) iInterfaceQueryLocalInterface30 : new vfj(strongBinder30);
                                                }
                                                ijp.d(parcel);
                                                ae(vfjVar);
                                                parcel2.writeNoException();
                                                return true;
                                            case 97:
                                                IBinder strongBinder31 = parcel.readStrongBinder();
                                                if (strongBinder31 != null) {
                                                    IInterface iInterfaceQueryLocalInterface31 = strongBinder31.queryLocalInterface("com.google.android.libraries.maps.internal.IOnCameraMoveListener");
                                                    vfgVar = iInterfaceQueryLocalInterface31 instanceof vfi ? (vfi) iInterfaceQueryLocalInterface31 : new vfg(strongBinder31);
                                                }
                                                ijp.d(parcel);
                                                ad(vfgVar);
                                                parcel2.writeNoException();
                                                return true;
                                            case 98:
                                                IBinder strongBinder32 = parcel.readStrongBinder();
                                                if (strongBinder32 != null) {
                                                    IInterface iInterfaceQueryLocalInterface32 = strongBinder32.queryLocalInterface("com.google.android.libraries.maps.internal.IOnCameraMoveCanceledListener");
                                                    vfdVar = iInterfaceQueryLocalInterface32 instanceof vff ? (vff) iInterfaceQueryLocalInterface32 : new vfd(strongBinder32);
                                                }
                                                ijp.d(parcel);
                                                ac(vfdVar);
                                                parcel2.writeNoException();
                                                return true;
                                            case 99:
                                                IBinder strongBinder33 = parcel.readStrongBinder();
                                                if (strongBinder33 != null) {
                                                    IInterface iInterfaceQueryLocalInterface33 = strongBinder33.queryLocalInterface("com.google.android.libraries.maps.internal.IOnCameraIdleListener");
                                                    vfaVar = iInterfaceQueryLocalInterface33 instanceof vfc ? (vfc) iInterfaceQueryLocalInterface33 : new vfa(strongBinder33);
                                                }
                                                ijp.d(parcel);
                                                ab(vfaVar);
                                                parcel2.writeNoException();
                                                return true;
                                            default:
                                                switch (i) {
                                                    case 107:
                                                        IBinder strongBinder34 = parcel.readStrongBinder();
                                                        if (strongBinder34 != null) {
                                                            IInterface iInterfaceQueryLocalInterface34 = strongBinder34.queryLocalInterface("com.google.android.libraries.maps.internal.IOnMyLocationClickListener");
                                                            vhiVar = iInterfaceQueryLocalInterface34 instanceof vhk ? (vhk) iInterfaceQueryLocalInterface34 : new vhi(strongBinder34);
                                                        }
                                                        ijp.d(parcel);
                                                        as(vhiVar);
                                                        parcel2.writeNoException();
                                                        return true;
                                                    case 108:
                                                        D();
                                                        parcel2.writeNoException();
                                                        return true;
                                                    case 109:
                                                        IMapCapabilitiesDelegate iMapCapabilitiesDelegateQ = q();
                                                        parcel2.writeNoException();
                                                        ijp.i(parcel2, iMapCapabilitiesDelegateQ);
                                                        return true;
                                                    case 110:
                                                        IBinder strongBinder35 = parcel.readStrongBinder();
                                                        if (strongBinder35 != null) {
                                                            IInterface iInterfaceQueryLocalInterface35 = strongBinder35.queryLocalInterface("com.google.android.libraries.maps.internal.IOnMapCapabilitiesChangedListener");
                                                            vghVar2 = iInterfaceQueryLocalInterface35 instanceof vgj ? (vgj) iInterfaceQueryLocalInterface35 : new vgh(strongBinder35);
                                                        }
                                                        ijp.d(parcel);
                                                        w(vghVar2);
                                                        parcel2.writeNoException();
                                                        return true;
                                                    case 111:
                                                        IBinder strongBinder36 = parcel.readStrongBinder();
                                                        if (strongBinder36 != null) {
                                                            IInterface iInterfaceQueryLocalInterface36 = strongBinder36.queryLocalInterface("com.google.android.libraries.maps.internal.IOnMapCapabilitiesChangedListener");
                                                            vghVar = iInterfaceQueryLocalInterface36 instanceof vgj ? (vgj) iInterfaceQueryLocalInterface36 : new vgh(strongBinder36);
                                                        }
                                                        ijp.d(parcel);
                                                        O(vghVar);
                                                        parcel2.writeNoException();
                                                        return true;
                                                    case 112:
                                                        FeatureLayerOptions featureLayerOptions = (FeatureLayerOptions) ijp.a(parcel, FeatureLayerOptions.CREATOR);
                                                        ijp.d(parcel);
                                                        IFeatureLayerDelegate iFeatureLayerDelegateN = n(featureLayerOptions);
                                                        parcel2.writeNoException();
                                                        ijp.i(parcel2, iFeatureLayerDelegateN);
                                                        return true;
                                                    case 113:
                                                        int i8 = parcel.readInt();
                                                        ijp.d(parcel);
                                                        V(i8);
                                                        parcel2.writeNoException();
                                                        return true;
                                                    case 114:
                                                        int iG = g();
                                                        parcel2.writeNoException();
                                                        parcel2.writeInt(iG);
                                                        return true;
                                                    case 115:
                                                        String string2 = parcel.readString();
                                                        ijp.d(parcel);
                                                        String strV = v(string2);
                                                        parcel2.writeNoException();
                                                        parcel2.writeString(strV);
                                                        return true;
                                                    case 116:
                                                        boolean zAH = aH();
                                                        parcel2.writeNoException();
                                                        ClassLoader classLoader6 = ijp.a;
                                                        parcel2.writeInt(zAH ? 1 : 0);
                                                        return true;
                                                    case 117:
                                                        boolean zJ6 = ijp.j(parcel);
                                                        ijp.d(parcel);
                                                        ay(zJ6);
                                                        parcel2.writeNoException();
                                                        return true;
                                                    default:
                                                        return false;
                                                }
                                        }
                                }
                        }
                }
        }
    }
}
