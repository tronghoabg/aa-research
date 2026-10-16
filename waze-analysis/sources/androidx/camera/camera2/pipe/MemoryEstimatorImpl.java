package androidx.camera.camera2.pipe;

import h.ab;
import h.c.b.a.c;
import h.c.e;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class MemoryEstimatorImpl implements MemoryEstimator {
    private final bn<Long> _evictable;
    private final bn<Long> _usage;
    private final k<Long> capacity;
    private final ch<Long> evictable;
    private final long initialCapacity;
    private final ch<Long> usage;

    public MemoryEstimatorImpl(long j2) {
        this.initialCapacity = j2;
        bn<Long> bnVarB = ck.b(0L);
        this._usage = bnVarB;
        this.usage = ai.U(bnVarB);
        final bn<Long> bnVar = bnVarB;
        this.capacity = new k<Long>() { // from class: androidx.camera.camera2.pipe.MemoryEstimatorImpl$special$$inlined$map$1

            /* compiled from: WazeSource */
            /* renamed from: androidx.camera.camera2.pipe.MemoryEstimatorImpl$special$$inlined$map$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements l {
                final /* synthetic */ l $this_unsafeFlow;
                final /* synthetic */ MemoryEstimatorImpl this$0;

                /* renamed from: androidx.camera.camera2.pipe.MemoryEstimatorImpl$special$$inlined$map$1$2$1, reason: invalid class name */
                public final class AnonymousClass1 extends c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(e eVar) {
                        super(eVar);
                    }

                    @Override // h.c.b.a.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(l lVar, MemoryEstimatorImpl memoryEstimatorImpl) {
                    this.$this_unsafeFlow = lVar;
                    this.this$0 = memoryEstimatorImpl;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.b.l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, h.c.e r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof androidx.camera.camera2.pipe.MemoryEstimatorImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        androidx.camera.camera2.pipe.MemoryEstimatorImpl$special$$inlined$map$1$2$1 r0 = (androidx.camera.camera2.pipe.MemoryEstimatorImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.camera.camera2.pipe.MemoryEstimatorImpl$special$$inlined$map$1$2$1 r0 = new androidx.camera.camera2.pipe.MemoryEstimatorImpl$special$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        h.c.a.a r1 = h.c.a.a.f48038a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        e.b.c.b(r8)
                        goto L52
                    L27:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L2f:
                        e.b.c.b(r8)
                        kotlinx.coroutines.b.l r8 = r6.$this_unsafeFlow
                        r2 = r0
                        h.c.e r2 = (h.c.e) r2
                        java.lang.Number r7 = (java.lang.Number) r7
                        long r4 = r7.longValue()
                        androidx.camera.camera2.pipe.MemoryEstimatorImpl r6 = r6.this$0
                        long r6 = androidx.camera.camera2.pipe.MemoryEstimatorImpl.access$getInitialCapacity$p(r6)
                        long r6 = r6 - r4
                        java.lang.Long r2 = new java.lang.Long
                        r2.<init>(r6)
                        r0.label = r3
                        java.lang.Object r6 = r8.emit(r2, r0)
                        if (r6 != r1) goto L52
                        return r1
                    L52:
                        h.ab r6 = h.ab.f48028a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.MemoryEstimatorImpl$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, h.c.e):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.b.k
            public Object collect(l<? super Long> lVar, e eVar) {
                Object objCollect = bnVar.collect(new AnonymousClass2(lVar, this), eVar);
                return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
            }
        };
        bn<Long> bnVarB2 = ck.b(0L);
        this._evictable = bnVarB2;
        this.evictable = ai.U(bnVarB2);
    }

    @Override // androidx.camera.camera2.pipe.MemoryEstimator
    public boolean canAllocate(long j2) {
        return this.initialCapacity - ((Number) this._usage.d()).longValue() >= j2;
    }

    @Override // androidx.camera.camera2.pipe.MemoryEstimator
    public void decrementUsage(long j2) {
        bn<Long> bnVar;
        Object objD;
        do {
            bnVar = this._usage;
            objD = bnVar.d();
        } while (!bnVar.f(objD, Long.valueOf(((Number) objD).longValue() - j2)));
    }

    @Override // androidx.camera.camera2.pipe.MemoryEstimator
    public k<Long> getCapacity() {
        return this.capacity;
    }

    @Override // androidx.camera.camera2.pipe.MemoryEstimator
    public ch<Long> getEvictable() {
        return this.evictable;
    }

    @Override // androidx.camera.camera2.pipe.MemoryEstimator
    public ch<Long> getUsage() {
        return this.usage;
    }

    @Override // androidx.camera.camera2.pipe.MemoryEstimator
    public void incrementUsage(long j2) {
        bn<Long> bnVar;
        Object objD;
        do {
            bnVar = this._usage;
            objD = bnVar.d();
        } while (!bnVar.f(objD, Long.valueOf(((Number) objD).longValue() + j2)));
    }

    @Override // androidx.camera.camera2.pipe.MemoryEstimator
    public void updateEvictable(long j2) {
        bn<Long> bnVar;
        Object objD;
        do {
            bnVar = this._evictable;
            objD = bnVar.d();
        } while (!bnVar.f(objD, Long.valueOf(((Number) objD).longValue() + j2)));
    }
}
