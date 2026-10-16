package defpackage;

/* loaded from: classes.dex */
final class afg extends afde implements afeg {
    Object a;
    int b;
    final /* synthetic */ bwq c;
    final /* synthetic */ afh d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afg(bwq bwqVar, afh afhVar, afck afckVar) {
        super(2, afckVar);
        this.c = bwqVar;
        this.d = afhVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        afg afgVar = new afg(this.c, this.d, afckVar);
        afgVar.e = obj;
        return afgVar;
    }

    /* JADX WARN: Path cross not found for [B:10:0x002f, B:14:0x0052], limit reached: 17 */
    /* JADX WARN: Path cross not found for [B:14:0x0052, B:10:0x002f], limit reached: 17 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048 A[PHI: r3 r8
  0x0048: PHI (r3v2 java.lang.Object) = (r3v3 java.lang.Object), (r3v5 java.lang.Object) binds: [B:11:0x0046, B:7:0x0013] A[DONT_GENERATE, DONT_INLINE]
  0x0048: PHI (r8v0 aitx) = (r8v1 aitx), (r8v3 aitx) binds: [B:11:0x0046, B:7:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0050 -> B:10:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0074 -> B:10:0x002f). Please report as a decompilation issue!!! */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r10.b
            r2 = 1
            if (r1 == 0) goto L1c
            java.lang.Object r3 = r10.a
            if (r1 == r2) goto L13
            java.lang.Object r1 = r10.e
            aitx r1 = (defpackage.aitx) r1
            defpackage.woy.dF(r11)
            goto L2e
        L13:
            java.lang.Object r1 = r10.e
            aitx r1 = (defpackage.aitx) r1
            defpackage.woy.dF(r11)
            r8 = r1
            goto L48
        L1c:
            defpackage.woy.dF(r11)
            java.lang.Object r11 = r10.e
            r1 = r11
            aitx r1 = (defpackage.aitx) r1
            affs r11 = new affs
            r11.<init>()
            r3 = 1065353216(0x3f800000, float:1.0)
            r11.a = r3
            r3 = r11
        L2e:
            r8 = r1
        L2f:
            afh r6 = r10.d
            afe r4 = new afe
            r7 = r3
            affs r7 = (defpackage.affs) r7
            bwq r5 = r10.c
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r10.e = r8
            r10.a = r3
            r10.b = r2
            java.lang.Object r11 = defpackage.afp.m(r4, r10)
            if (r11 == r0) goto L76
        L48:
            r11 = r3
            affs r11 = (defpackage.affs) r11
            float r11 = r11.a
            r1 = 0
            int r11 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r11 != 0) goto L2f
            nx r11 = new nx
            r1 = 9
            r11.<init>(r8, r1)
            byl r1 = new byl
            r4 = 0
            r1.<init>(r11, r4)
            aiyb r11 = new aiyb
            r11.<init>(r1)
            aff r1 = new aff
            r1.<init>(r4)
            r10.e = r8
            r10.a = r3
            r4 = 2
            r10.b = r4
            java.lang.Object r11 = defpackage.afpt.q(r11, r1, r10)
            if (r11 != r0) goto L2f
        L76:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afg.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((afg) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
