package androidx.lifecycle;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class LifecycleCoroutineScope implements af {

    /* compiled from: WazeSource */
    /* renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ p<af, e<? super ab>, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(p<? super af, ? super e<? super ab>, ? extends Object> pVar, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$block = pVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return LifecycleCoroutineScope.this.new AnonymousClass1(this.$block, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                LifecycleCoroutineScope lifecycleCoroutineScope = LifecycleCoroutineScope.this;
                p<af, e<? super ab>, Object> pVar = this.$block;
                this.label = 1;
                if (PausingDispatcherKt.whenCreated(lifecycleCoroutineScope.getLifecycle$lifecycle_common(), pVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1, reason: invalid class name and case insensitive filesystem */
    final class C04421 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ p<af, e<? super ab>, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C04421(p<? super af, ? super e<? super ab>, ? extends Object> pVar, e<? super C04421> eVar) {
            super(2, eVar);
            this.$block = pVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return LifecycleCoroutineScope.this.new C04421(this.$block, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C04421) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                LifecycleCoroutineScope lifecycleCoroutineScope = LifecycleCoroutineScope.this;
                p<af, e<? super ab>, Object> pVar = this.$block;
                this.label = 1;
                if (PausingDispatcherKt.whenResumed(lifecycleCoroutineScope.getLifecycle$lifecycle_common(), pVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1, reason: invalid class name and case insensitive filesystem */
    final class C04431 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ p<af, e<? super ab>, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C04431(p<? super af, ? super e<? super ab>, ? extends Object> pVar, e<? super C04431> eVar) {
            super(2, eVar);
            this.$block = pVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return LifecycleCoroutineScope.this.new C04431(this.$block, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C04431) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                LifecycleCoroutineScope lifecycleCoroutineScope = LifecycleCoroutineScope.this;
                p<af, e<? super ab>, Object> pVar = this.$block;
                this.label = 1;
                if (PausingDispatcherKt.whenStarted(lifecycleCoroutineScope.getLifecycle$lifecycle_common(), pVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    public abstract Lifecycle getLifecycle$lifecycle_common();

    public final br launchWhenCreated(p<? super af, ? super e<? super ab>, ? extends Object> pVar) {
        x.f(pVar, "block");
        return aj.z(this, null, null, new AnonymousClass1(pVar, null), 3);
    }

    public final br launchWhenResumed(p<? super af, ? super e<? super ab>, ? extends Object> pVar) {
        x.f(pVar, "block");
        return aj.z(this, null, null, new C04421(pVar, null), 3);
    }

    public final br launchWhenStarted(p<? super af, ? super e<? super ab>, ? extends Object> pVar) {
        x.f(pVar, "block");
        return aj.z(this, null, null, new C04431(pVar, null), 3);
    }
}
