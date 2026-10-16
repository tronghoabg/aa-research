package com.google.android.libraries.assistant.auto.aaptransport.callbacks;

import android.content.Intent;
import android.os.IBinder;
import defpackage.eqe;
import defpackage.xyc;
import defpackage.ype;
import defpackage.yph;
import defpackage.zhy;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\r"}, d2 = {"Lcom/google/android/libraries/assistant/auto/aaptransport/callbacks/CarAssistantCallbacksService;", "Landroidx/lifecycle/LifecycleService;", "<init>", "()V", "iBinderSupplier", "Lcom/google/common/base/Supplier;", "Landroid/os/IBinder;", "onCreate", "", "onBind", "intent", "Landroid/content/Intent;", "Companion", "java.com.google.android.libraries.assistant.auto.aaptransport.callbacks_service"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CarAssistantCallbacksService extends eqe {
    private static final yph a = yph.c("GH.AssistantCallbacks");
    private xyc b;

    @Override // defpackage.eqe, android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        ((ype) a.f()).u("#onBind start");
        super.onBind(intent);
        xyc xycVar = this.b;
        if (xycVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        IBinder iBinderGu = ((zhy) xycVar).gu();
        iBinderGu.getClass();
        return iBinderGu;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0318 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.eqe, android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate() throws java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 958
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.aaptransport.callbacks.CarAssistantCallbacksService.onCreate():void");
    }
}
