package com.google.android.play.core.a;

import android.os.RemoteException;
import com.google.android.gms.o.w;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class j extends com.google.android.play.core.b.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f6936a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Long f6937b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ w f6938c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ q f6939d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ l f6940e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(l lVar, w wVar, byte[] bArr, Long l2, w wVar2, q qVar) {
        super(wVar);
        this.f6936a = bArr;
        this.f6937b = l2;
        this.f6938c = wVar2;
        this.f6939d = qVar;
        Objects.requireNonNull(lVar);
        this.f6940e = lVar;
    }

    @Override // com.google.android.play.core.b.a
    public final void a(Exception exc) {
        if (exc instanceof com.google.android.play.core.b.j) {
            super.a(new n(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // com.google.android.play.core.b.a
    protected final void b() {
        try {
            l lVar = this.f6940e;
            ((com.google.android.play.core.a.b.c) lVar.f6944a.d()).a(l.a(lVar, this.f6936a, this.f6937b), new k(lVar, this.f6938c));
        } catch (RemoteException e2) {
            this.f6940e.f6947d.g(e2, "requestIntegrityToken(%s)", this.f6939d);
            this.f6938c.d(new n(-100, e2));
        }
    }
}
