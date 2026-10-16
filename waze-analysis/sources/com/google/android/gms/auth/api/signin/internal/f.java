package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.Status;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class f extends n {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f4622a;

    f(g gVar) {
        Objects.requireNonNull(gVar);
        this.f4622a = gVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.n
    public final void b(Status status) {
        this.f4622a.j(status);
    }
}
