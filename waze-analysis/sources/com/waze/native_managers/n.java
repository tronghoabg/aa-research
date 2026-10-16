package com.waze.native_managers;

import android.os.Process;
import android.view.View;
import androidx.compose.runtime.SnapshotIntStateKt;
import com.waze.NativeManager;
import com.waze.config.ConfigValues;
import com.waze.navigate.location_preview.LocationPreviewActivity;
import com.waze.nightmode.t;
import com.waze.realtime.RealtimeNativeManager;
import com.waze.reports.di;
import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class n implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f30704a;

    public /* synthetic */ n(int i2) {
        this.f30704a = i2;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        switch (this.f30704a) {
            case 0:
                return o.a();
            case 1:
                int i2 = LocationPreviewActivity.f31472g;
                return SnapshotIntStateKt.mutableIntStateOf(View.generateViewId());
            case 2:
                String strB = ConfigValues.CONFIG_VALUE_CRISIS_RESPONSE_UNEDITABLE_CATEGORIES.b();
                x.e(strB, "getValue(...)");
                return h.n.o.af(strB, new String[]{","}, 0, 6);
            case 3:
                return Integer.valueOf(Process.myUid());
            case 4:
                return Integer.valueOf((int) ConfigValues.CONFIG_VALUE_NETWORK_V3_MAX_RETRIES.b().longValue());
            case 5:
                return RealtimeNativeManager.getInstance().getCoreVersion();
            case 6:
                return ConfigValues.CONFIG_VALUE_NETWORK_V3_TIMEOUT_MS.b();
            case 7:
                return ConfigValues.CONFIG_VALUE_NETWORK_V3_RETRY_TIMEOUT_MS.b();
            case 8:
                return ConfigValues.CONFIG_VALUE_NETWORK_V3_EXPECTED_LATENCY_MAX_MS.b();
            case 9:
                return ab.f48028a;
            case 10:
                return ab.f48028a;
            case 11:
                return ab.f48028a;
            case 12:
                h.o.c cVar = h.o.a.f48264a;
                Long lB = ConfigValues.CONFIG_VALUE_SIGNUP_APP_CHECK_ANDROID_TOKEN_GENERATION_TIMEOUT_MILLIS.b();
                x.e(lB, "getValue(...)");
                return h.o.a.z(h.o.c.j(lB.longValue(), h.o.d.f48272c));
            case 13:
                return NativeManager.getInstance().getNativeDispatcher();
            case 14:
                return ConfigValues.CONFIG_VALUE_NETWORK_V3_LOGIN_TIMEOUT_MS.b();
            case 15:
                return Integer.valueOf((int) ConfigValues.CONFIG_VALUE_REALTIME_PLATFORM_LOGIN_MAX_RETRIES.b().longValue());
            case 16:
                t tVar = t.f32494a;
                return com.waze.shared_infra.i.a.d("NightModeManager");
            case 17:
                return ConfigValues.CONFIG_VALUE_STATS_SHOWN_CLICKED_FIREBASE_EVENT_LOG_ENABLED.b();
            case 18:
                return com.waze.shared_infra.i.a.d("PushMessageHandlersPriorityQueue");
            case 19:
                return ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_AGENT_COLLISION_THRESHOLD_METERS.b();
            default:
                int i3 = di.v;
                return com.waze.ch.a.a.f.g("waze.report_form.camera_file.binary");
        }
    }
}
