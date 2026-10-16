package androidx.lifecycle;

import androidx.lifecycle.CoroutineLiveDataKt;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.c.j;
import h.c.k;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import j$.time.Duration;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.av;
import kotlinx.coroutines.e.ac;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CoroutineLiveDataKt {
    public static final long DEFAULT_TIMEOUT = 5000;

    /* compiled from: WazeSource */
    /* renamed from: androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e<? super EmittedSource>, Object> {
        final /* synthetic */ LiveData $source;
        final /* synthetic */ MediatorLiveData $this_addDisposableSource;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(MediatorLiveData mediatorLiveData, LiveData liveData, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$this_addDisposableSource = mediatorLiveData;
            this.$source = liveData;
        }

        static final ab invokeSuspend$lambda$0(MediatorLiveData mediatorLiveData, Object obj) {
            mediatorLiveData.setValue(obj);
            return ab.f48028a;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass2(this.$this_addDisposableSource, this.$source, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super EmittedSource> eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            final MediatorLiveData mediatorLiveData = this.$this_addDisposableSource;
            mediatorLiveData.addSource(this.$source, new CoroutineLiveDataKt$sam$androidx_lifecycle_Observer$0(new l() { // from class: androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return CoroutineLiveDataKt.AnonymousClass2.invokeSuspend$lambda$0(mediatorLiveData, obj2);
                }
            }));
            return new EmittedSource(this.$source, this.$this_addDisposableSource);
        }
    }

    public static final <T> Object addDisposableSource(MediatorLiveData<T> mediatorLiveData, LiveData<T> liveData, e<? super EmittedSource> eVar) {
        int i2 = av.f51370a;
        return aj.v(ac.f51860a.c(), new AnonymousClass2(mediatorLiveData, liveData, null), eVar);
    }

    public static final <T> LiveData<T> liveData(Duration duration, j jVar, p<? super LiveDataScope<T>, ? super e<? super ab>, ? extends Object> pVar) {
        x.f(duration, "timeout");
        x.f(jVar, "context");
        x.f(pVar, "block");
        return new CoroutineLiveData(jVar, Api26Impl.INSTANCE.toMillis(duration), pVar);
    }

    public static /* synthetic */ LiveData liveData$default(j jVar, long j2, p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            jVar = k.f48060a;
        }
        if ((i2 & 2) != 0) {
            j2 = 5000;
        }
        return liveData(jVar, j2, pVar);
    }

    public static /* synthetic */ LiveData liveData$default(Duration duration, j jVar, p pVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            jVar = k.f48060a;
        }
        return liveData(duration, jVar, pVar);
    }

    public static final <T> LiveData<T> liveData(p<? super LiveDataScope<T>, ? super e<? super ab>, ? extends Object> pVar) {
        x.f(pVar, "block");
        return liveData$default((j) null, 0L, pVar, 3, (Object) null);
    }

    public static final <T> LiveData<T> liveData(Duration duration, p<? super LiveDataScope<T>, ? super e<? super ab>, ? extends Object> pVar) {
        x.f(duration, "timeout");
        x.f(pVar, "block");
        return liveData$default(duration, (j) null, pVar, 2, (Object) null);
    }

    public static final <T> LiveData<T> liveData(j jVar, long j2, p<? super LiveDataScope<T>, ? super e<? super ab>, ? extends Object> pVar) {
        x.f(jVar, "context");
        x.f(pVar, "block");
        return new CoroutineLiveData(jVar, j2, pVar);
    }

    public static final <T> LiveData<T> liveData(j jVar, p<? super LiveDataScope<T>, ? super e<? super ab>, ? extends Object> pVar) {
        x.f(jVar, "context");
        x.f(pVar, "block");
        return liveData$default(jVar, 0L, pVar, 2, (Object) null);
    }
}
