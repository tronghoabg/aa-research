package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid;

import Ef.E;
import Hf.x0;
import com.bumptech.glide.f;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.B;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.D;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class a extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f30601a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f30602b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f30603c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D f30604d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, boolean z2, D d3, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30602b = fVar;
        this.f30603c = z2;
        this.f30604d = d3;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new a(this.f30602b, this.f30603c, this.f30604d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30601a;
        C2515C c2515c = C2515C.f34653a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return c2515c;
        }
        Fe.e.U(obj);
        f fVar = this.f30602b;
        B b5 = new B(this.f30603c, this.f30604d);
        this.f30601a = 1;
        ((x0) fVar.f24238i).emit(b5, this);
        return c2515c == aVar ? aVar : c2515c;
    }
}
