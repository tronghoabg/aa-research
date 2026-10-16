package com.waze.google_assistant;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f24233a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f24234b;

    public /* synthetic */ p(Object obj, int i2) {
        this.f24234b = i2;
        this.f24233a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f24234b;
        if (i2 == 0) {
            aa.r((aa) this.f24233a);
            return;
        }
        if (i2 == 1) {
            k.v((k) this.f24233a);
            return;
        }
        if (i2 == 2) {
            aa.o((aa) this.f24233a);
            return;
        }
        Object obj = this.f24233a;
        if (i2 != 3) {
            ag.connectToGoogleAssistantSdkJNI$lambda$0((ag) obj);
        } else {
            aa.t((aa) obj);
        }
    }
}
