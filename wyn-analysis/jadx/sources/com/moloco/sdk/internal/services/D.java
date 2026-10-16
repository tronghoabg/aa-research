package com.moloco.sdk.internal.services;

import Ef.H;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.moloco.sdk.internal.MolocoLogger;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class D extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f29379a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f29380b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(E e7, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29380b = e7;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new D(this.f29380b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((D) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        NetworkCapabilities networkCapabilities;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f29379a;
        if (i5 != 0 && i5 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Fe.e.U(obj);
        do {
            Object systemService = this.f29380b.f29381a.getSystemService("connectivity");
            AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null && (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3))) {
                return Boolean.TRUE;
            }
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "ConnectivityServiceImpl", "waiting because of no network connection", null, false, 12, null);
            this.f29379a = 1;
        } while (H.m(100L, this) != aVar);
        return aVar;
    }
}
