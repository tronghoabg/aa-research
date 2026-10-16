package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;

/* loaded from: classes.dex */
public final /* synthetic */ class aiy implements afdr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ aiy(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [aitx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [aitx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [aitx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [aitx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [bwq, bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [cwc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [cwc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [dlg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v11, types: [cdp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v52, types: [bho, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v58, types: [bho, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v63, types: [aitx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [cdm, java.lang.Object] */
    @Override // defpackage.afdr
    public final Object invoke() {
        Object obj;
        glf glfVar;
        deu deuVarE;
        bdt bdtVarC;
        int iE;
        bff bffVarD;
        bed bedVar;
        bem bemVar;
        deu deuVar;
        switch (this.c) {
            case 0:
                aiz aizVar = (aiz) this.a;
                ckv ckvVar = aizVar.b;
                ?? r14 = this.b;
                cxd cxdVar = (cxd) r14;
                aizVar.c = ckvVar.a(cxdVar.o(), cxdVar.p(), r14);
                return afak.a;
            case 1:
                agg aggVar = (agg) this.a;
                return Boolean.valueOf(ca.O(aggVar) ? ((Boolean) this.b.invoke(aggVar.e(), aggVar.g())).booleanValue() : false);
            case 2:
                ((affv) this.b).a = bzi.x(this.a, cum.a);
                return afak.a;
            case 3:
                return new bab(this.b, afbf.a, this.a);
            case 4:
                bbd bbdVar = (bbd) this.b.a();
                bbt bbtVar = (bbt) this.a;
                return new bbf(bbtVar, bbdVar, new smv(bbtVar.e.d.a(), bbdVar));
            case 5:
                return Boolean.valueOf(afp.W((bbt) this.a, this.b));
            case 6:
                return Boolean.valueOf(afp.X((bbt) this.a, this.b));
            case 7:
                return Boolean.valueOf(afp.W((bbt) this.a, this.b));
            case 8:
                return Boolean.valueOf(afp.X((bbt) this.a, this.b));
            case 9:
                ?? r0 = this.a;
                long j = ((djv) r0.a()).b;
                long j2 = dfv.a;
                Object obj2 = this.b;
                djv djvVar = (djv) obj2;
                if (djvVar.b != j || !affa.f(djvVar.c, ((djv) r0.a()).c)) {
                    r0.b(obj2);
                }
                return afak.a;
            case 10:
                Object obj3 = this.b;
                Object obj4 = this.a;
                if (obj4 != null) {
                    bfh bfhVar = (bfh) obj4;
                    SnapshotStateList snapshotStateList = bfhVar.c;
                    if (snapshotStateList.isEmpty()) {
                        obj = bfhVar.b;
                    } else {
                        cyi cyiVar = new cyi(bfhVar.b);
                        int iA = snapshotStateList.a();
                        for (int i = 0; i < iA; i++) {
                            ((afec) snapshotStateList.get(i)).invoke(cyiVar);
                        }
                        obj = cyiVar.b;
                    }
                    bfhVar.b = (deu) obj;
                    if (obj != null) {
                        return obj;
                    }
                }
                return obj3;
            case 11:
                dez dezVar = (dez) ((det) this.b).a;
                boolean z = dezVar instanceof dey;
                Object obj5 = this.a;
                if (z) {
                    try {
                        ((kwp) obj5).n(((dey) dezVar).a);
                    } catch (IllegalArgumentException unused) {
                    }
                } else if ((dezVar instanceof dex) && (glfVar = ((dex) dezVar).c) != null) {
                    glfVar.b(dezVar);
                }
                return afak.a;
            case 12:
                beg begVar = new beg(this.b, 7);
                bgg bggVar = (bgg) this.a;
                return (bfu) bggVar.a("dataBuilder", bggVar.d, begVar);
            case 13:
                Object obj6 = this.b;
                Object obj7 = this.a;
                aiy aiyVar = new aiy(obj7, obj6, 15);
                bgg bggVar2 = (bgg) obj7;
                return (cjb) bggVar2.a("positioner", bggVar2.e, aiyVar);
            case 14:
                ((affv) this.b).a = this.a.invoke();
                return afak.a;
            case 15:
                Object objInvoke = ((bgg) this.a).b.invoke();
                cst cstVar = (cst) (true == ((cst) objInvoke).t() ? objInvoke : null);
                return cstVar == null ? cjb.a : this.b.c(cstVar).f(cstVar.j(0L));
            case 16:
                ((bfv) this.a).d.invoke(this.b);
                return afak.a;
            case 17:
                return new dlo(dlf.s(this.a.a((cst) this.b.invoke())));
            case 18:
                ((affv) this.b).a = bzi.x(this.a, cum.a);
                return afak.a;
            case 19:
                ahnc.d(this.b, null, 4, new beo((afec) this.a, (afck) null, 5), 1);
                return afak.a;
            default:
                long j3 = ((dlq) this.b.a()).a;
                blr blrVar = (blr) this.a;
                cja cjaVarD = blrVar.d();
                long jFloatToRawIntBits = 9205357640488583168L;
                if (cjaVarD != null && (deuVarE = blrVar.e()) != null && deuVarE.a() != 0 && (bdtVarC = blrVar.c()) != null) {
                    int iOrdinal = bdtVarC.ordinal();
                    if (iOrdinal == 0 || iOrdinal == 1) {
                        iE = dfv.e(blrVar.f().b);
                    } else {
                        if (iOrdinal != 2) {
                            throw new aezs();
                        }
                        iE = dfv.a(blrVar.f().b);
                    }
                    bed bedVar2 = blrVar.d;
                    if (bedVar2 != null && (bffVarD = bedVar2.d()) != null && (bedVar = blrVar.d) != null && (bemVar = bedVar.a) != null && (deuVar = bemVar.a) != null) {
                        long j4 = cjaVarD.a;
                        int iG = afpt.g(blrVar.b.a(iE), 0, deuVar.a());
                        long jB = bffVarD.b(j4) >> 32;
                        dft dftVar = bffVarD.a;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) jB);
                        int iG2 = dftVar.g(iG);
                        float fB = dftVar.b(iG2);
                        float fC = dftVar.c(iG2);
                        float fD = afpt.d(fIntBitsToFloat, Math.min(fB, fC), Math.max(fB, fC));
                        if (a.j(j3, 0L) || Math.abs(fIntBitsToFloat - fD) <= ((int) (j3 >> 32)) / 2) {
                            float fD2 = dftVar.d(iG2);
                            jFloatToRawIntBits = (Float.floatToRawIntBits(fD) << 32) | (Float.floatToRawIntBits(((dftVar.a(iG2) - fD2) / 2.0f) + fD2) & 4294967295L);
                        }
                    }
                }
                return new cja(jFloatToRawIntBits);
        }
    }

    public /* synthetic */ aiy(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
