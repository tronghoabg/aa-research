package androidx.camera.core.featuregroup.impl.resolver;

import androidx.camera.core.Logger;
import androidx.camera.core.SessionConfig;
import androidx.camera.core.UseCase;
import androidx.camera.core.featuregroup.GroupableFeature;
import androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup;
import androidx.camera.core.featuregroup.impl.UseCaseType;
import androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal;
import androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.stabilization.VideoStabilization;
import e.c.d.a;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DefaultFeatureGroupResolver implements FeatureGroupResolver {
    private static final Companion Companion = new Companion(null);
    private static final String TAG = "DefaultFeatureGroupResolver";
    private final CameraInfoInternal cameraInfoInternal;

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VideoStabilization.values().length];
            try {
                iArr[VideoStabilization.PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoStabilization.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FeatureTypeInternal.values().length];
            try {
                iArr2[FeatureTypeInternal.IMAGE_FORMAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FeatureTypeInternal.DYNAMIC_RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FeatureTypeInternal.FPS_RANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FeatureTypeInternal.VIDEO_STABILIZATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FeatureTypeInternal.RECORDING_QUALITY.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public DefaultFeatureGroupResolver(CameraInfoInternal cameraInfoInternal) {
        x.f(cameraInfoInternal, "cameraInfoInternal");
        this.cameraInfoInternal = cameraInfoInternal;
    }

    private final FeatureGroupResolutionResult getFeatureListResolvedByPriority(SessionConfig sessionConfig, List<? extends GroupableFeature> list, int i2, List<? extends GroupableFeature> list2) {
        if (i2 < list.size()) {
            int i3 = i2 + 1;
            FeatureGroupResolutionResult featureListResolvedByPriority = getFeatureListResolvedByPriority(sessionConfig, list, i3, i.ag(list2, list.get(i2)));
            return featureListResolvedByPriority instanceof FeatureGroupResolutionResult.Supported ? featureListResolvedByPriority : getFeatureListResolvedByPriority(sessionConfig, list, i3, list2);
        }
        Set<? extends GroupableFeature> setV = a.v(sessionConfig.getRequiredFeatureGroup(), list2);
        Logger.d(TAG, "getFeatureListResolvedByPriority: features = " + setV + ", useCases = " + sessionConfig.getUseCases());
        return (isConflictFree(setV) && this.cameraInfoInternal.isResolvedFeatureGroupSupported(new ResolvedFeatureGroup(setV), sessionConfig)) ? new FeatureGroupResolutionResult.Supported(new ResolvedFeatureGroup(setV)) : FeatureGroupResolutionResult.Unsupported.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ FeatureGroupResolutionResult getFeatureListResolvedByPriority$default(DefaultFeatureGroupResolver defaultFeatureGroupResolver, SessionConfig sessionConfig, List list, int i2, List list2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            list2 = i.h();
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return defaultFeatureGroupResolver.getFeatureListResolvedByPriority(sessionConfig, list, i2, list2);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.UseCaseMissing getMissingUseCase(androidx.camera.core.featuregroup.GroupableFeature r8, java.util.List<? extends androidx.camera.core.UseCase> r9) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.featuregroup.impl.resolver.DefaultFeatureGroupResolver.getMissingUseCase(androidx.camera.core.featuregroup.GroupableFeature, java.util.List):androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult$UseCaseMissing");
    }

    private final boolean isConflictFree(Set<? extends GroupableFeature> set) {
        Set<? extends GroupableFeature> set2 = set;
        ArrayList arrayList = new ArrayList(i.q(set2, 10));
        Iterator<T> it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(((GroupableFeature) it.next()).getFeatureTypeInternal());
        }
        for (FeatureTypeInternal featureTypeInternal : i.aa(arrayList)) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : set2) {
                if (((GroupableFeature) obj).getFeatureTypeInternal() == featureTypeInternal) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.size() > 1) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolver
    public FeatureGroupResolutionResult resolveFeatureGroup(SessionConfig sessionConfig) {
        x.f(sessionConfig, "sessionConfig");
        List<UseCase> useCases = sessionConfig.getUseCases();
        Set<GroupableFeature> requiredFeatureGroup = sessionConfig.getRequiredFeatureGroup();
        List<GroupableFeature> preferredFeatureGroup = sessionConfig.getPreferredFeatureGroup();
        if (requiredFeatureGroup.isEmpty() && preferredFeatureGroup.isEmpty()) {
            throw new IllegalArgumentException("Must have at least one required or preferred feature");
        }
        for (UseCase useCase : useCases) {
            if (UseCaseType.Companion.getFeatureGroupUseCaseType(useCase) == UseCaseType.UNDEFINED) {
                return new FeatureGroupResolutionResult.UnsupportedUseCase(useCase);
            }
        }
        Iterator<T> it = requiredFeatureGroup.iterator();
        while (it.hasNext()) {
            FeatureGroupResolutionResult.UseCaseMissing missingUseCase = getMissingUseCase((GroupableFeature) it.next(), useCases);
            if (missingUseCase != null) {
                return missingUseCase;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : preferredFeatureGroup) {
            FeatureGroupResolutionResult.UseCaseMissing missingUseCase2 = getMissingUseCase((GroupableFeature) obj, useCases);
            if (missingUseCase2 != null) {
                Objects.toString(missingUseCase2);
                Logger.d(TAG, "resolveFeatureGroup: filtered out preferred feature due to ".concat(missingUseCase2.toString()));
            } else {
                missingUseCase2 = null;
            }
            if (missingUseCase2 == null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        arrayList2.toString();
        Logger.d(TAG, "resolveFeatureGroup: filteredPreferredFeatures = ".concat(arrayList2.toString()));
        return getFeatureListResolvedByPriority$default(this, sessionConfig, arrayList2, 0, null, 12, null);
    }

    /* compiled from: WazeSource */
    final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
