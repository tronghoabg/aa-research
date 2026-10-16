package defpackage;

/* loaded from: classes2.dex */
public final class fxd implements afeg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public fxd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v17, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v19, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [afeg, java.lang.Object] */
    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.b;
        if (i == 0) {
            bux buxVar = (bux) obj;
            ((Number) obj2).intValue();
            buxVar.v(439090081);
            long jH = cjv.h(((cjv) this.a.invoke(buxVar, 0)).a, 0.38f);
            buxVar.o();
            return new cjv(jH);
        }
        if (i == 1) {
            bux buxVar2 = (bux) obj;
            ((Number) obj2).intValue();
            buxVar2.v(494576921);
            long j = ((cjv) this.a.invoke(buxVar2, 0)).a;
            long jH2 = !a.j(j, cjn.i(0)) ? cjv.h(j, 0.38f) : cjn.i(0);
            buxVar2.o();
            return new cjv(jH2);
        }
        if (i == 2) {
            bux buxVar3 = (bux) obj;
            int iIntValue = ((Number) obj2).intValue();
            if (buxVar3.I((iIntValue & 3) != 2, iIntValue & 1)) {
                ?? r7 = this.a;
                if (r7 == 0) {
                    buxVar3.v(-1648989835);
                } else {
                    buxVar3.v(500996108);
                    r7.invoke(buxVar3, 0);
                }
                buxVar3.o();
            } else {
                buxVar3.s();
            }
            return afak.a;
        }
        if (i == 3) {
            bux buxVar4 = (bux) obj;
            int iIntValue2 = ((Number) obj2).intValue();
            if (buxVar4.I((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                ?? r72 = this.a;
                if (r72 == 0) {
                    buxVar4.v(-1371707061);
                } else {
                    buxVar4.v(925582710);
                    r72.invoke(buxVar4, 0);
                }
                buxVar4.o();
            } else {
                buxVar4.s();
            }
            return afak.a;
        }
        if (i != 4) {
            long j2 = ((dlq) obj).a;
            this.a.b(new dlq(((dlq) obj2).a));
            return afak.a;
        }
        bux buxVar5 = (bux) obj;
        int iIntValue3 = ((Number) obj2).intValue();
        if (buxVar5.I((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
            ?? r73 = this.a;
            if (r73 == 0) {
                buxVar5.v(-365798469);
            } else {
                buxVar5.v(680936710);
                r73.invoke(buxVar5, 0);
            }
            buxVar5.o();
        } else {
            buxVar5.s();
        }
        return afak.a;
    }
}
