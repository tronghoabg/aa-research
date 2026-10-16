package com.waze.car_lib.i.a;

import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bn f19922a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f19923b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f19924c;

    public /* synthetic */ w(s sVar, bn bnVar, int i2) {
        this.f19924c = i2;
        this.f19923b = sVar;
        this.f19922a = bnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f19924c;
        bn bnVar = this.f19922a;
        if (i2 != 0) {
            t.h((t) this.f19923b, bnVar);
        } else {
            x.h((x) this.f19923b, bnVar);
        }
    }
}
