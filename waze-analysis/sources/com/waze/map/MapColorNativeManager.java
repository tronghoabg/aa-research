package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MapColorNativeManager extends y implements aa {
    public static final int $stable;
    public static final MapColorNativeManager INSTANCE = new MapColorNativeManager();
    private static final kotlinx.coroutines.b.bn<z> _routeColorsFlow;
    private static final kotlinx.coroutines.b.ch<z> routeColorsFlow;

    static {
        kotlinx.coroutines.b.bn<z> bnVarB = kotlinx.coroutines.b.ck.b(null);
        _routeColorsFlow = bnVarB;
        routeColorsFlow = bnVarB;
        $stable = 8;
    }

    private MapColorNativeManager() {
    }

    @Override // com.waze.map.aa
    public kotlinx.coroutines.b.ch<z> getRouteColorsFlow() {
        return routeColorsFlow;
    }

    public final native void nativeInitialize();

    @Override // com.waze.map.y
    public void onRouteColorsChanged(int i2, int i3) {
        _routeColorsFlow.e(new z(i2, i3));
    }
}
