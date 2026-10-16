package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class nld extends afde implements afeg {
    int a;
    final /* synthetic */ int b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nld(kjk kjkVar, npe npeVar, int i, bym bymVar, afck afckVar, int i2) {
        super(2, afckVar);
        this.f = i2;
        this.c = kjkVar;
        this.d = npeVar;
        this.b = i;
        this.e = bymVar;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [aixl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [bym, java.lang.Object] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.f;
        if (i == 0) {
            Object obj2 = this.c;
            return new nld((kjk) obj2, (npe) this.d, this.b, (bym) this.e, afckVar, 0);
        }
        if (i == 1) {
            return new nld((kjz) this.c, (List) this.d, this.b, (qn) this.e, afckVar, 1);
        }
        Object obj3 = this.d;
        return new nld((aiyk[]) obj3, this.b, (AtomicInteger) this.e, (aixl) this.c, afckVar, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c8, code lost:
    
        if (((defpackage.npe) r7).b(0, r6) == r0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e0, code lost:
    
        if (((defpackage.npe) r7).b(r1, r6) == r0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f6, code lost:
    
        if (((defpackage.npe) r1).b(r7, r6) == r0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f8, code lost:
    
        return r0;
     */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [aixl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10, types: [aixy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12, types: [aixy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [bym, java.lang.Object] */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nld.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.f;
        if (i == 0) {
            return ((nld) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i != 1) {
            return ((nld) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        return ((nld) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nld(kjz kjzVar, List list, int i, qn qnVar, afck afckVar, int i2) {
        super(2, afckVar);
        this.f = i2;
        this.c = kjzVar;
        this.d = list;
        this.b = i;
        this.e = qnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nld(aiyk[] aiykVarArr, int i, AtomicInteger atomicInteger, aixl aixlVar, afck afckVar, int i2) {
        super(2, afckVar);
        this.f = i2;
        this.d = aiykVarArr;
        this.b = i;
        this.e = atomicInteger;
        this.c = aixlVar;
    }
}
