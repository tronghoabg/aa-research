package com.waze.user;

import com.waze.shared_infra.r.m;
import com.waze.shared_infra.r.r;
import com.waze.shared_infra.r.s;
import com.waze.shared_infra.r.t;
import com.waze.shared_infra.r.w;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d implements m {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f44815a;

    d(e eVar) {
        this.f44815a = eVar;
    }

    @Override // com.waze.shared_infra.r.m
    public final void a() {
        Object objD;
        e eVar = this.f44815a;
        eVar.f44816a.g("Sending SWITCHED_ENV update");
        bn bnVarE = eVar.e();
        do {
            objD = bnVarE.d();
        } while (!bnVarE.f(objD, w.f37999a));
    }

    @Override // com.waze.shared_infra.r.m
    public final void b() {
        Object objD;
        e eVar = this.f44815a;
        eVar.f44816a.g("Sending LOGGED_IN update");
        bn bnVarE = eVar.e();
        do {
            objD = bnVarE.d();
        } while (!bnVarE.f(objD, s.f37995a));
    }

    @Override // com.waze.shared_infra.r.m
    public final void c(boolean z) {
        Object objD;
        e eVar = this.f44815a;
        eVar.f44816a.g("Sending LOGGED_OUT update");
        bn bnVarE = eVar.e();
        do {
            objD = bnVarE.d();
        } while (!bnVarE.f(objD, new t(z)));
    }

    @Override // com.waze.shared_infra.r.m
    public final void d() {
        Object objD;
        e eVar = this.f44815a;
        eVar.f44816a.g("Sending CREDENTIALS_CHANGED update");
        bn bnVarE = eVar.e();
        do {
            objD = bnVarE.d();
        } while (!bnVarE.f(objD, new r(((com.waze.shared_infra.h.b) objD).i())));
    }
}
