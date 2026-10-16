package androidx.compose.runtime;

import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.p;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1 extends g implements p<l, e<? super ab>, Object> {
    final /* synthetic */ a $block;
    final /* synthetic */ SnapshotFlowManager $externalManager;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1(SnapshotFlowManager snapshotFlowManager, a aVar, e<? super SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1> eVar) {
        super(2, eVar);
        this.$externalManager = snapshotFlowManager;
        this.$block = aVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1 snapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1 = new SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1(this.$externalManager, this.$block, eVar);
        snapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1.L$0 = obj;
        return snapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1;
    }

    @Override // h.g.a.p
    public final Object invoke(l lVar, e<? super ab> eVar) {
        return ((SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1) create(lVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:27:0x0079, B:31:0x009b], limit reached: 41 */
    /* JADX WARN: Path cross not found for [B:31:0x009b, B:27:0x0079], limit reached: 41 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c A[Catch: all -> 0x0040, PHI: r1 r4 r5 r6
  0x008c: PHI (r1v5 java.lang.Object) = (r1v10 java.lang.Object), (r1v13 java.lang.Object) binds: [B:28:0x008a, B:11:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x008c: PHI (r4v7 kotlinx.coroutines.a.o) = (r4v18 kotlinx.coroutines.a.o), (r4v19 kotlinx.coroutines.a.o) binds: [B:28:0x008a, B:11:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x008c: PHI (r5v3 androidx.compose.runtime.SnapshotFlowManager) = (r5v4 androidx.compose.runtime.SnapshotFlowManager), (r5v8 androidx.compose.runtime.SnapshotFlowManager) binds: [B:28:0x008a, B:11:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x008c: PHI (r6v2 kotlinx.coroutines.b.l) = (r6v3 kotlinx.coroutines.b.l), (r6v7 kotlinx.coroutines.b.l) binds: [B:28:0x008a, B:11:0x002a] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0040, blocks: (B:15:0x003c, B:27:0x0079, B:29:0x008c, B:31:0x009b, B:11:0x002a), top: B:41:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:15:0x003c, B:27:0x0079, B:29:0x008c, B:31:0x009b, B:11:0x002a), top: B:41:0x0007 }] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlinx.coroutines.a.o] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0099 -> B:27:0x0079). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ae -> B:27:0x0079). Please report as a decompilation issue!!! */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r8.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L43
            if (r1 == r4) goto L2e
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            java.lang.Object r1 = r8.L$3
            java.lang.Object r4 = r8.L$2
            goto L32
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L1c:
            java.lang.Object r1 = r8.L$3
            java.lang.Object r4 = r8.L$2
            kotlinx.coroutines.a.o r4 = (kotlinx.coroutines.a.o) r4
            java.lang.Object r5 = r8.L$1
            androidx.compose.runtime.SnapshotFlowManager r5 = (androidx.compose.runtime.SnapshotFlowManager) r5
            java.lang.Object r6 = r8.L$0
            kotlinx.coroutines.b.l r6 = (kotlinx.coroutines.b.l) r6
            e.b.c.b(r9)     // Catch: java.lang.Throwable -> L40
            goto L8c
        L2e:
            java.lang.Object r1 = r8.L$3
            java.lang.Object r4 = r8.L$2
        L32:
            kotlinx.coroutines.a.o r4 = (kotlinx.coroutines.a.o) r4
            java.lang.Object r5 = r8.L$1
            androidx.compose.runtime.SnapshotFlowManager r5 = (androidx.compose.runtime.SnapshotFlowManager) r5
            java.lang.Object r6 = r8.L$0
            kotlinx.coroutines.b.l r6 = (kotlinx.coroutines.b.l) r6
            e.b.c.b(r9)     // Catch: java.lang.Throwable -> L40
            goto L79
        L40:
            r9 = move-exception
            goto Lb4
        L43:
            e.b.c.b(r9)
            java.lang.Object r9 = r8.L$0
            r6 = r9
            kotlinx.coroutines.b.l r6 = (kotlinx.coroutines.b.l) r6
            androidx.compose.runtime.SnapshotFlowManager r9 = r8.$externalManager
            if (r9 != 0) goto L54
            androidx.compose.runtime.SnapshotFlowManager r9 = new androidx.compose.runtime.SnapshotFlowManager
            r9.<init>()
        L54:
            r5 = r9
            r9 = 6
            r1 = 0
            kotlinx.coroutines.a.o r9 = h.g.b.w.c(r4, r1, r1, r9)
            r1 = r9
            kotlinx.coroutines.a.ag r1 = (kotlinx.coroutines.a.ag) r1     // Catch: java.lang.Throwable -> Lb1
            h.g.a.a r7 = r8.$block     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object r1 = r5.runAndWatch$runtime(r1, r7)     // Catch: java.lang.Throwable -> Lb1
            r7 = r8
            h.c.e r7 = (h.c.e) r7     // Catch: java.lang.Throwable -> Lb1
            r8.L$0 = r6     // Catch: java.lang.Throwable -> Lb1
            r8.L$1 = r5     // Catch: java.lang.Throwable -> Lb1
            r8.L$2 = r9     // Catch: java.lang.Throwable -> Lb1
            r8.L$3 = r1     // Catch: java.lang.Throwable -> Lb1
            r8.label = r4     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object r4 = r6.emit(r1, r7)     // Catch: java.lang.Throwable -> Lb1
            if (r4 != r0) goto L78
            goto Lb0
        L78:
            r4 = r9
        L79:
            r9 = r8
            h.c.e r9 = (h.c.e) r9     // Catch: java.lang.Throwable -> L40
            r8.L$0 = r6     // Catch: java.lang.Throwable -> L40
            r8.L$1 = r5     // Catch: java.lang.Throwable -> L40
            r8.L$2 = r4     // Catch: java.lang.Throwable -> L40
            r8.L$3 = r1     // Catch: java.lang.Throwable -> L40
            r8.label = r3     // Catch: java.lang.Throwable -> L40
            java.lang.Object r9 = r4.d(r9)     // Catch: java.lang.Throwable -> L40
            if (r9 == r0) goto Lb0
        L8c:
            r9 = r4
            kotlinx.coroutines.a.ag r9 = (kotlinx.coroutines.a.ag) r9     // Catch: java.lang.Throwable -> L40
            h.g.a.a r7 = r8.$block     // Catch: java.lang.Throwable -> L40
            java.lang.Object r9 = r5.runAndWatch$runtime(r9, r7)     // Catch: java.lang.Throwable -> L40
            boolean r7 = h.g.b.x.n(r9, r1)     // Catch: java.lang.Throwable -> L40
            if (r7 != 0) goto L79
            r1 = r8
            h.c.e r1 = (h.c.e) r1     // Catch: java.lang.Throwable -> L40
            r8.L$0 = r6     // Catch: java.lang.Throwable -> L40
            r8.L$1 = r5     // Catch: java.lang.Throwable -> L40
            r8.L$2 = r4     // Catch: java.lang.Throwable -> L40
            r8.L$3 = r9     // Catch: java.lang.Throwable -> L40
            r8.label = r2     // Catch: java.lang.Throwable -> L40
            java.lang.Object r1 = r6.emit(r9, r1)     // Catch: java.lang.Throwable -> L40
            if (r1 == r0) goto Lb0
            r1 = r9
            goto L79
        Lb0:
            return r0
        Lb1:
            r0 = move-exception
            r4 = r9
            r9 = r0
        Lb4:
            kotlinx.coroutines.a.ag r4 = (kotlinx.coroutines.a.ag) r4
            r5.reportSnapshotFlowCancellation$runtime(r4)
            androidx.compose.runtime.SnapshotFlowManager r8 = r8.$externalManager
            if (r8 != 0) goto Lc0
            r5.dispose()
        Lc0:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
