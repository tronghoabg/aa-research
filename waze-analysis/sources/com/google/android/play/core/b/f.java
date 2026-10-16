package com.google.android.play.core.b;

import android.os.IBinder;
import android.os.RemoteException;
import j$.util.Objects;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class f extends a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ IBinder f6970a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f6971b;

    f(h hVar, IBinder iBinder) {
        this.f6970a = iBinder;
        Objects.requireNonNull(hVar);
        this.f6971b = hVar;
    }

    @Override // com.google.android.play.core.b.a
    public final void b() throws RemoteException {
        com.google.android.play.core.a.b.c cVarB = com.google.android.play.core.a.b.b.b(this.f6970a);
        i iVar = this.f6971b.f6973a;
        iVar.m = cVarB;
        i.m(iVar);
        iVar.f6980g = false;
        Iterator it = iVar.f6977d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        iVar.f6977d.clear();
    }
}
