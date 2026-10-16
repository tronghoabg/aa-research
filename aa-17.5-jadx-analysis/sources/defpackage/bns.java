package defpackage;

import android.net.Uri;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class bns extends afde implements afeg {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bns(aiyk aiykVar, dxs dxsVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.b = aiykVar;
        this.c = dxsVar;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [aizz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3, types: [ase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4, types: [asf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [asd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v19, types: [aec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        switch (this.d) {
            case 0:
                return new bns((bnw) this.b, (asd) this.c, afckVar, 0);
            case 1:
                return new bns((bnw) this.b, (bnt) this.c, afckVar, 1);
            case 2:
                return new bns((ase) this.c, (SnapshotStateList) this.b, afckVar, 2);
            case 3:
                return new bns((asf) this.c, (SnapshotStateList) this.b, afckVar, 3);
            case 4:
                return new bns((ksx) this.b, (bcm) this.c, afckVar, 4, (boolean[]) null);
            case 5:
                return new bns((ksx) this.b, (bcm) this.c, afckVar, 5, (byte[]) null, (byte[]) null);
            case 6:
                return new bns((ksx) this.b, (bcm) this.c, afckVar, 6, (char[]) null, (byte[]) null);
            case 7:
                return new bns((ksx) this.b, (bcm) this.c, afckVar, 7, (short[]) null, (byte[]) null);
            case 8:
                return new bns((ksx) this.b, (bcm) this.c, afckVar, 8);
            case 9:
                return new bns((ksx) this.b, (bcm) this.c, afckVar, 9, (int[]) null, (byte[]) null);
            case 10:
                return new bns((ksx) this.b, (bcm) this.c, afckVar, 10, (byte[]) null);
            case 11:
                return new bns((ksx) this.b, (bcm) this.c, afckVar, 11, (char[]) null);
            case 12:
                return new bns((ksx) this.b, (bcm) this.c, afckVar, 12, (short[]) null);
            case 13:
                return new bns((ksx) this.b, (bcm) this.c, afckVar, 13, (int[]) null);
            case 14:
                return new bns((btp) this.b, (aec) this.c, afckVar, 14);
            case 15:
                return new bns((aizz) this.b, (dbt) this.c, afckVar, 15);
            case 16:
                return new bns((dcy) this.c, (Runnable) this.b, afckVar, 16);
            case 17:
                return new bns((dml) this.b, (cjb) this.c, afckVar, 17);
            case 18:
                return new bns((dxj) this.b, (Uri) this.c, afckVar, 18);
            case 19:
                return new bns((aiyk) this.b, (dxs) this.c, afckVar, 19);
            default:
                return new bns((String) this.b, (dyt) this.c, afckVar, 20);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [asd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v33, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r13v63, types: [aizz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v71, types: [cwd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v75, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v9, types: [ase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [aec, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        switch (this.d) {
            case 0:
                afcr afcrVar = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    Object obj2 = this.b;
                    ?? r0 = this.c;
                    this.a = 1;
                    if (((bnw) obj2).a(r0, this) == afcrVar) {
                        return afcrVar;
                    }
                }
                return afak.a;
            case 1:
                afcr afcrVar2 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    Object obj3 = this.b;
                    this.a = 1;
                    bnw bnwVar = (bnw) obj3;
                    bnwVar.a = 6.0f;
                    bnwVar.b = 6.0f;
                    bnwVar.c = 8.0f;
                    bnwVar.d = 6.0f;
                    Object objB = bnwVar.b(this);
                    if (objB != afcrVar2) {
                        objB = afak.a;
                    }
                    if (objB == afcrVar2) {
                        return afcrVar2;
                    }
                }
                return afak.a;
            case 2:
                afcr afcrVar3 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    ?? r13 = this.c;
                    Object obj4 = this.b;
                    aiyk aiykVarA = r13.a();
                    bqe bqeVar = new bqe(obj4, 1);
                    this.a = 1;
                    if (aiykVarA.hR(bqeVar, this) == afcrVar3) {
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
                    Object obj5 = this.c;
                    bqe bqeVar2 = new bqe(this.b, 0);
                    this.a = 1;
                    if (aizp.g((aizp) ((asg) obj5).a, bqeVar2, this) == afcrVar4) {
                        return afcrVar4;
                    }
                }
                return afak.a;
            case 4:
                afcr afcrVar5 = afcr.a;
                if (this.a == 0) {
                    woy.dF(obj);
                    ksx ksxVar = (ksx) this.b;
                    adu aduVar = ksxVar.d;
                    if (aduVar != null) {
                        Object obj6 = this.c;
                        Float f = new Float(((bcm) obj6).a.a(ksxVar.b, ksxVar.c));
                        aew aewVar = ksxVar.a;
                        this.a = 1;
                        obj = adu.k(aduVar, f, aewVar, null, this, 12);
                        if (obj == afcrVar5) {
                            return afcrVar5;
                        }
                    }
                    return afak.a;
                }
                woy.dF(obj);
                return afak.a;
            case 5:
                afcr afcrVar6 = afcr.a;
                if (this.a == 0) {
                    woy.dF(obj);
                    ksx ksxVar2 = (ksx) this.b;
                    adu aduVar2 = ksxVar2.e;
                    if (aduVar2 != null) {
                        Object obj7 = this.c;
                        Float f2 = new Float(((bcm) obj7).b.a(ksxVar2.b, ksxVar2.c));
                        aew aewVar2 = ksxVar2.a;
                        this.a = 1;
                        obj = adu.k(aduVar2, f2, aewVar2, null, this, 12);
                        if (obj == afcrVar6) {
                            return afcrVar6;
                        }
                    }
                    return afak.a;
                }
                woy.dF(obj);
                return afak.a;
            case 6:
                afcr afcrVar7 = afcr.a;
                if (this.a == 0) {
                    woy.dF(obj);
                    ksx ksxVar3 = (ksx) this.b;
                    adu aduVar3 = ksxVar3.f;
                    if (aduVar3 != null) {
                        Object obj8 = this.c;
                        Float f3 = new Float(((bcm) obj8).d.a(ksxVar3.b, ksxVar3.c));
                        aew aewVar3 = ksxVar3.a;
                        this.a = 1;
                        obj = adu.k(aduVar3, f3, aewVar3, null, this, 12);
                        if (obj == afcrVar7) {
                            return afcrVar7;
                        }
                    }
                    return afak.a;
                }
                woy.dF(obj);
                return afak.a;
            case 7:
                afcr afcrVar8 = afcr.a;
                if (this.a == 0) {
                    woy.dF(obj);
                    ksx ksxVar4 = (ksx) this.b;
                    adu aduVar4 = ksxVar4.g;
                    if (aduVar4 != null) {
                        Object obj9 = this.c;
                        Float f4 = new Float(((bcm) obj9).c.a(ksxVar4.b, ksxVar4.c));
                        aew aewVar4 = ksxVar4.a;
                        this.a = 1;
                        obj = adu.k(aduVar4, f4, aewVar4, null, this, 12);
                        if (obj == afcrVar8) {
                            return afcrVar8;
                        }
                    }
                    return afak.a;
                }
                woy.dF(obj);
                return afak.a;
            case 8:
                afcr afcrVar9 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    Object obj10 = this.b;
                    Object obj11 = this.c;
                    this.a = 1;
                    if (ahni.a(new bsk((ksx) obj10, (bcm) obj11, null, 0, null), this) == afcrVar9) {
                        return afcrVar9;
                    }
                }
                return afak.a;
            case 9:
                afcr afcrVar10 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    Object obj12 = this.b;
                    Object obj13 = this.c;
                    this.a = 1;
                    if (ahni.a(new bsk((ksx) obj12, (bcm) obj13, null, 1, null, null), this) == afcrVar10) {
                        return afcrVar10;
                    }
                }
                return afak.a;
            case 10:
                afcr afcrVar11 = afcr.a;
                if (this.a == 0) {
                    woy.dF(obj);
                    ksx ksxVar5 = (ksx) this.b;
                    adu aduVar5 = ksxVar5.d;
                    if (aduVar5 != null) {
                        Object obj14 = this.c;
                        Float f5 = new Float(((bcm) obj14).a.a(ksxVar5.b, ksxVar5.c));
                        aew aewVar5 = ksxVar5.a;
                        this.a = 1;
                        obj = adu.k(aduVar5, f5, aewVar5, null, this, 12);
                        if (obj == afcrVar11) {
                            return afcrVar11;
                        }
                    }
                    return afak.a;
                }
                woy.dF(obj);
                return afak.a;
            case 11:
                afcr afcrVar12 = afcr.a;
                if (this.a == 0) {
                    woy.dF(obj);
                    ksx ksxVar6 = (ksx) this.b;
                    adu aduVar6 = ksxVar6.e;
                    if (aduVar6 != null) {
                        Object obj15 = this.c;
                        Float f6 = new Float(((bcm) obj15).b.a(ksxVar6.b, ksxVar6.c));
                        aew aewVar6 = ksxVar6.a;
                        this.a = 1;
                        obj = adu.k(aduVar6, f6, aewVar6, null, this, 12);
                        if (obj == afcrVar12) {
                            return afcrVar12;
                        }
                    }
                    return afak.a;
                }
                woy.dF(obj);
                return afak.a;
            case 12:
                afcr afcrVar13 = afcr.a;
                if (this.a == 0) {
                    woy.dF(obj);
                    ksx ksxVar7 = (ksx) this.b;
                    adu aduVar7 = ksxVar7.f;
                    if (aduVar7 != null) {
                        Object obj16 = this.c;
                        Float f7 = new Float(((bcm) obj16).d.a(ksxVar7.b, ksxVar7.c));
                        aew aewVar7 = ksxVar7.a;
                        this.a = 1;
                        obj = adu.k(aduVar7, f7, aewVar7, null, this, 12);
                        if (obj == afcrVar13) {
                            return afcrVar13;
                        }
                    }
                    return afak.a;
                }
                woy.dF(obj);
                return afak.a;
            case 13:
                afcr afcrVar14 = afcr.a;
                if (this.a == 0) {
                    woy.dF(obj);
                    ksx ksxVar8 = (ksx) this.b;
                    adu aduVar8 = ksxVar8.g;
                    if (aduVar8 != null) {
                        Object obj17 = this.c;
                        Float f8 = new Float(((bcm) obj17).c.a(ksxVar8.b, ksxVar8.c));
                        aew aewVar8 = ksxVar8.a;
                        this.a = 1;
                        obj = adu.k(aduVar8, f8, aewVar8, null, this, 12);
                        if (obj == afcrVar14) {
                            return afcrVar14;
                        }
                    }
                    return afak.a;
                }
                woy.dF(obj);
                return afak.a;
            case 14:
                afcr afcrVar15 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    Object obj18 = this.b;
                    Float f9 = new Float(BitmapDescriptorFactory.HUE_RED);
                    ?? r6 = this.c;
                    this.a = 1;
                    if (adu.k(((btp) obj18).g, f9, r6, null, this, 12) == afcrVar15) {
                        return afcrVar15;
                    }
                }
                return afak.a;
            case 15:
                afcr afcrVar16 = afcr.a;
                if (this.a == 0) {
                    woy.dF(obj);
                    ?? r132 = this.b;
                    bqe bqeVar3 = new bqe(this.c, 2);
                    this.a = 1;
                    if (r132.hR(bqeVar3, this) == afcrVar16) {
                        return afcrVar16;
                    }
                } else {
                    woy.dF(obj);
                }
                throw new aezp();
            case 16:
                afcr afcrVar17 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    Object obj19 = this.c;
                    this.a = 1;
                    if (((dcy) obj19).b.c(BitmapDescriptorFactory.HUE_RED, this) == afcrVar17) {
                        return afcrVar17;
                    }
                }
                ((dcy) this.c).c.l(false);
                this.b.run();
                return afak.a;
            case 17:
                afcr afcrVar18 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    ?? r133 = this.b;
                    cxm cxmVar = new cxm(this.c, 8);
                    this.a = 1;
                    if (vh.f(r133, cxmVar, this) == afcrVar18) {
                        return afcrVar18;
                    }
                }
                return afak.a;
            case 18:
                afcr afcrVar19 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    Object obj20 = this.b;
                    Object obj21 = this.c;
                    this.a = 1;
                    if (((dxj) obj20).e.invoke(obj21, this) == afcrVar19) {
                        return afcrVar19;
                    }
                }
                return afak.a;
            case 19:
                afcr afcrVar20 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    ?? r134 = this.b;
                    bqe bqeVar4 = new bqe(this.c, 3);
                    this.a = 1;
                    if (r134.hR(bqeVar4, this) == afcrVar20) {
                        return afcrVar20;
                    }
                }
                return afak.a;
            default:
                afcr afcrVar21 = afcr.a;
                int i = this.a;
                woy.dF(obj);
                if (i == 0) {
                    Object obj22 = this.b;
                    if (true == affa.f(obj22, "null")) {
                        obj22 = null;
                    }
                    Object obj23 = this.c;
                    this.a = 1;
                    if (((dyt) obj23).d.invoke(obj22, this) == afcrVar21) {
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
                return ((bns) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 1:
                return ((bns) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 2:
                return ((bns) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 3:
                return ((bns) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 4:
                return ((bns) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 5:
                return ((bns) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 6:
                return ((bns) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 7:
                return ((bns) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 8:
                return ((bns) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 9:
                return ((bns) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 10:
                return ((bns) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 11:
                return ((bns) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 12:
                return ((bns) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 13:
                return ((bns) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 14:
                return ((bns) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 15:
                return ((bns) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 16:
                return ((bns) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 17:
                return ((bns) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 18:
                return ((bns) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 19:
                return ((bns) b((aitx) obj, (afck) obj2)).hT(afak.a);
            default:
                return ((bns) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bns(aizz aizzVar, dbt dbtVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.b = aizzVar;
        this.c = dbtVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bns(ase aseVar, SnapshotStateList snapshotStateList, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.c = aseVar;
        this.b = snapshotStateList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bns(asf asfVar, SnapshotStateList snapshotStateList, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.c = asfVar;
        this.b = snapshotStateList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bns(bnw bnwVar, asd asdVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.b = bnwVar;
        this.c = asdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bns(bnw bnwVar, bnt bntVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.b = bnwVar;
        this.c = bntVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bns(btp btpVar, aec aecVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.b = btpVar;
        this.c = aecVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bns(dcy dcyVar, Runnable runnable, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.c = dcyVar;
        this.b = runnable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bns(dml dmlVar, cjb cjbVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.b = dmlVar;
        this.c = cjbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bns(dxj dxjVar, Uri uri, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.b = dxjVar;
        this.c = uri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bns(String str, dyt dytVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.b = str;
        this.c = dytVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bns(ksx ksxVar, bcm bcmVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.b = ksxVar;
        this.c = bcmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bns(ksx ksxVar, bcm bcmVar, afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.d = i;
        this.b = ksxVar;
        this.c = bcmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bns(ksx ksxVar, bcm bcmVar, afck afckVar, int i, byte[] bArr, byte[] bArr2) {
        super(2, afckVar);
        this.d = i;
        this.b = ksxVar;
        this.c = bcmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bns(ksx ksxVar, bcm bcmVar, afck afckVar, int i, char[] cArr) {
        super(2, afckVar);
        this.d = i;
        this.b = ksxVar;
        this.c = bcmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bns(ksx ksxVar, bcm bcmVar, afck afckVar, int i, char[] cArr, byte[] bArr) {
        super(2, afckVar);
        this.d = i;
        this.b = ksxVar;
        this.c = bcmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bns(ksx ksxVar, bcm bcmVar, afck afckVar, int i, int[] iArr) {
        super(2, afckVar);
        this.d = i;
        this.b = ksxVar;
        this.c = bcmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bns(ksx ksxVar, bcm bcmVar, afck afckVar, int i, int[] iArr, byte[] bArr) {
        super(2, afckVar);
        this.d = i;
        this.b = ksxVar;
        this.c = bcmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bns(ksx ksxVar, bcm bcmVar, afck afckVar, int i, short[] sArr) {
        super(2, afckVar);
        this.d = i;
        this.b = ksxVar;
        this.c = bcmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bns(ksx ksxVar, bcm bcmVar, afck afckVar, int i, short[] sArr, byte[] bArr) {
        super(2, afckVar);
        this.d = i;
        this.b = ksxVar;
        this.c = bcmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bns(ksx ksxVar, bcm bcmVar, afck afckVar, int i, boolean[] zArr) {
        super(2, afckVar);
        this.d = i;
        this.b = ksxVar;
        this.c = bcmVar;
    }
}
