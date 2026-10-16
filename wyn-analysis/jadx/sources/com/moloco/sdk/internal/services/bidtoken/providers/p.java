package com.moloco.sdk.internal.services.bidtoken.providers;

import Cd.C0352u;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ilrd.A;

/* loaded from: classes4.dex */
public final class p implements j {

    /* renamed from: a, reason: collision with root package name */
    public final C0352u f29512a;

    /* renamed from: b, reason: collision with root package name */
    public o f29513b = d();

    public p(C0352u c0352u) {
        this.f29512a = c0352u;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final void a() {
        this.f29513b = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final boolean b() {
        o oVarD = d();
        boolean z2 = !oVarD.equals(this.f29513b);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "IlrdSignalProvider", "[Ilrd] needsRefresh: " + z2 + ", with current: " + oVarD + ", cached: " + this.f29513b, false, 4, null);
        return z2;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final String c() {
        return "IlrdSignalProvider";
    }

    public final o d() {
        o oVarA;
        try {
            A a5 = (A) this.f29512a.invoke();
            if (a5 != null && (oVarA = a5.a()) != null) {
                return oVarA;
            }
            return new o("", -1L, -1L, -1, -1, -1, -1, -1);
        } catch (Exception e7) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "IlrdSignalProvider", "Error retrieving ILRD signal", e7, false, 8, null);
            return new o("", -1L, -1L, -1, -1, -1, -1, -1);
        }
    }
}
