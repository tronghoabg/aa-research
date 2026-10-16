package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import Va.M6;
import com.moloco.sdk.internal.MolocoLogger;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class C extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f31116a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f31117b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(E e7, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31117b = e7;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C c10 = new C(this.f31117b, interfaceC3103c);
        c10.f31116a = obj;
        return c10;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C) create((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h hVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h) this.f31116a;
        if (hVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.f) {
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            this.f31117b.getClass();
            StringBuilder sb2 = new StringBuilder("Stream status: ");
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.f fVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.f) hVar;
            sb2.append(fVar.f30332b.f30333a);
            sb2.append('/');
            MolocoLogger.info$default(molocoLogger, "VastAdLoaderImpl", M6.s(sb2, fVar.f30332b.f30334b, " bytes downloaded"), null, false, 12, null);
        }
        return Boolean.valueOf((hVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d) || (hVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e));
    }
}
