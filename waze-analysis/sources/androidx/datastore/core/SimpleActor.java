package androidx.datastore.core;

import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.w;
import h.g.b.x;
import kotlinx.coroutines.a.o;
import kotlinx.coroutines.a.r;
import kotlinx.coroutines.a.t;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SimpleActor<T> {
    private final p<T, e<? super ab>, Object> consumeMessage;
    private final o<T> messageQueue;
    private final AtomicInt remainingMessages;
    private final af scope;

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.SimpleActor$offer$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e<? super ab>, Object> {
        Object L$0;
        int label;
        final /* synthetic */ SimpleActor<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(SimpleActor<T> simpleActor, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.this$0 = simpleActor;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass2(this.this$0, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
        
            if (r1.invoke(r6, r5) == r0) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0050 A[PHI: r1 r6
  0x0050: PHI (r1v1 h.g.a.p) = (r1v2 h.g.a.p), (r1v4 h.g.a.p) binds: [B:13:0x004d, B:9:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0050: PHI (r6v5 java.lang.Object) = (r6v11 java.lang.Object), (r6v0 java.lang.Object) binds: [B:13:0x004d, B:9:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0059 -> B:17:0x005b). Please report as a decompilation issue!!! */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                h.c.a.a r0 = h.c.a.a.f48038a
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                e.b.c.b(r6)
                goto L5b
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L18:
                java.lang.Object r1 = r5.L$0
                h.g.a.p r1 = (h.g.a.p) r1
                e.b.c.b(r6)
                goto L50
            L20:
                e.b.c.b(r6)
                androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
                androidx.datastore.core.AtomicInt r6 = androidx.datastore.core.SimpleActor.access$getRemainingMessages$p(r6)
                int r6 = r6.get()
                if (r6 <= 0) goto L6c
            L2f:
                androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
                kotlinx.coroutines.af r6 = androidx.datastore.core.SimpleActor.access$getScope$p(r6)
                kotlinx.coroutines.aj.i(r6)
                androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
                h.g.a.p r1 = androidx.datastore.core.SimpleActor.access$getConsumeMessage$p(r6)
                kotlinx.coroutines.a.o r6 = androidx.datastore.core.SimpleActor.access$getMessageQueue$p(r6)
                r4 = r5
                h.c.e r4 = (h.c.e) r4
                r5.L$0 = r1
                r5.label = r3
                java.lang.Object r6 = r6.d(r4)
                if (r6 != r0) goto L50
                goto L6b
            L50:
                r4 = 0
                r5.L$0 = r4
                r5.label = r2
                java.lang.Object r6 = r1.invoke(r6, r5)
                if (r6 == r0) goto L6b
            L5b:
                androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
                androidx.datastore.core.AtomicInt r6 = androidx.datastore.core.SimpleActor.access$getRemainingMessages$p(r6)
                int r6 = r6.decrementAndGet()
                if (r6 == 0) goto L68
                goto L2f
            L68:
                h.ab r5 = h.ab.f48028a
                return r5
            L6b:
                return r0
            L6c:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "Check failed."
                r5.<init>(r6)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SimpleActor.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleActor(af afVar, final l<? super Throwable, ab> lVar, final p<? super T, ? super Throwable, ab> pVar, p<? super T, ? super e<? super ab>, ? extends Object> pVar2) {
        x.f(afVar, "scope");
        x.f(lVar, "onComplete");
        x.f(pVar, "onUndeliveredElement");
        x.f(pVar2, "consumeMessage");
        this.scope = afVar;
        this.consumeMessage = pVar2;
        this.messageQueue = w.c(Integer.MAX_VALUE, null, null, 6);
        this.remainingMessages = new AtomicInt(0);
        br brVar = (br) afVar.getCoroutineContext().get(br.f51766a);
        if (brVar != null) {
            brVar.bY(new l() { // from class: androidx.datastore.core.SimpleActor$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return SimpleActor._init_$lambda$0(lVar, this, pVar, (Throwable) obj);
                }
            });
        }
    }

    static final ab _init_$lambda$0(l lVar, SimpleActor simpleActor, p pVar, Throwable th) {
        lVar.invoke(th);
        simpleActor.messageQueue.v(th);
        while (true) {
            Object objA = t.a(simpleActor.messageQueue.h());
            if (objA == null) {
                return ab.f48028a;
            }
            pVar.invoke(objA, th);
        }
    }

    public final void offer(T t) {
        Object objI = this.messageQueue.i(t);
        if (objI instanceof r) {
            Throwable thD = t.d(objI);
            if (thD != null) {
                throw thD;
            }
            throw new kotlinx.coroutines.a.x("Channel was closed normally");
        }
        if (!t.g(objI)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.remainingMessages.getAndIncrement() == 0) {
            aj.z(this.scope, null, null, new AnonymousClass2(this, null), 3);
        }
    }
}
