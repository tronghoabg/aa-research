package com.waze;

import java.util.TimerTask;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class jb extends TimerTask implements com.waze.native_managers.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f24925a;

    /* renamed from: b, reason: collision with root package name */
    private final int f24926b;

    /* renamed from: c, reason: collision with root package name */
    private final int f24927c;

    /* renamed from: d, reason: collision with root package name */
    private final NativeManager f24928d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f24929e = true;

    jb(int i2, int i3, int i4, NativeManager nativeManager) {
        this.f24928d = nativeManager;
        this.f24925a = i2;
        this.f24927c = i4;
        this.f24926b = i3;
    }

    @Override // com.waze.native_managers.b
    public final boolean a() {
        return this.f24929e;
    }

    @Override // java.util.TimerTask
    public final boolean cancel() {
        this.f24929e = false;
        return super.cancel();
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final synchronized void run() {
        int i2 = this.f24927c;
        NativeManager nativeManager = this.f24928d;
        if (i2 < 100) {
            nativeManager.PostPriorityNativeMessage(this.f24926b, this, this.f24925a);
        } else {
            nativeManager.PostNativeMessage(this.f24926b, this, this.f24925a);
        }
    }
}
