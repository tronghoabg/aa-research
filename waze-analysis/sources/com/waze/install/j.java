package com.waze.install;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f24781a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f24782b;

    public /* synthetic */ j(m mVar, int i2) {
        this.f24782b = i2;
        this.f24781a = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f24782b;
        m mVar = this.f24781a;
        if (i2 != 0) {
            m.onGlobalConfigLoadedJNI$lambda$0(mVar);
        } else {
            m.openSelectCountryMenuJNI$lambda$0(mVar);
        }
    }
}
