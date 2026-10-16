package com.google.android.gms.fido.a;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.ab;
import com.google.android.gms.common.api.k;
import com.google.android.gms.o.w;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class b extends com.google.android.gms.fido.a.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f5462a;

    b(c cVar, w wVar) {
        this.f5462a = wVar;
        Objects.requireNonNull(cVar);
    }

    @Override // com.google.android.gms.fido.a.b.a.d
    public final void a(Status status, PendingIntent pendingIntent, k kVar) {
        ab.e(status, pendingIntent, this.f5462a, kVar);
    }
}
