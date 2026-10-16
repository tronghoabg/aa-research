package com.waze.config;

import com.waze.rtalerts.RtAlertsNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22638a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f22639b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f22640c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22641d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f22642e;

    public /* synthetic */ i(m mVar, int i2, String str, boolean z, int i3) {
        this.f22642e = i3;
        this.f22641d = mVar;
        this.f22638a = i2;
        this.f22639b = str;
        this.f22640c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f22642e;
        boolean z = this.f22640c;
        if (i2 != 0) {
            int i3 = this.f22638a;
            ((RtAlertsNativeManager) this.f22641d).lambda$reportMapIssue$0(this.f22639b, i3, z);
        } else {
            String str = this.f22639b;
            m.onStringConfigUpdatedJNI$lambda$0((m) this.f22641d, this.f22638a, str, z);
        }
    }

    public /* synthetic */ i(RtAlertsNativeManager rtAlertsNativeManager, String str, int i2, boolean z, int i3) {
        this.f22642e = i3;
        this.f22641d = rtAlertsNativeManager;
        this.f22639b = str;
        this.f22638a = i2;
        this.f22640c = z;
    }
}
