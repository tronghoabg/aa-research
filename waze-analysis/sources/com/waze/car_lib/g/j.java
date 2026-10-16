package com.waze.car_lib.g;

import com.waze.z;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final af f19798a;

    /* renamed from: b, reason: collision with root package name */
    private final c f19799b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.car_lib.q.g f19800c;

    /* renamed from: d, reason: collision with root package name */
    private final l f19801d;

    /* renamed from: e, reason: collision with root package name */
    private final a f19802e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f19803f;

    /* renamed from: g, reason: collision with root package name */
    private final z f19804g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f19805h;

    /* renamed from: i, reason: collision with root package name */
    private final bn f19806i;

    /* renamed from: j, reason: collision with root package name */
    private final ch f19807j;

    public j(af afVar, c cVar, com.waze.car_lib.q.g gVar, l lVar, a aVar, com.waze.shared_infra.i.e eVar, z zVar) {
        x.f(afVar, "scope");
        x.f(cVar, "lcvConfig");
        x.f(gVar, "carHardwareManagerUtils");
        x.f(lVar, "systemPropertiesWrapper");
        x.f(aVar, "deviceInfoWrapper");
        x.f(eVar, "logger");
        x.f(zVar, "appType");
        this.f19798a = afVar;
        this.f19799b = cVar;
        this.f19800c = gVar;
        this.f19801d = lVar;
        this.f19802e = aVar;
        this.f19803f = eVar;
        this.f19804g = zVar;
        bn bnVarB = ck.b(d.f19792a);
        this.f19806i = bnVarB;
        this.f19807j = ai.U(bnVarB);
    }

    public final ch d() {
        Object objD;
        Object objD2;
        if (!this.f19805h) {
            com.waze.shared_infra.i.e eVar = this.f19803f;
            eVar.a("Started");
            if (this.f19804g != z.f45554b || !this.f19799b.c() || !x.n(this.f19802e.a(), "renault")) {
                eVar.a("Lcv is disabled");
                bn bnVar = this.f19806i;
                do {
                    objD = bnVar.d();
                } while (!bnVar.f(objD, d.f19792a));
            } else if (x.n(this.f19801d.a(), "commercial")) {
                eVar.a("Lcv is commercial");
                bn bnVar2 = this.f19806i;
                do {
                    objD2 = bnVar2.d();
                } while (!bnVar2.f(objD2, e.f19793a));
            } else {
                aj.z(this.f19798a, null, null, new i(this, null), 3);
            }
            this.f19805h = true;
        }
        return this.f19807j;
    }
}
