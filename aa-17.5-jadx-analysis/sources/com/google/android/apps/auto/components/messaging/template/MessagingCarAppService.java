package com.google.android.apps.auto.components.messaging.template;

import androidx.car.app.SessionInfo;
import defpackage.lyc;
import defpackage.qg;
import defpackage.qz;
import defpackage.yk;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n"}, d2 = {"Lcom/google/android/apps/auto/components/messaging/template/MessagingCarAppService;", "Landroidx/car/app/CarAppService;", "<init>", "()V", "onCreateSession", "Landroidx/car/app/Session;", "sessionInfo", "Landroidx/car/app/SessionInfo;", "createHostValidator", "Landroidx/car/app/validation/HostValidator;", "java.com.google.android.apps.auto.components.messaging.template_template"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MessagingCarAppService extends qg {
    @Override // defpackage.qg
    public final qz c(SessionInfo sessionInfo) {
        return new lyc(sessionInfo, this);
    }

    @Override // defpackage.qg
    public final yk d() {
        yk ykVar = yk.a;
        ykVar.getClass();
        return ykVar;
    }
}
