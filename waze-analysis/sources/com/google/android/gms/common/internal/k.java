package com.google.android.gms.common.internal;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class k extends a {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ m f5052e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, int i2, Bundle bundle) {
        super(mVar, i2, bundle);
        Objects.requireNonNull(mVar);
        this.f5052e = mVar;
    }

    @Override // com.google.android.gms.common.internal.a
    protected final void b(com.google.android.gms.common.d dVar) {
        this.f5052e.f5056c.d(dVar);
        m.aa(dVar);
    }

    @Override // com.google.android.gms.common.internal.a
    protected final boolean c() {
        this.f5052e.f5056c.d(com.google.android.gms.common.d.f4926a);
        return true;
    }
}
