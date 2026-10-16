package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class dp implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ds f31252a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31253b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f31254c;

    public /* synthetic */ dp(ds dsVar, int i2, int i3) {
        this.f31254c = i3;
        this.f31252a = dsVar;
        this.f31253b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f31254c;
        if (i2 == 0) {
            ds.onCurrentInstructionChangedJNI$lambda$0(this.f31252a, this.f31253b);
            return;
        }
        if (i2 == 1) {
            ds.onCurrentEtaSecondsChangedJNI$lambda$0(this.f31252a, this.f31253b);
            return;
        }
        if (i2 == 2) {
            ds.onExitNumberChangedJNI$lambda$0(this.f31252a, this.f31253b);
            return;
        }
        if (i2 == 3) {
            ds.onNextExitNumberChangedJNI$lambda$0(this.f31252a, this.f31253b);
        } else {
            if (i2 == 4) {
                ds.onEnforcementZoneUpdateJNI$lambda$0(this.f31252a, this.f31253b);
                return;
            }
            int i3 = this.f31253b;
            ds dsVar = this.f31252a;
            if (i2 != 5) {
                ds.initializeJNI$lambda$0(dsVar, i3);
            } else {
                ds.onNextInstructionChangedJNI$lambda$0(dsVar, i3);
            }
        }
    }
}
