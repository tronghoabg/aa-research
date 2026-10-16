package com.carstream.tech.ctrl;

import androidx.car.app.CarAppService;
import androidx.car.app.Session;
import androidx.car.app.SessionInfo;
import androidx.car.app.model.Template;
import androidx.car.app.validation.HostValidator;
import com.carstream.tech.R;
import defpackage.c5;
import defpackage.m3;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class ControlCarService extends CarAppService {
    private static Set<Class<? extends Template>> hoiTemplate(SessionInfo sessionInfo) {
        try {
            return sessionInfo.getSupportedTemplates(sessionInfo.getDisplayType());
        } catch (Throwable th) {
            String.valueOf(th);
            return Collections.EMPTY_SET;
        }
    }

    private static String tenLop(Set<Class<? extends Template>> set) {
        if (set == null || set.isEmpty()) {
            return "(host khong noi - coi nhu nhan het)";
        }
        StringBuilder sb = new StringBuilder();
        for (Class<? extends Template> cls : set) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(cls.getSimpleName());
        }
        return sb.toString();
    }

    @Override // androidx.car.app.CarAppService
    public HostValidator createHostValidator() {
        return new HostValidator.Builder(getApplicationContext()).addAllowedHosts(R.array.hosts_allowlist_sample).build();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        c5.d(this);
    }

    @Override // androidx.car.app.CarAppService
    public Session onCreateSession(SessionInfo sessionInfo) {
        Set<Class<? extends Template>> setHoiTemplate = hoiTemplate(sessionInfo);
        sessionInfo.getDisplayType();
        tenLop(setHoiTemplate);
        return new m3(setHoiTemplate);
    }
}
