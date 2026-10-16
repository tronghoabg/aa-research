package androidx.camera.video;

import androidx.camera.core.featuregroup.GroupableFeature;
import androidx.camera.core.featuregroup.impl.feature.VideoStabilizationFeature;
import androidx.camera.core.impl.stabilization.VideoStabilization;
import androidx.camera.video.featuregroup.RecordingQualityFeature;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class GroupableFeatures {
    public static final GroupableFeature FHD_RECORDING;
    public static final GroupableFeature HD_RECORDING;
    public static final GroupableFeatures INSTANCE = new GroupableFeatures();
    public static final GroupableFeature QHD_RECORDING;
    public static final GroupableFeature SD_RECORDING;
    public static final GroupableFeature UHD_RECORDING;
    public static final GroupableFeature VIDEO_STABILIZATION;

    static {
        Quality quality = Quality.SD;
        x.e(quality, "SD");
        SD_RECORDING = new RecordingQualityFeature(quality);
        Quality quality2 = Quality.HD;
        x.e(quality2, "HD");
        HD_RECORDING = new RecordingQualityFeature(quality2);
        Quality quality3 = Quality.FHD;
        x.e(quality3, "FHD");
        FHD_RECORDING = new RecordingQualityFeature(quality3);
        Quality quality4 = Quality.QHD;
        x.e(quality4, "QHD");
        QHD_RECORDING = new RecordingQualityFeature(quality4);
        Quality quality5 = Quality.UHD;
        x.e(quality5, "UHD");
        UHD_RECORDING = new RecordingQualityFeature(quality5);
        VIDEO_STABILIZATION = new VideoStabilizationFeature(VideoStabilization.ON);
    }

    private GroupableFeatures() {
    }
}
