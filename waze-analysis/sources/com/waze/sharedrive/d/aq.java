package com.waze.sharedrive.d;

import androidx.core.app.NotificationCompat;
import com.waze.config.ConfigValues;
import com.waze.navigate.dg;
import com.waze.navigate.et;
import com.waze.sharedrive.g.bf;
import com.waze.sharedui.profile.UserProfile;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aq {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedrive.c.y f38213a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sharedrive.b.a f38214b;

    /* renamed from: c, reason: collision with root package name */
    private final dg f38215c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.sharedui.e.g f38216d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.sharedui.profile.b f38217e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.location.b.d f38218f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f38219g;

    /* renamed from: h, reason: collision with root package name */
    private final CoroutineExceptionHandler f38220h;

    /* renamed from: i, reason: collision with root package name */
    private final bn f38221i;

    /* renamed from: j, reason: collision with root package name */
    private final ch f38222j;

    /* renamed from: k, reason: collision with root package name */
    private final kotlinx.coroutines.h.a f38223k;

    /* renamed from: l, reason: collision with root package name */
    private final kotlinx.coroutines.af f38224l;

    public aq(com.waze.sharedrive.c.y yVar, com.waze.sharedrive.b.a aVar, dg dgVar, com.waze.sharedui.e.g gVar, com.waze.sharedui.profile.b bVar, h.c.j jVar, com.waze.location.b.d dVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(yVar, NotificationCompat.CATEGORY_SERVICE);
        h.g.b.x.f(aVar, "config");
        h.g.b.x.f(dgVar, "navigationInfo");
        h.g.b.x.f(gVar, "locationService");
        h.g.b.x.f(bVar, "profileManager");
        h.g.b.x.f(jVar, "coroutineContext");
        h.g.b.x.f(dVar, "locationProvider");
        h.g.b.x.f(eVar, "logger");
        this.f38213a = yVar;
        this.f38214b = aVar;
        this.f38215c = dgVar;
        this.f38216d = gVar;
        this.f38217e = bVar;
        this.f38218f = dVar;
        this.f38219g = eVar;
        this.f38220h = new am(CoroutineExceptionHandler.f51269c, this);
        bn bnVarB = ck.b(null);
        this.f38221i = bnVarB;
        this.f38222j = kotlinx.coroutines.b.ai.U(bnVarB);
        this.f38223k = kotlinx.coroutines.h.i.c();
        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(jVar.plus(kotlinx.coroutines.aj.P((br) jVar.get(br.f51766a))).plus(new kotlinx.coroutines.ae("ShareDriveController")));
        this.f38224l = afVarE;
        R(afVarE, new an(this, (h.c.e) null, 1, (byte[]) null));
        R(afVarE, new an(this, null, 0));
        R(afVarE, new an(this, (h.c.e) null, 2, (char[]) null));
    }

    static /* synthetic */ s O(aq aqVar, com.waze.sharedrive.c.a.q qVar, String str) {
        return aqVar.P(qVar, null, str);
    }

    private final s P(com.waze.sharedrive.c.a.q qVar, com.waze.shared_infra.h.c cVar, String str) {
        bn bnVar;
        Object objD;
        r rVar;
        com.waze.sharedrive.c.a.l lVarA;
        String strB;
        com.waze.sharedrive.c.a.n nVar;
        com.waze.sharedrive.c.a.l lVar;
        do {
            bnVar = this.f38221i;
            objD = bnVar.d();
            rVar = (r) objD;
            q qVarD = rVar instanceof q ? (q) rVar : null;
            if (qVarD == null) {
                this.f38219g.g("updateCurrentParticipantRole, on non live drive state");
            } else if (str == null || h.g.b.x.n(((com.waze.sharedrive.c.a.m) qVarD.a().b()).b(), str)) {
                lVarA = bf.A(qVarD);
                if (lVarA == null) {
                    this.f38219g.g("updateCurrentParticipantRole, share drive participant does not have one with current user");
                } else if ((lVarA.c() instanceof com.waze.sharedrive.c.a.p) && (qVar instanceof com.waze.sharedrive.c.a.p)) {
                    this.f38219g.a("updateCurrentParticipantRole, Ignoring, an update is already in progress.");
                } else {
                    com.waze.sharedrive.c.a.l lVarG = com.waze.sharedrive.c.a.l.g(lVarA, h.g.b.x.n(cVar, com.waze.shared_infra.h.c.f37873a) ? null : cVar == null ? lVarA.a() : cVar, qVar, 39);
                    strB = ((com.waze.sharedrive.c.a.m) qVarD.a().b()).b();
                    com.waze.sharedrive.c.a.m mVar = (com.waze.sharedrive.c.a.m) qVarD.a().b();
                    Iterator it = mVar.d().iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                            break;
                        }
                        if (h.g.b.x.n(((com.waze.sharedrive.c.a.l) it.next()).d(), lVarG.d())) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 < 0) {
                        this.f38219g.g("Trying to update participant that does not exist: ".concat(String.valueOf(lVarG.d())));
                    } else {
                        List listAq = h.a.i.aq(mVar.d());
                        listAq.set(i2, lVarG);
                        com.waze.sharedrive.c.a.m mVarE = com.waze.sharedrive.c.a.m.e(mVar, listAq);
                        com.waze.sharedrive.c.a.q qVarA = qVarD.a();
                        if (qVarA instanceof com.waze.sharedrive.c.a.o) {
                            nVar = new com.waze.sharedrive.c.a.o(mVarE);
                        } else if (qVarA instanceof com.waze.sharedrive.c.a.p) {
                            nVar = new com.waze.sharedrive.c.a.p(mVarE);
                        } else {
                            if (!(qVarA instanceof com.waze.sharedrive.c.a.n)) {
                                throw new h.i();
                            }
                            nVar = new com.waze.sharedrive.c.a.n(mVarE, ((com.waze.sharedrive.c.a.n) qVarD.a()).a());
                        }
                        qVarD = q.d(qVarD, nVar, false, null, 6);
                    }
                    lVar = lVarG;
                    rVar = qVarD;
                }
            } else {
                this.f38219g.g("updateCurrentParticipantRole: session ID mismatch, skipping update");
            }
            lVar = null;
            lVarA = null;
            strB = null;
        } while (!bnVar.f(objD, rVar));
        if (lVarA == null || strB == null) {
            return null;
        }
        return new s(strB, lVarA, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(r rVar, String str) {
        String strC;
        if (rVar != null) {
            int i2 = h.g.b.ar.f48106a;
            strC = new h.g.b.m(rVar.getClass()).c();
        } else {
            strC = "null";
        }
        this.f38219g.f(str + " while in unexpected state: " + strC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(kotlinx.coroutines.af afVar, h.g.a.p pVar) {
        kotlinx.coroutines.aj.z(afVar, this.f38220h, null, pVar, 2);
    }

    public static final /* synthetic */ Object c(aq aqVar, String str, h.c.e eVar) {
        Object objCollect = aqVar.f38213a.m(str).collect(new w(aqVar), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object d(com.waze.sharedrive.d.aq r5, h.c.e r6) {
        /*
            boolean r0 = r6 instanceof com.waze.sharedrive.d.x
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.sharedrive.d.x r0 = (com.waze.sharedrive.d.x) r0
            int r1 = r0.f38282c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38282c = r1
            goto L18
        L13:
            com.waze.sharedrive.d.x r0 = new com.waze.sharedrive.d.x
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f38280a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f38282c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            e.b.c.b(r6)
            goto L4d
        L2f:
            e.b.c.b(r6)
            com.waze.navigate.dg r6 = r5.f38215c
            kotlinx.coroutines.b.ch r6 = r6.ag()
            kotlinx.coroutines.b.bq r6 = (kotlinx.coroutines.b.bq) r6
            com.waze.sharedrive.d.z r2 = new com.waze.sharedrive.d.z
            r4 = 0
            r2.<init>(r5, r4)
            h.g.a.p r2 = (h.g.a.p) r2
            kotlinx.coroutines.b.k r6 = (kotlinx.coroutines.b.k) r6
            r0.f38282c = r3
            java.lang.Object r5 = kotlinx.coroutines.b.ai.e(r6, r2, r0)
            if (r5 != r1) goto L4d
            return r1
        L4d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "SharedFlow never completes, this call should never return."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedrive.d.aq.d(com.waze.sharedrive.d.aq, h.c.e):java.lang.Object");
    }

    public static final /* synthetic */ Object e(aq aqVar, String str, boolean z, h.c.e eVar) {
        com.waze.sharedrive.c.a.j jVar = new com.waze.sharedrive.c.a.j(z);
        com.waze.sharedui.e.c cVarA = aqVar.f38216d.a();
        return aqVar.f38213a.o(str, jVar, cVarA != null ? cVarA.f() : null, eVar);
    }

    public static final /* synthetic */ Object f(aq aqVar, h.c.e eVar) {
        Object objE = kotlinx.coroutines.b.ai.e(kotlinx.coroutines.b.ai.y(new ad(aqVar.f38222j, 1)), new af(aqVar, null, 1, null), eVar);
        return objE == h.c.a.a.f48038a ? objE : h.ab.f48028a;
    }

    public static final /* synthetic */ Object g(aq aqVar, h.c.e eVar) {
        Object objE = kotlinx.coroutines.b.ai.e(kotlinx.coroutines.b.ai.z(new ad(aqVar.f38222j, 0), new com.waze.sharedrive.g.ac(1)), new af(aqVar, null, 0), eVar);
        return objE == h.c.a.a.f48038a ? objE : h.ab.f48028a;
    }

    public static final /* synthetic */ Object h(aq aqVar, String str, h.c.e eVar) {
        kotlinx.coroutines.b.k kVarY = kotlinx.coroutines.b.ai.y(aqVar.f38216d.d());
        h.o.c cVar = h.o.a.f48264a;
        Long lB = ConfigValues.CONFIG_VALUE_SHARE_DRIVE_LOCATION_UPDATE_INTERVAL_SECONDS.b();
        h.g.b.x.e(lB, "getValue(...)");
        Object objCollect = kotlinx.coroutines.b.ai.O(kVarY, h.o.c.j(lB.longValue(), h.o.d.f48273d)).collect(new ah(aqVar, str), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }

    public static final /* synthetic */ Object i(aq aqVar, String str, h.c.e eVar) {
        dg dgVar = aqVar.f38215c;
        Object objE = kotlinx.coroutines.b.ai.e(kotlinx.coroutines.b.ai.y(kotlinx.coroutines.b.ai.q(new ad(dgVar.M(), 2), new ad(dgVar.Z(), 3), new ak(null))), new al(aqVar, str, null), eVar);
        return objE == h.c.a.a.f48038a ? objE : h.ab.f48028a;
    }

    public static final /* synthetic */ void p(aq aqVar, com.waze.sharedrive.c.d dVar) {
        Object objD;
        q qVarD;
        Object objD2;
        Object objD3;
        q qVarD2;
        String strC;
        Object next;
        if (!(dVar instanceof com.waze.sharedrive.c.b)) {
            if (dVar instanceof com.waze.sharedrive.c.a) {
                aqVar.f38219g.a("Changing state to Ended because the drive has ended");
                bn bnVar = aqVar.f38221i;
                do {
                    objD2 = bnVar.d();
                } while (!bnVar.f(objD2, new h(null)));
                return;
            }
            if (!(dVar instanceof com.waze.sharedrive.c.c)) {
                throw new h.i();
            }
            com.waze.shared_infra.i.e eVar = aqVar.f38219g;
            com.waze.sharedrive.c.c cVar = (com.waze.sharedrive.c.c) dVar;
            com.waze.sharedrive.q qVarA = cVar.a();
            Objects.toString(qVarA);
            eVar.b("Error updating active drive: ".concat(qVarA.toString()));
            bn bnVar2 = aqVar.f38221i;
            do {
                objD = bnVar2.d();
                qVarD = (r) objD;
                if (qVarD instanceof q) {
                    q qVar = (q) qVarD;
                    com.waze.sharedrive.c.a.q qVarA2 = qVar.a();
                    com.waze.sharedrive.q qVarA3 = cVar.a();
                    h.g.b.x.f(qVarA2, "<this>");
                    h.g.b.x.f(qVarA3, "error");
                    qVarD = q.d(qVar, new com.waze.sharedrive.c.a.n(qVarA2.b(), qVarA3), false, null, 6);
                }
            } while (!bnVar2.f(objD, qVarD));
            return;
        }
        bn bnVar3 = aqVar.f38221i;
        do {
            objD3 = bnVar3.d();
            qVarD2 = (r) objD3;
            q qVar2 = qVarD2 instanceof q ? (q) qVarD2 : null;
            if (qVar2 == null || !qVar2.c()) {
                com.waze.shared_infra.i.e eVar2 = aqVar.f38219g;
                if (qVarD2 != null) {
                    int i2 = h.g.b.ar.f48106a;
                    strC = new h.g.b.m(qVarD2.getClass()).c();
                } else {
                    strC = null;
                }
                eVar2.g("DriveUpdated event received but state is not LiveDrive or polling is inactive. State: " + strC + ", activePolling: " + (qVar2 != null ? Boolean.valueOf(qVar2.c()) : null));
            } else {
                aqVar.f38219g.a("Updating active share state with new shared drive details");
                com.waze.sharedrive.c.a.m mVarA = ((com.waze.sharedrive.c.b) dVar).a();
                List<com.waze.sharedrive.c.a.l> listD = mVarA.d();
                ArrayList arrayList = new ArrayList(h.a.i.q(listD, 10));
                for (com.waze.sharedrive.c.a.l lVarG : listD) {
                    Iterator it = ((com.waze.sharedrive.c.a.m) qVar2.a().b()).d().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (h.g.b.x.n(((com.waze.sharedrive.c.a.l) next).d(), lVarG.d())) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    com.waze.sharedrive.c.a.l lVar = (com.waze.sharedrive.c.a.l) next;
                    com.waze.sharedrive.c.a.q qVarC = lVar != null ? lVar.c() : null;
                    if (qVarC instanceof com.waze.sharedrive.c.a.p) {
                        lVarG = com.waze.sharedrive.c.a.l.g(lVarG, null, lVar.c(), 47);
                    } else if (!(qVarC instanceof com.waze.sharedrive.c.a.n)) {
                        if (!(qVarC instanceof com.waze.sharedrive.c.a.o) && qVarC != null) {
                            throw new h.i();
                        }
                    } else if (qVarC.b() instanceof com.waze.sharedrive.c.a.i) {
                        lVarG = com.waze.sharedrive.c.a.l.g(lVarG, null, qVarC, 47);
                    }
                    arrayList.add(lVarG);
                }
                qVarD2 = q.d(qVar2, new com.waze.sharedrive.c.a.o(com.waze.sharedrive.c.a.m.e(mVarA, arrayList)), false, null, 6);
            }
        } while (!bnVar3.f(objD3, qVarD2));
    }

    public static final /* synthetic */ void r(aq aqVar, String str, com.waze.sharedrive.q qVar) {
        bn bnVar;
        Object objD;
        r rVarE;
        do {
            bnVar = aqVar.f38221i;
            objD = bnVar.d();
            rVarE = (r) objD;
            p pVarD = bf.D(rVarE);
            if (pVarD == null || !h.g.b.x.n(pVarD.b(), str)) {
                aqVar.Q(rVarE, "fetchSharedDrive.onFailure");
            } else {
                rVarE = bf.E(rVarE, p.d(pVarD, new i(qVar), false, 5));
            }
        } while (!bnVar.f(objD, rVarE));
    }

    public static final /* synthetic */ void s(aq aqVar, String str, com.waze.sharedrive.c.a.m mVar) {
        bn bnVar;
        Object objD;
        r rVar;
        r rVarE;
        do {
            bnVar = aqVar.f38221i;
            objD = bnVar.d();
            rVar = (r) objD;
            p pVarD = bf.D(rVar);
            if (pVarD == null || !h.g.b.x.n(pVarD.b(), str)) {
                aqVar.Q(rVar, "fetchSharedDrive.onSuccess");
            } else {
                List listD = mVar.d();
                if ((listD instanceof Collection) && listD.isEmpty()) {
                    rVarE = bf.E(rVar, p.d(pVarD, new m(mVar), false, 5));
                    aqVar.f38219g.a("handleIncomingShareRequest: current state: " + bf.F(rVar) + ", new state: " + bf.F(rVarE));
                    rVar = rVarE;
                } else {
                    Iterator it = listD.iterator();
                    while (it.hasNext()) {
                        if (((com.waze.sharedrive.c.a.l) it.next()).f()) {
                            aqVar.f38219g.a("User is already a participant in this drive, transitioning to JoinedSuccessfully");
                            rVarE = bf.E(rVar, p.d(pVarD, new l(mVar), false, 5));
                            break;
                        }
                    }
                    rVarE = bf.E(rVar, p.d(pVarD, new m(mVar), false, 5));
                    aqVar.f38219g.a("handleIncomingShareRequest: current state: " + bf.F(rVar) + ", new state: " + bf.F(rVarE));
                    rVar = rVarE;
                }
            }
        } while (!bnVar.f(objD, rVar));
    }

    public static final /* synthetic */ void t(aq aqVar, String str, com.waze.sharedrive.c.a.m mVar, com.waze.sharedrive.q qVar) {
        bn bnVar;
        Object objD;
        r rVarE;
        do {
            bnVar = aqVar.f38221i;
            objD = bnVar.d();
            rVarE = (r) objD;
            p pVarD = bf.D(rVarE);
            if (pVarD == null || !h.g.b.x.n(pVarD.b(), str)) {
                aqVar.Q(rVarE, "onJoinFailure");
            } else if (h.g.b.x.n(qVar, com.waze.sharedrive.k.f38761a)) {
                aqVar.f38219g.g("onJoinFailure: AlreadyExists error received, transitioning to JoinedSuccessfully");
                rVarE = bf.E(rVarE, p.d(pVarD, new l(mVar), false, 5));
            } else {
                rVarE = bf.E(rVarE, p.d(pVarD, new k(mVar, qVar), false, 5));
            }
        } while (!bnVar.f(objD, rVarE));
    }

    public static final /* synthetic */ void u(aq aqVar, String str, com.waze.sharedrive.c.a.m mVar) {
        bn bnVar;
        Object objD;
        r rVarE;
        do {
            bnVar = aqVar.f38221i;
            objD = bnVar.d();
            rVarE = (r) objD;
            p pVarD = bf.D(rVarE);
            if (pVarD == null || !h.g.b.x.n(pVarD.b(), str)) {
                aqVar.Q(rVarE, "onJoinSuccess");
            } else {
                rVarE = bf.E(rVarE, p.d(pVarD, new l(mVar), false, 5));
            }
        } while (!bnVar.f(objD, rVarE));
    }

    public final void A() {
        bn bnVar;
        Object objD;
        r rVar;
        do {
            bnVar = this.f38221i;
            objD = bnVar.d();
            rVar = (r) objD;
            this.f38219g.g("handleIncomingLegacyShare: moving to legacy error state. Previous state: ".concat(String.valueOf(bf.F(rVar))));
        } while (!bnVar.f(objD, bf.E(rVar, new p("", new i(com.waze.sharedrive.p.f38766a), this.f38214b.c()))));
    }

    public final void B(String str) {
        Object objD;
        Object objD2;
        r rVar;
        r rVarE;
        boolean zC = this.f38214b.c();
        String str2 = str;
        if (str2 == null || h.n.o.G(str2)) {
            this.f38219g.g("handleIncomingShareRequest: token is null or blank, moving to error state");
            bn bnVar = this.f38221i;
            do {
                objD = bnVar.d();
            } while (!bnVar.f(objD, bf.E((r) objD, new p("", new i(com.waze.sharedrive.p.f38766a), zC))));
            return;
        }
        bn bnVar2 = this.f38221i;
        do {
            objD2 = bnVar2.d();
            rVar = (r) objD2;
            p pVarD = rVar != null ? bf.D(rVar) : null;
            if (h.g.b.x.n(pVarD != null ? pVarD.b() : null, str) && (pVarD.a() instanceof j)) {
                this.f38219g.g("handleIncomingShareRequest: already fetching details for token: ".concat(String.valueOf(str)));
                rVarE = rVar;
            } else {
                rVarE = bf.E(rVar, new p(str, j.f38248a, zC));
            }
        } while (!bnVar2.f(objD2, rVarE));
        p pVarD2 = rVar != null ? bf.D(rVar) : null;
        if (h.g.b.x.n(pVarD2 != null ? pVarD2.b() : null, str) && (pVarD2.a() instanceof j)) {
            return;
        }
        R(this.f38224l, new v(this, str, (h.c.e) null, 1, (byte[]) null));
    }

    public final void C() {
        bn bnVar;
        Object objD;
        r rVarE;
        this.f38219g.a("joinShareErrorHandled: clearing join error state");
        do {
            bnVar = this.f38221i;
            objD = bnVar.d();
            rVarE = (r) objD;
            p pVarD = bf.D(rVarE);
            if (pVarD != null) {
                m mVarA = pVarD.a();
                if (mVarA instanceof i) {
                    mVarA = null;
                } else if (mVarA instanceof k) {
                    mVarA = new m(((k) mVarA).b());
                }
                rVarE = bf.E(rVarE, mVarA != null ? p.d(pVarD, mVarA, false, 5) : null);
            }
        } while (!bnVar.f(objD, rVarE));
    }

    public final void D() {
        bn bnVar;
        Object objD;
        r rVar;
        p pVarD;
        p pVarD2;
        com.waze.sharedrive.c.a.m mVarB;
        com.waze.sharedrive.c.a.m mVarB2;
        do {
            bnVar = this.f38221i;
            objD = bnVar.d();
            rVar = (r) objD;
            pVarD = bf.D(rVar);
        } while (!bnVar.f(objD, (pVarD == null || (mVarB2 = bf.B(pVarD)) == null || (pVarD.a() instanceof n)) ? rVar : bf.E(rVar, p.d(pVarD, new n(mVarB2), false, 5))));
        if (rVar == null || (pVarD2 = bf.D(rVar)) == null || (mVarB = bf.B(pVarD2)) == null) {
            return;
        }
        if (pVarD2.a() instanceof n) {
            this.f38219g.g("joinSharedDrive: already requesting");
        } else {
            R(this.f38224l, new u(this, pVarD2, mVarB, (h.c.e) null, 0));
        }
    }

    public final void E() {
        bn bnVar;
        Object objD;
        q qVar;
        this.f38219g.a("joinSuccessHandled: moving to LiveDrive state");
        do {
            bnVar = this.f38221i;
            objD = bnVar.d();
            qVar = (r) objD;
            p pVarD = bf.D(qVar);
            if ((pVarD != null ? pVarD.a() : null) instanceof l) {
                qVar = new q(new com.waze.sharedrive.c.a.o(((l) pVarD.a()).a()));
            } else {
                Q(qVar, "joinSuccessHandled");
            }
        } while (!bnVar.f(objD, qVar));
    }

    public final void F() {
        bn bnVar;
        Object objD;
        r rVar;
        boolean z;
        q qVar;
        com.waze.sharedrive.c.a.q qVarA;
        com.waze.sharedrive.c.a.m mVar;
        com.waze.sharedrive.c.a.q qVarA2;
        com.waze.sharedrive.c.a.m mVar2;
        do {
            bnVar = this.f38221i;
            objD = bnVar.d();
            rVar = (r) objD;
            z = rVar instanceof q;
            qVar = z ? (q) rVar : null;
        } while (!bnVar.f(objD, ((qVar == null || (qVarA2 = qVar.a()) == null || (mVar2 = (com.waze.sharedrive.c.a.m) qVarA2.b()) == null) ? null : mVar2.b()) != null ? qVar.b() : rVar));
        q qVar2 = z ? (q) rVar : null;
        String strB = (qVar2 == null || (qVarA = qVar2.a()) == null || (mVar = (com.waze.sharedrive.c.a.m) qVarA.b()) == null) ? null : mVar.b();
        if (strB != null) {
            R(this.f38224l, new v(this, strB, (h.c.e) null, 0));
        }
    }

    public final void G() {
        bn bnVar;
        Object objD;
        q qVarD;
        do {
            bnVar = this.f38221i;
            objD = bnVar.d();
            qVarD = (r) objD;
            if (qVarD instanceof q) {
                q qVar = (q) qVarD;
                qVarD = q.d(qVar, new com.waze.sharedrive.c.a.p(com.waze.sharedrive.c.a.m.e((com.waze.sharedrive.c.a.m) qVar.a().b(), h.a.i.j(bf.A(qVar)))), false, null, 6);
            } else {
                Q(qVarD, "resetLiveDriveToLoading");
            }
        } while (!bnVar.f(objD, qVarD));
    }

    public final void H(boolean z) {
        bn bnVar;
        Object objD;
        r rVarE;
        do {
            bnVar = this.f38221i;
            objD = bnVar.d();
            rVarE = (r) objD;
            p pVarD = bf.D(rVarE);
            if ((pVarD != null ? pVarD.a() : null) instanceof m) {
                rVarE = bf.E(rVarE, p.d(pVarD, null, z, 3));
            } else {
                this.f38219g.g("setLocationSharingEnabled called while in unexpected state: ".concat(String.valueOf(bf.F(rVarE))));
            }
        } while (!bnVar.f(objD, rVarE));
    }

    public final void I() {
        bn bnVar;
        Object objD;
        r rVar;
        do {
            bnVar = this.f38221i;
            objD = bnVar.d();
            rVar = (r) objD;
            if (rVar instanceof h) {
                rVar = null;
            } else {
                Q(rVar, "shareEndedHandled");
            }
        } while (!bnVar.f(objD, rVar));
    }

    public final void J() {
        Object objD;
        g gVar;
        dg dgVar = this.f38215c;
        com.waze.av.b.n nVar = (com.waze.av.b.n) dgVar.ad().d();
        Integer numV = et.v(dgVar);
        if (nVar == null || numV == null) {
            this.f38219g.g("Cannot start create share: Destination missing=" + (nVar == null) + ", eta missing=" + (numV == null));
            return;
        }
        bn bnVar = this.f38221i;
        do {
            objD = bnVar.d();
            gVar = (r) objD;
            if (gVar == null || (gVar instanceof h)) {
                Object objD2 = this.f38217e.f().d();
                h.g.b.x.e(objD2, "<get-value>(...)");
                UserProfile userProfile = (UserProfile) objD2;
                int iIntValue = numV.intValue();
                com.waze.av.a.a aVarB = nVar.e().b();
                String strH = com.waze.nightmode.e.h(aVarB.c(), aVarB.f(), aVarB.a(), null, null);
                String strC = nVar.e().c().c();
                if (strC == null || h.n.o.G(strC)) {
                    strC = null;
                }
                String strE = nVar.e().c().e();
                if (strE == null || h.n.o.G(strE)) {
                    strE = null;
                }
                if (strH == null || h.n.o.G(strH)) {
                    strH = null;
                }
                com.waze.sharedrive.c.a.b bVar = new com.waze.sharedrive.c.a.b(strC, strE, strH, nVar.e().d());
                Instant instantPlusSeconds = Instant.now().plusSeconds(iIntValue * 60);
                h.g.b.x.e(instantPlusSeconds, "plusSeconds(...)");
                com.waze.sharedrive.c.a.d cVar = !h.n.o.G(userProfile.getSocialInfo().getImageUrl()) ? new com.waze.sharedrive.c.a.c(userProfile.getSocialInfo().getImageUrl()) : new com.waze.sharedrive.c.a.d(userProfile.getSocialInfo().getMoodId());
                com.waze.sharedrive.c.a.g gVar2 = new com.waze.sharedrive.c.a.g(instantPlusSeconds);
                com.waze.sharedrive.c.a.g gVar3 = gVar2;
                String firstName = userProfile.getBasicInfo().getFirstName();
                if (true == h.n.o.G(firstName)) {
                    firstName = null;
                }
                if (firstName == null) {
                    firstName = userProfile.getBasicInfo().getUserName();
                    if (h.n.o.G(firstName)) {
                        firstName = null;
                    }
                }
                com.waze.sharedui.e.c cVarA = this.f38216d.a();
                gVar = new g(com.waze.sharedrive.a.s.j(gVar3, firstName, cVar, cVarA != null ? cVarA.f() : null), gVar2, bVar, null);
            } else if (gVar instanceof q) {
                q qVar = (q) gVar;
                com.waze.sharedrive.c.a.q qVarA = qVar.a();
                h.g.b.x.f(qVarA, "<this>");
                gVar = q.d(qVar, new com.waze.sharedrive.c.a.p(qVarA.b()), false, null, 6);
            } else {
                Q(gVar, "startCreateShare");
            }
        } while (!bnVar.f(objD, gVar));
    }

    public final void K() {
        bn bnVar;
        Object objD;
        q qVarD;
        do {
            bnVar = this.f38221i;
            objD = bnVar.d();
            qVarD = (r) objD;
            if (qVarD instanceof q) {
                qVarD = q.d((q) qVarD, null, true, null, 5);
            } else {
                Q(qVarD, "startPolling");
            }
        } while (!bnVar.f(objD, qVarD));
    }

    public final void L() {
        bn bnVar;
        Object objD;
        q qVarD;
        do {
            bnVar = this.f38221i;
            objD = bnVar.d();
            qVarD = (r) objD;
            if (qVarD instanceof q) {
                qVarD = q.d((q) qVarD, null, false, null, 5);
            } else {
                Q(qVarD, "stopPolling");
            }
        } while (!bnVar.f(objD, qVarD));
    }

    public final boolean M() {
        Object next;
        r rVar = (r) this.f38221i.d();
        if (!(rVar instanceof q)) {
            return false;
        }
        Iterator it = ((com.waze.sharedrive.c.a.m) ((q) rVar).a().b()).d().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((com.waze.sharedrive.c.a.l) next).f()) {
                break;
            }
        }
        com.waze.sharedrive.c.a.l lVar = (com.waze.sharedrive.c.a.l) next;
        if (lVar == null) {
            return false;
        }
        com.waze.sharedrive.c.a.k kVar = (com.waze.sharedrive.c.a.k) lVar.c().b();
        if (kVar instanceof com.waze.sharedrive.c.a.h) {
            return true;
        }
        return (kVar instanceof com.waze.sharedrive.c.a.j) && ((com.waze.sharedrive.c.a.j) kVar).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e8 A[Catch: all -> 0x0062, TryCatch #1 {all -> 0x0062, blocks: (B:21:0x005b, B:37:0x00cb, B:39:0x00cf, B:41:0x00d5, B:43:0x00db, B:45:0x00e8, B:46:0x00ee), top: B:68:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ee A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #1 {all -> 0x0062, blocks: (B:21:0x005b, B:37:0x00cb, B:39:0x00cf, B:41:0x00d5, B:43:0x00db, B:45:0x00e8, B:46:0x00ee), top: B:68:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0110 A[Catch: all -> 0x0040, TRY_ENTER, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:49:0x0106, B:52:0x0110, B:57:0x014c, B:53:0x0123, B:55:0x0134, B:56:0x0136), top: B:66:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0123 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:49:0x0106, B:52:0x0110, B:57:0x014c, B:53:0x0123, B:55:0x0134, B:56:0x0136), top: B:66:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r11, j$.time.Instant r12, h.c.e r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedrive.d.aq.j(java.lang.String, j$.time.Instant, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fb, code lost:
    
        if (r13 == r1) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(boolean r14, h.c.e r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedrive.d.aq.k(boolean, h.c.e):java.lang.Object");
    }

    public final ch n() {
        return this.f38222j;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v() {
        /*
            r8 = this;
        L0:
            kotlinx.coroutines.b.bn r0 = r8.f38221i
            java.lang.Object r1 = r0.d()
            r3 = r1
            com.waze.sharedrive.d.r r3 = (com.waze.sharedrive.d.r) r3
            boolean r2 = r3 instanceof com.waze.sharedrive.d.g
            if (r2 == 0) goto L21
            r4 = r3
            com.waze.sharedrive.d.g r4 = (com.waze.sharedrive.d.g) r4
            com.waze.sharedrive.d.f r5 = r4.d()
            if (r5 != 0) goto L21
            com.waze.sharedrive.d.d r5 = com.waze.sharedrive.d.d.f38240a
            com.waze.sharedrive.d.f r5 = (com.waze.sharedrive.d.f) r5
            com.waze.sharedrive.d.g r4 = com.waze.sharedrive.d.g.e(r4, r5)
            com.waze.sharedrive.d.r r4 = (com.waze.sharedrive.d.r) r4
            goto L22
        L21:
            r4 = r3
        L22:
            boolean r1 = r0.f(r1, r4)
            if (r1 == 0) goto L0
            if (r2 == 0) goto L93
            r1 = r3
            com.waze.sharedrive.d.g r1 = (com.waze.sharedrive.d.g) r1
            com.waze.sharedrive.d.f r2 = r1.d()
            if (r2 == 0) goto L3c
            com.waze.sharedrive.d.f r0 = r1.d()
            boolean r0 = r0 instanceof com.waze.sharedrive.d.d
            if (r0 != 0) goto L7b
            goto L93
        L3c:
            com.waze.navigate.dg r1 = r8.f38215c
            kotlinx.coroutines.b.ch r1 = r1.Z()
            java.lang.Object r1 = r1.d()
            com.waze.modules.c.eb r1 = (com.waze.modules.c.eb) r1
            java.lang.String r5 = com.waze.gas.a.d(r1)
            com.waze.shared_infra.i.e r1 = r8.f38219g
            if (r5 != 0) goto L7c
            java.lang.String r8 = "Cannot approve create share: routeUuid is missing"
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r1.g(r8)
        L57:
            java.lang.Object r8 = r0.d()
            r1 = r8
            com.waze.sharedrive.d.r r1 = (com.waze.sharedrive.d.r) r1
            boolean r2 = r1 instanceof com.waze.sharedrive.d.g
            if (r2 == 0) goto L75
            com.waze.sharedrive.d.g r1 = (com.waze.sharedrive.d.g) r1
            com.waze.sharedrive.d.c r2 = new com.waze.sharedrive.d.c
            com.waze.sharedrive.o r3 = com.waze.sharedrive.o.f38765a
            com.waze.sharedrive.q r3 = (com.waze.sharedrive.q) r3
            r2.<init>(r3)
            com.waze.sharedrive.d.f r2 = (com.waze.sharedrive.d.f) r2
            com.waze.sharedrive.d.g r1 = com.waze.sharedrive.d.g.e(r1, r2)
            com.waze.sharedrive.d.r r1 = (com.waze.sharedrive.d.r) r1
        L75:
            boolean r8 = r0.f(r8, r1)
            if (r8 == 0) goto L57
        L7b:
            return
        L7c:
            java.lang.String r0 = "User approved sharing, let's try to create the share"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.a(r0)
            kotlinx.coroutines.af r0 = r8.f38224l
            com.waze.sharedrive.d.u r2 = new com.waze.sharedrive.d.u
            r6 = 0
            r7 = 1
            r4 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            h.g.a.p r2 = (h.g.a.p) r2
            r4.R(r0, r2)
            return
        L93:
            r4 = r8
            java.lang.String r8 = "approveCreateShare"
            r4.Q(r3, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedrive.d.aq.v():void");
    }

    public final void w() {
        bn bnVar;
        Object objD;
        r rVar;
        do {
            bnVar = this.f38221i;
            objD = bnVar.d();
            rVar = (r) objD;
            if (rVar instanceof g) {
                rVar = null;
            } else {
                Q(rVar, "cancelCreateShare");
            }
        } while (!bnVar.f(objD, rVar));
    }

    public final void x() {
        bn bnVar;
        Object objD;
        do {
            bnVar = this.f38221i;
            objD = bnVar.d();
        } while (!bnVar.f(objD, bf.E((r) objD, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y() {
        /*
            r5 = this;
        L0:
            kotlinx.coroutines.b.bn r0 = r5.f38221i
            java.lang.Object r1 = r0.d()
            r2 = r1
            com.waze.sharedrive.d.r r2 = (com.waze.sharedrive.d.r) r2
            boolean r3 = r2 instanceof com.waze.sharedrive.d.g
            if (r3 == 0) goto L20
            r3 = r2
            com.waze.sharedrive.d.g r3 = (com.waze.sharedrive.d.g) r3
            com.waze.sharedrive.d.f r4 = r3.d()
            boolean r4 = r4 instanceof com.waze.sharedrive.d.c
            if (r4 == 0) goto L20
            r2 = 0
            com.waze.sharedrive.d.g r2 = com.waze.sharedrive.d.g.e(r3, r2)
            com.waze.sharedrive.d.r r2 = (com.waze.sharedrive.d.r) r2
            goto L25
        L20:
            java.lang.String r3 = "createShareErrorHandled"
            r5.Q(r2, r3)
        L25:
            boolean r0 = r0.f(r1, r2)
            if (r0 == 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedrive.d.aq.y():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z() {
        /*
            r5 = this;
        L0:
            kotlinx.coroutines.b.bn r0 = r5.f38221i
            java.lang.Object r1 = r0.d()
            r2 = r1
            com.waze.sharedrive.d.r r2 = (com.waze.sharedrive.d.r) r2
            boolean r3 = r2 instanceof com.waze.sharedrive.d.g
            if (r3 == 0) goto L31
            r3 = r2
            com.waze.sharedrive.d.g r3 = (com.waze.sharedrive.d.g) r3
            com.waze.sharedrive.d.f r4 = r3.d()
            boolean r4 = r4 instanceof com.waze.sharedrive.d.e
            if (r4 == 0) goto L31
            com.waze.sharedrive.d.q r2 = new com.waze.sharedrive.d.q
            com.waze.sharedrive.c.a.o r4 = new com.waze.sharedrive.c.a.o
            com.waze.sharedrive.d.f r3 = r3.d()
            com.waze.sharedrive.d.e r3 = (com.waze.sharedrive.d.e) r3
            com.waze.sharedrive.c.a.m r3 = r3.a()
            r4.<init>(r3)
            com.waze.sharedrive.c.a.q r4 = (com.waze.sharedrive.c.a.q) r4
            r2.<init>(r4)
            com.waze.sharedrive.d.r r2 = (com.waze.sharedrive.d.r) r2
            goto L36
        L31:
            java.lang.String r3 = "createShareSuccessHandled"
            r5.Q(r2, r3)
        L36:
            boolean r0 = r0.f(r1, r2)
            if (r0 == 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedrive.d.aq.z():void");
    }
}
