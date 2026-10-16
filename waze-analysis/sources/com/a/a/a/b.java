package com.a.a.a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.bumptech.glide.load.n;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class b implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f1727a;

    /* renamed from: b, reason: collision with root package name */
    private final c f1728b;

    /* synthetic */ b(a aVar, c cVar) {
        Objects.requireNonNull(aVar);
        this.f1727a = aVar;
        this.f1728b = cVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        n.q("Install Referrer service connected.");
        a aVar = this.f1727a;
        aVar.f1725d = com.google.android.b.a.b.b(iBinder);
        aVar.f1722a = 2;
        this.f1728b.a(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        n.r("Install Referrer service disconnected.");
        a aVar = this.f1727a;
        aVar.f1725d = null;
        aVar.f1722a = 0;
    }
}
