package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.c.h;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;
import kotlinx.coroutines.h.a;
import kotlinx.coroutines.h.i;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class InternalMutatorMutex {
    public static final int $stable = 0;
    private final AtomicReference<Mutator> currentMutator = new AtomicReference<>(null);
    private final a mutex = i.c();

    /* compiled from: WazeSource */
    final class Mutator {
        private final br job;
        private final MutatePriority priority;

        public Mutator(MutatePriority mutatePriority, br brVar) {
            this.priority = mutatePriority;
            this.job = brVar;
        }

        public final boolean canInterrupt(Mutator mutator) {
            return this.priority.compareTo(mutator.priority) >= 0;
        }

        public final void cancel() {
            this.job.s(null);
        }

        public final br getJob() {
            return this.job;
        }

        public final MutatePriority getPriority() {
            return this.priority;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material.InternalMutatorMutex$mutate$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e, Object> {
        final /* synthetic */ l<e, Object> $block;
        final /* synthetic */ MutatePriority $priority;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ InternalMutatorMutex this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(MutatePriority mutatePriority, InternalMutatorMutex internalMutatorMutex, l<? super e, ? extends Object> lVar, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$priority = mutatePriority;
            this.this$0 = internalMutatorMutex;
            this.$block = lVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$priority, this.this$0, this.$block, eVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.h.a] */
        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            Mutator mutator;
            InternalMutatorMutex internalMutatorMutex;
            l<e, Object> lVar;
            a aVar;
            InternalMutatorMutex internalMutatorMutex2;
            Throwable th;
            Mutator mutator2;
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            ?? r1 = this.label;
            try {
                try {
                    if (r1 == 0) {
                        c.b(obj);
                        af afVar = (af) this.L$0;
                        MutatePriority mutatePriority = this.$priority;
                        h hVar = afVar.getCoroutineContext().get(br.f51766a);
                        x.c(hVar);
                        mutator = new Mutator(mutatePriority, (br) hVar);
                        this.this$0.tryMutateOrCancel(mutator);
                        internalMutatorMutex = this.this$0;
                        l<e, Object> lVar2 = this.$block;
                        a aVar3 = internalMutatorMutex.mutex;
                        this.L$0 = mutator;
                        this.L$1 = aVar3;
                        this.L$2 = lVar2;
                        this.L$3 = internalMutatorMutex;
                        this.label = 1;
                        if (aVar3.lock(null, this) != aVar2) {
                            lVar = lVar2;
                            aVar = aVar3;
                        }
                        return aVar2;
                    }
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        internalMutatorMutex2 = (InternalMutatorMutex) this.L$2;
                        aVar = (a) this.L$1;
                        mutator2 = (Mutator) this.L$0;
                        try {
                            c.b(obj);
                            InternalMutatorMutex$mutate$2$$ExternalSyntheticBackportWithForwarding0.m(internalMutatorMutex2.currentMutator, mutator2, null);
                            aVar.unlock(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            InternalMutatorMutex$mutate$2$$ExternalSyntheticBackportWithForwarding0.m(internalMutatorMutex2.currentMutator, mutator2, null);
                            throw th;
                        }
                    }
                    InternalMutatorMutex internalMutatorMutex3 = (InternalMutatorMutex) this.L$3;
                    lVar = (l) this.L$2;
                    a aVar4 = (a) this.L$1;
                    Mutator mutator3 = (Mutator) this.L$0;
                    c.b(obj);
                    internalMutatorMutex = internalMutatorMutex3;
                    aVar = aVar4;
                    mutator = mutator3;
                    this.L$0 = mutator;
                    this.L$1 = aVar;
                    this.L$2 = internalMutatorMutex;
                    this.L$3 = null;
                    this.label = 2;
                    Object objInvoke = lVar.invoke(this);
                    if (objInvoke != aVar2) {
                        internalMutatorMutex2 = internalMutatorMutex;
                        obj = objInvoke;
                        mutator2 = mutator;
                        InternalMutatorMutex$mutate$2$$ExternalSyntheticBackportWithForwarding0.m(internalMutatorMutex2.currentMutator, mutator2, null);
                        aVar.unlock(null);
                        return obj;
                    }
                    return aVar2;
                } catch (Throwable th3) {
                    internalMutatorMutex2 = internalMutatorMutex;
                    th = th3;
                    mutator2 = mutator;
                    InternalMutatorMutex$mutate$2$$ExternalSyntheticBackportWithForwarding0.m(internalMutatorMutex2.currentMutator, mutator2, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r1.unlock(null);
                throw th4;
            }
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material.InternalMutatorMutex$mutateWith$2, reason: invalid class name and case insensitive filesystem */
    final class C03302 extends g implements p<af, e, Object> {
        final /* synthetic */ p $block;
        final /* synthetic */ MutatePriority $priority;
        final /* synthetic */ Object $receiver;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ InternalMutatorMutex this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03302(MutatePriority mutatePriority, InternalMutatorMutex internalMutatorMutex, p pVar, Object obj, e<? super C03302> eVar) {
            super(2, eVar);
            this.$priority = mutatePriority;
            this.this$0 = internalMutatorMutex;
            this.$block = pVar;
            this.$receiver = obj;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C03302 c03302 = new C03302(this.$priority, this.this$0, this.$block, this.$receiver, eVar);
            c03302.L$0 = obj;
            return c03302;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e eVar) {
            return ((C03302) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.h.a] */
        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            Mutator mutator;
            InternalMutatorMutex internalMutatorMutex;
            Object obj2;
            p pVar;
            a aVar;
            InternalMutatorMutex internalMutatorMutex2;
            Throwable th;
            Mutator mutator2;
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            ?? r1 = this.label;
            try {
                try {
                    if (r1 == 0) {
                        c.b(obj);
                        af afVar = (af) this.L$0;
                        MutatePriority mutatePriority = this.$priority;
                        h hVar = afVar.getCoroutineContext().get(br.f51766a);
                        x.c(hVar);
                        mutator = new Mutator(mutatePriority, (br) hVar);
                        this.this$0.tryMutateOrCancel(mutator);
                        internalMutatorMutex = this.this$0;
                        p pVar2 = this.$block;
                        Object obj3 = this.$receiver;
                        a aVar3 = internalMutatorMutex.mutex;
                        this.L$0 = mutator;
                        this.L$1 = aVar3;
                        this.L$2 = pVar2;
                        this.L$3 = obj3;
                        this.L$4 = internalMutatorMutex;
                        this.label = 1;
                        if (aVar3.lock(null, this) != aVar2) {
                            obj2 = obj3;
                            pVar = pVar2;
                            aVar = aVar3;
                        }
                        return aVar2;
                    }
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        internalMutatorMutex2 = (InternalMutatorMutex) this.L$2;
                        aVar = (a) this.L$1;
                        mutator2 = (Mutator) this.L$0;
                        try {
                            c.b(obj);
                            InternalMutatorMutex$mutateWith$2$$ExternalSyntheticBackportWithForwarding0.m(internalMutatorMutex2.currentMutator, mutator2, null);
                            aVar.unlock(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            InternalMutatorMutex$mutateWith$2$$ExternalSyntheticBackportWithForwarding0.m(internalMutatorMutex2.currentMutator, mutator2, null);
                            throw th;
                        }
                    }
                    InternalMutatorMutex internalMutatorMutex3 = (InternalMutatorMutex) this.L$4;
                    obj2 = this.L$3;
                    p pVar3 = (p) this.L$2;
                    a aVar4 = (a) this.L$1;
                    Mutator mutator3 = (Mutator) this.L$0;
                    c.b(obj);
                    internalMutatorMutex = internalMutatorMutex3;
                    aVar = aVar4;
                    pVar = pVar3;
                    mutator = mutator3;
                    this.L$0 = mutator;
                    this.L$1 = aVar;
                    this.L$2 = internalMutatorMutex;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 2;
                    Object objInvoke = pVar.invoke(obj2, this);
                    if (objInvoke != aVar2) {
                        internalMutatorMutex2 = internalMutatorMutex;
                        obj = objInvoke;
                        mutator2 = mutator;
                        InternalMutatorMutex$mutateWith$2$$ExternalSyntheticBackportWithForwarding0.m(internalMutatorMutex2.currentMutator, mutator2, null);
                        aVar.unlock(null);
                        return obj;
                    }
                    return aVar2;
                } catch (Throwable th3) {
                    internalMutatorMutex2 = internalMutatorMutex;
                    th = th3;
                    mutator2 = mutator;
                    InternalMutatorMutex$mutateWith$2$$ExternalSyntheticBackportWithForwarding0.m(internalMutatorMutex2.currentMutator, mutator2, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r1.unlock(null);
                throw th4;
            }
        }
    }

    public static /* synthetic */ Object mutate$default(InternalMutatorMutex internalMutatorMutex, MutatePriority mutatePriority, l lVar, e eVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return internalMutatorMutex.mutate(mutatePriority, lVar, eVar);
    }

    public static /* synthetic */ Object mutateWith$default(InternalMutatorMutex internalMutatorMutex, Object obj, MutatePriority mutatePriority, p pVar, e eVar, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return internalMutatorMutex.mutateWith(obj, mutatePriority, pVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryMutateOrCancel(Mutator mutator) {
        Mutator mutator2;
        do {
            mutator2 = this.currentMutator.get();
            if (mutator2 != null && !mutator.canInterrupt(mutator2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!InternalMutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.currentMutator, mutator2, mutator));
        if (mutator2 != null) {
            mutator2.cancel();
        }
    }

    public final <R> Object mutate(MutatePriority mutatePriority, l<? super e<? super R>, ? extends Object> lVar, e<? super R> eVar) {
        return aj.d(new AnonymousClass2(mutatePriority, this, lVar, null), eVar);
    }

    public final <T, R> Object mutateWith(T t, MutatePriority mutatePriority, p<? super T, ? super e<? super R>, ? extends Object> pVar, e<? super R> eVar) {
        return aj.d(new C03302(mutatePriority, this, pVar, t, null), eVar);
    }

    public final boolean tryMutate(h.g.a.a<ab> aVar) {
        boolean zTryLock = this.mutex.tryLock(null);
        if (!zTryLock) {
            return zTryLock;
        }
        try {
            aVar.invoke();
            return zTryLock;
        } finally {
            this.mutex.unlock(null);
        }
    }
}
