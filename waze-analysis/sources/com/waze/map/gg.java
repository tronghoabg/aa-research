package com.waze.map;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class gg implements com.waze.map.g.f {
    @Override // com.waze.map.g.f
    public final kotlinx.coroutines.b.ch a() {
        kotlinx.coroutines.b.ch chVarL = ConfigValues.CONFIG_VALUE_ROUTING_AUTO_ZOOM.l();
        h.g.b.x.e(chVarL, "getStateFlow(...)");
        return chVarL;
    }

    @Override // com.waze.map.g.f
    public final kotlinx.coroutines.b.ch b() {
        kotlinx.coroutines.b.ch chVarL = ConfigValues.CONFIG_VALUE_MAP_NORTH_LOCK.l();
        h.g.b.x.e(chVarL, "getStateFlow(...)");
        return chVarL;
    }
}
