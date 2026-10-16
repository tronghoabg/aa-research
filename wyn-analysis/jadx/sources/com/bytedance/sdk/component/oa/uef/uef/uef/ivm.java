package com.bytedance.sdk.component.oa.uef.uef.uef;

import com.google.android.gms.common.api.f;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ivm extends com.bytedance.sdk.component.oa.uef.moa {
    private ExecutorService uef;

    /* renamed from: oa, reason: collision with root package name */
    private List<com.bytedance.sdk.component.oa.uef.oa> f25067oa = new CopyOnWriteArrayList();
    private List<com.bytedance.sdk.component.oa.uef.oa> yo = new CopyOnWriteArrayList();
    private AtomicInteger moa = new AtomicInteger(64);

    public ivm() {
        if (this.uef == null) {
            this.uef = new ThreadPoolExecutor(0, f.API_PRIORITY_OTHER, 20L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.bytedance.sdk.component.oa.uef.uef.uef.ivm.1
                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable, "systemHttp Dispatcher");
                    thread.setDaemon(false);
                    thread.setPriority(10);
                    return thread;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.oa.uef.moa
    public List<com.bytedance.sdk.component.oa.uef.oa> moa() {
        return this.yo;
    }

    @Override // com.bytedance.sdk.component.oa.uef.moa
    public ExecutorService oa() {
        return this.uef;
    }

    @Override // com.bytedance.sdk.component.oa.uef.moa
    public void uef(int i5) {
        this.moa.set(i5);
    }

    @Override // com.bytedance.sdk.component.oa.uef.moa
    public List<com.bytedance.sdk.component.oa.uef.oa> yo() {
        return this.f25067oa;
    }

    @Override // com.bytedance.sdk.component.oa.uef.moa
    public int uef() {
        return this.moa.get();
    }
}
