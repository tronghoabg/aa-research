package com.waze.bv;

import com.waze.config.ConfigValues;
import com.waze.n.ac;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final com.waze.sharedui.utils.o f17516a = new com.waze.sharedui.utils.o();

    static final kotlinx.coroutines.b.k a() {
        com.waze.config.b bVar = ConfigValues.CONFIG_VALUE_MAP_SHOW_SPEEDOMETER;
        h.g.b.x.e(bVar, "CONFIG_VALUE_MAP_SHOW_SPEEDOMETER");
        com.waze.config.b bVar2 = ConfigValues.CONFIG_VALUE_MAP_SPEEDOMETER_SPEED_LIMIT_ENABLED;
        h.g.b.x.e(bVar2, "CONFIG_VALUE_MAP_SPEEDOMETER_SPEED_LIMIT_ENABLED");
        com.waze.config.d dVar = ConfigValues.CONFIG_VALUE_MAP_SPEEDOMETER_SPEED_LIMIT_USER_ENABLED;
        h.g.b.x.e(dVar, "CONFIG_VALUE_MAP_SPEEDOM…_SPEED_LIMIT_USER_ENABLED");
        com.waze.config.b bVar3 = ConfigValues.CONFIG_VALUE_MAP_SPEEDOMETER_SPEED_LIMIT_SOUNDS;
        h.g.b.x.e(bVar3, "CONFIG_VALUE_MAP_SPEEDOMETER_SPEED_LIMIT_SOUNDS");
        com.waze.config.b bVar4 = ConfigValues.CONFIG_VALUE_MAP_SPEEDOMETER_DEBUG_SPEED_LIMIT;
        h.g.b.x.e(bVar4, "CONFIG_VALUE_MAP_SPEEDOMETER_DEBUG_SPEED_LIMIT");
        com.waze.config.c cVar = ConfigValues.CONFIG_VALUE_MAP_SPEEDOMETER_SPEED_ALERT_OFFSET;
        h.g.b.x.e(cVar, "CONFIG_VALUE_MAP_SPEEDOMETER_SPEED_ALERT_OFFSET");
        com.waze.config.d dVar2 = ConfigValues.CONFIG_VALUE_MAP_SPEEDOMETER_STYLE;
        h.g.b.x.e(dVar2, "CONFIG_VALUE_MAP_SPEEDOMETER_STYLE");
        return new f(new kotlinx.coroutines.b.k[]{ac.o(bVar), ac.o(bVar2), ac.o(dVar), ac.o(bVar3), ac.o(bVar4), ac.o(cVar), ac.o(dVar2)});
    }

    public static final com.waze.sharedui.utils.o b() {
        return f17516a;
    }
}
