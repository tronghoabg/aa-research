package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer;

import Ef.E;
import Hf.j0;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class h extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f30545a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f30546b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f30547c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a f30548d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a aVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30546b = iVar;
        this.f30547c = str;
        this.f30548d = aVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new h(this.f30546b, this.f30547c, this.f30548d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30545a;
        if (i5 == 0) {
            Fe.e.U(obj);
            i iVar = this.f30546b;
            j0 j0Var = iVar.f30558j;
            this.f30545a = 1;
            if (iVar.f30550b.a(this.f30547c, this.f30548d, iVar.f30551c, j0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        return C2515C.f34653a;
    }
}
