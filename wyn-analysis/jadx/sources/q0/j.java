package Q0;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f9658a = new boolean[3];

    /* JADX WARN: Removed duplicated region for block: B:189:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0685 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:410:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x06d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x06ec A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(Q0.e r39, O0.c r40, java.util.ArrayList r41, int r42) {
        /*
            Method dump skipped, instructions count: 1787
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.j.a(Q0.e, O0.c, java.util.ArrayList, int):void");
    }

    public static void b(e eVar, O0.c cVar, d dVar) {
        dVar.f9567o = -1;
        dVar.f9569p = -1;
        int i5 = eVar.f9570p0[0];
        int[] iArr = dVar.f9570p0;
        if (i5 != 2 && iArr[0] == 4) {
            c cVar2 = dVar.f9523I;
            int i10 = cVar2.f9512g;
            int iQ = eVar.q();
            c cVar3 = dVar.f9525K;
            int i11 = iQ - cVar3.f9512g;
            cVar2.f9514i = cVar.k(cVar2);
            cVar3.f9514i = cVar.k(cVar3);
            cVar.d(cVar2.f9514i, i10);
            cVar.d(cVar3.f9514i, i11);
            dVar.f9567o = 2;
            dVar.f9538Y = i10;
            int i12 = i11 - i10;
            dVar.f9534U = i12;
            int i13 = dVar.f9543b0;
            if (i12 < i13) {
                dVar.f9534U = i13;
            }
        }
        if (eVar.f9570p0[1] == 2 || iArr[1] != 4) {
            return;
        }
        c cVar4 = dVar.f9524J;
        int i14 = cVar4.f9512g;
        int iK = eVar.k();
        c cVar5 = dVar.L;
        int i15 = iK - cVar5.f9512g;
        cVar4.f9514i = cVar.k(cVar4);
        cVar5.f9514i = cVar.k(cVar5);
        cVar.d(cVar4.f9514i, i14);
        cVar.d(cVar5.f9514i, i15);
        if (dVar.f9541a0 > 0 || dVar.f9553g0 == 8) {
            c cVar6 = dVar.f9526M;
            O0.f fVarK = cVar.k(cVar6);
            cVar6.f9514i = fVarK;
            cVar.d(fVarK, dVar.f9541a0 + i14);
        }
        dVar.f9569p = 2;
        dVar.f9539Z = i14;
        int i16 = i15 - i14;
        dVar.f9535V = i16;
        int i17 = dVar.f9545c0;
        if (i16 < i17) {
            dVar.f9535V = i17;
        }
    }

    public static final boolean c(int i5, int i10) {
        return (i5 & i10) == i10;
    }
}
