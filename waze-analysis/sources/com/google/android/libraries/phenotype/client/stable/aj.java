package com.google.android.libraries.phenotype.client.stable;

import com.google.d.m.a.bo;
import j$.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class aj implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f6048a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bo f6049b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f6050c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ TimeUnit f6051d;

    aj(ak akVar, Runnable runnable, bo boVar, long j2, TimeUnit timeUnit) {
        this.f6048a = runnable;
        this.f6049b = boVar;
        this.f6050c = j2;
        this.f6051d = timeUnit;
        Objects.requireNonNull(akVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6048a.run();
        al.c(this.f6049b.schedule(this, this.f6050c, this.f6051d));
    }
}
