package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class ir implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ iu f24819a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f24820b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f24821c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24822d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f24823e;

    public /* synthetic */ ir(iu iuVar, String str, String str2, int i2, int i3) {
        this.f24823e = i3;
        this.f24819a = iuVar;
        this.f24820b = str;
        this.f24821c = str2;
        this.f24822d = i2;
    }

    @Override // com.waze.hw
    public final Object a() {
        int i2 = this.f24823e;
        int i3 = this.f24822d;
        if (i2 != 0) {
            String str = this.f24821c;
            iu.logAppLaunchAnalytics$lambda$0(this.f24819a, this.f24820b, str, i3);
            return null;
        }
        String str2 = this.f24821c;
        iu.venueFlagImage$lambda$0(this.f24819a, this.f24820b, str2, i3);
        return null;
    }
}
