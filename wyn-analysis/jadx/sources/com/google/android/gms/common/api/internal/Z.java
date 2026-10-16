package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Z extends c0 {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1691e f26501b;

    public Z(int i5, AbstractC1691e abstractC1691e) {
        super(i5);
        AbstractC1732v.j(abstractC1691e, "Null methods are not runnable.");
        this.f26501b = abstractC1691e;
    }

    @Override // com.google.android.gms.common.api.internal.c0
    public final void a(Status status) {
        try {
            this.f26501b.setFailedResult(status);
        } catch (IllegalStateException e7) {
            Log.w("ApiCallRunner", "Exception reporting failure", e7);
        }
    }

    @Override // com.google.android.gms.common.api.internal.c0
    public final void b(RuntimeException runtimeException) {
        try {
            this.f26501b.setFailedResult(new Status(10, N0.a.g(runtimeException.getClass().getSimpleName(), ": ", runtimeException.getLocalizedMessage()), null, null));
        } catch (IllegalStateException e7) {
            Log.w("ApiCallRunner", "Exception reporting failure", e7);
        }
    }

    @Override // com.google.android.gms.common.api.internal.c0
    public final void c(H h10) throws DeadObjectException {
        try {
            this.f26501b.run(h10.f26455b);
        } catch (RuntimeException e7) {
            b(e7);
        }
    }

    @Override // com.google.android.gms.common.api.internal.c0
    public final void d(D d3, boolean z2) {
        Boolean boolValueOf = Boolean.valueOf(z2);
        Map map = (Map) d3.f26443a;
        AbstractC1691e abstractC1691e = this.f26501b;
        map.put(abstractC1691e, boolValueOf);
        abstractC1691e.addStatusListener(new C(d3, abstractC1691e));
    }
}
