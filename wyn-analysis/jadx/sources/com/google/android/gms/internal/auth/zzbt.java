package com.google.android.gms.internal.auth;

import Z6.a;
import com.google.android.gms.common.api.internal.J;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.internal.AbstractC1732v;

/* loaded from: classes3.dex */
public final class zzbt {
    public final r getSpatulaHeader(o oVar) {
        AbstractC1732v.i(oVar);
        return ((J) oVar).f26468b.doWrite((l) new zzbs(this, oVar));
    }

    public final r performProxyRequest(o oVar, a aVar) {
        AbstractC1732v.i(oVar);
        AbstractC1732v.i(aVar);
        return ((J) oVar).f26468b.doWrite((l) new zzbq(this, oVar, aVar));
    }
}
