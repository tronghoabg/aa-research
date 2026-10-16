package androidx.media3.muxer;

import android.util.Pair;
import androidx.camera.video.internal.workaround.DefaultEncoderProfilesProvider;
import androidx.collection.SieveCacheKt;
import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.core.internal.view.SupportMenu;
import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4LocationData;
import androidx.media3.container.Mp4TimestampData;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.container.XmpData;
import androidx.media3.muxer.FragmentedMp4Writer;
import com.google.d.b.ag;
import com.google.d.b.an;
import com.google.d.d.bi;
import com.google.d.d.bn;
import com.google.d.d.fo;
import com.google.d.l.j;
import com.waze.strings.DisplayStrings;
import j$.util.Objects;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class Boxes {
    public static final int BOX_HEADER_SIZE = 8;
    private static final int BYTES_PER_INTEGER = 4;
    public static final int LARGE_SIZE_BOX_HEADER_SIZE = 16;
    private static final int MAX_FIXED_LEAF_BOX_SIZE = 200;
    public static final int MFHD_BOX_CONTENT_SIZE = 8;
    private static final long MVHD_TIMEBASE = 10000;
    private static final String TAG = "Boxes";
    public static final int TFHD_BOX_CONTENT_SIZE = 16;
    private static final int TRUN_BOX_NON_SYNC_SAMPLE_FLAGS = 16842752;
    private static final int TRUN_BOX_SYNC_SAMPLE_FLAGS = 33554432;
    private static final Pair<Integer, Integer> DEFAULT_H263_PROFILE_AND_LEVEL = new Pair<>(0, 10);
    public static final bn<Byte> XMP_UUID = bn.w((byte) -66, (byte) 122, (byte) -49, (byte) -53, (byte) -105, (byte) -87, (byte) 66, (byte) -24, (byte) -100, (byte) 113, (byte) -103, (byte) -108, (byte) -111, (byte) -29, (byte) -81, (byte) -84);

    private Boxes() {
    }

    private static ByteBuffer apvCBox(Format format) {
        an.m(!format.initializationData.isEmpty(), "csd-0 is not found in the format for apvC box");
        byte[] bArr = format.initializationData.get(0);
        int length = bArr.length;
        an.m(length > 0, "csd-0 is empty for apvC box.");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 4);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.put(bArr);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("apvC", byteBufferAllocate);
    }

    public static ByteBuffer audioSampleEntry(Format format) {
        String strCodecSpecificFourcc = codecSpecificFourcc(format);
        ByteBuffer byteBufferCodecSpecificBox = codecSpecificBox(format);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferCodecSpecificBox.remaining() + 200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 1);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        boolean zEquals = Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_IAMF);
        byteBufferAllocate.putShort((short) (zEquals ? 0 : format.channelCount));
        byteBufferAllocate.putShort((short) 16);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putInt((zEquals ? 0 : format.sampleRate) << 16);
        byteBufferAllocate.put(byteBufferCodecSpecificBox);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox(strCodecSpecificFourcc, byteBufferAllocate);
    }

    private static ByteBuffer av1CBox(Format format) {
        return BoxUtils.wrapIntoBox("av1C", ByteBuffer.wrap(format.initializationData.get(0)));
    }

    private static ByteBuffer avcCBox(Format format) {
        an.m(format.initializationData.size() >= 2, "csd-0 and/or csd-1 not found in the format for avcC box.");
        byte[] bArr = format.initializationData.get(0);
        an.m(bArr.length > 0, "csd-0 is empty for avcC box.");
        byte[] bArr2 = format.initializationData.get(1);
        an.m(bArr2.length > 0, "csd-1 is empty for avcC box.");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr2);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferWrap.limit() + byteBufferWrap2.limit() + 200);
        byteBufferAllocate.put((byte) 1);
        bn<ByteBuffer> bnVarFindNalUnits = AnnexBUtils.findNalUnits(byteBufferWrap);
        an.m(!bnVarFindNalUnits.isEmpty(), "SPS data not found in csd0 for avcC box.");
        ByteBuffer byteBuffer = bnVarFindNalUnits.get(0);
        int iRemaining = byteBuffer.remaining();
        byte[] bArr3 = new byte[iRemaining];
        byteBuffer.get(bArr3);
        byteBuffer.rewind();
        NalUnitUtil.SpsData spsNalUnit = NalUnitUtil.parseSpsNalUnit(bArr3, 0, iRemaining);
        byteBufferAllocate.put((byte) spsNalUnit.profileIdc);
        byteBufferAllocate.put((byte) spsNalUnit.constraintsFlagsAndReservedZero2Bits);
        byteBufferAllocate.put((byte) spsNalUnit.levelIdc);
        byteBufferAllocate.put((byte) -1);
        byteBufferAllocate.put((byte) -31);
        byteBufferAllocate.putShort((short) byteBuffer.remaining());
        byteBufferAllocate.put(byteBuffer);
        byteBuffer.rewind();
        bn<ByteBuffer> bnVarFindNalUnits2 = AnnexBUtils.findNalUnits(byteBufferWrap2);
        an.v(!bnVarFindNalUnits2.isEmpty(), "PPS data not found in csd1 for avcC box.");
        byteBufferAllocate.put((byte) 1);
        ByteBuffer byteBuffer2 = bnVarFindNalUnits2.get(0);
        byteBufferAllocate.putShort((short) byteBuffer2.remaining());
        byteBufferAllocate.put(byteBuffer2);
        byteBuffer2.rewind();
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("avcC", byteBufferAllocate);
    }

    private static String bcp47LanguageTagToIso3(String str) {
        if (str == null) {
            return null;
        }
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        return localeForLanguageTag.getISO3Language().isEmpty() ? str : localeForLanguageTag.getISO3Language();
    }

    public static List<Integer> calculateSampleCompositionTimeOffsets(List<BufferInfo> list, List<Integer> list2, int i2) {
        List<BufferInfo> list3 = list;
        ArrayList arrayList = new ArrayList(list3.size());
        if (!list3.isEmpty()) {
            boolean z = false;
            long j2 = list3.get(0).presentationTimeUs;
            long jIntValue = 0;
            int i3 = 0;
            boolean z2 = false;
            long j3 = 0;
            while (i3 < list3.size()) {
                long j4 = list3.get(i3).presentationTimeUs - j2;
                long jVuFromUs = vuFromUs(j4, i2) - jIntValue;
                if (jVuFromUs <= SieveCacheKt.NodeLinkMask) {
                    z = true;
                }
                an.v(z, "Only 32-bit composition offset is allowed");
                long j5 = j2;
                jIntValue += list2.get(i3).intValue();
                arrayList.add(Integer.valueOf((int) jVuFromUs));
                z2 |= !(j4 >= j3);
                i3++;
                list3 = list;
                j3 = j4;
                j2 = j5;
                z = false;
            }
            if (!z2) {
                arrayList.clear();
            }
        }
        return arrayList;
    }

    public static ByteBuffer co64(List<Long> list) {
        int size = list.size();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((size + size) * 4) + 8);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            byteBufferAllocate.putLong(list.get(i2).longValue());
        }
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("co64", byteBufferAllocate);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0082, code lost:
    
        if (r0.equals("audio/mp4a-latm") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008b, code lost:
    
        if (r0.equals(androidx.media3.common.MimeTypes.AUDIO_VORBIS) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0091, code lost:
    
        return esdsBox(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.nio.ByteBuffer codecSpecificBox(androidx.media3.common.Format r2) {
        /*
            java.lang.String r0 = r2.sampleMimeType
            com.google.d.b.an.B(r0)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r0.hashCode()
            switch(r1) {
                case -1851077871: goto Lc8;
                case -1664118616: goto Lbb;
                case -1662735862: goto Lae;
                case -1662541442: goto La1;
                case -1606874997: goto L92;
                case -1003765268: goto L85;
                case -53558318: goto L7c;
                case 187094639: goto L6e;
                case 1187890754: goto L61;
                case 1331836563: goto L54;
                case 1331836730: goto L47;
                case 1503095341: goto L38;
                case 1504698186: goto L2b;
                case 1504891608: goto L1e;
                case 1599127257: goto L11;
                default: goto Lf;
            }
        Lf:
            goto Ld5
        L11:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto Ld5
            java.nio.ByteBuffer r2 = vpcCBox(r2)
            return r2
        L1e:
            java.lang.String r1 = "audio/opus"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto Ld5
            java.nio.ByteBuffer r2 = dOpsBox(r2)
            return r2
        L2b:
            java.lang.String r1 = "audio/iamf"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto Ld5
            java.nio.ByteBuffer r2 = iacbBox(r2)
            return r2
        L38:
            java.lang.String r2 = "audio/3gpp"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto Ld5
            r2 = -32257(0xffffffffffff81ff, float:NaN)
            java.nio.ByteBuffer r2 = damrBox(r2)
            return r2
        L47:
            java.lang.String r1 = "video/avc"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto Ld5
            java.nio.ByteBuffer r2 = avcCBox(r2)
            return r2
        L54:
            java.lang.String r1 = "video/apv"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto Ld5
            java.nio.ByteBuffer r2 = apvCBox(r2)
            return r2
        L61:
            java.lang.String r1 = "video/mp4v-es"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto Ld5
            java.nio.ByteBuffer r2 = esdsBox(r2)
            return r2
        L6e:
            java.lang.String r2 = "audio/raw"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto Ld5
            r2 = 0
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            return r2
        L7c:
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto Ld5
            goto L8d
        L85:
            java.lang.String r1 = "audio/vorbis"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto Ld5
        L8d:
            java.nio.ByteBuffer r2 = esdsBox(r2)
            return r2
        L92:
            java.lang.String r2 = "audio/amr-wb"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto Ld5
            r2 = -31745(0xffffffffffff83ff, float:NaN)
            java.nio.ByteBuffer r2 = damrBox(r2)
            return r2
        La1:
            java.lang.String r1 = "video/hevc"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto Ld5
            java.nio.ByteBuffer r2 = hvcCBox(r2)
            return r2
        Lae:
            java.lang.String r1 = "video/av01"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto Ld5
            java.nio.ByteBuffer r2 = av1CBox(r2)
            return r2
        Lbb:
            java.lang.String r1 = "video/3gpp"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto Ld5
            java.nio.ByteBuffer r2 = d263Box(r2)
            return r2
        Lc8:
            java.lang.String r1 = "video/dolby-vision"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto Ld5
            java.nio.ByteBuffer r2 = doviSpecificBox(r2)
            return r2
        Ld5:
            java.lang.String r2 = "Unsupported format: "
            java.lang.String r2 = r2.concat(r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.muxer.Boxes.codecSpecificBox(androidx.media3.common.Format):java.nio.ByteBuffer");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static String codecSpecificFourcc(Format format) {
        String str = format.sampleMimeType;
        an.B(str);
        switch (str.hashCode()) {
            case -1851077871:
                if (str.equals(MimeTypes.VIDEO_DOLBY_VISION)) {
                    return getDoviFourcc(format);
                }
                break;
            case -1664118616:
                if (str.equals(MimeTypes.VIDEO_H263)) {
                    return "s263";
                }
                break;
            case -1662735862:
                if (str.equals(MimeTypes.VIDEO_AV1)) {
                    return "av01";
                }
                break;
            case -1662541442:
                if (str.equals(MimeTypes.VIDEO_H265)) {
                    return "hvc1";
                }
                break;
            case -1606874997:
                if (str.equals(MimeTypes.AUDIO_AMR_WB)) {
                    return "sawb";
                }
                break;
            case -1003765268:
                if (str.equals(MimeTypes.AUDIO_VORBIS)) {
                    return "mp4a";
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    return "mp4a";
                }
                break;
            case 187094639:
                if (str.equals(MimeTypes.AUDIO_RAW)) {
                    int i2 = format.pcmEncoding;
                    if (i2 == 2) {
                        return "sowt";
                    }
                    if (i2 == 268435456) {
                        return "twos";
                    }
                    throw new IllegalArgumentException("Unsupported PCM encoding: " + i2);
                }
                break;
            case 1187890754:
                if (str.equals(MimeTypes.VIDEO_MP4V)) {
                    return "mp4v-es";
                }
                break;
            case 1331836563:
                if (str.equals(MimeTypes.VIDEO_APV)) {
                    return "apv1";
                }
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    return "avc1";
                }
                break;
            case 1503095341:
                if (str.equals(MimeTypes.AUDIO_AMR_NB)) {
                    return "samr";
                }
                break;
            case 1504698186:
                if (str.equals(MimeTypes.AUDIO_IAMF)) {
                    return "iamf";
                }
                break;
            case 1504891608:
                if (str.equals(MimeTypes.AUDIO_OPUS)) {
                    return "Opus";
                }
                break;
            case 1599127257:
                if (str.equals(MimeTypes.VIDEO_VP9)) {
                    return "vp09";
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported format: ".concat(str));
    }

    private static ByteBuffer colrBox(ColorInfo colorInfo) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(20);
        byteBufferAllocate.put((byte) 110);
        byteBufferAllocate.put((byte) 99);
        byteBufferAllocate.put((byte) 108);
        byteBufferAllocate.put((byte) 120);
        int i2 = colorInfo.colorSpace;
        int iColorSpaceToIsoColorPrimaries = ColorInfo.colorSpaceToIsoColorPrimaries(i2);
        int iColorTransferToIsoTransferCharacteristics = ColorInfo.colorTransferToIsoTransferCharacteristics(colorInfo.colorTransfer);
        int iColorSpaceToIsoMatrixCoefficients = ColorInfo.colorSpaceToIsoMatrixCoefficients(i2);
        int i3 = colorInfo.colorRange;
        byteBufferAllocate.putShort((short) iColorSpaceToIsoColorPrimaries);
        byteBufferAllocate.putShort((short) iColorTransferToIsoTransferCharacteristics);
        byteBufferAllocate.putShort((short) iColorSpaceToIsoMatrixCoefficients);
        byteBufferAllocate.put(i3 == 1 ? (byte) -128 : (byte) 0);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("colr", byteBufferAllocate);
    }

    public static List<Integer> convertPresentationTimestampsToDurationsVu(List<BufferInfo> list, int i2, int i3, long j2) {
        long jVuFromUs;
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        if (!list.isEmpty()) {
            long j3 = 0;
            int i4 = 0;
            boolean z = false;
            while (i4 < list.size()) {
                long j4 = list.get(i4).presentationTimeUs;
                arrayList.add(Long.valueOf(j4));
                z |= !(j4 >= j3);
                i4++;
                j3 = j4;
            }
            if (z) {
                Collections.sort(arrayList);
            }
            long jLongValue = ((Long) arrayList.get(0)).longValue();
            int i5 = 1;
            while (i5 < arrayList.size()) {
                long j5 = i2;
                long jLongValue2 = ((Long) arrayList.get(i5)).longValue();
                long jVuFromUs2 = vuFromUs(jLongValue2, j5) - vuFromUs(jLongValue, j5);
                an.v(jVuFromUs2 <= SieveCacheKt.NodeLinkMask, "Only 32-bit sample duration is allowed");
                arrayList2.add(Integer.valueOf((int) jVuFromUs2));
                i5++;
                jLongValue = jLongValue2;
            }
            if (j2 != C.TIME_UNSET) {
                long j6 = i2;
                jVuFromUs = vuFromUs(j2, j6) - vuFromUs(jLongValue, j6);
                an.v(jVuFromUs <= SieveCacheKt.NodeLinkMask, "Only 32-bit sample duration is allowed");
            } else {
                jVuFromUs = -1;
            }
            arrayList2.add(Integer.valueOf(getLastSampleDurationVu(arrayList2, i3, (int) jVuFromUs)));
        }
        return arrayList2;
    }

    public static ByteBuffer ctts(List<BufferInfo> list, List<Integer> list2, int i2) {
        List<Integer> listCalculateSampleCompositionTimeOffsets = calculateSampleCompositionTimeOffsets(list, list2, i2);
        if (listCalculateSampleCompositionTimeOffsets.isEmpty()) {
            return ByteBuffer.allocate(0);
        }
        int size = listCalculateSampleCompositionTimeOffsets.size();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((size + size) * 4) + 8);
        byteBufferAllocate.putInt(16777216);
        int iPosition = byteBufferAllocate.position();
        byteBufferAllocate.putInt(0);
        int i3 = -1;
        int i4 = -1;
        int i5 = 0;
        for (int i6 = 0; i6 < listCalculateSampleCompositionTimeOffsets.size(); i6++) {
            int iIntValue = listCalculateSampleCompositionTimeOffsets.get(i6).intValue();
            if (i3 != iIntValue) {
                int iPosition2 = byteBufferAllocate.position();
                byteBufferAllocate.putInt(1);
                byteBufferAllocate.putInt(iIntValue);
                i5++;
                i4 = iPosition2;
                i3 = iIntValue;
            } else {
                byteBufferAllocate.putInt(i4, byteBufferAllocate.getInt(i4) + 1);
            }
        }
        byteBufferAllocate.putInt(iPosition, i5);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("ctts", byteBufferAllocate);
    }

    private static ByteBuffer d263Box(Format format) throws NumberFormatException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(7);
        byteBufferAllocate.put("    ".getBytes(StandardCharsets.UTF_8));
        byteBufferAllocate.put((byte) 0);
        Pair<Integer, Integer> h263ProfileAndLevel = getH263ProfileAndLevel(format);
        byteBufferAllocate.put(((Integer) h263ProfileAndLevel.second).byteValue());
        byteBufferAllocate.put(((Integer) h263ProfileAndLevel.first).byteValue());
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("d263", byteBufferAllocate);
    }

    private static ByteBuffer dOpsBox(Format format) {
        boolean z = true;
        an.m(!format.initializationData.isEmpty(), "csd-0 not found in the format for dOps box.");
        byte[] opusInitializationData = CodecSpecificDataUtil.getOpusInitializationData(format);
        int length = opusInitializationData.length;
        an.l(length >= 8);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.put(opusInitializationData, 8, length - 8);
        if (byteBufferAllocate.get(0) != 0 && byteBufferAllocate.get(0) != 1) {
            z = false;
        }
        an.u(z);
        byteBufferAllocate.put(0, (byte) 0);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("dOps", byteBufferAllocate);
    }

    private static ByteBuffer damrBox(short s) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.put("    ".getBytes(StandardCharsets.UTF_8));
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.putShort(s);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("damr", byteBufferAllocate);
    }

    public static ByteBuffer dinf(ByteBuffer byteBuffer) {
        return BoxUtils.wrapIntoBox("dinf", byteBuffer);
    }

    private static ByteBuffer doviBox(int i2, byte[] bArr) {
        an.m(bArr.length > 0, "csd is empty for dovi box.");
        if (i2 == 5) {
            return BoxUtils.wrapIntoBox("dvcC", ByteBuffer.wrap(bArr));
        }
        if (i2 == 8 || i2 == 9) {
            return BoxUtils.wrapIntoBox("dvvC", ByteBuffer.wrap(bArr));
        }
        throw new IllegalArgumentException("Unsupported Dolby Vision profile " + i2);
    }

    private static ByteBuffer doviSpecificBox(Format format) throws NumberFormatException {
        Pair<Integer, Integer> dolbyVisionProfileAndLevel = getDolbyVisionProfileAndLevel(format);
        an.C(dolbyVisionProfileAndLevel, "Can't identify Dolby vision profile");
        return BoxUtils.concatenateBuffers(((Integer) dolbyVisionProfileAndLevel.first).intValue() <= 8 ? hvcCBox(format) : avcCBox(format), doviBox(((Integer) dolbyVisionProfileAndLevel.first).intValue(), CodecSpecificDataUtil.buildDolbyVisionInitializationData(((Integer) dolbyVisionProfileAndLevel.first).intValue(), ((Integer) dolbyVisionProfileAndLevel.second).intValue())));
    }

    public static ByteBuffer dref(ByteBuffer... byteBufferArr) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(byteBufferArr.length);
        byteBufferAllocate.flip();
        ArrayList arrayList = new ArrayList();
        arrayList.add(byteBufferAllocate);
        Collections.addAll(arrayList, byteBufferArr);
        return BoxUtils.wrapBoxesIntoBox("dref", arrayList);
    }

    public static ByteBuffer edts(long j2, long j3, long j4, long j5, long j6) {
        if (j3 > 0) {
            j2 -= j3;
        }
        long j7 = j2;
        return j7 != 0 ? BoxUtils.wrapIntoBox("edts", elst(j7, j4, j5, j6)) : ByteBuffer.allocate(0);
    }

    private static ByteBuffer elst(long j2, long j3, long j4, long j5) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(50);
        byteBufferAllocate.putInt(16777216);
        if (j2 > 0) {
            byteBufferAllocate.putInt(2);
            byteBufferAllocate.put(elstEntry(vuFromUs(j2, j4), -1L, 1, 0));
            byteBufferAllocate.put(elstEntry(vuFromUs(j3, j4), 0L, 1, 0));
        } else {
            byteBufferAllocate.putInt(1);
            byteBufferAllocate.put(elstEntry(vuFromUs(j3, j4), vuFromUs(Math.abs(j2), j5), 1, 0));
        }
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("elst", byteBufferAllocate);
    }

    private static ByteBuffer elstEntry(long j2, long j3, int i2, int i3) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(20);
        byteBufferAllocate.putLong(j2);
        byteBufferAllocate.putLong(j3);
        byteBufferAllocate.putShort((short) i2);
        byteBufferAllocate.putShort((short) i3);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    private static ByteBuffer esdsBox(Format format) {
        an.m(!format.initializationData.isEmpty(), "csd-0 not found in the format for esds box.");
        byte[] bArr = format.initializationData.get(0);
        an.m(bArr.length > 0, "csd-0 is empty for esds box.");
        String str = format.sampleMimeType;
        an.B(str);
        ByteBuffer vorbisInitializationData = str.equals(MimeTypes.AUDIO_VORBIS) ? CodecSpecificDataUtil.getVorbisInitializationData(format) : ByteBuffer.wrap(bArr);
        int i2 = format.peakBitrate;
        int i3 = format.averageBitrate;
        boolean zIsVideo = MimeTypes.isVideo(str);
        int iRemaining = vorbisInitializationData.remaining();
        ByteBuffer sizeBuffer = getSizeBuffer(iRemaining);
        ByteBuffer sizeBuffer2 = getSizeBuffer(sizeBuffer.remaining() + iRemaining + 14);
        ByteBuffer sizeBuffer3 = getSizeBuffer(sizeBuffer.remaining() + iRemaining + sizeBuffer2.remaining() + 21);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iRemaining + 200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.put((byte) 3);
        byteBufferAllocate.put(sizeBuffer3);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.put(true != zIsVideo ? (byte) 0 : StylePropertiesKt.ClipId);
        byteBufferAllocate.put((byte) 4);
        byteBufferAllocate.put(sizeBuffer2);
        Byte mp4ObjectTypeFromMimeType = MimeTypes.getMp4ObjectTypeFromMimeType(str);
        an.B(mp4ObjectTypeFromMimeType);
        byteBufferAllocate.put(mp4ObjectTypeFromMimeType.byteValue());
        byteBufferAllocate.put((byte) ((true != zIsVideo ? 20 : 16) | 1));
        byteBufferAllocate.putShort((short) ((char) ((true != zIsVideo ? 768 : DefaultEncoderProfilesProvider.DEFAULT_AUDIO_BITRATE) >> 8)));
        byteBufferAllocate.put((byte) 0);
        if (i2 == -1) {
            i2 = 0;
        }
        byteBufferAllocate.putInt(i2);
        byteBufferAllocate.putInt(i3 != -1 ? i3 : 0);
        byteBufferAllocate.put((byte) 5);
        byteBufferAllocate.put(sizeBuffer);
        byteBufferAllocate.put(vorbisInitializationData);
        vorbisInitializationData.rewind();
        byteBufferAllocate.put((byte) 6);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 2);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("esds", byteBufferAllocate);
    }

    private static long findMinimumPresentationTimestampUsAcrossTracks(List<Track> list) {
        long jMin = Long.MAX_VALUE;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Track track = list.get(i2);
            if (!track.writtenSamples.isEmpty()) {
                jMin = Math.min(track.writtenSamples.get(0).presentationTimeUs, jMin);
            }
        }
        return jMin != Long.MAX_VALUE ? jMin : C.TIME_UNSET;
    }

    public static ByteBuffer ftyp() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ByteBuffer.wrap(Util.getUtf8Bytes("isom")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(131072);
        byteBufferAllocate.flip();
        arrayList.add(byteBufferAllocate);
        String[] strArr = {"isom", "iso2", "mp41"};
        for (int i2 = 0; i2 < 3; i2++) {
            arrayList.add(ByteBuffer.wrap(Util.getUtf8Bytes(strArr[i2])));
        }
        return BoxUtils.wrapBoxesIntoBox("ftyp", arrayList);
    }

    public static ByteBuffer getAxteBoxHeader(long j2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
        byteBufferAllocate.putInt(1);
        byteBufferAllocate.put(Util.getUtf8Bytes("axte"));
        byteBufferAllocate.putLong(j2 + 16);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    static Pair<Integer, Integer> getDolbyVisionProfileAndLevel(Format format) throws NumberFormatException {
        an.C(format.codecs, "Codec string is null for Dolby Vision format.");
        List listE = ag.b('.').e(format.codecs);
        if (listE.size() < 3) {
            Log.w(TAG, "Invalid Dolby Vision codec string: ".concat(String.valueOf(format.codecs)));
            return null;
        }
        return Pair.create(Integer.valueOf(Integer.parseInt((String) listE.get(1))), Integer.valueOf(Integer.parseInt((String) listE.get(2))));
    }

    private static String getDoviFourcc(Format format) throws NumberFormatException {
        Pair<Integer, Integer> dolbyVisionProfileAndLevel = getDolbyVisionProfileAndLevel(format);
        an.C(dolbyVisionProfileAndLevel, "Dolby Vision profile and level is not found.");
        int iIntValue = ((Integer) dolbyVisionProfileAndLevel.first).intValue();
        if (iIntValue == 5) {
            return "dvh1";
        }
        if (iIntValue == 8) {
            return "hvc1";
        }
        if (iIntValue == 9) {
            return "avc1";
        }
        throw new IllegalArgumentException("Unsupported profile " + String.valueOf(dolbyVisionProfileAndLevel.first) + " for format: " + format.sampleMimeType);
    }

    private static Pair<Integer, Integer> getH263ProfileAndLevel(Format format) throws NumberFormatException {
        if (format.codecs != null) {
            List listE = ag.b('.').e(format.codecs);
            if (listE.size() >= 3) {
                try {
                    return new Pair<>(Integer.valueOf(Integer.parseInt((String) listE.get(1))), Integer.valueOf(Integer.parseInt((String) listE.get(2))));
                } catch (NumberFormatException unused) {
                }
            }
        }
        return DEFAULT_H263_PROFILE_AND_LEVEL;
    }

    private static int getLastSampleDurationVu(List<Integer> list, int i2, int i3) {
        if (i2 == 0) {
            return 0;
        }
        if (i2 != 1) {
            throw new IllegalArgumentException("Unexpected value for the last frame duration behavior " + i2);
        }
        if (i3 != -1) {
            return i3;
        }
        if (list.size() < 2) {
            return 0;
        }
        return ((Integer) fo.Q(list)).intValue();
    }

    public static ByteBuffer getMetadataSampleEntry(Format format) {
        return MimeTypes.APPLICATION_ITUT_T35.equals(format.sampleMimeType) ? t35MetadataSampleEntry(format) : textMetadataSampleEntry(format);
    }

    private static ByteBuffer getSizeBuffer(int i2) {
        ArrayDeque arrayDeque = new ArrayDeque();
        int i3 = 0;
        while (true) {
            arrayDeque.push(Byte.valueOf((byte) (i3 | (i2 & 127))));
            i2 >>= 7;
            if (i2 <= 0) {
                break;
            }
            i3 = 128;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(arrayDeque.size());
        while (!arrayDeque.isEmpty()) {
            byteBufferAllocate.put(((Byte) arrayDeque.removeFirst()).byteValue());
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public static int getTrunBoxContentSize(int i2, boolean z) {
        return ((true != z ? 3 : 4) * i2 * 4) + 12;
    }

    public static ByteBuffer hdlr(String str, String str2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.put(Util.getUtf8Bytes(str));
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.put(Util.getUtf8Bytes(str2));
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("hdlr", byteBufferAllocate);
    }

    private static ByteBuffer hvcCBox(Format format) {
        an.m(!format.initializationData.isEmpty(), "csd-0 not found in the format for hvcC box.");
        byte[] bArr = format.initializationData.get(0);
        an.m(bArr.length > 0, "csd-0 is empty for hvcC box.");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferWrap.limit() + 200);
        bn<ByteBuffer> bnVarFindNalUnits = AnnexBUtils.findNalUnits(byteBufferWrap);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < bnVarFindNalUnits.size(); i2++) {
            arrayList.add(AnnexBUtils.stripEmulationPrevention(bnVarFindNalUnits.get(i2)));
        }
        byteBufferAllocate.put((byte) 1);
        ByteBuffer byteBuffer = (ByteBuffer) arrayList.get(0);
        if (byteBuffer.get(byteBuffer.position()) != 64) {
            throw new IllegalArgumentException("First NALU in csd-0 is not the VPS.");
        }
        byteBufferAllocate.put(byteBuffer.get(6));
        byteBufferAllocate.putInt(byteBuffer.getInt(7));
        byteBufferAllocate.putInt(byteBuffer.getInt(11));
        byteBufferAllocate.putShort(byteBuffer.getShort(15));
        byteBufferAllocate.put(byteBuffer.get(17));
        byteBufferAllocate.putShort((short) -4096);
        byteBufferAllocate.put((byte) -4);
        ByteBuffer byteBuffer2 = bnVarFindNalUnits.get(1);
        int iRemaining = byteBuffer2.remaining();
        byte[] bArr2 = new byte[iRemaining];
        byteBuffer2.get(bArr2);
        byteBuffer2.rewind();
        NalUnitUtil.H265SpsData h265SpsNalUnit = NalUnitUtil.parseH265SpsNalUnit(bArr2, 0, iRemaining, null);
        int i3 = h265SpsNalUnit.chromaFormatIdc;
        int i4 = h265SpsNalUnit.bitDepthLumaMinus8;
        int i5 = h265SpsNalUnit.bitDepthChromaMinus8;
        byteBufferAllocate.put((byte) (i3 | DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_5));
        byteBufferAllocate.put((byte) (i4 | DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_1));
        byteBufferAllocate.put((byte) (i5 | DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_1));
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.put(StylePropertiesKt.RightId);
        byteBufferAllocate.put((byte) bnVarFindNalUnits.size());
        for (int i6 = 0; i6 < bnVarFindNalUnits.size(); i6++) {
            ByteBuffer byteBuffer3 = bnVarFindNalUnits.get(i6);
            byteBufferAllocate.put((byte) ((byteBuffer3.get(0) >> 1) & 63));
            byteBufferAllocate.putShort((short) 1);
            byteBufferAllocate.putShort((short) byteBuffer3.limit());
            byteBufferAllocate.put(byteBuffer3);
        }
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("hvcC", byteBufferAllocate);
    }

    private static ByteBuffer iacbBox(Format format) {
        int size = format.initializationData.size();
        an.o(size == 1, "Expected only 1 byte array of initialization data for IAMF codec, but found %s.", format.initializationData.size());
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(format.initializationData.get(0));
        int iRemaining = byteBufferWrap.remaining();
        byte[] uleb128Bytes = BoxUtils.getUleb128Bytes(iRemaining);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(uleb128Bytes.length + 1 + iRemaining);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put(uleb128Bytes);
        byteBufferAllocate.put(byteBufferWrap);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("iacb", byteBufferAllocate);
    }

    public static ByteBuffer ilst(List<MdtaMetadataEntry> list) {
        int i2 = 0;
        int length = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            length += list.get(i3).value.length + 24;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        while (i2 < list.size()) {
            int i4 = i2 + 1;
            MdtaMetadataEntry mdtaMetadataEntry = list.get(i2);
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(mdtaMetadataEntry.value.length + 8);
            byteBufferAllocate2.putInt(mdtaMetadataEntry.typeIndicator);
            byteBufferAllocate2.putInt(mdtaMetadataEntry.localeIndicator);
            byteBufferAllocate2.put(mdtaMetadataEntry.value);
            byteBufferAllocate2.flip();
            ByteBuffer byteBufferWrapIntoBox = BoxUtils.wrapIntoBox("data", byteBufferAllocate2);
            byteBufferAllocate.putInt(byteBufferWrapIntoBox.remaining() + 8);
            byteBufferAllocate.putInt(i4);
            byteBufferAllocate.put(byteBufferWrapIntoBox);
            i2 = i4;
        }
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("ilst", byteBufferAllocate);
    }

    public static ByteBuffer keys(List<MdtaMetadataEntry> list) {
        int length = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            length += list.get(i2).key.length() + 8;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(list.size());
        for (int i3 = 0; i3 < list.size(); i3++) {
            byteBufferAllocate.put(BoxUtils.wrapIntoBox("mdta", ByteBuffer.wrap(Util.getUtf8Bytes(list.get(i3).key))));
        }
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("keys", byteBufferAllocate);
    }

    private static short languageCodeFromString(String str) {
        if (str != null) {
            byte[] utf8Bytes = Util.getUtf8Bytes(str);
            if (utf8Bytes.length == 3) {
                return (short) ((utf8Bytes[2] & StylePropertiesKt.ClipId) + ((utf8Bytes[1] & StylePropertiesKt.ClipId) << 5) + ((utf8Bytes[0] & StylePropertiesKt.ClipId) << 10));
            }
        }
        return (short) 0;
    }

    public static ByteBuffer localUrl() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(1);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("url ", byteBufferAllocate);
    }

    public static ByteBuffer mdhd(long j2, int i2, int i3, int i4, String str) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(i3);
        byteBufferAllocate.putInt(i4);
        byteBufferAllocate.putInt(i2);
        byteBufferAllocate.putInt((int) j2);
        byteBufferAllocate.putShort(languageCodeFromString(str));
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("mdhd", byteBufferAllocate);
    }

    public static ByteBuffer mdia(ByteBuffer... byteBufferArr) {
        return BoxUtils.wrapBoxesIntoBox("mdia", Arrays.asList(byteBufferArr));
    }

    public static ByteBuffer meta(ByteBuffer... byteBufferArr) {
        return BoxUtils.wrapBoxesIntoBox("meta", Arrays.asList(byteBufferArr));
    }

    public static ByteBuffer mfhd(int i2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(i2);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("mfhd", byteBufferAllocate);
    }

    public static ByteBuffer minf(ByteBuffer... byteBufferArr) {
        return BoxUtils.wrapBoxesIntoBox("minf", Arrays.asList(byteBufferArr));
    }

    public static ByteBuffer moof(ByteBuffer byteBuffer, List<ByteBuffer> list) {
        bi biVar = new bi();
        biVar.g(byteBuffer);
        biVar.i(list);
        return BoxUtils.wrapBoxesIntoBox("moof", biVar.f());
    }

    public static ByteBuffer moov(List<Track> list, MetadataCollector metadataCollector, boolean z, int i2) {
        ByteBuffer byteBuffer;
        ByteBuffer byteBufferCo64;
        ByteBuffer byteBufferNmhd;
        ByteBuffer byteBufferStbl;
        String str;
        String str2;
        HashMap map;
        int i3;
        long j2;
        ArrayList arrayList;
        ArrayList arrayList2;
        long jMax;
        List<Track> list2 = list;
        Mp4TimestampData mp4TimestampData = metadataCollector.timestampData;
        int i4 = (int) mp4TimestampData.creationTimestampSeconds;
        int i5 = (int) mp4TimestampData.modificationTimestampSeconds;
        long jFindMinimumPresentationTimestampUsAcrossTracks = findMinimumPresentationTimestampUsAcrossTracks(list2);
        if (!z && jFindMinimumPresentationTimestampUsAcrossTracks == C.TIME_UNSET) {
            return ByteBuffer.allocate(0);
        }
        HashMap map2 = new HashMap();
        int i6 = 1;
        for (int i7 = 0; i7 < list2.size(); i7++) {
            Track track = list2.get(i7);
            if (z || !track.writtenSamples.isEmpty()) {
                map2.put(Integer.valueOf(track.id), Integer.valueOf(i6));
                i6++;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int i8 = 0;
        long j3 = 0;
        int i9 = 1;
        while (i8 < list2.size()) {
            Track track2 = list2.get(i8);
            if (z || !track2.writtenSamples.isEmpty()) {
                Format formatBuild = track2.format;
                if ((Objects.equals(formatBuild.sampleMimeType, MimeTypes.VIDEO_AV1) || Objects.equals(track2.format.sampleMimeType, MimeTypes.VIDEO_VP9)) && formatBuild.initializationData.isEmpty()) {
                    Format.Builder builderBuildUpon = formatBuild.buildUpon();
                    byte[] bArr = track2.parsedCsd;
                    an.B(bArr);
                    builderBuildUpon.setInitializationData(bn.q(bArr));
                    formatBuild = builderBuildUpon.build();
                }
                String strBcp47LanguageTagToIso3 = bcp47LanguageTagToIso3(formatBuild.language);
                int i10 = i8;
                int i11 = i9;
                long j4 = jFindMinimumPresentationTimestampUsAcrossTracks;
                List<Integer> listConvertPresentationTimestampsToDurationsVu = convertPresentationTimestampsToDurationsVu(track2.writtenSamples, track2.videoUnitTimebase(), i2, track2.endOfStreamTimestampUs);
                long jIntValue = 0;
                int i12 = 0;
                while (i12 < listConvertPresentationTimestampsToDurationsVu.size()) {
                    jIntValue += listConvertPresentationTimestampsToDurationsVu.get(i12).intValue();
                    i12++;
                    i4 = i4;
                    i5 = i5;
                }
                int i13 = i4;
                int i14 = i5;
                long j5 = track2.writtenSamples.isEmpty() ? 0L : track2.writtenSamples.get(0).presentationTimeUs;
                long jUsFromVu = usFromVu(jIntValue, track2.videoUnitTimebase());
                if (j5 < 0) {
                    jUsFromVu -= Math.abs(j5);
                }
                int trackType = MimeTypes.getTrackType(formatBuild.sampleMimeType);
                ByteBuffer byteBufferStts = stts(listConvertPresentationTimestampsToDurationsVu);
                long j6 = jIntValue;
                ByteBuffer byteBufferCtts = MimeTypes.isVideo(formatBuild.sampleMimeType) ? ctts(track2.writtenSamples, listConvertPresentationTimestampsToDurationsVu, track2.videoUnitTimebase()) : ByteBuffer.allocate(0);
                ByteBuffer byteBufferStsz = stsz(track2.writtenSamples);
                ByteBuffer byteBufferStsc = stsc(track2.writtenChunkSampleCounts);
                if (z) {
                    byteBuffer = byteBufferCtts;
                    byteBufferCo64 = stco(track2.writtenChunkOffsets);
                } else {
                    byteBuffer = byteBufferCtts;
                    byteBufferCo64 = co64(track2.writtenChunkOffsets);
                }
                ByteBuffer byteBuffer2 = byteBufferCo64;
                Format format = formatBuild;
                if (trackType == -1 || trackType == 5) {
                    byteBufferNmhd = nmhd();
                    byteBufferStbl = stbl(stsd(getMetadataSampleEntry(format)), byteBufferStts, byteBufferStsz, byteBufferStsc, byteBuffer2);
                    str = "MetaHandle";
                    str2 = "meta";
                } else if (trackType == 1) {
                    byteBufferNmhd = smhd();
                    byteBufferStbl = stbl(stsd(audioSampleEntry(format)), byteBufferStts, byteBufferStsz, byteBufferStsc, byteBuffer2);
                    str = "SoundHandle";
                    str2 = "soun";
                } else {
                    if (trackType != 2) {
                        throw new IllegalArgumentException("Unsupported track type");
                    }
                    byteBufferNmhd = vmhd();
                    byteBufferStbl = stbl(stsd(videoSampleEntry(format)), byteBufferStts, byteBuffer, byteBufferStsz, byteBufferStsc, byteBuffer2, stss(track2.writtenSamples));
                    str = "VideoHandle";
                    str2 = "vide";
                }
                String str3 = str2;
                HashMap map3 = new HashMap();
                for (Map.Entry<Integer, List<Integer>> entry : track2.trackReferences.entrySet()) {
                    ByteBuffer byteBuffer3 = byteBufferStbl;
                    ArrayList arrayList5 = new ArrayList();
                    for (Integer num : entry.getValue()) {
                        ByteBuffer byteBuffer4 = byteBufferNmhd;
                        if (map2.containsKey(num)) {
                            arrayList5.add((Integer) map2.get(num));
                        }
                        byteBufferNmhd = byteBuffer4;
                    }
                    ByteBuffer byteBuffer5 = byteBufferNmhd;
                    if (!arrayList5.isEmpty()) {
                        map3.put(entry.getKey(), arrayList5);
                    }
                    byteBufferStbl = byteBuffer3;
                    byteBufferNmhd = byteBuffer5;
                }
                ByteBuffer byteBuffer6 = byteBufferStbl;
                ByteBuffer byteBuffer7 = byteBufferNmhd;
                ByteBuffer byteBufferAllocate = map3.isEmpty() ? ByteBuffer.allocate(0) : tref(map3);
                long j7 = jUsFromVu;
                i4 = i13;
                i5 = i14;
                map = map2;
                i3 = i10;
                ByteBuffer byteBufferTkhd = tkhd(i11, j7, i4, i5, metadataCollector.orientationData.orientation, format);
                ByteBuffer byteBufferEdts = edts(j5, j4, j7, 10000L, track2.videoUnitTimebase());
                j2 = j4;
                arrayList = arrayList3;
                arrayList2 = arrayList4;
                arrayList.add(trak(byteBufferTkhd, byteBufferAllocate, byteBufferEdts, mdia(mdhd(j6, track2.videoUnitTimebase(), i4, i5, strBcp47LanguageTagToIso3), hdlr(str3, str), minf(byteBuffer7, dinf(dref(localUrl())), byteBuffer6))));
                jMax = Math.max(j3, j7);
                arrayList2.add(trex(i11));
                i9 = i11 + 1;
            } else {
                map = map2;
                i3 = i8;
                jMax = j3;
                j2 = jFindMinimumPresentationTimestampUsAcrossTracks;
                arrayList = arrayList3;
                arrayList2 = arrayList4;
            }
            i8 = i3 + 1;
            list2 = list;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            jFindMinimumPresentationTimestampUsAcrossTracks = j2;
            j3 = jMax;
            map2 = map;
        }
        ArrayList arrayList6 = arrayList3;
        ArrayList arrayList7 = arrayList4;
        ByteBuffer byteBufferMvhd = mvhd(i9, i4, i5, j3);
        ByteBuffer byteBufferUdta = udta(metadataCollector.locationData);
        ByteBuffer byteBufferAllocate2 = metadataCollector.metadataEntries.isEmpty() ? ByteBuffer.allocate(0) : meta(hdlr("mdta", ""), keys(fo.C(metadataCollector.metadataEntries)), ilst(fo.C(metadataCollector.metadataEntries)));
        ArrayList arrayList8 = new ArrayList();
        arrayList8.add(byteBufferMvhd);
        arrayList8.add(byteBufferUdta);
        arrayList8.add(byteBufferAllocate2);
        arrayList8.addAll(arrayList6);
        if (z) {
            arrayList8.add(mvex(arrayList7));
        }
        ByteBuffer byteBufferWrapBoxesIntoBox = BoxUtils.wrapBoxesIntoBox("moov", arrayList8);
        XmpData xmpData = metadataCollector.xmpData;
        return xmpData != null ? BoxUtils.concatenateBuffers(byteBufferWrapBoxesIntoBox, uuid(XMP_UUID, ByteBuffer.wrap(xmpData.data))) : byteBufferWrapBoxesIntoBox;
    }

    public static ByteBuffer mvex(List<ByteBuffer> list) {
        return BoxUtils.wrapBoxesIntoBox("mvex", list);
    }

    public static ByteBuffer mvhd(int i2, int i3, int i4, long j2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(i3);
        byteBufferAllocate.putInt(i4);
        byteBufferAllocate.putInt(10000);
        byteBufferAllocate.putInt((int) vuFromUs(j2, 10000L));
        byteBufferAllocate.putInt(65536);
        byteBufferAllocate.putShort((short) 256);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        int[] iArr = {65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824};
        for (int i5 = 0; i5 < 9; i5++) {
            byteBufferAllocate.putInt(iArr[i5]);
        }
        for (int i6 = 0; i6 < 6; i6++) {
            byteBufferAllocate.putInt(0);
        }
        byteBufferAllocate.putInt(i2);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("mvhd", byteBufferAllocate);
    }

    public static ByteBuffer nmhd() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("nmhd", byteBufferAllocate);
    }

    private static ByteBuffer parseVp9CodecPrivateFromCsd(byte[] bArr, int i2) {
        int i3 = 8;
        byte b2 = 10;
        byte b3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < bArr.length; i5 += 3) {
            byte b4 = bArr[i5];
            int i6 = i5 + 2;
            if (b4 == 1) {
                b3 = bArr[i6];
            } else if (b4 == 2) {
                b2 = bArr[i6];
            } else if (b4 == 3) {
                i3 = bArr[i6];
            } else if (b4 == 4) {
                i4 = bArr[i6];
            }
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(3);
        byteBufferAllocate.put(b3);
        byteBufferAllocate.put(b2);
        byteBufferAllocate.put((byte) (i2 | (i3 << 4) | (i4 + i4)));
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    private static ByteBuffer paspBox() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(65536);
        byteBufferAllocate.putInt(65536);
        byteBufferAllocate.rewind();
        return BoxUtils.wrapIntoBox("pasp", byteBufferAllocate);
    }

    private static byte[] rotationMatrixFromOrientation(int i2) {
        if (i2 == 0) {
            return Util.toByteArray(65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824);
        }
        if (i2 == 90) {
            return Util.toByteArray(0, 65536, 0, SupportMenu.CATEGORY_MASK, 0, 0, 0, 0, 1073741824);
        }
        if (i2 == 180) {
            return Util.toByteArray(SupportMenu.CATEGORY_MASK, 0, 0, 0, SupportMenu.CATEGORY_MASK, 0, 0, 0, 1073741824);
        }
        if (i2 == 270) {
            return Util.toByteArray(0, SupportMenu.CATEGORY_MASK, 0, 65536, 0, 0, 0, 0, 1073741824);
        }
        throw new IllegalArgumentException("invalid orientation " + i2);
    }

    private static ByteBuffer smDmBox(ColorInfo colorInfo) {
        byte[] bArr = colorInfo.hdrStaticInfo;
        if (bArr == null) {
            return ByteBuffer.allocate(0);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.put(bArr);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("SmDm", byteBufferAllocate);
    }

    public static ByteBuffer smhd() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("smhd", byteBufferAllocate);
    }

    public static ByteBuffer stbl(ByteBuffer... byteBufferArr) {
        return BoxUtils.wrapBoxesIntoBox("stbl", Arrays.asList(byteBufferArr));
    }

    public static ByteBuffer stco(List<Long> list) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((list.size() * 4) + 8);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            long jLongValue = list.get(i2).longValue();
            an.v(jLongValue <= MuxerUtil.UNSIGNED_INT_MAX_VALUE, "Only 32-bit chunk offset is allowed");
            byteBufferAllocate.putInt((int) jLongValue);
        }
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("stco", byteBufferAllocate);
    }

    public static ByteBuffer stsc(List<Integer> list) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((list.size() * 12) + 200);
        byteBufferAllocate.putInt(0);
        int iPosition = byteBufferAllocate.position();
        byteBufferAllocate.putInt(0);
        int i2 = -1;
        int i3 = 1;
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            int iIntValue = list.get(i5).intValue();
            if (iIntValue != i2) {
                byteBufferAllocate.putInt(i3);
                byteBufferAllocate.putInt(iIntValue);
                byteBufferAllocate.putInt(1);
                i4++;
                i2 = iIntValue;
            }
            i3++;
        }
        byteBufferAllocate.putInt(iPosition, i4);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("stsc", byteBufferAllocate);
    }

    public static ByteBuffer stsd(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.limit() + 200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(1);
        byteBufferAllocate.put(byteBuffer);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("stsd", byteBufferAllocate);
    }

    public static ByteBuffer stss(List<BufferInfo> list) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((list.size() * 4) + 200);
        byteBufferAllocate.putInt(0);
        int iPosition = byteBufferAllocate.position();
        byteBufferAllocate.putInt(list.size());
        int i2 = 0;
        int i3 = 1;
        for (int i4 = 0; i4 < list.size(); i4++) {
            if ((list.get(i4).flags & 1) > 0) {
                byteBufferAllocate.putInt(i3);
                i2++;
            }
            i3++;
        }
        byteBufferAllocate.putInt(iPosition, i2);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("stss", byteBufferAllocate);
    }

    public static ByteBuffer stsz(List<BufferInfo> list) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((list.size() * 4) + 200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            byteBufferAllocate.putInt(list.get(i2).size);
        }
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("stsz", byteBufferAllocate);
    }

    public static ByteBuffer stts(List<Integer> list) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((list.size() * 8) + 200);
        byteBufferAllocate.putInt(0);
        int iPosition = byteBufferAllocate.position();
        byteBufferAllocate.putInt(0);
        long j2 = -1;
        int iPosition2 = -1;
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue = list.get(i3).intValue();
            long j3 = iIntValue;
            if (j2 != j3) {
                iPosition2 = byteBufferAllocate.position();
                byteBufferAllocate.putInt(1);
                byteBufferAllocate.putInt(iIntValue);
                i2++;
                j2 = j3;
            } else {
                byteBufferAllocate.putInt(iPosition2, byteBufferAllocate.getInt(iPosition2) + 1);
            }
        }
        byteBufferAllocate.putInt(iPosition, i2);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("stts", byteBufferAllocate);
    }

    private static ByteBuffer t35MetadataSampleEntry(Format format) {
        an.l(format.initializationData.size() == 1);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 1);
        if (format.initializationData.get(0).length > 255) {
            throw new IllegalArgumentException("t35_identifier cannot be longer than 255 bytes.");
        }
        byteBufferAllocate.put((byte) format.initializationData.get(0).length);
        byteBufferAllocate.put(format.initializationData.get(0));
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("it35", byteBufferAllocate);
    }

    private static ByteBuffer textMetadataSampleEntry(Format format) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        String str = format.sampleMimeType;
        an.B(str);
        byte[] utf8Bytes = Util.getUtf8Bytes(str);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 1);
        byteBufferAllocate.put(utf8Bytes);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.put(utf8Bytes);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("mett", byteBufferAllocate);
    }

    public static ByteBuffer tfhd(int i2, long j2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
        byteBufferAllocate.putInt(1);
        byteBufferAllocate.putInt(i2);
        byteBufferAllocate.putLong(j2);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("tfhd", byteBufferAllocate);
    }

    public static ByteBuffer tkhd(int i2, long j2, int i3, int i4, int i5, Format format) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(7);
        byteBufferAllocate.putInt(i3);
        byteBufferAllocate.putInt(i4);
        byteBufferAllocate.putInt(i2);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt((int) vuFromUs(j2, 10000L));
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putShort(true != MimeTypes.isAudio(format.sampleMimeType) ? (short) 0 : (short) 256);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.put(rotationMatrixFromOrientation(i5));
        int i6 = format.width;
        if (i6 == -1) {
            i6 = 0;
        }
        int i7 = format.height;
        int i8 = i7 != -1 ? i7 : 0;
        byteBufferAllocate.putInt(i6 << 16);
        byteBufferAllocate.putInt(i8 << 16);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("tkhd", byteBufferAllocate);
    }

    public static ByteBuffer traf(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        return BoxUtils.wrapBoxesIntoBox("traf", bn.r(byteBuffer, byteBuffer2));
    }

    public static ByteBuffer trak(ByteBuffer... byteBufferArr) {
        return BoxUtils.wrapBoxesIntoBox("trak", Arrays.asList(byteBufferArr));
    }

    public static ByteBuffer tref(Map<Integer, List<Integer>> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            arrayList.add(trefTypeBox(entry.getKey().intValue(), entry.getValue()));
        }
        return BoxUtils.wrapBoxesIntoBox("tref", arrayList);
    }

    private static ByteBuffer trefTypeBox(int i2, List<Integer> list) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(list.size() * 4);
        for (int i3 = 0; i3 < list.size(); i3++) {
            byteBufferAllocate.putInt(list.get(i3).intValue());
        }
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox(Util.toByteArray(i2), byteBufferAllocate);
    }

    public static ByteBuffer trex(int i2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(i2);
        byteBufferAllocate.putInt(1);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("trex", byteBufferAllocate);
    }

    public static ByteBuffer trun(Format format, List<FragmentedMp4Writer.SampleMetadata> list, int i2, boolean z) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(getTrunBoxContentSize(list.size(), z));
        byteBufferAllocate.putInt(z ? 16781057 : 16779009);
        byteBufferAllocate.putInt(list.size());
        byteBufferAllocate.putInt(i2);
        boolean zAllSamplesAreSyncSamples = MimeTypes.allSamplesAreSyncSamples(format.sampleMimeType, format.codecs);
        for (int i3 = 0; i3 < list.size(); i3++) {
            FragmentedMp4Writer.SampleMetadata sampleMetadata = list.get(i3);
            byteBufferAllocate.putInt(sampleMetadata.durationVu);
            byteBufferAllocate.putInt(sampleMetadata.size);
            int i4 = 33554432;
            if ((sampleMetadata.flags & 1) == 0 && !zAllSamplesAreSyncSamples) {
                i4 = 16842752;
            }
            byteBufferAllocate.putInt(i4);
            if (z) {
                byteBufferAllocate.putInt(sampleMetadata.compositionTimeOffsetVu);
            }
        }
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("trun", byteBufferAllocate);
    }

    public static ByteBuffer udta(Mp4LocationData mp4LocationData) {
        if (mp4LocationData == null) {
            return ByteBuffer.allocate(0);
        }
        String invariant = Util.formatInvariant("%+.4f%+.4f/", Float.valueOf(mp4LocationData.latitude), Float.valueOf(mp4LocationData.longitude));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(invariant.length() + 4);
        byteBufferAllocate.putShort((short) (byteBufferAllocate.capacity() - 4));
        byteBufferAllocate.putShort((short) 5575);
        byteBufferAllocate.put(Util.getUtf8Bytes(invariant));
        an.u(byteBufferAllocate.limit() == byteBufferAllocate.capacity());
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("udta", BoxUtils.wrapIntoBox(new byte[]{-87, 120, 121, 122}, byteBufferAllocate));
    }

    private static long usFromVu(long j2, long j3) {
        return Util.scaleLargeValue(j2, 1000000L, j3, RoundingMode.HALF_UP);
    }

    public static ByteBuffer uuid(List<Byte> list, ByteBuffer byteBuffer) {
        an.l(byteBuffer.remaining() > 0);
        return BoxUtils.wrapBoxesIntoBox("uuid", bn.r(ByteBuffer.wrap(j.s(list)), byteBuffer));
    }

    public static ByteBuffer videoSampleEntry(Format format) {
        ByteBuffer byteBufferCodecSpecificBox = codecSpecificBox(format);
        String strCodecSpecificFourcc = codecSpecificFourcc(format);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferCodecSpecificBox.limit() + 200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 1);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        int i2 = format.width;
        byteBufferAllocate.putShort(i2 != -1 ? (short) i2 : (short) 0);
        int i3 = format.height;
        byteBufferAllocate.putShort(i3 != -1 ? (short) i3 : (short) 0);
        byteBufferAllocate.putInt(4718592);
        byteBufferAllocate.putInt(4718592);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putShort((short) 1);
        byteBufferAllocate.putLong(0L);
        byteBufferAllocate.putLong(0L);
        byteBufferAllocate.putLong(0L);
        byteBufferAllocate.putLong(0L);
        byteBufferAllocate.putShort((short) 24);
        byteBufferAllocate.putShort((short) -1);
        byteBufferAllocate.put(byteBufferCodecSpecificBox);
        ColorInfo colorInfo = format.colorInfo;
        if (colorInfo != null && strCodecSpecificFourcc.equals("vp09")) {
            byteBufferAllocate.put(smDmBox(colorInfo));
        }
        byteBufferAllocate.put(paspBox());
        ColorInfo colorInfo2 = format.colorInfo;
        if (colorInfo2 != null) {
            byteBufferAllocate.put(colrBox(colorInfo2));
        }
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox(strCodecSpecificFourcc, byteBufferAllocate);
    }

    public static ByteBuffer vmhd() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("vmhd", byteBufferAllocate);
    }

    private static ByteBuffer vpcCBox(Format format) {
        int i2;
        int iColorTransferToIsoTransferCharacteristics;
        int iColorSpaceToIsoMatrixCoefficients;
        int iColorSpaceToIsoColorPrimaries = 1;
        an.m(!format.initializationData.isEmpty(), "csd-0 is not found in the format for vpcC box");
        byte[] bArr = format.initializationData.get(0);
        an.m(bArr.length > 3, "csd-0 for vp9 is invalid.");
        if (j.i(bArr) == 16777216) {
            return BoxUtils.wrapIntoBox("vpcC", ByteBuffer.wrap(bArr));
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(16777216);
        ColorInfo colorInfo = format.colorInfo;
        if (colorInfo == null || (i2 = colorInfo.colorRange) == -1) {
            i2 = 0;
        }
        byteBufferAllocate.put(parseVp9CodecPrivateFromCsd(bArr, i2));
        ColorInfo colorInfo2 = format.colorInfo;
        if (colorInfo2 != null) {
            int i3 = colorInfo2.colorSpace;
            int i4 = colorInfo2.colorTransfer;
            iColorSpaceToIsoColorPrimaries = ColorInfo.colorSpaceToIsoColorPrimaries(i3);
            iColorTransferToIsoTransferCharacteristics = ColorInfo.colorTransferToIsoTransferCharacteristics(i4);
            iColorSpaceToIsoMatrixCoefficients = ColorInfo.colorSpaceToIsoMatrixCoefficients(i3);
        } else {
            iColorTransferToIsoTransferCharacteristics = 1;
            iColorSpaceToIsoMatrixCoefficients = 1;
        }
        byteBufferAllocate.put((byte) iColorSpaceToIsoColorPrimaries);
        byteBufferAllocate.put((byte) iColorTransferToIsoTransferCharacteristics);
        byteBufferAllocate.put((byte) iColorSpaceToIsoMatrixCoefficients);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("vpcC", byteBufferAllocate);
    }

    private static long vuFromUs(long j2, long j3) {
        return Util.scaleLargeValue(j2, j3, 1000000L, RoundingMode.HALF_UP);
    }
}
