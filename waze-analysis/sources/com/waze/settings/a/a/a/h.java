package com.waze.settings.a.a.a;

import com.waze.copilot.a.aj;
import com.waze.copilot.a.an;
import com.waze.copilot.a.w;
import com.waze.settings.dy;
import com.waze.settings.dz;
import com.waze.settings.eb;
import h.a.i;
import h.a.r;
import h.g.b.x;
import java.util.Map;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f36712a;

    /* renamed from: b, reason: collision with root package name */
    private final w f36713b;

    /* renamed from: c, reason: collision with root package name */
    private final aj f36714c;

    /* renamed from: d, reason: collision with root package name */
    private final an f36715d;

    /* renamed from: e, reason: collision with root package name */
    private final eb f36716e;

    /* renamed from: f, reason: collision with root package name */
    private final af f36717f;

    /* renamed from: g, reason: collision with root package name */
    private Map f36718g;

    /* renamed from: h, reason: collision with root package name */
    private final bn f36719h;

    /* renamed from: i, reason: collision with root package name */
    private final ch f36720i;

    public h(com.waze.shared_infra.i.e eVar, w wVar, aj ajVar, an anVar, eb ebVar, af afVar) {
        x.f(eVar, "logger");
        x.f(wVar, "downloadAndSetCarAssetUseCase");
        x.f(ajVar, "getCarsUseCase");
        x.f(anVar, "getSelectedCarUseCase");
        x.f(ebVar, "settingsStatsSender");
        x.f(afVar, "bgScope");
        this.f36712a = eVar;
        this.f36713b = wVar;
        this.f36714c = ajVar;
        this.f36715d = anVar;
        this.f36716e = ebVar;
        this.f36717f = afVar;
        this.f36718g = r.j();
        bn bnVarB = ck.b(new e(null, i.h(), ((com.waze.copilot.data.c) anVar.a().d()).e(), false, true));
        this.f36719h = bnVarB;
        this.f36720i = ai.U(bnVarB);
        eVar.a("init");
        n();
        kotlinx.coroutines.aj.z(afVar, null, null, new f(this, null, 0), 3);
        ebVar.c(dz.f37108d, dy.f37098a, null, null, null, null);
        kotlinx.coroutines.aj.z(afVar, null, null, new f(this, null, 1, null), 3);
    }

    private final void n() {
        bn bnVar;
        Object objD;
        do {
            bnVar = this.f36719h;
            objD = bnVar.d();
        } while (!bnVar.f(objD, e.f((e) objD, null, null, null, false, true, 15)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(d dVar) {
        while (true) {
            bn bnVar = this.f36719h;
            Object objD = bnVar.d();
            d dVar2 = dVar;
            if (bnVar.f(objD, e.f((e) objD, dVar2, null, null, false, false, 14))) {
                return;
            } else {
                dVar = dVar2;
            }
        }
    }

    public final ch f() {
        return this.f36720i;
    }

    public final void i() {
        kotlinx.coroutines.aj.h(this.f36717f, null);
    }

    public final void j() {
        bn bnVar;
        Object objD;
        do {
            bnVar = this.f36719h;
            objD = bnVar.d();
        } while (!bnVar.f(objD, e.f((e) objD, null, null, null, false, false, 30)));
    }

    public final void k() {
        this.f36716e.c(dz.f37108d, dy.f37099b, null, null, null, null);
    }

    public final void l() {
        this.f36716e.c(dz.f37108d, dy.f37102e, null, null, null, null);
    }

    public final void m(String str) {
        x.f(str, "carId");
        this.f36712a.a("car selected: ".concat(String.valueOf(str)));
        com.waze.copilot.data.c cVar = (com.waze.copilot.data.c) this.f36718g.get(str);
        if (cVar == null) {
            o(c.f36700a);
            return;
        }
        this.f36716e.c(dz.f37108d, dy.f37100c, null, ((e) this.f36719h.d()).b(), str, null);
        n();
        kotlinx.coroutines.aj.z(this.f36717f, null, null, new g(this, cVar, null), 3);
    }
}
