package androidx.media3.container;

import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.CodecSpecificDataUtil;
import com.google.d.b.an;
import com.google.d.d.bi;
import com.google.d.d.bn;
import com.google.d.j.b;
import j$.util.Objects;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class NalUnitUtil {
    public static final int EXTENDED_SAR = 255;
    public static final int H264_NAL_UNIT_TYPE_AUD = 9;
    public static final int H264_NAL_UNIT_TYPE_IDR = 5;
    public static final int H264_NAL_UNIT_TYPE_NON_IDR = 1;
    public static final int H264_NAL_UNIT_TYPE_PARTITION_A = 2;
    public static final int H264_NAL_UNIT_TYPE_PPS = 8;
    public static final int H264_NAL_UNIT_TYPE_PREFIX = 14;
    public static final int H264_NAL_UNIT_TYPE_SEI = 6;
    public static final int H264_NAL_UNIT_TYPE_SPS = 7;
    public static final int H264_NAL_UNIT_TYPE_UNSPECIFIED = 24;
    public static final int H265_NAL_UNIT_TYPE_AUD = 35;
    public static final int H265_NAL_UNIT_TYPE_BLA_W_LP = 16;
    public static final int H265_NAL_UNIT_TYPE_CRA = 21;
    public static final int H265_NAL_UNIT_TYPE_PPS = 34;
    public static final int H265_NAL_UNIT_TYPE_PREFIX_SEI = 39;
    public static final int H265_NAL_UNIT_TYPE_RASL_R = 9;
    public static final int H265_NAL_UNIT_TYPE_SPS = 33;
    public static final int H265_NAL_UNIT_TYPE_SUFFIX_SEI = 40;
    public static final int H265_NAL_UNIT_TYPE_UNSPECIFIED = 48;
    public static final int H265_NAL_UNIT_TYPE_VPS = 32;
    private static final int INVALID_ID = -1;

    @Deprecated
    public static final int NAL_UNIT_TYPE_AUD = 9;

    @Deprecated
    public static final int NAL_UNIT_TYPE_IDR = 5;

    @Deprecated
    public static final int NAL_UNIT_TYPE_NON_IDR = 1;

    @Deprecated
    public static final int NAL_UNIT_TYPE_PARTITION_A = 2;

    @Deprecated
    public static final int NAL_UNIT_TYPE_PPS = 8;

    @Deprecated
    public static final int NAL_UNIT_TYPE_PREFIX = 14;

    @Deprecated
    public static final int NAL_UNIT_TYPE_SEI = 6;

    @Deprecated
    public static final int NAL_UNIT_TYPE_SPS = 7;
    private static final String TAG = "NalUnitUtil";
    public static final int VVC_NAL_UNIT_TYPE_DCI = 13;
    public static final int VVC_NAL_UNIT_TYPE_OPI = 12;
    public static final int VVC_NAL_UNIT_TYPE_PREFIX_SEI = 23;
    public static final byte[] NAL_START_CODE = {0, 0, 0, 1};
    public static final float[] ASPECT_RATIO_IDC_VALUES = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object scratchEscapePositionsLock = new Object();
    private static int[] scratchEscapePositions = new int[10];

    /* compiled from: WazeSource */
    public final class H265LayerInfo {
        public final int layerIdInVps;
        public final int viewId;

        public H265LayerInfo(int i2, int i3) {
            this.layerIdInVps = i2;
            this.viewId = i3;
        }
    }

    /* compiled from: WazeSource */
    public final class H265NalHeader {
        public final int layerId;
        public final int nalUnitType;
        public final int temporalId;

        public H265NalHeader(int i2, int i3, int i4) {
            this.nalUnitType = i2;
            this.layerId = i3;
            this.temporalId = i4;
        }
    }

    /* compiled from: WazeSource */
    public final class H265ProfileTierLevel {
        public final int[] constraintBytes;
        public final int generalLevelIdc;
        public final int generalProfileCompatibilityFlags;
        public final int generalProfileIdc;
        public final int generalProfileSpace;
        public final boolean generalTierFlag;

        public H265ProfileTierLevel(int i2, boolean z, int i3, int i4, int[] iArr, int i5) {
            this.generalProfileSpace = i2;
            this.generalTierFlag = z;
            this.generalProfileIdc = i3;
            this.generalProfileCompatibilityFlags = i4;
            this.constraintBytes = iArr;
            this.generalLevelIdc = i5;
        }
    }

    /* compiled from: WazeSource */
    public final class H265ProfileTierLevelsAndIndices {
        public final int[] indices;
        public final bn<H265ProfileTierLevel> profileTierLevels;

        public H265ProfileTierLevelsAndIndices(List<H265ProfileTierLevel> list, int[] iArr) {
            this.profileTierLevels = bn.n(list);
            this.indices = iArr;
        }
    }

    /* compiled from: WazeSource */
    public final class H265RepFormat {
        public final int bitDepthChromaMinus8;
        public final int bitDepthLumaMinus8;
        public final int chromaFormatIdc;
        public final int height;
        public final int width;

        public H265RepFormat(int i2, int i3, int i4, int i5, int i6) {
            this.chromaFormatIdc = i2;
            this.bitDepthLumaMinus8 = i3;
            this.bitDepthChromaMinus8 = i4;
            this.width = i5;
            this.height = i6;
        }
    }

    /* compiled from: WazeSource */
    public final class H265RepFormatsAndIndices {
        public final int[] indices;
        public final bn<H265RepFormat> repFormats;

        public H265RepFormatsAndIndices(List<H265RepFormat> list, int[] iArr) {
            this.repFormats = bn.n(list);
            this.indices = iArr;
        }
    }

    /* compiled from: WazeSource */
    public final class H265Sei3dRefDisplayInfoData {
        public final int exponentRefDisplayWidth;
        public final int exponentRefViewingDist;
        public final int leftViewId;
        public final int mantissaRefDisplayWidth;
        public final int mantissaRefViewingDist;
        public final int numRefDisplays;
        public final int precRefDisplayWidth;
        public final int precRefViewingDist;
        public final int rightViewId;

        public H265Sei3dRefDisplayInfoData(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
            this.precRefDisplayWidth = i2;
            this.precRefViewingDist = i3;
            this.numRefDisplays = i4;
            this.leftViewId = i5;
            this.rightViewId = i6;
            this.exponentRefDisplayWidth = i7;
            this.mantissaRefDisplayWidth = i8;
            this.exponentRefViewingDist = i9;
            this.mantissaRefViewingDist = i10;
        }
    }

    /* compiled from: WazeSource */
    public final class H265SpsData {
        public final int bitDepthChromaMinus8;
        public final int bitDepthLumaMinus8;
        public final int chromaFormatIdc;
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;
        public final int decodedHeight;
        public final int decodedWidth;
        public final int height;
        public final int maxNumReorderPics;
        public final int maxSubLayersMinus1;
        public final H265NalHeader nalHeader;
        public final float pixelWidthHeightRatio;
        public final H265ProfileTierLevel profileTierLevel;
        public final int seqParameterSetId;
        public final int width;

        public H265SpsData(H265NalHeader h265NalHeader, int i2, H265ProfileTierLevel h265ProfileTierLevel, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f2, int i11, int i12, int i13, int i14) {
            this.nalHeader = h265NalHeader;
            this.maxSubLayersMinus1 = i2;
            this.profileTierLevel = h265ProfileTierLevel;
            this.chromaFormatIdc = i3;
            this.bitDepthLumaMinus8 = i4;
            this.bitDepthChromaMinus8 = i5;
            this.seqParameterSetId = i6;
            this.width = i7;
            this.height = i8;
            this.pixelWidthHeightRatio = f2;
            this.maxNumReorderPics = i11;
            this.colorSpace = i12;
            this.colorRange = i13;
            this.colorTransfer = i14;
            this.decodedWidth = i9;
            this.decodedHeight = i10;
        }
    }

    /* compiled from: WazeSource */
    public final class H265VideoSignalInfo {
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;

        public H265VideoSignalInfo(int i2, int i3, int i4) {
            this.colorSpace = i2;
            this.colorRange = i3;
            this.colorTransfer = i4;
        }
    }

    /* compiled from: WazeSource */
    public final class H265VideoSignalInfosAndIndices {
        public final int[] indices;
        public final bn<H265VideoSignalInfo> videoSignalInfos;

        public H265VideoSignalInfosAndIndices(List<H265VideoSignalInfo> list, int[] iArr) {
            this.videoSignalInfos = bn.n(list);
            this.indices = iArr;
        }
    }

    /* compiled from: WazeSource */
    public final class H265VpsData {
        public final bn<H265LayerInfo> layerInfos;
        public final H265NalHeader nalHeader;
        public final H265ProfileTierLevelsAndIndices profileTierLevelsAndIndices;
        public final H265RepFormatsAndIndices repFormatsAndIndices;
        public final H265VideoSignalInfosAndIndices videoSignalInfosAndIndices;

        public H265VpsData(H265NalHeader h265NalHeader, List<H265LayerInfo> list, H265ProfileTierLevelsAndIndices h265ProfileTierLevelsAndIndices, H265RepFormatsAndIndices h265RepFormatsAndIndices, H265VideoSignalInfosAndIndices h265VideoSignalInfosAndIndices) {
            this.nalHeader = h265NalHeader;
            this.layerInfos = list != null ? bn.n(list) : bn.p();
            this.profileTierLevelsAndIndices = h265ProfileTierLevelsAndIndices;
            this.repFormatsAndIndices = h265RepFormatsAndIndices;
            this.videoSignalInfosAndIndices = h265VideoSignalInfosAndIndices;
        }
    }

    /* compiled from: WazeSource */
    public final class PpsData {
        public final boolean bottomFieldPicOrderInFramePresentFlag;
        public final int picParameterSetId;
        public final int seqParameterSetId;

        public PpsData(int i2, int i3, boolean z) {
            this.picParameterSetId = i2;
            this.seqParameterSetId = i3;
            this.bottomFieldPicOrderInFramePresentFlag = z;
        }
    }

    /* compiled from: WazeSource */
    public final class SpsData {
        public final int bitDepthChromaMinus8;
        public final int bitDepthLumaMinus8;
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;
        public final int constraintsFlagsAndReservedZero2Bits;
        public final boolean deltaPicOrderAlwaysZeroFlag;
        public final boolean frameMbsOnlyFlag;
        public final int frameNumLength;
        public final int height;
        public final int levelIdc;
        public final int maxNumRefFrames;
        public final int maxNumReorderFrames;
        public final int picOrderCntLsbLength;
        public final int picOrderCountType;
        public final float pixelWidthHeightRatio;
        public final int profileIdc;
        public final boolean separateColorPlaneFlag;
        public final int seqParameterSetId;
        public final int width;

        public SpsData(int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f2, int i9, int i10, boolean z, boolean z2, int i11, int i12, int i13, boolean z3, int i14, int i15, int i16, int i17) {
            this.profileIdc = i2;
            this.constraintsFlagsAndReservedZero2Bits = i3;
            this.levelIdc = i4;
            this.seqParameterSetId = i5;
            this.maxNumRefFrames = i6;
            this.width = i7;
            this.height = i8;
            this.pixelWidthHeightRatio = f2;
            this.bitDepthLumaMinus8 = i9;
            this.bitDepthChromaMinus8 = i10;
            this.separateColorPlaneFlag = z;
            this.frameMbsOnlyFlag = z2;
            this.frameNumLength = i11;
            this.picOrderCountType = i12;
            this.picOrderCntLsbLength = i13;
            this.deltaPicOrderAlwaysZeroFlag = z3;
            this.colorSpace = i14;
            this.colorRange = i15;
            this.colorTransfer = i16;
            this.maxNumReorderFrames = i17;
        }
    }

    private NalUnitUtil() {
    }

    private static int applyConformanceWindowToHeight(int i2, int i3, int i4, int i5) {
        return i2 - ((i3 == 1 ? 2 : 1) * (i4 + i5));
    }

    private static int applyConformanceWindowToWidth(int i2, int i3, int i4, int i5) {
        int i6 = 2;
        if (i3 != 1 && i3 != 2) {
            i6 = 1;
        }
        return i2 - (i6 * (i4 + i5));
    }

    public static void clearPrefixFlags(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    private static String createCodecStringFromH265SpsPalyoad(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        parsableNalUnitBitArray.skipBits(4);
        int bits = parsableNalUnitBitArray.readBits(3);
        parsableNalUnitBitArray.skipBit();
        H265ProfileTierLevel h265ProfileTierLevel = parseH265ProfileTierLevel(parsableNalUnitBitArray, true, bits, null);
        return CodecSpecificDataUtil.buildHevcCodecString(h265ProfileTierLevel.generalProfileSpace, h265ProfileTierLevel.generalTierFlag, h265ProfileTierLevel.generalProfileIdc, h265ProfileTierLevel.generalProfileCompatibilityFlags, h265ProfileTierLevel.constraintBytes, h265ProfileTierLevel.generalLevelIdc);
    }

    public static void discardToSps(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i2 + 1;
            if (i4 >= iPosition) {
                byteBuffer.clear();
                return;
            }
            int i5 = byteBuffer.get(i2) & 255;
            if (i3 == 3) {
                if (i5 == 1) {
                    if ((byteBuffer.get(i4) & StylePropertiesKt.ClipId) == 7) {
                        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                        byteBufferDuplicate.position(i2 - 3);
                        byteBufferDuplicate.limit(iPosition);
                        byteBuffer.position(0);
                        byteBuffer.put(byteBufferDuplicate);
                        return;
                    }
                    i5 = 1;
                }
            } else if (i5 == 0) {
                i3++;
            }
            if (i5 != 0) {
                i3 = 0;
            }
            i2 = i4;
        }
    }

    public static int findNalUnit(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i4 = i3 - i2;
        an.u(i4 >= 0);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            clearPrefixFlags(zArr);
            return i2 - 3;
        }
        if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            clearPrefixFlags(zArr);
            return i2 - 2;
        }
        if (i4 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            clearPrefixFlags(zArr);
            return i2 - 1;
        }
        int i5 = i3 - 1;
        int i6 = i2 + 2;
        while (i6 < i5) {
            byte b2 = bArr[i6];
            if ((b2 & 254) == 0) {
                int i7 = i6 - 2;
                if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && b2 == 1) {
                    clearPrefixFlags(zArr);
                    return i7;
                }
                i6 = i7;
            }
            i6 += 3;
        }
        zArr[0] = i4 <= 2 ? !(i4 != 2 ? !(zArr[1] && bArr[i5] == 1) : !(zArr[2] && bArr[i3 + (-2)] == 0 && bArr[i5] == 1)) : bArr[i3 + (-3)] == 0 && bArr[i3 + (-2)] == 0 && bArr[i5] == 1;
        zArr[1] = i4 <= 1 ? zArr[2] && bArr[i5] == 0 : bArr[i3 + (-2)] == 0 && bArr[i5] == 0;
        zArr[2] = bArr[i5] == 0;
        return i3;
    }

    private static bn<Integer> findNalUnitPositions(byte[] bArr) {
        boolean[] zArr = new boolean[3];
        int i2 = bn.f7456d;
        bi biVar = new bi();
        int i3 = 0;
        while (true) {
            int length = bArr.length;
            if (i3 >= length) {
                return biVar.f();
            }
            int iFindNalUnit = findNalUnit(bArr, i3, length, zArr);
            if (iFindNalUnit != length) {
                biVar.g(Integer.valueOf(iFindNalUnit));
            }
            i3 = iFindNalUnit + 3;
        }
    }

    private static int findNextUnescapeIndex(byte[] bArr, int i2, int i3) {
        while (i2 < i3 - 2) {
            int i4 = i2 + 1;
            if (bArr[i2] == 0 && bArr[i4] == 0 && bArr[i2 + 2] == 3) {
                return i2;
            }
            i2 = i4;
        }
        return i3;
    }

    public static String getH265BaseLayerCodecsString(List<byte[]> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            byte[] bArr = list.get(i2);
            int length = bArr.length;
            if (length > 3) {
                bn<Integer> bnVarFindNalUnitPositions = findNalUnitPositions(bArr);
                for (int i3 = 0; i3 < bnVarFindNalUnitPositions.size(); i3++) {
                    if (bnVarFindNalUnitPositions.get(i3).intValue() + 3 < length) {
                        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, bnVarFindNalUnitPositions.get(i3).intValue() + 3, length);
                        H265NalHeader h265NalHeader = parseH265NalHeader(parsableNalUnitBitArray);
                        if (h265NalHeader.nalUnitType == 33 && h265NalHeader.layerId == 0) {
                            return createCodecStringFromH265SpsPalyoad(parsableNalUnitBitArray);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static int getH265NalUnitType(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 126) >> 1;
    }

    private static String getNalStructureMimeType(Format format) {
        String str;
        if (Objects.equals(format.sampleMimeType, MimeTypes.VIDEO_DOLBY_VISION) && (str = format.codecs) != null) {
            if (str.startsWith("dva1") || format.codecs.startsWith("dvav")) {
                return "video/avc";
            }
            if (format.codecs.startsWith("dvh1") || format.codecs.startsWith("dvhe")) {
                return MimeTypes.VIDEO_H265;
            }
        }
        return format.sampleMimeType;
    }

    public static int getNalUnitType(byte[] bArr, int i2) {
        return bArr[i2 + 3] & StylePropertiesKt.ClipId;
    }

    public static boolean isDependedOn(byte[] bArr, int i2, int i3, Format format) {
        if (Objects.equals(format.sampleMimeType, "video/avc")) {
            return isH264NalUnitDependedOn(bArr[i2]);
        }
        if (Objects.equals(format.sampleMimeType, MimeTypes.VIDEO_H265)) {
            return isH265NalUnitDependedOn(bArr, i2, i3, format);
        }
        return true;
    }

    public static boolean isH264NalUnitDependedOn(byte b2) {
        if (((b2 & 96) >> 5) != 0) {
            return true;
        }
        int i2 = b2 & StylePropertiesKt.ClipId;
        return (i2 == 1 || i2 == 9 || i2 == 14) ? false : true;
    }

    private static boolean isH265NalUnitDependedOn(byte[] bArr, int i2, int i3, Format format) {
        H265NalHeader h265NalHeader = parseH265NalHeader(new ParsableNalUnitBitArray(bArr, i2, i3 + i2));
        int i4 = h265NalHeader.nalUnitType;
        if (i4 == 35) {
            return false;
        }
        return (i4 <= 14 && i4 % 2 == 0 && h265NalHeader.temporalId == format.maxSubLayers + (-1)) ? false : true;
    }

    public static boolean isNalUnitSei(Format format, byte[] bArr, int i2) {
        String nalStructureMimeType = getNalStructureMimeType(format);
        if (nalStructureMimeType == null) {
            return false;
        }
        int iHashCode = nalStructureMimeType.hashCode();
        if (iHashCode != -1662541442) {
            return iHashCode != 1331836730 ? iHashCode == 1331856911 && nalStructureMimeType.equals(MimeTypes.VIDEO_H266) && ((bArr[i2 + 1] & 248) >> 3) == 23 : nalStructureMimeType.equals("video/avc") && (bArr[i2] & StylePropertiesKt.ClipId) == 6;
        }
        if (nalStructureMimeType.equals(MimeTypes.VIDEO_H265) && ((bArr[i2] & 126) >> 1) == 39) {
            return true;
        }
        return false;
    }

    public static int numberOfBytesInNalUnitHeader(Format format) {
        String nalStructureMimeType = getNalStructureMimeType(format);
        if (Objects.equals(nalStructureMimeType, "video/avc")) {
            return 1;
        }
        return (Objects.equals(nalStructureMimeType, MimeTypes.VIDEO_H265) || Objects.equals(nalStructureMimeType, MimeTypes.VIDEO_H266)) ? 2 : 0;
    }

    private static H265NalHeader parseH265NalHeader(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        parsableNalUnitBitArray.skipBit();
        return new H265NalHeader(parsableNalUnitBitArray.readBits(6), parsableNalUnitBitArray.readBits(6), parsableNalUnitBitArray.readBits(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.media3.container.NalUnitUtil.H265ProfileTierLevel parseH265ProfileTierLevel(androidx.media3.container.ParsableNalUnitBitArray r18, boolean r19, int r20, androidx.media3.container.NalUnitUtil.H265ProfileTierLevel r21) {
        /*
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 8
            r6 = 0
            if (r19 == 0) goto L3c
            r2 = 2
            int r2 = r0.readBits(r2)
            boolean r7 = r0.readBit()
            r8 = 5
            int r8 = r0.readBits(r8)
            r9 = r6
            r10 = r9
        L1e:
            r11 = 32
            if (r9 >= r11) goto L2e
            boolean r11 = r0.readBit()
            if (r11 == 0) goto L2b
            r11 = 1
            int r11 = r11 << r9
            r10 = r10 | r11
        L2b:
            int r9 = r9 + 1
            goto L1e
        L2e:
            r9 = r6
        L2f:
            if (r9 >= r3) goto L3a
            int r11 = r0.readBits(r5)
            r4[r9] = r11
            int r9 = r9 + 1
            goto L2f
        L3a:
            r12 = r2
            goto L49
        L3c:
            if (r2 == 0) goto L4f
            int r3 = r2.generalProfileSpace
            boolean r7 = r2.generalTierFlag
            int r8 = r2.generalProfileIdc
            int r10 = r2.generalProfileCompatibilityFlags
            int[] r4 = r2.constraintBytes
            r12 = r3
        L49:
            r16 = r4
            r13 = r7
            r14 = r8
            r15 = r10
            goto L55
        L4f:
            r16 = r4
            r12 = r6
            r13 = r12
            r14 = r13
            r15 = r14
        L55:
            int r17 = r0.readBits(r5)
            r2 = r6
        L5a:
            if (r6 >= r1) goto L6f
            boolean r3 = r0.readBit()
            if (r3 == 0) goto L64
            int r2 = r2 + 88
        L64:
            boolean r3 = r0.readBit()
            if (r3 == 0) goto L6c
            int r2 = r2 + 8
        L6c:
            int r6 = r6 + 1
            goto L5a
        L6f:
            r0.skipBits(r2)
            if (r1 <= 0) goto L79
            int r5 = r5 - r1
            int r5 = r5 + r5
            r0.skipBits(r5)
        L79:
            androidx.media3.container.NalUnitUtil$H265ProfileTierLevel r11 = new androidx.media3.container.NalUnitUtil$H265ProfileTierLevel
            r11.<init>(r12, r13, r14, r15, r16, r17)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.container.NalUnitUtil.parseH265ProfileTierLevel(androidx.media3.container.ParsableNalUnitBitArray, boolean, int, androidx.media3.container.NalUnitUtil$H265ProfileTierLevel):androidx.media3.container.NalUnitUtil$H265ProfileTierLevel");
    }

    private static H265RepFormat parseH265RepFormat(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int i2;
        int i3;
        int bits;
        int bits2 = parsableNalUnitBitArray.readBits(16);
        int bits3 = parsableNalUnitBitArray.readBits(16);
        if (parsableNalUnitBitArray.readBit()) {
            int bits4 = parsableNalUnitBitArray.readBits(2);
            if (bits4 == 3) {
                parsableNalUnitBitArray.skipBit();
            }
            int bits5 = parsableNalUnitBitArray.readBits(4);
            bits = parsableNalUnitBitArray.readBits(4);
            i3 = bits5;
            i2 = bits4;
        } else {
            i2 = 0;
            i3 = 0;
            bits = 0;
        }
        if (parsableNalUnitBitArray.readBit()) {
            int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            bits2 = applyConformanceWindowToWidth(bits2, i2, unsignedExpGolombCodedInt, unsignedExpGolombCodedInt2);
            bits3 = applyConformanceWindowToHeight(bits3, i2, unsignedExpGolombCodedInt3, unsignedExpGolombCodedInt4);
        }
        return new H265RepFormat(i2, i3, bits, bits2, bits3);
    }

    private static H265RepFormatsAndIndices parseH265RepFormatsAndIndices(ParsableNalUnitBitArray parsableNalUnitBitArray, int i2) {
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int i3 = unsignedExpGolombCodedInt + 1;
        bi biVarC = bn.c(i3);
        int[] iArr = new int[i2];
        for (int i4 = 0; i4 < i3; i4++) {
            biVarC.g(parseH265RepFormat(parsableNalUnitBitArray));
        }
        int i5 = 1;
        if (i3 <= 1 || !parsableNalUnitBitArray.readBit()) {
            while (i5 < i2) {
                iArr[i5] = Math.min(i5, unsignedExpGolombCodedInt);
                i5++;
            }
        } else {
            int iA = b.a(i3, RoundingMode.CEILING);
            while (i5 < i2) {
                iArr[i5] = parsableNalUnitBitArray.readBits(iA);
                i5++;
            }
        }
        return new H265RepFormatsAndIndices(biVarC.f(), iArr);
    }

    public static H265Sei3dRefDisplayInfoData parseH265Sei3dRefDisplayInfo(byte[] bArr, int i2, int i3) {
        int i4 = i3 - 1;
        while (true) {
            int i5 = i2 + 2;
            byte b2 = bArr[i4];
            if (b2 != 0) {
                if (b2 == 0 || i4 <= i5) {
                    return null;
                }
                ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i5, i4 + 1);
                while (parsableNalUnitBitArray.canReadBits(16)) {
                    int bits = parsableNalUnitBitArray.readBits(8);
                    int i6 = 0;
                    while (bits == 255) {
                        i6 += 255;
                        bits = parsableNalUnitBitArray.readBits(8);
                    }
                    int i7 = i6 + bits;
                    int bits2 = parsableNalUnitBitArray.readBits(8);
                    int i8 = 0;
                    while (bits2 == 255) {
                        bits2 = parsableNalUnitBitArray.readBits(8);
                        i8 += 255;
                    }
                    int i9 = i8 + bits2;
                    if (i9 == 0 || !parsableNalUnitBitArray.canReadBits(i9)) {
                        return null;
                    }
                    if (i7 == 176) {
                        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        boolean bit = parsableNalUnitBitArray.readBit();
                        int unsignedExpGolombCodedInt2 = bit ? parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() : 0;
                        int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        int unsignedExpGolombCodedInt4 = -1;
                        int unsignedExpGolombCodedInt5 = -1;
                        int bits3 = -1;
                        int bits4 = -1;
                        int i10 = -1;
                        int bits5 = -1;
                        for (int i11 = 0; i11 <= unsignedExpGolombCodedInt3; i11++) {
                            unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                            unsignedExpGolombCodedInt5 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                            bits3 = parsableNalUnitBitArray.readBits(6);
                            if (bits3 == 63) {
                                return null;
                            }
                            bits4 = parsableNalUnitBitArray.readBits(bits3 == 0 ? Math.max(0, unsignedExpGolombCodedInt - 30) : Math.max(0, (bits3 + unsignedExpGolombCodedInt) - 31));
                            if (bit) {
                                int bits6 = parsableNalUnitBitArray.readBits(6);
                                if (bits6 == 63) {
                                    return null;
                                }
                                i10 = bits6;
                                bits5 = parsableNalUnitBitArray.readBits(bits6 == 0 ? Math.max(0, unsignedExpGolombCodedInt2 - 30) : Math.max(0, (bits6 + unsignedExpGolombCodedInt2) - 31));
                            }
                            if (parsableNalUnitBitArray.readBit()) {
                                parsableNalUnitBitArray.skipBits(10);
                            }
                        }
                        return new H265Sei3dRefDisplayInfoData(unsignedExpGolombCodedInt, unsignedExpGolombCodedInt2, unsignedExpGolombCodedInt3 + 1, unsignedExpGolombCodedInt4, unsignedExpGolombCodedInt5, bits3, bits4, i10, bits5);
                    }
                    parsableNalUnitBitArray.skipBits(i9 * 8);
                }
                return null;
            }
            if (i4 <= i5) {
                return null;
            }
            i4--;
        }
    }

    public static H265SpsData parseH265SpsNalUnit(byte[] bArr, int i2, int i3, H265VpsData h265VpsData) {
        return parseH265SpsNalUnitPayload(bArr, i2 + 2, i3, parseH265NalHeader(new ParsableNalUnitBitArray(bArr, i2, i3)), h265VpsData);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.media3.container.NalUnitUtil.H265SpsData parseH265SpsNalUnitPayload(byte[] r19, int r20, int r21, androidx.media3.container.NalUnitUtil.H265NalHeader r22, androidx.media3.container.NalUnitUtil.H265VpsData r23) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.container.NalUnitUtil.parseH265SpsNalUnitPayload(byte[], int, int, androidx.media3.container.NalUnitUtil$H265NalHeader, androidx.media3.container.NalUnitUtil$H265VpsData):androidx.media3.container.NalUnitUtil$H265SpsData");
    }

    private static H265VideoSignalInfo parseH265VideoSignalInfo(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        parsableNalUnitBitArray.skipBits(3);
        int i2 = true != parsableNalUnitBitArray.readBit() ? 2 : 1;
        int iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(parsableNalUnitBitArray.readBits(8));
        int iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(parsableNalUnitBitArray.readBits(8));
        parsableNalUnitBitArray.skipBits(8);
        return new H265VideoSignalInfo(iIsoColorPrimariesToColorSpace, i2, iIsoTransferCharacteristicsToColorTransfer);
    }

    private static H265VideoSignalInfosAndIndices parseH265VideoSignalInfosAndIndices(ParsableNalUnitBitArray parsableNalUnitBitArray, int i2, int i3, int[] iArr) {
        if (parsableNalUnitBitArray.readBit() || parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.skipBit();
        }
        boolean bit = parsableNalUnitBitArray.readBit();
        boolean bit2 = parsableNalUnitBitArray.readBit();
        if (bit || bit2) {
            for (int i4 = 0; i4 < i3; i4++) {
                for (int i5 = 0; i5 < iArr[i4]; i5++) {
                    boolean bit3 = bit ? parsableNalUnitBitArray.readBit() : false;
                    boolean bit4 = bit2 ? parsableNalUnitBitArray.readBit() : false;
                    if (bit3) {
                        parsableNalUnitBitArray.skipBits(32);
                    }
                    if (bit4) {
                        parsableNalUnitBitArray.skipBits(18);
                    }
                }
            }
        }
        boolean bit5 = parsableNalUnitBitArray.readBit();
        int bits = bit5 ? parsableNalUnitBitArray.readBits(4) + 1 : i2;
        bi biVarC = bn.c(bits);
        int[] iArr2 = new int[i2];
        for (int i6 = 0; i6 < bits; i6++) {
            biVarC.g(parseH265VideoSignalInfo(parsableNalUnitBitArray));
        }
        if (bit5 && bits > 1) {
            for (int i7 = 0; i7 < i2; i7++) {
                iArr2[i7] = parsableNalUnitBitArray.readBits(4);
            }
        }
        return new H265VideoSignalInfosAndIndices(biVarC.f(), iArr2);
    }

    public static H265VpsData parseH265VpsNalUnit(byte[] bArr, int i2, int i3) {
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i2, i3);
        return parseH265VpsNalUnitPayload(parsableNalUnitBitArray, parseH265NalHeader(parsableNalUnitBitArray));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0568 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.media3.container.NalUnitUtil.H265VpsData parseH265VpsNalUnitPayload(androidx.media3.container.ParsableNalUnitBitArray r36, androidx.media3.container.NalUnitUtil.H265NalHeader r37) {
        /*
            Method dump skipped, instructions count: 1566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.container.NalUnitUtil.parseH265VpsNalUnitPayload(androidx.media3.container.ParsableNalUnitBitArray, androidx.media3.container.NalUnitUtil$H265NalHeader):androidx.media3.container.NalUnitUtil$H265VpsData");
    }

    public static PpsData parsePpsNalUnit(byte[] bArr, int i2, int i3) {
        return parsePpsNalUnitPayload(bArr, i2 + 1, i3);
    }

    public static PpsData parsePpsNalUnitPayload(byte[] bArr, int i2, int i3) {
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i2, i3);
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.skipBit();
        return new PpsData(unsignedExpGolombCodedInt, unsignedExpGolombCodedInt2, parsableNalUnitBitArray.readBit());
    }

    public static SpsData parseSpsNalUnit(byte[] bArr, int i2, int i3) {
        return parseSpsNalUnitPayload(bArr, i2 + 1, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0213 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.media3.container.NalUnitUtil.SpsData parseSpsNalUnitPayload(byte[] r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.container.NalUnitUtil.parseSpsNalUnitPayload(byte[], int, int):androidx.media3.container.NalUnitUtil$SpsData");
    }

    private static void skipH265DpbSize(ParsableNalUnitBitArray parsableNalUnitBitArray, int i2, int[] iArr, int[] iArr2, boolean[][] zArr) {
        for (int i3 = 1; i3 < i2; i3++) {
            boolean bit = parsableNalUnitBitArray.readBit();
            int i4 = 0;
            while (i4 < iArr[i3]) {
                if ((i4 <= 0 || !bit) ? i4 == 0 : parsableNalUnitBitArray.readBit()) {
                    for (int i5 = 0; i5 < iArr2[i3]; i5++) {
                        if (zArr[i3][i5]) {
                            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        }
                    }
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                i4++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void skipH265HrdParameters(androidx.media3.container.ParsableNalUnitBitArray r8, boolean r9, int r10) {
        /*
            r0 = 0
            if (r9 == 0) goto L2e
            boolean r9 = r8.readBit()
            boolean r1 = r8.readBit()
            if (r9 != 0) goto L12
            if (r1 == 0) goto L10
            goto L12
        L10:
            r2 = r0
            goto L31
        L12:
            boolean r2 = r8.readBit()
            if (r2 == 0) goto L1d
            r3 = 19
            r8.skipBits(r3)
        L1d:
            r3 = 8
            r8.skipBits(r3)
            if (r2 == 0) goto L28
            r3 = 4
            r8.skipBits(r3)
        L28:
            r3 = 15
            r8.skipBits(r3)
            goto L31
        L2e:
            r9 = r0
            r1 = r9
            r2 = r1
        L31:
            r3 = r0
        L32:
            if (r3 > r10) goto L72
            boolean r4 = r8.readBit()
            if (r4 != 0) goto L49
            boolean r4 = r8.readBit()
            if (r4 == 0) goto L41
            goto L49
        L41:
            boolean r4 = r8.readBit()
            if (r4 == 0) goto L4c
            r4 = r0
            goto L50
        L49:
            r8.readUnsignedExpGolombCodedInt()
        L4c:
            int r4 = r8.readUnsignedExpGolombCodedInt()
        L50:
            int r5 = r9 + r1
            r6 = r0
        L53:
            if (r6 >= r5) goto L6f
            r7 = r0
        L56:
            if (r7 > r4) goto L6c
            r8.readUnsignedExpGolombCodedInt()
            r8.readUnsignedExpGolombCodedInt()
            if (r2 == 0) goto L66
            r8.readUnsignedExpGolombCodedInt()
            r8.readUnsignedExpGolombCodedInt()
        L66:
            r8.skipBit()
            int r7 = r7 + 1
            goto L56
        L6c:
            int r6 = r6 + 1
            goto L53
        L6f:
            int r3 = r3 + 1
            goto L32
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.container.NalUnitUtil.skipH265HrdParameters(androidx.media3.container.ParsableNalUnitBitArray, boolean, int):void");
    }

    private static void skipH265ScalingList(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = 0;
            while (i3 < 6) {
                int i4 = 1;
                if (parsableNalUnitBitArray.readBit()) {
                    int iMin = Math.min(64, 1 << ((i2 + i2) + 4));
                    if (i2 > 1) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                    for (int i5 = 0; i5 < iMin; i5++) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                } else {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                if (i2 == 3) {
                    i4 = 3;
                }
                i3 += i4;
            }
        }
    }

    private static void skipH265ShortTermReferencePictureSets(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int i2;
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < unsignedExpGolombCodedInt; i5++) {
            if (i5 == 0 || !parsableNalUnitBitArray.readBit()) {
                int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int[] iArr2 = new int[unsignedExpGolombCodedInt2];
                int i6 = 0;
                while (i6 < unsignedExpGolombCodedInt2) {
                    iArr2[i6] = (i6 > 0 ? iArr2[i6 - 1] : 0) - (parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1);
                    parsableNalUnitBitArray.skipBit();
                    i6++;
                }
                int[] iArr3 = new int[unsignedExpGolombCodedInt3];
                int i7 = 0;
                while (i7 < unsignedExpGolombCodedInt3) {
                    iArr3[i7] = (i7 > 0 ? iArr3[i7 - 1] : 0) + parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
                    parsableNalUnitBitArray.skipBit();
                    i7++;
                }
                i3 = unsignedExpGolombCodedInt2;
                iArr = iArr2;
                i4 = unsignedExpGolombCodedInt3;
                iArrCopyOf = iArr3;
            } else {
                int i8 = i3 + i4;
                boolean bit = parsableNalUnitBitArray.readBit();
                int unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
                int i9 = 1 - ((bit ? 1 : 0) + (bit ? 1 : 0));
                int i10 = i8 + 1;
                boolean[] zArr = new boolean[i10];
                for (int i11 = 0; i11 <= i8; i11++) {
                    if (parsableNalUnitBitArray.readBit()) {
                        zArr[i11] = true;
                    } else {
                        zArr[i11] = parsableNalUnitBitArray.readBit();
                    }
                }
                int i12 = i4 - 1;
                int[] iArr4 = new int[i10];
                int[] iArr5 = new int[i10];
                int i13 = 0;
                while (true) {
                    i2 = i9 * unsignedExpGolombCodedInt4;
                    if (i12 < 0) {
                        break;
                    }
                    int i14 = iArrCopyOf[i12] + i2;
                    if (i14 < 0 && zArr[i3 + i12]) {
                        iArr4[i13] = i14;
                        i13++;
                    }
                    i12--;
                }
                if (i2 < 0 && zArr[i8]) {
                    iArr4[i13] = i2;
                    i13++;
                }
                for (int i15 = 0; i15 < i3; i15++) {
                    int i16 = iArr[i15] + i2;
                    if (i16 < 0 && zArr[i15]) {
                        iArr4[i13] = i16;
                        i13++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i13);
                int i17 = 0;
                for (int i18 = i3 - 1; i18 >= 0; i18--) {
                    int i19 = iArr[i18] + i2;
                    if (i19 > 0 && zArr[i18]) {
                        iArr5[i17] = i19;
                        i17++;
                    }
                }
                if (i2 > 0 && zArr[i8]) {
                    iArr5[i17] = i2;
                    i17++;
                }
                for (int i20 = 0; i20 < i4; i20++) {
                    int i21 = iArrCopyOf[i20] + i2;
                    if (i21 > 0 && zArr[i3 + i20]) {
                        iArr5[i17] = i21;
                        i17++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr5, i17);
                iArr = iArrCopyOf2;
                i4 = i17;
                i3 = i13;
            }
        }
    }

    private static void skipHrdParameters(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        parsableNalUnitBitArray.skipBits(8);
        for (int i2 = 0; i2 < unsignedExpGolombCodedInt; i2++) {
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
        }
        parsableNalUnitBitArray.skipBits(20);
    }

    private static void skipScalingList(ParsableNalUnitBitArray parsableNalUnitBitArray, int i2) {
        int signedExpGolombCodedInt = 8;
        int i3 = 8;
        for (int i4 = 0; i4 < i2; i4++) {
            if (signedExpGolombCodedInt != 0) {
                signedExpGolombCodedInt = ((parsableNalUnitBitArray.readSignedExpGolombCodedInt() + i3) + 256) % 256;
            }
            if (signedExpGolombCodedInt != 0) {
                i3 = signedExpGolombCodedInt;
            }
        }
    }

    private static void skipToH265VuiPresentFlagAfterDpbSize(ParsableNalUnitBitArray parsableNalUnitBitArray, int i2, boolean[][] zArr) {
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 2;
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.skipBits(unsignedExpGolombCodedInt);
        } else {
            for (int i3 = 1; i3 < i2; i3++) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (zArr[i3][i4]) {
                        parsableNalUnitBitArray.skipBits(unsignedExpGolombCodedInt);
                    }
                }
            }
        }
        int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        for (int i5 = 1; i5 <= unsignedExpGolombCodedInt2; i5++) {
            parsableNalUnitBitArray.skipBits(8);
        }
    }

    public static int unescapeStream(byte[] bArr, int i2) {
        int i3;
        synchronized (scratchEscapePositionsLock) {
            int iFindNextUnescapeIndex = 0;
            int i4 = 0;
            while (iFindNextUnescapeIndex < i2) {
                try {
                    iFindNextUnescapeIndex = findNextUnescapeIndex(bArr, iFindNextUnescapeIndex, i2);
                    if (iFindNextUnescapeIndex < i2) {
                        int[] iArrCopyOf = scratchEscapePositions;
                        int length = iArrCopyOf.length;
                        if (length <= i4) {
                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, length + length);
                            scratchEscapePositions = iArrCopyOf;
                        }
                        iArrCopyOf[i4] = iFindNextUnescapeIndex;
                        iFindNextUnescapeIndex += 3;
                        i4++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i3 = i2 - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = scratchEscapePositions[i7] - i5;
                System.arraycopy(bArr, i5, bArr, i6, i8);
                int i9 = i6 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i6 = i9 + 2;
                bArr[i10] = 0;
                i5 += i8 + 3;
            }
            System.arraycopy(bArr, i5, bArr, i6, i3 - i6);
        }
        return i3;
    }

    @Deprecated
    public static boolean isNalUnitSei(Format format, byte b2) {
        return isNalUnitSei(format, new byte[]{b2}, 0);
    }

    @Deprecated
    public static boolean isNalUnitSei(String str, byte b2) {
        if ("video/avc".equals(str) && (b2 & StylePropertiesKt.ClipId) == 6) {
            return true;
        }
        return MimeTypes.VIDEO_H265.equals(str) && ((b2 & 126) >> 1) == 39;
    }
}
