package com.google.android.apps.auto.components.settings.ui;

import android.content.Context;
import android.content.res.Resources;
import defpackage.mmn;
import defpackage.qg;
import defpackage.qz;
import defpackage.tt;
import defpackage.yk;
import defpackage.yph;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000e"}, d2 = {"Lcom/google/android/apps/auto/components/settings/ui/CarSettingsService;", "Landroidx/car/app/CarAppService;", "<init>", "()V", "onCreateSession", "Landroidx/car/app/Session;", "createHostValidator", "Landroidx/car/app/validation/HostValidator;", "shouldShowInitialFocusSetting", "", "carClientToken", "Lcom/google/android/gms/car/CarClientToken;", "SettingsScreen", "Companion", "java.com.google.android.apps.auto.components.settings.ui_ui"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CarSettingsService extends qg {
    public static final yph c = yph.c("GH.CarSettingsService");

    @Override // defpackage.qg
    public final qz b() {
        return new mmn(this);
    }

    @Override // defpackage.qg
    public final yk d() throws Resources.NotFoundException {
        if ((getApplicationInfo().flags & 2) != 0) {
            yk ykVar = yk.a;
            ykVar.getClass();
            return ykVar;
        }
        Context applicationContext = getApplicationContext();
        HashMap map = new HashMap();
        tt.b(map, applicationContext);
        return tt.a(map, applicationContext);
    }
}
