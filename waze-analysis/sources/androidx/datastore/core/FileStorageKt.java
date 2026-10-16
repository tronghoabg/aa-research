package androidx.datastore.core;

import h.c.b.a.c;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FileStorageKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.FileStorageKt$runFileDiagnosticsIfNotCorruption$1, reason: invalid class name */
    final class AnonymousClass1<T> extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileStorageKt.runFileDiagnosticsIfNotCorruption(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object runFileDiagnosticsIfNotCorruption(java.io.File r4, h.g.a.l<? super h.c.e<? super T>, ? extends java.lang.Object> r5, h.c.e<? super T> r6) throws java.io.IOException {
        /*
            boolean r0 = r6 instanceof androidx.datastore.core.FileStorageKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.core.FileStorageKt$runFileDiagnosticsIfNotCorruption$1 r0 = (androidx.datastore.core.FileStorageKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.FileStorageKt$runFileDiagnosticsIfNotCorruption$1 r0 = new androidx.datastore.core.FileStorageKt$runFileDiagnosticsIfNotCorruption$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r4 = r0.L$1
            h.g.a.l r4 = (h.g.a.l) r4
            java.lang.Object r4 = r0.L$0
            java.io.File r4 = (java.io.File) r4
            e.b.c.b(r6)     // Catch: java.io.IOException -> L2f
            return r6
        L2f:
            r5 = move-exception
            goto L4b
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            e.b.c.b(r6)
            r0.L$0 = r4     // Catch: java.io.IOException -> L2f
            r6 = 0
            r0.L$1 = r6     // Catch: java.io.IOException -> L2f
            r0.label = r3     // Catch: java.io.IOException -> L2f
            java.lang.Object r4 = r5.invoke(r0)     // Catch: java.io.IOException -> L2f
            if (r4 != r1) goto L4a
            return r1
        L4a:
            return r4
        L4b:
            boolean r6 = r5 instanceof androidx.datastore.core.CorruptionException
            if (r6 == 0) goto L50
            throw r5
        L50:
            androidx.datastore.core.FileDiagnostics r6 = androidx.datastore.core.FileDiagnostics.INSTANCE
            java.io.IOException r4 = r6.attachFileDebugInfo(r4, r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.FileStorageKt.runFileDiagnosticsIfNotCorruption(java.io.File, h.g.a.l, h.c.e):java.lang.Object");
    }
}
