package com.waze.bk;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f16846a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f16847b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f16848c;

    public /* synthetic */ b(e eVar, r rVar, int i2) {
        this.f16848c = i2;
        this.f16846a = eVar;
        this.f16847b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f16848c;
        r rVar = this.f16847b;
        e eVar = this.f16846a;
        if (i2 != 0) {
            e.f(eVar, rVar);
        } else {
            e.c(eVar, rVar);
        }
    }
}
