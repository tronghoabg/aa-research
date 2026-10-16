package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.camera2.pipe.MemoryEstimator;
import c.b.c;
import c.b.e;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraPipeModule_Companion_ProvideMemoryEstimatorFactory implements c<MemoryEstimator> {
    private final e<CameraPipe.Config> configProvider;

    private CameraPipeModule_Companion_ProvideMemoryEstimatorFactory(e<CameraPipe.Config> eVar) {
        this.configProvider = eVar;
    }

    public static CameraPipeModule_Companion_ProvideMemoryEstimatorFactory create(e<CameraPipe.Config> eVar) {
        return new CameraPipeModule_Companion_ProvideMemoryEstimatorFactory(eVar);
    }

    public static MemoryEstimator provideMemoryEstimator(CameraPipe.Config config) {
        MemoryEstimator memoryEstimatorProvideMemoryEstimator = CameraPipeModule.Companion.provideMemoryEstimator(config);
        r.g(memoryEstimatorProvideMemoryEstimator);
        return memoryEstimatorProvideMemoryEstimator;
    }

    @Override // g.a.a, f.a.a
    public MemoryEstimator get() {
        return provideMemoryEstimator(this.configProvider.get());
    }
}
