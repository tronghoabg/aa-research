package com.google.android.gms.common.api.internal;

import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.api.internal.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1705t extends com.google.android.gms.common.api.r {

    /* renamed from: a, reason: collision with root package name */
    public final BasePendingResult f26553a;

    public C1705t(BasePendingResult basePendingResult) {
        this.f26553a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.r
    public final void addStatusListener(com.google.android.gms.common.api.q qVar) {
        this.f26553a.addStatusListener(qVar);
    }

    @Override // com.google.android.gms.common.api.r
    public final com.google.android.gms.common.api.t await(long j8, TimeUnit timeUnit) {
        return this.f26553a.await(0L, TimeUnit.MILLISECONDS);
    }
}
