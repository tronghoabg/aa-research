package com.waze.bf.b;

import com.waze.b.u;
import com.waze.shared_infra.i.e;
import h.g.b.x;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final e f16294a;

    /* renamed from: b, reason: collision with root package name */
    private final bn f16295b;

    /* renamed from: c, reason: collision with root package name */
    private final ch f16296c;

    public a() {
        e eVarD = com.waze.shared_infra.i.a.d("PrivacyConsentController");
        x.e(eVarD, "create(...)");
        this.f16294a = eVarD;
        bn bnVarB = ck.b(null);
        this.f16295b = bnVarB;
        this.f16296c = ai.U(bnVarB);
    }

    public final ch a() {
        return this.f16296c;
    }

    public final void b() {
        this.f16295b.e(null);
    }

    public final void c(u uVar) {
        x.f(uVar, "ageRestrictionRepository");
        this.f16294a.a("requestConsent");
        this.f16295b.e(new com.waze.bf.a.a(uVar));
    }
}
