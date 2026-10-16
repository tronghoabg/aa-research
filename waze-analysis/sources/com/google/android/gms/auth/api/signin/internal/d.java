package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.Status;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class d extends n {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f4621a;

    d(e eVar) {
        Objects.requireNonNull(eVar);
        this.f4621a = eVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.n
    public final void a(Status status) {
        this.f4621a.j(status);
    }
}
