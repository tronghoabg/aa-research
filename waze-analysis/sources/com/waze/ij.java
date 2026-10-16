package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class ij implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ iu f24613a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24614b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f24615c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f24616d;

    public /* synthetic */ ij(iu iuVar, int i2, String str, int i3) {
        this.f24616d = i3;
        this.f24613a = iuVar;
        this.f24614b = i2;
        this.f24615c = str;
    }

    @Override // com.waze.hw
    public final Object a() {
        int i2 = this.f24616d;
        String str = this.f24615c;
        if (i2 != 0) {
            iu.SetExternalApp$lambda$0(this.f24613a, this.f24614b, str);
            return null;
        }
        iu.reportAlertPopupAction$lambda$0(this.f24613a, this.f24614b, str);
        return null;
    }
}
