package defpackage;

import java.util.EnumSet;

/* loaded from: classes.dex */
public enum tfy {
    GEARHEAD_COLD_HU_SERVICE_DISCOVERY_COMPLETED("Gearhead Cold HU Service Discovery Completed", tfx.a, new tfx[0]),
    GEARHEAD_COLD_HU_SERVICE_DISCOVERY_TO_PLC_LISTENER_ON_PROJECTION_START("Gearhead Cold HU Service Discovery To PLC Listener On Projection Start", tfx.a, new tfx[0]),
    GEARHEAD_COLD_PLC_LISTENER_ON_PROJECTION_START_TO_PROJECTION_MODE_STARTED("Gearhead Cold PLC Listener On Projection Start To Projection Mode Started", tfx.a, new tfx[0]),
    GEARHEAD_COLD_PLC_LISTENER_ON_PROJECTION_START_TO_PRIMARY_REGION_CAR_ACTIVITY_RESUME("Gearhead Cold PLC Listener On Projection Start To Primary Region Car Activity Resume", tfx.a, new tfx[0]),
    GEARHEAD_COLD_STARTUP_PROJECTION_MODE_STARTED("Gearhead Cold Startup Projection Mode Started", tfx.a, new tfx[0]),
    GEARHEAD_COLD_STARTUP_FACET_BAR_FIRST_RESUME("Gearhead Cold Startup Facet Bar First Resume", tfx.a, new tfx[0]),
    GEARHEAD_COLD_STARTUP_PRIMARY_REGION_CAR_ACTIVITY_RESUME("Gearhead Cold Startup Primary Region Car Activity Resume", tfx.a, new tfx[0]),
    GEARHEAD_COLD_STARTUP_FACET_BAR_AND_PRIMARY_REGION_CAR_ACTIVITY_RESUMED("Gearhead Cold Startup Facet Bar And Primary Region Car Activity Resumed", tfx.a, new tfx[0]),
    GEARHEAD_WARM_HU_SERVICE_DISCOVERY_COMPLETED("Gearhead Warm HU Service Discovery Completed", tfx.a, new tfx[0]),
    GEARHEAD_WARM_HU_SERVICE_DISCOVERY_TO_PLC_LISTENER_ON_PROJECTION_START("Gearhead Warm HU Service Discovery To PLC Listener On Projection Start", tfx.a, new tfx[0]),
    GEARHEAD_WARM_PLC_LISTENER_ON_PROJECTION_START_TO_PROJECTION_MODE_STARTED("Gearhead Warm PLC Listener On Projection Start To Projection Mode Started", tfx.a, new tfx[0]),
    GEARHEAD_WARM_PLC_LISTENER_ON_PROJECTION_START_TO_PRIMARY_REGION_CAR_ACTIVITY_RESUME("Gearhead Warm PLC Listener On Projection Start To Primary Region Car Activity Resume", tfx.a, new tfx[0]),
    GEARHEAD_WARM_STARTUP_PROJECTION_MODE_STARTED("Gearhead Warm Startup Projection Mode Started", tfx.a, new tfx[0]),
    GEARHEAD_WARM_STARTUP_FACET_BAR_FIRST_RESUME("Gearhead Warm Startup Facet Bar First Resume", tfx.a, new tfx[0]),
    GEARHEAD_WARM_STARTUP_PRIMARY_REGION_CAR_ACTIVITY_RESUME("Gearhead Warm Startup Primary Region Car Activity Resume", tfx.a, new tfx[0]),
    GEARHEAD_WARM_STARTUP_FACET_BAR_AND_PRIMARY_REGION_CAR_ACTIVITY_RESUMED("Gearhead Warm Startup Facet Bar And Primary Region Car Activity Resumed", tfx.a, new tfx[0]),
    GEARHEAD_WIRELESS_CONTROL_CHANNEL_CONNECT_ATTEMPT("Control Channel Connect Attempt", tfx.b, new tfx[0]),
    GEARHEAD_WIRELESS_WIFI_VERSION_REQUEST_RECEIVED("WiFi Version Request Received", tfx.b, new tfx[0]),
    GEARHEAD_WIRELESS_WIFI_START_REQUEST_RECEIVED("WiFi Start Request Received", tfx.b, new tfx[0]),
    GEARHEAD_WIRELESS_HU_SERVICE_DISCOVERY_COMPLETED("HU Service Discovery Completed", tfx.b, new tfx[0]),
    GEARHEAD_WIRELESS_HU_SERVICE_DISCOVERY_TO_PLC_LISTENER_ON_PROJECTION_START("HU Service Discovery To PLC Listener On Projection Start", tfx.b, new tfx[0]),
    GEARHEAD_WIRELESS_PLC_LISTENER_ON_PROJECTION_START_TO_PROJECTION_MODE_STARTED("PLC Listener On Projection Start To Projection Mode Started", tfx.b, new tfx[0]),
    GEARHEAD_WIRELESS_PLC_LISTENER_ON_PROJECTION_START_TO_PRIMARY_REGION_CAR_ACTIVITY_RESUME("PLC Listener On Projection Start To Primary Region Car Activity Resume", tfx.b, new tfx[0]),
    GEARHEAD_WIRELESS_STARTUP_PROJECTION_MODE_STARTED("Startup Projection Mode Started", tfx.b, new tfx[0]),
    GEARHEAD_WIRELESS_STARTUP_FACET_BAR_FIRST_RESUME("Startup Facet Bar First Resume", tfx.b, new tfx[0]),
    GEARHEAD_WIRELESS_STARTUP_PRIMARY_REGION_CAR_ACTIVITY_RESUME("Startup Primary Region Car Activity Resume", tfx.b, new tfx[0]),
    GEARHEAD_WIRELESS_STARTUP_FACET_BAR_AND_PRIMARY_REGION_CAR_ACTIVITY_RESUMED("Startup Facet Bar And Primary Region Car Activity Resumed", tfx.b, new tfx[0]),
    GEARHEAD_WARM_STARTUP_STARTED("Gearhead Warm Startup Started", tfx.a, new tfx[0]),
    GEARHEAD_COLD_STARTUP_STARTED("Geahread Cold Startup started", tfx.a, new tfx[0]),
    GEARHEAD_WIRELESS_WARM_STARTUP_STARTED("Gearhead Wireless Warm Startup Started", tfx.b, new tfx[0]),
    GEARHEAD_WIRELESS_COLD_STARTUP_STARTED("Gearhead Wireless Cold Startup Started", tfx.b, new tfx[0]),
    GEARHEAD_WIRELESS_CONTROL_CHANNEL_CONNECT_ATTEMPT_RFCOMM("Gearhead Wireless Control Channel Connect Attempt RFCOMM", tfx.b, new tfx[0]),
    GEARHEAD_WIRELESS_CONTROL_CHANNEL_CONNECT_ATTEMPT_TCP("Gearhead Wireless Control Channel Connect Attempt TCP", tfx.b, new tfx[0]),
    GEARHEAD_WIRELESS_VERSION_REQUEST_RECEIVED_RFCOMM("Gearhead Wireless Version Request Received RFCOMM", tfx.b, new tfx[0]),
    GEARHEAD_WIRELESS_VERSION_REQUEST_RECEIVED_TCP("Gearhead Wireless Version Request Received TCP", tfx.b, new tfx[0]),
    GEARHEAD_WIRELESS_START_REQUEST_RECEIVED_RFCOMM("Gearhead Wireless Start Request Received RFCOMM", tfx.b, new tfx[0]),
    GEARHEAD_WIRELESS_START_REQUEST_RECEIVED_TCP("Gearhead Wireless Start Request Received TCP", tfx.b, new tfx[0]),
    GEARHEAD_FRX_STARTED("Gearhead FRX Started", tfx.a, tfx.b),
    GEARHEAD_PREFLIGHT_STARTED("Gearhead Preflight Started", tfx.a, tfx.b),
    GEARHEAD_PREFLIGHT_COMPLETED("Gearhead Preflight Completed", tfx.a, tfx.b),
    GEARHEAD_CAR_SERVICE_VIDEO_FOCUS_GAINED("Gearhead Car Service Video Focus Gained", tfx.a, tfx.b),
    GEARHEAD_PROJECTION_MODE_STARTED("Gearhead Projection Mode Started", tfx.a, tfx.b),
    GEARHEAD_FACET_BAR_FIRST_RESUME("Gearhead Facet Bar First Resume", tfx.a, tfx.b),
    GEARHEAD_PROJECTION_ENABLED("Gearhead Projection Enabled", tfx.a, tfx.b),
    PROJECTION_STARTED_USB("Gearhead Projection Started Over USB", tfx.a, new tfx[0]),
    PROJECTION_STARTED_WIRELESS("Gearhead Projection Started Over WiFi", tfx.b, new tfx[0]),
    PROJECTION_LIFECYCLE_LISTENER_ON_PROJECTION_START("Projection Lifecycle Listener On Projection Start", tfx.a, tfx.b),
    PRIMARY_REGION_FIRST_CAR_ACTIVITY_RESUME("Primary Region First Car Activity Resume", tfx.a, tfx.b),
    FACET_BAR_AND_PRIMARY_REGION_CAR_ACTIVITY_RESUMED("Facet Bar And Primary Region Car Activity Resumed", tfx.a, tfx.b);

    public final vky X;
    public final ygr Y;
    private static final vky Z = new vky("Gearhead Wireless ");
    private static final vky aa = new vky("TCP");
    private static final vky ab = new vky("RFCOMM");

    tfy(String str, tfx tfxVar, tfx... tfxVarArr) {
        this.X = new vky(str);
        this.Y = yfk.h(EnumSet.of(tfxVar, tfxVarArr));
    }

    final vky a(tfw tfwVar, int i) {
        vky vkyVar = Z;
        vky[] vkyVarArr = new vky[5];
        vkyVarArr[0] = tfwVar.c;
        vkyVarArr[1] = new vky(" ");
        vkyVarArr[2] = i + (-1) != 1 ? aa : ab;
        vkyVarArr[3] = new vky(" ");
        vkyVarArr[4] = this.X;
        return vky.b(vkyVar, vkyVarArr);
    }
}
