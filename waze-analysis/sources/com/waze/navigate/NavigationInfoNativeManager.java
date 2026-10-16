package com.waze.navigate;

import android.util.Log;
import androidx.camera.video.AudioStats;
import com.waze.gw.Gateway;
import com.waze.jni.protos.DistanceUnitOuterClass;
import com.waze.jni.protos.NavigationSegment;
import com.waze.jni.protos.alerters.AlerterType;
import com.waze.jni.protos.navigate.AverageSpeedCameraZoneUpdate;
import com.waze.jni.protos.navigate.BeaconInformation;
import com.waze.jni.protos.navigate.CurrentStreetNameUpdate;
import com.waze.jni.protos.navigate.DistanceUpdate;
import com.waze.jni.protos.navigate.Instruction;
import com.waze.jni.protos.navigate.NavigationLaneList;
import com.waze.jni.protos.navigate.NavigationRoute;
import com.waze.jni.protos.navigate.NextStreetNameUpdate;
import com.waze.jni.protos.navigate.OfflineNavigationRouteProto;
import com.waze.jni.protos.navigate.PolylineGeometry;
import com.waze.jni.protos.navigate.TollPriceInformation;
import com.waze.jni.protos.navigate.TrafficJamSection;
import com.waze.jni.protos.navigate.TrafficZoneUpdate;
import com.waze.jni.protos.navigate.WaypointPosition;
import com.waze.jni.protos.places.GenericPlace;
import j$.lang.Iterable$EL;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class NavigationInfoNativeManager extends ds {
    private static final String LOG_TAG = "NavigationInfoNativeManager";
    private static NavigationInfoNativeManager instance;
    private String distanceUnit;
    private boolean driveOnLeft;
    private String etaDistance;
    private String etaDistanceUnit;
    private String etaTime;
    private String etaTimeUnit;
    private String instructionDistance;
    private boolean isNavigating;
    private boolean isOffline;
    private String timeString;
    private int etaMinutes = -1;
    private int etaDistanceMeters = -1;
    private int distanceMeters = -1;
    private int distanceIntPart = 0;
    private int distanceFracPart = 0;
    private boolean distanceIsMajorUnit = false;
    private int currentEtaSeconds = -1;
    private int nextExit = -1;
    private int currentExit = -1;
    private CurrentStreetNameUpdate currentStreetNameUpdate = null;
    private NextStreetNameUpdate nextStreetNameUpdate = null;
    private ea currentInstruction = null;
    private ea nextInstruction = null;
    private final kotlinx.coroutines.b.bn<Boolean> nearingDestination = kotlinx.coroutines.b.ck.b(false);
    private final kotlinx.coroutines.b.bn<String> hovText = kotlinx.coroutines.b.ck.b(null);
    private final Set<dj> navigationUpdateListeners = ConcurrentHashMap.newKeySet();
    private com.waze.ac.r encouragementStatsSender = null;
    private com.waze.ac.b.b engagementButtonClickedSender = null;

    private de convertDistanceUpdate(DistanceUpdate distanceUpdate) {
        return new de(distanceUpdate.getValue(), convertUnit(distanceUpdate.getUnit()), distanceUpdate.getValueString(), distanceUpdate.getUnitString(), distanceUpdate.getRawMeters());
    }

    private com.waze.sharedui.utils.d convertUnit(DistanceUnitOuterClass.DistanceUnit distanceUnit) {
        DistanceUnitOuterClass.DistanceUnit distanceUnit2 = DistanceUnitOuterClass.DistanceUnit.Meters;
        int iOrdinal = distanceUnit.ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? com.waze.sharedui.utils.d.METER : com.waze.sharedui.utils.d.MILE : com.waze.sharedui.utils.d.FOOT : com.waze.sharedui.utils.d.KILOMETER;
    }

    public static synchronized NavigationInfoNativeManager getInstance() {
        NavigationInfoNativeManager navigationInfoNativeManager;
        navigationInfoNativeManager = instance;
        if (navigationInfoNativeManager == null) {
            navigationInfoNativeManager = new NavigationInfoNativeManager();
            instance = navigationInfoNativeManager;
        }
        return navigationInfoNativeManager;
    }

    private boolean hasSegment(NavigationSegment navigationSegment) {
        return navigationSegment.hasTileId() && navigationSegment.hasLineId() && navigationSegment.hasIsReversed() && navigationSegment.hasFromNode() && navigationSegment.hasToNode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ h.ab lambda$onLanesGuidanceChanged$0(NavigationLaneList navigationLaneList) {
        Gateway.onLanes(navigationLaneList);
        di diVar = navigationLaneList != null ? new di(this, navigationLaneList) : null;
        Iterator<dj> it = this.navigationUpdateListeners.iterator();
        while (it.hasNext()) {
            it.next().k(diVar);
        }
        return h.ab.f48028a;
    }

    private com.waze.shared_infra.l.a navigationSegmentProtoToSegment(NavigationSegment navigationSegment) {
        return new com.waze.shared_infra.l.a(navigationSegment.getTileId(), navigationSegment.getLineId(), navigationSegment.getIsReversed(), navigationSegment.getFromNode(), navigationSegment.getToNode(), new com.waze.shared_infra.h.c(navigationSegment.getFromCoordinate().getLatitude(), navigationSegment.getFromCoordinate().getLongitude()), new com.waze.shared_infra.h.c(navigationSegment.getToCoordinate().getLatitude(), navigationSegment.getToCoordinate().getLongitude()));
    }

    public void addNavigationUpdateListener(dj djVar) {
        this.navigationUpdateListeners.add(djVar);
        restoreForListener(djVar);
    }

    protected native void forceLanesEarlyDisplayNTV();

    protected native String formatEtaClockStringNTV(int i2, boolean z);

    public boolean getDriveOnLeft() {
        return this.driveOnLeft;
    }

    public int getEtaMinutes() {
        return this.etaMinutes;
    }

    public kotlinx.coroutines.b.ch<String> getHovTextFlow() {
        return this.hovText;
    }

    protected native int getMetersElapsedSinceSegmentNTV(int i2);

    protected native int getMetersToCrossSegmentNTV(int i2);

    protected native byte[] getNavigationItemsNTV();

    protected native byte[] getNavigationLanesNTV();

    public kotlinx.coroutines.b.ch<Boolean> getNearingDestination() {
        return this.nearingDestination;
    }

    void hideNearingDestination() {
        Log.i("NearingDest", "About to hide nearing dest from nav bar manager");
        this.nearingDestination.e(false);
    }

    public native void initNativeLayerNTV();

    void initialize(int i2) {
        this.driveOnLeft = i2 != 0;
        this.etaTime = null;
        this.timeString = null;
        this.etaDistance = null;
        this.etaDistanceMeters = -1;
        this.instructionDistance = null;
        this.distanceUnit = null;
        this.distanceMeters = -1;
        this.distanceIntPart = 0;
        this.distanceFracPart = 0;
        this.distanceIsMajorUnit = false;
        this.currentEtaSeconds = -1;
        this.etaMinutes = -1;
        this.nextExit = -1;
        this.currentExit = -1;
        this.nextInstruction = null;
        this.currentInstruction = null;
        this.currentStreetNameUpdate = null;
        this.nextStreetNameUpdate = null;
        this.hovText.e(null);
        this.encouragementStatsSender = (com.waze.ac.r) com.waze.web.r.h(com.waze.ac.r.class);
        this.engagementButtonClickedSender = (com.waze.ac.b.b) com.waze.web.r.h(com.waze.ac.b.b.class);
        com.waze.shared_infra.i.h.b(LOG_TAG, "initialized! (reset), with " + this.navigationUpdateListeners.size() + " listeners");
        Iterator<dj> it = this.navigationUpdateListeners.iterator();
        while (it.hasNext()) {
            restoreForListener(it.next());
        }
    }

    public boolean isNavigating() {
        return this.isNavigating;
    }

    protected native boolean isNearingDestNTV();

    void onAverageSpeedCamZoneClear() {
        Gateway.onAvgSpeedZoneClear();
        Iterator<dj> it = this.navigationUpdateListeners.iterator();
        while (it.hasNext()) {
            it.next().G(an.f30997a);
        }
    }

    void onAverageSpeedCamZoneUpdate(AverageSpeedCameraZoneUpdate averageSpeedCameraZoneUpdate) {
        Gateway.onAvgSpeedZone(averageSpeedCameraZoneUpdate.getLeftDistance(), averageSpeedCameraZoneUpdate.getRecommendedSpeed(), averageSpeedCameraZoneUpdate.getPercent());
        h.g.b.x.f(averageSpeedCameraZoneUpdate, "<this>");
        am amVar = new am(averageSpeedCameraZoneUpdate.getPercent(), averageSpeedCameraZoneUpdate.getLeftDistance());
        Iterator<dj> it = this.navigationUpdateListeners.iterator();
        while (it.hasNext()) {
            it.next().G(amVar);
        }
    }

    void onBeaconInfoUpdate(BeaconInformation beaconInformation) {
        a aVar = new a(beaconInformation.getHasBeacons());
        Iterator<dj> it = this.navigationUpdateListeners.iterator();
        while (it.hasNext()) {
            it.next().a(aVar);
        }
    }

    void onCurrentEtaSecondsChanged(int i2) {
        if (this.currentEtaSeconds != i2) {
            this.currentEtaSeconds = i2;
            Iterator<dj> it = this.navigationUpdateListeners.iterator();
            while (it.hasNext()) {
                it.next().b(i2);
            }
        }
    }

    void onCurrentInstructionChanged(int i2) {
        Gateway.onNavTurn(i2);
        ea eaVarB = eb.b(Instruction.Type.forNumber(i2));
        if (this.currentInstruction != eaVarB) {
            this.currentInstruction = eaVarB;
            Iterator<dj> it = this.navigationUpdateListeners.iterator();
            while (it.hasNext()) {
                it.next().c(eaVarB);
            }
        }
    }

    void onCurrentInstructionDistanceChanged(DistanceUpdate distanceUpdate) {
        Gateway.onNavDist(distanceUpdate);
        if (distanceUpdate.getRawMeters() != 0 && distanceUpdate.getValueString().equals(this.instructionDistance) && distanceUpdate.getUnitString().equals(this.distanceUnit)) {
            return;
        }
        this.instructionDistance = distanceUpdate.getValueString();
        this.distanceUnit = distanceUpdate.getUnitString();
        this.distanceMeters = distanceUpdate.getRawMeters();
        this.distanceIntPart = (int) Math.floor(distanceUpdate.getValue());
        this.distanceFracPart = ((int) Math.floor(distanceUpdate.getValue() * 10.0d)) % 10;
        boolean z = true;
        if (distanceUpdate.getUnit() != DistanceUnitOuterClass.DistanceUnit.Kilometers && distanceUpdate.getUnit() != DistanceUnitOuterClass.DistanceUnit.Miles) {
            z = false;
        }
        this.distanceIsMajorUnit = z;
        for (dj djVar : this.navigationUpdateListeners) {
            djVar.A(this.instructionDistance, this.distanceUnit, this.distanceMeters);
            djVar.d(convertDistanceUpdate(distanceUpdate));
        }
    }

    void onEnforcementZoneClear() {
        Iterator<dj> it = this.navigationUpdateListeners.iterator();
        while (it.hasNext()) {
            it.next().F(cd.f31163a);
        }
    }

    void onEnforcementZoneUpdate(int i2) {
        cc ccVar = new cc(i2);
        Iterator<dj> it = this.navigationUpdateListeners.iterator();
        while (it.hasNext()) {
            it.next().F(ccVar);
        }
    }

    void onEtaDistanceChanged(DistanceUpdate distanceUpdate) {
        Gateway.onEtaDist(distanceUpdate);
        if (!distanceUpdate.getValueString().equals(this.etaDistance) || !distanceUpdate.getUnitString().equals(this.etaDistanceUnit)) {
            this.etaDistance = distanceUpdate.getValueString();
            this.etaDistanceUnit = distanceUpdate.getUnitString();
            this.etaDistanceMeters = distanceUpdate.getRawMeters();
            Iterator<dj> it = this.navigationUpdateListeners.iterator();
            while (it.hasNext()) {
                it.next().B(this.distanceMeters);
            }
        }
        Iterator<dj> it2 = this.navigationUpdateListeners.iterator();
        while (it2.hasNext()) {
            it2.next().g(convertDistanceUpdate(distanceUpdate));
        }
    }

    void onEtaMinutesChanged(String str, String str2, int i2) {
        Gateway.onEtaTime(str, str2, i2);
        if (str.equals(this.etaTime) && str2.equals(this.etaTimeUnit)) {
            return;
        }
        this.etaTime = str;
        this.etaTimeUnit = str2;
        this.etaMinutes = i2;
        Iterator<dj> it = this.navigationUpdateListeners.iterator();
        while (it.hasNext()) {
            it.next().h(str, str2, i2);
        }
    }

    public void onEtaScreenNavDataReceived(com.waze.main_screen.bottom_bars.scrollable_eta.i iVar) {
        Iterator<dj> it = this.navigationUpdateListeners.iterator();
        while (it.hasNext()) {
            it.next().bB(iVar);
        }
    }

    void onExitNumberChanged(int i2) {
        Gateway.onExitNumber(i2);
        if (this.currentExit != i2) {
            this.currentExit = i2;
            Iterator<dj> it = this.navigationUpdateListeners.iterator();
            while (it.hasNext()) {
                it.next().j(i2);
            }
        }
    }

    void onHovTextChanged(String str) {
        this.hovText.e(str);
        Iterator<dj> it = this.navigationUpdateListeners.iterator();
        while (it.hasNext()) {
            it.next().C();
        }
    }

    void onLanesGuidanceChanged() {
        getNavigationLanes(new com.waze.car_lib.f.u(this, 16));
    }

    void onLastUserDeviationSegmentChanged(NavigationSegment navigationSegment, long j2) {
        com.waze.shared_infra.l.a aVarNavigationSegmentProtoToSegment = hasSegment(navigationSegment) ? navigationSegmentProtoToSegment(navigationSegment) : null;
        Iterator<dj> it = this.navigationUpdateListeners.iterator();
        while (it.hasNext()) {
            it.next().l(aVarNavigationSegmentProtoToSegment, j2);
        }
    }

    void onNavigationRouteChanged(NavigationRoute navigationRoute) {
        Gateway.onNavRoute(navigationRoute);
        com.waze.shared_infra.i.h.b(LOG_TAG, "onNavigationRouteChanged");
        Iterable$EL.forEach(this.navigationUpdateListeners, new dh(et.q(navigationRoute), 1));
    }

    void onNavigationStateChanged(boolean z, int i2) {
        Gateway.onNavState(z);
        this.isNavigating = z;
        if (z) {
            onLanesGuidanceChanged();
        } else {
            com.waze.share.v.q();
        }
        for (dj djVar : this.navigationUpdateListeners) {
            djVar.y(this.driveOnLeft);
            djVar.m(z, i2);
        }
    }

    void onNextExitNumberChanged(int i2) {
        if (this.nextExit != i2) {
            this.nextExit = i2;
            Iterator<dj> it = this.navigationUpdateListeners.iterator();
            while (it.hasNext()) {
                it.next().n(i2);
            }
        }
    }

    void onNextInstructionChanged(int i2) {
        Gateway.onNavTurnNext(i2);
        ea eaVarB = eb.b(Instruction.Type.forNumber(i2));
        if (this.nextInstruction != eaVarB) {
            this.nextInstruction = eaVarB;
            Iterator<dj> it = this.navigationUpdateListeners.iterator();
            while (it.hasNext()) {
                it.next().o(eaVarB);
            }
        }
    }

    void onNextNameChanged(NextStreetNameUpdate nextStreetNameUpdate) {
        this.nextStreetNameUpdate = nextStreetNameUpdate;
        Iterator<dj> it = this.navigationUpdateListeners.iterator();
        while (it.hasNext()) {
            it.next().p(nextStreetNameUpdate.getStreetName(), nextStreetNameUpdate.getDisplayArrowBeforeText(), nextStreetNameUpdate.getSegmentIdx(), nextStreetNameUpdate.hasRoadSign() ? nextStreetNameUpdate.getRoadSign() : null);
        }
    }

    void onNextSegmentChanged(NavigationSegment navigationSegment) {
        com.waze.shared_infra.l.a aVarNavigationSegmentProtoToSegment = hasSegment(navigationSegment) ? navigationSegmentProtoToSegment(navigationSegment) : null;
        Iterator<dj> it = this.navigationUpdateListeners.iterator();
        while (it.hasNext()) {
            it.next().q(aVarNavigationSegmentProtoToSegment);
        }
    }

    void onOfflineNavigationRouteChanged(OfflineNavigationRouteProto offlineNavigationRouteProto) {
        com.waze.shared_infra.i.h.b(LOG_TAG, "onOfflineNavigationRouteChanged");
        Iterable$EL.forEach(this.navigationUpdateListeners, new dh(offlineNavigationRouteProto, 0));
    }

    void onOfflineStateChanged(boolean z) {
        if (this.isOffline != z) {
            this.isOffline = z;
            Iterator<dj> it = this.navigationUpdateListeners.iterator();
            while (it.hasNext()) {
                it.next().r(z);
            }
        }
    }

    void onRouteGeometryUpdated(PolylineGeometry polylineGeometry) {
        Iterator<dj> it = this.navigationUpdateListeners.iterator();
        while (it.hasNext()) {
            it.next().s(polylineGeometry);
        }
    }

    void onRoutingDestinationChanged(GenericPlace genericPlace) {
        Iterator<dj> it = this.navigationUpdateListeners.iterator();
        while (it.hasNext()) {
            it.next().e(com.waze.ac.e.m(genericPlace));
        }
    }

    void onRoutingDestinationClear() {
        Gateway.onNavRouteCleared();
        Iterator<dj> it = this.navigationUpdateListeners.iterator();
        while (it.hasNext()) {
            it.next().e(null);
        }
    }

    void onRoutingIdChanged(long j2) {
        Iterator<dj> it = this.navigationUpdateListeners.iterator();
        while (it.hasNext()) {
            it.next().t(Long.valueOf(j2));
        }
    }

    void onRoutingIdCleared() {
        Iterator<dj> it = this.navigationUpdateListeners.iterator();
        while (it.hasNext()) {
            it.next().t(null);
        }
    }

    public void onShareDriveStateChanged(boolean z) {
        Iterator<dj> it = this.navigationUpdateListeners.iterator();
        while (it.hasNext()) {
            it.next().u(z);
        }
    }

    void onStreetNameChanged(CurrentStreetNameUpdate currentStreetNameUpdate) {
        Gateway.onCurrentStreetUpdate(currentStreetNameUpdate);
        this.currentStreetNameUpdate = currentStreetNameUpdate;
        Iterator<dj> it = this.navigationUpdateListeners.iterator();
        while (it.hasNext()) {
            it.next().v(currentStreetNameUpdate.getStreetName(), currentStreetNameUpdate.getShowHov(), currentStreetNameUpdate.getSegmentIdx(), currentStreetNameUpdate.hasRoadSign() ? currentStreetNameUpdate.getRoadSign() : null);
        }
    }

    void onTimeStringChanged(String str) {
        Gateway.onEtaClock(str);
        if (str.equals(this.timeString)) {
            return;
        }
        this.timeString = str;
        Iterator<dj> it = this.navigationUpdateListeners.iterator();
        while (it.hasNext()) {
            it.next().w(str);
        }
    }

    void onTollInfoUpdate(String str, TollPriceInformation tollPriceInformation) {
        double tollPrice = tollPriceInformation.getTollPrice();
        ga gaVar = null;
        if (tollPrice >= AudioStats.AUDIO_AMPLITUDE_NONE) {
            gaVar = new ga(tollPrice > AudioStats.AUDIO_AMPLITUDE_NONE ? Double.valueOf(tollPrice) : null, tollPriceInformation.getTollCurrencyCode(), tollPriceInformation.getPopupId() == 0, str);
        }
        Iterator<dj> it = this.navigationUpdateListeners.iterator();
        while (it.hasNext()) {
            it.next().x(gaVar);
        }
    }

    void onTrafficInfoClear() {
        Iterator<dj> it = this.navigationUpdateListeners.iterator();
        while (it.hasNext()) {
            it.next().E(gh.f31428a);
        }
    }

    void onTrafficInfoUpdate(TrafficZoneUpdate trafficZoneUpdate) {
        TrafficSeverity trafficSeverity;
        h.g.b.x.f(trafficZoneUpdate, "<this>");
        int percentInTraffic = trafficZoneUpdate.getPercentInTraffic();
        int totalTimeSec = trafficZoneUpdate.getTotalTimeSec();
        List<TrafficJamSection> jamsList = trafficZoneUpdate.getJamsList();
        h.g.b.x.e(jamsList, "getJamsList(...)");
        List<TrafficJamSection> list = jamsList;
        ArrayList arrayList = new ArrayList(h.a.i.q(list, 10));
        for (TrafficJamSection trafficJamSection : list) {
            h.g.b.x.c(trafficJamSection);
            TrafficJamSection.Severity level = trafficJamSection.getLevel();
            h.g.b.x.e(level, "getLevel(...)");
            TrafficJamSection.Severity severity = TrafficJamSection.Severity.SeverityLight;
            int iOrdinal = level.ordinal();
            if (iOrdinal == 0) {
                trafficSeverity = TrafficSeverity.Light;
            } else if (iOrdinal == 1) {
                trafficSeverity = TrafficSeverity.Moderate;
            } else if (iOrdinal == 2) {
                trafficSeverity = TrafficSeverity.Heavy;
            } else if (iOrdinal == 3) {
                trafficSeverity = TrafficSeverity.StandStill;
            } else if (iOrdinal == 4) {
                trafficSeverity = TrafficSeverity.ClosedRoad;
            } else {
                if (iOrdinal != 5) {
                    throw new h.i();
                }
                com.waze.shared_infra.i.h.c("Got UNRECOGNIZED Traffic Jam Severity - using Light traffic instead");
                trafficSeverity = TrafficSeverity.Light;
            }
            int lengthMeters = trafficJamSection.getLengthMeters();
            AlerterType alertType = trafficJamSection.getAlertType();
            h.g.b.x.e(alertType, "getAlertType(...)");
            arrayList.add(new gg(trafficSeverity, lengthMeters, com.b.b.d.c.a(alertType)));
        }
        Set<dj> set = this.navigationUpdateListeners;
        gi giVar = new gi(percentInTraffic, totalTimeSec, arrayList);
        Iterator<dj> it = set.iterator();
        while (it.hasNext()) {
            it.next().E(giVar);
        }
    }

    void onWaypointPositionChanged(WaypointPosition waypointPosition) {
        Iterator<dj> it = this.navigationUpdateListeners.iterator();
        while (it.hasNext()) {
            it.next().z(waypointPosition.hasPosition() ? waypointPosition.getPosition() : null);
        }
    }

    void refreshInstructionNames() {
        for (dj djVar : this.navigationUpdateListeners) {
            CurrentStreetNameUpdate currentStreetNameUpdate = this.currentStreetNameUpdate;
            if (currentStreetNameUpdate != null) {
                djVar.v(currentStreetNameUpdate.getStreetName(), currentStreetNameUpdate.getShowHov(), currentStreetNameUpdate.getSegmentIdx(), currentStreetNameUpdate.hasRoadSign() ? currentStreetNameUpdate.getRoadSign() : null);
            }
            NextStreetNameUpdate nextStreetNameUpdate = this.nextStreetNameUpdate;
            if (nextStreetNameUpdate != null) {
                djVar.p(nextStreetNameUpdate.getStreetName(), nextStreetNameUpdate.getDisplayArrowBeforeText(), nextStreetNameUpdate.getSegmentIdx(), nextStreetNameUpdate.hasRoadSign() ? nextStreetNameUpdate.getRoadSign() : null);
            }
        }
    }

    public void removeNavigationUpdateListener(dj djVar) {
        this.navigationUpdateListeners.remove(djVar);
    }

    public void restoreForListener(dj djVar) {
        if (this.isNavigating) {
            djVar.y(this.driveOnLeft);
            djVar.m(true, 0);
            djVar.h(this.etaTime, this.etaTimeUnit, this.etaMinutes);
            djVar.B(this.etaDistanceMeters);
            djVar.w(this.timeString);
            djVar.A(this.instructionDistance, this.distanceUnit, this.distanceMeters);
            djVar.b(this.currentEtaSeconds);
            CurrentStreetNameUpdate currentStreetNameUpdate = this.currentStreetNameUpdate;
            if (currentStreetNameUpdate != null) {
                djVar.v(currentStreetNameUpdate.getStreetName(), currentStreetNameUpdate.getShowHov(), currentStreetNameUpdate.getSegmentIdx(), this.currentStreetNameUpdate.hasRoadSign() ? this.currentStreetNameUpdate.getRoadSign() : null);
            }
            djVar.r(this.isOffline);
            ea eaVar = this.currentInstruction;
            if (eaVar != null) {
                djVar.c(eaVar);
            }
            djVar.j(this.currentExit);
            ea eaVar2 = this.nextInstruction;
            if (eaVar2 != null) {
                djVar.o(eaVar2);
            }
            NextStreetNameUpdate nextStreetNameUpdate = this.nextStreetNameUpdate;
            if (nextStreetNameUpdate != null) {
                djVar.p(nextStreetNameUpdate.getStreetName(), nextStreetNameUpdate.getDisplayArrowBeforeText(), nextStreetNameUpdate.getSegmentIdx(), this.nextStreetNameUpdate.hasRoadSign() ? this.nextStreetNameUpdate.getRoadSign() : null);
            }
            djVar.n(this.nextExit);
        }
    }

    public void sendLatest() {
        for (dj djVar : this.navigationUpdateListeners) {
            djVar.A(this.instructionDistance, this.distanceUnit, this.distanceMeters);
            djVar.b(this.currentEtaSeconds);
            djVar.B(this.etaDistanceMeters);
            djVar.h(this.etaTime, this.etaTimeUnit, this.etaMinutes);
        }
    }

    public void setEtaCardData(com.waze.br brVar) {
        Iterator<dj> it = this.navigationUpdateListeners.iterator();
        while (it.hasNext()) {
            it.next().f(brVar);
        }
    }

    void showNearingDestination() {
        Log.i("NearingDest", "About to show nearing dest from nav bar manager");
        this.nearingDestination.e(true);
    }

    protected native void updateNavigationResultNTV();
}
