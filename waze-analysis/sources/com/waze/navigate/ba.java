package com.waze.navigate;

import com.waze.jni.protos.NavigationSegment;
import com.waze.jni.protos.VenueData;
import com.waze.jni.protos.navigate.AverageSpeedCameraZoneUpdate;
import com.waze.jni.protos.navigate.BeaconInformation;
import com.waze.jni.protos.navigate.CurrentStreetNameUpdate;
import com.waze.jni.protos.navigate.DistanceUpdate;
import com.waze.jni.protos.navigate.NavigationRoute;
import com.waze.jni.protos.navigate.NearbyStationsResultProto;
import com.waze.jni.protos.navigate.NewVenuePin;
import com.waze.jni.protos.navigate.NextStreetNameUpdate;
import com.waze.jni.protos.navigate.OfflineNavigationRouteProto;
import com.waze.jni.protos.navigate.PolylineGeometry;
import com.waze.jni.protos.navigate.TrafficZoneUpdate;
import com.waze.jni.protos.navigate.WaypointPosition;
import com.waze.jni.protos.places.GenericPlace;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class ba implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f31070a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31071b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f31072c;

    public /* synthetic */ ba(Object obj, Object obj2, int i2) {
        this.f31072c = i2;
        this.f31070a = obj;
        this.f31071b = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31072c) {
            case 0:
                new cs((AddressItem) this.f31070a).b((com.waze.sharedui.a.e) this.f31071b, 1);
                break;
            case 1:
                af.l(this.f31071b, (af) this.f31070a);
                break;
            case 2:
                bt.openVerifyEventJNI$lambda$0((bt) this.f31071b, (AddressItem) this.f31070a);
                break;
            case 3:
                bt.nearbyGasStationsFoundJNI$lambda$0((bt) this.f31071b, (NearbyStationsResultProto) this.f31070a);
                break;
            case 4:
                ds.onEtaDistanceChangedJNI$lambda$0((ds) this.f31071b, (DistanceUpdate) this.f31070a);
                break;
            case 5:
                ds.onNavigationRouteChangedJNI$lambda$0((ds) this.f31071b, (NavigationRoute) this.f31070a);
                break;
            case 6:
                ds.onCurrentInstructionDistanceChangedJNI$lambda$0((ds) this.f31071b, (DistanceUpdate) this.f31070a);
                break;
            case 7:
                ds.onBeaconInfoUpdateJNI$lambda$0((ds) this.f31071b, (BeaconInformation) this.f31070a);
                break;
            case 8:
                ds.onNextNameChangedJNI$lambda$0((ds) this.f31071b, (NextStreetNameUpdate) this.f31070a);
                break;
            case 9:
                ds.onTrafficInfoUpdateJNI$lambda$0((ds) this.f31071b, (TrafficZoneUpdate) this.f31070a);
                break;
            case 10:
                ds.onHovTextChangedJNI$lambda$0((ds) this.f31070a, (String) this.f31071b);
                break;
            case 11:
                ds.onOfflineNavigationRouteChangedJNI$lambda$0((ds) this.f31071b, (OfflineNavigationRouteProto) this.f31070a);
                break;
            case 12:
                ds.onTimeStringChangedJNI$lambda$0((ds) this.f31070a, (String) this.f31071b);
                break;
            case 13:
                ds.onRouteGeometryUpdatedJNI$lambda$0((ds) this.f31071b, (PolylineGeometry) this.f31070a);
                break;
            case 14:
                ds.onAverageSpeedCamZoneUpdateJNI$lambda$0((ds) this.f31071b, (AverageSpeedCameraZoneUpdate) this.f31070a);
                break;
            case 15:
                ds.onWaypointPositionChangedJNI$lambda$0((ds) this.f31071b, (WaypointPosition) this.f31070a);
                break;
            case 16:
                ds.onRoutingDestinationChangedJNI$lambda$0((ds) this.f31071b, (GenericPlace) this.f31070a);
                break;
            case 17:
                ds.onNextSegmentChangedJNI$lambda$0((ds) this.f31071b, (NavigationSegment) this.f31070a);
                break;
            case 18:
                ds.onStreetNameChangedJNI$lambda$0((ds) this.f31071b, (CurrentStreetNameUpdate) this.f31070a);
                break;
            case 19:
                eg.onStartPointChangedJNI$lambda$0((eg) this.f31071b, (VenueData) this.f31070a);
                break;
            default:
                ew.onNewVenueChangedJNI$lambda$0((ew) this.f31071b, (NewVenuePin) this.f31070a);
                break;
        }
    }

    public /* synthetic */ ba(Object obj, Object obj2, int i2, byte[] bArr) {
        this.f31072c = i2;
        this.f31071b = obj;
        this.f31070a = obj2;
    }
}
