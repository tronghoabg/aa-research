package defpackage;

import android.location.Location;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.CameraPosition;
import com.google.android.libraries.maps.model.CircleOptions;
import com.google.android.libraries.maps.model.FeatureLayerOptions;
import com.google.android.libraries.maps.model.GroundOverlayOptions;
import com.google.android.libraries.maps.model.LatLngBounds;
import com.google.android.libraries.maps.model.MapColorScheme;
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
public interface veg extends IInterface {
    void A() throws RemoteException;

    void B(vgv vgvVar) throws RemoteException;

    void C(sqj sqjVar) throws RemoteException;

    void D() throws RemoteException;

    void E(Bundle bundle) throws RemoteException;

    void F() throws RemoteException;

    void G(Bundle bundle) throws RemoteException;

    void H() throws RemoteException;

    void I() throws RemoteException;

    void J() throws RemoteException;

    void K() throws RemoteException;

    void L(Bundle bundle) throws RemoteException;

    void M() throws RemoteException;

    void N() throws RemoteException;

    void O(vgj vgjVar) throws RemoteException;

    void P() throws RemoteException;

    void Q(boolean z) throws RemoteException;

    void R(String str) throws RemoteException;

    void S(vej vejVar) throws RemoteException;

    void T(LatLngBounds latLngBounds) throws RemoteException;

    void U(vem vemVar) throws RemoteException;

    void V(@MapColorScheme int i) throws RemoteException;

    void W(int i) throws RemoteException;

    void X(float f) throws RemoteException;

    void Y(float f) throws RemoteException;

    void Z(boolean z) throws RemoteException;

    void aA(vip vipVar, sqj sqjVar) throws RemoteException;

    void aB(vip vipVar) throws RemoteException;

    void aC() throws RemoteException;

    boolean aD() throws RemoteException;

    boolean aE() throws RemoteException;

    boolean aF() throws RemoteException;

    boolean aG() throws RemoteException;

    boolean aH() throws RemoteException;

    boolean aI(boolean z) throws RemoteException;

    boolean aJ(MapStyleOptions mapStyleOptions) throws RemoteException;

    boolean aK() throws RemoteException;

    void aa(vez vezVar) throws RemoteException;

    void ab(vfc vfcVar) throws RemoteException;

    void ac(vff vffVar) throws RemoteException;

    void ad(vfi vfiVar) throws RemoteException;

    void ae(vfl vflVar) throws RemoteException;

    void af(vfo vfoVar) throws RemoteException;

    void ag(vfr vfrVar) throws RemoteException;

    void ah(vfu vfuVar) throws RemoteException;

    void ai(vfx vfxVar) throws RemoteException;

    void aj(vga vgaVar) throws RemoteException;

    void ak(vgd vgdVar) throws RemoteException;

    void al(vgm vgmVar) throws RemoteException;

    void am(vgp vgpVar) throws RemoteException;

    void an(vgs vgsVar) throws RemoteException;

    void ao(vgy vgyVar) throws RemoteException;

    void ap(vhb vhbVar) throws RemoteException;

    void aq(vhe vheVar) throws RemoteException;

    void ar(vhh vhhVar) throws RemoteException;

    void as(vhk vhkVar) throws RemoteException;

    void at(vhn vhnVar) throws RemoteException;

    void au(vhq vhqVar) throws RemoteException;

    void av(vht vhtVar) throws RemoteException;

    void aw(int i, int i2, int i3, int i4) throws RemoteException;

    void ax(boolean z) throws RemoteException;

    void ay(boolean z) throws RemoteException;

    void az(boolean z) throws RemoteException;

    float e() throws RemoteException;

    float f() throws RemoteException;

    @MapColorScheme
    int g() throws RemoteException;

    int h() throws RemoteException;

    Location i() throws RemoteException;

    vim j() throws RemoteException;

    viz k() throws RemoteException;

    CameraPosition l() throws RemoteException;

    ICircleDelegate m(CircleOptions circleOptions) throws RemoteException;

    IFeatureLayerDelegate n(FeatureLayerOptions featureLayerOptions) throws RemoteException;

    IGroundOverlayDelegate o(GroundOverlayOptions groundOverlayOptions) throws RemoteException;

    IIndoorBuildingDelegate p() throws RemoteException;

    IMapCapabilitiesDelegate q() throws RemoteException;

    IMarkerDelegate r(MarkerOptions markerOptions) throws RemoteException;

    IPolygonDelegate s(PolygonOptions polygonOptions) throws RemoteException;

    IPolylineDelegate t(PolylineOptions polylineOptions) throws RemoteException;

    ITileOverlayDelegate u(TileOverlayOptions tileOverlayOptions) throws RemoteException;

    String v(String str) throws RemoteException;

    void w(vgj vgjVar) throws RemoteException;

    void x(sqj sqjVar) throws RemoteException;

    void y(sqj sqjVar, veb vebVar) throws RemoteException;

    void z(sqj sqjVar, int i, veb vebVar) throws RemoteException;
}
