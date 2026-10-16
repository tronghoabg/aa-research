package defpackage;

import j$.time.Duration;

/* loaded from: classes3.dex */
public final class tci extends afde implements afeg {
    int a;
    final /* synthetic */ Duration b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tci(Duration duration, afck afckVar) {
        super(2, afckVar);
        this.b = duration;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        tci tciVar = new tci(this.b, afckVar);
        tciVar.c = obj;
        return tciVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
    
        if (r1 != 1) goto L8;
     */
    /* JADX WARN: Path cross not found for [B:8:0x0019, B:10:0x0025], limit reached: 12 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025 A[PHI: r3
  0x0025: PHI (r3v3 sx) = (r3v2 sx), (r3v5 sx) binds: [B:9:0x0023, B:5:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0023 -> B:10:0x0025). Please report as a decompilation issue!!! */
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
            r2 = 1
            if (r1 == 0) goto L11
            java.lang.Object r3 = r6.c
            sx r3 = (defpackage.sx) r3
            defpackage.woy.dF(r7)
            if (r1 == r2) goto L25
            goto L19
        L11:
            defpackage.woy.dF(r7)
            java.lang.Object r7 = r6.c
            r3 = r7
            sx r3 = (defpackage.sx) r3
        L19:
            afak r7 = defpackage.afak.a
            r6.c = r3
            r6.a = r2
            java.lang.Object r7 = r3.t(r7, r6)
            if (r7 == r0) goto L36
        L25:
            j$.time.Duration r7 = r6.b
            long r4 = r7.toMillis()
            r6.c = r3
            r7 = 2
            r6.a = r7
            java.lang.Object r7 = defpackage.aiow.c(r4, r6)
            if (r7 != r0) goto L19
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tci.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((tci) b((sx) obj, (afck) obj2)).hT(afak.a);
    }
}
