package com.waze;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bp implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeManager f17188a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f17189b;

    /* renamed from: c, reason: collision with root package name */
    private volatile String f17190c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f17191d;

    /* renamed from: e, reason: collision with root package name */
    private volatile long f17192e;

    bp(NativeManager nativeManager, long j2) {
        Objects.requireNonNull(nativeManager);
        this.f17188a = nativeManager;
        this.f17189b = false;
        this.f17190c = null;
        this.f17191d = false;
        this.f17192e = 0L;
        this.f17192e = j2;
    }

    protected final void a(boolean z, String str) {
        this.f17190c = str;
        this.f17191d = z;
        NativeManager.getInstance().PostRunnable(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.f17191d;
        if (this.f17189b) {
            com.waze.shared_infra.i.h.c("Calling EditBox callback twice?");
            return;
        }
        this.f17189b = true;
        this.f17188a.EditBoxCallbackNTV(z ? 1 : 0, this.f17190c, this.f17192e);
    }
}
