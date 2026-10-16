package androidx.camera.core.featuregroup.impl;

import android.util.Size;
import android.view.Surface;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.utils.futures.Futures;
import com.google.d.m.a.bm;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface FeatureCombinationQuery {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final FeatureCombinationQuery NO_OP_FEATURE_COMBINATION_QUERY = new FeatureCombinationQuery() { // from class: androidx.camera.core.featuregroup.impl.FeatureCombinationQuery$Companion$NO_OP_FEATURE_COMBINATION_QUERY$1
        @Override // androidx.camera.core.featuregroup.impl.FeatureCombinationQuery
        public boolean isSupported(SessionConfig sessionConfig) {
            x.f(sessionConfig, "sessionConfig");
            return false;
        }
    };

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.core.featuregroup.impl.FeatureCombinationQuery$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        static {
            Companion companion = FeatureCombinationQuery.Companion;
        }

        public static SessionConfig.Builder createSessionConfigBuilder(UseCaseConfig<?> useCaseConfig, Size size, DynamicRange dynamicRange) {
            return FeatureCombinationQuery.Companion.createSessionConfigBuilder(useCaseConfig, size, dynamicRange);
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final SessionConfig.Builder createSessionConfigBuilder(UseCaseConfig<?> useCaseConfig, final Size size, DynamicRange dynamicRange) {
            x.f(useCaseConfig, "<this>");
            x.f(size, "resolution");
            x.f(dynamicRange, "dynamicRange");
            final int inputFormat = useCaseConfig.getInputFormat();
            DeferrableSurface deferrableSurface = new DeferrableSurface(size, inputFormat) { // from class: androidx.camera.core.featuregroup.impl.FeatureCombinationQuery$Companion$createSessionConfigBuilder$deferrableSurface$1
                @Override // androidx.camera.core.impl.DeferrableSurface
                protected bm<Surface> provideSurface() {
                    bm<Surface> bmVarImmediateFuture = Futures.immediateFuture(null);
                    x.e(bmVarImmediateFuture, "immediateFuture(...)");
                    return bmVarImmediateFuture;
                }
            };
            Class<?> surfaceClass = UseCaseType.Companion.getFeatureGroupUseCaseType(useCaseConfig).getSurfaceClass();
            if (surfaceClass != null) {
                deferrableSurface.setContainerClass(surfaceClass);
            }
            SessionConfig.Builder builderAddSurface = SessionConfig.Builder.createFrom(useCaseConfig, size).addSurface(deferrableSurface, dynamicRange);
            x.e(builderAddSurface, "addSurface(...)");
            return builderAddSurface;
        }
    }

    boolean isSupported(SessionConfig sessionConfig);
}
