package androidx.camera.core.internal;

import android.util.Range;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraConfigs;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.StreamSpec;
import com.waze.strings.DisplayStrings;
import h.a.i;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface StreamSpecsCalculator {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final StreamSpecsCalculator NO_OP_STREAM_SPECS_CALCULATOR = new StreamSpecsCalculator() { // from class: androidx.camera.core.internal.StreamSpecsCalculator$Companion$NO_OP_STREAM_SPECS_CALCULATOR$1
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.camera.core.internal.StreamSpecsCalculator
        public StreamSpecQueryResult calculateSuggestedStreamSpecs(int i2, CameraInfoInternal cameraInfoInternal, List<? extends UseCase> list, List<? extends UseCase> list2, CameraConfig cameraConfig, int i3, Range<Integer> range, boolean z, boolean z2) {
            x.f(cameraInfoInternal, "cameraInfoInternal");
            x.f(list, "newUseCases");
            x.f(list2, "attachedUseCases");
            x.f(cameraConfig, "cameraConfig");
            x.f(range, "targetFrameRate");
            return new StreamSpecQueryResult(null, 0, 3, 0 == true ? 1 : 0);
        }

        @Override // androidx.camera.core.internal.StreamSpecsCalculator
        public /* synthetic */ void setCameraDeviceSurfaceManager(CameraDeviceSurfaceManager cameraDeviceSurfaceManager) {
            x.f(cameraDeviceSurfaceManager, "cameraDeviceSurfaceManager");
        }
    };

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.core.internal.StreamSpecsCalculator$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        static {
            Companion companion = StreamSpecsCalculator.Companion;
        }

        public static /* synthetic */ StreamSpecQueryResult calculateSuggestedStreamSpecs$default(StreamSpecsCalculator streamSpecsCalculator, int i2, CameraInfoInternal cameraInfoInternal, List list, List list2, CameraConfig cameraConfig, int i3, Range range, boolean z, boolean z2, int i4, Object obj) {
            CameraConfig cameraConfig2;
            Range range2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateSuggestedStreamSpecs");
            }
            List listH = (i4 & 8) != 0 ? i.h() : list2;
            if ((i4 & 16) != 0) {
                CameraConfig cameraConfigDefaultConfig = CameraConfigs.defaultConfig();
                x.e(cameraConfigDefaultConfig, "defaultConfig(...)");
                cameraConfig2 = cameraConfigDefaultConfig;
            } else {
                cameraConfig2 = cameraConfig;
            }
            int i5 = (i4 & 32) != 0 ? 0 : i3;
            if ((i4 & 64) != 0) {
                Range<Integer> range3 = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
                x.e(range3, "FRAME_RATE_RANGE_UNSPECIFIED");
                range2 = range3;
            } else {
                range2 = range;
            }
            return streamSpecsCalculator.calculateSuggestedStreamSpecs(i2, cameraInfoInternal, list, listH, cameraConfig2, i5, range2, ((i4 & 128) == 0) & z, ((i4 & 256) == 0) & z2);
        }
    }

    StreamSpecQueryResult calculateSuggestedStreamSpecs(int i2, CameraInfoInternal cameraInfoInternal, List<? extends UseCase> list, List<? extends UseCase> list2, CameraConfig cameraConfig, int i3, Range<Integer> range, boolean z, boolean z2);

    void setCameraDeviceSurfaceManager(CameraDeviceSurfaceManager cameraDeviceSurfaceManager);

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ StreamSpecQueryResult calculateSuggestedStreamSpecsCompat$default(Companion companion, StreamSpecsCalculator streamSpecsCalculator, int i2, CameraInfoInternal cameraInfoInternal, List list, CameraConfig cameraConfig, boolean z, List list2, int i3, Range range, boolean z2, int i4, Object obj) {
            CameraConfig cameraConfig2;
            Range range2;
            if ((i4 & 8) != 0) {
                CameraConfig cameraConfigDefaultConfig = CameraConfigs.defaultConfig();
                x.e(cameraConfigDefaultConfig, "defaultConfig(...)");
                cameraConfig2 = cameraConfigDefaultConfig;
            } else {
                cameraConfig2 = cameraConfig;
            }
            boolean z3 = ((i4 & 16) == 0) & z;
            List listH = (i4 & 32) != 0 ? i.h() : list2;
            int i5 = (i4 & 64) != 0 ? 0 : i3;
            if ((i4 & 128) != 0) {
                Range<Integer> range3 = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
                x.e(range3, "FRAME_RATE_RANGE_UNSPECIFIED");
                range2 = range3;
            } else {
                range2 = range;
            }
            return companion.calculateSuggestedStreamSpecsCompat(streamSpecsCalculator, i2, cameraInfoInternal, list, cameraConfig2, z3, listH, i5, range2, ((i4 & 256) == 0) & z2);
        }

        public final StreamSpecQueryResult calculateSuggestedStreamSpecsCompat(StreamSpecsCalculator streamSpecsCalculator, int i2, CameraInfoInternal cameraInfoInternal, List<? extends UseCase> list, CameraConfig cameraConfig, boolean z, List<? extends UseCase> list2, int i3, Range<Integer> range) {
            x.f(streamSpecsCalculator, "<this>");
            x.f(cameraInfoInternal, "cameraInfoInternal");
            x.f(list, "newUseCases");
            x.f(cameraConfig, "cameraConfig");
            x.f(list2, "attachedUseCases");
            x.f(range, "targetFrameRate");
            return calculateSuggestedStreamSpecsCompat$default(this, streamSpecsCalculator, i2, cameraInfoInternal, list, cameraConfig, z, list2, i3, range, false, 256, null);
        }

        public final StreamSpecQueryResult calculateSuggestedStreamSpecsCompat(StreamSpecsCalculator streamSpecsCalculator, int i2, CameraInfoInternal cameraInfoInternal, List<? extends UseCase> list, CameraConfig cameraConfig) {
            x.f(streamSpecsCalculator, "<this>");
            x.f(cameraInfoInternal, "cameraInfoInternal");
            x.f(list, "newUseCases");
            x.f(cameraConfig, "cameraConfig");
            return calculateSuggestedStreamSpecsCompat$default(this, streamSpecsCalculator, i2, cameraInfoInternal, list, cameraConfig, false, null, 0, null, false, DisplayStrings.DS_REPORT_MENU_V2_CRASH_REPORT_LABEL, null);
        }

        public final StreamSpecQueryResult calculateSuggestedStreamSpecsCompat(StreamSpecsCalculator streamSpecsCalculator, int i2, CameraInfoInternal cameraInfoInternal, List<? extends UseCase> list, CameraConfig cameraConfig, boolean z) {
            x.f(streamSpecsCalculator, "<this>");
            x.f(cameraInfoInternal, "cameraInfoInternal");
            x.f(list, "newUseCases");
            x.f(cameraConfig, "cameraConfig");
            return calculateSuggestedStreamSpecsCompat$default(this, streamSpecsCalculator, i2, cameraInfoInternal, list, cameraConfig, z, null, 0, null, false, 480, null);
        }

        public final StreamSpecQueryResult calculateSuggestedStreamSpecsCompat(StreamSpecsCalculator streamSpecsCalculator, int i2, CameraInfoInternal cameraInfoInternal, List<? extends UseCase> list, CameraConfig cameraConfig, boolean z, List<? extends UseCase> list2) {
            x.f(streamSpecsCalculator, "<this>");
            x.f(cameraInfoInternal, "cameraInfoInternal");
            x.f(list, "newUseCases");
            x.f(cameraConfig, "cameraConfig");
            x.f(list2, "attachedUseCases");
            return calculateSuggestedStreamSpecsCompat$default(this, streamSpecsCalculator, i2, cameraInfoInternal, list, cameraConfig, z, list2, 0, null, false, DisplayStrings.DS_ACCIDENT, null);
        }

        public final StreamSpecQueryResult calculateSuggestedStreamSpecsCompat(StreamSpecsCalculator streamSpecsCalculator, int i2, CameraInfoInternal cameraInfoInternal, List<? extends UseCase> list, CameraConfig cameraConfig, boolean z, List<? extends UseCase> list2, int i3) {
            x.f(streamSpecsCalculator, "<this>");
            x.f(cameraInfoInternal, "cameraInfoInternal");
            x.f(list, "newUseCases");
            x.f(cameraConfig, "cameraConfig");
            x.f(list2, "attachedUseCases");
            return calculateSuggestedStreamSpecsCompat$default(this, streamSpecsCalculator, i2, cameraInfoInternal, list, cameraConfig, z, list2, i3, null, false, 384, null);
        }

        public final StreamSpecQueryResult calculateSuggestedStreamSpecsCompat(StreamSpecsCalculator streamSpecsCalculator, int i2, CameraInfoInternal cameraInfoInternal, List<? extends UseCase> list) {
            x.f(streamSpecsCalculator, "<this>");
            x.f(cameraInfoInternal, "cameraInfoInternal");
            x.f(list, "newUseCases");
            return calculateSuggestedStreamSpecsCompat$default(this, streamSpecsCalculator, i2, cameraInfoInternal, list, null, false, null, 0, null, false, 504, null);
        }

        public final StreamSpecQueryResult calculateSuggestedStreamSpecsCompat(StreamSpecsCalculator streamSpecsCalculator, int i2, CameraInfoInternal cameraInfoInternal, List<? extends UseCase> list, CameraConfig cameraConfig, boolean z, List<? extends UseCase> list2, int i3, Range<Integer> range, boolean z2) {
            x.f(streamSpecsCalculator, "<this>");
            x.f(cameraInfoInternal, "cameraInfoInternal");
            x.f(list, "newUseCases");
            x.f(cameraConfig, "cameraConfig");
            x.f(list2, "attachedUseCases");
            x.f(range, "targetFrameRate");
            return streamSpecsCalculator.calculateSuggestedStreamSpecs(i2, cameraInfoInternal, list, list2, cameraConfig, i3, range, z, z2);
        }
    }
}
