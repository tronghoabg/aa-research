package androidx.tracing;

import androidx.tracing.Tracer;
import h.ab;
import h.c.b.a.c;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class Tracer {
    public static final Companion Companion = new Companion(null);
    private static final PerfettoTracer stubTracer;
    private static Tracer tracer;

    /* compiled from: WazeSource */
    /* renamed from: androidx.tracing.Tracer$beginCoroutineSection$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
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
            return Tracer.this.beginCoroutineSection(null, null, null, false, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.tracing.Tracer$traceCoroutine$1, reason: invalid class name and case insensitive filesystem */
    final class C04771<T> extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C04771(e<? super C04771> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Tracer.this.traceCoroutine(null, null, null, false, null, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.tracing.Tracer$traceCoroutine$3, reason: invalid class name */
    public final class AnonymousClass3 extends g implements p<af, e, Object> {
        final /* synthetic */ l<e, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(l<? super e, ? extends Object> lVar, e<? super AnonymousClass3> eVar) {
            super(2, eVar);
            this.$block = lVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass3(this.$block, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e eVar) {
            return ((AnonymousClass3) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            l<e, Object> lVar = this.$block;
            this.label = 1;
            Object objInvoke = lVar.invoke(this);
            return objInvoke == aVar ? aVar : objInvoke;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            return this.$block.invoke(this);
        }
    }

    static {
        PerfettoTracer perfettoTracer = new PerfettoTracer(EmptyTraceContext.INSTANCE, new l() { // from class: androidx.tracing.Tracer$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                Tracer.Companion companion = Tracer.Companion;
                return false;
            }
        });
        stubTracer = perfettoTracer;
        tracer = perfettoTracer;
    }

    private final Object beginCoroutineSection$$forInline(String str, String str2, PropagationToken propagationToken, boolean z, l<? super EventMetadata, ab> lVar, e<? super EventMetadataCloseable> eVar) {
        EventMetadataCloseable eventMetadataCloseable = (EventMetadataCloseable) beginCoroutineSectionWithMetadata(str, str2, propagationToken, z, eVar);
        lVar.invoke(eventMetadataCloseable.metadata);
        eventMetadataCloseable.metadata.dispatchToTraceSink();
        return eventMetadataCloseable;
    }

    public static /* synthetic */ Object beginCoroutineSection$default(Tracer tracer2, String str, String str2, PropagationToken propagationToken, boolean z, l lVar, e eVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: beginCoroutineSection");
        }
        EventMetadataCloseable eventMetadataCloseable = (EventMetadataCloseable) tracer2.beginCoroutineSectionWithMetadata(str, str2, propagationToken, ((i2 & 8) == 0) & z, eVar);
        lVar.invoke(eventMetadataCloseable.metadata);
        eventMetadataCloseable.metadata.dispatchToTraceSink();
        return eventMetadataCloseable;
    }

    public static /* synthetic */ AutoCloseable beginSection$default(Tracer tracer2, String str, String str2, PropagationToken propagationToken, boolean z, l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: beginSection");
        }
        EventMetadataCloseable eventMetadataCloseableBeginSectionWithMetadata = tracer2.beginSectionWithMetadata(str, str2, propagationToken, z & ((i2 & 8) == 0));
        lVar.invoke(eventMetadataCloseableBeginSectionWithMetadata.metadata);
        eventMetadataCloseableBeginSectionWithMetadata.metadata.dispatchToTraceSink();
        return eventMetadataCloseableBeginSectionWithMetadata.closeable;
    }

    public static final Tracer getGlobal() {
        return Companion.getGlobal();
    }

    public static final Tracer getStubTracer() {
        return Companion.getStubTracer();
    }

    public static /* synthetic */ void instant$default(Tracer tracer2, String str, String str2, l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: instant");
        }
        if ((i2 & 4) != 0) {
            lVar = new l<EventMetadata, ab>() { // from class: androidx.tracing.Tracer.instant.1
                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ ab invoke(EventMetadata eventMetadata) {
                    return ab.f48028a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(EventMetadata eventMetadata) {
                }
            };
        }
        EventMetadataCloseable eventMetadataCloseableInstant = tracer2.instant(str, str2);
        lVar.invoke(eventMetadataCloseableInstant.metadata);
        eventMetadataCloseableInstant.metadata.dispatchToTraceSink();
    }

    @DelicateTracingApi
    public static final void setGlobalTracer(Tracer tracer2) {
        Companion.setGlobalTracer(tracer2);
    }

    static final boolean stubTracer$lambda$0(String str) {
        return false;
    }

    public static /* synthetic */ Object trace$default(Tracer tracer2, String str, String str2, PropagationToken propagationToken, boolean z, l lVar, h.g.a.a aVar, int i2, Object obj) throws Exception {
        EmptyCloseable emptyCloseable;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trace");
        }
        if ((i2 & 4) != 0) {
            propagationToken = null;
        }
        boolean z2 = z & ((i2 & 8) == 0);
        if ((i2 & 16) != 0) {
            lVar = new l<EventMetadata, ab>() { // from class: androidx.tracing.Tracer.trace.1
                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ ab invoke(EventMetadata eventMetadata) {
                    return ab.f48028a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(EventMetadata eventMetadata) {
                }
            };
        }
        if (tracer2.isCategoryEnabled(str)) {
            EventMetadataCloseable eventMetadataCloseableBeginSectionWithMetadata = tracer2.beginSectionWithMetadata(str, str2, propagationToken, z2);
            lVar.invoke(eventMetadataCloseableBeginSectionWithMetadata.metadata);
            eventMetadataCloseableBeginSectionWithMetadata.metadata.dispatchToTraceSink();
            emptyCloseable = eventMetadataCloseableBeginSectionWithMetadata.closeable;
        } else {
            emptyCloseable = EmptyCloseable.INSTANCE;
        }
        try {
            return aVar.invoke();
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> Object traceCoroutine$$forInline(String str, String str2, PropagationToken propagationToken, boolean z, l<? super EventMetadata, ab> lVar, l<? super e<? super T>, ? extends Object> lVar2, e<? super T> eVar) throws Exception {
        Tracer tracer2;
        String str3;
        String str4;
        e<? super EventMetadataCloseable> eVar2;
        EventMetadataCloseable emptyEventMetadataCloseable;
        if (isCategoryEnabled(str)) {
            tracer2 = this;
            str3 = str;
            str4 = str2;
            eVar2 = eVar;
            emptyEventMetadataCloseable = (EventMetadataCloseable) tracer2.beginCoroutineSectionWithMetadata(str3, str4, propagationToken, z, eVar2);
            lVar.invoke(emptyEventMetadataCloseable.metadata);
            emptyEventMetadataCloseable.metadata.dispatchToTraceSink();
        } else {
            emptyEventMetadataCloseable = EventMetadataCloseableKt.getEmptyEventMetadataCloseable();
            tracer2 = this;
            str3 = str;
            str4 = str2;
            eVar2 = eVar;
        }
        try {
            if (emptyEventMetadataCloseable.propagationToken.contextElementOrNull() == null) {
                return lVar2.invoke(eVar2);
            }
            throw null;
        } finally {
        }
    }

    public static /* synthetic */ Object traceCoroutine$default(Tracer tracer2, String str, String str2, PropagationToken propagationToken, boolean z, l lVar, l lVar2, e eVar, int i2, Object obj) throws Exception {
        e eVar2;
        EventMetadataCloseable emptyEventMetadataCloseable;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: traceCoroutine");
        }
        if ((i2 & 4) != 0) {
            propagationToken = null;
        }
        boolean z2 = z & ((i2 & 8) == 0);
        if ((i2 & 16) != 0) {
            lVar = new l<EventMetadata, ab>() { // from class: androidx.tracing.Tracer.traceCoroutine.2
                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ ab invoke(EventMetadata eventMetadata) {
                    return ab.f48028a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(EventMetadata eventMetadata) {
                }
            };
        }
        l lVar3 = lVar;
        if (tracer2.isCategoryEnabled(str)) {
            eVar2 = eVar;
            emptyEventMetadataCloseable = (EventMetadataCloseable) tracer2.beginCoroutineSectionWithMetadata(str, str2, propagationToken, z2, eVar2);
            lVar3.invoke(emptyEventMetadataCloseable.metadata);
            emptyEventMetadataCloseable.metadata.dispatchToTraceSink();
        } else {
            emptyEventMetadataCloseable = EventMetadataCloseableKt.getEmptyEventMetadataCloseable();
            eVar2 = eVar;
        }
        try {
            if (emptyEventMetadataCloseable.propagationToken.contextElementOrNull() == null) {
                return lVar2.invoke(eVar2);
            }
            throw null;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object beginCoroutineSection(java.lang.String r8, java.lang.String r9, androidx.tracing.PropagationToken r10, boolean r11, h.g.a.l<? super androidx.tracing.EventMetadata, h.ab> r12, h.c.e<? super androidx.tracing.EventMetadataCloseable> r13) {
        /*
            r7 = this;
            boolean r0 = r13 instanceof androidx.tracing.Tracer.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r13
            androidx.tracing.Tracer$beginCoroutineSection$1 r0 = (androidx.tracing.Tracer.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.tracing.Tracer$beginCoroutineSection$1 r0 = new androidx.tracing.Tracer$beginCoroutineSection$1
            r0.<init>(r13)
        L18:
            r6 = r0
            java.lang.Object r13 = r6.result
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            java.lang.Object r7 = r6.L$0
            r12 = r7
            h.g.a.l r12 = (h.g.a.l) r12
            e.b.c.b(r13)
            goto L48
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            e.b.c.b(r13)
            r6.L$0 = r12
            r6.label = r2
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.Object r13 = r1.beginCoroutineSectionWithMetadata(r2, r3, r4, r5, r6)
            if (r13 != r0) goto L48
            return r0
        L48:
            androidx.tracing.EventMetadataCloseable r13 = (androidx.tracing.EventMetadataCloseable) r13
            androidx.tracing.EventMetadata r7 = r13.metadata
            r12.invoke(r7)
            androidx.tracing.EventMetadata r7 = r13.metadata
            r7.dispatchToTraceSink()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.tracing.Tracer.beginCoroutineSection(java.lang.String, java.lang.String, androidx.tracing.PropagationToken, boolean, h.g.a.l, h.c.e):java.lang.Object");
    }

    @DelicateTracingApi
    public abstract Object beginCoroutineSectionWithMetadata(String str, String str2, PropagationToken propagationToken, boolean z, e<? super EventMetadataCloseable> eVar);

    public final AutoCloseable beginSection(String str, String str2, PropagationToken propagationToken, boolean z, l<? super EventMetadata, ab> lVar) {
        EventMetadataCloseable eventMetadataCloseableBeginSectionWithMetadata = beginSectionWithMetadata(str, str2, propagationToken, z);
        lVar.invoke(eventMetadataCloseableBeginSectionWithMetadata.metadata);
        eventMetadataCloseableBeginSectionWithMetadata.metadata.dispatchToTraceSink();
        return eventMetadataCloseableBeginSectionWithMetadata.closeable;
    }

    @DelicateTracingApi
    public abstract EventMetadataCloseable beginSectionWithMetadata(String str, String str2, PropagationToken propagationToken, boolean z);

    public abstract Counter counter(String str, String str2);

    @DelicateTracingApi
    public abstract EventMetadataCloseable instant(String str, String str2);

    public final void instant(String str, String str2, l<? super EventMetadata, ab> lVar) {
        EventMetadataCloseable eventMetadataCloseableInstant = instant(str, str2);
        lVar.invoke(eventMetadataCloseableInstant.metadata);
        eventMetadataCloseableInstant.metadata.dispatchToTraceSink();
    }

    public abstract boolean isCategoryEnabled(String str);

    @ExperimentalContextPropagation
    public abstract PropagationToken tokenForManualPropagation();

    @DelicateTracingApi
    public abstract Object tokenFromCoroutineContext(e<? super PropagationToken> eVar);

    @DelicateTracingApi
    public abstract PropagationToken tokenFromThreadContext();

    public final <T> T trace(String str, String str2, PropagationToken propagationToken, boolean z, l<? super EventMetadata, ab> lVar, h.g.a.a<? extends T> aVar) throws Exception {
        EmptyCloseable emptyCloseable;
        if (isCategoryEnabled(str)) {
            EventMetadataCloseable eventMetadataCloseableBeginSectionWithMetadata = beginSectionWithMetadata(str, str2, propagationToken, z);
            lVar.invoke(eventMetadataCloseableBeginSectionWithMetadata.metadata);
            eventMetadataCloseableBeginSectionWithMetadata.metadata.dispatchToTraceSink();
            emptyCloseable = eventMetadataCloseableBeginSectionWithMetadata.closeable;
        } else {
            emptyCloseable = EmptyCloseable.INSTANCE;
        }
        try {
            return aVar.invoke();
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        if (r15 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00db, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab A[Catch: all -> 0x00e4, TryCatch #0 {all -> 0x00e4, blocks: (B:29:0x00a2, B:31:0x00ab, B:34:0x00cd), top: B:46:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd A[Catch: all -> 0x00e4, TRY_LEAVE, TryCatch #0 {all -> 0x00e4, blocks: (B:29:0x00a2, B:31:0x00ab, B:34:0x00cd), top: B:46:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object traceCoroutine(java.lang.String r13, java.lang.String r14, androidx.tracing.PropagationToken r15, boolean r16, h.g.a.l<? super androidx.tracing.EventMetadata, h.ab> r17, h.g.a.l<? super h.c.e<? super T>, ? extends java.lang.Object> r18, h.c.e<? super T> r19) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.tracing.Tracer.traceCoroutine(java.lang.String, java.lang.String, androidx.tracing.PropagationToken, boolean, h.g.a.l, h.g.a.l, h.c.e):java.lang.Object");
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void getGlobal$annotations() {
        }

        public final Tracer getGlobal() {
            return Tracer.tracer;
        }

        public final Tracer getStubTracer() {
            return Tracer.stubTracer;
        }

        public final void resetGlobalTracer() {
            Tracer.tracer = Tracer.stubTracer;
        }

        @DelicateTracingApi
        public final void setGlobalTracer(Tracer tracer) {
            if (!x.n(Tracer.tracer, Tracer.stubTracer)) {
                throw new IllegalStateException("A Tracer has already been configured. setGlobalTracer() should only be called once per process.");
            }
            Tracer.tracer = tracer;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: instant, reason: collision with other method in class */
    public final void m13402instant(String str, String str2) {
        instant(str, str2).metadata.dispatchToTraceSink();
    }

    public final <T> T trace(String str, String str2, PropagationToken propagationToken, boolean z, h.g.a.a<? extends T> aVar) throws Exception {
        EmptyCloseable emptyCloseable;
        if (!isCategoryEnabled(str)) {
            emptyCloseable = EmptyCloseable.INSTANCE;
        } else {
            EventMetadataCloseable eventMetadataCloseableBeginSectionWithMetadata = beginSectionWithMetadata(str, str2, propagationToken, z);
            eventMetadataCloseableBeginSectionWithMetadata.metadata.dispatchToTraceSink();
            emptyCloseable = eventMetadataCloseableBeginSectionWithMetadata.closeable;
        }
        try {
            return aVar.invoke();
        } finally {
        }
    }

    public final <T> T trace(String str, String str2, PropagationToken propagationToken, h.g.a.a<? extends T> aVar) throws Exception {
        EmptyCloseable emptyCloseable;
        if (!isCategoryEnabled(str)) {
            emptyCloseable = EmptyCloseable.INSTANCE;
        } else {
            EventMetadataCloseable eventMetadataCloseableBeginSectionWithMetadata = beginSectionWithMetadata(str, str2, propagationToken, false);
            eventMetadataCloseableBeginSectionWithMetadata.metadata.dispatchToTraceSink();
            emptyCloseable = eventMetadataCloseableBeginSectionWithMetadata.closeable;
        }
        try {
            return aVar.invoke();
        } finally {
        }
    }

    public final <T> T trace(String str, String str2, h.g.a.a<? extends T> aVar) throws Exception {
        EmptyCloseable emptyCloseable;
        if (!isCategoryEnabled(str)) {
            emptyCloseable = EmptyCloseable.INSTANCE;
        } else {
            EventMetadataCloseable eventMetadataCloseableBeginSectionWithMetadata = beginSectionWithMetadata(str, str2, null, false);
            eventMetadataCloseableBeginSectionWithMetadata.metadata.dispatchToTraceSink();
            emptyCloseable = eventMetadataCloseableBeginSectionWithMetadata.closeable;
        }
        try {
            return aVar.invoke();
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> Object traceCoroutine(String str, String str2, PropagationToken propagationToken, boolean z, l<? super e<? super T>, ? extends Object> lVar, e<? super T> eVar) throws Exception {
        Tracer tracer2;
        String str3;
        String str4;
        e<? super EventMetadataCloseable> eVar2;
        EventMetadataCloseable emptyEventMetadataCloseable;
        if (!isCategoryEnabled(str)) {
            emptyEventMetadataCloseable = EventMetadataCloseableKt.getEmptyEventMetadataCloseable();
            tracer2 = this;
            str3 = str;
            str4 = str2;
            eVar2 = eVar;
        } else {
            tracer2 = this;
            str3 = str;
            str4 = str2;
            eVar2 = eVar;
            emptyEventMetadataCloseable = (EventMetadataCloseable) tracer2.beginCoroutineSectionWithMetadata(str3, str4, propagationToken, z, eVar2);
            emptyEventMetadataCloseable.metadata.dispatchToTraceSink();
        }
        try {
            if (emptyEventMetadataCloseable.propagationToken.contextElementOrNull() == null) {
                return lVar.invoke(eVar2);
            }
            throw null;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> Object traceCoroutine(String str, String str2, PropagationToken propagationToken, l<? super e<? super T>, ? extends Object> lVar, e<? super T> eVar) throws Exception {
        Tracer tracer2;
        String str3;
        String str4;
        e<? super EventMetadataCloseable> eVar2;
        EventMetadataCloseable emptyEventMetadataCloseable;
        if (!isCategoryEnabled(str)) {
            emptyEventMetadataCloseable = EventMetadataCloseableKt.getEmptyEventMetadataCloseable();
            tracer2 = this;
            str3 = str;
            str4 = str2;
            eVar2 = eVar;
        } else {
            tracer2 = this;
            str3 = str;
            str4 = str2;
            eVar2 = eVar;
            emptyEventMetadataCloseable = (EventMetadataCloseable) tracer2.beginCoroutineSectionWithMetadata(str3, str4, propagationToken, false, eVar2);
            emptyEventMetadataCloseable.metadata.dispatchToTraceSink();
        }
        try {
            if (emptyEventMetadataCloseable.propagationToken.contextElementOrNull() == null) {
                return lVar.invoke(eVar2);
            }
            throw null;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> Object traceCoroutine(String str, String str2, l<? super e<? super T>, ? extends Object> lVar, e<? super T> eVar) throws Exception {
        Tracer tracer2;
        String str3;
        String str4;
        e<? super EventMetadataCloseable> eVar2;
        EventMetadataCloseable emptyEventMetadataCloseable;
        if (!isCategoryEnabled(str)) {
            emptyEventMetadataCloseable = EventMetadataCloseableKt.getEmptyEventMetadataCloseable();
            tracer2 = this;
            str3 = str;
            str4 = str2;
            eVar2 = eVar;
        } else {
            tracer2 = this;
            str3 = str;
            str4 = str2;
            eVar2 = eVar;
            emptyEventMetadataCloseable = (EventMetadataCloseable) tracer2.beginCoroutineSectionWithMetadata(str3, str4, null, false, eVar2);
            emptyEventMetadataCloseable.metadata.dispatchToTraceSink();
        }
        try {
            if (emptyEventMetadataCloseable.propagationToken.contextElementOrNull() == null) {
                return lVar.invoke(eVar2);
            }
            throw null;
        } finally {
        }
    }
}
