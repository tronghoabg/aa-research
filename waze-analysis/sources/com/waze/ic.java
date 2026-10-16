package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class ic implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f24446a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24447b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f24448c;

    public /* synthetic */ ic(Object obj, boolean z, int i2) {
        this.f24448c = i2;
        this.f24447b = obj;
        this.f24446a = z;
    }

    @Override // com.waze.hw
    public final Object a() {
        int i2 = this.f24448c;
        if (i2 == 0) {
            iu.ConnectivityChanged$lambda$0((iu) this.f24447b, this.f24446a);
            return null;
        }
        boolean z = this.f24446a;
        if (i2 != 1) {
            iu.SetSocialIsFirstTime$lambda$0((iu) this.f24447b, z);
            return null;
        }
        gh.marketplaceMoodRestorePrevious$lambda$0((gh) this.f24447b, z);
        return null;
    }
}
