package com.moloco.sdk.internal.services;

import android.content.SharedPreferences;
import com.moloco.sdk.internal.MolocoLogger;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.internal.services.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1941d extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1944g f29580a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f29581b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1941d(C1944g c1944g, String str, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29580a = c1944g;
        this.f29581b = str;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C1941d(this.f29580a, this.f29581b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1941d) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        C1944g c1944g = this.f29580a;
        SharedPreferences sharedPreferences = c1944g.f29616a;
        String str = this.f29581b;
        if (!sharedPreferences.contains(str)) {
            return null;
        }
        try {
            return c1944g.f29616a.getString(str, "");
        } catch (ClassCastException unused) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ContentValues", "Unexpected value type for key: " + str, null, false, 12, null);
            return null;
        }
    }
}
