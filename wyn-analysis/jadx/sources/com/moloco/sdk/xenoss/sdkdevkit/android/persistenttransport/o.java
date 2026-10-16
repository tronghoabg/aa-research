package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import K3.q;
import android.content.Context;
import com.moloco.sdk.internal.MolocoLogger;
import x9.C4504d;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final q f32465a;

    public o(Context context) {
        Context context2;
        q qVarC;
        try {
            qVarC = q.c(context);
        } catch (IllegalStateException e7) {
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.error$default(molocoLogger, "MolocoWorkManager", "WorkManager not initialized already, performing initialization", e7, false, 8, null);
            J3.b bVar = new J3.b(new C4504d(19));
            try {
                MolocoLogger.info$default(molocoLogger, "MolocoWorkManager", "Trying to initialize work manager as one is not already available", null, false, 12, null);
                context2 = context;
                try {
                    q.d(context2, bVar);
                } catch (IllegalStateException e10) {
                    e = e10;
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, "MolocoWorkManager", "WorkManager initialized already at this point, retrieving instance", e, false, 8, null);
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "MolocoWorkManager", "Trying to retrieve work manager instance", null, false, 12, null);
                    qVarC = q.c(context2);
                    this.f32465a = qVarC;
                }
            } catch (IllegalStateException e11) {
                e = e11;
                context2 = context;
            }
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "MolocoWorkManager", "Trying to retrieve work manager instance", null, false, 12, null);
            try {
                qVarC = q.c(context2);
            } catch (IllegalStateException e12) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "MolocoWorkManager", "WorkManager instance couldn't be re-initialized, cannot provide WorkManager", null, false, 12, null);
                throw new IllegalStateException("Cannot provide MolocoWorkManager. Failed to re-initialize WorkManager", e12);
            }
        }
        this.f32465a = qVarC;
    }
}
