package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class afbp extends afdd implements afeg {
    Object a;
    int b;
    int c;
    final /* synthetic */ Iterator d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afbp(Iterator it, afck afckVar) {
        super(afckVar);
        this.d = it;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        afbp afbpVar = new afbp(this.d, afckVar);
        afbpVar.e = obj;
        return afbpVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        r8.e = r6;
        r8.a = r4;
        r8.b = r5;
        r8.c = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (r6.a(r1, r8) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        r9 = r5;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        if (r6.a(r1, r8) == r0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0053 -> B:18:0x0054). Please report as a decompilation issue!!! */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r8.c
            r2 = 1
            r3 = 3
            if (r1 == 0) goto L1c
            if (r1 == r2) goto Le
            defpackage.woy.dF(r9)
            goto L70
        Le:
            int r1 = r8.b
            java.lang.Object r4 = r8.a
            java.lang.Object r5 = r8.e
            airr r5 = (defpackage.airr) r5
            defpackage.woy.dF(r9)
            r9 = r1
            r6 = r5
            goto L54
        L1c:
            defpackage.woy.dF(r9)
            java.lang.Object r9 = r8.e
            airr r9 = (defpackage.airr) r9
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r3)
            java.util.Iterator r4 = r8.d
            r5 = 0
            r6 = r9
            r9 = r5
        L2d:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L5b
            java.lang.Object r7 = r4.next()
            if (r9 <= 0) goto L3c
            int r9 = r9 + (-1)
            goto L2d
        L3c:
            r1.add(r7)
            int r7 = r1.size()
            if (r7 != r3) goto L2d
            r8.e = r6
            r8.a = r4
            r8.b = r5
            r8.c = r2
            java.lang.Object r9 = r6.a(r1, r8)
            if (r9 == r0) goto L6f
            r9 = r5
        L54:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r3)
            r5 = r9
            goto L2d
        L5b:
            boolean r9 = r1.isEmpty()
            if (r9 != 0) goto L70
            r9 = 0
            r8.e = r9
            r8.a = r9
            r9 = 2
            r8.c = r9
            java.lang.Object r8 = r6.a(r1, r8)
            if (r8 != r0) goto L70
        L6f:
            return r0
        L70:
            afak r8 = defpackage.afak.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afbp.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((afbp) b((airr) obj, (afck) obj2)).hT(afak.a);
    }
}
