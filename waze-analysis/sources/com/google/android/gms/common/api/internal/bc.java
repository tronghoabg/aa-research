package com.google.android.gms.common.api.internal;

import com.waze.ConfigManager;
import com.waze.NativeManager;
import com.waze.config.ConfigValues;
import com.waze.ix;
import com.waze.lm;
import com.waze.location.LocationSensorListener;
import com.waze.map.NativeCanvasRenderer;
import com.waze.menus.SideMenuAutoCompleteRecycler;
import com.waze.mg;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class bc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f4783a;

    public /* synthetic */ bc(int i2) {
        this.f4783a = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4783a) {
            case 0:
            case 1:
            case 2:
            case 9:
            case 15:
            case 19:
                return;
            case 3:
                throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
            case 4:
                NativeManager.handlePushToken();
                return;
            case 5:
                NativeManager.getInstance().externalPoiClosedNTV(false);
                return;
            case 6:
                com.waze.shared_infra.i.h.j("privacy consent approved");
                return;
            case 7:
                ConfigManager.getInstance().setConfigValueString(ConfigValues.CONFIG_VALUE_PERMISSIONS_LOCATION_STR, LocationSensorListener.permissionsMissing(mg.a()) ? "NO" : ix.m(mg.a()) ? "Always" : "When in use");
                return;
            case 8:
                int i2 = lm.f25154a;
                NativeManager.getInstance().onAppForeground();
                return;
            case 10:
                NativeManager.getInstance().externalPoiClosedNTV(false);
                return;
            case 11:
                NativeManager.getInstance().startLocation();
                return;
            case 12:
                NativeManager.getInstance().startTripServerNavigationNTV();
                return;
            case 13:
                NativeManager.getInstance().wazeUiDetailsPopupClosedNTV();
                return;
            case 14:
                int i3 = NativeCanvasRenderer.f27902d;
                return;
            case 16:
                int i4 = SideMenuAutoCompleteRecycler.Q;
                NativeManager.getInstance().CloseProgressPopup();
                return;
            case 17:
                NativeManager.getInstance().stopNavigation();
                return;
            case 18:
                com.waze.shared_infra.i.h.j("privacy consent is approved");
                return;
            default:
                com.waze.sdk.b.m.v().T();
                com.waze.sdk.bi.d().n("com.spotify.music");
                return;
        }
    }
}
