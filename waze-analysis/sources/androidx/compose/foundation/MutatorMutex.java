package androidx.compose.foundation;

import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;
import kotlinx.coroutines.h.a;
import kotlinx.coroutines.h.h;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MutatorMutex {
    public static final int $stable = 0;
    private final AtomicReference<Mutator> currentMutator = new AtomicReference<>(null);
    private final a mutex = new h(false);

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
            this.job.s(new MutationInterruptedException());
        }

        public final br getJob() {
            return this.job;
        }

        public final MutatePriority getPriority() {
            return this.priority;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.MutatorMutex$mutate$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e, Object> {
        final /* synthetic */ l<e, Object> $block;
        final /* synthetic */ MutatePriority $priority;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ MutatorMutex this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, l<? super e, ? extends Object> lVar, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$priority = mutatePriority;
            this.this$0 = mutatorMutex;
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
            MutatorMutex mutatorMutex;
            l<e, Object> lVar;
            a aVar;
            MutatorMutex mutatorMutex2;
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
                        h.c.h hVar = afVar.getCoroutineContext().get(br.f51766a);
                        if (hVar == null) {
                            x.g();
                        }
                        mutator = new Mutator(mutatePriority, (br) hVar);
                        this.this$0.tryMutateOrCancel(mutator);
                        mutatorMutex = this.this$0;
                        l<e, Object> lVar2 = this.$block;
                        a aVar3 = mutatorMutex.mutex;
                        this.L$0 = mutator;
                        this.L$1 = aVar3;
                        this.L$2 = lVar2;
                        this.L$3 = mutatorMutex;
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
                        mutatorMutex2 = (MutatorMutex) this.L$2;
                        aVar = (a) this.L$1;
                        mutator2 = (Mutator) this.L$0;
                        try {
                            c.b(obj);
                            MutatorMutex$mutate$2$$ExternalSyntheticBackportWithForwarding0.m(mutatorMutex2.currentMutator, mutator2, null);
                            aVar.unlock(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            MutatorMutex$mutate$2$$ExternalSyntheticBackportWithForwarding0.m(mutatorMutex2.currentMutator, mutator2, null);
                            throw th;
                        }
                    }
                    MutatorMutex mutatorMutex3 = (MutatorMutex) this.L$3;
                    lVar = (l) this.L$2;
                    a aVar4 = (a) this.L$1;
                    Mutator mutator3 = (Mutator) this.L$0;
                    c.b(obj);
                    mutatorMutex = mutatorMutex3;
                    aVar = aVar4;
                    mutator = mutator3;
                    this.L$0 = mutator;
                    this.L$1 = aVar;
                    this.L$2 = mutatorMutex;
                    this.L$3 = null;
                    this.label = 2;
                    Object objInvoke = lVar.invoke(this);
                    if (objInvoke != aVar2) {
                        mutatorMutex2 = mutatorMutex;
                        obj = objInvoke;
                        mutator2 = mutator;
                        MutatorMutex$mutate$2$$ExternalSyntheticBackportWithForwarding0.m(mutatorMutex2.currentMutator, mutator2, null);
                        aVar.unlock(null);
                        return obj;
                    }
                    return aVar2;
                } catch (Throwable th3) {
                    mutatorMutex2 = mutatorMutex;
                    th = th3;
                    mutator2 = mutator;
                    MutatorMutex$mutate$2$$ExternalSyntheticBackportWithForwarding0.m(mutatorMutex2.currentMutator, mutator2, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r1.unlock(null);
                throw th4;
            }
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.MutatorMutex$mutateWith$2, reason: invalid class name and case insensitive filesystem */
    final class C02252 extends g implements p<af, e, Object> {
        final /* synthetic */ p $block;
        final /* synthetic */ MutatePriority $priority;
        final /* synthetic */ Object $receiver;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ MutatorMutex this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02252(MutatePriority mutatePriority, MutatorMutex mutatorMutex, p pVar, Object obj, e<? super C02252> eVar) {
            super(2, eVar);
            this.$priority = mutatePriority;
            this.this$0 = mutatorMutex;
            this.$block = pVar;
            this.$receiver = obj;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C02252 c02252 = new C02252(this.$priority, this.this$0, this.$block, this.$receiver, eVar);
            c02252.L$0 = obj;
            return c02252;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e eVar) {
            return ((C02252) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.h.a] */
        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            Mutator mutator;
            MutatorMutex mutatorMutex;
            Object obj2;
            p pVar;
            a aVar;
            MutatorMutex mutatorMutex2;
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
                        h.c.h hVar = afVar.getCoroutineContext().get(br.f51766a);
                        if (hVar == null) {
                            x.g();
                        }
                        mutator = new Mutator(mutatePriority, (br) hVar);
                        this.this$0.tryMutateOrCancel(mutator);
                        mutatorMutex = this.this$0;
                        p pVar2 = this.$block;
                        Object obj3 = this.$receiver;
                        a aVar3 = mutatorMutex.mutex;
                        this.L$0 = mutator;
                        this.L$1 = aVar3;
                        this.L$2 = pVar2;
                        this.L$3 = obj3;
                        this.L$4 = mutatorMutex;
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
                        mutatorMutex2 = (MutatorMutex) this.L$2;
                        aVar = (a) this.L$1;
                        mutator2 = (Mutator) this.L$0;
                        try {
                            c.b(obj);
                            MutatorMutex$mutateWith$2$$ExternalSyntheticBackportWithForwarding0.m(mutatorMutex2.currentMutator, mutator2, null);
                            aVar.unlock(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            MutatorMutex$mutateWith$2$$ExternalSyntheticBackportWithForwarding0.m(mutatorMutex2.currentMutator, mutator2, null);
                            throw th;
                        }
                    }
                    MutatorMutex mutatorMutex3 = (MutatorMutex) this.L$4;
                    obj2 = this.L$3;
                    p pVar3 = (p) this.L$2;
                    a aVar4 = (a) this.L$1;
                    Mutator mutator3 = (Mutator) this.L$0;
                    c.b(obj);
                    mutatorMutex = mutatorMutex3;
                    aVar = aVar4;
                    pVar = pVar3;
                    mutator = mutator3;
                    this.L$0 = mutator;
                    this.L$1 = aVar;
                    this.L$2 = mutatorMutex;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 2;
                    Object objInvoke = pVar.invoke(obj2, this);
                    if (objInvoke != aVar2) {
                        mutatorMutex2 = mutatorMutex;
                        obj = objInvoke;
                        mutator2 = mutator;
                        MutatorMutex$mutateWith$2$$ExternalSyntheticBackportWithForwarding0.m(mutatorMutex2.currentMutator, mutator2, null);
                        aVar.unlock(null);
                        return obj;
                    }
                    return aVar2;
                } catch (Throwable th3) {
                    mutatorMutex2 = mutatorMutex;
                    th = th3;
                    mutator2 = mutator;
                    MutatorMutex$mutateWith$2$$ExternalSyntheticBackportWithForwarding0.m(mutatorMutex2.currentMutator, mutator2, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r1.unlock(null);
                throw th4;
            }
        }
    }

    public static /* synthetic */ Object mutate$default(MutatorMutex mutatorMutex, MutatePriority mutatePriority, l lVar, e eVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.mutate(mutatePriority, lVar, eVar);
    }

    public static /* synthetic */ Object mutateWith$default(MutatorMutex mutatorMutex, Object obj, MutatePriority mutatePriority, p pVar, e eVar, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.mutateWith(obj, mutatePriority, pVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryMutateOrCancel(Mutator mutator) {
        Mutator mutator2;
        do {
            mutator2 = this.currentMutator.get();
            if (mutator2 != null && !mutator.canInterrupt(mutator2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.currentMutator, mutator2, mutator));
        if (mutator2 != null) {
            mutator2.cancel();
        }
    }

    public final <R> Object mutate(MutatePriority mutatePriority, l<? super e<? super R>, ? extends Object> lVar, e<? super R> eVar) {
        return aj.d(new AnonymousClass2(mutatePriority, this, lVar, null), eVar);
    }

    public final <T, R> Object mutateWith(T t, MutatePriority mutatePriority, p<? super T, ? super e<? super R>, ? extends Object> pVar, e<? super R> eVar) {
        return aj.d(new C02252(mutatePriority, this, pVar, t, null), eVar);
    }

    public final boolean tryLock() {
        return this.mutex.tryLock(null);
    }

    public final boolean tryMutate(h.g.a.a<ab> aVar) {
        boolean zTryLock = tryLock();
        if (!zTryLock) {
            return zTryLock;
        }
        try {
            aVar.invoke();
            return zTryLock;
        } finally {
            unlock();
        }
    }

    public final void unlock() {
        this.mutex.unlock(null);
    }
}
