package com.waze.t.b;

import com.waze.sound.hl;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;
import kotlinx.coroutines.cl;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ag implements h {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f40668a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final com.waze.h.c.b f40669b = com.waze.h.c.b.f24342c;
    private final az A;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.ab f40670c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f40671d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f40672e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.t.a.b f40673f;

    /* renamed from: g, reason: collision with root package name */
    private final aj f40674g;

    /* renamed from: h, reason: collision with root package name */
    private final b f40675h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.h.a.j f40676i;

    /* renamed from: j, reason: collision with root package name */
    private final ca f40677j;

    /* renamed from: k, reason: collision with root package name */
    private final c f40678k;

    /* renamed from: l, reason: collision with root package name */
    private final bn f40679l;
    private final aq m;
    private final com.waze.t.c.f n;
    private final h.g.a.a o;
    private final kotlinx.coroutines.af p;
    private final kotlinx.coroutines.b.bn q;
    private final ch r;
    private String s;
    private kotlinx.coroutines.s t;
    private m u;
    private kotlinx.coroutines.a.o v;
    private int w;
    private final List x;
    private final com.waze.sound.ax y;
    private final hl z;

    public /* synthetic */ ag(kotlinx.coroutines.ab abVar, com.waze.shared_infra.i.e eVar, com.waze.shared_infra.i.b bVar, com.waze.t.a.b bVar2, aj ajVar, com.waze.sound.ax axVar, b bVar3, com.waze.h.a.j jVar, hl hlVar, ca caVar, c cVar, bn bnVar, az azVar, aq aqVar, com.waze.t.c.f fVar, h.g.a.a aVar) {
        this.f40670c = abVar;
        this.f40671d = eVar;
        this.f40672e = bVar;
        this.f40673f = bVar2;
        this.f40674g = ajVar;
        this.y = axVar;
        this.f40675h = bVar3;
        this.f40676i = jVar;
        this.z = hlVar;
        this.f40677j = caVar;
        this.f40678k = cVar;
        this.f40679l = bnVar;
        this.A = azVar;
        this.m = aqVar;
        this.n = fVar;
        this.o = aVar;
        this.p = kotlinx.coroutines.aj.e(abVar.plus(kotlinx.coroutines.aj.Q()));
        kotlinx.coroutines.b.bn bnVarB = ck.b(bu.f40761a);
        this.q = bnVarB;
        this.r = kotlinx.coroutines.b.ai.U(bnVarB);
        this.t = h.g.b.o.i();
        this.u = m.f40781a;
        this.x = new ArrayList();
    }

    public static final /* synthetic */ as G(ag agVar, com.waze.shared_infra.m.a aVar) {
        if (!agVar.y.i()) {
            agVar.f40671d.b("initialize: Failed to open audio session.");
            return new d(e.f40769a);
        }
        h.g.b.am amVar = new h.g.b.am();
        h.g.b.am amVar2 = new h.g.b.am();
        kotlinx.coroutines.af afVar = agVar.p;
        kotlinx.coroutines.aj.z(afVar, null, null, new y(agVar, amVar, amVar2, (h.c.e) null, 0), 3);
        if (aVar != null) {
            agVar.f40671d.a("observeMediaVolume");
            Integer num = (Integer) aVar.a().d();
            if (num != null && num.intValue() == 0) {
                agVar.M(true, true);
            }
            kotlinx.coroutines.aj.z(afVar, null, null, new aa(aVar, agVar, (h.c.e) null, 0), 3);
        }
        String strB = agVar.f40678k.b();
        if (strB != null) {
            kotlinx.coroutines.bo.d(afVar, cl.f51810b, new aa(agVar, strB, (h.c.e) null, 3, (byte[]) null));
        }
        kotlinx.coroutines.aj.z(afVar, null, null, new w(agVar, (h.c.e) null, 1, (byte[]) null), 3);
        return new f(agVar);
    }

    public static final /* synthetic */ Object H(ag agVar, com.waze.app_nav.hub.b.m mVar, h.c.e eVar) {
        Objects.toString(mVar);
        agVar.f40671d.a("handleOnPlaybackFinished : ".concat(String.valueOf(mVar)));
        if (h.g.b.x.n(mVar, com.waze.h.a.b.f24308a)) {
            agVar.f40679l.a(false);
        } else {
            if (!(mVar instanceof com.waze.h.a.c)) {
                if (!h.g.b.x.n(mVar, com.waze.h.a.d.f24310a)) {
                    throw new h.i();
                }
                agVar.f40679l.a(true);
                Object objJ = agVar.J(eVar);
                return objJ == h.c.a.a.f48038a ? objJ : h.ab.f48028a;
            }
            agVar.f40679l.a(false);
            agVar.P(new bo(ah.f40683d, "error in playback"), true);
        }
        return h.ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(h.c.e r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.waze.t.b.u
            if (r0 == 0) goto L13
            r0 = r10
            com.waze.t.b.u r0 = (com.waze.t.b.u) r0
            int r1 = r0.f40817c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40817c = r1
            goto L18
        L13:
            com.waze.t.b.u r0 = new com.waze.t.b.u
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f40815a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f40817c
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            e.b.c.b(r10)
            goto La1
        L28:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L30:
            e.b.c.b(r10)
            com.waze.shared_infra.i.e r10 = r9.f40671d
            java.util.List r2 = r9.x
            kotlinx.coroutines.b.ch r4 = r9.r
            int r5 = r2.size()
            java.lang.Object r6 = r4.d()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "endOrListen (activeStreams="
            r7.<init>(r8)
            r7.append(r5)
            java.lang.String r5 = ", state="
            r7.append(r5)
            r7.append(r6)
            java.lang.String r5 = ")"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r10.a(r5)
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r10 = r2.isEmpty()
            if (r10 != 0) goto L6a
            goto Lad
        L6a:
            java.lang.Object r10 = r4.d()
            com.waze.t.b.bw r10 = (com.waze.t.b.bw) r10
            boolean r2 = r10 instanceof com.waze.t.b.bq
            if (r2 == 0) goto Lad
            com.waze.t.b.bq r10 = (com.waze.t.b.bq) r10
            com.waze.t.b.am r2 = r10.b()
            boolean r2 = r2 instanceof com.waze.t.b.ak
            if (r2 != 0) goto Lad
            kotlinx.coroutines.a.o r2 = r9.v
            if (r2 == 0) goto L92
            kotlinx.coroutines.a.ag r2 = (kotlinx.coroutines.a.ag) r2
            kotlinx.coroutines.b.ai.ab(r2)
            com.waze.t.b.b r10 = r9.f40675h
            r10.m()
            r10 = 0
            r9.v = r10
            h.ab r9 = h.ab.f48028a
            return r9
        L92:
            boolean r10 = r10.d()
            if (r10 == 0) goto La7
            r0.f40817c = r3
            java.lang.Object r10 = h.g.b.w.b(r0)
            if (r10 != r1) goto La1
            return r1
        La1:
            r9.close()
            h.ab r9 = h.ab.f48028a
            return r9
        La7:
            r9.R()
            h.ab r9 = h.ab.f48028a
            return r9
        Lad:
            h.ab r9 = h.ab.f48028a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.t.b.ag.J(h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K(com.waze.t.a.t r7, int r8, h.c.e r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.waze.t.b.v
            if (r0 == 0) goto L13
            r0 = r9
            com.waze.t.b.v r0 = (com.waze.t.b.v) r0
            int r1 = r0.f40820c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40820c = r1
            goto L18
        L13:
            com.waze.t.b.v r0 = new com.waze.t.b.v
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f40818a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f40820c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.waze.t.a.t r7 = r0.f40821d
            r8 = r7
            com.waze.t.a.t r8 = (com.waze.t.a.t) r8
            e.b.c.b(r9)
            goto L7d
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            e.b.c.b(r9)
            java.util.List r9 = r6.x
            r6.N(r9, r8)
            boolean r8 = V(r9, r8)
            if (r8 != 0) goto L45
            h.ab r6 = h.ab.f48028a
            return r6
        L45:
            kotlinx.coroutines.a.o r8 = r6.v
            if (r8 != 0) goto L6a
            com.waze.t.b.b r8 = r6.f40675h
            r9 = 2147483647(0x7fffffff, float:NaN)
            r2 = 6
            r4 = 0
            kotlinx.coroutines.a.o r9 = h.g.b.w.c(r9, r4, r4, r2)
            r8.n()
            r6.v = r9
            kotlinx.coroutines.af r8 = r6.p
            kotlinx.coroutines.s r2 = r6.t
            kotlinx.coroutines.br r2 = (kotlinx.coroutines.br) r2
            com.waze.t.b.aa r5 = new com.waze.t.b.aa
            r5.<init>(r6, r9, r4, r3)
            h.g.a.p r5 = (h.g.a.p) r5
            kotlinx.coroutines.bo.c(r8, r2, r5)
            r8 = r9
        L6a:
            com.waze.shared_infra.e.a r9 = r7.a()
            byte[] r9 = r9.a()
            r0.f40821d = r7
            r0.f40820c = r3
            java.lang.Object r8 = r8.g(r9, r0)
            if (r8 != r1) goto L7d
            return r1
        L7d:
            com.waze.t.b.b r6 = r6.f40675h
            com.waze.shared_infra.e.a r7 = r7.a()
            byte[] r7 = r7.a()
            r6.l(r7)
            h.ab r6 = h.ab.f48028a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.t.b.ag.K(com.waze.t.a.t, int, h.c.e):java.lang.Object");
    }

    private final void L() {
        this.t.s(null);
        this.t = h.g.b.o.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(boolean z, boolean z2) {
        com.waze.shared_infra.i.e eVar = this.f40671d;
        eVar.a("handleMutedVolume : isMuted=" + z);
        if (z) {
            P(new bp(ba.f40709a), true);
            eVar.a("handleMutedState");
            this.f40679l.f(bc.f40731g, true != z2 ? "muted while running" : "muted on initial state");
            L();
            return;
        }
        P(W(this.r), true);
        m mVar = this.u;
        Objects.toString(mVar);
        eVar.a("recoverLastOperation: ".concat(String.valueOf(mVar)));
        m mVar2 = this.u;
        ba baVar = ba.f40709a;
        com.waze.h.b.j jVar = com.waze.h.b.j.f24325a;
        m mVar3 = m.f40781a;
        int iOrdinal = mVar2.ordinal();
        if (iOrdinal == 0) {
            Q();
        } else if (iOrdinal == 1) {
            d();
        } else {
            if (iOrdinal != 2) {
                throw new h.i();
            }
            c();
        }
    }

    private final void N(List list, int i2) {
        Iterator it = list.iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = -1;
                break;
            } else if (((n) it.next()).a() == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            list.set(i3, n.c((n) list.get(i3)));
            return;
        }
        this.f40671d.b("could not find stream with id " + i2);
    }

    private final void O() {
        if (T()) {
            if (this.r.d() instanceof br) {
                this.f40671d.a("interrupt : already recording, ignoring.");
            } else {
                kotlinx.coroutines.aj.z(this.p, null, null, new w(this, null, 0), 3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(bw bwVar, boolean z) {
        Object objD;
        bc bcVar;
        kotlinx.coroutines.b.bn bnVar = this.q;
        if (h.g.b.x.n(bwVar, bnVar.d())) {
            return;
        }
        if (bwVar instanceof bo) {
            bo boVar = (bo) bwVar;
            com.waze.shared_infra.i.e eVar = this.f40671d;
            ah ahVarA = boVar.a();
            Objects.toString(ahVarA);
            eVar.a("handleError : ".concat(String.valueOf(ahVarA)));
            bn bnVar2 = this.f40679l;
            ah ahVarA2 = boVar.a();
            e eVar2 = e.f40769a;
            ah ahVar = ah.f40680a;
            int iOrdinal = ahVarA2.ordinal();
            if (iOrdinal == 0) {
                bcVar = bc.f40725a;
            } else if (iOrdinal == 1) {
                bcVar = bc.f40726b;
            } else if (iOrdinal == 2) {
                bcVar = bc.f40727c;
            } else if (iOrdinal == 3) {
                bcVar = bc.f40728d;
            } else {
                if (iOrdinal != 4) {
                    throw new h.i();
                }
                bcVar = bc.f40730f;
            }
            bnVar2.f(bcVar, boVar.b());
            L();
            this.y.close();
            String strB = this.f40678k.b();
            if (strB != null) {
                kotlinx.coroutines.bo.d(this.p, cl.f51810b, new aa(this, strB, (h.c.e) null, 2));
            }
        }
        if (z) {
            this.f40671d.a("setStateTo: " + bnVar.d() + " -> " + bwVar);
        }
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, bwVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q() {
        this.f40671d.a("startInitialConversation");
        if (T()) {
            P(U(), true);
            c cVar = this.f40678k;
            if (cVar.q()) {
                Z(bd.f40734a, com.waze.t.a.f.f40636a);
                cVar.c();
            } else {
                d();
            }
            this.f40675h.o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R() {
        this.f40671d.a("startListening");
        kotlinx.coroutines.bo.c(this.p, this.t, new w(this, (h.c.e) null, 4, (int[]) null));
    }

    private final boolean S() {
        com.waze.shared_infra.i.e eVar = this.f40671d;
        eVar.a("tryRecoverAudioSession: Attempting to recover...");
        if (this.y.i()) {
            eVar.a("tryRecoverAudioSession: Audio session recovered.");
            return true;
        }
        eVar.b("tryRecoverAudioSession: Failed to reopen audio session.");
        return false;
    }

    private final boolean T() {
        bw bwVar = (bw) this.r.d();
        if (bwVar instanceof bp) {
            ba baVarA = ((bp) bwVar).a();
            ba baVar = ba.f40709a;
            com.waze.h.b.j jVar = com.waze.h.b.j.f24325a;
            m mVar = m.f40781a;
            int iOrdinal = baVarA.ordinal();
            if (iOrdinal == 0) {
                this.f40671d.a("verifyStateValidity(): the device is muted (lastOperation=" + this.u + ")");
                return false;
            }
            if (iOrdinal == 1) {
                return S();
            }
            if (iOrdinal != 2) {
                throw new h.i();
            }
        } else if ((bwVar instanceof bo) && !S()) {
            P(new bo(ah.f40684e, "error reopening audio session"), true);
            return false;
        }
        return true;
    }

    private static final bq U() {
        return new bq(null, false, null, new a(null, null));
    }

    private static final boolean V(List list, int i2) {
        Object objPrevious;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (((n) objPrevious).b()) {
                break;
            }
        }
        n nVar = (n) objPrevious;
        return nVar != null && nVar.a() == i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bq W(ch chVar) {
        Object objD = chVar.d();
        bq bqVar = objD instanceof bq ? (bq) objD : null;
        return bqVar == null ? U() : bqVar;
    }

    private final void X(com.waze.z.a.b.n nVar, Object obj, h.g.a.l lVar) {
        int i2 = this.w + 1;
        this.w = i2;
        this.x.add(new n(i2, false));
        this.f40671d.a("new api stream " + i2);
        P(W(this.r), true);
        kotlinx.coroutines.bo.c(this.p, this.t, new t(lVar, obj, this, nVar, i2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(com.waze.z.a.b.n nVar, final com.waze.t.a.e eVar) {
        final String str = this.s;
        if (str == null) {
            this.f40671d.b("sendMessage: Cannot send message, conversationId is null.");
            P(new bo(ah.f40680a, "null conversationId"), true);
        } else {
            com.waze.shared_infra.i.e eVar2 = this.f40671d;
            Objects.toString(eVar);
            eVar2.a("sendMessage: ".concat(eVar.toString()));
            X(nVar, eVar, new h.g.a.l() { // from class: com.waze.t.b.l
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return ag.r(this.f40778a, str, eVar, (com.waze.t.a.e) obj);
                }
            });
        }
    }

    private final void Z(com.waze.z.a.b.n nVar, final com.waze.t.a.h hVar) {
        Objects.toString(hVar);
        this.f40671d.a("startNewConversation : ".concat(hVar.toString()));
        X(nVar, hVar, new h.g.a.l() { // from class: com.waze.t.b.k
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ag.s(this.f40776a, hVar, (com.waze.t.a.h) obj);
            }
        });
    }

    public static final /* synthetic */ Object j(ag agVar, Throwable th, final int i2, h.c.e eVar) {
        if (th != null) {
            agVar.f40671d.c("handleApiCompletion: stream (" + i2 + ") completed with error", th);
        } else {
            agVar.f40671d.a("handleApiCompletion: stream (" + i2 + ") completed successfully.");
        }
        agVar.f40679l.l();
        Collection.EL.removeIf(agVar.x, new com.waze.car_lib.bq(new h.g.a.l() { // from class: com.waze.t.b.i
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                n nVar = (n) obj;
                int i3 = ag.f40668a;
                h.g.b.x.f(nVar, "it");
                return Boolean.valueOf(nVar.a() == i2);
            }
        }, 2));
        Object objJ = agVar.J(eVar);
        return objJ == h.c.a.a.f48038a ? objJ : h.ab.f48028a;
    }

    public static final /* synthetic */ Object k(ag agVar, com.waze.t.a.u uVar, int i2, h.c.e eVar) {
        Objects.toString(uVar);
        agVar.f40671d.a("handleResponse : ".concat(String.valueOf(uVar)));
        if (uVar instanceof com.waze.t.a.t) {
            agVar.f40679l.q(bg.f40737a);
            Object objK = agVar.K((com.waze.t.a.t) uVar, i2, eVar);
            return objK == h.c.a.a.f48038a ? objK : h.ab.f48028a;
        }
        if (uVar instanceof com.waze.t.a.s) {
            com.waze.t.a.s sVar = (com.waze.t.a.s) uVar;
            bb bbVarA = agVar.f40674g.a(sVar.a());
            agVar.f40679l.q(new bj(bbVarA));
            agVar.P(bq.e(W(agVar.r), null, false, new ak(sVar.a()), null, 11), true);
            kotlinx.coroutines.bo.c(agVar.p, agVar.t, new y(agVar, bbVarA, sVar, (h.c.e) null, 1));
        } else if (uVar instanceof com.waze.t.a.r) {
            agVar.f40679l.q(bi.f40739a);
            agVar.P(bq.e(W(agVar.r), null, true, null, null, 13), true);
        } else if (uVar instanceof com.waze.t.a.p) {
            com.waze.t.a.p pVar = (com.waze.t.a.p) uVar;
            agVar.f40679l.q(new bk(pVar.a()));
            List list = agVar.x;
            agVar.N(list, i2);
            if (V(list, i2)) {
                bq bqVarW = W(agVar.r);
                a aVarA = bqVarW.a();
                String strA = bqVarW.a().a();
                if (strA == null) {
                    strA = "";
                }
                agVar.P(bq.e(bqVarW, null, false, null, a.b(aVarA, strA.concat(String.valueOf(pVar.a())), null, 2), 7), true);
            }
        } else {
            if (!(uVar instanceof com.waze.t.a.q)) {
                throw new h.i();
            }
            agVar.f40679l.q(bh.f40738a);
            bq bqVarW2 = W(agVar.r);
            agVar.P(bq.e(bqVarW2, null, false, null, a.b(bqVarW2.a(), null, ((com.waze.t.a.q) uVar).a(), 1), 7), true);
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object l(com.waze.t.b.ag r5, com.waze.h.a.i r6, h.c.e r7) {
        /*
            boolean r0 = r7 instanceof com.waze.t.b.ab
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.t.b.ab r0 = (com.waze.t.b.ab) r0
            int r1 = r0.f40655c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40655c = r1
            goto L18
        L13:
            com.waze.t.b.ab r0 = new com.waze.t.b.ab
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f40653a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f40655c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.waze.h.a.i r6 = r0.f40656d
            r0 = r6
            com.waze.h.a.i r0 = (com.waze.h.a.i) r0
            e.b.c.b(r7)
            goto L69
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            e.b.c.b(r7)
            com.waze.t.b.c r7 = r5.f40678k
            boolean r7 = r7.e()
            if (r7 != 0) goto L42
            h.ab r5 = h.ab.f48028a
            return r5
        L42:
            com.waze.shared_infra.i.e r7 = r5.f40671d
            java.util.Objects.toString(r6)
            java.lang.String r2 = java.lang.String.valueOf(r6)
            java.lang.String r4 = "playCue: cue="
            java.lang.String r2 = r4.concat(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r7.a(r2)
            com.waze.h.a.j r7 = r5.f40676i
            java.lang.String r7 = r7.a(r6)
            com.waze.sound.hl r2 = r5.z
            r0.f40656d = r6
            r0.f40655c = r3
            java.lang.Object r7 = r2.i(r7, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            com.waze.shared_infra.i.e r5 = r5.f40671d
            com.waze.app_nav.hub.b.m r7 = (com.waze.app_nav.hub.b.m) r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "playCue: done, cue="
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = ", result="
            r0.append(r6)
            r0.append(r7)
            java.lang.String r6 = r0.toString()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r5.a(r6)
            h.ab r5 = h.ab.f48028a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.t.b.ag.l(com.waze.t.b.ag, com.waze.h.a.i, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0187, code lost:
    
        if (kotlinx.coroutines.aj.v(r12, r0, r1) == r2) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c A[Catch: all -> 0x004a, Exception -> 0x004d, TryCatch #0 {Exception -> 0x004d, blocks: (B:18:0x0046, B:30:0x0082, B:32:0x008c, B:33:0x00aa, B:35:0x00ae, B:39:0x00e5, B:40:0x00ea, B:41:0x00eb, B:42:0x00f9, B:44:0x0101, B:45:0x011e, B:47:0x0122, B:49:0x0155, B:50:0x0166, B:55:0x018c, B:56:0x0191, B:28:0x0076), top: B:64:0x0026, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa A[Catch: all -> 0x004a, Exception -> 0x004d, TryCatch #0 {Exception -> 0x004d, blocks: (B:18:0x0046, B:30:0x0082, B:32:0x008c, B:33:0x00aa, B:35:0x00ae, B:39:0x00e5, B:40:0x00ea, B:41:0x00eb, B:42:0x00f9, B:44:0x0101, B:45:0x011e, B:47:0x0122, B:49:0x0155, B:50:0x0166, B:55:0x018c, B:56:0x0191, B:28:0x0076), top: B:64:0x0026, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object m(com.waze.t.b.ag r11, h.c.e r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.t.b.ag.m(com.waze.t.b.ag, h.c.e):java.lang.Object");
    }

    static final h.ab n(ag agVar, String str) {
        agVar.f40679l.g(str);
        return h.ab.f48028a;
    }

    static final h.ab o(ag agVar, String str) {
        agVar.f40679l.j(str);
        return h.ab.f48028a;
    }

    static final h.ab p(ag agVar, String str) {
        agVar.f40679l.i(str);
        return h.ab.f48028a;
    }

    static final kotlinx.coroutines.b.k r(ag agVar, String str, com.waze.t.a.e eVar, com.waze.t.a.e eVar2) {
        h.g.b.x.f(eVar2, "it");
        return agVar.f40673f.b(str, eVar);
    }

    static final kotlinx.coroutines.b.k s(ag agVar, com.waze.t.a.h hVar, com.waze.t.a.h hVar2) {
        h.g.b.x.f(hVar2, "it");
        return new af(agVar.f40673f.c(hVar), agVar);
    }

    public static final /* synthetic */ void t(ag agVar, Throwable th) {
        agVar.f40671d.c("handleApiError: Network call failed", th);
        agVar.P(new bo(ah.f40681b, "network error"), true);
    }

    public static final /* synthetic */ void u(ag agVar) {
        agVar.f40671d.a("handleAudioFocusLost");
        agVar.f40679l.f(bc.f40732h, null);
        agVar.P(new bp(ba.f40710b), true);
        agVar.L();
    }

    @Override // com.waze.t.b.h
    public final ar a() {
        return this.A.a();
    }

    @Override // com.waze.t.b.h
    public final ch b() {
        return this.r;
    }

    @Override // com.waze.t.b.h
    public final void c() {
        this.f40671d.a("interrupt");
        this.u = m.f40783c;
        this.f40679l.h();
        O();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Object objA;
        Object objA2;
        kotlinx.coroutines.af afVar = this.p;
        if (kotlinx.coroutines.aj.j(afVar)) {
            this.f40671d.a("close");
            kotlinx.coroutines.aj.h(afVar, null);
            this.t.s(null);
            try {
                ag agVar = this;
                this.z.close();
                objA = h.ab.f48028a;
            } catch (Throwable th) {
                objA = e.b.c.a(th);
            }
            com.waze.shared_infra.i.b bVar = this.f40672e;
            Throwable thC = h.m.c(objA);
            if (thC != null) {
                bVar.a(thC, null);
            }
            try {
                ag agVar2 = this;
                this.y.close();
                objA2 = h.ab.f48028a;
            } catch (Throwable th2) {
                objA2 = e.b.c.a(th2);
            }
            com.waze.shared_infra.i.b bVar2 = this.f40672e;
            Throwable thC2 = h.m.c(objA2);
            if (thC2 != null) {
                bVar2.a(thC2, null);
            }
            bn bnVar = this.f40679l;
            bnVar.e();
            String str = this.s;
            if (str != null && this.m.a(a())) {
                this.n.a(new j(this, str, 1), new j(this, str, 0), new j(this, str, 2));
            }
            this.s = null;
            bnVar.m(null);
            P(bt.f40760a, true);
            this.o.invoke();
        }
    }

    @Override // com.waze.t.b.h
    public final void d() {
        this.f40671d.a("startNewConversation");
        if (T()) {
            this.u = m.f40782b;
            this.s = null;
            this.f40679l.m(null);
            this.A.f();
            O();
        }
    }
}
