package defpackage;

import java.util.List;

/* loaded from: classes.dex */
final class bxm extends afde implements afeh {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    Object g;
    Object h;
    int i;
    /* synthetic */ Object j;
    final /* synthetic */ bxn k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxm(bxn bxnVar, afck afckVar) {
        super(3, afckVar);
        this.k = bxnVar;
    }

    public static final void c(List list, bxn bxnVar) {
        list.clear();
        synchronized (bxnVar.c) {
            List list2 = bxnVar.g;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                list.add((bwl) list2.get(i));
            }
            list2.clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.bxn r22, java.util.List r23, java.util.List r24, java.util.List r25, defpackage.aap r26, defpackage.aap r27, defpackage.aap r28, defpackage.aap r29) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxm.d(bxn, java.util.List, java.util.List, java.util.List, aap, aap, aap, aap):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x011b, code lost:
    
        if (r12 == r1) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:52:0x0172, B:64:0x01ae], limit reached: 103 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008d A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01dd A[Catch: all -> 0x0262, LOOP:0: B:67:0x01db->B:68:0x01dd, LOOP_END, TryCatch #1 {, blocks: (B:41:0x0128, B:43:0x0130, B:45:0x0136, B:66:0x01b7, B:68:0x01dd, B:69:0x01f2, B:47:0x0142, B:50:0x015b, B:52:0x0172, B:53:0x0177, B:55:0x0180, B:57:0x018a, B:59:0x0195, B:62:0x01a7, B:60:0x019e, B:65:0x01b0, B:70:0x01f8), top: B:91:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0265  */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [bwj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x011b -> B:39:0x0121). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x0265 -> B:10:0x0086). Please report as a decompilation issue!!! */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxm.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeh
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        bxm bxmVar = new bxm(this.k, (afck) obj3);
        bxmVar.j = (bwj) obj2;
        return bxmVar.hT(afak.a);
    }
}
