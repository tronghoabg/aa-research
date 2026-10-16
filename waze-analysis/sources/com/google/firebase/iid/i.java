package com.google.firebase.iid;

import com.google.android.gms.f.x;
import com.google.android.gms.o.ag;
import com.google.android.gms.o.t;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class i implements com.google.firebase.iid.a.a {

    /* renamed from: a, reason: collision with root package name */
    final FirebaseInstanceId f9950a;

    public i(FirebaseInstanceId firebaseInstanceId) {
        this.f9950a = firebaseInstanceId;
    }

    @Override // com.google.firebase.iid.a.a
    public final t a() {
        FirebaseInstanceId firebaseInstanceId = this.f9950a;
        String strE = firebaseInstanceId.e();
        return strE != null ? ag.c(strE) : firebaseInstanceId.a().a(new x(5));
    }

    @Override // com.google.firebase.iid.a.a
    public final void b(com.google.firebase.messaging.l lVar) {
        this.f9950a.n(lVar);
    }

    @Override // com.google.firebase.iid.a.a
    public final void c() {
        this.f9950a.e();
    }
}
