package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class cgb extends afde implements afeg {
    int a;
    final /* synthetic */ afec b;
    final /* synthetic */ AtomicReference c;
    final /* synthetic */ afeg d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgb(afec afecVar, AtomicReference atomicReference, afeg afegVar, afck afckVar) {
        super(2, afckVar);
        this.b = afecVar;
        this.c = atomicReference;
        this.d = afegVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        cgb cgbVar = new cgb(this.b, this.c, this.d, afckVar);
        cgbVar.e = obj;
        return cgbVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (defpackage.affx.b(r6.b, r5) != r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r6 != r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r6v8, types: [aivh, java.lang.Object] */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r5.a
            r2 = 1
            if (r1 == 0) goto L17
            java.lang.Object r3 = r5.e
            sx r3 = (defpackage.sx) r3
            if (r1 == r2) goto L13
            defpackage.woy.dF(r6)     // Catch: java.lang.Throwable -> L11
            goto L57
        L11:
            r6 = move-exception
            goto L5e
        L13:
            defpackage.woy.dF(r6)
            goto L48
        L17:
            defpackage.woy.dF(r6)
            java.lang.Object r6 = r5.e
            aitx r6 = (defpackage.aitx) r6
            sx r1 = new sx
            afco r3 = r6.c()
            aivh r3 = defpackage.affx.d(r3)
            afec r4 = r5.b
            java.lang.Object r6 = r4.invoke(r6)
            r1.<init>(r3, r6)
            java.util.concurrent.atomic.AtomicReference r6 = r5.c
            java.lang.Object r6 = r6.getAndSet(r1)
            sx r6 = (defpackage.sx) r6
            if (r6 == 0) goto L47
            r5.e = r1
            r5.a = r2
            java.lang.Object r6 = r6.b
            java.lang.Object r6 = defpackage.affx.b(r6, r5)
            if (r6 == r0) goto L5d
        L47:
            r3 = r1
        L48:
            afeg r6 = r5.d     // Catch: java.lang.Throwable -> L11
            java.lang.Object r1 = r3.a     // Catch: java.lang.Throwable -> L11
            r5.e = r3     // Catch: java.lang.Throwable -> L11
            r2 = 2
            r5.a = r2     // Catch: java.lang.Throwable -> L11
            java.lang.Object r6 = r6.invoke(r1, r5)     // Catch: java.lang.Throwable -> L11
            if (r6 == r0) goto L5d
        L57:
            java.util.concurrent.atomic.AtomicReference r5 = r5.c
            defpackage.a.q(r5, r3)
            return r6
        L5d:
            return r0
        L5e:
            java.util.concurrent.atomic.AtomicReference r5 = r5.c
            defpackage.a.q(r5, r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgb.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((cgb) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
