package com.waze.crash;

import com.waze.jni.protos.crash.NonFatalErrorInfo;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f23227a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23228b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f23229c;

    public /* synthetic */ f(h hVar, Object obj, int i2) {
        this.f23229c = i2;
        this.f23227a = hVar;
        this.f23228b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f23229c;
        Object obj = this.f23228b;
        if (i2 != 0) {
            h.logMessageJNI$lambda$0(this.f23227a, (String) obj);
        } else {
            h.onNonFatalErrorReceivedJNI$lambda$0(this.f23227a, (NonFatalErrorInfo) obj);
        }
    }
}
