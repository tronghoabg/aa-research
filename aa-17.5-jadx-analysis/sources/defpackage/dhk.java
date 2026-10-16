package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.List;

/* loaded from: classes.dex */
public final class dhk implements bym {
    public boolean a = true;
    public final lds b;
    private final List c;
    private final dik d;
    private final afec e;
    private final bwq f;
    private final nfh g;

    public dhk(List list, Object obj, dik dikVar, nfh nfhVar, afec afecVar, lds ldsVar) {
        this.c = list;
        this.d = dikVar;
        this.g = nfhVar;
        this.e = afecVar;
        this.b = ldsVar;
        this.f = new ParcelableSnapshotMutableState(obj, bxp.c);
    }

    @Override // defpackage.bym
    public final Object a() {
        return this.f.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
    
        if (defpackage.affz.o(r0) != r1) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057 A[Catch: all -> 0x00c3, TryCatch #0 {all -> 0x00c3, blocks: (B:13:0x002e, B:23:0x0057, B:25:0x0067, B:30:0x0085, B:33:0x00b1, B:18:0x0043, B:21:0x004d), top: B:44:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085 A[Catch: all -> 0x00c3, TRY_LEAVE, TryCatch #0 {all -> 0x00c3, blocks: (B:13:0x002e, B:23:0x0057, B:25:0x0067, B:30:0x0085, B:33:0x00b1, B:18:0x0043, B:21:0x004d), top: B:44:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1 A[Catch: all -> 0x00c3, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00c3, blocks: (B:13:0x002e, B:23:0x0057, B:25:0x0067, B:30:0x0085, B:33:0x00b1, B:18:0x0043, B:21:0x004d), top: B:44:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0065 -> B:39:0x00c5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00bf -> B:39:0x00c5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.afck r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhk.b(afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.dhr r6, defpackage.afck r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dhj
            if (r0 == 0) goto L13
            r0 = r7
            dhj r0 = (defpackage.dhj) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dhj r0 = new dhj
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            afcr r1 = defpackage.afcr.a
            int r2 = r0.d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r6 = r0.a
            defpackage.woy.dF(r7)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L75
            return r7
        L2a:
            r5 = move-exception
            goto L4c
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            defpackage.woy.dF(r7)
            beh r7 = new beh     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L75
            r2 = 8
            r7.<init>(r5, r6, r4, r2)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L75
            r0.a = r6     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L75
            r0.d = r3     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L75
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r5 = defpackage.aikc.b(r2, r7, r0)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L75
            if (r5 != r1) goto L4b
            return r1
        L4b:
            return r5
        L4c:
            afco r7 = r0.hH()
            bwi r1 = kotlinx.coroutines.CoroutineExceptionHandler.c
            afcm r7 = r7.get(r1)
            kotlinx.coroutines.CoroutineExceptionHandler r7 = (kotlinx.coroutines.CoroutineExceptionHandler) r7
            if (r7 != 0) goto L5b
            goto L80
        L5b:
            afco r0 = r0.hH()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.util.Objects.toString(r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r2 = "Unable to load font "
            java.lang.String r6 = r2.concat(r6)
            r1.<init>(r6, r5)
            r7.handleException(r0, r1)
            return r4
        L75:
            r5 = move-exception
            afco r6 = r0.hH()
            boolean r6 = defpackage.affx.h(r6)
            if (r6 == 0) goto L81
        L80:
            return r4
        L81:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhk.c(dhr, afck):java.lang.Object");
    }
}
