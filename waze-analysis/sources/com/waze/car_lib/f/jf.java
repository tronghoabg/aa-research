package com.waze.car_lib.f;

import com.waze.car_lib.login.LoginController$LoginState;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class jf implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ jg f19751a;

    jf(jg jgVar) {
        this.f19751a = jgVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        com.waze.car_lib.login.i state = ((LoginController$LoginState) obj).getState();
        if (h.g.b.x.n(state, com.waze.car_lib.login.g.f20304a) || h.g.b.x.n(state, com.waze.car_lib.login.d.f20301a)) {
            this.f19751a.H(ji.f19754a);
        } else if (!h.g.b.x.n(state, com.waze.car_lib.login.f.f20303a) && !h.g.b.x.n(state, com.waze.car_lib.login.e.f20302a) && !(state instanceof com.waze.car_lib.login.h) && !h.g.b.x.n(state, com.waze.car_lib.login.c.f20300a)) {
            throw new h.i();
        }
        return h.ab.f48028a;
    }
}
