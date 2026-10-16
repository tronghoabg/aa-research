package defpackage;

/* loaded from: classes3.dex */
final class aiyo extends afde implements afeg {
    int a;
    final /* synthetic */ long b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiyo(long j, afck afckVar) {
        super(2, afckVar);
        this.b = j;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        aiyo aiyoVar = new aiyo(this.b, afckVar);
        aiyoVar.c = obj;
        return aiyoVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r1 != 2) goto L13;
     */
    /* JADX WARN: Path cross not found for [B:13:0x0032, B:15:0x003e], limit reached: 16 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e A[PHI: r3
  0x003e: PHI (r3v3 aixv) = (r3v2 aixv), (r3v7 aixv) binds: [B:14:0x003c, B:6:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003c -> B:15:0x003e). Please report as a decompilation issue!!! */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r6.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L14
            java.lang.Object r3 = r6.c
            aixv r3 = (defpackage.aixv) r3
            defpackage.woy.dF(r7)
            if (r1 == r2) goto L3e
            goto L32
        L14:
            java.lang.Object r1 = r6.c
            r3 = r1
            aixv r3 = (defpackage.aixv) r3
            defpackage.woy.dF(r7)
            goto L32
        L1d:
            defpackage.woy.dF(r7)
            java.lang.Object r7 = r6.c
            aixv r7 = (defpackage.aixv) r7
            long r4 = r6.b
            r6.c = r7
            r6.a = r3
            java.lang.Object r1 = defpackage.aiow.c(r4, r6)
            if (r1 != r0) goto L31
            goto L4b
        L31:
            r3 = r7
        L32:
            afak r7 = defpackage.afak.a
            r6.c = r3
            r6.a = r2
            java.lang.Object r7 = r3.h(r7, r6)
            if (r7 == r0) goto L4b
        L3e:
            r6.c = r3
            r7 = 3
            r6.a = r7
            long r4 = r6.b
            java.lang.Object r7 = defpackage.aiow.c(r4, r6)
            if (r7 != r0) goto L32
        L4b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiyo.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aiyo) b((aixv) obj, (afck) obj2)).hT(afak.a);
    }
}
