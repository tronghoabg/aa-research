package androidx.camera.video.internal.encoder;

import android.util.Range;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface VideoEncoderInfo extends EncoderInfo {

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.video.internal.encoder.VideoEncoderInfo$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$isSizeSupportedAllowSwapping(VideoEncoderInfo videoEncoderInfo, int i2, int i3) {
            if (videoEncoderInfo.isSizeSupported(i2, i3)) {
                return true;
            }
            return videoEncoderInfo.canSwapWidthHeight() && videoEncoderInfo.isSizeSupported(i3, i2);
        }
    }

    /* compiled from: WazeSource */
    public interface Finder {
        VideoEncoderInfo find(String str);
    }

    boolean canSwapWidthHeight();

    int getHeightAlignment();

    Range<Integer> getSupportedBitrateRange();

    Range<Integer> getSupportedHeights();

    Range<Integer> getSupportedHeightsFor(int i2);

    Range<Integer> getSupportedWidths();

    Range<Integer> getSupportedWidthsFor(int i2);

    int getWidthAlignment();

    boolean isSizeSupported(int i2, int i3);

    boolean isSizeSupportedAllowSwapping(int i2, int i3);
}
