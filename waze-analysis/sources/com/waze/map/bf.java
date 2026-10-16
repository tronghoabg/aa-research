package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class bf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f28393a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28394b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f28395c;

    public /* synthetic */ bf(Object obj, boolean z, int i2) {
        this.f28395c = i2;
        this.f28394b = obj;
        this.f28393a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f28395c;
        boolean z = this.f28393a;
        if (i2 != 0) {
            u.onSkinChangedJNI$lambda$0((u) this.f28394b, z);
        } else {
            bh.onMapIsDarkOverlayShownChangedJNI$lambda$0((bh) this.f28394b, z);
        }
    }
}
