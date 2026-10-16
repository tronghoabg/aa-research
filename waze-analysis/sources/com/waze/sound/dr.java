package com.waze.sound;

import com.waze.navigate.NavigationInfoNativeManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dr {

    /* renamed from: a, reason: collision with root package name */
    private final em f39807a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f39808b;

    /* renamed from: c, reason: collision with root package name */
    private final dd f39809c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.navigate.cr f39810d;

    /* renamed from: e, reason: collision with root package name */
    private final bs f39811e;

    /* renamed from: f, reason: collision with root package name */
    private final fm f39812f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.sharedui.e.g f39813g;

    /* renamed from: h, reason: collision with root package name */
    private final NavigationInfoNativeManager f39814h;

    /* renamed from: i, reason: collision with root package name */
    private final eb f39815i;

    /* renamed from: j, reason: collision with root package name */
    private final co f39816j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.sound.f.j f39817k;

    /* renamed from: l, reason: collision with root package name */
    private final bm f39818l;
    private final VoicesNativeManager m;
    private final com.waze.navigate.dg n;
    private final kotlinx.coroutines.b.bn o;
    private final Set p;
    private bv q;
    private List r;
    private final kotlinx.coroutines.af s;
    private Integer t;
    private an u;
    private final bl v;

    public dr(em emVar, com.waze.shared_infra.i.e eVar, dd ddVar, com.waze.navigate.cr crVar, bs bsVar, fm fmVar, bl blVar, com.waze.sharedui.e.g gVar, NavigationInfoNativeManager navigationInfoNativeManager, eb ebVar, co coVar, com.waze.sound.f.j jVar, bm bmVar, VoicesNativeManager voicesNativeManager, com.waze.navigate.dg dgVar, kotlinx.coroutines.ab abVar) {
        h.g.b.x.f(emVar, "config");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(ddVar, "routeInstructionVoicesRepository");
        h.g.b.x.f(crVar, "instructionStateInterface");
        h.g.b.x.f(bsVar, "guidanceModeRepository");
        h.g.b.x.f(fmVar, "soundPlayer");
        h.g.b.x.f(blVar, "speechDistanceRangeCalculator");
        h.g.b.x.f(gVar, "wazeLocationService");
        h.g.b.x.f(navigationInfoNativeManager, "navigationInfoNativeManager");
        h.g.b.x.f(ebVar, "routeInstructionsVoiceAssetsRepository");
        h.g.b.x.f(coVar, "promptPlayingUseCase");
        h.g.b.x.f(jVar, "voiceStatsSender");
        h.g.b.x.f(bmVar, "guidanceConnectivityStatusProvider");
        h.g.b.x.f(voicesNativeManager, "voicesNativeManager");
        h.g.b.x.f(dgVar, "navigationInfoInterface");
        h.g.b.x.f(abVar, "ioDispatcher");
        this.f39807a = emVar;
        this.f39808b = eVar;
        this.f39809c = ddVar;
        this.f39810d = crVar;
        this.f39811e = bsVar;
        this.f39812f = fmVar;
        this.v = blVar;
        this.f39813g = gVar;
        this.f39814h = navigationInfoNativeManager;
        this.f39815i = ebVar;
        this.f39816j = coVar;
        this.f39817k = jVar;
        this.f39818l = bmVar;
        this.m = voicesNativeManager;
        this.n = dgVar;
        this.o = kotlinx.coroutines.b.ck.b(null);
        this.p = new LinkedHashSet();
        this.q = bv.f39578b;
        this.r = new ArrayList();
        this.s = kotlinx.coroutines.aj.e(abVar);
    }

    static /* synthetic */ Object A(dr drVar, jo joVar, h.c.e eVar) {
        return drVar.E(joVar, false, eVar);
    }

    static /* synthetic */ void C(dr drVar, ak akVar) {
        drVar.L(akVar, new com.waze.settings.ao(19));
    }

    static /* synthetic */ void D(dr drVar, int i2, int i3, int i4, long j2, List list, List list2, Long l2, int i5) {
        com.waze.sound.f.i iVar;
        bp bpVar = (bp) drVar.f39811e.b().d();
        bp bpVar2 = bp.f39554a;
        int iOrdinal = bpVar.ordinal();
        if (iOrdinal == 0) {
            iVar = com.waze.sound.f.i.f39999b;
        } else if (iOrdinal == 1) {
            iVar = com.waze.sound.f.i.f39998a;
        } else if (iOrdinal == 2) {
            iVar = com.waze.sound.f.i.f40000c;
        } else {
            if (iOrdinal != 3 && iOrdinal != 4) {
                throw new h.i();
            }
            drVar.f39808b.b("Unexpected guidance mode: " + bpVar.a() + ". Using full mode.");
            iVar = com.waze.sound.f.i.f39999b;
        }
        com.waze.sound.f.i iVar2 = iVar;
        com.waze.sound.f.j jVar = drVar.f39817k;
        dw dwVar = (dw) drVar.f39809c.k().d();
        jVar.e(dwVar != null ? dwVar.b() : null, i2, j2, iVar2, i4, i3, (i5 & 16) != 0 ? null : list, drVar.f39813g.a() != null ? Long.valueOf(r0.e()) : null, (i5 & 32) != 0 ? null : list2, l2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if (r10 != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        if (r10 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(com.waze.sound.jo r8, boolean r9, h.c.e r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.waze.sound.dh
            if (r0 == 0) goto L13
            r0 = r10
            com.waze.sound.dh r0 = (com.waze.sound.dh) r0
            int r1 = r0.f39772d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39772d = r1
            goto L18
        L13:
            com.waze.sound.dh r0 = new com.waze.sound.dh
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f39770b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f39772d
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            e.b.c.b(r10)
            goto L8c
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            e.b.c.b(r10)
            goto L6c
        L3a:
            java.lang.Object r8 = r0.f39769a
            com.waze.sound.jo r8 = (com.waze.sound.jo) r8
            e.b.c.b(r10)
            goto L58
        L42:
            e.b.c.b(r10)
            com.waze.navigate.NavigationInfoNativeManager r10 = r7.f39814h
            if (r9 == 0) goto L7f
            int r9 = r8.a()
            r0.f39769a = r8
            r0.f39772d = r5
            java.lang.Object r10 = com.waze.sound.fb.e(r10, r9, r0)
            if (r10 != r1) goto L58
            goto L8b
        L58:
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 != 0) goto L8e
            com.waze.navigate.NavigationInfoNativeManager r9 = r7.f39814h
            int r8 = r8.a()
            r0.f39769a = r6
            r0.f39772d = r4
            java.lang.Object r10 = com.waze.sound.fb.d(r9, r8, r0)
            if (r10 == r1) goto L8b
        L6c:
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 == 0) goto L7d
            java.lang.Number r10 = (java.lang.Number) r10
            int r8 = r10.intValue()
            int r8 = -r8
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r8)
            goto L8e
        L7d:
            r10 = r6
            goto L8e
        L7f:
            int r8 = r8.a()
            r0.f39772d = r3
            java.lang.Object r10 = com.waze.sound.fb.e(r10, r8, r0)
            if (r10 != r1) goto L8c
        L8b:
            return r1
        L8c:
            java.lang.Integer r10 = (java.lang.Integer) r10
        L8e:
            if (r10 == 0) goto Laa
            int r8 = r10.intValue()
            java.lang.Integer r7 = r7.t
            if (r7 == 0) goto L9d
            int r7 = r7.intValue()
            goto La0
        L9d:
            r7 = 2147483647(0x7fffffff, float:NaN)
        La0:
            int r7 = java.lang.Math.min(r8, r7)
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r7)
            return r8
        Laa:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.dr.E(com.waze.sound.jo, boolean, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object F(h.c.e eVar) {
        if (this.p.isEmpty()) {
            Object objD = co.d(this.f39816j, ck.f39670a, eVar);
            return objD == h.c.a.a.f48038a ? objD : h.ab.f48028a;
        }
        this.f39808b.a("Skipping playing default start announcement because we already played an announcement");
        return h.ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(com.waze.sound.ak r12, com.waze.sound.jo r13, h.c.e r14) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.dr.G(com.waze.sound.ak, com.waze.sound.jo, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List H(jo joVar) {
        List listB;
        if (this.q == bv.f39577a) {
            jn jnVar = joVar instanceof jn ? (jn) joVar : null;
            jm jmVarD = jnVar != null ? jnVar.d() : null;
            if (jmVarD == null || (listB = jmVarD.b()) == null) {
                listB = joVar.b();
            }
        } else {
            listB = joVar.b();
        }
        return h.a.i.al(listB, new com.waze.car_lib.r.d.k(7));
    }

    private final void I(Map map, int i2) throws IOException {
        Object next;
        kotlinx.coroutines.b.bn bnVar = this.o;
        jo joVar = (jo) bnVar.d();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Number) ((Map.Entry) next).getKey()).intValue() >= i2) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) next;
        bnVar.e(entry != null ? (jo) entry.getValue() : null);
        if (h.g.b.x.n(joVar, bnVar.d())) {
            return;
        }
        jo joVar2 = (jo) bnVar.d();
        if (joVar2 == null) {
            this.f39808b.g("No more instructions to play");
            this.r = new ArrayList();
            return;
        }
        this.r = h.a.i.aq(H(joVar2));
        this.f39808b.a("Next instruction set to segment " + joVar2.a() + ". Distances to play: " + h.a.i.aM(this.r, ",", null, null, 0, new com.waze.settings.bq(7), 30));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(boolean z) {
        this.f39808b.a("Clearing state: stopAudio=" + z);
        if (z) {
            this.f39812f.e();
        }
        this.f39815i.l();
        kg.clearInstructionSegmentToPlayAndThen$default(this.m, null, 1, null);
        this.p.clear();
        this.u = null;
    }

    private final void K(gr grVar) {
        kotlinx.coroutines.aj.z(this.s, null, null, new dz(grVar, this, (h.c.e) null, 1), 3);
    }

    private final void L(ak akVar, h.g.a.a aVar) {
        Objects.toString(akVar);
        this.f39808b.a("Playing chunk ".concat(String.valueOf(akVar)));
        com.waze.sharedui.e.e.h(this.f39812f, akVar.c(), akVar.a(), aVar, 12);
    }

    private final void M(al alVar, h.g.a.a aVar) {
        List listE = alVar.e();
        Objects.toString(listE);
        this.f39808b.a("Playing local announcement: ".concat(listE.toString()));
        kotlinx.coroutines.aj.z(this.s, null, null, new hk(this, alVar, aVar, (h.c.e) null, 1), 3);
    }

    private final void N(ap apVar, h.g.a.a aVar) {
        if (apVar.a().isEmpty()) {
            aVar.invoke();
            return;
        }
        int i2 = 0;
        for (Object obj : apVar.a()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                h.a.i.p();
            }
            ak akVar = (ak) obj;
            if (i2 == h.a.i.e(apVar.a())) {
                L(akVar, aVar);
            } else {
                C(this, akVar);
            }
            i2 = i3;
        }
    }

    private final void O(long j2, long j3, jo joVar) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j2;
        dw dwVar = (dw) this.f39809c.k().d();
        kotlinx.coroutines.aj.z(this.s, null, null, new dp(this, joVar, dwVar != null ? dwVar.b() : null, j3, jCurrentTimeMillis, null), 3);
    }

    private final void P(int i2, int i3, int i4, long j2, List list, Long l2) {
        D(this, i2, i3, i4, j2, null, list, l2, 16);
    }

    private final void Q(int i2, int i3, int i4, long j2, List list, Long l2) {
        D(this, i2, i3, i4, j2, list, null, l2, 32);
    }

    private final void R(List list) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h.a.i.aD(arrayList, ((jo) it.next()).b());
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (((an) next).g()) {
                    break;
                }
            }
        }
        an anVar = (an) next;
        this.u = anVar;
        com.waze.shared_infra.i.e eVar = this.f39808b;
        Objects.toString(anVar);
        eVar.a("Destination announcement set to ".concat(String.valueOf(anVar)));
    }

    private final boolean S(an anVar, String str, int i2) {
        com.waze.sharedui.e.c cVarA = this.f39813g.a();
        if (cVarA == null) {
            this.f39808b.b("Current location is null. Not playing phrase ".concat(str));
            return false;
        }
        boolean z = anVar instanceof am;
        int iE = cVarA.e();
        if (!z) {
            if (!(anVar instanceof al)) {
                throw new h.i();
            }
            gn gnVarD = ((al) anVar).d();
            if (!(gnVarD instanceof gm)) {
                if (!(gnVarD instanceof gl)) {
                    throw new h.i();
                }
                if (iE <= 70) {
                    this.f39808b.a("Not playing announcement " + anVar.b() + " because speed constraint for segment is not met. Current speed: " + iE + " km/h");
                    return false;
                }
            }
        }
        h.k.j jVarB = this.v.b(str, anVar.a(), iE, anVar.c());
        this.f39808b.a("Checking if to play announcement: " + anVar.b() + " phrase: " + str + ". distanceRangeToAnnounce: " + jVarB + ". distanceToNextInstruction: " + i2 + ". distanceMeters from backend " + anVar.a() + ". currentSpeedKmph: " + iE + ". Distance to destination: " + this.t);
        return i2 <= jVarB.b() && jVarB.a() <= i2;
    }

    private static final long T(String str) {
        return h.o.a.m(bl.c(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008f, code lost:
    
        if (r6.F(r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00da, code lost:
    
        if (r6.F(r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0100, code lost:
    
        if (r8 == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0126, code lost:
    
        if (r6.F(r0) != r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object k(com.waze.sound.dr r6, com.waze.sound.go r7, h.c.e r8) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.dr.k(com.waze.sound.dr, com.waze.sound.go, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object l(final com.waze.sound.dr r25, java.util.Map r26, java.lang.Integer r27, java.lang.Integer r28, java.lang.String r29, h.c.e r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.dr.l(com.waze.sound.dr, java.util.Map, java.lang.Integer, java.lang.Integer, java.lang.String, h.c.e):java.lang.Object");
    }

    static final h.ab o(dr drVar, long j2, al alVar, jo joVar) {
        drVar.O(j2, alVar.b(), joVar);
        return h.ab.f48028a;
    }

    static final h.ab p(dr drVar, long j2, am amVar, jo joVar) {
        drVar.O(j2, amVar.b(), joVar);
        return h.ab.f48028a;
    }

    public static final /* synthetic */ void r(dr drVar, du duVar) {
        drVar.f39808b.a("Handling local instructions");
        drVar.J(true);
        drVar.K(duVar.a());
        drVar.R(h.a.i.ao(duVar.c().values()));
    }

    public static final /* synthetic */ void s(dr drVar, du duVar) throws IOException {
        drVar.J(true);
        drVar.f39808b.g("New route instructions received. Generating new TTS voice assets.");
        drVar.K(duVar.a());
        drVar.I(duVar.c(), 0);
        Collection collectionValues = duVar.c().values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (obj instanceof jn) {
                arrayList.add(obj);
            }
        }
        drVar.f39815i.m(arrayList, duVar.b());
        drVar.R(h.a.i.ao(duVar.c().values()));
    }

    public static final /* synthetic */ void t(dr drVar, String str) {
        drVar.f39808b.a("Reached destination. Attempting to play destination announcement");
        an anVar = drVar.u;
        if (anVar == null) {
            drVar.f39808b.b("Destination announcement is null");
        } else if (anVar instanceof am) {
            ap apVarB = drVar.f39815i.b(anVar, str);
            if (apVarB != null) {
                drVar.N(apVarB, new com.waze.settings.ao(20));
                drVar.Q(-1, 0, 0, anVar.b(), apVarB.a(), null);
            } else {
                com.waze.shared_infra.i.e eVar = drVar.f39808b;
                an anVar2 = drVar.u;
                Objects.toString(anVar2);
                eVar.b("Failed to fetch voice asset for destination announcement ".concat(String.valueOf(anVar2)));
            }
        } else {
            if (!(anVar instanceof al)) {
                throw new h.i();
            }
            al alVar = (al) anVar;
            drVar.M(alVar, new en(1));
            drVar.P(-1, 0, 0, alVar.b(), alVar.e(), null);
        }
        drVar.J(false);
    }

    public final kotlinx.coroutines.b.bn q() {
        return this.o;
    }

    public final void x() {
        bi biVar = new bi(this, (h.c.e) null, 7, (char[]) null);
        kotlinx.coroutines.af afVar = this.s;
        kotlinx.coroutines.aj.z(afVar, null, null, biVar, 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new bi(this, (h.c.e) null, 8, (short[]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new bi(this, (h.c.e) null, 5), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new bi(this, (h.c.e) null, 6, (byte[]) null), 3);
    }
}
