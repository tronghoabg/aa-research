package androidx.camera.core.featuregroup.impl;

import androidx.camera.core.Logger;
import androidx.camera.core.SessionConfig;
import androidx.camera.core.UseCase;
import androidx.camera.core.featuregroup.GroupableFeature;
import androidx.camera.core.featuregroup.impl.resolver.DefaultFeatureGroupResolver;
import androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult;
import androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolver;
import androidx.camera.core.impl.CameraInfoInternal;
import h.g.b.o;
import h.g.b.x;
import h.i;
import java.util.Objects;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ResolvedFeatureGroup {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "ResolvedFeatureGroup";
    private final Set<GroupableFeature> features;

    /* JADX WARN: Multi-variable type inference failed */
    public ResolvedFeatureGroup(Set<? extends GroupableFeature> set) {
        x.f(set, "features");
        this.features = set;
    }

    public static final ResolvedFeatureGroup resolveFeatureGroup(SessionConfig sessionConfig, CameraInfoInternal cameraInfoInternal) {
        return Companion.resolveFeatureGroup(sessionConfig, cameraInfoInternal);
    }

    public final Set<GroupableFeature> getFeatures() {
        return this.features;
    }

    public String toString() {
        return "ResolvedFeatureGroup(features=" + this.features + ")";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public static /* synthetic */ ResolvedFeatureGroup resolveFeatureGroup$default(Companion companion, SessionConfig sessionConfig, CameraInfoInternal cameraInfoInternal, FeatureGroupResolver featureGroupResolver, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                featureGroupResolver = new DefaultFeatureGroupResolver(cameraInfoInternal);
            }
            return companion.resolveFeatureGroup(sessionConfig, cameraInfoInternal, featureGroupResolver);
        }

        public final ResolvedFeatureGroup resolveFeatureGroup(SessionConfig sessionConfig, CameraInfoInternal cameraInfoInternal, FeatureGroupResolver featureGroupResolver) {
            x.f(sessionConfig, "<this>");
            x.f(cameraInfoInternal, "cameraInfoInternal");
            x.f(featureGroupResolver, "resolver");
            Logger.d(ResolvedFeatureGroup.TAG, "resolveFeatureGroup: sessionConfig = " + sessionConfig + ", lensFacing = " + cameraInfoInternal.getLensFacing());
            if (sessionConfig.getRequiredFeatureGroup().isEmpty() && sessionConfig.getPreferredFeatureGroup().isEmpty()) {
                return null;
            }
            FeatureGroupResolutionResult featureGroupResolutionResultResolveFeatureGroup = featureGroupResolver.resolveFeatureGroup(sessionConfig);
            if (featureGroupResolutionResultResolveFeatureGroup instanceof FeatureGroupResolutionResult.Supported) {
                ResolvedFeatureGroup resolvedFeatureGroup = ((FeatureGroupResolutionResult.Supported) featureGroupResolutionResultResolveFeatureGroup).getResolvedFeatureGroup();
                Objects.toString(resolvedFeatureGroup);
                Logger.d(ResolvedFeatureGroup.TAG, "resolvedFeatureGroup = ".concat(String.valueOf(resolvedFeatureGroup)));
                return resolvedFeatureGroup;
            }
            if (featureGroupResolutionResultResolveFeatureGroup instanceof FeatureGroupResolutionResult.Unsupported) {
                throw new IllegalArgumentException("Feature group is not supported");
            }
            if (featureGroupResolutionResultResolveFeatureGroup instanceof FeatureGroupResolutionResult.UnsupportedUseCase) {
                UseCase unsupportedUseCase = ((FeatureGroupResolutionResult.UnsupportedUseCase) featureGroupResolutionResultResolveFeatureGroup).getUnsupportedUseCase();
                Objects.toString(unsupportedUseCase);
                throw new IllegalArgumentException(String.valueOf(unsupportedUseCase).concat(" is not supported"));
            }
            if (!(featureGroupResolutionResultResolveFeatureGroup instanceof FeatureGroupResolutionResult.UseCaseMissing)) {
                throw new i();
            }
            FeatureGroupResolutionResult.UseCaseMissing useCaseMissing = (FeatureGroupResolutionResult.UseCaseMissing) featureGroupResolutionResultResolveFeatureGroup;
            throw new IllegalArgumentException(useCaseMissing.getRequiredUseCases() + " must be added for " + useCaseMissing.getFeatureRequiring());
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final ResolvedFeatureGroup resolveFeatureGroup(SessionConfig sessionConfig, CameraInfoInternal cameraInfoInternal) {
            x.f(sessionConfig, "<this>");
            x.f(cameraInfoInternal, "cameraInfoInternal");
            return resolveFeatureGroup$default(this, sessionConfig, cameraInfoInternal, null, 2, null);
        }
    }

    public static final ResolvedFeatureGroup resolveFeatureGroup(SessionConfig sessionConfig, CameraInfoInternal cameraInfoInternal, FeatureGroupResolver featureGroupResolver) {
        return Companion.resolveFeatureGroup(sessionConfig, cameraInfoInternal, featureGroupResolver);
    }
}
