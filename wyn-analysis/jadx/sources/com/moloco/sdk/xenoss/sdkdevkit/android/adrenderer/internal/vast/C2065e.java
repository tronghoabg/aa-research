package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import android.content.Context;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2065e extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f31352a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ff.d f31353b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f31354c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s f31355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f31356e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2065e(Ff.d dVar, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s sVar, String str, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31353b = dVar;
        this.f31354c = context;
        this.f31355d = sVar;
        this.f31356e = str;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C2065e c2065e = new C2065e(this.f31353b, this.f31354c, this.f31355d, this.f31356e, interfaceC3103c);
        c2065e.f31352a = obj;
        return c2065e;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2065e) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        Ef.E e7 = (Ef.E) this.f31352a;
        Hf.j0 j0Var = VastActivity.f31299e;
        VastActivity.f31304j = Ef.H.D(e7, null, new C2061c(this.f31353b, null), 3);
        return Ef.H.D(e7, null, new C2063d(this.f31354c, this.f31355d, this.f31356e, null), 3);
    }
}
