package androidx.lifecycle;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.c.j;
import h.g.a.p;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.av;
import kotlinx.coroutines.ax;
import kotlinx.coroutines.e.ac;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class LiveDataScopeImpl<T> implements LiveDataScope<T> {
    private final j coroutineContext;
    private CoroutineLiveData<T> target;

    /* compiled from: WazeSource */
    /* renamed from: androidx.lifecycle.LiveDataScopeImpl$emit$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ T $value;
        int label;
        final /* synthetic */ LiveDataScopeImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(LiveDataScopeImpl<T> liveDataScopeImpl, T t, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.this$0 = liveDataScopeImpl;
            this.$value = t;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass2(this.this$0, this.$value, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                if (this.this$0.getTarget$lifecycle_livedata().clearSource$lifecycle_livedata(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            LiveDataScopeImpl<T> liveDataScopeImpl = this.this$0;
            liveDataScopeImpl.getTarget$lifecycle_livedata().setValue(this.$value);
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.lifecycle.LiveDataScopeImpl$emitSource$2, reason: invalid class name and case insensitive filesystem */
    final class C04442 extends g implements p<af, e<? super ax>, Object> {
        final /* synthetic */ LiveData<T> $source;
        int label;
        final /* synthetic */ LiveDataScopeImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04442(LiveDataScopeImpl<T> liveDataScopeImpl, LiveData<T> liveData, e<? super C04442> eVar) {
            super(2, eVar);
            this.this$0 = liveDataScopeImpl;
            this.$source = liveData;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new C04442(this.this$0, this.$source, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ax> eVar) {
            return ((C04442) create(afVar, eVar)).invokeSuspend(ab.f48028a);
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
            LiveDataScopeImpl<T> liveDataScopeImpl = this.this$0;
            LiveData<T> liveData = this.$source;
            this.label = 1;
            Object objEmitSource$lifecycle_livedata = liveDataScopeImpl.getTarget$lifecycle_livedata().emitSource$lifecycle_livedata(liveData, this);
            return objEmitSource$lifecycle_livedata == aVar ? aVar : objEmitSource$lifecycle_livedata;
        }
    }

    public LiveDataScopeImpl(CoroutineLiveData<T> coroutineLiveData, j jVar) {
        x.f(coroutineLiveData, TypedValues.AttributesType.S_TARGET);
        x.f(jVar, "context");
        this.target = coroutineLiveData;
        int i2 = av.f51370a;
        this.coroutineContext = jVar.plus(ac.f51860a.c());
    }

    @Override // androidx.lifecycle.LiveDataScope
    public Object emit(T t, e<? super ab> eVar) {
        Object objV = aj.v(this.coroutineContext, new AnonymousClass2(this, t, null), eVar);
        return objV == a.f48038a ? objV : ab.f48028a;
    }

    @Override // androidx.lifecycle.LiveDataScope
    public Object emitSource(LiveData<T> liveData, e<? super ax> eVar) {
        return aj.v(this.coroutineContext, new C04442(this, liveData, null), eVar);
    }

    @Override // androidx.lifecycle.LiveDataScope
    public T getLatestValue() {
        return this.target.getValue();
    }

    public final CoroutineLiveData<T> getTarget$lifecycle_livedata() {
        return this.target;
    }

    public final void setTarget$lifecycle_livedata(CoroutineLiveData<T> coroutineLiveData) {
        x.f(coroutineLiveData, "<set-?>");
        this.target = coroutineLiveData;
    }
}
