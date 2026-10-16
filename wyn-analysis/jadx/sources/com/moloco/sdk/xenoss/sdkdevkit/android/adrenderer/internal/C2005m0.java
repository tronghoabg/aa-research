package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import ba.C1521a;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.m0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2005m0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30228a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f30229b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f30230c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g f30231d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2005m0(s0 s0Var, long j8, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30229b = s0Var;
        this.f30230c = j8;
        this.f30231d = gVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C2005m0(this.f30229b, this.f30230c, this.f30231d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2005m0) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30228a;
        s0 s0Var = this.f30229b;
        if (i5 == 0) {
            Fe.e.U(obj);
            this.f30228a = 1;
            if (s0.b(s0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o oVarC = s0Var.c();
        if (oVarC != null) {
            oVarC.a(this.f30230c, new C1521a((Object) this.f30231d, false, (Object) s0Var, 5));
        }
        return C2515C.f34653a;
    }
}
