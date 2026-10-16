package androidx.camera.camera2.pipe.internal;

import androidx.camera.camera2.pipe.core.Log;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.o;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class CameraPipeLifetime$shutdownScope$1$2 extends g implements p<af, e<? super ab>, Object> {
    int label;
    final /* synthetic */ CameraPipeLifetime this$0;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.internal.CameraPipeLifetime$shutdownScope$1$2$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        int label;
        final /* synthetic */ CameraPipeLifetime this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CameraPipeLifetime cameraPipeLifetime, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.this$0 = cameraPipeLifetime;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass1(this.this$0, eVar);
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
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    android.util.Log.d(Log.TAG, "Cancelling CameraPipe root Job...");
                }
                this.label = 1;
                if (o.b(this.this$0.cameraPipeJob, this) == aVar) {
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
    CameraPipeLifetime$shutdownScope$1$2(CameraPipeLifetime cameraPipeLifetime, e<? super CameraPipeLifetime$shutdownScope$1$2> eVar) {
        super(2, eVar);
        this.this$0 = cameraPipeLifetime;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new CameraPipeLifetime$shutdownScope$1$2(this.this$0, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((CameraPipeLifetime$shutdownScope$1$2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
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
        CameraPipeLifetime cameraPipeLifetime = this.this$0;
        this.label = 1;
        Object objJ = aj.J(CameraPipeLifetime.CAMERA_PIPE_JOB_CANCEL_TIMEOUT, new AnonymousClass1(cameraPipeLifetime, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
