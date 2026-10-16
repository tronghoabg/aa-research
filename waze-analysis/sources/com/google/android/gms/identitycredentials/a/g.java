package com.google.android.gms.identitycredentials.a;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.ab;
import com.google.android.gms.o.w;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g extends a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f5512a;

    g(w wVar) {
        this.f5512a = wVar;
    }

    @Override // com.google.android.gms.identitycredentials.a.a
    public final void b(Status status, com.google.android.gms.identitycredentials.f fVar, com.google.android.gms.common.api.k kVar) {
        x.f(status, NotificationCompat.CATEGORY_STATUS);
        ab.e(status, fVar, this.f5512a, kVar);
    }
}
