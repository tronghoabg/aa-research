package androidx.datastore.core;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.a.q;
import kotlinx.coroutines.b.l;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DataStoreImpl$data$1<T> extends g implements p<l<? super T>, e<? super ab>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.DataStoreImpl$data$1$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<l<? super State<T>>, e<? super ab>, Object> {
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DataStoreImpl<T> dataStoreImpl, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.this$0 = dataStoreImpl;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass1(this.this$0, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(l<? super State<T>> lVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(lVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                if (this.this$0.incrementCollector(this) == aVar) {
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
    /* renamed from: androidx.datastore.core.DataStoreImpl$data$1$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<State<T>, e<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(e<? super AnonymousClass2> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(eVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // h.g.a.p
        public final Object invoke(State<T> state, e<? super Boolean> eVar) {
            return ((AnonymousClass2) create(state, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            State state = (State) this.L$0;
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            return Boolean.valueOf(!(state instanceof Final));
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.DataStoreImpl$data$1$3, reason: invalid class name */
    final class AnonymousClass3 extends g implements p<State<T>, e<? super Boolean>, Object> {
        final /* synthetic */ State<T> $startState;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(State<T> state, e<? super AnonymousClass3> eVar) {
            super(2, eVar);
            this.$startState = state;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$startState, eVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // h.g.a.p
        public final Object invoke(State<T> state, e<? super Boolean> eVar) {
            return ((AnonymousClass3) create(state, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            State state = (State) this.L$0;
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            boolean z = false;
            if ((state instanceof Data) && ((Data) state).getVersion() <= ((Data) this.$startState).getVersion()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.DataStoreImpl$data$1$5, reason: invalid class name */
    final class AnonymousClass5 extends g implements q<l<? super T>, Throwable, e<? super ab>, Object> {
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(DataStoreImpl<T> dataStoreImpl, e<? super AnonymousClass5> eVar) {
            super(3, eVar);
            this.this$0 = dataStoreImpl;
        }

        @Override // h.g.a.q
        public final Object invoke(l<? super T> lVar, Throwable th, e<? super ab> eVar) {
            return new AnonymousClass5(this.this$0, eVar).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                if (this.this$0.decrementCollector(this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$data$1(DataStoreImpl<T> dataStoreImpl, e<? super DataStoreImpl$data$1> eVar) {
        super(2, eVar);
        this.this$0 = dataStoreImpl;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        DataStoreImpl$data$1 dataStoreImpl$data$1 = new DataStoreImpl$data$1(this.this$0, eVar);
        dataStoreImpl$data$1.L$0 = obj;
        return dataStoreImpl$data$1;
    }

    @Override // h.g.a.p
    public final Object invoke(l<? super T> lVar, e<? super ab> eVar) {
        return ((DataStoreImpl$data$1) create(lVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ea, code lost:
    
        if (kotlinx.coroutines.b.ai.g(r0, kotlinx.coroutines.b.ai.J(new androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1<>(r9), new androidx.datastore.core.DataStoreImpl$data$1.AnonymousClass5(r8.this$0, null)), r8) != r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ed  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$data$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
