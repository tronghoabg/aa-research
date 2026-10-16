package com.waze.car_lib.j;

import com.waze.navigate.cr;
import com.waze.navigate.gj;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ak {

    /* renamed from: a, reason: collision with root package name */
    private final cr f20194a;

    /* renamed from: b, reason: collision with root package name */
    private final gj f20195b;

    /* renamed from: c, reason: collision with root package name */
    private final y f20196c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f20197d;

    /* renamed from: e, reason: collision with root package name */
    private aa f20198e;

    /* renamed from: f, reason: collision with root package name */
    private final bn f20199f;

    public ak(cr crVar, gj gjVar, y yVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(crVar, "instructionStateInterface");
        h.g.b.x.f(gjVar, "trafficStateInterface");
        h.g.b.x.f(yVar, "configRepository");
        h.g.b.x.f(eVar, "logger");
        this.f20194a = crVar;
        this.f20195b = gjVar;
        this.f20196c = yVar;
        this.f20197d = eVar;
        this.f20198e = aa.f20167a;
        this.f20199f = ck.b(false);
    }

    public static final /* synthetic */ Object c(ak akVar, aa aaVar, h.c.e eVar) {
        aa aaVar2 = akVar.f20198e;
        if (aaVar == aaVar2) {
            return h.ab.f48028a;
        }
        akVar.f20197d.a("state: " + aaVar2 + " -> " + aaVar);
        akVar.f20198e = aaVar;
        Object objEmit = akVar.f20199f.emit(Boolean.valueOf(aaVar == aa.f20170d), eVar);
        return objEmit == h.c.a.a.f48038a ? objEmit : h.ab.f48028a;
    }

    public final ch e() {
        return this.f20199f;
    }

    public final void f(kotlinx.coroutines.af afVar) {
        h.g.b.x.f(afVar, "scope");
        kotlinx.coroutines.aj.z(afVar, null, null, new aj(kotlinx.coroutines.b.ai.y(new ad(this.f20195b.al())), kotlinx.coroutines.b.ai.y(new ag(this.f20194a.R(), this)), this, (h.c.e) null, 0), 3);
    }
}
