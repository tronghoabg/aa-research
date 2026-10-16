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
import kotlinx.coroutines.av;
import kotlinx.coroutines.ax;
import kotlinx.coroutines.e.ac;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class EmittedSource implements ax {
    private boolean disposed;
    private final MediatorLiveData<?> mediator;
    private final LiveData<?> source;

    /* compiled from: WazeSource */
    /* renamed from: androidx.lifecycle.EmittedSource$dispose$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        int label;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return EmittedSource.this.new AnonymousClass1(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            EmittedSource.this.removeSource();
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.lifecycle.EmittedSource$disposeNow$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e<? super ab>, Object> {
        int label;

        AnonymousClass2(e<? super AnonymousClass2> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return EmittedSource.this.new AnonymousClass2(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            EmittedSource.this.removeSource();
            return ab.f48028a;
        }
    }

    public EmittedSource(LiveData<?> liveData, MediatorLiveData<?> mediatorLiveData) {
        x.f(liveData, "source");
        x.f(mediatorLiveData, "mediator");
        this.source = liveData;
        this.mediator = mediatorLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeSource() {
        if (this.disposed) {
            return;
        }
        this.mediator.removeSource(this.source);
        this.disposed = true;
    }

    @Override // kotlinx.coroutines.ax
    public void dispose() {
        int i2 = av.f51370a;
        aj.z(aj.e(ac.f51860a.c()), null, null, new AnonymousClass1(null), 3);
    }

    public final Object disposeNow(e<? super ab> eVar) {
        int i2 = av.f51370a;
        Object objV = aj.v(ac.f51860a.c(), new AnonymousClass2(null), eVar);
        return objV == a.f48038a ? objV : ab.f48028a;
    }
}
