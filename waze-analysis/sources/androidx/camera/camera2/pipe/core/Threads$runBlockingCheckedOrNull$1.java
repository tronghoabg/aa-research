package androidx.camera.camera2.pipe.core;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class Threads$runBlockingCheckedOrNull$1 extends g implements p<af, e, Object> {
    final /* synthetic */ l<e, Object> $block;
    final /* synthetic */ long $timeout;
    int label;
    final /* synthetic */ Threads this$0;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.core.Threads$runBlockingCheckedOrNull$1$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e, Object> {
        final /* synthetic */ am $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(am amVar, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$result = amVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass1(this.$result, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
                return obj;
            }
            c.b(obj);
            this.label = 1;
            Object objC = this.$result.c(this);
            return objC == aVar ? aVar : objC;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Threads$runBlockingCheckedOrNull$1(Threads threads, l<? super e, ? extends Object> lVar, long j2, e<? super Threads$runBlockingCheckedOrNull$1> eVar) {
        super(2, eVar);
        this.this$0 = threads;
        this.$block = lVar;
        this.$timeout = j2;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new Threads$runBlockingCheckedOrNull$1(this.this$0, this.$block, this.$timeout, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e eVar) {
        return ((Threads$runBlockingCheckedOrNull$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            return obj;
        }
        c.b(obj);
        Threads threads = this.this$0;
        am amVarRunAsyncSupervised = threads.runAsyncSupervised(threads.getBackgroundDispatcher(), this.$block);
        this.label = 1;
        Object objJ = aj.J(this.$timeout, new AnonymousClass1(amVarRunAsyncSupervised, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
