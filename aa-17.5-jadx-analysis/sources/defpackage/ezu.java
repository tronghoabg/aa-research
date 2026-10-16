package defpackage;

import java.io.File;

/* loaded from: classes2.dex */
public final class ezu extends afde implements afeg {
    Object a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezu(ezv ezvVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.d = ezvVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.e;
        Object obj2 = this.d;
        if (i != 0) {
            ezu ezuVar = new ezu((File) obj2, afckVar, 1);
            ezuVar.c = obj;
            return ezuVar;
        }
        ezu ezuVar2 = new ezu((ezv) obj2, afckVar, 0);
        ezuVar2.c = obj;
        return ezuVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008b, code lost:
    
        if (defpackage.aimh.a(r1, r6, r20) == r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x013a, code lost:
    
        if (r5.d(r4, r6, r20) == r1) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.concurrent.locks.ReentrantLock] */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ezu.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.e != 0) {
            return ((ezu) b((aixv) obj, (afck) obj2)).hT(afak.a);
        }
        return ((ezu) b((faf) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezu(File file, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.d = file;
    }
}
