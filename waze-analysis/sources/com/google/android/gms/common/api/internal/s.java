package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class s implements com.google.android.gms.common.api.u {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BasePendingResult f4846a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u f4847b;

    s(u uVar, BasePendingResult basePendingResult) {
        this.f4846a = basePendingResult;
        Objects.requireNonNull(uVar);
        this.f4847b = uVar;
    }

    @Override // com.google.android.gms.common.api.u
    public final void a(Status status) {
        this.f4847b.f4850a.remove(this.f4846a);
    }
}
