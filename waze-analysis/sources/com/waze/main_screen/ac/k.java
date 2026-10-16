package com.waze.main_screen.ac;

import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.waze.config.ConfigValues;
import com.waze.map.opengl.p;
import com.waze.map.opengl.q;
import com.waze.map.opengl.r;
import com.waze.map.opengl.s;
import com.waze.navigate.ax;
import com.waze.navigate.location_preview.LocationPreviewActivity;
import h.ab;
import h.g.b.ar;
import h.g.b.x;
import java.util.Objects;
import kotlinx.coroutines.b.bu;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class k implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f25684a;

    public /* synthetic */ k(int i2) {
        this.f25684a = i2;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        switch (this.f25684a) {
            case 0:
                return m.b();
            case 1:
                Boolean boolB = ConfigValues.CONFIG_VALUE_RENDERING_ANDROID_BITMAP_RECYCLING_ENABLED.b();
                Objects.toString(boolB);
                com.waze.shared_infra.i.h.a("MapMarkerResolver.Config.bitmapRecyclingEnabled=".concat(boolB.toString()));
                return boolB;
            case 2:
                return new com.waze.map.opengl.a(true, 7);
            case 3:
                return new com.waze.map.opengl.a(true, 7);
            case 4:
                r rVar = r.f29557a;
                org.a.d.a.a aVar = q.f29556a;
                if (aVar instanceof org.a.d.a.b) {
                    bVarC = ((org.a.d.a.b) aVar).l();
                    int i2 = ar.f48106a;
                    mVar = new h.g.b.m(p.class);
                } else {
                    bVarC = aVar.getKoin().a().c();
                    int i3 = ar.f48106a;
                    mVar = new h.g.b.m(p.class);
                }
                boolean zF = ((p) bVarC.a(mVar, null, null)).f();
                com.waze.shared_infra.i.h.a("SingleRenderThreadConfig::singleRenderThreadEnabled(" + zF + "), app-version(5.20.90.901)");
                return Boolean.valueOf(zF);
            case 5:
                int i4 = s.f29559a;
                return com.waze.shared_infra.i.a.d("WazeConfigChooser");
            case 6:
                Boolean boolB2 = ConfigValues.CONFIG_VALUE_WAZE_MAP_ANDROID_ENGINE_INIT_IN_APP_INIT.b();
                com.waze.shared_infra.i.h.a("Godot init in app init: " + boolB2.booleanValue());
                return boolB2;
            case 7:
                h.o.c cVar = h.o.a.f48264a;
                Long lB = ConfigValues.CONFIG_VALUE_MAP_AUTO_SHOW_ME_ON_MAP_TIMEOUT_MS.b();
                x.e(lB, "getValue(...)");
                return h.o.a.z(h.o.c.j(lB.longValue(), h.o.d.f48272c));
            case 8:
                return ConfigValues.CONFIG_VALUE_MAP_AUTO_RECENTER_MIN_SPEED_KPH.b();
            case 9:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
            case 10:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            case 11:
                return ab.f48028a;
            case 12:
                return ab.f48028a;
            case 13:
                return ab.f48028a;
            case 14:
                return ab.f48028a;
            case 15:
                int i5 = com.waze.av.c.b.f16018a;
                return Boolean.valueOf(x.n(ConfigValues.CONFIG_VALUE_PARKING_SYMBOL_STYLE.b(), "latam"));
            case 16:
                int i6 = com.waze.av.d.l.f16096a;
                return ConfigValues.CONFIG_VALUE_PARKING_BOOKING_PARKING_TIME_IN_HOURS_FILTER_FOR_PINS.b();
            case 17:
                return ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_MTE_POLYGONS_ENABLED.b();
            case 18:
                int i7 = ax.f31023a;
                return ConfigValues.CONFIG_VALUE_DANGER_ZONE_TILE_DOWNLOAD_TIMEOUT_MS.b();
            case 19:
                return com.waze.shared_infra.i.a.d("NavigationInfoObservable");
            default:
                int i8 = LocationPreviewActivity.f31472g;
                return bu.c(0, 4, kotlinx.coroutines.a.a.f51272b);
        }
    }
}
