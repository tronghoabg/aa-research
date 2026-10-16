package com.waze.sdk;

import android.os.IBinder;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ak implements IBinder.DeathRecipient {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ an f35231a;

    ak(an anVar) {
        Objects.requireNonNull(anVar);
        this.f35231a = anVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        an anVar = this.f35231a;
        com.waze.shared_infra.i.h.a("WazeSdk: Oops, client died: ".concat(String.valueOf(anVar.T())));
        anVar.f35238e.getBinder().unlinkToDeath(this, 0);
        anVar.f35240g = true;
        bd.d().C(anVar.T());
    }
}
