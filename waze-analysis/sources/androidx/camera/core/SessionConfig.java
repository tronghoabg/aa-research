package androidx.camera.core;

import android.util.Range;
import androidx.camera.core.featuregroup.GroupableFeature;
import androidx.camera.core.featuregroup.impl.UseCaseType;
import androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.utils.UseCaseUtil;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.core.util.Consumer;
import com.waze.strings.DisplayStrings;
import e.c.d.a;
import h.a.c;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class SessionConfig {
    private final CameraFilter cameraFilter;
    private final List<CameraEffect> effects;
    private Consumer<Set<GroupableFeature>> featureSelectionListener;
    private Executor featureSelectionListenerExecutor;
    private final Range<Integer> frameRateRange;
    private final boolean isAutoRotationEnabled;
    private final boolean isLegacy;
    private final List<GroupableFeature> preferredFeatureGroup;
    private final boolean requireNonEmptyUseCases;
    private final Set<GroupableFeature> requiredFeatureGroup;
    private final int sessionType;
    private final List<UseCase> useCases;
    private final ViewPort viewPort;

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FeatureTypeInternal.values().length];
            try {
                iArr[FeatureTypeInternal.DYNAMIC_RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FeatureTypeInternal.FPS_RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FeatureTypeInternal.VIDEO_STABILIZATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FeatureTypeInternal.IMAGE_FORMAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FeatureTypeInternal.RECORDING_QUALITY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SessionConfig(List list, ViewPort viewPort, List list2, Range range, Set set, List list3, boolean z, boolean z2, int i2, boolean z3, CameraFilter cameraFilter, int i3, o oVar) {
        Range range2;
        List listH = (i3 & 4) != 0 ? i.h() : list2;
        if ((i3 & 8) != 0) {
            range2 = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
            x.e(range2, "FRAME_RATE_RANGE_UNSPECIFIED");
        } else {
            range2 = range;
        }
        this(list, (i3 & 2) != 0 ? null : viewPort, listH, range2, (i3 & 16) != 0 ? a.p() : set, (i3 & 32) != 0 ? i.h() : list3, ((i3 & 64) == 0) & z, ((i3 & 128) == 0) & z2, (i3 & 256) != 0 ? 0 : i2, (!((i3 & 512) == 0)) | z3, (i3 & 1024) != 0 ? null : cameraFilter);
    }

    private final String getUseCaseName(UseCase useCase) {
        return useCase instanceof Preview ? "Preview" : useCase instanceof ImageCapture ? "ImageCapture" : useCase instanceof ImageAnalysis ? "ImageAnalysis" : UseCaseUtil.isVideoCapture(useCase) ? "VideoCapture" : "UseCase";
    }

    public static /* synthetic */ void setFeatureSelectionListener$default(SessionConfig sessionConfig, Executor executor, Consumer consumer, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFeatureSelectionListener");
        }
        if ((i2 & 1) != 0) {
            ScheduledExecutorService scheduledExecutorServiceMainThreadExecutor = CameraXExecutors.mainThreadExecutor();
            x.e(scheduledExecutorServiceMainThreadExecutor, "mainThreadExecutor(...)");
            executor = scheduledExecutorServiceMainThreadExecutor;
        }
        sessionConfig.setFeatureSelectionListener(executor, consumer);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void validateDefaultGroupableFeatureValues(androidx.camera.core.UseCase r8) {
        /*
            r7 = this;
            java.lang.String r7 = r7.getUseCaseName(r8)
            androidx.camera.core.featuregroup.impl.UseCaseType$Companion r0 = androidx.camera.core.featuregroup.impl.UseCaseType.Companion
            androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal r0 = r0.getAppConfiguredGroupableFeatureType$camera_core(r8)
            if (r0 != 0) goto Ld
            return
        Ld:
            java.lang.String r1 = r0.name()
            int r2 = r0.ordinal()
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L46
            if (r2 == r6) goto L43
            if (r2 == r5) goto L33
            if (r2 == r4) goto L2c
            if (r2 != r3) goto L26
            java.lang.String r8 = "Recorder.Builder.setQualitySelector"
            goto L4c
        L26:
            h.i r7 = new h.i
            r7.<init>()
            throw r7
        L2c:
            java.lang.String r8 = ".Builder.setOutputFormat"
        L2e:
            java.lang.String r8 = r7.concat(r8)
            goto L4c
        L33:
            boolean r8 = androidx.camera.core.impl.utils.UseCaseUtil.isVideoCapture(r8)
            if (r8 == 0) goto L3c
            java.lang.String r8 = ".Builder.setVideoStabilizationEnabled"
            goto L2e
        L3c:
            java.lang.String r8 = ".Builder.setPreviewStabilizationEnabled"
            java.lang.String r8 = r7.concat(r8)
            goto L4c
        L43:
            java.lang.String r8 = ".Builder.setTargetFrameRateRange"
            goto L48
        L46:
            java.lang.String r8 = ".Builder.setDynamicRange"
        L48:
            java.lang.String r8 = r7.concat(r8)
        L4c:
            int r2 = r0.ordinal()
            if (r2 == 0) goto L6c
            if (r2 == r6) goto L69
            if (r2 == r5) goto L66
            if (r2 == r4) goto L63
            if (r2 != r3) goto L5d
            java.lang.String r2 = "UHD recording quality"
            goto L6e
        L5d:
            h.i r7 = new h.i
            r7.<init>()
            throw r7
        L63:
            java.lang.String r2 = "JPEG_R output format"
            goto L6e
        L66:
            java.lang.String r2 = "stabilization"
            goto L6e
        L69:
            java.lang.String r2 = "60 FPS"
            goto L6e
        L6c:
            java.lang.String r2 = "HDR"
        L6e:
            int r0 = r0.ordinal()
            if (r0 == 0) goto L8e
            if (r0 == r6) goto L8b
            if (r0 == r5) goto L88
            if (r0 == r4) goto L85
            if (r0 == r3) goto L82
            h.i r7 = new h.i
            r7.<init>()
            throw r7
        L82:
            java.lang.String r0 = "GroupableFeatures.UHD_RECORDING"
            goto L90
        L85:
            java.lang.String r0 = "GroupableFeature.IMAGE_ULTRA_HDR"
            goto L90
        L88:
            java.lang.String r0 = "GroupableFeature.PREVIEW_STABILIZATION"
            goto L90
        L8b:
            java.lang.String r0 = "GroupableFeature.FPS_60"
            goto L90
        L8e:
            java.lang.String r0 = "GroupableFeature.HDR_HLG10"
        L90:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "A "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " value is set to "
            r3.append(r1)
            r3.append(r7)
            java.lang.String r7 = " despite using feature groups. Do not use APIs like "
            r3.append(r7)
            r3.append(r8)
            java.lang.String r7 = " while using feature groups. If, for example, "
            r3.append(r7)
            r3.append(r2)
            java.lang.String r7 = " is required, instead set "
            r3.append(r7)
            r3.append(r0)
            java.lang.String r7 = " as either a required or preferred feature."
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.SessionConfig.validateDefaultGroupableFeatureValues(androidx.camera.core.UseCase):void");
    }

    private final void validateFeatureGroups() {
        if (this.requiredFeatureGroup.isEmpty() && this.preferredFeatureGroup.isEmpty()) {
            return;
        }
        validateRequiredFeatures();
        if (i.aa(this.preferredFeatureGroup).size() != this.preferredFeatureGroup.size()) {
            throw new IllegalArgumentException("Duplicate values in preferredFeatures(" + this.preferredFeatureGroup + ")");
        }
        Set setAs = i.as(this.requiredFeatureGroup, this.preferredFeatureGroup);
        if (!setAs.isEmpty()) {
            Objects.toString(setAs);
            throw new IllegalArgumentException("requiredFeatures and preferredFeatures have duplicate values: ".concat(setAs.toString()));
        }
        for (UseCase useCase : this.useCases) {
            if (UseCaseType.Companion.getFeatureGroupUseCaseType(useCase) == UseCaseType.UNDEFINED) {
                Objects.toString(useCase);
                throw new IllegalArgumentException(String.valueOf(useCase).concat(" is not supported with feature group"));
            }
            validateDefaultGroupableFeatureValues(useCase);
        }
    }

    private final void validateFrameRate() {
        if (x.n(this.frameRateRange, StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
            return;
        }
        Iterator<UseCase> it = this.useCases.iterator();
        while (it.hasNext()) {
            if (it.next().getAppConfig().hasTargetFrameRate()) {
                throw new IllegalArgumentException("Can't set target frame rate on a UseCase (by Preview.Builder.setTargetFrameRate() or VideoCapture.Builder.setTargetFrameRate()) if the frame rate range has already been set in the SessionConfig.");
            }
        }
    }

    private final void validateRequiredFeatures() {
        Set<GroupableFeature> set = this.requiredFeatureGroup;
        ArrayList arrayList = new ArrayList(i.q(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((GroupableFeature) it.next()).getFeatureTypeInternal());
        }
        for (FeatureTypeInternal featureTypeInternal : i.aa(arrayList)) {
            Set<GroupableFeature> set2 = this.requiredFeatureGroup;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : set2) {
                if (((GroupableFeature) obj).getFeatureTypeInternal() == featureTypeInternal) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = arrayList2;
            if (arrayList3.size() > 1) {
                arrayList3.toString();
                throw new IllegalArgumentException("requiredFeatures has conflicting feature values: ".concat(arrayList3.toString()));
            }
        }
    }

    public final CameraFilter getCameraFilter() {
        return this.cameraFilter;
    }

    public final List<CameraEffect> getEffects() {
        return this.effects;
    }

    public final Consumer<Set<GroupableFeature>> getFeatureSelectionListener() {
        return this.featureSelectionListener;
    }

    public final Executor getFeatureSelectionListenerExecutor() {
        return this.featureSelectionListenerExecutor;
    }

    public final Range<Integer> getFrameRateRange() {
        return this.frameRateRange;
    }

    public final List<GroupableFeature> getPreferredFeatureGroup() {
        return this.preferredFeatureGroup;
    }

    public final boolean getRequireNonEmptyUseCases() {
        return this.requireNonEmptyUseCases;
    }

    public final Set<GroupableFeature> getRequiredFeatureGroup() {
        return this.requiredFeatureGroup;
    }

    public final int getSessionType() {
        return this.sessionType;
    }

    public final List<UseCase> getUseCases() {
        return this.useCases;
    }

    public final ViewPort getViewPort() {
        return this.viewPort;
    }

    public final boolean isAutoRotationEnabled() {
        return this.isAutoRotationEnabled;
    }

    public final boolean isLegacy() {
        return this.isLegacy;
    }

    public final void setFeatureSelectionListener(Executor executor, Consumer<Set<GroupableFeature>> consumer) {
        x.f(executor, "executor");
        x.f(consumer, "listener");
        this.featureSelectionListener = consumer;
        this.featureSelectionListenerExecutor = executor;
    }

    public String toString() {
        return "SessionConfig@" + Integer.toHexString(System.identityHashCode(this)) + " {useCases=" + this.useCases + ", frameRateRange=" + this.frameRateRange + ", requiredFeatureGroup=" + this.requiredFeatureGroup + ", preferredFeatureGroup=" + this.preferredFeatureGroup + ", effects=" + this.effects + ", viewPort=" + this.viewPort + "}";
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private Range<Integer> _frameRateRange;
        private boolean _isAutoRotationEnabled;
        private ViewPort _viewPort;
        private CameraFilter cameraFilter;
        private List<CameraEffect> effects;
        private final List<GroupableFeature> preferredFeatureGroup;
        private boolean requireNonEmptyUseCases;
        private final List<GroupableFeature> requiredFeatureGroup;
        private int sessionType;
        private final List<UseCase> useCases;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(SessionConfig sessionConfig) {
            this(sessionConfig.getUseCases());
            x.f(sessionConfig, "sessionConfig");
            this._viewPort = sessionConfig.getViewPort();
            this.effects = i.aq(sessionConfig.getEffects());
            this._frameRateRange = sessionConfig.getFrameRateRange();
            this.requiredFeatureGroup.addAll(sessionConfig.getRequiredFeatureGroup());
            this.preferredFeatureGroup.addAll(sessionConfig.getPreferredFeatureGroup());
            this._isAutoRotationEnabled = sessionConfig.isAutoRotationEnabled();
            this.cameraFilter = sessionConfig.getCameraFilter();
            this.sessionType = sessionConfig.getSessionType();
            this.requireNonEmptyUseCases = sessionConfig.getRequireNonEmptyUseCases();
        }

        public final Builder addEffect(CameraEffect cameraEffect) {
            x.f(cameraEffect, "effect");
            this.effects.add(cameraEffect);
            return this;
        }

        public final SessionConfig build() {
            ViewPort viewPort = this._viewPort;
            List listAo = i.ao(this.effects);
            List<GroupableFeature> list = this.requiredFeatureGroup;
            Range<Integer> range = this._frameRateRange;
            Set setAu = i.au(list);
            List listAo2 = i.ao(this.preferredFeatureGroup);
            boolean z = this._isAutoRotationEnabled;
            CameraFilter cameraFilter = this.cameraFilter;
            return new SessionConfig(this.useCases, viewPort, listAo, range, setAu, listAo2, z, false, this.sessionType, this.requireNonEmptyUseCases, cameraFilter, 128, null);
        }

        public final /* synthetic */ Range getFrameRateRange() {
            return this._frameRateRange;
        }

        public final /* synthetic */ ViewPort getViewPort() {
            return this._viewPort;
        }

        public final /* synthetic */ boolean isAutoRotationEnabled() {
            return this._isAutoRotationEnabled;
        }

        public final Builder setAutoRotationEnabled(boolean z) {
            this._isAutoRotationEnabled = z;
            return this;
        }

        public final Builder setFrameRateRange(Range<Integer> range) {
            x.f(range, "frameRateRange");
            this._frameRateRange = range;
            return this;
        }

        public final Builder setPreferredFeatureGroup(GroupableFeature... groupableFeatureArr) {
            x.f(groupableFeatureArr, "features");
            this.preferredFeatureGroup.clear();
            i.aF(this.preferredFeatureGroup, groupableFeatureArr);
            return this;
        }

        public final Builder setRequiredFeatureGroup(GroupableFeature... groupableFeatureArr) {
            x.f(groupableFeatureArr, "features");
            this.requiredFeatureGroup.clear();
            i.aF(this.requiredFeatureGroup, groupableFeatureArr);
            return this;
        }

        public final Builder setViewPort(ViewPort viewPort) {
            x.f(viewPort, "viewPort");
            this._viewPort = viewPort;
            return this;
        }

        /* renamed from: setAutoRotationEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m1333setAutoRotationEnabled(boolean z) {
            this._isAutoRotationEnabled = z;
        }

        /* renamed from: setFrameRateRange, reason: collision with other method in class */
        public final /* synthetic */ void m1334setFrameRateRange(Range range) {
            x.f(range, "value");
            this._frameRateRange = range;
        }

        /* renamed from: setViewPort, reason: collision with other method in class */
        public final /* synthetic */ void m1335setViewPort(ViewPort viewPort) {
            this._viewPort = viewPort;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder(List<? extends UseCase> list) {
            x.f(list, "useCases");
            this.useCases = list;
            this.effects = new ArrayList();
            Range<Integer> range = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
            x.e(range, "FRAME_RATE_RANGE_UNSPECIFIED");
            this._frameRateRange = range;
            this.requiredFeatureGroup = new ArrayList();
            this.preferredFeatureGroup = new ArrayList();
            this.requireNonEmptyUseCases = true;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(UseCase... useCaseArr) {
            this((List<? extends UseCase>) c.X(useCaseArr));
            x.f(useCaseArr, "useCases");
        }
    }

    public final void setFeatureSelectionListener(Consumer<Set<GroupableFeature>> consumer) {
        x.f(consumer, "listener");
        setFeatureSelectionListener$default(this, null, consumer, 1, null);
    }

    static final void featureSelectionListener$lambda$0(Set set) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SessionConfig(List<? extends UseCase> list, ViewPort viewPort) {
        this(list, viewPort, null, null, null, null, 60, null);
        x.f(list, "useCases");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SessionConfig(List<? extends UseCase> list, ViewPort viewPort, List<? extends CameraEffect> list2) {
        this(list, viewPort, list2, null, null, null, 56, null);
        x.f(list, "useCases");
        x.f(list2, "effects");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SessionConfig(List<? extends UseCase> list, ViewPort viewPort, List<? extends CameraEffect> list2, Range<Integer> range) {
        this(list, viewPort, list2, range, null, null, 48, null);
        x.f(list, "useCases");
        x.f(list2, "effects");
        x.f(range, "frameRateRange");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SessionConfig(List<? extends UseCase> list, ViewPort viewPort, List<? extends CameraEffect> list2, Range<Integer> range, Set<? extends GroupableFeature> set) {
        this(list, viewPort, list2, range, set, null, 32, null);
        x.f(list, "useCases");
        x.f(list2, "effects");
        x.f(range, "frameRateRange");
        x.f(set, "requiredFeatureGroup");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SessionConfig(List<? extends UseCase> list, ViewPort viewPort, List<? extends CameraEffect> list2, Range<Integer> range, Set<? extends GroupableFeature> set, List<? extends GroupableFeature> list3) {
        this(list, viewPort, list2, range, set, list3, false, false, 0, false, null, DisplayStrings.DS_CUSTOM_PROMPT_ARRIVE, null);
        x.f(list, "useCases");
        x.f(list2, "effects");
        x.f(range, "frameRateRange");
        x.f(set, "requiredFeatureGroup");
        x.f(list3, "preferredFeatureGroup");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SessionConfig(List list, ViewPort viewPort, List list2, Range range, Set set, List list3, int i2, o oVar) {
        List listH = (i2 & 4) != 0 ? i.h() : list2;
        if ((i2 & 8) != 0) {
            range = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
            x.e(range, "FRAME_RATE_RANGE_UNSPECIFIED");
        }
        this(list, (i2 & 2) != 0 ? null : viewPort, listH, range, (i2 & 16) != 0 ? a.p() : set, (i2 & 32) != 0 ? i.h() : list3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SessionConfig(List<? extends UseCase> list, ViewPort viewPort, List<? extends CameraEffect> list2, Range<Integer> range, Set<? extends GroupableFeature> set, List<? extends GroupableFeature> list3, boolean z, boolean z2, int i2, boolean z3, CameraFilter cameraFilter) {
        x.f(list, "useCases");
        x.f(list2, "effects");
        x.f(range, "frameRateRange");
        x.f(set, "requiredFeatureGroup");
        x.f(list3, "preferredFeatureGroup");
        this.viewPort = viewPort;
        this.effects = list2;
        this.frameRateRange = range;
        this.requiredFeatureGroup = set;
        this.preferredFeatureGroup = list3;
        this.isAutoRotationEnabled = z;
        this.isLegacy = z2;
        this.sessionType = i2;
        this.requireNonEmptyUseCases = z3;
        this.cameraFilter = cameraFilter;
        this.useCases = i.aa(list);
        this.featureSelectionListener = new Consumer() { // from class: androidx.camera.core.SessionConfig$$ExternalSyntheticLambda0
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
            }
        };
        ScheduledExecutorService scheduledExecutorServiceMainThreadExecutor = CameraXExecutors.mainThreadExecutor();
        x.e(scheduledExecutorServiceMainThreadExecutor, "mainThreadExecutor(...)");
        this.featureSelectionListenerExecutor = scheduledExecutorServiceMainThreadExecutor;
        if (z3 && list.isEmpty()) {
            throw new IllegalArgumentException("SessionConfig must contain at least one UseCase.");
        }
        validateFrameRate();
        validateFeatureGroups();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SessionConfig(List<? extends UseCase> list) {
        this(list, null, null, null, null, null, 62, null);
        x.f(list, "useCases");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SessionConfig(UseCase... useCaseArr) {
        this(c.X(useCaseArr), null, null, null, null, null, 62, null);
        x.f(useCaseArr, "useCases");
    }
}
