package com.google.android.gms.auth.api.identity.a;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.ab;
import com.google.android.gms.common.api.internal.al;
import com.google.android.gms.o.w;
import j$.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class m extends al {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f4462a;

    m(n nVar, w wVar) {
        this.f4462a = wVar;
        Objects.requireNonNull(nVar);
    }

    @Override // com.google.android.gms.common.api.internal.am
    public final void a(Status status) {
        ab.c(status, this.f4462a);
    }
}
