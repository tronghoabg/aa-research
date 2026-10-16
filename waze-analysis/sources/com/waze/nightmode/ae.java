package com.waze.nightmode;

import com.waze.ao;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ae implements j {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f32452a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f32453b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f32454c;

    /* renamed from: d, reason: collision with root package name */
    private final ch f32455d;

    /* renamed from: e, reason: collision with root package name */
    private final ch f32456e;

    public ae(com.waze.shared_infra.i.e eVar, ao aoVar, af afVar, kotlinx.coroutines.b.k kVar, kotlinx.coroutines.b.k kVar2, kotlinx.coroutines.b.k kVar3, kotlinx.coroutines.b.k kVar4, kotlinx.coroutines.b.k kVar5, b bVar) {
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(aoVar, "wazeCarManager");
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(kVar, "currentMobileNightMode");
        h.g.b.x.f(kVar2, "currentCarNightMode");
        h.g.b.x.f(kVar3, "overrideNightMode");
        h.g.b.x.f(kVar4, "daytimeFlow");
        h.g.b.x.f(kVar5, "settingsFlow");
        h.g.b.x.f(bVar, "aapNightModeConfigs");
        this.f32452a = eVar;
        kotlinx.coroutines.b.k kVarQ = ai.q(kVar, kVar2, new y(null));
        this.f32453b = kVarQ;
        kotlinx.coroutines.b.k kVarS = ai.s(kVarQ, kVar4, kVar5, kVar3, new ad(null));
        this.f32454c = kVarS;
        kotlinx.coroutines.b.k kVarB = bVar.b();
        int i2 = bz.f51630a;
        ch chVarV = ai.V(kVarB, afVar, by.b(), bVar.a());
        this.f32455d = chVarV;
        this.f32456e = ai.V(ai.r(kVarS, aoVar.a(), chVarV, new z(this, null)), afVar, by.b(), false);
        ai.m(ai.K(ai.z(kVarS, new u(0)), new v(this, null)), afVar);
        ai.m(ai.K(ai.y(new ac(kVarS, this, 0)), new w(this, null)), afVar);
    }

    static final boolean c(x xVar, x xVar2) {
        h.g.b.x.f(xVar, "old");
        h.g.b.x.f(xVar2, "new");
        return f(xVar) == f(xVar2);
    }

    public static final /* synthetic */ int e(x xVar) {
        int i2 = true != f(xVar) ? 1 : 2;
        if (xVar.b() != null) {
            n nVarB = xVar.b();
            n nVar = n.f32480a;
            k kVar = k.f32473a;
            int iOrdinal = nVarB.ordinal();
            if (iOrdinal == 0) {
                return 2;
            }
            if (iOrdinal == 1) {
                return 1;
            }
            if (iOrdinal != 2) {
                throw new h.i();
            }
        } else {
            k kVarA = xVar.a();
            n nVar2 = n.f32480a;
            k kVar2 = k.f32473a;
            int iOrdinal2 = kVarA.ordinal();
            if (iOrdinal2 == 0) {
                return 1;
            }
            if (iOrdinal2 == 1) {
                return 2;
            }
            if (iOrdinal2 == 2) {
                return -1;
            }
            if (iOrdinal2 != 3) {
                throw new h.i();
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(x xVar) {
        if (xVar.b() != null) {
            n nVarB = xVar.b();
            n nVar = n.f32480a;
            k kVar = k.f32473a;
            int iOrdinal = nVarB.ordinal();
            if (iOrdinal == 0) {
                return true;
            }
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal == 2) {
                return !xVar.e();
            }
            throw new h.i();
        }
        k kVarA = xVar.a();
        n nVar2 = n.f32480a;
        k kVar2 = k.f32473a;
        int iOrdinal2 = kVarA.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return true;
            }
            if (iOrdinal2 == 2) {
                return xVar.d();
            }
            if (iOrdinal2 != 3) {
                throw new h.i();
            }
            if (!xVar.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.waze.nightmode.j
    public final ch a() {
        return this.f32456e;
    }
}
