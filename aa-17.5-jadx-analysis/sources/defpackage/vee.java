package defpackage;

import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
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
public final class vee extends ijn implements veg {
    public vee(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IGoogleMapDelegate");
    }

    @Override // defpackage.veg
    public final void A() throws RemoteException {
        gj(14, gh());
    }

    @Override // defpackage.veg
    public final void B(vgv vgvVar) throws RemoteException {
        throw null;
    }

    @Override // defpackage.veg
    public final void C(sqj sqjVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, sqjVar);
        gj(4, parcelGh);
    }

    @Override // defpackage.veg
    public final void D() throws RemoteException {
        throw null;
    }

    @Override // defpackage.veg
    public final void E(Bundle bundle) throws RemoteException {
        throw null;
    }

    @Override // defpackage.veg
    public final void F() throws RemoteException {
        throw null;
    }

    @Override // defpackage.veg
    public final void G(Bundle bundle) throws RemoteException {
        throw null;
    }

    @Override // defpackage.veg
    public final void H() throws RemoteException {
        throw null;
    }

    @Override // defpackage.veg
    public final void I() throws RemoteException {
        throw null;
    }

    @Override // defpackage.veg
    public final void J() throws RemoteException {
        throw null;
    }

    @Override // defpackage.veg
    public final void K() throws RemoteException {
        throw null;
    }

    @Override // defpackage.veg
    public final void L(Bundle bundle) throws RemoteException {
        throw null;
    }

    @Override // defpackage.veg
    public final void M() throws RemoteException {
        throw null;
    }

    @Override // defpackage.veg
    public final void N() throws RemoteException {
        throw null;
    }

    @Override // defpackage.veg
    public final void O(vgj vgjVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, vgjVar);
        gj(111, parcelGh);
    }

    @Override // defpackage.veg
    public final void P() throws RemoteException {
        gj(94, gh());
    }

    @Override // defpackage.veg
    public final void Q(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gj(41, parcelGh);
    }

    @Override // defpackage.veg
    public final void R(String str) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeString(str);
        gj(61, parcelGh);
    }

    @Override // defpackage.veg
    public final void S(vej vejVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, vejVar);
        gj(33, parcelGh);
    }

    @Override // defpackage.veg
    public final void T(LatLngBounds latLngBounds) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, latLngBounds);
        gj(95, parcelGh);
    }

    @Override // defpackage.veg
    public final void U(vem vemVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, vemVar);
        gj(24, parcelGh);
    }

    @Override // defpackage.veg
    public final void V(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        gj(113, parcelGh);
    }

    @Override // defpackage.veg
    public final void W(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        gj(16, parcelGh);
    }

    @Override // defpackage.veg
    public final void X(float f) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeFloat(f);
        gj(93, parcelGh);
    }

    @Override // defpackage.veg
    public final void Y(float f) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeFloat(f);
        gj(92, parcelGh);
    }

    @Override // defpackage.veg
    public final void Z(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gj(22, parcelGh);
    }

    @Override // defpackage.veg
    public final void aA(vip vipVar, sqj sqjVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, vipVar);
        ijp.i(parcelGh, sqjVar);
        gj(38, parcelGh);
    }

    @Override // defpackage.veg
    public final void aB(vip vipVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, vipVar);
        gj(71, parcelGh);
    }

    @Override // defpackage.veg
    public final void aC() throws RemoteException {
        gj(8, gh());
    }

    @Override // defpackage.veg
    public final boolean aD() throws RemoteException {
        Parcel parcelGi = gi(40, gh());
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.veg
    public final boolean aE() throws RemoteException {
        Parcel parcelGi = gi(19, gh());
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.veg
    public final boolean aF() throws RemoteException {
        Parcel parcelGi = gi(21, gh());
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.veg
    public final boolean aG() throws RemoteException {
        Parcel parcelGi = gi(17, gh());
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.veg
    public final boolean aH() throws RemoteException {
        Parcel parcelGi = gi(116, gh());
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.veg
    public final boolean aI(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        Parcel parcelGi = gi(20, parcelGh);
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.veg
    public final boolean aJ(MapStyleOptions mapStyleOptions) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, mapStyleOptions);
        Parcel parcelGi = gi(91, parcelGh);
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.veg
    public final boolean aK() throws RemoteException {
        throw null;
    }

    @Override // defpackage.veg
    public final void aa(vez vezVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, vezVar);
        gj(27, parcelGh);
    }

    @Override // defpackage.veg
    public final void ab(vfc vfcVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, vfcVar);
        gj(99, parcelGh);
    }

    @Override // defpackage.veg
    public final void ac(vff vffVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, vffVar);
        gj(98, parcelGh);
    }

    @Override // defpackage.veg
    public final void ad(vfi vfiVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, vfiVar);
        gj(97, parcelGh);
    }

    @Override // defpackage.veg
    public final void ae(vfl vflVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, vflVar);
        gj(96, parcelGh);
    }

    @Override // defpackage.veg
    public final void af(vfo vfoVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, vfoVar);
        gj(89, parcelGh);
    }

    @Override // defpackage.veg
    public final void ag(vfr vfrVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, vfrVar);
        gj(83, parcelGh);
    }

    @Override // defpackage.veg
    public final void ah(vfu vfuVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, vfuVar);
        gj(45, parcelGh);
    }

    @Override // defpackage.veg
    public final void ai(vfx vfxVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, vfxVar);
        gj(32, parcelGh);
    }

    @Override // defpackage.veg
    public final void aj(vga vgaVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, vgaVar);
        gj(86, parcelGh);
    }

    @Override // defpackage.veg
    public final void ak(vgd vgdVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, vgdVar);
        gj(84, parcelGh);
    }

    @Override // defpackage.veg
    public final void al(vgm vgmVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, vgmVar);
        gj(28, parcelGh);
    }

    @Override // defpackage.veg
    public final void am(vgp vgpVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, vgpVar);
        gj(42, parcelGh);
    }

    @Override // defpackage.veg
    public final void an(vgs vgsVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, vgsVar);
        gj(29, parcelGh);
    }

    @Override // defpackage.veg
    public final void ao(vgy vgyVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, vgyVar);
        gj(30, parcelGh);
    }

    @Override // defpackage.veg
    public final void ap(vhb vhbVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, vhbVar);
        gj(31, parcelGh);
    }

    @Override // defpackage.veg
    public final void aq(vhe vheVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, vheVar);
        gj(37, parcelGh);
    }

    @Override // defpackage.veg
    public final void ar(vhh vhhVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, vhhVar);
        gj(36, parcelGh);
    }

    @Override // defpackage.veg
    public final void as(vhk vhkVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, vhkVar);
        gj(107, parcelGh);
    }

    @Override // defpackage.veg
    public final void at(vhn vhnVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, vhnVar);
        gj(80, parcelGh);
    }

    @Override // defpackage.veg
    public final void au(vhq vhqVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, vhqVar);
        gj(85, parcelGh);
    }

    @Override // defpackage.veg
    public final void av(vht vhtVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, vhtVar);
        gj(87, parcelGh);
    }

    @Override // defpackage.veg
    public final void aw(int i, int i2, int i3, int i4) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        parcelGh.writeInt(i2);
        parcelGh.writeInt(i3);
        parcelGh.writeInt(i4);
        gj(39, parcelGh);
    }

    @Override // defpackage.veg
    public final void ax(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gj(18, parcelGh);
    }

    @Override // defpackage.veg
    public final void ay(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gj(117, parcelGh);
    }

    @Override // defpackage.veg
    public final void az(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gj(51, parcelGh);
    }

    @Override // defpackage.veg
    public final float e() throws RemoteException {
        Parcel parcelGi = gi(2, gh());
        float f = parcelGi.readFloat();
        parcelGi.recycle();
        return f;
    }

    @Override // defpackage.veg
    public final float f() throws RemoteException {
        Parcel parcelGi = gi(3, gh());
        float f = parcelGi.readFloat();
        parcelGi.recycle();
        return f;
    }

    @Override // defpackage.veg
    public final int g() throws RemoteException {
        Parcel parcelGi = gi(114, gh());
        int i = parcelGi.readInt();
        parcelGi.recycle();
        return i;
    }

    @Override // defpackage.veg
    public final int h() throws RemoteException {
        Parcel parcelGi = gi(15, gh());
        int i = parcelGi.readInt();
        parcelGi.recycle();
        return i;
    }

    @Override // defpackage.veg
    public final Location i() throws RemoteException {
        Parcel parcelGi = gi(23, gh());
        Location location = (Location) ijp.a(parcelGi, Location.CREATOR);
        parcelGi.recycle();
        return location;
    }

    @Override // defpackage.veg
    public final vim j() throws RemoteException {
        vim vikVar;
        Parcel parcelGi = gi(26, gh());
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            vikVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.libraries.maps.internal.IProjectionDelegate");
            vikVar = iInterfaceQueryLocalInterface instanceof vim ? (vim) iInterfaceQueryLocalInterface : new vik(strongBinder);
        }
        parcelGi.recycle();
        return vikVar;
    }

    @Override // defpackage.veg
    public final viz k() throws RemoteException {
        viz vixVar;
        Parcel parcelGi = gi(25, gh());
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            vixVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.libraries.maps.internal.IUiSettingsDelegate");
            vixVar = iInterfaceQueryLocalInterface instanceof viz ? (viz) iInterfaceQueryLocalInterface : new vix(strongBinder);
        }
        parcelGi.recycle();
        return vixVar;
    }

    @Override // defpackage.veg
    public final CameraPosition l() throws RemoteException {
        Parcel parcelGi = gi(1, gh());
        CameraPosition cameraPosition = (CameraPosition) ijp.a(parcelGi, CameraPosition.CREATOR);
        parcelGi.recycle();
        return cameraPosition;
    }

    @Override // defpackage.veg
    public final ICircleDelegate m(CircleOptions circleOptions) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, circleOptions);
        Parcel parcelGi = gi(35, parcelGh);
        ICircleDelegate iCircleDelegateAsInterface = ICircleDelegate.Stub.asInterface(parcelGi.readStrongBinder());
        parcelGi.recycle();
        return iCircleDelegateAsInterface;
    }

    @Override // defpackage.veg
    public final IFeatureLayerDelegate n(FeatureLayerOptions featureLayerOptions) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, featureLayerOptions);
        Parcel parcelGi = gi(112, parcelGh);
        IFeatureLayerDelegate iFeatureLayerDelegateAsInterface = IFeatureLayerDelegate.Stub.asInterface(parcelGi.readStrongBinder());
        parcelGi.recycle();
        return iFeatureLayerDelegateAsInterface;
    }

    @Override // defpackage.veg
    public final IGroundOverlayDelegate o(GroundOverlayOptions groundOverlayOptions) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, groundOverlayOptions);
        Parcel parcelGi = gi(12, parcelGh);
        IGroundOverlayDelegate iGroundOverlayDelegateAsInterface = IGroundOverlayDelegate.Stub.asInterface(parcelGi.readStrongBinder());
        parcelGi.recycle();
        return iGroundOverlayDelegateAsInterface;
    }

    @Override // defpackage.veg
    public final IIndoorBuildingDelegate p() throws RemoteException {
        Parcel parcelGi = gi(44, gh());
        IIndoorBuildingDelegate iIndoorBuildingDelegateAsInterface = IIndoorBuildingDelegate.Stub.asInterface(parcelGi.readStrongBinder());
        parcelGi.recycle();
        return iIndoorBuildingDelegateAsInterface;
    }

    @Override // defpackage.veg
    public final IMapCapabilitiesDelegate q() throws RemoteException {
        Parcel parcelGi = gi(109, gh());
        IMapCapabilitiesDelegate iMapCapabilitiesDelegateAsInterface = IMapCapabilitiesDelegate.Stub.asInterface(parcelGi.readStrongBinder());
        parcelGi.recycle();
        return iMapCapabilitiesDelegateAsInterface;
    }

    @Override // defpackage.veg
    public final IMarkerDelegate r(MarkerOptions markerOptions) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, markerOptions);
        Parcel parcelGi = gi(11, parcelGh);
        IMarkerDelegate iMarkerDelegateAsInterface = IMarkerDelegate.Stub.asInterface(parcelGi.readStrongBinder());
        parcelGi.recycle();
        return iMarkerDelegateAsInterface;
    }

    @Override // defpackage.veg
    public final IPolygonDelegate s(PolygonOptions polygonOptions) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, polygonOptions);
        Parcel parcelGi = gi(10, parcelGh);
        IPolygonDelegate iPolygonDelegateAsInterface = IPolygonDelegate.Stub.asInterface(parcelGi.readStrongBinder());
        parcelGi.recycle();
        return iPolygonDelegateAsInterface;
    }

    @Override // defpackage.veg
    public final IPolylineDelegate t(PolylineOptions polylineOptions) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, polylineOptions);
        Parcel parcelGi = gi(9, parcelGh);
        IPolylineDelegate iPolylineDelegateAsInterface = IPolylineDelegate.Stub.asInterface(parcelGi.readStrongBinder());
        parcelGi.recycle();
        return iPolylineDelegateAsInterface;
    }

    @Override // defpackage.veg
    public final ITileOverlayDelegate u(TileOverlayOptions tileOverlayOptions) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, tileOverlayOptions);
        Parcel parcelGi = gi(13, parcelGh);
        ITileOverlayDelegate iTileOverlayDelegateAsInterface = ITileOverlayDelegate.Stub.asInterface(parcelGi.readStrongBinder());
        parcelGi.recycle();
        return iTileOverlayDelegateAsInterface;
    }

    @Override // defpackage.veg
    public final String v(String str) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeString(str);
        Parcel parcelGi = gi(115, parcelGh);
        String string = parcelGi.readString();
        parcelGi.recycle();
        return string;
    }

    @Override // defpackage.veg
    public final void w(vgj vgjVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, vgjVar);
        gj(110, parcelGh);
    }

    @Override // defpackage.veg
    public final void x(sqj sqjVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, sqjVar);
        gj(5, parcelGh);
    }

    @Override // defpackage.veg
    public final void y(sqj sqjVar, veb vebVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, sqjVar);
        ijp.i(parcelGh, vebVar);
        gj(6, parcelGh);
    }

    @Override // defpackage.veg
    public final void z(sqj sqjVar, int i, veb vebVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, sqjVar);
        parcelGh.writeInt(i);
        ijp.i(parcelGh, vebVar);
        gj(7, parcelGh);
    }
}
