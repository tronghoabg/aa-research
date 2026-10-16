package androidx.datastore.core;

import androidx.tracing.PropagationToken;
import androidx.tracing.Tracer;
import h.c.a.a;
import h.c.b.a.c;
import h.c.e;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DataStoreTracer_androidKt {
    private static final String TRACE_CATEGORY = "androidx.datastore";

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.DataStoreTracer_androidKt$trace$1, reason: invalid class name */
    final class AnonymousClass1<R> extends c {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DataStoreTracer_androidKt.trace(null, null, null, null, this);
        }
    }

    public static final Object captureTraceToken(Tracer tracer, e<? super PropagationToken> eVar) {
        if (tracer == null) {
            return null;
        }
        Object obj = tracer.tokenFromCoroutineContext(eVar);
        return obj == a.f48038a ? obj : (PropagationToken) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0212, code lost:
    
        if (r15 == r0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02f5, code lost:
    
        if (r15 == r0) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b2 A[Catch: all -> 0x021c, TryCatch #3 {all -> 0x021c, blocks: (B:41:0x01aa, B:43:0x01b2, B:46:0x01ea), top: B:93:0x01aa }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ea A[Catch: all -> 0x021c, TRY_LEAVE, TryCatch #3 {all -> 0x021c, blocks: (B:41:0x01aa, B:43:0x01b2, B:46:0x01ea), top: B:93:0x01aa }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x029e A[Catch: all -> 0x02fe, TryCatch #5 {all -> 0x02fe, blocks: (B:66:0x0296, B:68:0x029e, B:71:0x02d1), top: B:96:0x0296 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02d1 A[Catch: all -> 0x02fe, TRY_LEAVE, TryCatch #5 {all -> 0x02fe, blocks: (B:66:0x0296, B:68:0x029e, B:71:0x02d1), top: B:96:0x0296 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <R> java.lang.Object trace(androidx.tracing.Tracer r11, java.lang.String r12, androidx.tracing.PropagationToken r13, h.g.a.l<? super h.c.e<? super R>, ? extends java.lang.Object> r14, h.c.e<? super R> r15) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreTracer_androidKt.trace(androidx.tracing.Tracer, java.lang.String, androidx.tracing.PropagationToken, h.g.a.l, h.c.e):java.lang.Object");
    }

    public static /* synthetic */ Object trace$default(Tracer tracer, String str, PropagationToken propagationToken, l lVar, e eVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            propagationToken = null;
        }
        return trace(tracer, str, propagationToken, lVar, eVar);
    }
}
