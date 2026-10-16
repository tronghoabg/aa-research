package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class id implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ iu f24449a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24450b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f24451c;

    public /* synthetic */ id(iu iuVar, int i2, int i3) {
        this.f24451c = i3;
        this.f24449a = iuVar;
        this.f24450b = i2;
    }

    @Override // com.waze.hw
    public final Object a() {
        int i2 = this.f24451c;
        if (i2 == 0) {
            iu.CloseAllPopups$lambda$0(this.f24449a, this.f24450b);
            return null;
        }
        if (i2 == 1) {
            iu.sendThumbsUp$lambda$0(this.f24449a, this.f24450b);
            return null;
        }
        if (i2 == 2) {
            iu.BeepClosed$lambda$0(this.f24449a, this.f24450b);
            return null;
        }
        int i3 = this.f24450b;
        iu iuVar = this.f24449a;
        if (i2 != 3) {
            iu.SetExternalDisplay$lambda$0(iuVar, i3);
            return null;
        }
        iu.sendThumbsDown$lambda$0(iuVar, i3);
        return null;
    }
}
