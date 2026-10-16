package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import android.net.ConnectivityManager;
import com.moloco.sdk.internal.MolocoLogger;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2095p extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f31549a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f31550b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.D f31551c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f31552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f31553e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2095p(E e7, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.D d3, boolean z2, String str, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31550b = e7;
        this.f31551c = d3;
        this.f31552d = z2;
        this.f31553e = str;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C2095p(this.f31550b, this.f31551c, this.f31552d, this.f31553e, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2095p) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        boolean zIsActiveNetworkMetered;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f31549a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return obj;
        }
        Fe.e.U(obj);
        E e7 = this.f31550b;
        com.moloco.sdk.internal.services.E e10 = e7.f31148e;
        e10.getClass();
        try {
            Object systemService = e10.f29381a.getSystemService("connectivity");
            AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            zIsActiveNetworkMetered = ((ConnectivityManager) systemService).isActiveNetworkMetered();
        } catch (Exception e11) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "isNetworkMetered", e11.toString(), e11, false, 8, null);
            zIsActiveNetworkMetered = false;
        }
        double d3 = !zIsActiveNetworkMetered ? 10.0d : 2.0d;
        com.moloco.sdk.common_adapter_internal.a aVarA = e7.f31150g.a();
        this.f31549a = 1;
        Object objG = e7.g(this.f31551c, null, d3, aVarA, this.f31552d, this.f31553e, this);
        return objG == aVar ? aVar : objG;
    }
}
