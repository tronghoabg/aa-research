package androidx.media3.extractor;

import androidx.camera.video.internal.workaround.DefaultEncoderProfilesProvider;
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.OpusUtil;
import com.google.d.b.an;
import com.waze.strings.DisplayStrings;
import j$.util.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DtsUtil {
    public static final int DTS_EXPRESS_MAX_RATE_BITS_PER_SECOND = 768000;
    public static final int DTS_HD_MAX_RATE_BYTES_PER_SECOND = 2250000;
    private static final byte FIRST_BYTE_14B_BE = 31;
    private static final byte FIRST_BYTE_14B_LE = -1;
    private static final byte FIRST_BYTE_BE = 127;
    private static final byte FIRST_BYTE_EXTSS_BE = 100;
    private static final byte FIRST_BYTE_EXTSS_LE = 37;
    private static final byte FIRST_BYTE_LE = -2;
    private static final byte FIRST_BYTE_UHD_FTOC_NONSYNC_BE = 113;
    private static final byte FIRST_BYTE_UHD_FTOC_NONSYNC_LE = -24;
    private static final byte FIRST_BYTE_UHD_FTOC_SYNC_BE = 64;
    private static final byte FIRST_BYTE_UHD_FTOC_SYNC_LE = -14;
    public static final int FRAME_TYPE_CORE = 1;
    public static final int FRAME_TYPE_EXTENSION_SUBSTREAM = 2;
    public static final int FRAME_TYPE_UHD_NON_SYNC = 4;
    public static final int FRAME_TYPE_UHD_SYNC = 3;
    public static final int FRAME_TYPE_UNKNOWN = 0;
    private static final int SYNC_VALUE_14B_BE = 536864768;
    private static final int SYNC_VALUE_14B_LE = -14745368;
    private static final int SYNC_VALUE_BE = 2147385345;
    private static final int SYNC_VALUE_EXTSS_BE = 1683496997;
    private static final int SYNC_VALUE_EXTSS_LE = 622876772;
    private static final int SYNC_VALUE_LE = -25230976;
    private static final int SYNC_VALUE_UHD_FTOC_NONSYNC_BE = 1908687592;
    private static final int SYNC_VALUE_UHD_FTOC_NONSYNC_LE = -398277519;
    private static final int SYNC_VALUE_UHD_FTOC_SYNC_BE = 1078008818;
    private static final int SYNC_VALUE_UHD_FTOC_SYNC_LE = -233094848;
    private static final int[] CHANNELS_BY_AMODE = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] SAMPLE_RATE_BY_SFREQ = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, OpusUtil.SAMPLE_RATE, -1, -1};
    private static final int[] TWICE_BITRATE_KBPS_BY_RATE = {64, 112, 128, 192, 224, 256, 384, DisplayStrings.DS_ACCIDENT, 512, 640, 768, DisplayStrings.DS_TAP_TO_VERIFY, 1024, DisplayStrings.DS_PHOTOS, DisplayStrings.DS_LOCATION_PREVIEW_TEMPORARILY_CLOSED, DisplayStrings.DS_MAP_POPUP_START_POINT_TITLE, DisplayStrings.DS_CUSTOM_PROMPT_ARRIVE, 2048, 2304, DisplayStrings.DS_CARPLAY_ENABLE_MIC_PERMISSION_OK, DisplayStrings.DS_GOOGLE_ASSISTANT_SEARCH_TOOLTIP_SUBTITLE_DEFAULT, 2816, DisplayStrings.DS_WELCOME_SCREEN_LOGIN_BUTTON, DisplayStrings.DS_UID_GOOGLE_SIGNIN_ERROR_POPUP_NEXT, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, DisplayStrings.DS_COMPANINIO_EXPERIMENTAL_BUBBLE_LABEL, 4096, 6144, 7680};
    public static final int DTS_MAX_RATE_BYTES_PER_SECOND = 192000;
    private static final int[] SAMPLE_RATE_BY_INDEX = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, OpusUtil.SAMPLE_RATE, DefaultEncoderProfilesProvider.DEFAULT_AUDIO_BITRATE, DTS_MAX_RATE_BYTES_PER_SECOND, 384000};
    private static final int[] UHD_FTOC_PAYLOAD_LENGTH_TABLE = {5, 8, 10, 12};
    private static final int[] UHD_METADATA_CHUNK_SIZE_LENGTH_TABLE = {6, 9, 12, 15};
    private static final int[] UHD_AUDIO_CHUNK_ID_LENGTH_TABLE = {2, 4, 6, 8};
    private static final int[] UHD_AUDIO_CHUNK_SIZE_LENGTH_TABLE = {9, 11, 13, 16};
    private static final int[] UHD_HEADER_SIZE_LENGTH_TABLE = {5, 8, 10, 12};

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DtsAudioMimeType {
    }

    /* compiled from: WazeSource */
    public final class DtsHeader {
        public final int bitrate;
        public final int channelCount;
        public final long frameDurationUs;
        public final int frameSize;
        public final String mimeType;
        public final int sampleRate;

        private DtsHeader(String str, int i2, int i3, int i4, long j2, int i5) {
            this.mimeType = str;
            this.channelCount = i2;
            this.sampleRate = i3;
            this.frameSize = i4;
            this.frameDurationUs = j2;
            this.bitrate = i5;
        }
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FrameType {
    }

    private DtsUtil() {
    }

    private static void checkCrc(byte[] bArr, int i2) throws ParserException {
        int i3 = i2 - 2;
        if (((bArr[i2 - 1] & FIRST_BYTE_14B_LE) | ((char) (bArr[i3] << 8))) != Util.crc16(bArr, 0, i3, 65535)) {
            throw ParserException.createForMalformedContainer("CRC check failed", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getDtsFrameSize(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 6
            r4 = 7
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L48
            r2 = -1
            if (r1 == r2) goto L30
            r2 = 31
            if (r1 == r2) goto L20
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r7 = r7[r4]
            goto L55
        L20:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r2 = 8
            r7 = r7[r2]
            goto L3f
        L30:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r2 = 9
            r7 = r7[r2]
        L3f:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r0 = r0 | r1
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5b
        L48:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r7 = r7[r3]
        L55:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r1 = r1 | r2
            r7 = r7 | r1
            int r7 = r7 + r5
        L5b:
            if (r0 == 0) goto L61
            int r7 = r7 * 16
            int r7 = r7 / 14
        L61:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.DtsUtil.getDtsFrameSize(byte[]):int");
    }

    public static int getFrameType(int i2) {
        if (i2 == SYNC_VALUE_BE || i2 == SYNC_VALUE_LE || i2 == SYNC_VALUE_14B_BE || i2 == SYNC_VALUE_14B_LE) {
            return 1;
        }
        if (i2 == SYNC_VALUE_EXTSS_BE || i2 == SYNC_VALUE_EXTSS_LE) {
            return 2;
        }
        if (i2 == SYNC_VALUE_UHD_FTOC_SYNC_BE || i2 == SYNC_VALUE_UHD_FTOC_SYNC_LE) {
            return 3;
        }
        return (i2 == SYNC_VALUE_UHD_FTOC_NONSYNC_BE || i2 == SYNC_VALUE_UHD_FTOC_NONSYNC_LE) ? 4 : 0;
    }

    private static ParsableBitArray getNormalizedFrame(byte[] bArr) {
        byte b2 = bArr[0];
        if (b2 == 127 || b2 == 100 || b2 == 64 || b2 == 113) {
            return new ParsableBitArray(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (isLittleEndianFrameHeader(bArrCopyOf)) {
            for (int i2 = 0; i2 < bArrCopyOf.length - 1; i2 += 2) {
                byte b3 = bArrCopyOf[i2];
                int i3 = i2 + 1;
                bArrCopyOf[i2] = bArrCopyOf[i3];
                bArrCopyOf[i3] = b3;
            }
        }
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            ParsableBitArray parsableBitArray2 = new ParsableBitArray(bArrCopyOf);
            while (parsableBitArray2.bitsLeft() >= 16) {
                parsableBitArray2.skipBits(2);
                parsableBitArray.putInt(parsableBitArray2.readBits(14), 14);
            }
        }
        parsableBitArray.reset(bArrCopyOf);
        return parsableBitArray;
    }

    private static int getRemapChannelCount(int i2) {
        int i3 = i2 & 1;
        if ((i2 & 2) != 0) {
            i3 += 2;
        }
        if ((i2 & 4) != 0) {
            i3 += 2;
        }
        if ((i2 & 8) != 0) {
            i3++;
        }
        if ((i2 & 16) != 0) {
            i3++;
        }
        if ((i2 & 32) != 0) {
            i3 += 2;
        }
        if ((i2 & 64) != 0) {
            i3 += 2;
        }
        if ((i2 & 128) != 0) {
            i3++;
        }
        if ((i2 & 256) != 0) {
            i3++;
        }
        if ((i2 & 512) != 0) {
            i3 += 2;
        }
        if ((i2 & 1024) != 0) {
            i3 += 2;
        }
        if ((i2 & 2048) != 0) {
            i3 += 2;
        }
        if ((i2 & 4096) != 0) {
            i3++;
        }
        if ((i2 & 8192) != 0) {
            i3 += 2;
        }
        if ((i2 & 16384) != 0) {
            i3++;
        }
        return (i2 & 32768) != 0 ? i3 + 2 : i3;
    }

    public static boolean isDtsBaseAudioMimeType(String str) {
        return Objects.equals(str, MimeTypes.AUDIO_DTS) || Objects.equals(str, MimeTypes.AUDIO_DTS_HD);
    }

    private static boolean isLittleEndianFrameHeader(byte[] bArr) {
        byte b2 = bArr[0];
        return b2 == -2 || b2 == -1 || b2 == 37 || b2 == -14 || b2 == -24;
    }

    private static void parseAssetDescriptorDynamicData(ParsableBitArray parsableBitArray, boolean z, boolean z2, int i2, boolean z3, int[] iArr) {
        boolean bit = parsableBitArray.readBit();
        if (bit) {
            parsableBitArray.skipBits(8);
        }
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(5);
        }
        if (bit && z) {
            parsableBitArray.skipBits(8);
        }
        if (z3 && parsableBitArray.readBit()) {
            an.B(iArr);
            parsableBitArray.skipBits(7);
            if (parsableBitArray.readBits(2) < 3) {
                parsableBitArray.skipBits(3);
            } else {
                parsableBitArray.skipBits(8);
            }
            boolean bit2 = parsableBitArray.readBit();
            for (int i3 : iArr) {
                if (bit2) {
                    parsableBitArray.skipBits(i3 * 6);
                } else {
                    parsableBitArray.skipBits(6);
                }
            }
            int[] iArr2 = new int[3];
            iArr2[0] = i2;
            int i4 = 1;
            if (z2) {
                iArr2[1] = 6;
                i4 = 2;
            }
            if (z) {
                iArr2[i4] = 2;
                i4++;
            }
            for (int i5 : iArr) {
                for (int i6 = 0; i6 < i4; i6++) {
                    int i7 = iArr2[i6];
                    for (int i8 = 0; i8 < i7; i8++) {
                        parsableBitArray.skipBits(Integer.bitCount(parsableBitArray.readBits(i5)) * 6);
                    }
                }
            }
        }
    }

    private static String parseDecoderNavigationData(ParsableBitArray parsableBitArray) throws ParserException {
        int bits = parsableBitArray.readBits(2);
        if (bits == 0) {
            return (parsableBitArray.readBits(12) & 256) != 0 ? MimeTypes.AUDIO_DTS_EXPRESS : MimeTypes.AUDIO_DTS_HD;
        }
        if (bits == 1) {
            return MimeTypes.AUDIO_DTS_HD;
        }
        if (bits == 2) {
            return MimeTypes.AUDIO_DTS_EXPRESS;
        }
        throw ParserException.createForMalformedContainer("Unsupported coding mode in DTS HD header: " + bits, null);
    }

    public static int parseDtsAudioSampleCount(ByteBuffer byteBuffer) {
        int i2;
        int i3;
        byte b2;
        int i4;
        if (byteBuffer.getInt(0) == SYNC_VALUE_UHD_FTOC_SYNC_LE || byteBuffer.getInt(0) == SYNC_VALUE_UHD_FTOC_NONSYNC_LE) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == SYNC_VALUE_EXTSS_LE) {
            return 4096;
        }
        int iPosition = byteBuffer.position();
        byte b3 = byteBuffer.get(iPosition);
        if (b3 != -2) {
            if (b3 == -1) {
                i3 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                b2 = byteBuffer.get(iPosition + 7);
            } else if (b3 != 31) {
                i3 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                i4 = byteBuffer.get(iPosition + 5) & 252;
                i2 = (i4 >> 2) | i3;
            } else {
                i3 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                b2 = byteBuffer.get(iPosition + 6);
            }
            i4 = b2 & 60;
            i2 = (i4 >> 2) | i3;
        } else {
            int i5 = iPosition + 4;
            i2 = ((byteBuffer.get(i5) & 252) >> 2) | ((byteBuffer.get(iPosition + 5) & 1) << 6);
        }
        return (i2 + 1) * 32;
    }

    public static Format parseDtsFormat(byte[] bArr, String str, String str2, int i2, String str3, DrmInitData drmInitData) {
        ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        normalizedFrame.skipBits(60);
        int i3 = CHANNELS_BY_AMODE[normalizedFrame.readBits(6)];
        int i4 = SAMPLE_RATE_BY_SFREQ[normalizedFrame.readBits(4)];
        int bits = normalizedFrame.readBits(5);
        int[] iArr = TWICE_BITRATE_KBPS_BY_RATE;
        int i5 = bits >= iArr.length ? -1 : (iArr[bits] * 1000) / 2;
        normalizedFrame.skipBits(10);
        int i6 = i3 + (normalizedFrame.readBits(2) > 0 ? 1 : 0);
        Format.Builder builder = new Format.Builder();
        builder.setId(str);
        builder.setContainerMimeType(str3);
        builder.setSampleMimeType(MimeTypes.AUDIO_DTS);
        builder.setAverageBitrate(i5);
        builder.setChannelCount(i6);
        builder.setSampleRate(i4);
        builder.setDrmInitData(drmInitData);
        builder.setLanguage(str2);
        builder.setRoleFlags(i2);
        return builder.build();
    }

    public static DtsHeader parseDtsHdHeader(byte[] bArr) throws ParserException {
        boolean bit;
        int bits;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        String decoderNavigationData;
        int i5;
        long jScaleLargeTimestamp;
        int i6;
        boolean z;
        boolean z2;
        boolean z3;
        int bits2;
        ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        normalizedFrame.skipBits(40);
        int bits3 = normalizedFrame.readBits(2);
        boolean bit2 = normalizedFrame.readBit();
        int i7 = true != bit2 ? 16 : 20;
        normalizedFrame.skipBits(true != bit2 ? 8 : 12);
        int bits4 = normalizedFrame.readBits(i7) + 1;
        boolean bit3 = normalizedFrame.readBit();
        if (bit3) {
            bits = normalizedFrame.readBits(2);
            int bits5 = normalizedFrame.readBits(3) + 1;
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(36);
            }
            int bits6 = normalizedFrame.readBits(3) + 1;
            int bits7 = normalizedFrame.readBits(3) + 1;
            if (bits6 != 1 || bits7 != 1) {
                throw ParserException.createForUnsupportedContainerFeature("Multiple audio presentations or assets not supported");
            }
            int i8 = bits3 + 1;
            int bits8 = normalizedFrame.readBits(i8);
            for (int i9 = 0; i9 < i8; i9++) {
                if (((bits8 >> i9) & 1) == 1) {
                    normalizedFrame.skipBits(8);
                }
            }
            bit = normalizedFrame.readBit();
            if (bit) {
                normalizedFrame.skipBits(2);
                int bits9 = (normalizedFrame.readBits(2) + 1) << 2;
                int bits10 = normalizedFrame.readBits(2) + 1;
                iArr = new int[bits10];
                for (int i10 = 0; i10 < bits10; i10++) {
                    iArr[i10] = getRemapChannelCount(normalizedFrame.readBits(bits9));
                }
            } else {
                iArr = null;
            }
            i2 = bits5 * 512;
        } else {
            bit = false;
            bits = -1;
            i2 = 0;
            iArr = null;
        }
        normalizedFrame.skipBits(i7);
        normalizedFrame.skipBits(12);
        if (bit3) {
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(4);
            }
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(24);
            }
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBytes(normalizedFrame.readBits(10) + 1);
            }
            int i11 = 5;
            normalizedFrame.skipBits(5);
            int i12 = SAMPLE_RATE_BY_INDEX[normalizedFrame.readBits(4)];
            int bits11 = normalizedFrame.readBits(8) + 1;
            if (normalizedFrame.readBit()) {
                boolean bit4 = bits11 > 2 ? normalizedFrame.readBit() : false;
                boolean bit5 = bits11 > 6 ? normalizedFrame.readBit() : false;
                if (normalizedFrame.readBit()) {
                    bits2 = (normalizedFrame.readBits(2) + 1) << 2;
                    normalizedFrame.skipBits(bits2);
                } else {
                    bits2 = 0;
                }
                int bits12 = normalizedFrame.readBits(3);
                int[] iArr2 = new int[bits12];
                i3 = 1;
                for (int i13 = 0; i13 < bits12; i13++) {
                    iArr2[i13] = normalizedFrame.readBits(bits2);
                }
                int i14 = 0;
                while (i14 < bits12) {
                    int remapChannelCount = getRemapChannelCount(iArr2[i14]);
                    int i15 = i11;
                    int bits13 = normalizedFrame.readBits(i11) + 1;
                    boolean z4 = bit;
                    for (int i16 = 0; i16 < remapChannelCount; i16++) {
                        normalizedFrame.skipBits(Integer.bitCount(normalizedFrame.readBits(bits13)) * 5);
                    }
                    i14++;
                    i11 = i15;
                    bit = z4;
                }
                boolean z5 = bit4;
                z = bit;
                z2 = z5;
                z3 = bit5;
            } else {
                i3 = 1;
                normalizedFrame.skipBits(3);
                z = bit;
                z2 = false;
                z3 = false;
            }
            parseAssetDescriptorDynamicData(normalizedFrame, z2, z3, bits11, z, iArr);
            i5 = bits11;
            i4 = i12;
            decoderNavigationData = parseDecoderNavigationData(normalizedFrame);
        } else {
            i3 = 1;
            i4 = -2147483647;
            decoderNavigationData = null;
            i5 = -1;
        }
        if (bit3) {
            if (bits == 0) {
                i6 = 32000;
            } else if (bits == i3) {
                i6 = 44100;
            } else {
                if (bits != 2) {
                    throw ParserException.createForMalformedContainer("Unsupported reference clock code in DTS HD header: " + bits, null);
                }
                i6 = OpusUtil.SAMPLE_RATE;
            }
            jScaleLargeTimestamp = Util.scaleLargeTimestamp(i2, 1000000L, i6);
        } else {
            jScaleLargeTimestamp = C.TIME_UNSET;
        }
        return new DtsHeader(decoderNavigationData, i5, i4, bits4, jScaleLargeTimestamp, 0);
    }

    public static int parseDtsHdHeaderSize(byte[] bArr) {
        ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        normalizedFrame.skipBits(42);
        return normalizedFrame.readBits(true != normalizedFrame.readBit() ? 8 : 12) + 1;
    }

    public static DtsHeader parseDtsUhdHeader(byte[] bArr, AtomicInteger atomicInteger) throws ParserException {
        long jScaleLargeTimestamp;
        int bits;
        AtomicInteger atomicInteger2;
        int i2;
        int i3;
        ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        int bits2 = normalizedFrame.readBits(32);
        int unsignedVarInt = parseUnsignedVarInt(normalizedFrame, UHD_FTOC_PAYLOAD_LENGTH_TABLE, true) + 1;
        char c2 = bits2 == SYNC_VALUE_UHD_FTOC_SYNC_BE ? (char) 1 : (char) 0;
        if (c2 == 0) {
            jScaleLargeTimestamp = C.TIME_UNSET;
            bits = C.RATE_UNSET_INT;
        } else {
            if (!normalizedFrame.readBit()) {
                throw ParserException.createForUnsupportedContainerFeature("Only supports full channel mask-based audio presentation");
            }
            checkCrc(bArr, unsignedVarInt);
            int bits3 = normalizedFrame.readBits(2);
            if (bits3 == 0) {
                i2 = 512;
            } else if (bits3 == 1) {
                i2 = 480;
            } else {
                if (bits3 != 2) {
                    throw ParserException.createForMalformedContainer("Unsupported base duration index in DTS UHD header: " + bits3, null);
                }
                i2 = 384;
            }
            int bits4 = normalizedFrame.readBits(3) + 1;
            int bits5 = normalizedFrame.readBits(2);
            if (bits5 == 0) {
                i3 = 32000;
            } else if (bits5 == 1) {
                i3 = 44100;
            } else {
                if (bits5 != 2) {
                    throw ParserException.createForMalformedContainer("Unsupported clock rate index in DTS UHD header: " + bits5, null);
                }
                i3 = OpusUtil.SAMPLE_RATE;
            }
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(36);
            }
            bits = (1 << normalizedFrame.readBits(2)) * i3;
            jScaleLargeTimestamp = Util.scaleLargeTimestamp(i2 * bits4, 1000000L, i3);
        }
        int i4 = bits;
        long j2 = jScaleLargeTimestamp;
        int unsignedVarInt2 = 0;
        for (char c3 = 0; c3 < c2; c3 = 1) {
            unsignedVarInt2 += parseUnsignedVarInt(normalizedFrame, UHD_METADATA_CHUNK_SIZE_LENGTH_TABLE, true);
        }
        for (int i5 = 0; i5 <= 0; i5++) {
            if (c2 != 0) {
                atomicInteger2 = atomicInteger;
                atomicInteger2.set(parseUnsignedVarInt(normalizedFrame, UHD_AUDIO_CHUNK_ID_LENGTH_TABLE, true));
            } else {
                atomicInteger2 = atomicInteger;
            }
            unsignedVarInt2 += atomicInteger2.get() != 0 ? parseUnsignedVarInt(normalizedFrame, UHD_AUDIO_CHUNK_SIZE_LENGTH_TABLE, true) : 0;
        }
        return new DtsHeader("audio/vnd.dts.uhd;profile=p2", 2, i4, unsignedVarInt + unsignedVarInt2, j2, 0);
    }

    public static int parseDtsUhdHeaderSize(byte[] bArr) {
        ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        normalizedFrame.skipBits(32);
        return parseUnsignedVarInt(normalizedFrame, UHD_HEADER_SIZE_LENGTH_TABLE, true) + 1;
    }

    private static int parseUnsignedVarInt(ParsableBitArray parsableBitArray, int[] iArr, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 3 && parsableBitArray.readBit(); i4++) {
            i3++;
        }
        if (z) {
            int i5 = 0;
            while (i2 < i3) {
                i5 += 1 << iArr[i2];
                i2++;
            }
            i2 = i5;
        }
        return i2 + parsableBitArray.readBits(iArr[i3]);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.media3.common.Format updateFormatWithDtsHdInfo(androidx.media3.extractor.ExtractorInput r4, int r5, androidx.media3.common.Format r6) {
        /*
            androidx.media3.common.util.ParsableByteArray r0 = new androidx.media3.common.util.ParsableByteArray
            r0.<init>(r5)
            byte[] r1 = r0.getData()
            r2 = 0
            r3 = 1
            boolean r5 = r4.peekFully(r1, r2, r5, r3)
            if (r5 != 0) goto L13
            goto L89
        L13:
            r4.resetPeekPosition()
            int r4 = r0.peekInt()
            int r5 = getFrameType(r4)
            if (r5 != r3) goto L40
            int r4 = r0.bytesLeft()
            r5 = 10
            if (r4 < r5) goto L89
            byte[] r4 = new byte[r5]
            r0.readBytes(r4, r2, r5)
            int r4 = getDtsFrameSize(r4)
            int r5 = r0.limit()
            int r1 = r4 + 4
            if (r5 < r1) goto L89
            r0.setPosition(r4)
            int r4 = r0.peekInt()
        L40:
            int r4 = getFrameType(r4)
            r5 = 2
            if (r4 != r5) goto L89
            int r4 = r0.bytesLeft()
            r5 = 7
            if (r4 < r5) goto L89
            int r4 = r0.getPosition()
            byte[] r1 = new byte[r5]
            r0.readBytes(r1, r2, r5)
            r0.setPosition(r4)
            int r4 = parseDtsHdHeaderSize(r1)
            if (r4 <= 0) goto L89
            int r5 = r0.bytesLeft()
            if (r5 < r4) goto L89
            byte[] r5 = new byte[r4]
            r0.readBytes(r5, r2, r4)
            androidx.media3.extractor.DtsUtil$DtsHeader r4 = parseDtsHdHeader(r5)
            java.lang.String r4 = r4.mimeType
            java.lang.String r5 = r6.sampleMimeType
            if (r4 != 0) goto L77
            java.lang.String r4 = "audio/vnd.dts.hd"
        L77:
            boolean r5 = j$.util.Objects.equals(r5, r4)
            if (r5 != 0) goto L89
            androidx.media3.common.Format$Builder r5 = r6.buildUpon()
            r5.setSampleMimeType(r4)
            androidx.media3.common.Format r4 = r5.build()
            return r4
        L89:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.DtsUtil.updateFormatWithDtsHdInfo(androidx.media3.extractor.ExtractorInput, int, androidx.media3.common.Format):androidx.media3.common.Format");
    }

    public static int parseDtsAudioSampleCount(byte[] bArr) {
        int i2;
        byte b2;
        int i3;
        byte b3;
        byte b4 = bArr[0];
        if (b4 != -2) {
            if (b4 == -1) {
                i2 = (bArr[4] & 7) << 4;
                b3 = bArr[7];
            } else if (b4 != 31) {
                i2 = (bArr[4] & 1) << 6;
                b2 = bArr[5];
            } else {
                i2 = (bArr[5] & 7) << 4;
                b3 = bArr[6];
            }
            i3 = b3 & 60;
            return (((i3 >> 2) | i2) + 1) * 32;
        }
        i2 = (bArr[5] & 1) << 6;
        b2 = bArr[4];
        i3 = b2 & 252;
        return (((i3 >> 2) | i2) + 1) * 32;
    }
}
