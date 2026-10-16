package com.bytedance.sdk.component.adexpress.moa;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class moa {
    public static void oa(com.bytedance.sdk.component.bcc.oa.yo yoVar, int i5) {
        if (yoVar == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.uef.uef.yo yoVarYo = com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().yo();
        ExecutorService executorServiceCq = yoVarYo != null ? yoVarYo.cq() : null;
        if (executorServiceCq != null) {
            yoVar.setPriority(i5);
            executorServiceCq.execute(yoVar);
        }
    }

    public static void uef(com.bytedance.sdk.component.bcc.oa.yo yoVar, int i5) {
        if (yoVar == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.uef.uef.yo yoVarYo = com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().yo();
        ExecutorService executorServiceDz = yoVarYo != null ? yoVarYo.dz() : null;
        if (executorServiceDz != null) {
            yoVar.setPriority(i5);
            executorServiceDz.execute(yoVar);
        }
    }

    public static ScheduledFuture uef(Runnable runnable, long j8, TimeUnit timeUnit) {
        if (runnable == null) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.uef.uef.yo yoVarYo = com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().yo();
        ScheduledExecutorService scheduledExecutorServiceWk = yoVarYo != null ? yoVarYo.wk() : null;
        if (scheduledExecutorServiceWk != null) {
            return scheduledExecutorServiceWk.schedule(runnable, j8, timeUnit);
        }
        return null;
    }
}
