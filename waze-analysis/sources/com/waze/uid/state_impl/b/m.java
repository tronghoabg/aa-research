package com.waze.uid.state_impl.b;

import android.content.Context;
import androidx.credentials.GetCredentialRequest;
import com.waze.uid.b.t;
import h.g.b.x;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m extends t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f44616a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ GetCredentialRequest f44617b;

    m(n nVar, GetCredentialRequest getCredentialRequest) {
        this.f44616a = nVar;
        this.f44617b = getCredentialRequest;
    }

    @Override // com.waze.uid.b.t
    public final void a(Context context) {
        x.f(context, "context");
        aj.z(com.waze.uid.b.m.t().d(), null, null, new l(this.f44616a, context, this.f44617b, null), 3);
    }
}
