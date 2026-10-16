package androidx.camera.core.impl;

import androidx.camera.core.CameraUseCaseAdapterProvider;
import androidx.camera.core.UseCase;
import androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup;
import androidx.camera.core.internal.CalculatedUseCaseInfo;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class UseCaseAdditionSimulator {
    public static final UseCaseAdditionSimulator INSTANCE = new UseCaseAdditionSimulator();
    public static CameraUseCaseAdapterProvider cameraUseCaseAdapterProvider;

    private UseCaseAdditionSimulator() {
    }

    public static final CameraUseCaseAdapterProvider getCameraUseCaseAdapterProvider() {
        CameraUseCaseAdapterProvider cameraUseCaseAdapterProvider2 = cameraUseCaseAdapterProvider;
        if (cameraUseCaseAdapterProvider2 != null) {
            return cameraUseCaseAdapterProvider2;
        }
        x.j("cameraUseCaseAdapterProvider");
        return null;
    }

    public static final void setCameraUseCaseAdapterProvider(CameraUseCaseAdapterProvider cameraUseCaseAdapterProvider2) {
        x.f(cameraUseCaseAdapterProvider2, "<set-?>");
        cameraUseCaseAdapterProvider = cameraUseCaseAdapterProvider2;
    }

    public static final CalculatedUseCaseInfo simulateAddUseCases(CameraInfoInternal cameraInfoInternal, androidx.camera.core.SessionConfig sessionConfig, boolean z, ResolvedFeatureGroup resolvedFeatureGroup) {
        x.f(cameraInfoInternal, "cameraInfoInternal");
        x.f(sessionConfig, "sessionConfig");
        if (cameraUseCaseAdapterProvider == null) {
            throw new IllegalStateException("mCameraUseCaseAdapterProvider must be initialized first!");
        }
        CameraUseCaseAdapterProvider cameraUseCaseAdapterProvider2 = getCameraUseCaseAdapterProvider();
        String cameraId = cameraInfoInternal.getCameraId();
        x.e(cameraId, "getCameraId(...)");
        CameraUseCaseAdapter cameraUseCaseAdapterProvide = cameraUseCaseAdapterProvider2.provide(cameraId);
        cameraUseCaseAdapterProvide.setViewPort(sessionConfig.getViewPort());
        cameraUseCaseAdapterProvide.setEffects(sessionConfig.getEffects());
        cameraUseCaseAdapterProvide.setSessionType(sessionConfig.getSessionType());
        cameraUseCaseAdapterProvide.setFrameRate(sessionConfig.getFrameRateRange());
        List<UseCase> useCases = sessionConfig.getUseCases();
        if (resolvedFeatureGroup == null) {
            resolvedFeatureGroup = ResolvedFeatureGroup.Companion.resolveFeatureGroup$default(ResolvedFeatureGroup.Companion, sessionConfig, cameraInfoInternal, null, 2, null);
        }
        CalculatedUseCaseInfo calculatedUseCaseInfoSimulateAddUseCases = cameraUseCaseAdapterProvide.simulateAddUseCases(useCases, resolvedFeatureGroup, z);
        x.e(calculatedUseCaseInfoSimulateAddUseCases, "simulateAddUseCases(...)");
        return calculatedUseCaseInfoSimulateAddUseCases;
    }

    public static /* synthetic */ CalculatedUseCaseInfo simulateAddUseCases$default(CameraInfoInternal cameraInfoInternal, androidx.camera.core.SessionConfig sessionConfig, boolean z, ResolvedFeatureGroup resolvedFeatureGroup, int i2, Object obj) {
        boolean z2 = z & ((i2 & 4) == 0);
        if ((i2 & 8) != 0) {
            resolvedFeatureGroup = null;
        }
        return simulateAddUseCases(cameraInfoInternal, sessionConfig, z2, resolvedFeatureGroup);
    }

    public static /* synthetic */ void getCameraUseCaseAdapterProvider$annotations() {
    }

    public static final CalculatedUseCaseInfo simulateAddUseCases(CameraInfoInternal cameraInfoInternal, androidx.camera.core.SessionConfig sessionConfig, boolean z) {
        x.f(cameraInfoInternal, "cameraInfoInternal");
        x.f(sessionConfig, "sessionConfig");
        return simulateAddUseCases$default(cameraInfoInternal, sessionConfig, z, null, 8, null);
    }

    public static final CalculatedUseCaseInfo simulateAddUseCases(CameraInfoInternal cameraInfoInternal, androidx.camera.core.SessionConfig sessionConfig) {
        x.f(cameraInfoInternal, "cameraInfoInternal");
        x.f(sessionConfig, "sessionConfig");
        return simulateAddUseCases$default(cameraInfoInternal, sessionConfig, false, null, 12, null);
    }
}
