package com.waze.bh;

import android.os.Bundle;
import com.waze.app_nav.p;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c extends p {

    /* renamed from: a, reason: collision with root package name */
    private final String f16773a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, Bundle bundle) {
        super(com.waze.bh.c.e.class, bundle, 4);
        x.f(str, "token");
        x.f(bundle, "bundle");
        this.f16773a = str;
    }

    @Override // com.waze.app_nav.p
    public final boolean equals(Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        return x.n(cVar != null ? cVar.f16773a : null, this.f16773a);
    }

    @Override // com.waze.app_nav.p
    public final int hashCode() {
        return this.f16773a.hashCode();
    }
}
