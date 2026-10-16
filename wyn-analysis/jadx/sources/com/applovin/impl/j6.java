package com.applovin.impl;

import com.applovin.impl.e6;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class j6 extends j5 {

    /* renamed from: g, reason: collision with root package name */
    private final WeakReference f21772g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f21773h;

    public j6(t4 t4Var, Object obj, String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
        this.f21772g = new WeakReference(t4Var);
        this.f21773h = obj;
    }

    public static void a(long j8, t4 t4Var, Object obj, String str, com.applovin.impl.sdk.k kVar) {
        if (j8 <= 0) {
            return;
        }
        kVar.r0().a(new j6(t4Var, obj, str, kVar), e6.b.TIMEOUT, j8);
    }

    @Override // java.lang.Runnable
    public void run() {
        t4 t4Var = (t4) this.f21772g.get();
        if (t4Var == null || t4Var.c()) {
            return;
        }
        this.f21766a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f21766a.O().d(this.f21767b, "Attempting to timeout pending task " + t4Var.b() + " with " + this.f21773h);
        }
        t4Var.a(this.f21773h);
    }
}
