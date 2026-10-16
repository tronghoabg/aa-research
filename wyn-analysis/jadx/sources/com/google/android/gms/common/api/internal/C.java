package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Map;

/* loaded from: classes3.dex */
public final class C implements com.google.android.gms.common.api.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f26441a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f26442b;

    public C(D d3, BasePendingResult basePendingResult) {
        this.f26442b = d3;
        this.f26441a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.q
    public final void a(Status status) {
        ((Map) this.f26442b.f26443a).remove(this.f26441a);
    }
}
