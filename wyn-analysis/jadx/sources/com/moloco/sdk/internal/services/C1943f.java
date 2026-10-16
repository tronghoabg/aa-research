package com.moloco.sdk.internal.services;

import com.moloco.sdk.internal.MolocoLogger;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.internal.services.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1943f extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f29613a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1944g f29614b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f29615c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1943f(String str, C1944g c1944g, String str2, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29613a = str;
        this.f29614b = c1944g;
        this.f29615c = str2;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C1943f(this.f29613a, this.f29614b, this.f29615c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C1943f c1943f = (C1943f) create((Ef.E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        c1943f.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        String str = this.f29613a;
        String str2 = this.f29615c;
        C1944g c1944g = this.f29614b;
        if (str instanceof String) {
            c1944g.f29616a.edit().putString(str2, str).apply();
        } else {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ContentValues", "Unexpected value type: " + ((Object) str) + " for key: " + str2, null, false, 12, null);
        }
        return C2515C.f34653a;
    }
}
