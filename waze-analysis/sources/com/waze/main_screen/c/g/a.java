package com.waze.main_screen.c.g;

import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.waze.ch.a.a.f;
import com.waze.config.ConfigValues;
import com.waze.config.dh;
import com.waze.main_screen.t.al;
import com.waze.main_screen.u.j;
import com.waze.map.MapViewChooser;
import com.waze.shared_infra.i.h;
import com.waze.sharedrive.r;
import h.ab;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import h.o.c;
import h.o.d;
import java.util.Objects;
import org.a.d.k.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class a implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f26241a;

    public /* synthetic */ a(int i2) {
        this.f26241a = i2;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        b bVarC;
        m mVar;
        switch (this.f26241a) {
            case 0:
                return ab.f48028a;
            case 1:
                return ab.f48028a;
            case 2:
                return ab.f48028a;
            case 3:
                return Integer.valueOf((int) ConfigValues.CONFIG_VALUE_ALERTS_AERIAL_DISTANCE_CAPPING.b().longValue());
            case 4:
                return Integer.valueOf((int) ConfigValues.CONFIG_VALUE_INSIGHT_NO_SURFACE_ZONE_DISTANCE_METERS.b().longValue());
            case 5:
                return ConfigValues.CONFIG_VALUE_INSIGHT_STANDARD_ENABLED.b();
            case 6:
                return ConfigValues.CONFIG_VALUE_INSIGHTS_INFRA_INSIGHT_PERSONALIZATION_ENABLED.b();
            case 7:
                return ConfigValues.CONFIG_VALUE_INSIGHT_TRACE_LOGS_ENABLED.b();
            case 8:
                return Integer.valueOf((int) ConfigValues.CONFIG_VALUE_INSIGHTS_INFRA_SEGMENT_APPROACHING_DISTANCE_METERS.b().longValue());
            case 9:
                return Integer.valueOf((int) ConfigValues.CONFIG_VALUE_INSIGHTS_INFRA_SEGMENT_INSIGHT_DETECTING_DISTANCE_METERS.b().longValue());
            case 10:
                c cVar = h.o.a.f48264a;
                return h.o.a.z(c.i((int) ConfigValues.CONFIG_VALUE_INSIGHTS_INFRA_SEGMENT_AT_START_DURATION_SECONDS.b().longValue(), d.f48273d));
            case 11:
                c cVar2 = h.o.a.f48264a;
                return h.o.a.z(c.i((int) ConfigValues.CONFIG_VALUE_INSIGHTS_INFRA_SEGMENT_TEMPORARY_EXPANDED_STATE_TIMEOUT_SEC.b().longValue(), d.f48273d));
            case 12:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            case 13:
                int i2 = al.f27484a;
                return false;
            case 14:
                int i3 = j.f27713a;
                return f.g(new r(1, null));
            case 15:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            case 16:
                return ab.f48028a;
            case 17:
                return ab.f48028a;
            case 18:
                return ab.f48028a;
            case 19:
                org.a.d.a.a aVar = MapViewChooser.f27898a;
                if (aVar instanceof org.a.d.a.b) {
                    bVarC = ((org.a.d.a.b) aVar).l();
                    int i4 = ar.f48106a;
                    mVar = new m(dh.class);
                } else {
                    bVarC = aVar.getKoin().a().c();
                    int i5 = ar.f48106a;
                    mVar = new m(dh.class);
                }
                dh dhVar = (dh) bVarC.a(mVar, null, null);
                com.waze.config.b bVar = ConfigValues.CONFIG_VALUE_RENDERING_NEW_ANDROID_RENDER_ENABLED;
                x.e(bVar, "CONFIG_VALUE_RENDERING_NEW_ANDROID_RENDER_ENABLED");
                boolean zC = dhVar.c(bVar);
                h.a("MapViewChooser::newRendererEnabled(" + zC + "), app-version(5.20.90.901)");
                return Boolean.valueOf(zC);
            default:
                Boolean boolB = ConfigValues.CONFIG_VALUE_RENDERING_ANDROID_BITMAP_GENERATION_ALWAYS_IN_MAIN_THREAD.b();
                Objects.toString(boolB);
                h.a("MapMarkerResolver.Config.forceRunningOnMainThread=".concat(boolB.toString()));
                return boolB;
        }
    }
}
