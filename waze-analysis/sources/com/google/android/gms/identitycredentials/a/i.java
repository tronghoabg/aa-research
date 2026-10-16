package com.google.android.gms.identitycredentials.a;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.ab;
import com.google.android.gms.identitycredentials.x;
import com.google.android.gms.o.w;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i extends a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f5514a;

    i(w wVar) {
        this.f5514a = wVar;
    }

    @Override // com.google.android.gms.identitycredentials.a.a
    public final void d(Status status, x xVar, com.google.android.gms.common.api.k kVar) {
        h.g.b.x.f(status, NotificationCompat.CATEGORY_STATUS);
        ab.e(status, xVar, this.f5514a, kVar);
    }
}
