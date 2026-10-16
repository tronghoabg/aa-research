package androidx.camera.video;

import android.util.Size;
import androidx.camera.core.DynamicRange;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface VideoCapabilities {
    public static final VideoCapabilities EMPTY = new VideoCapabilities() { // from class: androidx.camera.video.VideoCapabilities.1
        @Override // androidx.camera.video.VideoCapabilities
        public /* synthetic */ Size getResolution(Quality quality, DynamicRange dynamicRange) {
            return null;
        }

        @Override // androidx.camera.video.VideoCapabilities
        public Set<DynamicRange> getSupportedDynamicRanges() {
            return new HashSet();
        }

        @Override // androidx.camera.video.VideoCapabilities
        public List<Quality> getSupportedQualities(DynamicRange dynamicRange) {
            return new ArrayList();
        }

        @Override // androidx.camera.video.VideoCapabilities
        public boolean isQualitySupported(Quality quality, DynamicRange dynamicRange) {
            return false;
        }

        @Override // androidx.camera.video.VideoCapabilities
        public /* synthetic */ boolean isStabilizationSupported() {
            return false;
        }
    };

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.video.VideoCapabilities$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Size $default$getResolution(VideoCapabilities videoCapabilities, Quality quality, DynamicRange dynamicRange) {
            return null;
        }

        public static boolean $default$isStabilizationSupported(VideoCapabilities videoCapabilities) {
            return false;
        }
    }

    Size getResolution(Quality quality, DynamicRange dynamicRange);

    Set<DynamicRange> getSupportedDynamicRanges();

    List<Quality> getSupportedQualities(DynamicRange dynamicRange);

    boolean isQualitySupported(Quality quality, DynamicRange dynamicRange);

    boolean isStabilizationSupported();
}
