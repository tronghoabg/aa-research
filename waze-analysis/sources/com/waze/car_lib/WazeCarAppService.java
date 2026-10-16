package com.waze.car_lib;

import android.content.res.Resources;
import android.util.Log;
import androidx.car.app.CarAppService;
import androidx.car.app.Session;
import androidx.car.app.SessionInfo;
import androidx.car.app.validation.HostValidator;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.lc;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class WazeCarAppService extends CarAppService {

    /* renamed from: a, reason: collision with root package name */
    private final h.f f18801a;

    /* renamed from: b, reason: collision with root package name */
    private final h.f f18802b;

    public WazeCarAppService() {
        WazeCarAppService wazeCarAppService = this;
        h.h hVar = h.h.f48130a;
        this.f18801a = h.g.b(hVar, new au(wazeCarAppService, 1, null));
        this.f18802b = h.g.b(hVar, new au(wazeCarAppService, 2, null));
    }

    static final void a(WazeCarAppService wazeCarAppService) {
        ((lc) wazeCarAppService.f18801a.getValue()).shutDown();
    }

    @Override // androidx.car.app.CarAppService
    public final HostValidator createHostValidator() throws Resources.NotFoundException {
        if (!ConfigValues.CONFIG_VALUE_CAR_LIB_VALIDATE_HOST_CONNECTIONS.b().booleanValue()) {
            HostValidator hostValidator = HostValidator.ALLOW_ALL_HOSTS_VALIDATOR;
            h.g.b.x.e(hostValidator, "ALLOW_ALL_HOSTS_VALIDATOR");
            return hostValidator;
        }
        HostValidator.Builder builder = new HostValidator.Builder(this);
        builder.addAllowedHosts(R.array.hosts_allowlist_debug);
        HostValidator hostValidatorBuild = builder.build();
        h.g.b.x.e(hostValidatorBuild, "build(...)");
        return hostValidatorBuild;
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (org.a.d.b.a.b() == null) {
            Log.e("Waze", "Application not initialized");
            System.exit(0);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
        super.onCreate();
        WazeCarAppService wazeCarAppService = this;
        org.a.d.k.b bVarD = org.chromium.support_lib_boundary.a.b.d(wazeCarAppService);
        int i2 = h.g.b.ar.f48106a;
        ((com.waze.car_lib.login.m) bVarD.a(new h.g.b.m(com.waze.car_lib.login.m.class), null, null)).h();
        ((com.waze.car_lib.h.i) org.chromium.support_lib_boundary.a.b.d(wazeCarAppService).a(new h.g.b.m(com.waze.car_lib.h.i.class), null, null)).c();
        kotlinx.coroutines.aj.z(kotlinx.coroutines.aj.f(), null, null, new bi(this, (h.c.e) null, 0), 3);
        if (((com.waze.map.opengl.t) this.f18802b.getValue()).a()) {
            return;
        }
        ((com.waze.map.opengl.g) org.chromium.support_lib_boundary.a.b.d(wazeCarAppService).a(new h.g.b.m(com.waze.map.opengl.g.class), null, null)).e();
    }

    @Override // androidx.car.app.CarAppService
    public final Session onCreateSession(SessionInfo sessionInfo) {
        h.g.b.x.f(sessionInfo, "sessionInfo");
        return sessionInfo.getDisplayType() == 1 ? new com.waze.car_lib.e.q() : new bl();
    }

    @Override // androidx.car.app.CarAppService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        NativeManager.runOnNativeManagerReady(new be(this, 2));
    }

    @Override // androidx.car.app.CarAppService
    public final Session onCreateSession() {
        return new bl();
    }
}
