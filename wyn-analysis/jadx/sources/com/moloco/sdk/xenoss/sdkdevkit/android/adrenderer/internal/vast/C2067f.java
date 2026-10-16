package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import Ef.InterfaceC0501m0;
import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.C2097a;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2067f extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f31361a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2097a f31362b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s f31363c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ff.d f31364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f31365e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f31366f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2067f(C2097a c2097a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s sVar, Ff.d dVar, Context context, String str, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31362b = c2097a;
        this.f31363c = sVar;
        this.f31364d = dVar;
        this.f31365e = context;
        this.f31366f = str;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        Context context = this.f31365e;
        return new C2067f(this.f31362b, this.f31363c, this.f31364d, context, this.f31366f, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2067f) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f31361a;
        try {
            if (i5 == 0) {
                Fe.e.U(obj);
                Hf.j0 j0Var = VastActivity.f31299e;
                VastActivity.f31301g = this.f31362b;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s sVar = this.f31363c;
                VastActivity.f31302h = sVar.f32394h;
                C2065e c2065e = new C2065e(this.f31364d, this.f31365e, sVar, this.f31366f, null);
                this.f31361a = 1;
                obj = Ef.H.l(c2065e, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Fe.e.U(obj);
            }
            InterfaceC0501m0 interfaceC0501m0 = (InterfaceC0501m0) obj;
            Hf.j0 j0Var2 = VastActivity.f31299e;
            VastActivity vastActivity = (VastActivity) VastActivity.f31300f.get();
            if (vastActivity != null) {
                vastActivity.finish();
            }
            VastActivity.f31303i = null;
            VastActivity.f31301g = null;
            VastActivity.f31305l = null;
            VastActivity.f31302h = null;
            ad.r.b();
            return interfaceC0501m0;
        } catch (Throwable th) {
            Hf.j0 j0Var3 = VastActivity.f31299e;
            VastActivity vastActivity2 = (VastActivity) VastActivity.f31300f.get();
            if (vastActivity2 != null) {
                vastActivity2.finish();
            }
            VastActivity.f31303i = null;
            VastActivity.f31301g = null;
            VastActivity.f31305l = null;
            VastActivity.f31302h = null;
            ad.r.b();
            throw th;
        }
    }
}
