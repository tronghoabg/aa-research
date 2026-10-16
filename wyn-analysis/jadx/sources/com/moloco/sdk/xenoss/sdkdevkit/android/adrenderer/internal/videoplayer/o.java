package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import Ef.H;
import Hf.C0588a0;
import Hf.C0605o;
import Hf.InterfaceC0602l;
import Hf.Z;
import Hf.e0;
import Hf.j0;
import Hf.k0;
import Hf.n0;
import Hf.x0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.K;
import s6.C;

/* loaded from: classes4.dex */
public final class o implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n {

    /* renamed from: a, reason: collision with root package name */
    public final j f32261a;

    /* renamed from: b, reason: collision with root package name */
    public final Kd.a f32262b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f32263c;

    /* renamed from: d, reason: collision with root package name */
    public final x0 f32264d;

    public o(j jVar, S s10) {
        InterfaceC0602l interfaceC0602lA;
        int i5 = 0;
        this.f32261a = jVar;
        Kd.a aVarE = H.e();
        this.f32262b = aVarE;
        C c10 = jVar.f32241l;
        e0 e0VarX = k0.x((c10 == null || (interfaceC0602lA = s10.a(c10)) == null) ? new C0605o(Boolean.FALSE, 1) : interfaceC0602lA, aVarE, n0.f5168a, Boolean.FALSE);
        Gf.a aVar = Gf.a.f4780a;
        j0 j0VarB = k0.b(1, 0, 2);
        this.f32263c = j0VarB;
        x0 x0Var = jVar.f32239i;
        this.f32264d = k0.c(a.a((a) x0Var.getValue(), ((Boolean) ((x0) e0VarX.f5122a).getValue()).booleanValue()));
        k0.u(new C0588a0(e0VarX, j0VarB, new m(this, null)), aVarE);
        k0.u(new Z(new C0588a0(x0Var, e0VarX, new K(3, null, 4)), new n(this, null), i5), aVarE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    public final void destroy() {
        H.j(this.f32262b, null);
        this.f32261a.destroy();
    }
}
