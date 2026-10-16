package defpackage;

import j$.util.DesugarCollections;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class udq implements udb {
    public static final qrv A;
    private static final uez C;
    private static final uez D;
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/label/ManagedThreadCommunicationLabeler");
    private final ucm E;
    public final ucc b;
    public final uce f;
    public final uen g;
    public final udd k;
    public final ucp l;
    public final aezk m;
    public final ucy n;
    public final vaa o;
    public ujk q;
    public final tzt t;
    public final uaj u;
    public final qsb y;
    public final aabf z;
    public final rjs x = new rjs((short[]) null);
    public final udv c = new udv();
    public final gms B = new gms(null, null, null, null);
    public final List d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final float[] h = new float[8];
    public final Set i = new HashSet();
    public final ArrayList j = new ArrayList();
    public final sf w = new sf(null, null, null);
    public final rfe v = new rfe();
    public long p = -1;
    public int r = 0;
    public final AtomicReference s = new AtomicReference();
    private final udc F = new udc();

    static {
        int i = udg.a;
        A = new qrv(null);
        final int i2 = 1;
        C = new uez() { // from class: udh
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, udx] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, udx] */
            @Override // defpackage.uez
            public final uey a(Object obj, Object obj2) {
                if (i2 == 0) {
                    return udq.j((rjs) obj, (rjs) obj2);
                }
                ?? r0 = ((rjs) obj2).b;
                yob yobVar = udq.a;
                ?? r1 = ((rjs) obj).b;
                if (!qrv.C(r0, r1)) {
                    return uey.IGNORE;
                }
                udw udwVarI = r0.i();
                udwVarI.getClass();
                udw udwVarI2 = r1.i();
                udwVarI2.getClass();
                return udwVarI.b > udwVarI2.b ? uey.IGNORE : uey.ENFORCE;
            }
        };
        final int i3 = 0;
        D = new uez() { // from class: udh
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, udx] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, udx] */
            @Override // defpackage.uez
            public final uey a(Object obj, Object obj2) {
                if (i3 == 0) {
                    return udq.j((rjs) obj, (rjs) obj2);
                }
                ?? r0 = ((rjs) obj2).b;
                yob yobVar = udq.a;
                ?? r1 = ((rjs) obj).b;
                if (!qrv.C(r0, r1)) {
                    return uey.IGNORE;
                }
                udw udwVarI = r0.i();
                udwVarI.getClass();
                udw udwVarI2 = r1.i();
                udwVarI2.getClass();
                return udwVarI.b > udwVarI2.b ? uey.IGNORE : uey.ENFORCE;
            }
        };
    }

    public udq(udd uddVar, ucp ucpVar, ucm ucmVar, tzt tztVar, uce uceVar, uen uenVar, qsb qsbVar, ucy ucyVar, aezk aezkVar, ucc uccVar, vaa vaaVar, ujk ujkVar, uaj uajVar) {
        this.k = uddVar;
        this.E = ucmVar;
        this.t = tztVar;
        this.m = aezkVar;
        this.n = ucyVar;
        this.l = ucpVar;
        this.q = ujkVar;
        aezkVar.a();
        aezkVar.a();
        this.f = uceVar;
        this.g = uenVar;
        this.y = qsbVar;
        this.b = uccVar;
        this.z = new aabf();
        this.o = vaaVar;
        this.u = uajVar;
    }

    static int c(abcs abcsVar, int i, ujk ujkVar, int i2, ueu ueuVar, boolean z) {
        int iHashCode = abcsVar.hashCode() + 31;
        if (true == z) {
            i = 0;
        }
        return (((((((iHashCode * 31) + i) * 31) + i2) * 31) + ujkVar.ordinal()) * 31) + System.identityHashCode(ueuVar);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, ubf] */
    public static void d(udo udoVar) {
        if (udoVar.b.e) {
            xxh xxhVar = udoVar.c;
            if (!xxhVar.f() || udoVar.a.B()) {
                return;
            }
            xxhVar.b().x(1);
        }
    }

    public static boolean e(ubf ubfVar) {
        udx udxVarU = ubfVar.u();
        if (udxVarU.aj() && udxVarU.al() && (((uat) udxVarU).a.b & 2) != 0) {
            return true;
        }
        if (ubfVar instanceof uby) {
            return ubfVar.u().aj() && !((uby) ubfVar).C.isEmpty();
        }
        return false;
    }

    public static final boolean i(ubf ubfVar) {
        return !((uat) ubfVar.u()).x;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, udx] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, udx] */
    static /* synthetic */ uey j(rjs rjsVar, rjs rjsVar2) {
        ?? r2 = rjsVar2.b;
        ?? r1 = rjsVar.b;
        if (!qrv.C(r2, r1)) {
            return uey.ENFORCE;
        }
        udw udwVarI = r2.i();
        udwVarI.getClass();
        udw udwVarI2 = r1.i();
        udwVarI2.getClass();
        return udwVarI.b > udwVarI2.b ? uey.IGNORE : uey.ENFORCE;
    }

    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, ubf] */
    private final ubf l(int i) {
        udv udvVar = this.c;
        xxh xxhVarA = udv.a(i, 0L, "", udvVar.b, udvVar.c, udvVar.d);
        if (!xxhVarA.f()) {
            return this.f.l(i);
        }
        ?? B = ((udo) xxhVarA.b()).c.b();
        B.w(1);
        return B;
    }

    private static udj m(boolean z, boolean z2, boolean z3) throws IllegalArgumentException {
        if (z2 && !z) {
            throw new IllegalArgumentException("Secondary label cannot be placed without primary.");
        }
        if (!z3 || z) {
            return z ? z2 ? z3 ? udj.PRIMARY_SECONDARY_AND_TERTIARY_PLACED : udj.PRIMARY_AND_SECONDARY_PLACED : z3 ? udj.PRIMARY_AND_TERTIARY_PLACED : udj.ONLY_PRIMARY_PLACED : udj.NOTHING_PLACED;
        }
        throw new IllegalArgumentException("Tertiary label cannot be placed without primary.");
    }

    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, ubf] */
    private final udk n(udn udnVar, udx udxVar) {
        int iC = c(udxVar.n(), udnVar.a(), (ujk) (udxVar.S() != null ? udxVar.S().d : udnVar.b), udxVar.c(), udnVar.c, udxVar.G());
        udv udvVar = this.c;
        xxh xxhVarA = udv.a(iC, udxVar.d(), udxVar.s(), udvVar.e, udvVar.f, udvVar.g);
        if (xxhVarA.f()) {
            udo udoVar = (udo) xxhVarA.b();
            if (udoVar.c.b().t() == iC) {
                udxVar.n();
                wuw wuwVar = new wuw();
                wuwVar.c(6);
                wuwVar.d(udxVar);
                return udk.a(iC, wuwVar.b());
            }
            if (udxVar.d() != 0) {
                long jD = udxVar.d();
                udx udxVar2 = udoVar.a;
                if (jD == udxVar2.d() && !qrv.C(udxVar, udxVar2) && !udxVar.I() && !uqf.c(udxVar.T(), 32) && !udxVar2.I()) {
                    wuw wuwVar2 = new wuw();
                    wuwVar2.c(7);
                    wuwVar2.d(udxVar);
                    return udk.a(iC, wuwVar2.b());
                }
            }
        }
        return new udk(iC, xvy.a);
    }

    private final udo o(udn udnVar, ubf ubfVar) throws IllegalArgumentException {
        udo udoVarP = p(udnVar, ubfVar);
        boolean z = udoVarP.b.e;
        if (z) {
            ubfVar.i();
            ubfVar.z(udnVar.a - 1.0f);
        }
        if (z && udnVar.d) {
            return udoVarP;
        }
        this.f.j(ubfVar);
        return udoVarP;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.udo p(defpackage.udn r10, defpackage.ubf r11) throws java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.udq.p(udn, ubf):udo");
    }

    private static boolean q(float f) {
        return Math.abs(f) > 20.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean r(udn udnVar, uby ubyVar, boolean z, int i) {
        udi udiVar = new udi(z);
        uew uewVarF = ubyVar.f();
        boolean z2 = uewVarF != null && udnVar.g.g(new rjs(ubyVar.b, uewVarF), udiVar, i);
        if (ubyVar.C.isEmpty()) {
            return z2;
        }
        if (z2) {
            return true;
        }
        int i2 = ubyVar.E;
        if (i2 == 0) {
            i2 = 4;
        }
        ubm ubmVar = ubyVar.r;
        int i3 = ubmVar == null ? 1 : ubmVar.j;
        yfq yfqVar = ubyVar.C;
        int size = yfqVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            ujg ujgVar = (ujg) yfqVar.get(i4);
            int iJ = uby.J(ujgVar.a);
            if (i2 != iJ) {
                ubyVar.E = iJ;
                ubyVar.H(ujgVar.b);
                ubyVar.s(this.F, udnVar.f);
                uew uewVarF2 = ubyVar.f();
                if (uewVarF2 != null && udnVar.g.g(new rjs(ubyVar.b, uewVarF2), udiVar, i)) {
                    return true;
                }
            }
        }
        ubyVar.E = i2;
        ubyVar.H(i3);
        ubyVar.s(this.F, udnVar.f);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean s(defpackage.udn r18, defpackage.uby r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            udi r4 = new udi
            r5 = 0
            r4.<init>(r5)
            uew r6 = r2.f()
            uew r7 = r2.g()
            r8 = 1
            if (r6 == 0) goto L23
            if (r7 == 0) goto L23
            boolean r9 = r7.g(r6)
            if (r9 == 0) goto L23
            r9 = r8
            goto L24
        L23:
            r9 = r5
        L24:
            if (r7 == 0) goto L39
            if (r9 != 0) goto L39
            wnq r9 = r1.g
            rjs r10 = new rjs
            udx r11 = r2.b
            r10.<init>(r11, r7)
            boolean r7 = r9.g(r10, r4, r3)
            if (r7 == 0) goto L39
            r7 = r8
            goto L3a
        L39:
            r7 = r5
        L3a:
            yfq r9 = r2.D
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto Lb5
            if (r7 == 0) goto L45
            return r8
        L45:
            int r7 = r2.F
            if (r7 != 0) goto L4a
            r7 = 4
        L4a:
            ubm r9 = r2.s
            if (r9 != 0) goto L50
            r9 = r8
            goto L52
        L50:
            int r9 = r9.j
        L52:
            yfq r10 = r2.D
            int r11 = r10.size()
            r12 = r5
        L59:
            if (r12 >= r11) goto La6
            java.lang.Object r13 = r10.get(r12)
            ujg r13 = (defpackage.ujg) r13
            int r14 = r13.a
            int r14 = defpackage.uby.J(r14)
            if (r7 != r14) goto L6c
        L69:
            r16 = r5
            goto La1
        L6c:
            r2.F = r14
            int r13 = r13.b
            r2.I(r13)
            udc r13 = r0.F
            usy r14 = r1.f
            r2.s(r13, r14)
            uew r13 = r2.g()
            if (r6 == 0) goto L8a
            if (r13 == 0) goto L8a
            boolean r14 = r13.g(r6)
            if (r14 == 0) goto L8a
            r14 = r8
            goto L8b
        L8a:
            r14 = r5
        L8b:
            if (r13 == 0) goto L69
            if (r14 != 0) goto L69
            wnq r14 = r1.g
            rjs r15 = new rjs
            r16 = r5
            udx r5 = r2.b
            r15.<init>(r5, r13)
            boolean r5 = r14.g(r15, r4, r3)
            if (r5 == 0) goto La1
            return r8
        La1:
            int r12 = r12 + 1
            r5 = r16
            goto L59
        La6:
            r16 = r5
            r2.F = r7
            r2.I(r9)
            udc r0 = r0.F
            usy r1 = r1.f
            r2.s(r0, r1)
            return r16
        Lb5:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.udq.s(udn, uby, int):boolean");
    }

    private final boolean t(udn udnVar, ubf ubfVar, int i) {
        uew uewVarG;
        uby ubyVar = ubfVar instanceof uby ? (uby) ubfVar : null;
        return (ubyVar == null || ubyVar.g() == null || !s(udnVar, ubyVar, i) || (uewVarG = ubyVar.g()) == null || !udnVar.g.f(new rjs(ubyVar.b, uewVarG), new udi(false), i)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, ubf] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, ubf] */
    @Override // defpackage.udb
    public final void a() {
        udv udvVar = this.c;
        Iterator it = DesugarCollections.unmodifiableCollection(udvVar.e.values()).iterator();
        while (it.hasNext()) {
            h(((udo) it.next()).c.b(), yly.a);
        }
        Iterator it2 = DesugarCollections.unmodifiableCollection(udvVar.b.values()).iterator();
        while (it2.hasNext()) {
            h(((udo) it2.next()).c.b(), yly.a);
        }
        udvVar.b();
        this.k.i();
    }

    public final boolean f(udn udnVar, ubf ubfVar, boolean z, int i) {
        uew uewVarF;
        boolean z2 = ubfVar instanceof uby;
        uby ubyVar = z2 ? (uby) ubfVar : null;
        return (!z2 || (ubyVar != null ? r(udnVar, ubyVar, z, i) : false)) && (uewVarF = ubfVar.f()) != null && udnVar.g.f(new rjs(ubfVar.u(), uewVarF), new udi(z), i);
    }

    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Object, ubf] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, ubf] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, ubf] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, ubf] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, ubf] */
    /* JADX WARN: Type inference failed for: r9v25, types: [java.lang.Object, ubf] */
    public final void g(udo udoVar, udn udnVar) {
        xxh xxhVar;
        long j;
        xxh xxhVar2;
        if (udnVar.d) {
            udv udvVar = this.c;
            udl udlVar = udoVar.b;
            boolean z = udlVar.e;
            if (!z || udoVar.a.B()) {
                xxhVar = xvy.a;
            } else {
                ?? B = udoVar.c.b();
                if (udvVar.e.p(B.t()) != null) {
                    ((ynz) ((ynz) udv.a.h()).ai(9252)).w("multiple calls to register placement result for label having render ID %s", B.t());
                    xxhVar = xvy.a;
                } else {
                    abcs abcsVar = ((uat) B.u()).b;
                    if (abcsVar == null) {
                        xxhVar2 = xvy.a;
                        j = 0;
                    } else {
                        aexc aexcVar = udvVar.h;
                        xxh xxhVarG = xxh.g((udo) aexcVar.get(abcsVar));
                        if (xxhVarG.f()) {
                            udo udoVar2 = (udo) xxhVarG.b();
                            udvVar.e.b(udoVar2.c.b().t());
                            udx udxVar = udoVar2.a;
                            if (udxVar.d() != 0) {
                                j = 0;
                                udvVar.f.b(udxVar.d());
                            } else {
                                j = 0;
                                if (!udxVar.s().isEmpty()) {
                                    udvVar.g.remove(udxVar.s());
                                }
                            }
                            aexcVar.remove(abcsVar);
                            ((udo) xxhVarG.b()).c.b().w(1);
                        } else {
                            j = 0;
                        }
                        xxhVar2 = xxhVarG;
                    }
                    if (xxhVar2.f()) {
                        ?? B2 = ((udo) xxhVar2.b()).c.b();
                        if (!udvVar.b.c(B2.t())) {
                            B2.x(2);
                        }
                    }
                    udvVar.e.a(B.t(), udoVar);
                    long j2 = ((uat) B.u()).d;
                    String str = ((uat) B.u()).f;
                    boolean z2 = ((uat) B.u()).o;
                    if (j2 != j && !z2) {
                        udvVar.f.a(j2, udoVar);
                    }
                    if (j2 == j && !str.isEmpty() && !z2) {
                        udvVar.g.put(str, udoVar);
                    }
                    abcs abcsVar2 = ((uat) B.u()).b;
                    if (abcsVar2 != null) {
                        udvVar.h.put(abcsVar2, udoVar);
                    }
                    if (!udvVar.b.c(B.t())) {
                        B.w(2);
                    }
                    xxhVar = xxhVar2;
                }
            }
            if (xxhVar.f()) {
                xxh xxhVar3 = ((udo) xxhVar.b()).c;
                wnq wnqVar = udnVar.g;
                ?? B3 = xxhVar3.b();
                udx udxVarU = B3.u();
                for (gms gmsVar : wnqVar.b) {
                    if (gmsVar != null) {
                        int i = 0;
                        while (true) {
                            ArrayList arrayList = (ArrayList) gmsVar.a;
                            if (i < arrayList.size()) {
                                if (((rjs) arrayList.get(i)).b == udxVarU) {
                                    int size = arrayList.size() - 1;
                                    arrayList.set(i, (rjs) arrayList.get(size));
                                    arrayList.remove(size);
                                } else {
                                    i++;
                                }
                            }
                        }
                    }
                }
                B3.x(1);
            }
            udx udxVar2 = udoVar.a;
            boolean zB = udxVar2.h().b();
            xxh xxhVar4 = udoVar.c;
            boolean z3 = xxhVar4.f() && (xxhVar4.b() instanceof ubd);
            if (udxVar2.B()) {
                udxVar2.n();
                if (!z) {
                    if (udlVar.g && udxVar2.x()) {
                        this.n.n(udxVar2, 6);
                        this.v.i(udxVar2, ucq.g);
                        return;
                    }
                    return;
                }
                ?? B4 = xxhVar4.b();
                this.j.add(B4);
                if (udlVar.f) {
                    this.n.n(B4.u(), 5);
                    this.v.i(udxVar2, ucq.e);
                    return;
                }
                return;
            }
            if (!zB || z3) {
                return;
            }
            if (udnVar.a >= 14.0f && udxVar2.h().b() && this.t.g() && udxVar2.H()) {
                abcs abcsVarN = udxVar2.n();
                abnh abnhVar = abbf.W;
                abcsVarN.j(abnhVar);
                Object objJ = abcsVarN.w.j(abnhVar.d);
                yfq yfqVarF = yeb.d(((aazu) (objJ == null ? abnhVar.b : abnhVar.c(objJ))).b).e(new txa(7)).f();
                if (!yfqVarF.isEmpty()) {
                    this.i.addAll(yfqVarF);
                }
            }
            if (!udxVar2.B()) {
                udxVar2.n();
                if (udlVar.g && udxVar2.x()) {
                    this.n.n(udxVar2, 6);
                    this.v.i(udxVar2, ucq.g);
                }
            }
            udxVar2.n();
            if (udlVar.g && udxVar2.x()) {
                this.n.n(udxVar2, 6);
                this.v.i(udxVar2, ucq.g);
                return;
            }
            if (z) {
                uby ubyVar = (uby) xxhVar4.b();
                if (!udlVar.f) {
                    this.v.i(udxVar2, ucq.f);
                    return;
                }
                if (ubyVar.z) {
                    boolean zC = ubyVar.C();
                    rfe rfeVar = this.v;
                    if (zC) {
                        rfeVar.i(udxVar2, ucq.c);
                        return;
                    } else {
                        rfeVar.i(udxVar2, ucq.a);
                        return;
                    }
                }
                boolean zC2 = ubyVar.C();
                rfe rfeVar2 = this.v;
                if (zC2) {
                    rfeVar2.i(udxVar2, ucq.d);
                } else {
                    rfeVar2.i(udxVar2, ucq.b);
                }
            }
        }
    }

    @Override // defpackage.uyl
    public final void gt(String str, PrintWriter printWriter) {
        throw null;
    }

    public final void h(ubf ubfVar, ygr ygrVar) {
        int iT = ubfVar.t();
        if (ubfVar.B()) {
            if (ubfVar.o()) {
                this.l.c(ubfVar);
            }
            this.k.f(ubfVar, ygrVar);
            this.n.i(iT);
            ubfVar.y(false);
        }
        this.f.k(iT);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r2.b >= r2.a.c()) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x07ac  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0111  */
    /* JADX WARN: Type inference failed for: r2v49, types: [aehj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [aehj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v54, types: [aehj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v38, types: [aehj, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.udo k(defpackage.udn r32, defpackage.udx r33, defpackage.aabf r34) {
        /*
            Method dump skipped, instructions count: 2120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.udq.k(udn, udx, aabf):udo");
    }
}
