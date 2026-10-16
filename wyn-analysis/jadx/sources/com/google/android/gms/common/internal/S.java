package com.google.android.gms.common.internal;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class S extends G {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC1717f f26613g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(AbstractC1717f abstractC1717f, int i5, Bundle bundle) {
        super(abstractC1717f, i5, bundle);
        this.f26613g = abstractC1717f;
    }

    @Override // com.google.android.gms.common.internal.G
    public final boolean a() {
        this.f26613g.zzc.b(d7.b.f34113f);
        return true;
    }

    @Override // com.google.android.gms.common.internal.G
    public final void b(d7.b bVar) {
        AbstractC1717f abstractC1717f = this.f26613g;
        if (abstractC1717f.enableLocalFallback() && abstractC1717f.zzg()) {
            abstractC1717f.zzf(16);
        } else {
            abstractC1717f.zzc.b(bVar);
            abstractC1717f.onConnectionFailed(bVar);
        }
    }
}
