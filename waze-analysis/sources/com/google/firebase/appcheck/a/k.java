package com.google.firebase.appcheck.a;

import android.app.Application;
import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f8874a;

    /* renamed from: b, reason: collision with root package name */
    private volatile int f8875b;

    /* renamed from: c, reason: collision with root package name */
    private volatile long f8876c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f8877d;

    k(Context context, d dVar) {
        e eVar = new e(dVar);
        this.f8876c = -1L;
        com.google.android.gms.common.api.internal.k.c((Application) context.getApplicationContext());
        com.google.android.gms.common.api.internal.k.a().b(new j(this, eVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
    }

    public final void b(com.google.firebase.appcheck.b bVar) {
        a aVarE = bVar instanceof a ? (a) bVar : a.e(bVar.b());
        this.f8876c = aVarE.d() + ((long) (aVarE.c() * 0.5d)) + 300000;
        if (this.f8876c > aVarE.a()) {
            this.f8876c = aVarE.a() - 60000;
        }
        e();
    }

    public final void c(boolean z) {
        this.f8877d = z;
    }
}
