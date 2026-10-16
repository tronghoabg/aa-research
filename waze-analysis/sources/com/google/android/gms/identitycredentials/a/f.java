package com.google.android.gms.identitycredentials.a;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.ab;
import com.google.android.gms.o.w;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f extends a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f5511a;

    f(w wVar) {
        this.f5511a = wVar;
    }

    @Override // com.google.android.gms.identitycredentials.a.a
    public final void a(Status status, com.google.android.gms.identitycredentials.c cVar, com.google.android.gms.common.api.k kVar) {
        x.f(status, NotificationCompat.CATEGORY_STATUS);
        ab.e(status, cVar, this.f5511a, kVar);
    }
}
