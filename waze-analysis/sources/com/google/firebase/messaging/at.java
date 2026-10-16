package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class at extends Binder {

    /* renamed from: a, reason: collision with root package name */
    private final l f10180a;

    at(l lVar) {
        this.f10180a = lVar;
    }

    final void a(final b bVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        ((f) this.f10180a.f10212a).e((Intent) bVar.f10188a).n(new com.google.android.gms.f.v(9), new com.google.android.gms.o.k() { // from class: com.google.firebase.messaging.as
            @Override // com.google.android.gms.o.k
            public final void a(com.google.android.gms.o.t tVar) {
                bVar.b();
            }
        });
    }
}
