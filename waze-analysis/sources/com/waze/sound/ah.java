package com.waze.sound;

import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ah implements z, u {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f39418a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.h.c.a f39419b;

    /* renamed from: c, reason: collision with root package name */
    private final ch f39420c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.ao f39421d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.h.a f39422e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f39423f;

    public ah(com.waze.shared_infra.i.e eVar, com.waze.h.c.a aVar, ch chVar, com.waze.ao aoVar) {
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(aVar, "audioConfig");
        h.g.b.x.f(chVar, "mobileRecorderFactory");
        h.g.b.x.f(aoVar, "carManager");
        this.f39418a = eVar;
        this.f39419b = aVar;
        this.f39420c = chVar;
        this.f39421d = aoVar;
        this.f39422e = kotlinx.coroutines.h.i.c();
        this.f39423f = kotlinx.coroutines.b.ck.b(null);
    }

    public static final /* synthetic */ Object f(ah ahVar, kotlinx.coroutines.a.ad adVar, ab abVar, h.c.e eVar) {
        Objects.toString(abVar);
        com.waze.shared_infra.i.e eVar2 = ahVar.f39418a;
        eVar2.a("initializing new recorder with ".concat(String.valueOf(abVar)));
        com.waze.h.b.e eVarA = abVar.a().a(ahVar.f39419b);
        aa aaVarB = abVar.b();
        Objects.toString(aaVarB);
        eVar2.a("collecting audio data from ".concat(String.valueOf(aaVarB)));
        h.g.b.x.f(eVarA, "<this>");
        Object objCollect = kotlinx.coroutines.b.ai.J(kotlinx.coroutines.b.ai.p(new aj(eVarA, (h.c.e) null, 0)), new ad(ahVar, abVar, eVarA, null)).collect(new af(adVar), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }

    public static final /* synthetic */ Object g(ah ahVar, kotlinx.coroutines.a.ad adVar, h.c.e eVar) {
        Object objE = kotlinx.coroutines.b.ai.e(kotlinx.coroutines.b.ai.K(new kotlinx.coroutines.b.aj(kotlinx.coroutines.b.ai.y(kotlinx.coroutines.b.ai.q(ahVar.f39421d.a(), ahVar.f39423f, new ac(ahVar, null))), 4), new av(ahVar, (h.c.e) null, 1)), new ag(ahVar, adVar, null), eVar);
        return objE == h.c.a.a.f48038a ? objE : h.ab.f48028a;
    }

    @Override // com.waze.sound.u
    public final void a(com.waze.h.b.a aVar) {
        Objects.toString(aVar);
        this.f39418a.a("received a car recorder factory : ".concat(String.valueOf(aVar)));
        this.f39423f.e(aVar);
    }

    @Override // com.waze.sound.z
    public final com.waze.h.c.a b() {
        return this.f39419b;
    }

    @Override // com.waze.sound.z
    public final kotlinx.coroutines.b.k c() {
        return kotlinx.coroutines.b.ai.p(new aj(this, (h.c.e) null, 1));
    }
}
