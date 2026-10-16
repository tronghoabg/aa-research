package com.google.android.gms.common.internal;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i implements f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f5049a;

    public i(m mVar) {
        Objects.requireNonNull(mVar);
        this.f5049a = mVar;
    }

    @Override // com.google.android.gms.common.internal.f
    public final void d(com.google.android.gms.common.d dVar) {
        boolean zG = dVar.g();
        m mVar = this.f5049a;
        if (zG) {
            mVar.u(null, mVar.H());
        } else if (mVar.r != null) {
            mVar.r.a(dVar);
        }
    }
}
