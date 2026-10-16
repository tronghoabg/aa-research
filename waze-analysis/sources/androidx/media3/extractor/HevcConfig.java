package androidx.media3.extractor;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.NalUnitUtil;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class HevcConfig {
    public final int bitdepthChroma;
    public final int bitdepthLuma;
    public final String codecs;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    public final int decodedHeight;
    public final int decodedWidth;
    public final int height;
    public final List<byte[]> initializationData;
    public final int maxNumReorderPics;
    public final int maxSubLayers;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthHeightRatio;
    public final int stereoMode;
    public final NalUnitUtil.H265VpsData vpsData;
    public final int width;

    private HevcConfig(List<byte[]> list, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, float f2, int i14, String str, NalUnitUtil.H265VpsData h265VpsData) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i2;
        this.maxSubLayers = i3;
        this.width = i4;
        this.height = i5;
        this.decodedWidth = i6;
        this.decodedHeight = i7;
        this.bitdepthLuma = i8;
        this.bitdepthChroma = i9;
        this.colorSpace = i10;
        this.colorRange = i11;
        this.colorTransfer = i12;
        this.stereoMode = i13;
        this.pixelWidthHeightRatio = f2;
        this.maxNumReorderPics = i14;
        this.codecs = str;
        this.vpsData = h265VpsData;
    }

    public static HevcConfig parse(ParsableByteArray parsableByteArray) {
        return parseImpl(parsableByteArray, false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.media3.extractor.HevcConfig parseImpl(androidx.media3.common.util.ParsableByteArray r38, boolean r39, androidx.media3.container.NalUnitUtil.H265VpsData r40) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.HevcConfig.parseImpl(androidx.media3.common.util.ParsableByteArray, boolean, androidx.media3.container.NalUnitUtil$H265VpsData):androidx.media3.extractor.HevcConfig");
    }

    public static HevcConfig parseLayered(ParsableByteArray parsableByteArray, NalUnitUtil.H265VpsData h265VpsData) {
        return parseImpl(parsableByteArray, true, h265VpsData);
    }
}
