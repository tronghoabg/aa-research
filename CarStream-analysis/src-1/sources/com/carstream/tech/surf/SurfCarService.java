package com.carstream.tech.surf;

import androidx.car.app.CarAppService;
import androidx.car.app.Session;
import androidx.car.app.SessionInfo;
import androidx.car.app.validation.HostValidator;
import com.carstream.tech.R;
import defpackage.c5;
import defpackage.kb;
import defpackage.z6;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class SurfCarService extends CarAppService {
    @Override // androidx.car.app.CarAppService
    public HostValidator createHostValidator() {
        return new HostValidator.Builder(getApplicationContext()).addAllowedHosts(R.array.hosts_allowlist_sample).build();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        c5.d(this);
        z6.s("template", true);
    }

    @Override // androidx.car.app.CarAppService
    public Session onCreateSession(SessionInfo sessionInfo) {
        return new kb();
    }

    @Override // androidx.car.app.CarAppService, android.app.Service
    public void onDestroy() {
        z6.s("template", false);
        super.onDestroy();
    }
}
