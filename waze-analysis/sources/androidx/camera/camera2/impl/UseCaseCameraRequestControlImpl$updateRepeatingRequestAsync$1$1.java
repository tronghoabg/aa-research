package androidx.camera.camera2.impl;

import androidx.camera.camera2.adapter.SessionConfigAdapter;
import androidx.camera.camera2.config.UseCaseCameraContext;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.Logger;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.b.x;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class UseCaseCameraRequestControlImpl$updateRepeatingRequestAsync$1$1 extends g implements l<e<? super am<? extends ab>>, Object> {
    final /* synthetic */ boolean $isPrimary;
    final /* synthetic */ Collection<UseCase> $runningUseCases;
    int label;
    final /* synthetic */ UseCaseCameraRequestControlImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UseCaseCameraRequestControlImpl$updateRepeatingRequestAsync$1$1(Collection<? extends UseCase> collection, boolean z, UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, e<? super UseCaseCameraRequestControlImpl$updateRepeatingRequestAsync$1$1> eVar) {
        super(1, eVar);
        this.$runningUseCases = collection;
        this.$isPrimary = z;
        this.this$0 = useCaseCameraRequestControlImpl;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(e<?> eVar) {
        return new UseCaseCameraRequestControlImpl$updateRepeatingRequestAsync$1$1(this.$runningUseCases, this.$isPrimary, this.this$0, eVar);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(e<? super am<ab>> eVar) {
        return ((UseCaseCameraRequestControlImpl$updateRepeatingRequestAsync$1$1) create(eVar)).invokeSuspend(ab.f48028a);
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
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "UseCaseCameraRequestControlImpl: Building SessionConfig...");
        }
        SessionConfig validSessionConfigOrNull = new SessionConfigAdapter(this.$runningUseCases, this.$isPrimary).getValidSessionConfigOrNull();
        if (validSessionConfigOrNull == null) {
            if (Logger.isDebugEnabled(Log.TAG)) {
                android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "Using default SessionConfig");
            }
            SessionConfig.Builder builder = new SessionConfig.Builder();
            builder.setTemplateType(1);
            validSessionConfigOrNull = builder.build();
            x.e(validSessionConfigOrNull, "run(...)");
        }
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "UseCaseCameraRequestControlImpl: SessionConfig built. Updating state...");
        }
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.this$0;
        useCaseCameraRequestControlImpl.infoBundleMap.put(UseCaseCameraRequestControl.Type.SESSION_CONFIG, UseCaseCameraRequestControlImpl.Companion.toInfoBundle(validSessionConfigOrNull, useCaseCameraRequestControlImpl.threads.getSequentialExecutor()));
        UseCaseCameraContext useCaseCameraContext = this.this$0.useCaseCameraContext;
        List<DeferrableSurface> surfaces = validSessionConfigOrNull.getRepeatingCaptureConfig().getSurfaces();
        x.e(surfaces, "getSurfaces(...)");
        Set<StreamId> streamIdsFromSurfaces = useCaseCameraContext.getStreamIdsFromSurfaces(surfaces);
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "UseCaseCameraRequestControlImpl: State update processing.");
        }
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl2 = this.this$0;
        this.label = 1;
        Object objUpdateCameraStateAsync = useCaseCameraRequestControlImpl2.updateCameraStateAsync(useCaseCameraRequestControlImpl2.merge(useCaseCameraRequestControlImpl2.infoBundleMap), streamIdsFromSurfaces, this);
        return objUpdateCameraStateAsync == aVar ? aVar : objUpdateCameraStateAsync;
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ Object invoke(e<? super am<? extends ab>> eVar) {
        return invoke2((e<? super am<ab>>) eVar);
    }
}
