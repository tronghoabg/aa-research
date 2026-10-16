package androidx.camera.camera2.pipe;

import e.b.c;
import h.a.r;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.a.q;
import h.g.b.w;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FrameCapture$Companion$useEachFrameAsync$$inlined$useEachFrameIndexedAsync$1 extends g implements p<af, e, Object> {
    final /* synthetic */ q $action$inlined$1;
    final /* synthetic */ AutoCloseable $closeable;
    final /* synthetic */ int $i;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.FrameCapture$Companion$useEachFrameAsync$$inlined$useEachFrameIndexedAsync$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends g implements p<af, e, Object> {
        final /* synthetic */ q $action$inlined$1;
        final /* synthetic */ int $i;
        final /* synthetic */ AutoCloseable $it;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i2, AutoCloseable autoCloseable, e eVar, q qVar) {
            super(2, eVar);
            this.$i = i2;
            this.$it = autoCloseable;
            this.$action$inlined$1 = qVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$i, this.$it, eVar, this.$action$inlined$1);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) throws Exception {
            af afVar;
            FrameCapture frameCapture;
            AutoCloseable autoCloseable;
            Throwable th;
            AutoCloseable autoCloseable2;
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    c.b(obj);
                    afVar = (af) this.L$0;
                    int i3 = this.$i;
                    FrameCapture frameCapture2 = (FrameCapture) this.$it;
                    this.L$0 = frameCapture2;
                    this.L$1 = afVar;
                    this.I$0 = i3;
                    this.label = 1;
                    obj = frameCapture2.awaitFrame(this);
                    if (obj != aVar) {
                        frameCapture = frameCapture2;
                    }
                    return aVar;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    autoCloseable2 = (AutoCloseable) this.L$0;
                    try {
                        c.b(obj);
                        r.y(autoCloseable2, null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            r.y(autoCloseable2, th);
                            throw th3;
                        }
                    }
                }
                afVar = (af) this.L$1;
                frameCapture = (FrameCapture) this.L$0;
                c.b(obj);
                FrameCapture$Companion$useEachFrameAsync$$inlined$useEachFrameIndexedAsync$1$1$$ExternalSyntheticAutoCloseableDispatcher0.m(frameCapture);
                AnonymousClass1 anonymousClass1 = this;
                q qVar = this.$action$inlined$1;
                this.L$0 = autoCloseable;
                this.L$1 = null;
                this.label = 2;
                Object objInvoke = qVar.invoke(afVar, (Frame) autoCloseable, this);
                if (objInvoke != aVar) {
                    obj = objInvoke;
                    autoCloseable2 = autoCloseable;
                    r.y(autoCloseable2, null);
                    return obj;
                }
                return aVar;
            } catch (Throwable th4) {
                th = th4;
                autoCloseable2 = autoCloseable;
                throw th;
            }
            autoCloseable = (AutoCloseable) obj;
        }

        public final Object invokeSuspend$$forInline(Object obj) throws Exception {
            af afVar = (af) this.L$0;
            FrameCapture frameCapture = (FrameCapture) this.$it;
            AutoCloseable autoCloseable = (AutoCloseable) frameCapture.awaitFrame(this);
            try {
                FrameCapture$Companion$useEachFrameAsync$$inlined$useEachFrameIndexedAsync$1$1$$ExternalSyntheticAutoCloseableDispatcher0.m(frameCapture);
                Object objInvoke = this.$action$inlined$1.invoke(afVar, (Frame) autoCloseable, this);
                r.y(autoCloseable, null);
                return objInvoke;
            } finally {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameCapture$Companion$useEachFrameAsync$$inlined$useEachFrameIndexedAsync$1(AutoCloseable autoCloseable, int i2, e eVar, q qVar) {
        super(2, eVar);
        this.$closeable = autoCloseable;
        this.$i = i2;
        this.$action$inlined$1 = qVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new FrameCapture$Companion$useEachFrameAsync$$inlined$useEachFrameIndexedAsync$1(this.$closeable, this.$i, eVar, this.$action$inlined$1);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e eVar) {
        return ((FrameCapture$Companion$useEachFrameAsync$$inlined$useEachFrameIndexedAsync$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) throws Exception {
        AutoCloseable autoCloseable;
        int i2;
        AutoCloseable autoCloseable2;
        Throwable th;
        AutoCloseable autoCloseable3;
        h.c.a.a aVar = h.c.a.a.f48038a;
        int i3 = this.label;
        if (i3 != 0) {
            if (i3 == 1) {
                i2 = this.I$0;
                autoCloseable2 = (AutoCloseable) this.L$1;
                AutoCloseable autoCloseable4 = (AutoCloseable) this.L$0;
                try {
                    c.b(obj);
                    autoCloseable = autoCloseable4;
                } catch (Throwable th2) {
                    th = th2;
                    autoCloseable3 = autoCloseable4;
                }
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                autoCloseable3 = (AutoCloseable) this.L$0;
                try {
                    c.b(obj);
                    r.y(autoCloseable3, null);
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            try {
                throw th;
            } catch (Throwable th4) {
                r.y(autoCloseable3, th);
                throw th4;
            }
        }
        c.b(obj);
        autoCloseable = this.$closeable;
        i2 = this.$i;
        try {
            this.L$0 = autoCloseable;
            this.L$1 = autoCloseable;
            this.I$0 = i2;
            this.label = 1;
            if (w.b(this) != aVar) {
                autoCloseable2 = autoCloseable;
            }
            return aVar;
        } catch (Throwable th5) {
            AutoCloseable autoCloseable5 = autoCloseable;
            th = th5;
            autoCloseable3 = autoCloseable5;
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(i2, autoCloseable2, null, this.$action$inlined$1);
        this.L$0 = autoCloseable;
        this.L$1 = null;
        this.label = 2;
        Object objD = aj.d(anonymousClass1, this);
        if (objD != aVar) {
            AutoCloseable autoCloseable6 = autoCloseable;
            obj = objD;
            autoCloseable3 = autoCloseable6;
            r.y(autoCloseable3, null);
            return obj;
        }
        return aVar;
    }

    public final Object invokeSuspend$$forInline(Object obj) throws Exception {
        int i2 = this.$i;
        AutoCloseable autoCloseable = this.$closeable;
        try {
            w.b(this);
            Object objD = aj.d(new AnonymousClass1(i2, autoCloseable, null, this.$action$inlined$1), this);
            r.y(autoCloseable, null);
            return objD;
        } finally {
        }
    }
}
