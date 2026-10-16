package com.bumptech.glide.manager;

import android.content.Context;
import android.net.ConnectivityManager;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class q implements com.bumptech.glide.g.j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f3540a;

    q(v vVar, Context context) {
        this.f3540a = context;
        Objects.requireNonNull(vVar);
    }

    @Override // com.bumptech.glide.g.j
    public final /* bridge */ /* synthetic */ Object a() {
        return (ConnectivityManager) this.f3540a.getSystemService("connectivity");
    }
}
