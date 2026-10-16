package com.google.android.gms.auth.a.a;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.ab;
import com.google.android.gms.o.w;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class g extends c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f4405a;

    g(h hVar, w wVar) {
        this.f4405a = wVar;
        Objects.requireNonNull(hVar);
    }

    @Override // com.google.android.gms.auth.a.a.c
    public final void a(Status status, com.google.android.gms.auth.a.f fVar) {
        ab.d(status, fVar, this.f4405a);
    }
}
