package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ba implements com.google.android.gms.common.api.u {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.common.api.v f5015a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.o.w f5016b;

    ba(com.google.android.gms.common.api.v vVar, com.google.android.gms.o.w wVar) {
        this.f5015a = vVar;
        this.f5016b = wVar;
    }

    @Override // com.google.android.gms.common.api.u
    public final void a(Status status) {
        if (!status.f()) {
            this.f5016b.b(com.google.android.gms.common.api.ab.b(status));
        } else {
            this.f5015a.d(TimeUnit.MILLISECONDS);
            this.f5016b.c(null);
        }
    }
}
