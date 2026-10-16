package defpackage;

import android.content.Context;
import android.telecom.Call;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class aabf {
    public final Object a;
    public Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public aabf(aacq aacqVar, ackk ackkVar, ackk ackkVar2) {
        zbi zbiVar;
        this.a = new AtomicBoolean(false);
        this.e = aacqVar;
        this.d = ackkVar;
        this.c = ackkVar2;
        zbi zbiVar2 = null;
        if (aacqVar.p()) {
            pyh pyhVar = (pyh) ackkVar.a();
            pyk pykVar = pyk.ac;
            zbi zbiVar3 = zbi.a;
            zbiVar = (zbi) pyhVar.r(pykVar, abnv.L(zbi.class));
        } else {
            zbiVar = null;
        }
        if (aacqVar.p()) {
            pyh pyhVar2 = (pyh) ackkVar.a();
            pyk pykVar2 = pyk.ad;
            zbi zbiVar4 = zbi.a;
            zbiVar2 = (zbi) pyhVar2.r(pykVar2, abnv.L(zbi.class));
        }
        if (zbiVar != null && zbiVar2 != null) {
            p(zbiVar, zbiVar2);
        }
        this.b = zbiVar2 == null ? zbi.a : zbiVar2;
    }

    public static int e(abcs abcsVar) {
        abnh abnhVar = abhx.a;
        abcsVar.j(abnhVar);
        abnl abnlVar = abcsVar.w;
        abnu abnuVar = abnhVar.d;
        Object objJ = abnlVar.j(abnuVar);
        if ((((abii) (objJ == null ? abnhVar.b : abnhVar.c(objJ))).b & 16) == 0) {
            return 0;
        }
        abcsVar.j(abnhVar);
        Object objJ2 = abcsVar.w.j(abnuVar);
        abig abigVar = ((abii) (objJ2 == null ? abnhVar.b : abnhVar.c(objJ2))).h;
        if (abigVar == null) {
            abigVar = abig.a;
        }
        if ((abigVar.b & 2) == 0) {
            return 0;
        }
        abcsVar.j(abnhVar);
        Object objJ3 = abcsVar.w.j(abnuVar);
        abig abigVar2 = ((abii) (objJ3 == null ? abnhVar.b : abnhVar.c(objJ3))).h;
        if (abigVar2 == null) {
            abigVar2 = abig.a;
        }
        return abigVar2.c;
    }

    private static yfy o(zbi zbiVar) {
        return yeb.d(zbiVar.b).g(new ikj(13));
    }

    private static zbi p(zbi zbiVar, zbi zbiVar2) {
        yfy yfyVarO = o(zbiVar);
        yfy yfyVarO2 = o(zbiVar2);
        abnp abnpVarN = zbi.a.n();
        yno it = yfyVarO.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (yfyVarO2.containsKey(entry.getKey())) {
                zbf zbfVar = (zbf) yfyVarO2.get(entry.getKey());
                if (zbfVar.c >= ((zbf) entry.getValue()).c) {
                    abnpVarN.P(zbfVar);
                } else {
                    abnpVarN.P((zbf) entry.getValue());
                }
            } else {
                abnpVarN.P((zbf) entry.getValue());
            }
        }
        yno it2 = yfyVarO2.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            if (!yfyVarO.containsKey(entry2.getKey())) {
                abnpVarN.P((zbf) entry2.getValue());
            }
        }
        return (zbi) abnpVarN.q();
    }

    public final void a() {
        ((zrt) this.a).a();
        this.b = null;
        ((twj) this.d).a(null);
        ((roa) this.e).i(null);
    }

    public final void b(abax abaxVar, abfi abfiVar, tqq tqqVar, float f, Runnable runnable) {
        zkt.n(abaxVar, "areaRenderOp");
        zkt.n(abfiVar, "worldBasedVertexEncoding");
        abnr abnrVar = (abnr) abaxVar.K();
        abnrVar.bc(ujr.c, ncp.r(4));
        tvt tvtVarE = ((twq) this.c).f.e((abax) abnrVar.q(), abfiVar);
        tvtVarE.a(f);
        if (tqqVar != null) {
            tvtVarE.g(tqqVar);
        }
        this.b = tvtVarE;
        ((twj) this.d).a(tvtVarE);
        ((roa) this.e).i(runnable);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, tpr] */
    public final void c(tqq tqqVar) {
        ((zrt) this.a).a();
        ?? r1 = this.b;
        if (r1 == 0) {
            return;
        }
        if (tqqVar != null) {
            r1.g(tqqVar);
        } else {
            r1.e();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [ackk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [ackk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [ackk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [abow, java.lang.Object] */
    public final synchronized void d(zbi zbiVar) {
        this.b = p((zbi) this.b, zbiVar);
        Object obj = this.e;
        if (((aacq) obj).p() && (!((aaxq) ((Optional) this.c.a()).orElse(aaxq.a)).l || ((AtomicBoolean) this.a).get())) {
            ((pyh) this.d.a()).n(pyk.ac, this.b);
        }
        if (((aacq) obj).p()) {
            abnp abnpVarN = zbi.a.n();
            for (zbf zbfVar : ((zbi) this.b).b) {
                if (zbfVar.d) {
                    abnpVarN.P(zbfVar);
                }
            }
            ((pyh) this.d.a()).n(pyk.ad, ((zbi) abnpVarN.b).b.size() == 0 ? null : abnpVarN.q());
        }
    }

    public final uep f(udx udxVar) {
        abcs abcsVarN = udxVar.n();
        plb plbVar = (plb) this.c;
        uep uepVar = (uep) plbVar.h(abcsVarN);
        if (uepVar != null) {
            return uepVar;
        }
        if (!udxVar.h().b()) {
            return null;
        }
        toc tocVarF = udxVar.f();
        uim uimVar = udxVar.h().a;
        uimVar.getClass();
        abcs abcsVarN2 = udxVar.n();
        abnh abnhVar = abbf.ab;
        abcsVarN2.j(abnhVar);
        Object objJ = abcsVarN2.w.j(abnhVar.d);
        aboh abohVar = ((abcl) (objJ == null ? abnhVar.b : abnhVar.c(objJ))).b;
        uep uepVar2 = new uep(tocVarF, uimVar.a);
        plbVar.n(udxVar.n(), uepVar2);
        return uepVar2;
    }

    public final boolean g(too tooVar, uev uevVar, usy usyVar, int i) {
        tpf tpfVar = (tpf) this.a;
        if (!tsw.m(usyVar, tooVar, tpfVar, (float[]) this.d)) {
            return false;
        }
        uew uewVar = (uew) this.e;
        float f = i / 2.0f;
        uewVar.h(tpfVar.b, tpfVar.c, 0.0d, f, f);
        return uewVar.f(uevVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0096, code lost:
    
        if (r14 != r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bc, code lost:
    
        if (r14 != r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016b, code lost:
    
        if (r0 == r1) goto L97;
     */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0051: MOVE (r0 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:82), block:B:24:0x0051 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0192 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009b A[Catch: all -> 0x005c, TryCatch #4 {all -> 0x005c, blocks: (B:25:0x0054, B:40:0x0098, B:26:0x0058, B:43:0x00be, B:37:0x0083, B:38:0x0090, B:41:0x009b), top: B:98:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e9 A[Catch: all -> 0x016e, PHI: r2 r14
  0x00e9: PHI (r2v6 dxk) = (r2v5 dxk), (r2v18 dxk) binds: [B:55:0x00e7, B:19:0x0043] A[DONT_GENERATE, DONT_INLINE]
  0x00e9: PHI (r14v13 dxk) = (r14v9 dxk), (r14v31 dxk) binds: [B:55:0x00e7, B:19:0x0043] A[DONT_GENERATE, DONT_INLINE], TryCatch #5 {all -> 0x016e, blocks: (B:56:0x00e9, B:58:0x0103, B:60:0x010b, B:61:0x0114, B:63:0x0121, B:65:0x012a, B:70:0x013f, B:74:0x0161, B:76:0x0169, B:71:0x0156, B:73:0x015c, B:66:0x012f, B:67:0x0136, B:54:0x00dc, B:51:0x00ce), top: B:105:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013f A[Catch: all -> 0x016e, TryCatch #5 {all -> 0x016e, blocks: (B:56:0x00e9, B:58:0x0103, B:60:0x010b, B:61:0x0114, B:63:0x0121, B:65:0x012a, B:70:0x013f, B:74:0x0161, B:76:0x0169, B:71:0x0156, B:73:0x015c, B:66:0x012f, B:67:0x0136, B:54:0x00dc, B:51:0x00ce), top: B:105:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0156 A[Catch: all -> 0x016e, TryCatch #5 {all -> 0x016e, blocks: (B:56:0x00e9, B:58:0x0103, B:60:0x010b, B:61:0x0114, B:63:0x0121, B:65:0x012a, B:70:0x013f, B:74:0x0161, B:76:0x0169, B:71:0x0156, B:73:0x015c, B:66:0x012f, B:67:0x0136, B:54:0x00dc, B:51:0x00ce), top: B:105:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0169 A[Catch: all -> 0x016e, TRY_LEAVE, TryCatch #5 {all -> 0x016e, blocks: (B:56:0x00e9, B:58:0x0103, B:60:0x010b, B:61:0x0114, B:63:0x0121, B:65:0x012a, B:70:0x013f, B:74:0x0161, B:76:0x0169, B:71:0x0156, B:73:0x015c, B:66:0x012f, B:67:0x0136, B:54:0x00dc, B:51:0x00ce), top: B:105:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v1, types: [aitx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [aitx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4, types: [aitx, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.afck r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aabf.h(afck):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Iterable, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.dxk r12, defpackage.afck r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aabf.i(dxk, afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [afeg, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.afck r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dxd
            if (r0 == 0) goto L13
            r0 = r5
            dxd r0 = (defpackage.dxd) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            dxd r0 = new dxd
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.woy.dF(r5)
            goto L4c
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.woy.dF(r5)
            java.lang.String r5 = "CallExtensions"
            java.lang.String r2 = "invokeDelegate"
            android.util.Log.i(r5, r2)
            java.lang.Object r5 = r4.a
            java.lang.Object r4 = r4.b
            if (r4 == 0) goto L4c
            rz r5 = (defpackage.rz) r5
            java.lang.Object r5 = r5.a
            r0.b = r3
            java.lang.Object r4 = r4.invoke(r5, r0)
            if (r4 != r1) goto L4c
            return r1
        L4c:
            afak r4 = defpackage.afak.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aabf.j(afck):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if (r10 != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.afck r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.dxe
            if (r0 == 0) goto L13
            r0 = r10
            dxe r0 = (defpackage.dxe) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            dxe r0 = new dxe
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            r5 = 0
            java.lang.String r6 = "CallExtensions"
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.woy.dF(r10)
            goto L6e
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            defpackage.woy.dF(r10)
            goto L59
        L39:
            defpackage.woy.dF(r10)
            int r10 = defpackage.dza.a
            boolean r10 = defpackage.dyz.a()
            if (r10 != 0) goto L59
            java.lang.String r10 = "performExchangeWithRemote: waiting for call ready signal..."
            android.util.Log.d(r6, r10)
            btm r10 = new btm
            r2 = 4
            r10.<init>(r9, r5, r2)
            r0.b = r4
            r7 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r10 = defpackage.aikc.b(r7, r10, r0)
            if (r10 == r1) goto L78
        L59:
            java.lang.String r10 = "performExchangeWithRemote: requesting extensions from remote"
            android.util.Log.d(r6, r10)
            btm r10 = new btm
            r2 = 5
            r10.<init>(r9, r5, r2, r5)
            r0.b = r3
            r2 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r10 = defpackage.aikc.b(r2, r10, r0)
            if (r10 == r1) goto L78
        L6e:
            dxk r10 = (defpackage.dxk) r10
            if (r10 != 0) goto L77
            java.lang.String r9 = "performExchangeWithRemote: never received response"
            android.util.Log.w(r6, r9)
        L77:
            return r10
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aabf.k(afck):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0087, code lost:
    
        if (r14 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d0, code lost:
    
        if (r14 != r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.afck r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aabf.l(afck):java.lang.Object");
    }

    public final void m(afdr afdrVar) {
        ((HashSet) this.e).add(afdrVar);
    }

    public final void n(String str) {
        Object next;
        List list = (List) ((eqj) this.e).e();
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (affa.f(((thk) next).e, str)) {
                        break;
                    }
                }
            }
            thk thkVar = (thk) next;
            if (thkVar != null) {
                this.b = thkVar.e;
                thkVar.f.invoke();
            }
        }
        ((eqj) this.a).m(str);
    }

    public aabf(Context context, aitx aitxVar, Call call) {
        aitxVar.getClass();
        call.getClass();
        rz rzVar = new rz(context, call);
        this.c = context;
        this.d = aitxVar;
        this.a = rzVar;
        this.e = new HashSet();
    }

    public aabf(eqj eqjVar, thk thkVar, IconCompat iconCompat) {
        this.e = eqjVar;
        this.d = iconCompat;
        if (eqjVar.o()) {
            eqm eqmVar = new eqm(thkVar != null ? thkVar.e : null);
            this.a = eqmVar;
            this.c = tby.B(eqmVar, new tbm(this, 7));
            return;
        }
        throw new IllegalArgumentException("Must initialize allTabModelsData");
    }

    public aabf() {
        this.e = new uew();
        this.a = new tpf();
        this.d = new float[8];
        this.c = new plb(20, null, null, null);
        this.b = new aehy(16);
    }

    public aabf(twq twqVar) {
        zrt zrtVar = zrt.a;
        zkt.n(twqVar, "phoenixGoogleMap");
        this.c = twqVar;
        zkt.n(zrtVar, "uiThreadChecker");
        this.a = zrtVar;
        roa roaVarD = twqVar.d();
        this.e = roaVarD;
        this.d = roaVarD.j();
    }
}
