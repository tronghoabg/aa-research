package com.waze.crash;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f23230a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f23231b;

    public /* synthetic */ g(h hVar, int i2) {
        this.f23231b = i2;
        this.f23230a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f23231b;
        h hVar = this.f23230a;
        if (i2 != 0) {
            h.enforceCrashImplicitlyJNI$lambda$0(hVar);
        } else {
            h.enforceCrashJNI$lambda$0(hVar);
        }
    }
}
