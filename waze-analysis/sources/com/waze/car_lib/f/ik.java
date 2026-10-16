package com.waze.car_lib.f;

import com.waze.car_lib.login.LoginController$LoginState;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ik extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f19711a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.shared_infra.coordinators.s f19712b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f19713c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ik(ax axVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f19713c = i2;
        this.f19712b = axVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f19713c;
        com.waze.shared_infra.coordinators.s sVar = this.f19712b;
        if (i2 != 0) {
            ik ikVar = new ik((ax) sVar, eVar, 1);
            ikVar.f19711a = obj;
            return ikVar;
        }
        ik ikVar2 = new ik((il) sVar, eVar, 0);
        ikVar2.f19711a = obj;
        return ikVar2;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f19713c != 0 ? ((ik) create((com.waze.cu) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ik) create((LoginController$LoginState) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f19713c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            com.waze.cu cuVar = (com.waze.cu) this.f19711a;
            this.f19712b.H(new bi(cuVar.a(), cuVar.b()));
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        LoginController$LoginState loginController$LoginState = (LoginController$LoginState) this.f19711a;
        com.waze.shared_infra.i.e eVar = ((il) this.f19712b).f19720g;
        com.waze.car_lib.login.i state = loginController$LoginState.getState();
        Objects.toString(state);
        eVar.a("state is ".concat(String.valueOf(state)));
        boolean z = true;
        if (!loginController$LoginState.getAreCredentialsMissing() && !loginController$LoginState.isLoggedIn()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ik(il ilVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f19713c = i2;
        this.f19712b = ilVar;
    }
}
