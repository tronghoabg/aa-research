package com.airbnb.lottie;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f2480a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f2481b;

    public /* synthetic */ p(s sVar, int i2) {
        this.f2481b = i2;
        this.f2480a = sVar;
    }

    @Override // com.airbnb.lottie.r
    public final void a() {
        int i2 = this.f2481b;
        s sVar = this.f2480a;
        if (i2 != 0) {
            sVar.y();
        } else {
            sVar.v();
        }
    }
}
