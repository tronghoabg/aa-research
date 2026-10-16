package com.moloco.sdk.internal.services;

import Ef.H;
import Ef.S;
import android.content.SharedPreferences;
import ef.C2515C;
import lf.AbstractC3464c;

/* renamed from: com.moloco.sdk.internal.services.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1944g {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f29616a;

    public C1944g(SharedPreferences sharedPreferences) {
        this.f29616a = sharedPreferences;
    }

    public final Object a(String str, String str2, AbstractC3464c abstractC3464c) throws Throwable {
        Lf.e eVar = S.f3698a;
        Object objP = H.P(Lf.d.f7120b, new C1943f(str2, this, str, null), abstractC3464c);
        return objP == kf.a.f39711a ? objP : C2515C.f34653a;
    }

    public final Object b(String str, AbstractC3464c abstractC3464c) throws Throwable {
        Lf.e eVar = S.f3698a;
        Object objP = H.P(Lf.d.f7120b, new C1942e(this, str, null), abstractC3464c);
        return objP == kf.a.f39711a ? objP : C2515C.f34653a;
    }
}
