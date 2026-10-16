package com.waze.reports;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class dx implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eb f33884a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f33885b;

    public /* synthetic */ dx(eb ebVar, int i2) {
        this.f33885b = i2;
        this.f33884a = ebVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f33885b;
        if (i2 == 0) {
            eb.r(this.f33884a);
            return;
        }
        eb ebVar = this.f33884a;
        if (i2 != 1) {
            eb.q(ebVar);
        } else {
            eb.p(ebVar);
        }
    }
}
