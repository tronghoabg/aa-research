package com.waze.bx;

import com.waze.config.ConfigValues;
import com.waze.modules.d.m;
import com.waze.ui.af;
import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class a implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f18176a;

    public /* synthetic */ a(int i2) {
        this.f18176a = i2;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        boolean z = false;
        switch (this.f18176a) {
            case 2:
                new m().a();
                break;
            case 3:
                int i2 = com.waze.modules.a.d.f29799a;
                com.waze.modules.a.d.a();
                break;
            case 4:
                if (ConfigValues.CONFIG_VALUE_ANALYTICS_ANDROID_MAIN_THREAD_RESPONSIVENESS_MONITORING.b().booleanValue() && ConfigValues.CONFIG_VALUE_GENERAL_RECORD_ERROR_FEATURE_ENABLED.b().booleanValue()) {
                    z = true;
                }
                break;
            case 5:
                h.o.c cVar = h.o.a.f48264a;
                Long lB = ConfigValues.CONFIG_VALUE_ANALYTICS_ANDROID_MAIN_THREAD_RESPONSIVENESS_DURATION_MS.b();
                x.e(lB, "getValue(...)");
                break;
            case 6:
                h.o.c cVar2 = h.o.a.f48264a;
                Long lB2 = ConfigValues.CONFIG_VALUE_ANALYTICS_ANDROID_MAIN_THREAD_RESPONSIVENESS_START_DELAY_MS.b();
                x.e(lB2, "getValue(...)");
                break;
            case 18:
                int i3 = com.waze.ui.h.f42379a;
                break;
            case 19:
                int i4 = af.f41795a;
                break;
        }
        return ab.f48028a;
    }
}
