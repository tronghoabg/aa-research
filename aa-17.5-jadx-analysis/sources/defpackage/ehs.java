package defpackage;

import com.google.android.apps.auto.carservice.car.window.composition.ProjectionRootActivity;

/* loaded from: classes.dex */
public final class ehs extends afde implements afeg {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehs(afeg afegVar, faf fafVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.b = afegVar;
        this.c = fafVar;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [aizz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [afeh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [aqf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [dzh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v18, types: [aqf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v19, types: [aqf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v32, types: [aizz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v11, types: [afeh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v12, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14, types: [aizm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8, types: [afeg, java.lang.Object] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        switch (this.d) {
            case 0:
                return new ehs((ncp) this.b, (dzh) this.c, afckVar, 0);
            case 1:
                return new ehs((egd) this.c, (fdf) this.b, afckVar, 1);
            case 2:
                return new ehs((aiyk) this.b, (aixv) this.c, afckVar, 2);
            case 3:
                return new ehs((sx) this.c, this.b, afckVar, 3);
            case 4:
                return new ehs((sx) this.b, (eqj) this.c, afckVar, 4);
            case 5:
                return new ehs((aiyk) this.b, (bxd) this.c, afckVar, 5);
            case 6:
                return new ehs((ezv) this.c, (afdr) this.b, afckVar, 6);
            case 7:
                return new ehs((afeg) this.b, (faf) this.c, afckVar, 7);
            case 8:
                return new ehs((fmk) this.c, (aixv) this.b, afckVar, 8);
            case 9:
                return new ehs((ugn) this.c, (fsy) this.b, afckVar, 9);
            case 10:
                return new ehs((afeh) this.b, (aqf) this.c, afckVar, 10);
            case 11:
                return new ehs((afeh) this.b, (aqf) this.c, afckVar, 11, (byte[]) null);
            case 12:
                return new ehs((aiyk) this.b, (aqf) this.c, afckVar, 12);
            case 13:
                return new ehs((gwc) this.b, (gwa) this.c, afckVar, 13);
            case 14:
                return new ehs((gwc) this.b, (gwa) this.c, afckVar, 14, (byte[]) null);
            case 15:
                return new ehs((aizm) this.b, (axr) this.c, afckVar, 15);
            case 16:
                return new ehs((hcl) this.b, (axr) this.c, afckVar, 16);
            case 17:
                return new ehs((hcl) this.b, (axr) this.c, afckVar, 17, (byte[]) null);
            case 18:
                return new ehs((axr) this.c, (cil) this.b, afckVar, 18);
            case 19:
                return new ehs((aizz) this.b, (ProjectionRootActivity) this.c, afckVar, 19);
            default:
                return new ehs((ProjectionRootActivity) this.c, (aizz) this.b, afckVar, 20);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [dzh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v26, types: [aqf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v39, types: [aizz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v21, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v27, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v33, types: [afeh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v34, types: [afeh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v35, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v40, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v51, types: [aizz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v52, types: [eqa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [aiyk, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        switch (this.d) {
            case 0:
                afcr afcrVar = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                    return obj;
                }
                woy.dF(obj);
                Object obj2 = this.b;
                dxp dxpVar = new dxp((dzh) this.c, (afck) null, 3);
                this.a = 1;
                Object objA = ((egd) ((ncp) obj2).a).a(dxpVar, this);
                return objA == afcrVar ? afcrVar : objA;
            case 1:
                afcr afcrVar2 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                    return obj;
                }
                woy.dF(obj);
                eew eewVar = new eew((egd) this.c, (afck) null, 3);
                this.a = 1;
                Object objG = dsu.g(eewVar, this);
                return objG == afcrVar2 ? afcrVar2 : objG;
            case 2:
                afcr afcrVar3 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    ?? r9 = this.b;
                    epl eplVar = new epl(this.c, 0);
                    this.a = 1;
                    if (r9.hR(eplVar, this) == afcrVar3) {
                        return afcrVar3;
                    }
                }
                return afak.a;
            case 3:
                afcr afcrVar4 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    Object obj3 = this.c;
                    this.a = 1;
                    if (((epe) ((sx) obj3).b).a(this) == afcrVar4) {
                        return afcrVar4;
                    }
                }
                ((eqj) ((sx) this.c).b).m(this.b);
                return afak.a;
            case 4:
                afcr afcrVar5 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                    return obj;
                }
                woy.dF(obj);
                Object obj4 = this.b;
                Object obj5 = this.c;
                this.a = 1;
                Object objB = ((epe) ((sx) obj4).b).b((eqj) obj5, this);
                return objB == afcrVar5 ? afcrVar5 : objB;
            case 5:
                afcr afcrVar6 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    ?? r92 = this.b;
                    epl eplVar2 = new epl(this.c, 4);
                    this.a = 1;
                    if (r92.hR(eplVar2, this) == afcrVar6) {
                        return afcrVar6;
                    }
                }
                return afak.a;
            case 6:
                afcr afcrVar7 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    Object obj6 = this.c;
                    this.a = 1;
                    obj = ((ezv) obj6).b(this);
                    if (obj == afcrVar7) {
                        return afcrVar7;
                    }
                }
                return afak.a;
            case 7:
                afcr afcrVar8 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                    return obj;
                }
                woy.dF(obj);
                ?? r93 = this.b;
                Object obj7 = this.c;
                this.a = 1;
                Object objInvoke = r93.invoke(obj7, this);
                return objInvoke == afcrVar8 ? afcrVar8 : objInvoke;
            case 8:
                afcr afcrVar9 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    this.a = 1;
                    if (aiow.c(1000L, this) == afcrVar9) {
                        return afcrVar9;
                    }
                }
                fjo.a().c(fmp.a, "NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after 1000 ms");
                ((aixm) this.b).j(new fmh(7));
                return afak.a;
            case 9:
                afcr afcrVar10 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                    return obj;
                }
                woy.dF(obj);
                Object obj8 = this.c;
                Object obj9 = this.b;
                this.a = 1;
                Object objF = ((ugn) obj8).f((fsy) obj9, 1, this);
                return objF == afcrVar10 ? afcrVar10 : objF;
            case 10:
                afcr afcrVar11 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    ?? r94 = this.b;
                    Object obj10 = this.c;
                    Integer num = new Integer(-1);
                    this.a = 1;
                    if (r94.invoke(obj10, num, this) == afcrVar11) {
                        return afcrVar11;
                    }
                }
                return afak.a;
            case 11:
                afcr afcrVar12 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    ?? r95 = this.b;
                    Object obj11 = this.c;
                    Integer num2 = new Integer(1);
                    this.a = 1;
                    if (r95.invoke(obj11, num2, this) == afcrVar12) {
                        return afcrVar12;
                    }
                }
                return afak.a;
            case 12:
                afcr afcrVar13 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    ?? r96 = this.b;
                    gje gjeVar = new gje(this.c);
                    this.a = 1;
                    if (r96.hR(gjeVar, this) == afcrVar13) {
                        return afcrVar13;
                    }
                }
                return afak.a;
            case 13:
                afcr afcrVar14 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    affq affqVar = new affq();
                    affqVar.a = true;
                    gwc gwcVar = (gwc) this.b;
                    aiyk aiykVarA = gwcVar.a();
                    if (!(aiykVarA instanceof aiye)) {
                        aiykVarA = new aiyf(aiykVarA);
                    }
                    gvz gvzVar = new gvz((gwa) this.c, affqVar, gwcVar, 0);
                    this.a = 1;
                    if (aiykVarA.hR(gvzVar, this) == afcrVar14) {
                        return afcrVar14;
                    }
                }
                return afak.a;
            case 14:
                afcr afcrVar15 = afcr.a;
                if (this.a == 0) {
                    woy.dF(obj);
                    Object obj12 = this.b;
                    bqe bqeVar = new bqe(this.c, 6);
                    this.a = 1;
                    if (((gwc) obj12).p.hR(bqeVar, this) == afcrVar15) {
                        return afcrVar15;
                    }
                } else {
                    woy.dF(obj);
                }
                throw new aezp();
            case 15:
                afcr afcrVar16 = afcr.a;
                if (this.a == 0) {
                    woy.dF(obj);
                    ?? r97 = this.b;
                    if (r97 == 0) {
                        return afak.a;
                    }
                    gfw gfwVar = new gfw((axr) this.c, (afck) null, 8);
                    this.a = 1;
                    if (aimr.b(r97, gfwVar, this) == afcrVar16) {
                        return afcrVar16;
                    }
                } else {
                    woy.dF(obj);
                }
                throw new IllegalStateException("SharedFlow never completes, this call should never return.");
            case 16:
                afcr afcrVar17 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    afeh afehVar = ((hcl) this.b).e;
                    if (afehVar != null) {
                        afehVar.invoke(new Integer(0), new Integer(0), false);
                    }
                    Object obj13 = this.c;
                    this.a = 1;
                    if (((axr) obj13).o(0, this) == afcrVar17) {
                        return afcrVar17;
                    }
                }
                return afak.a;
            case 17:
                afcr afcrVar18 = afcr.a;
                if (this.a == 0) {
                    woy.dF(obj);
                    hcl hclVar = (hcl) this.b;
                    aizm aizmVar = hclVar.f;
                    if (aizmVar == null) {
                        return afak.a;
                    }
                    ehs ehsVar = new ehs(hclVar, (axr) this.c, (afck) null, 16);
                    this.a = 1;
                    if (aimr.b(aizmVar, ehsVar, this) == afcrVar18) {
                        return afcrVar18;
                    }
                } else {
                    woy.dF(obj);
                }
                throw new IllegalStateException("SharedFlow never completes, this call should never return.");
            case 18:
                afcr afcrVar19 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    Object obj14 = this.c;
                    this.a = 1;
                    if (((axr) obj14).o(0, this) == afcrVar19) {
                        return afcrVar19;
                    }
                }
                ((cil) this.b).a(7);
                return afak.a;
            case 19:
                afcr afcrVar20 = afcr.a;
                if (this.a == 0) {
                    woy.dF(obj);
                    ?? r98 = this.b;
                    jiz jizVar = new jiz((ProjectionRootActivity) this.c);
                    this.a = 1;
                    if (r98.hR(jizVar, this) == afcrVar20) {
                        return afcrVar20;
                    }
                } else {
                    woy.dF(obj);
                }
                throw new aezp();
            default:
                afcr afcrVar21 = afcr.a;
                int i = this.a;
                woy.dF(obj);
                if (i == 0) {
                    ?? r99 = this.c;
                    ?? r1 = this.b;
                    eps epsVar = eps.d;
                    ehs ehsVar2 = new ehs((aizz) r1, (ProjectionRootActivity) r99, (afck) null, 19);
                    this.a = 1;
                    if (eqs.c(r99, epsVar, ehsVar2, this) == afcrVar21) {
                        return afcrVar21;
                    }
                }
                return afak.a;
        }
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                return ((ehs) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 1:
                return ((ehs) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 2:
                return ((ehs) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 3:
                return ((ehs) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 4:
                return ((ehs) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 5:
                return ((ehs) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 6:
                return ((ehs) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 7:
                return ((ehs) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 8:
                return ((ehs) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 9:
                return ((ehs) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 10:
                return ((ehs) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 11:
                return ((ehs) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 12:
                return ((ehs) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 13:
                return ((ehs) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 14:
                return ((ehs) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 15:
                return ((ehs) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 16:
                return ((ehs) b((afak) obj, (afck) obj2)).hT(afak.a);
            case 17:
                return ((ehs) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 18:
                return ((ehs) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 19:
                return ((ehs) b((aitx) obj, (afck) obj2)).hT(afak.a);
            default:
                return ((ehs) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehs(afeh afehVar, aqf aqfVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.b = afehVar;
        this.c = aqfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehs(afeh afehVar, aqf aqfVar, afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.d = i;
        this.b = afehVar;
        this.c = aqfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehs(aiyk aiykVar, aixv aixvVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.b = aiykVar;
        this.c = aixvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehs(aiyk aiykVar, aqf aqfVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.b = aiykVar;
        this.c = aqfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehs(aiyk aiykVar, bxd bxdVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.b = aiykVar;
        this.c = bxdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehs(aizm aizmVar, axr axrVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.b = aizmVar;
        this.c = axrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehs(aizz aizzVar, ProjectionRootActivity projectionRootActivity, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.b = aizzVar;
        this.c = projectionRootActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehs(axr axrVar, cil cilVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.c = axrVar;
        this.b = cilVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehs(ProjectionRootActivity projectionRootActivity, aizz aizzVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.c = projectionRootActivity;
        this.b = aizzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehs(egd egdVar, fdf fdfVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.c = egdVar;
        this.b = fdfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehs(ezv ezvVar, afdr afdrVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.c = ezvVar;
        this.b = afdrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehs(fmk fmkVar, aixv aixvVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.c = fmkVar;
        this.b = aixvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehs(gwc gwcVar, gwa gwaVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.b = gwcVar;
        this.c = gwaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehs(gwc gwcVar, gwa gwaVar, afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.d = i;
        this.b = gwcVar;
        this.c = gwaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehs(hcl hclVar, axr axrVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.b = hclVar;
        this.c = axrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehs(hcl hclVar, axr axrVar, afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.d = i;
        this.b = hclVar;
        this.c = axrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehs(ncp ncpVar, dzh dzhVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.b = ncpVar;
        this.c = dzhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehs(sx sxVar, eqj eqjVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.b = sxVar;
        this.c = eqjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehs(sx sxVar, Object obj, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.c = sxVar;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehs(ugn ugnVar, fsy fsyVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.c = ugnVar;
        this.b = fsyVar;
    }
}
