package com.waze.settings.i.a;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.waze.config.ConfigValues;
import com.waze.copilot.a.u;
import com.waze.copilot.data.ag;
import com.waze.mywaze.ah;
import com.waze.settings.dy;
import com.waze.settings.dz;
import com.waze.settings.eb;
import com.waze.sound.bg;
import com.waze.sound.bj;
import com.waze.sound.hv;
import com.waze.sound.hx;
import com.waze.ui.af.s;
import com.waze.ui.af.t;
import com.waze.ui.af.v;
import com.waze.ui.af.y;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.bq;
import kotlinx.coroutines.b.bu;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sound.a.c f37426a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sound.a.h f37427b;

    /* renamed from: c, reason: collision with root package name */
    private final bj f37428c;

    /* renamed from: d, reason: collision with root package name */
    private final u f37429d;

    /* renamed from: e, reason: collision with root package name */
    private final bg f37430e;

    /* renamed from: f, reason: collision with root package name */
    private final hx f37431f;

    /* renamed from: g, reason: collision with root package name */
    private final eb f37432g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.search.c.m f37433h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f37434i;

    /* renamed from: j, reason: collision with root package name */
    private final ab f37435j;

    /* renamed from: k, reason: collision with root package name */
    private final bn f37436k;

    /* renamed from: l, reason: collision with root package name */
    private final bm f37437l;
    private final bq m;
    private List n;
    private List o;

    public q(com.waze.sound.a.c cVar, com.waze.sound.a.h hVar, bj bjVar, u uVar, bg bgVar, hx hxVar, ah ahVar, eb ebVar, com.waze.search.c.m mVar, com.waze.shared_infra.i.e eVar, ab abVar) {
        x.f(cVar, "voiceRepository");
        x.f(hVar, "voicesListRepository");
        x.f(bjVar, "customPromptsRepository");
        x.f(uVar, "downloadAndSelectPromptVoiceFilesUseCase");
        x.f(bgVar, "customPromptManager");
        x.f(hxVar, "statsSender");
        x.f(ahVar, "userProfileStatsSender");
        x.f(ebVar, "settingsStatsSender");
        x.f(mVar, "typeWhileDrivingController");
        x.f(eVar, "logger");
        x.f(abVar, "ioDispatcher");
        this.f37426a = cVar;
        this.f37427b = hVar;
        this.f37428c = bjVar;
        this.f37429d = uVar;
        this.f37430e = bgVar;
        this.f37431f = hxVar;
        this.f37432g = ebVar;
        this.f37433h = mVar;
        this.f37434i = eVar;
        this.f37435j = abVar;
        this.f37436k = ck.b(new t(null, h.a.i.h(), h.a.i.h(), false, null, false));
        bm bmVarC = bu.c(0, 1, kotlinx.coroutines.a.a.f51272b);
        this.f37437l = bmVarC;
        this.m = ai.S(bmVarC);
        this.n = h.a.i.h();
        this.o = h.a.i.h();
        eVar.a("init");
        ebVar.c(dz.f37107c, dy.f37098a, null, null, null, null);
        q qVar = this;
        aj.z(ViewModelKt.getViewModelScope(qVar), null, null, new o(this, (h.c.e) null, 0), 3);
        aj.z(ViewModelKt.getViewModelScope(qVar), abVar, null, new o(this, (h.c.e) null, 2, (byte[]) null), 2);
    }

    public static final /* synthetic */ String e(q qVar) {
        ag agVarA;
        String strB;
        com.waze.sound.a.b bVarC = qVar.f37426a.c();
        if (bVarC != null && (strB = bVarC.b()) != null) {
            return strB;
        }
        if (bVarC == null || (agVarA = bVarC.a()) == null) {
            return null;
        }
        return agVarA.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List q(String str, String str2) {
        List listAf = h.a.i.af(this.o, this.n);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listAf) {
            com.waze.ui.af.q qVar = (com.waze.ui.af.q) obj;
            String strD = qVar.d();
            String strB = qVar.b();
            s sVar = qVar instanceof s ? (s) qVar : null;
            List listI = h.a.i.i(strD, strB, sVar != null ? sVar.e() : null);
            if (!(listI instanceof Collection) || !listI.isEmpty()) {
                Iterator it = listI.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str3 = (String) it.next();
                    if (str3 != null && h.n.o.F(str3, str, true)) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        ArrayList arrayList2 = arrayList;
        if (str2 == null) {
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (x.n(((com.waze.ui.af.q) obj2).c(), str2)) {
                arrayList3.add(obj2);
            } else {
                arrayList4.add(obj2);
            }
        }
        h.k kVar = new h.k(arrayList3, arrayList4);
        return h.a.i.af((List) kVar.a(), (List) kVar.b());
    }

    public final bq j() {
        return this.m;
    }

    public final ch k() {
        return ai.U(this.f37436k);
    }

    public final void n(com.waze.ui.af.p pVar) {
        Object objD;
        v vVar;
        Object objD2;
        v vVar2;
        Object objD3;
        Object objD4;
        x.f(pVar, "voiceSettingsEvent");
        if (pVar instanceof com.waze.ui.af.e) {
            this.f37437l.c(b.f37402a);
            return;
        }
        if (pVar instanceof com.waze.ui.af.f) {
            this.f37437l.c(a.f37401a);
            return;
        }
        Object obj = null;
        if (pVar instanceof com.waze.ui.af.l) {
            y yVarA = ((com.waze.ui.af.l) pVar).a();
            if (yVarA.e() == com.waze.ui.af.c.f41881b) {
                return;
            }
            if (yVarA.e() == com.waze.ui.af.c.f41882c) {
                this.f37431f.e(hv.f40197b, yVarA.c(), null);
                this.f37428c.d(yVarA.c());
                return;
            }
            ag agVarA = this.f37427b.a();
            if (agVarA == null) {
                this.f37434i.b("Failed to set recorded voice. No default prompt to set.");
                return;
            }
            this.f37429d.e(agVarA, false, com.waze.mywaze.ag.f30571e);
            aj.z(ViewModelKt.getViewModelScope(this), this.f37435j, null, new p(this, yVarA, null), 2);
            bn bnVar = this.f37436k;
            do {
                objD4 = bnVar.d();
            } while (!bnVar.f(objD4, new t(yVarA.c(), this.n, this.o, false, null, ((v) objD4).e())));
            this.f37431f.e(hv.f40202g, yVarA.c(), true);
            return;
        }
        if (pVar instanceof com.waze.ui.af.h) {
            String strC = ((com.waze.ui.af.h) pVar).a().c();
            Iterator it = this.f37427b.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (x.n(((ag) next).f(), strC)) {
                    obj = next;
                    break;
                }
            }
            ag agVar = (ag) obj;
            if (agVar == null) {
                this.f37434i.b("Voice with id " + strC + " was not found in the downloaded voices list");
                return;
            }
            this.f37429d.e(agVar, true, com.waze.mywaze.ag.f30571e);
            bn bnVar2 = this.f37436k;
            do {
                objD3 = bnVar2.d();
            } while (!bnVar2.f(objD3, new t(strC, this.n, this.o, false, null, ((v) objD3).e())));
            this.f37431f.e(hv.f40202g, strC, false);
            return;
        }
        if (pVar instanceof com.waze.ui.af.i) {
            this.f37432g.c(dz.f37107c, dy.f37101d, "SEARCH_BAR", null, null, null);
            return;
        }
        if (pVar instanceof com.waze.ui.af.j) {
            String strA = ((com.waze.ui.af.j) pVar).a();
            int length = strA.length();
            bn bnVar3 = this.f37436k;
            if (length > 0) {
                do {
                    objD2 = bnVar3.d();
                    vVar2 = (v) objD2;
                } while (!bnVar3.f(objD2, new com.waze.ui.af.u(vVar2.a(), q(strA, vVar2.a()), strA, vVar2.e())));
                return;
            }
            if (bnVar3.d() instanceof com.waze.ui.af.u) {
                do {
                    objD = bnVar3.d();
                    vVar = (v) objD;
                } while (!bnVar3.f(objD, new t(vVar.a(), this.n, this.o, false, null, vVar.e())));
                return;
            }
            return;
        }
        if (pVar instanceof com.waze.ui.af.g) {
            this.f37431f.e(hv.f40201f, null, null);
            this.f37437l.c(c.f37403a);
            return;
        }
        if (pVar instanceof com.waze.ui.af.k) {
            y yVarA2 = ((com.waze.ui.af.k) pVar).a();
            this.f37431f.e(hv.f40198c, yVarA2.c(), null);
            this.f37428c.e(yVarA2.c());
            this.f37437l.c(new d(yVarA2));
            return;
        }
        if (pVar instanceof com.waze.ui.af.m) {
            y yVarA3 = ((com.waze.ui.af.m) pVar).a();
            this.f37431f.e(hv.f40199d, yVarA3.c(), null);
            this.f37428c.e(yVarA3.c());
            this.f37437l.c(new e(yVarA3));
            return;
        }
        if (!(pVar instanceof com.waze.ui.af.o)) {
            if (!(pVar instanceof com.waze.ui.af.n)) {
                throw new h.i();
            }
            this.f37431f.e(hv.f40200e, ((com.waze.ui.af.n) pVar).a().c(), null);
            return;
        }
        y yVarA4 = ((com.waze.ui.af.o) pVar).a();
        this.f37431f.d(yVarA4.c());
        bm bmVar = this.f37437l;
        String strC2 = yVarA4.c();
        String strB = ConfigValues.CONFIG_VALUE_CUSTOM_PROMPTS_SHARE_URL.b();
        x.e(strB, "getValue(...)");
        bmVar.c(new f(strC2, strB));
    }

    public final void o() {
        if (this.n.isEmpty()) {
            aj.z(ViewModelKt.getViewModelScope(this), this.f37435j, null, new o(this, (h.c.e) null, 3, (char[]) null), 2);
        }
    }

    public final void p() {
        this.f37430e.l();
    }
}
