package androidx.camera.camera2.impl;

import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.Result3A;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.Logger;
import e.b.c;
import h.a.r;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class UseCaseCameraRequestControlImpl$setTorchOnAsync$1$1 extends g implements l<e<? super am<? extends Result3A>>, Object> {
    int label;
    final /* synthetic */ UseCaseCameraRequestControlImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UseCaseCameraRequestControlImpl$setTorchOnAsync$1$1(UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, e<? super UseCaseCameraRequestControlImpl$setTorchOnAsync$1$1> eVar) {
        super(1, eVar);
        this.this$0 = useCaseCameraRequestControlImpl;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(e<?> eVar) {
        return new UseCaseCameraRequestControlImpl$setTorchOnAsync$1$1(this.this$0, eVar);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(e<? super am<Result3A>> eVar) {
        return ((UseCaseCameraRequestControlImpl$setTorchOnAsync$1$1) create(eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) throws Exception {
        a aVar = a.f48038a;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                c.b(obj);
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (Logger.isDebugEnabled(Log.TAG)) {
                    android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "UseCaseCameraRequestControlImpl#setTorchOnAsync");
                }
                this.label = 1;
                obj = this.this$0.useCaseCameraContext.getGraph().acquireSession(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            AutoCloseable autoCloseable = (AutoCloseable) obj;
            try {
                UseCaseCameraRequestControlImpl$setTorchOnAsync$1$1 useCaseCameraRequestControlImpl$setTorchOnAsync$1$1 = this;
                am<Result3A> torchOn = ((CameraGraph.Session) autoCloseable).setTorchOn();
                r.y(autoCloseable, null);
                return torchOn;
            } finally {
            }
        } catch (CancellationException e2) {
            Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
            CancellationException cancellationException = e2;
            if (Logger.isDebugEnabled(Log.TAG)) {
                android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "Cannot acquire the CameraGraph.Session", cancellationException);
            }
            return UseCaseCameraRequestControlImpl.submitFailedResult;
        }
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ Object invoke(e<? super am<? extends Result3A>> eVar) {
        return invoke2((e<? super am<Result3A>>) eVar);
    }
}
