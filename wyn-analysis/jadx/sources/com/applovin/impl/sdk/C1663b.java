package com.applovin.impl.sdk;

import com.applovin.impl.h7;
import com.applovin.impl.sdk.C1662a;
import com.applovin.impl.t1;
import com.applovin.impl.y4;
import java.lang.ref.WeakReference;

/* renamed from: com.applovin.impl.sdk.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1663b {

    /* renamed from: a, reason: collision with root package name */
    private final k f22912a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f22913b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f22914c;

    /* renamed from: d, reason: collision with root package name */
    private h7 f22915d;

    private C1663b(t1 t1Var, C1662a.InterfaceC0019a interfaceC0019a, k kVar) {
        this.f22913b = new WeakReference(t1Var);
        this.f22914c = new WeakReference(interfaceC0019a);
        this.f22912a = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        d();
        this.f22912a.f().a(this);
    }

    public t1 b() {
        return (t1) this.f22913b.get();
    }

    public void d() {
        a();
        t1 t1VarB = b();
        if (t1VarB == null) {
            return;
        }
        t1VarB.setExpired();
        C1662a.InterfaceC0019a interfaceC0019a = (C1662a.InterfaceC0019a) this.f22914c.get();
        if (interfaceC0019a == null) {
            return;
        }
        interfaceC0019a.onAdExpired(t1VarB);
    }

    public static C1663b a(t1 t1Var, C1662a.InterfaceC0019a interfaceC0019a, k kVar) {
        C1663b c1663b = new C1663b(t1Var, interfaceC0019a, kVar);
        c1663b.a(t1Var.getTimeToLiveMillis());
        return c1663b;
    }

    public void a(long j8) {
        a();
        if (((Boolean) this.f22912a.a(y4.f23798g1)).booleanValue() || !this.f22912a.n0().isApplicationPaused()) {
            this.f22915d = h7.a(j8, this.f22912a, new com.applovin.adview.a(this, 4));
        }
    }

    public void a() {
        h7 h7Var = this.f22915d;
        if (h7Var != null) {
            h7Var.a();
            this.f22915d = null;
        }
    }
}
