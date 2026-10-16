package com.bytedance.sdk.openadsdk.orq;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class oa {
    private uef lw;
    private int moa;

    /* renamed from: oa, reason: collision with root package name */
    private bcc f26073oa;
    private ScheduledExecutorService uef = null;
    private long yo = 0;

    public interface uef {
    }

    public oa(bcc bccVar, int i5) {
        this.f26073oa = bccVar;
        this.moa = i5;
    }

    public boolean oa() {
        ScheduledExecutorService scheduledExecutorService = this.uef;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService.isShutdown();
        }
        return true;
    }

    public void uef(long j8) {
        this.yo = j8;
    }

    public void uef(int i5) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.uef = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: com.bytedance.sdk.openadsdk.orq.oa.1
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                long unused = oa.this.yo;
                if (System.currentTimeMillis() - oa.this.yo > oa.this.moa) {
                    oa.this.uef.shutdown();
                    if (oa.this.f26073oa != null) {
                        oa.this.f26073oa.oa(0, "Automatic detection of stuck");
                    }
                    if (oa.this.lw != null) {
                        uef unused2 = oa.this.lw;
                    }
                }
            }
        }, 0L, i5, TimeUnit.MILLISECONDS);
    }

    public void uef() {
        ScheduledExecutorService scheduledExecutorService = this.uef;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }
}
