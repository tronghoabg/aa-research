package com.waze.br.b;

import com.waze.t.b.ak;
import com.waze.t.b.al;
import com.waze.t.b.am;
import com.waze.t.b.bo;
import com.waze.t.b.bp;
import com.waze.t.b.bq;
import com.waze.t.b.bt;
import com.waze.t.b.bu;
import com.waze.t.b.bw;
import com.waze.t.b.cc;
import h.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class w implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    private final c f17356a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f17357b;

    /* renamed from: c, reason: collision with root package name */
    private final af f17358c;

    /* renamed from: d, reason: collision with root package name */
    private br f17359d;

    /* renamed from: e, reason: collision with root package name */
    private com.waze.t.b.h f17360e;

    /* renamed from: f, reason: collision with root package name */
    private final bn f17361f;

    /* renamed from: g, reason: collision with root package name */
    private final ch f17362g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.shared_infra.q.j f17363h;

    public w(com.waze.shared_infra.q.j jVar, c cVar, com.waze.shared_infra.i.e eVar, h.c.j jVar2) {
        h.g.b.x.f(jVar, "starter");
        h.g.b.x.f(cVar, "actionHandler");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(jVar2, "coroutineContext");
        this.f17363h = jVar;
        this.f17356a = cVar;
        this.f17357b = eVar;
        this.f17358c = aj.e(jVar2);
        bn bnVarB = ck.b(new q(null));
        this.f17361f = bnVarB;
        this.f17362g = ai.U(bnVarB);
    }

    public static final /* synthetic */ o b(w wVar, bw bwVar, a aVar) {
        n nVar;
        if (bwVar instanceof bu) {
            return m.f17338a;
        }
        i iVar = null;
        Float fValueOf = null;
        g gVar = null;
        if (bwVar instanceof bt) {
            return null;
        }
        if (bwVar instanceof com.waze.t.b.br) {
            Float fA = ((com.waze.t.b.br) bwVar).a();
            return new k(fA != null ? Float.valueOf(fA.floatValue() * 10.0f) : null);
        }
        if (!(bwVar instanceof bq)) {
            if (bwVar instanceof bo) {
                return h.f17333a;
            }
            if (bwVar instanceof bp) {
                return j.f17335a;
            }
            throw new h.i();
        }
        bq bqVar = (bq) bwVar;
        cc ccVarC = bqVar.c();
        if (ccVarC != null) {
            Float fA2 = ccVarC.a();
            if (fA2 != null) {
                float fFloatValue = fA2.floatValue();
                fValueOf = Float.valueOf(fFloatValue + fFloatValue);
            }
            return new l(fValueOf);
        }
        if (bqVar.b() == null) {
            return n.f17339a;
        }
        am amVarB = bqVar.b();
        if (amVarB instanceof ak) {
            if (aVar != null) {
                gVar = new g(aVar);
            } else {
                wVar.f17357b.g("HandlingFeatureAction while currentPendingAction is null, it should not be null");
            }
            nVar = gVar;
        } else if (amVarB instanceof al) {
            al alVar = (al) amVarB;
            com.waze.br.a.i iVarA = ((com.waze.br.a.m) alVar.a()).a();
            if (true != ((com.waze.br.a.m) alVar.a()).e()) {
                iVarA = null;
            }
            if (iVarA != null) {
                iVar = new i(iVarA);
            } else {
                wVar.f17357b.g("did not move to HandleAction due to failed action");
            }
            nVar = iVar;
        } else {
            if (amVarB != null) {
                throw new h.i();
            }
            nVar = n.f17339a;
        }
        return nVar == null ? n.f17339a : nVar;
    }

    static final ab d(w wVar) {
        wVar.f17357b.g("Conversation ended by the agent");
        wVar.f17360e = null;
        br brVar = wVar.f17359d;
        if (brVar != null) {
            brVar.s(null);
        }
        wVar.f17359d = null;
        return ab.f48028a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f17357b.e("close");
        h();
        aj.h(this.f17358c, kotlinx.coroutines.bo.g("Closed", null));
    }

    public final ch g() {
        return this.f17362g;
    }

    public final void h() {
        Object objD;
        this.f17357b.e("Cancel conversation");
        br brVar = this.f17359d;
        if (brVar != null) {
            brVar.s(null);
        }
        this.f17359d = null;
        com.waze.t.b.h hVar = this.f17360e;
        if (hVar != null) {
            hVar.close();
        }
        this.f17360e = null;
        bn bnVar = this.f17361f;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, new q(null)));
    }

    public final void i() {
        com.waze.t.b.h hVar = this.f17360e;
        if (hVar != null) {
            hVar.c();
        }
    }

    public final void j() {
        Object objD;
        if (this.f17360e != null) {
            this.f17357b.g("trying to start conversation while there is an active one, please cancel before");
            return;
        }
        com.waze.t.b.h hVarD = this.f17363h.d(new r(this, 2));
        if (hVarD != null) {
            this.f17357b.e("start conversation success, start collecting state");
            this.f17360e = hVarD;
            this.f17359d = aj.z(this.f17358c, null, null, new v(hVarD, this, null), 3);
        } else {
            bn bnVar = this.f17361f;
            do {
                objD = bnVar.d();
            } while (!bnVar.f(objD, new q(h.f17333a)));
        }
    }
}
