package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bj extends com.google.android.gms.m.a.b implements com.google.android.gms.common.api.r, com.google.android.gms.common.api.s {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f4797a = com.google.android.gms.m.b.f5708a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f4798b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f4799c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.common.api.a f4800d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f4801e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.common.internal.p f4802f;

    /* renamed from: g, reason: collision with root package name */
    private bi f4803g;

    /* renamed from: h, reason: collision with root package name */
    private com.google.android.gms.m.a.e f4804h;

    public bj(Context context, Handler handler, com.google.android.gms.common.internal.p pVar) {
        com.google.android.gms.common.api.a aVar = f4797a;
        this.f4798b = context;
        this.f4799c = handler;
        this.f4802f = pVar;
        this.f4801e = pVar.h();
        this.f4800d = aVar;
    }

    static /* bridge */ /* synthetic */ void d(bj bjVar, com.google.android.gms.m.a.h hVar) {
        com.google.android.gms.common.d dVarA = hVar.a();
        if (dVarA.g()) {
            com.google.android.gms.common.internal.be beVarB = hVar.b();
            av.m(beVarB);
            com.google.android.gms.common.d dVarA2 = beVarB.a();
            if (!dVarA2.g()) {
                String strValueOf = String.valueOf(String.valueOf(dVarA2));
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                bjVar.f4803g.e(dVarA2);
                bjVar.f4804h.N();
                return;
            }
            bjVar.f4803g.h(beVarB.b(), bjVar.f4801e);
        } else {
            bjVar.f4803g.e(dVarA);
        }
        bjVar.f4804h.N();
    }

    @Override // com.google.android.gms.common.api.internal.r
    public final void a(Bundle bundle) {
        this.f4804h.i(this);
    }

    @Override // com.google.android.gms.common.api.internal.r
    public final void b(int i2) {
        this.f4803g.f(i2);
    }

    @Override // com.google.android.gms.m.a.b
    public final void e(com.google.android.gms.m.a.h hVar) {
        this.f4799c.post(new bh(this, hVar, 0));
    }

    public final void f(bi biVar) {
        com.google.android.gms.m.a.e eVar = this.f4804h;
        if (eVar != null) {
            eVar.N();
        }
        com.google.android.gms.common.internal.p pVar = this.f4802f;
        pVar.i(Integer.valueOf(System.identityHashCode(this)));
        com.google.android.gms.common.api.a aVar = this.f4800d;
        Context context = this.f4798b;
        Handler handler = this.f4799c;
        this.f4804h = (com.google.android.gms.m.a.e) aVar.a(context, handler.getLooper(), pVar, pVar.c(), this, this);
        this.f4803g = biVar;
        Set set = this.f4801e;
        if (set == null || set.isEmpty()) {
            handler.post(new bg(this));
        } else {
            com.google.android.gms.m.a.e eVar2 = this.f4804h;
            eVar2.l(new com.google.android.gms.common.internal.i(eVar2));
        }
    }

    public final void g() {
        com.google.android.gms.m.a.e eVar = this.f4804h;
        if (eVar != null) {
            eVar.N();
        }
    }

    @Override // com.google.android.gms.common.api.internal.az
    public final void r(com.google.android.gms.common.d dVar) {
        this.f4803g.e(dVar);
    }
}
