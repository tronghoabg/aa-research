package androidx.camera.camera2.pipe.core;

import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.e.b;
import h.g.a.a;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class WakeLock {
    private final a<ab> callback;
    private boolean closed;
    private int count;
    private final Object lock;
    private final af scope;
    private final boolean startTimeoutOnCreation;
    private final long timeout;
    private br timeoutJob;

    /* compiled from: WazeSource */
    final class WakeLockToken implements Token {
        private final kotlinx.a.a _released = b.e(false);

        public WakeLockToken() {
        }

        @Override // androidx.camera.camera2.pipe.core.Token
        public boolean getReleased() {
            return this._released.c();
        }

        @Override // androidx.camera.camera2.pipe.core.Token
        public boolean release() {
            if (!this._released.b(false, true)) {
                return false;
            }
            WakeLock.this.releaseToken$camera_camera2_pipe();
            return true;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.core.WakeLock$release$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e<? super ab>, Object> {
        int label;

        AnonymousClass2(e<? super AnonymousClass2> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return WakeLock.this.new AnonymousClass2(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            WakeLock.this.callback.invoke();
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.core.WakeLock$startTimeout$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        int label;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return WakeLock.this.new AnonymousClass1(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                if (aj.r(WakeLock.this.timeout, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            WakeLock wakeLock = WakeLock.this;
            synchronized (wakeLock.lock) {
                if (!wakeLock.closed && wakeLock.count == 0) {
                    wakeLock.timeoutJob = null;
                    wakeLock.closed = true;
                    WakeLock.this.callback.invoke();
                    return ab.f48028a;
                }
                return ab.f48028a;
            }
        }
    }

    private WakeLock(af afVar, long j2, boolean z, a<ab> aVar) {
        x.f(afVar, "scope");
        x.f(aVar, "callback");
        this.scope = afVar;
        this.timeout = j2;
        this.startTimeoutOnCreation = z;
        this.callback = aVar;
        Object obj = new Object();
        this.lock = obj;
        if (z) {
            synchronized (obj) {
                startTimeout();
            }
        }
    }

    private final void startTimeout() {
        this.timeoutJob = aj.z(this.scope, null, null, new AnonymousClass1(null), 3);
    }

    public final Token acquire() {
        synchronized (this.lock) {
            if (this.closed) {
                return null;
            }
            int i2 = this.count + 1;
            this.count = i2;
            if (i2 == 1) {
                br brVar = this.timeoutJob;
                if (brVar != null) {
                    brVar.s(null);
                }
                this.timeoutJob = null;
            }
            return new WakeLockToken();
        }
    }

    public final boolean release() {
        synchronized (this.lock) {
            if (this.closed) {
                return false;
            }
            this.closed = true;
            br brVar = this.timeoutJob;
            if (brVar != null) {
                brVar.s(null);
            }
            this.timeoutJob = null;
            aj.z(this.scope, null, null, new AnonymousClass2(null), 3);
            return true;
        }
    }

    public final void releaseToken$camera_camera2_pipe() {
        synchronized (this.lock) {
            int i2 = this.count - 1;
            this.count = i2;
            if (i2 == 0 && !this.closed) {
                startTimeout();
            }
        }
    }

    public /* synthetic */ WakeLock(af afVar, long j2, boolean z, a aVar, o oVar) {
        this(afVar, j2, z, aVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WakeLock(af afVar, long j2, boolean z, a aVar, int i2, o oVar) {
        if ((i2 & 2) != 0) {
            h.o.c cVar = h.o.a.f48264a;
            j2 = 0;
        }
        this(afVar, j2, ((i2 & 4) == 0) & z, aVar, null);
    }
}
