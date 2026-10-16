package androidx.tracing;

import h.c.b.a.c;
import h.c.e;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class TraceKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.tracing.TraceKt$traceAsync$1, reason: invalid class name */
    final class AnonymousClass1<T> extends c {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TraceKt.traceAsync(null, 0, null, this);
        }
    }

    public static final <T> T trace(h.g.a.a<String> aVar, h.g.a.a<? extends T> aVar2) {
        boolean zIsEnabled = Trace.isEnabled();
        if (zIsEnabled) {
            Trace.beginSection(aVar.invoke());
        }
        try {
            T tInvoke = aVar2.invoke();
            if (zIsEnabled) {
                Trace.endSection();
            }
            return tInvoke;
        } catch (Throwable th) {
            if (zIsEnabled) {
                Trace.endSection();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object traceAsync(java.lang.String r4, int r5, h.g.a.l<? super h.c.e<? super T>, ? extends java.lang.Object> r6, h.c.e<? super T> r7) {
        /*
            boolean r0 = r7 instanceof androidx.tracing.TraceKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.tracing.TraceKt$traceAsync$1 r0 = (androidx.tracing.TraceKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.tracing.TraceKt$traceAsync$1 r0 = new androidx.tracing.TraceKt$traceAsync$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r5 = r0.I$0
            java.lang.Object r4 = r0.L$0
            java.lang.String r4 = (java.lang.String) r4
            e.b.c.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4a
        L2d:
            r6 = move-exception
            goto L4e
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            e.b.c.b(r7)
            androidx.tracing.Trace.beginAsyncSection(r4, r5)
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L2d
            r0.I$0 = r5     // Catch: java.lang.Throwable -> L2d
            r0.label = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r7 = r6.invoke(r0)     // Catch: java.lang.Throwable -> L2d
            if (r7 != r1) goto L4a
            return r1
        L4a:
            androidx.tracing.Trace.endAsyncSection(r4, r5)
            return r7
        L4e:
            androidx.tracing.Trace.endAsyncSection(r4, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.tracing.TraceKt.traceAsync(java.lang.String, int, h.g.a.l, h.c.e):java.lang.Object");
    }

    private static final <T> Object traceAsync$$forInline(String str, int i2, l<? super e<? super T>, ? extends Object> lVar, e<? super T> eVar) {
        Trace.beginAsyncSection(str, i2);
        try {
            return lVar.invoke(eVar);
        } finally {
            Trace.endAsyncSection(str, i2);
        }
    }

    public static final <T> T trace(String str, h.g.a.a<? extends T> aVar) {
        Trace.beginSection(str);
        try {
            return aVar.invoke();
        } finally {
            Trace.endSection();
        }
    }

    public static final <T> T traceAsync(h.g.a.a<String> aVar, h.g.a.a<Integer> aVar2, h.g.a.a<? extends T> aVar3) {
        int iIntValue;
        String strInvoke;
        if (Trace.isEnabled()) {
            strInvoke = aVar.invoke();
            iIntValue = aVar2.invoke().intValue();
            Trace.beginAsyncSection(strInvoke, iIntValue);
        } else {
            iIntValue = 0;
            strInvoke = null;
        }
        try {
            T tInvoke = aVar3.invoke();
            if (strInvoke != null) {
                Trace.endAsyncSection(strInvoke, iIntValue);
            }
            return tInvoke;
        } catch (Throwable th) {
            if (strInvoke != null) {
                Trace.endAsyncSection(strInvoke, iIntValue);
            }
            throw th;
        }
    }
}
