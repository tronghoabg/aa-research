package com.waze.push;

import com.waze.NativeManager;
import com.waze.OfflineNativeManager;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f33427a;

    public e() {
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("MonitoringPushHandler");
        x.e(eVarD, "create(...)");
        this.f33427a = eVarD;
    }

    @Override // com.waze.push.h
    public final String a() {
        return "OfflineAtRequestPushMessageHandler";
    }

    @Override // com.waze.push.h
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        g gVar = (g) obj;
        x.f(gVar, "pushMessage");
        return gVar.A();
    }

    @Override // com.waze.push.h
    public final /* bridge */ /* synthetic */ boolean c(Object obj) {
        x.f((g) obj, "pushMessage");
        if (NativeManager.isAppStarted()) {
            this.f33427a.a("HandleOfflineAtRequest - ignoring a request while the app is running");
            return false;
        }
        boolean backgroundLocationEnabled = OfflineNativeManager.getInstance().getBackgroundLocationEnabled();
        com.waze.shared_infra.i.e eVar = this.f33427a;
        if (!backgroundLocationEnabled) {
            eVar.a("HandleOfflineAtRequest - ignored, background location usage not allowed");
            return true;
        }
        eVar.a("HandleOfflineAtRequest - about to sendOfflineLocation");
        OfflineNativeManager.getInstance().sendOfflineLocation();
        return true;
    }
}
