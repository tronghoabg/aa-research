package com.waze.bl.b.a;

import com.waze.bm.a.a.ae;
import com.waze.bm.a.a.af;
import com.waze.bm.a.a.ag;
import com.waze.bm.a.a.ai;
import com.waze.bm.a.a.al;
import com.waze.bm.a.a.am;
import com.waze.bm.a.a.an;
import com.waze.bm.a.a.ap;
import com.waze.bm.a.a.aq;
import com.waze.bm.a.a.as;
import com.waze.bm.a.a.au;
import com.waze.bm.a.a.av;
import com.waze.bm.a.a.aw;
import com.waze.bm.a.a.q;
import com.waze.bm.a.a.y;
import com.waze.t.a.k;
import com.waze.t.a.m;
import com.waze.t.a.o;
import com.waze.t.a.p;
import com.waze.t.a.r;
import com.waze.t.a.s;
import com.waze.t.a.t;
import com.waze.t.a.u;
import com.waze.t.a.v;
import com.waze.t.a.w;
import com.waze.u.a.n;
import h.g.a.l;
import h.g.b.x;
import kotlinx.coroutines.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j extends com.waze.bl.c.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f16912a;

    /* renamed from: b, reason: collision with root package name */
    private final ab f16913b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.bl.c.a.b f16914c;

    /* renamed from: d, reason: collision with root package name */
    private final m f16915d;

    /* renamed from: e, reason: collision with root package name */
    private final o f16916e;

    /* renamed from: f, reason: collision with root package name */
    private final k f16917f;

    public j(com.waze.shared_infra.i.e eVar, ab abVar, com.waze.bl.c.a.b bVar, m mVar, o oVar, k kVar) {
        x.f(eVar, "logger");
        x.f(abVar, "ioDispatcher");
        x.f(bVar, "api");
        x.f(mVar, "streetNameProvider");
        x.f(oVar, "userLocationProvider");
        x.f(kVar, "audioLocaleProvider");
        this.f16912a = eVar;
        this.f16913b = abVar;
        this.f16914c = bVar;
        this.f16915d = mVar;
        this.f16916e = oVar;
        this.f16917f = kVar;
    }

    public static final /* synthetic */ Object a(j jVar, Object obj) {
        return k(obj, new c(0));
    }

    public static final /* synthetic */ Object d(j jVar, Object obj) {
        return k(obj, new c(1));
    }

    static final kotlinx.coroutines.b.k e(j jVar, ai aiVar) {
        x.f(aiVar, "requestProto");
        return kotlinx.coroutines.b.ai.H(new i(jVar.f16914c.a(aiVar), jVar, 1), jVar.f16913b);
    }

    static final kotlinx.coroutines.b.k f(j jVar, an anVar) {
        x.f(anVar, "requestProto");
        return kotlinx.coroutines.b.ai.H(new i(jVar.f16914c.b(anVar), jVar, 0), jVar.f16913b);
    }

    static final u g(al alVar) {
        x.f(alVar, "response");
        return l(alVar);
    }

    static final com.waze.t.a.a h(ap apVar) {
        x.f(apVar, "response");
        String chatId = apVar.getChatId();
        x.e(chatId, "getChatId(...)");
        al response = apVar.getResponse();
        x.e(response, "getResponse(...)");
        return new com.waze.t.a.a(chatId, l(response));
    }

    private final af i() {
        String str = (String) this.f16917f.b();
        if (str == null) {
            throw new d();
        }
        ae aeVarNewBuilder = af.newBuilder();
        aeVarNewBuilder.a(str);
        com.waze.u.a.c cVarNewBuilder = com.waze.u.a.g.newBuilder();
        cVarNewBuilder.a(com.waze.u.a.d.OGG_OPUS);
        cVarNewBuilder.b(com.waze.u.a.f.SAMPLE_RATE_16K);
        aeVarNewBuilder.b(cVarNewBuilder);
        Object objB = this.f16915d.b();
        String str2 = (String) objB;
        if (str2 == null || h.n.o.G(str2)) {
            objB = null;
        }
        String str3 = (String) objB;
        if (str3 != null) {
            aeVarNewBuilder.c(str3);
        }
        com.waze.shared_infra.h.c cVar = (com.waze.shared_infra.h.c) this.f16916e.b();
        if (cVar != null) {
            com.waze.shared_infra.h.c cVar2 = true != cVar.g() ? cVar : null;
            if (cVar2 != null) {
                aeVarNewBuilder.d(com.waze.sharedui.e.e.e(cVar2));
            }
        }
        af afVarBuild = aeVarNewBuilder.build();
        x.e(afVarBuild, "build(...)");
        return afVarBuild;
    }

    private static final Object j(Object obj, l lVar, l lVar2) {
        Object obj2 = true != (obj instanceof h.l) ? obj : null;
        if (obj2 != null) {
            return lVar.invoke(obj2);
        }
        Throwable thC = h.m.c(obj);
        return thC != null ? lVar2.invoke(thC) : lVar2.invoke(new RuntimeException());
    }

    private static final Object k(Object obj, l lVar) {
        if (h.m.e(obj)) {
            try {
                e.b.c.b(obj);
                return lVar.invoke(obj);
            } catch (Throwable th) {
                return e.b.c.a(th);
            }
        }
        RuntimeException runtimeExceptionC = h.m.c(obj);
        if (runtimeExceptionC == null) {
            runtimeExceptionC = new RuntimeException();
        }
        return e.b.c.a(runtimeExceptionC);
    }

    private static final u l(al alVar) {
        com.waze.bl.c.b.b bVarG;
        int iOrdinal = alVar.getResponseCase().ordinal();
        if (iOrdinal == 0) {
            byte[] bArrX = alVar.getPlaySound().getAudioChunk().x();
            x.e(bArrX, "toByteArray(...)");
            return new t(com.waze.shared_infra.g.e.j(bArrX));
        }
        if (iOrdinal == 1) {
            String chatText = alVar.getDisplayText().getChatText();
            x.e(chatText, "getChatText(...)");
            return new p(chatText);
        }
        if (iOrdinal == 2) {
            return r.f40640a;
        }
        if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new h.i();
            }
            throw new e();
        }
        com.waze.bm.a.a.c action = alVar.getAction();
        x.e(action, "getAction(...)");
        x.f(action, "<this>");
        int iOrdinal2 = action.getActionCase().ordinal();
        if (iOrdinal2 == 0) {
            y reportMapIssue = action.getReportMapIssue();
            x.e(reportMapIssue, "getReportMapIssue(...)");
            bVarG = com.waze.bi.i.g(reportMapIssue);
        } else if (iOrdinal2 == 1) {
            q reportAlert = action.getReportAlert();
            x.e(reportAlert, "getReportAlert(...)");
            bVarG = com.waze.bi.i.e(reportAlert);
        } else if (iOrdinal2 == 2) {
            com.waze.bm.a.a.u reportClosure = action.getReportClosure();
            x.e(reportClosure, "getReportClosure(...)");
            bVarG = com.waze.bi.i.f(reportClosure);
        } else {
            if (iOrdinal2 != 3) {
                if (iOrdinal2 != 4) {
                    throw new h.i();
                }
                throw new IllegalArgumentException("Action not set");
            }
            bVarG = com.waze.bl.c.b.b.f17005a;
        }
        return new s(bVarG);
    }

    private static final n m(com.waze.calendar.b bVar) {
        boolean z = bVar instanceof v;
        n nVarNewBuilder = com.waze.u.a.s.newBuilder();
        if (!z) {
            if (!(bVar instanceof w)) {
                throw new h.i();
            }
            throw null;
        }
        com.waze.u.a.p pVarNewBuilder = com.waze.u.a.r.newBuilder();
        com.waze.u.a.a aVarNewBuilder = com.waze.u.a.b.newBuilder();
        aVarNewBuilder.a(com.waze.sharedui.e.e.b(((v) bVar).a().a()));
        pVarNewBuilder.a(aVarNewBuilder.build());
        com.waze.u.a.r rVarBuild = pVarNewBuilder.build();
        x.e(rVarBuild, "build(...)");
        nVarNewBuilder.a(rVarBuild);
        x.e(nVarNewBuilder, "apply(...)");
        return nVarNewBuilder;
    }

    @Override // com.waze.t.a.b
    public final kotlinx.coroutines.b.k b(String str, com.waze.t.a.e eVar) {
        ai aiVarA;
        x.f(str, "conversationId");
        x.f(eVar, "message");
        this.f16912a.a("sendMessage");
        try {
            j jVar = this;
            ag agVarNewBuilder = ai.newBuilder();
            agVarNewBuilder.c(str);
            agVarNewBuilder.b(i());
            if (eVar instanceof com.waze.t.a.d) {
                agVarNewBuilder.d(m(((com.waze.t.a.d) eVar).a()));
            } else {
                if (!(eVar instanceof com.waze.t.a.c)) {
                    throw new h.i();
                }
                agVarNewBuilder.a(com.waze.bi.i.b((com.waze.bl.c.b.j) ((com.waze.t.a.c) eVar).a()));
            }
            ai aiVarBuild = agVarNewBuilder.build();
            x.e(aiVarBuild, "build(...)");
            aiVarA = aiVarBuild;
        } catch (Throwable th) {
            aiVarA = e.b.c.a(th);
        }
        return (kotlinx.coroutines.b.k) j(aiVarA, new b(this, 0), new com.waze.network.q(2));
    }

    @Override // com.waze.t.a.b
    public final kotlinx.coroutines.b.k c(com.waze.t.a.h hVar) {
        an anVarA;
        x.f(hVar, "trigger");
        this.f16912a.a("startConversation");
        try {
            j jVar = this;
            am amVarNewBuilder = an.newBuilder();
            aq aqVarNewBuilder = aw.newBuilder();
            if (hVar instanceof com.waze.t.a.g) {
                au auVarNewBuilder = av.newBuilder();
                auVarNewBuilder.a(m(((com.waze.t.a.g) hVar).a()));
                aqVarNewBuilder.b(auVarNewBuilder);
            } else {
                if (!(hVar instanceof com.waze.t.a.f)) {
                    throw new h.i();
                }
                aqVarNewBuilder.a(as.newBuilder());
            }
            x.e(aqVarNewBuilder, "apply(...)");
            amVarNewBuilder.b(aqVarNewBuilder);
            amVarNewBuilder.a(i());
            an anVarBuild = amVarNewBuilder.build();
            x.e(anVarBuild, "build(...)");
            anVarA = anVarBuild;
        } catch (Throwable th) {
            anVarA = e.b.c.a(th);
        }
        int i2 = 1;
        return (kotlinx.coroutines.b.k) j(anVarA, new b(this, i2), new com.waze.network.q(i2));
    }
}
