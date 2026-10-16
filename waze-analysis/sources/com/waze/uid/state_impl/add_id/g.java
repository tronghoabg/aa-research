package com.waze.uid.state_impl.add_id;

import android.content.Context;
import android.content.Intent;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class g extends com.waze.uid.b.w {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.uid.d.n f44582a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f44583b;

    g(h hVar, com.waze.uid.d.n nVar) {
        this.f44582a = nVar;
        Objects.requireNonNull(hVar);
        this.f44583b = hVar;
    }

    @Override // com.waze.uid.b.w
    public final Intent a(Context context) {
        return com.waze.ui.v.f.j(context, this.f44583b.f44584a, this.f44582a);
    }
}
