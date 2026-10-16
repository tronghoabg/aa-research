package com.google.android.libraries.maps;

import android.graphics.Bitmap;
import android.location.Location;
import android.os.RemoteException;
import android.view.View;
import com.google.android.libraries.maps.model.AdvancedMarker;
import com.google.android.libraries.maps.model.AdvancedMarkerOptions;
import com.google.android.libraries.maps.model.CameraPosition;
import com.google.android.libraries.maps.model.Circle;
import com.google.android.libraries.maps.model.CircleOptions;
import com.google.android.libraries.maps.model.FeatureLayer;
import com.google.android.libraries.maps.model.FeatureLayerOptions;
import com.google.android.libraries.maps.model.FeatureType;
import com.google.android.libraries.maps.model.GroundOverlay;
import com.google.android.libraries.maps.model.GroundOverlayOptions;
import com.google.android.libraries.maps.model.IndoorBuilding;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.LatLngBounds;
import com.google.android.libraries.maps.model.MapCapabilities;
import com.google.android.libraries.maps.model.MapColorScheme;
import com.google.android.libraries.maps.model.MapStyleOptions;
import com.google.android.libraries.maps.model.Marker;
import com.google.android.libraries.maps.model.MarkerOptions;
import com.google.android.libraries.maps.model.PointOfInterest;
import com.google.android.libraries.maps.model.Polygon;
import com.google.android.libraries.maps.model.PolygonOptions;
import com.google.android.libraries.maps.model.Polyline;
import com.google.android.libraries.maps.model.PolylineOptions;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import com.google.android.libraries.maps.model.TileOverlay;
import com.google.android.libraries.maps.model.TileOverlayOptions;
import com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate;
import com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate;
import com.google.android.libraries.maps.model.internal.IMarkerDelegate;
import com.google.android.libraries.maps.model.internal.ITileOverlayDelegate;
import defpackage.a;
import defpackage.spu;
import defpackage.sqi;
import defpackage.vcx;
import defpackage.vcz;
import defpackage.vda;
import defpackage.vdb;
import defpackage.vdc;
import defpackage.vdd;
import defpackage.veg;
import defpackage.vei;
import defpackage.vfb;
import defpackage.vfe;
import defpackage.vfh;
import defpackage.vfk;
import defpackage.vfn;
import defpackage.vfq;
import defpackage.vft;
import defpackage.vfw;
import defpackage.vfz;
import defpackage.vgc;
import defpackage.vgi;
import defpackage.vgj;
import defpackage.vgl;
import defpackage.vgr;
import defpackage.vgx;
import defpackage.vha;
import defpackage.vhd;
import defpackage.vhg;
import defpackage.vhj;
import defpackage.vhm;
import defpackage.vhp;
import defpackage.vhs;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class GoogleMap {
    public static final String DEMO_MAP_ID = "demo_map_id";
    public static final int MAP_TYPE_HYBRID = 4;
    public static final int MAP_TYPE_NONE = 0;
    public static final int MAP_TYPE_NORMAL = 1;
    public static final int MAP_TYPE_SATELLITE = 2;
    public static final int MAP_TYPE_TERRAIN = 3;
    private final veg a;
    private MapCapabilities b;
    private final Map c = new HashMap();
    private final Map d = new HashMap();
    private UiSettings e;

    public interface CancelableCallback {
        void onCancel();

        void onFinish();
    }

    public interface InfoWindowAdapter {
        View getInfoContents(Marker marker);

        View getInfoWindow(Marker marker);
    }

    @Deprecated
    public interface OnCameraChangeListener {
        void onCameraChange(CameraPosition cameraPosition);
    }

    public interface OnCameraIdleListener {
        void onCameraIdle();
    }

    public interface OnCameraMoveCanceledListener {
        void onCameraMoveCanceled();
    }

    public interface OnCameraMoveListener {
        void onCameraMove();
    }

    public interface OnCameraMoveStartedListener {
        public static final int REASON_API_ANIMATION = 2;
        public static final int REASON_DEVELOPER_ANIMATION = 3;
        public static final int REASON_GESTURE = 1;

        void onCameraMoveStarted(int i);
    }

    public interface OnCircleClickListener {
        void onCircleClick(Circle circle);
    }

    public interface OnGroundOverlayClickListener {
        void onGroundOverlayClick(GroundOverlay groundOverlay);
    }

    public interface OnIndoorStateChangeListener {
        void onIndoorBuildingFocused();

        void onIndoorLevelActivated(IndoorBuilding indoorBuilding);
    }

    public interface OnInfoWindowClickListener {
        void onInfoWindowClick(Marker marker);
    }

    public interface OnInfoWindowCloseListener {
        void onInfoWindowClose(Marker marker);
    }

    public interface OnInfoWindowLongClickListener {
        void onInfoWindowLongClick(Marker marker);
    }

    public interface OnMapCapabilitiesChangedListener {
        void onMapCapabilitiesChanged(MapCapabilities mapCapabilities);
    }

    public interface OnMapClickListener {
        void onMapClick(LatLng latLng);
    }

    public interface OnMapLoadedCallback {
        void onMapLoaded();
    }

    public interface OnMapLongClickListener {
        void onMapLongClick(LatLng latLng);
    }

    public interface OnMarkerClickListener {
        boolean onMarkerClick(Marker marker);
    }

    public interface OnMarkerDragListener {
        void onMarkerDrag(Marker marker);

        void onMarkerDragEnd(Marker marker);

        void onMarkerDragStart(Marker marker);
    }

    public interface OnMyLocationButtonClickListener {
        boolean onMyLocationButtonClick();
    }

    @Deprecated
    public interface OnMyLocationChangeListener {
        void onMyLocationChange(Location location);
    }

    public interface OnMyLocationClickListener {
        void onMyLocationClick(Location location);
    }

    public interface OnPoiClickListener {
        void onPoiClick(PointOfInterest pointOfInterest);
    }

    public interface OnPolygonClickListener {
        void onPolygonClick(Polygon polygon);
    }

    public interface OnPolylineClickListener {
        void onPolylineClick(Polyline polyline);
    }

    public interface SnapshotReadyCallback {
        void onSnapshotReady(Bitmap bitmap);
    }

    public GoogleMap(veg vegVar) {
        spu.aw(vegVar);
        this.a = vegVar;
    }

    public final Circle addCircle(CircleOptions circleOptions) {
        try {
            return new Circle(this.a.m(circleOptions));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final GroundOverlay addGroundOverlay(GroundOverlayOptions groundOverlayOptions) {
        try {
            IGroundOverlayDelegate iGroundOverlayDelegateO = this.a.o(groundOverlayOptions);
            if (iGroundOverlayDelegateO != null) {
                return new GroundOverlay(iGroundOverlayDelegateO);
            }
            return null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final Marker addMarker(MarkerOptions markerOptions) {
        if (markerOptions instanceof AdvancedMarkerOptions) {
            markerOptions.setMarkerType(1);
        }
        try {
            IMarkerDelegate iMarkerDelegateR = this.a.r(markerOptions);
            if (iMarkerDelegateR != null) {
                return markerOptions.getMarkerType() == 1 ? new AdvancedMarker(iMarkerDelegateR) : new Marker(iMarkerDelegateR);
            }
            return null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void addOnMapCapabilitiesChangedListener(OnMapCapabilitiesChangedListener onMapCapabilitiesChangedListener) {
        try {
            vgi vgiVar = new vgi(onMapCapabilitiesChangedListener);
            this.c.put(onMapCapabilitiesChangedListener, vgiVar);
            this.a.w(vgiVar);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final Polygon addPolygon(PolygonOptions polygonOptions) {
        try {
            return new Polygon(this.a.s(polygonOptions));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final Polyline addPolyline(PolylineOptions polylineOptions) {
        try {
            return new Polyline(this.a.t(polylineOptions));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final TileOverlay addTileOverlay(TileOverlayOptions tileOverlayOptions) {
        try {
            ITileOverlayDelegate iTileOverlayDelegateU = this.a.u(tileOverlayOptions);
            if (iTileOverlayDelegateU != null) {
                return new TileOverlay(iTileOverlayDelegateU);
            }
            return null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void animateCamera(CameraUpdate cameraUpdate, int i, CancelableCallback cancelableCallback) {
        try {
            this.a.z(cameraUpdate.getRemoteObject(), i, cancelableCallback == null ? null : new vdd(cancelableCallback));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void clear() {
        try {
            this.a.A();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final CameraPosition getCameraPosition() {
        try {
            return new CameraPosition(this.a.l());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public String getDebugString(String str) {
        try {
            String strBK = a.bK(str, "  ");
            StringWriter stringWriter = new StringWriter();
            stringWriter.append((CharSequence) strBK).append((CharSequence) ("LATEST " + getClass().getName() + ":"));
            stringWriter.append((CharSequence) this.a.v(strBK));
            return stringWriter.toString();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public veg getDelegate() {
        return this.a;
    }

    public FeatureLayer getFeatureLayer(FeatureLayerOptions featureLayerOptions) {
        String featureType = featureLayerOptions.getFeatureType();
        String datasetId = featureLayerOptions.getDatasetId();
        boolean zEquals = featureType.equals(FeatureType.DATASET);
        Map map = this.d;
        FeatureLayer featureLayer = zEquals ? (FeatureLayer) map.get(datasetId) : (FeatureLayer) map.get(featureType);
        if (featureLayer != null) {
            return featureLayer;
        }
        try {
            FeatureLayer featureLayer2 = new FeatureLayer(this.a.n(featureLayerOptions));
            Map map2 = this.d;
            if (zEquals) {
                map2.put(datasetId, featureLayer2);
                return featureLayer2;
            }
            map2.put(featureType, featureLayer2);
            return featureLayer2;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public IndoorBuilding getFocusedBuilding() {
        try {
            IIndoorBuildingDelegate iIndoorBuildingDelegateP = this.a.p();
            if (iIndoorBuildingDelegateP != null) {
                return new IndoorBuilding(iIndoorBuildingDelegateP);
            }
            return null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public MapCapabilities getMapCapabilities() {
        MapCapabilities mapCapabilities = this.b;
        if (mapCapabilities != null) {
            return mapCapabilities;
        }
        try {
            MapCapabilities mapCapabilities2 = new MapCapabilities(this.a.q());
            this.b = mapCapabilities2;
            return mapCapabilities2;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @MapColorScheme
    public int getMapColorScheme() {
        try {
            return this.a.g();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int getMapType() {
        try {
            return this.a.h();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final float getMaxZoomLevel() {
        try {
            return this.a.e();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final float getMinZoomLevel() {
        try {
            return this.a.f();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Deprecated
    public final Location getMyLocation() {
        try {
            return new Location(this.a.i());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final Projection getProjection() {
        try {
            return new Projection(this.a.j());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final UiSettings getUiSettings() {
        UiSettings uiSettings = this.e;
        if (uiSettings != null) {
            return uiSettings;
        }
        try {
            UiSettings uiSettings2 = new UiSettings(this.a.k());
            this.e = uiSettings2;
            return uiSettings2;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isBuildingsEnabled() {
        try {
            return this.a.aD();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isIndoorEnabled() {
        try {
            return this.a.aE();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isMyLocationEnabled() {
        try {
            return this.a.aF();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isTrafficEnabled() {
        try {
            return this.a.aG();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isTransitEnabled() {
        try {
            return this.a.aH();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void moveCamera(CameraUpdate cameraUpdate) {
        try {
            this.a.C(cameraUpdate.getRemoteObject());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void removeOnMapCapabilitiesChangedListener(OnMapCapabilitiesChangedListener onMapCapabilitiesChangedListener) {
        try {
            Map map = this.c;
            if (map.containsKey(onMapCapabilitiesChangedListener)) {
                this.a.O((vgj) map.get(onMapCapabilitiesChangedListener));
                map.remove(onMapCapabilitiesChangedListener);
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void resetMinMaxZoomPreference() {
        try {
            this.a.P();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setBuildingsEnabled(boolean z) {
        try {
            this.a.Q(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setContentDescription(String str) {
        try {
            this.a.R(str);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean setIndoorEnabled(boolean z) {
        try {
            return this.a.aI(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setInfoWindowAdapter(InfoWindowAdapter infoWindowAdapter) {
        veg vegVar = this.a;
        if (infoWindowAdapter == null) {
            try {
                vegVar.S(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            try {
                vegVar.S(new vei(infoWindowAdapter));
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        }
    }

    public void setLatLngBoundsForCameraTarget(LatLngBounds latLngBounds) {
        try {
            this.a.T(latLngBounds);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setLocationSource(LocationSource locationSource) {
        veg vegVar = this.a;
        if (locationSource == null) {
            try {
                vegVar.U(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            try {
                vegVar.U(new vdb(locationSource));
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        }
    }

    public void setMapColorScheme(@MapColorScheme int i) {
        try {
            this.a.V(i);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean setMapStyle(MapStyleOptions mapStyleOptions) {
        try {
            return this.a.aJ(mapStyleOptions);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setMapType(int i) {
        try {
            this.a.W(i);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setMaxZoomPreference(float f) {
        try {
            this.a.X(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setMinZoomPreference(float f) {
        try {
            this.a.Y(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setMyLocationEnabled(boolean z) {
        try {
            this.a.Z(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Deprecated
    public final void setOnCameraChangeListener(OnCameraChangeListener onCameraChangeListener) {
        veg vegVar = this.a;
        if (onCameraChangeListener == null) {
            try {
                vegVar.aa(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            try {
                vegVar.aa(new vdc(onCameraChangeListener));
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        }
    }

    public final void setOnCameraIdleListener(OnCameraIdleListener onCameraIdleListener) {
        veg vegVar = this.a;
        if (onCameraIdleListener == null) {
            try {
                vegVar.ab(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            try {
                vegVar.ab(new vfb(onCameraIdleListener));
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        }
    }

    public final void setOnCameraMoveCanceledListener(OnCameraMoveCanceledListener onCameraMoveCanceledListener) {
        veg vegVar = this.a;
        if (onCameraMoveCanceledListener == null) {
            try {
                vegVar.ac(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            try {
                vegVar.ac(new vfe(onCameraMoveCanceledListener));
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        }
    }

    public final void setOnCameraMoveListener(OnCameraMoveListener onCameraMoveListener) {
        veg vegVar = this.a;
        try {
            if (onCameraMoveListener == null) {
                vegVar.ad(null);
            } else {
                vegVar.ad(new vfh(onCameraMoveListener));
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setOnCameraMoveStartedListener(OnCameraMoveStartedListener onCameraMoveStartedListener) {
        veg vegVar = this.a;
        try {
            if (onCameraMoveStartedListener == null) {
                vegVar.ae(null);
            } else {
                vegVar.ae(new vfk(onCameraMoveStartedListener));
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setOnCircleClickListener(OnCircleClickListener onCircleClickListener) {
        veg vegVar = this.a;
        if (onCircleClickListener == null) {
            try {
                vegVar.af(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            try {
                vegVar.af(new vfn(onCircleClickListener));
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        }
    }

    public final void setOnGroundOverlayClickListener(OnGroundOverlayClickListener onGroundOverlayClickListener) {
        veg vegVar = this.a;
        if (onGroundOverlayClickListener == null) {
            try {
                vegVar.ag(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            try {
                vegVar.ag(new vfq(onGroundOverlayClickListener));
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        }
    }

    public final void setOnIndoorStateChangeListener(OnIndoorStateChangeListener onIndoorStateChangeListener) {
        veg vegVar = this.a;
        if (onIndoorStateChangeListener == null) {
            try {
                vegVar.ah(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            try {
                vegVar.ah(new vft(onIndoorStateChangeListener));
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        }
    }

    public final void setOnInfoWindowClickListener(OnInfoWindowClickListener onInfoWindowClickListener) {
        veg vegVar = this.a;
        if (onInfoWindowClickListener == null) {
            try {
                vegVar.ai(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            try {
                vegVar.ai(new vfw(onInfoWindowClickListener));
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        }
    }

    public final void setOnInfoWindowCloseListener(OnInfoWindowCloseListener onInfoWindowCloseListener) {
        veg vegVar = this.a;
        if (onInfoWindowCloseListener == null) {
            try {
                vegVar.aj(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            try {
                vegVar.aj(new vfz(onInfoWindowCloseListener));
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        }
    }

    public final void setOnInfoWindowLongClickListener(OnInfoWindowLongClickListener onInfoWindowLongClickListener) {
        veg vegVar = this.a;
        if (onInfoWindowLongClickListener == null) {
            try {
                vegVar.ak(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            try {
                vegVar.ak(new vgc(onInfoWindowLongClickListener));
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        }
    }

    public final void setOnMapClickListener(OnMapClickListener onMapClickListener) {
        veg vegVar = this.a;
        if (onMapClickListener == null) {
            try {
                vegVar.al(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            try {
                vegVar.al(new vgl(onMapClickListener));
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        }
    }

    public void setOnMapLoadedCallback(OnMapLoadedCallback onMapLoadedCallback) {
        veg vegVar = this.a;
        if (onMapLoadedCallback == null) {
            try {
                vegVar.am(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            try {
                vegVar.am(new vcx(onMapLoadedCallback));
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        }
    }

    public final void setOnMapLongClickListener(OnMapLongClickListener onMapLongClickListener) {
        veg vegVar = this.a;
        if (onMapLongClickListener == null) {
            try {
                vegVar.an(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            try {
                vegVar.an(new vgr(onMapLongClickListener));
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        }
    }

    public final void setOnMarkerClickListener(OnMarkerClickListener onMarkerClickListener) {
        veg vegVar = this.a;
        if (onMarkerClickListener == null) {
            try {
                vegVar.ao(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            try {
                vegVar.ao(new vgx(onMarkerClickListener));
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        }
    }

    public final void setOnMarkerDragListener(OnMarkerDragListener onMarkerDragListener) {
        veg vegVar = this.a;
        if (onMarkerDragListener == null) {
            try {
                vegVar.ap(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            try {
                vegVar.ap(new vha(onMarkerDragListener));
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        }
    }

    public final void setOnMyLocationButtonClickListener(OnMyLocationButtonClickListener onMyLocationButtonClickListener) {
        veg vegVar = this.a;
        if (onMyLocationButtonClickListener == null) {
            try {
                vegVar.aq(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            try {
                vegVar.aq(new vhd(onMyLocationButtonClickListener));
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        }
    }

    @Deprecated
    public final void setOnMyLocationChangeListener(OnMyLocationChangeListener onMyLocationChangeListener) {
        veg vegVar = this.a;
        if (onMyLocationChangeListener == null) {
            try {
                vegVar.ar(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            try {
                vegVar.ar(new vhg(onMyLocationChangeListener));
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        }
    }

    public final void setOnMyLocationClickListener(OnMyLocationClickListener onMyLocationClickListener) {
        veg vegVar = this.a;
        if (onMyLocationClickListener == null) {
            try {
                vegVar.as(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            try {
                vegVar.as(new vhj(onMyLocationClickListener));
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        }
    }

    public final void setOnPoiClickListener(OnPoiClickListener onPoiClickListener) {
        veg vegVar = this.a;
        if (onPoiClickListener == null) {
            try {
                vegVar.at(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            try {
                vegVar.at(new vhm(onPoiClickListener));
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        }
    }

    public final void setOnPolygonClickListener(OnPolygonClickListener onPolygonClickListener) {
        veg vegVar = this.a;
        if (onPolygonClickListener == null) {
            try {
                vegVar.au(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            try {
                vegVar.au(new vhp(onPolygonClickListener));
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        }
    }

    public final void setOnPolylineClickListener(OnPolylineClickListener onPolylineClickListener) {
        veg vegVar = this.a;
        if (onPolylineClickListener == null) {
            try {
                vegVar.av(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            try {
                vegVar.av(new vhs(onPolylineClickListener));
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        }
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        try {
            this.a.aw(i, i2, i3, i4);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setTrafficEnabled(boolean z) {
        try {
            this.a.ax(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setTransitEnabled(boolean z) {
        try {
            this.a.ay(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setWatermarkEnabled(boolean z) {
        try {
            this.a.az(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void snapshot(SnapshotReadyCallback snapshotReadyCallback, Bitmap bitmap) {
        try {
            this.a.aA(new vcz(snapshotReadyCallback), bitmap != null ? new sqi(bitmap) : null);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void snapshotForTest(SnapshotReadyCallback snapshotReadyCallback) {
        try {
            this.a.aB(new vda(snapshotReadyCallback));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void stopAnimation() {
        try {
            this.a.aC();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void animateCamera(CameraUpdate cameraUpdate) {
        try {
            this.a.x(cameraUpdate.getRemoteObject());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void snapshot(SnapshotReadyCallback snapshotReadyCallback) {
        snapshot(snapshotReadyCallback, null);
    }

    public final void animateCamera(CameraUpdate cameraUpdate, CancelableCallback cancelableCallback) {
        try {
            this.a.y(cameraUpdate.getRemoteObject(), cancelableCallback == null ? null : new vdd(cancelableCallback));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
