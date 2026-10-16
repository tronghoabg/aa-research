package androidx.media3.common.util;

import android.R;
import android.util.Pair;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.google.d.b.an;
import com.google.d.d.bn;
import com.google.d.l.j;
import com.waze.strings.DisplayStrings;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CodecSpecificDataUtil {
    private static final String CODEC_ID_AC4 = "ac-4";
    private static final String CODEC_ID_APV1 = "apv1";
    private static final String CODEC_ID_AV01 = "av01";
    private static final String CODEC_ID_AVC1 = "avc1";
    private static final String CODEC_ID_AVC2 = "avc2";
    private static final String CODEC_ID_H263 = "s263";
    private static final String CODEC_ID_HEV1 = "hev1";
    private static final String CODEC_ID_HVC1 = "hvc1";
    private static final String CODEC_ID_IAMF = "iamf";
    private static final String CODEC_ID_MP4A = "mp4a";
    private static final String CODEC_ID_VP09 = "vp09";
    private static final String CODEC_ID_VVC1 = "vvc1";
    private static final String CODEC_ID_VVI1 = "vvi1";
    private static final int EXTENDED_PAR = 15;
    private static final int OBU_IA_CODEC_CONFIG = 0;
    private static final int OBU_IA_SEQUENCE_HEADER = 31;
    private static final int RECTANGULAR = 0;
    private static final String TAG = "CodecSpecificDataUtil";
    private static final int VISUAL_OBJECT_LAYER = 1;
    private static final int VISUAL_OBJECT_LAYER_START = 32;
    private static final int VP9_CHROMA_SUBSAMPLING_420 = 0;
    private static final int VP9_CHROMA_SUBSAMPLING_422 = 2;
    private static final int VP9_CHROMA_SUBSAMPLING_444 = 3;
    private static final int VP9_COLOR_SPACE_RGB = 7;
    private static final int VP9_FRAME_MARKER = 2;
    private static final int VP9_FRAME_TYPE_KEY_FRAME = 0;
    private static final int VP9_MAX_UNCOMPRESSED_HEADER_SIZE_BYTES = 128;
    private static final int VP9_SYNC_CODE = 4817730;
    private static final int VVC_HIGH_TIER_LEVEL_4_0 = 64;
    private static final int VVC_HIGH_TIER_LEVEL_4_1 = 256;
    private static final int VVC_HIGH_TIER_LEVEL_5_0 = 1024;
    private static final int VVC_HIGH_TIER_LEVEL_5_1 = 4096;
    private static final int VVC_HIGH_TIER_LEVEL_5_2 = 16384;
    private static final int VVC_HIGH_TIER_LEVEL_6_0 = 65536;
    private static final int VVC_HIGH_TIER_LEVEL_6_1 = 262144;
    private static final int VVC_HIGH_TIER_LEVEL_6_2 = 1048576;
    private static final int VVC_HIGH_TIER_LEVEL_6_3 = 4194304;
    private static final int VVC_MAIN_TIER_LEVEL_1_0 = 1;
    private static final int VVC_MAIN_TIER_LEVEL_2_0 = 2;
    private static final int VVC_MAIN_TIER_LEVEL_2_1 = 4;
    private static final int VVC_MAIN_TIER_LEVEL_3_0 = 8;
    private static final int VVC_MAIN_TIER_LEVEL_3_1 = 16;
    private static final int VVC_MAIN_TIER_LEVEL_4_0 = 32;
    private static final int VVC_MAIN_TIER_LEVEL_4_1 = 128;
    private static final int VVC_MAIN_TIER_LEVEL_5_0 = 512;
    private static final int VVC_MAIN_TIER_LEVEL_5_1 = 2048;
    private static final int VVC_MAIN_TIER_LEVEL_5_2 = 8192;
    private static final int VVC_MAIN_TIER_LEVEL_6_0 = 32768;
    private static final int VVC_MAIN_TIER_LEVEL_6_1 = 131072;
    private static final int VVC_MAIN_TIER_LEVEL_6_2 = 524288;
    private static final int VVC_MAIN_TIER_LEVEL_6_3 = 2097152;
    private static final int VVC_PROFILE_MAIN_10 = 2;
    private static final int VVC_PROFILE_MAIN_10_HDR10 = 4096;
    private static final int VVC_PROFILE_MAIN_10_STILL = 4;
    private static final int VVC_PROFILE_MAIN_8 = 1;
    private static final byte[] NAL_START_CODE = {0, 0, 0, 1};
    private static final String[] HEVC_GENERAL_PROFILE_SPACE_STRINGS = {"", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C"};
    private static final Pattern PROFILE_PATTERN = Pattern.compile("^\\D?(\\d+)$");

    private CodecSpecificDataUtil() {
    }

    private static int ac4BitstreamAndPresentationVersionsToProfileConst(int i2, int i3) {
        if (i2 == 0) {
            return i3 != 0 ? -1 : 257;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                return -1;
            }
            if (i3 == 1) {
                return 1026;
            }
            return i3 != 2 ? -1 : 1028;
        }
        if (i3 == 0) {
            return 513;
        }
        if (i3 != 1) {
            return -1;
        }
        return DisplayStrings.DS_REPORT_MENU_V2_ALERTER_SUCCESS_FEEDBACK_WITH_TYPE_PS;
    }

    private static int ac4LevelNumberToConst(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        if (i2 == 2) {
            return 4;
        }
        if (i2 != 3) {
            return i2 != 4 ? -1 : 16;
        }
        return 8;
    }

    private static int apvLevelAndBandNumberToConst(int i2, int i3) {
        switch (i2) {
            case 30:
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                Log.w(TAG, a.a(i3, "Unrecognized APV band: "));
                                break;
                            }
                        }
                    }
                }
                break;
            case 33:
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                Log.w(TAG, a.a(i3, "Unrecognized APV band: "));
                                break;
                            }
                        }
                    }
                }
                break;
            case 60:
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                Log.w(TAG, a.a(i3, "Unrecognized APV band: "));
                                break;
                            }
                        }
                    }
                }
                break;
            case 63:
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                Log.w(TAG, a.a(i3, "Unrecognized APV band: "));
                                break;
                            }
                        }
                    }
                }
                break;
            case 90:
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                Log.w(TAG, a.a(i3, "Unrecognized APV band: "));
                                break;
                            }
                        }
                    }
                }
                break;
            case 93:
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                Log.w(TAG, a.a(i3, "Unrecognized APV band: "));
                                break;
                            }
                        }
                    }
                }
                break;
            case 120:
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                Log.w(TAG, a.a(i3, "Unrecognized APV band: "));
                                break;
                            }
                        }
                    }
                }
                break;
            case 123:
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                Log.w(TAG, a.a(i3, "Unrecognized APV band: "));
                                break;
                            }
                        }
                    }
                }
                break;
            case 150:
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                Log.w(TAG, a.a(i3, "Unrecognized APV band: "));
                                break;
                            }
                        }
                    }
                }
                break;
            case 153:
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                Log.w(TAG, a.a(i3, "Unrecognized APV band: "));
                                break;
                            }
                        }
                    }
                }
                break;
            case 180:
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                Log.w(TAG, a.a(i3, "Unrecognized APV band: "));
                                break;
                            }
                        }
                    }
                }
                break;
            case 183:
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                Log.w(TAG, a.a(i3, "Unrecognized APV band: "));
                                break;
                            }
                        }
                    }
                }
                break;
            case DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_1 /* 210 */:
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                Log.w(TAG, a.a(i3, "Unrecognized APV band: "));
                                break;
                            }
                        }
                    }
                }
                break;
            case DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_4 /* 213 */:
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                Log.w(TAG, a.a(i3, "Unrecognized APV band: "));
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                Log.w(TAG, a.a(i2, "Unrecognized APV level index: "));
                break;
        }
        return -1;
    }

    private static int av1LevelNumberToConst(int i2) {
        switch (i2) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int avcLevelNumberToConst(int i2) {
        switch (i2) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i2) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i2) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i2) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i2) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static int avcProfileNumberToConst(int i2) {
        if (i2 == 66) {
            return 1;
        }
        if (i2 == 77) {
            return 2;
        }
        if (i2 == 88) {
            return 4;
        }
        if (i2 == 100) {
            return 8;
        }
        if (i2 == 110) {
            return 16;
        }
        if (i2 != 122) {
            return i2 != 244 ? -1 : 64;
        }
        return 32;
    }

    public static String buildApvCodecString(byte[] bArr) {
        int length = bArr.length;
        an.o(length >= 17, "Invalid APV CSD length: %s", length);
        byte b2 = bArr[0];
        an.o(b2 == 1, "Invalid APV CSD version: %s", b2);
        return Util.formatInvariant("apv1.apvf%d.apvl%d.apvb%d", Integer.valueOf(j.d(bArr[5])), Integer.valueOf(j.d(bArr[6])), Integer.valueOf(j.d(bArr[7])));
    }

    public static String buildAvcCodecString(int i2, int i3, int i4) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }

    public static List<byte[]> buildCea708InitializationData(boolean z) {
        return Collections.singletonList(z ? new byte[]{1} : new byte[]{0});
    }

    public static String buildDolbyVisionCodecString(int i2, int i3) {
        return i2 > 9 ? Util.formatInvariant("dvh1.%02d.%02d", Integer.valueOf(i2), Integer.valueOf(i3)) : i2 > 8 ? Util.formatInvariant("dvav.%02d.%02d", 9, Integer.valueOf(i3)) : Util.formatInvariant("dvhe.%02d.%02d", Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static byte[] buildDolbyVisionInitializationData(int i2, int i3) {
        int i4;
        int i5;
        byte[] bArr = new byte[24];
        if (i2 == 8) {
            i4 = 4;
            i5 = 0;
        } else if (i2 == 9) {
            i2 = 9;
            i4 = 2;
            i5 = 1;
        } else {
            i4 = 0;
            i5 = 0;
        }
        bArr[0] = 1;
        bArr[1] = 0;
        int i6 = i2 & 127;
        bArr[2] = (byte) ((((byte) (i6 + i6)) | ((i3 >> 5) & 1)) & 255);
        bArr[3] = (byte) (((byte) (((byte) ((i3 & 31) << 3)) | 4)) | 1);
        bArr[4] = (byte) ((i4 << 4) | (i5 << 2));
        return bArr;
    }

    public static String buildH263CodecString(int i2, int i3) {
        return Util.formatInvariant("s263.%d.%d", Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static String buildHevcCodecString(int i2, boolean z, int i3, int i4, int[] iArr, int i5) {
        StringBuilder sb = new StringBuilder(Util.formatInvariant("hvc1.%s%d.%X.%c%d", HEVC_GENERAL_PROFILE_SPACE_STRINGS[i2], Integer.valueOf(i3), Integer.valueOf(i4), Character.valueOf(true != z ? 'L' : 'H'), Integer.valueOf(i5)));
        int length = iArr.length;
        while (length > 0) {
            int i6 = length - 1;
            if (iArr[i6] != 0) {
                break;
            }
            length = i6;
        }
        for (int i7 = 0; i7 < length; i7++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i7])));
        }
        return sb.toString();
    }

    public static String buildIamfCodecString(byte[] bArr) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        String invariant = null;
        String string = null;
        while (parsableByteArray.bytesLeft() > 0 && (invariant == null || string == null)) {
            int unsignedByte = parsableByteArray.readUnsignedByte();
            int i2 = unsignedByte >> 3;
            int i3 = unsignedByte & 2;
            int i4 = unsignedByte & 1;
            int unsignedLeb128ToInt = parsableByteArray.readUnsignedLeb128ToInt();
            if (i2 > 4 && i2 < 24 && i3 != 0) {
                parsableByteArray.skipLeb128();
                parsableByteArray.skipLeb128();
            }
            if (i4 != 0) {
                parsableByteArray.skipBytes(parsableByteArray.readUnsignedLeb128ToInt());
            }
            int position = parsableByteArray.getPosition() + unsignedLeb128ToInt;
            if (i2 == 31) {
                parsableByteArray.skipBytes(4);
                invariant = Util.formatInvariant("iamf.%03X.%03X", Integer.valueOf(parsableByteArray.readUnsignedByte()), Integer.valueOf(parsableByteArray.readUnsignedByte()));
            } else if (i2 == 0) {
                parsableByteArray.skipLeb128();
                string = parsableByteArray.readString(4);
                if (string.equals(CODEC_ID_MP4A)) {
                    parsableByteArray.skipLeb128();
                    parsableByteArray.skipBytes(2);
                    ParsableBitArray parsableBitArray = new ParsableBitArray();
                    parsableBitArray.reset(parsableByteArray);
                    int bits = parsableBitArray.readBits(5);
                    if (bits == 31) {
                        bits = parsableBitArray.readBits(6) + 32;
                    }
                    string = string + ".40." + bits;
                }
            }
            parsableByteArray.setPosition(position);
        }
        if (invariant == null || string == null) {
            return null;
        }
        return invariant + "." + string;
    }

    public static byte[] buildNalUnit(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = NAL_START_CODE;
        int length = bArr2.length;
        byte[] bArr3 = new byte[i3 + length];
        System.arraycopy(bArr2, 0, bArr3, 0, length);
        System.arraycopy(bArr, i2, bArr3, bArr2.length, i3);
        return bArr3;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] buildVp9CodecPrivateFromUncompressedHeader(java.nio.ByteBuffer r7) {
        /*
            int r0 = r7.remaining()
            r1 = 128(0x80, float:1.8E-43)
            int r0 = java.lang.Math.min(r0, r1)
            byte[] r1 = new byte[r0]
            r2 = 0
            r7.get(r1, r2, r0)
            androidx.media3.common.util.ParsableBitArray r0 = new androidx.media3.common.util.ParsableBitArray
            r0.<init>(r1)
            int r7 = r7.remaining()
            r1 = 5
            r3 = 1
            if (r7 < r1) goto L1f
            r7 = r3
            goto L20
        L1f:
            r7 = r2
        L20:
            com.google.d.b.an.u(r7)
            r7 = 2
            int r1 = r0.readBits(r7)
            if (r1 == r7) goto L2c
            goto Lac
        L2c:
            int r1 = r0.readBits(r3)
            int r4 = r0.readBits(r3)
            int r4 = r4 + r4
            r1 = r1 | r4
            r4 = 3
            if (r1 != r4) goto L46
            int r1 = r0.bitsLeft()
            if (r1 <= 0) goto Lac
            boolean r1 = r0.readBit()
            if (r1 != 0) goto Lac
            r1 = r4
        L46:
            boolean r4 = r0.readBit()
            if (r4 != 0) goto Lac
            int r4 = r0.readBits(r3)
            boolean r5 = r0.readBit()
            boolean r6 = r0.readBit()
            if (r4 != 0) goto L5c
            r4 = r3
            goto L5d
        L5c:
            r4 = r2
        L5d:
            if (r4 != 0) goto L74
            if (r5 != 0) goto L66
            int r5 = r0.readBits(r3)
            goto L67
        L66:
            r5 = r2
        L67:
            if (r6 != 0) goto L6c
            r0.skipBits(r7)
        L6c:
            if (r5 == 0) goto L74
            if (r1 <= 0) goto L72
            r4 = r3
            goto L75
        L72:
            r4 = r2
            goto L75
        L74:
            r3 = r4
        L75:
            if (r3 == 0) goto Lac
            r7 = 24
            int r7 = r0.readBits(r7)
            r3 = 4817730(0x498342, float:6.751078E-39)
            if (r7 != r3) goto Lac
            if (r4 == 0) goto L9b
            android.util.Pair r7 = getVp9BitdepthChromaSubSampling(r0, r1)
            if (r7 == 0) goto Lac
            java.lang.Object r0 = r7.first
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.Object r7 = r7.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            goto L9e
        L9b:
            r0 = 8
            r7 = r2
        L9e:
            byte r1 = (byte) r1
            byte r0 = (byte) r0
            byte r7 = (byte) r7
            com.google.d.d.bn r7 = buildVp9CodecPrivateInitializationData(r1, r2, r0, r7)
            java.lang.Object r7 = r7.get(r2)
            byte[] r7 = (byte[]) r7
            return r7
        Lac:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.util.CodecSpecificDataUtil.buildVp9CodecPrivateFromUncompressedHeader(java.nio.ByteBuffer):byte[]");
    }

    public static bn<byte[]> buildVp9CodecPrivateInitializationData(byte b2, byte b3, byte b4, byte b5) {
        return bn.q(new byte[]{1, 1, b2, 2, 1, b3, 3, 1, b4, 4, 1, b5});
    }

    public static int calculateMediaCodecDolbyVisionLevel(int i2, int i3, float f2) {
        int iMax = Math.max(i2, i3);
        an.u(iMax <= 7680);
        float f3 = i2 * i3 * f2;
        if (iMax <= 1280) {
            return f3 > 2.21184E7f ? 2 : 1;
        }
        if (iMax <= 1920 && f3 <= 4.97664E7f) {
            return 4;
        }
        if (iMax <= 2560 && f3 <= 6.2208E7f) {
            return 8;
        }
        if (iMax > 3840) {
            if (iMax <= 7680) {
                return f3 > 9.95328E8f ? 2048 : 1024;
            }
            return -1;
        }
        if (f3 <= 1.24416E8f) {
            return 16;
        }
        if (f3 <= 1.990656E8f) {
            return 32;
        }
        if (f3 <= 2.48832E8f) {
            return 64;
        }
        if (f3 <= 3.981312E8f) {
            return 128;
        }
        return f3 > 4.97664E8f ? 512 : 256;
    }

    public static int dolbyVisionConstantToLevelNumber(int i2) {
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                switch (i2) {
                    case 4:
                        return 3;
                    case 8:
                        return 4;
                    case 16:
                        return 5;
                    case 32:
                        return 6;
                    case 64:
                        return 7;
                    case 128:
                        return 8;
                    case 256:
                        return 9;
                    case 512:
                        return 10;
                    case 1024:
                        return 11;
                    case 2048:
                        return 12;
                    case 4096:
                        return 13;
                    default:
                        throw new IllegalArgumentException(a.a(i2, "Unknown Dolby Vision level: "));
                }
            }
        }
        return i3;
    }

    public static int dolbyVisionConstantToProfileNumber(int i2) {
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 32) {
            return 5;
        }
        if (i2 == 64) {
            return 6;
        }
        if (i2 == 128) {
            return 7;
        }
        if (i2 == 256) {
            return 8;
        }
        if (i2 == 512) {
            return 9;
        }
        if (i2 == 1024) {
            return 10;
        }
        throw new IllegalArgumentException(a.a(i2, "Unknown Dolby Vision profile: "));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    private static Integer dolbyVisionStringToLevel(String str) {
        int iHashCode = str.hashCode();
        switch (iHashCode) {
            case DisplayStrings.DS_MAP_POPUP_START_POINT_SEARCH_BUTTON /* 1537 */:
                return str.equals("01") ? 1 : null;
            case DisplayStrings.DS_MAP_POPUP_START_POINT_CANCEL_BUTTON /* 1538 */:
                return str.equals("02") ? 2 : null;
            case DisplayStrings.DS_MAP_POPUP_HOME_TITLE /* 1539 */:
                return str.equals("03") ? 4 : null;
            case DisplayStrings.DS_MAP_POPUP_WORK_TITLE /* 1540 */:
                return str.equals("04") ? 8 : null;
            case DisplayStrings.DS_MAP_POPUP_PARKED_TITLE /* 1541 */:
                return str.equals("05") ? 16 : null;
            case DisplayStrings.DS_MAP_POPUP_PARKED_AT_TIME_PS /* 1542 */:
                return str.equals("06") ? 32 : null;
            case DisplayStrings.DS_MAP_POPUP_PARKED_SEND_LOCATION_BUTTON /* 1543 */:
                return str.equals("07") ? 64 : null;
            case DisplayStrings.DS_MAP_POPUP_CAN_PARK_TITLE /* 1544 */:
                return str.equals("08") ? 128 : null;
            case DisplayStrings.DS_MAP_POPUP_CAN_PARK_ETA_AND_WALK_PS_PD /* 1545 */:
                return str.equals("09") ? 256 : null;
            default:
                switch (iHashCode) {
                    case DisplayStrings.DS_DEFAULT /* 1567 */:
                        return str.equals("10") ? 512 : null;
                    case DisplayStrings.DS_MAP_ISSUE_MORE_INFO_DISCLAIMER /* 1568 */:
                        return str.equals("11") ? 1024 : null;
                    case DisplayStrings.DS_Z_SPEED_SENT_LOCATION_TITLE /* 1569 */:
                        return str.equals("12") ? 2048 : null;
                    case DisplayStrings.DS_Z_SPEED_SENT_LOCATION_TEXT /* 1570 */:
                        return str.equals("13") ? 4096 : null;
                    default:
                        return null;
                }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    private static Integer dolbyVisionStringToProfile(String str) {
        if (str == null) {
            return null;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == 1567) {
            return str.equals("10") ? 1024 : null;
        }
        switch (iHashCode) {
            case DisplayStrings.DS_MAP_POPUP_START_POINT_TITLE /* 1536 */:
                return str.equals("00") ? 1 : null;
            case DisplayStrings.DS_MAP_POPUP_START_POINT_SEARCH_BUTTON /* 1537 */:
                return str.equals("01") ? 2 : null;
            case DisplayStrings.DS_MAP_POPUP_START_POINT_CANCEL_BUTTON /* 1538 */:
                return str.equals("02") ? 4 : null;
            case DisplayStrings.DS_MAP_POPUP_HOME_TITLE /* 1539 */:
                return str.equals("03") ? 8 : null;
            case DisplayStrings.DS_MAP_POPUP_WORK_TITLE /* 1540 */:
                return str.equals("04") ? 16 : null;
            case DisplayStrings.DS_MAP_POPUP_PARKED_TITLE /* 1541 */:
                return str.equals("05") ? 32 : null;
            case DisplayStrings.DS_MAP_POPUP_PARKED_AT_TIME_PS /* 1542 */:
                return str.equals("06") ? 64 : null;
            case DisplayStrings.DS_MAP_POPUP_PARKED_SEND_LOCATION_BUTTON /* 1543 */:
                return str.equals("07") ? 128 : null;
            case DisplayStrings.DS_MAP_POPUP_CAN_PARK_TITLE /* 1544 */:
                return str.equals("08") ? 256 : null;
            case DisplayStrings.DS_MAP_POPUP_CAN_PARK_ETA_AND_WALK_PS_PD /* 1545 */:
                return str.equals("09") ? 512 : null;
            default:
                return null;
        }
    }

    private static int findNalStartCode(byte[] bArr, int i2) {
        int length = bArr.length - NAL_START_CODE.length;
        while (i2 <= length) {
            if (isNalStartCode(bArr, i2)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    private static MediaCodecProfileAndLevel getAacCodecProfileAndLevel(String str, String[] strArr) {
        if (strArr.length != 3) {
            Log.w(TAG, "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str)));
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(MimeTypes.getMimeTypeFromMp4ObjectType(Integer.parseInt(strArr[1], 16)))) {
                int iMp4aAudioObjectTypeToProfile = mp4aAudioObjectTypeToProfile(Integer.parseInt(strArr[2]));
                if (iMp4aAudioObjectTypeToProfile != -1) {
                    return new MediaCodecProfileAndLevel(iMp4aAudioObjectTypeToProfile, 0);
                }
                Log.w(TAG, a.a(-1, "Unrecognized MP4A profile: "));
                return MediaCodecProfileAndLevel.UNSUPPORTABLE;
            }
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str)));
        }
        return null;
    }

    private static MediaCodecProfileAndLevel getAc4CodecProfileAndLevel(String str, String[] strArr) throws NumberFormatException {
        if (strArr.length != 4) {
            Log.w(TAG, "Ignoring malformed AC-4 codec string: ".concat(String.valueOf(str)));
            return null;
        }
        try {
            int i2 = Integer.parseInt(strArr[1]);
            int i3 = Integer.parseInt(strArr[2]);
            int i4 = Integer.parseInt(strArr[3]);
            int iAc4BitstreamAndPresentationVersionsToProfileConst = ac4BitstreamAndPresentationVersionsToProfileConst(i2, i3);
            if (iAc4BitstreamAndPresentationVersionsToProfileConst != -1) {
                int iAc4LevelNumberToConst = ac4LevelNumberToConst(i4);
                if (iAc4LevelNumberToConst != -1) {
                    return new MediaCodecProfileAndLevel(iAc4BitstreamAndPresentationVersionsToProfileConst, iAc4LevelNumberToConst);
                }
                Log.w(TAG, a.a(i4, "Unknown AC-4 level: "));
                return MediaCodecProfileAndLevel.UNSUPPORTABLE;
            }
            Log.w(TAG, "Unknown AC-4 profile: " + i2 + "." + i3);
            return MediaCodecProfileAndLevel.UNSUPPORTABLE;
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Ignoring malformed AC-4 codec string: ".concat(String.valueOf(str)));
            return null;
        }
    }

    private static MediaCodecProfileAndLevel getApvProfileAndLevel(String str, String[] strArr) throws NumberFormatException {
        if (strArr.length < 4) {
            Log.w(TAG, "Ignoring malformed APV codec string: ".concat(String.valueOf(str)));
            return null;
        }
        int i2 = 1;
        try {
            int i3 = Integer.parseInt(strArr[1].substring(4));
            int i4 = Integer.parseInt(strArr[2].substring(4));
            int i5 = Integer.parseInt(strArr[3].substring(4));
            if (i3 != 33) {
                if (i3 != 44) {
                    Log.w(TAG, a.a(i3, "Unrecognized APV profile: "));
                    return MediaCodecProfileAndLevel.UNSUPPORTABLE;
                }
                i2 = 8192;
            }
            int iApvLevelAndBandNumberToConst = apvLevelAndBandNumberToConst(i4, i5);
            return iApvLevelAndBandNumberToConst == -1 ? MediaCodecProfileAndLevel.UNSUPPORTABLE : new MediaCodecProfileAndLevel(i2, iApvLevelAndBandNumberToConst);
        } catch (NumberFormatException e2) {
            Log.w(TAG, "Ignoring malformed APV codec string: ".concat(String.valueOf(str)), e2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.media3.common.util.CodecSpecificDataUtil.MediaCodecProfileAndLevel getAv1ProfileAndLevel(java.lang.String r8, java.lang.String[] r9, androidx.media3.common.ColorInfo r10) throws java.lang.NumberFormatException {
        /*
            int r0 = r9.length
            r1 = 4
            r2 = 0
            java.lang.String r3 = "Ignoring malformed AV1 codec string: "
            java.lang.String r4 = "CodecSpecificDataUtil"
            if (r0 >= r1) goto L15
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r8 = r3.concat(r8)
            androidx.media3.common.util.Log.w(r4, r8)
            return r2
        L15:
            r0 = 1
            r1 = r9[r0]     // Catch: java.lang.NumberFormatException -> L7d
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L7d
            r5 = 2
            r6 = r9[r5]     // Catch: java.lang.NumberFormatException -> L7d
            r7 = 0
            java.lang.String r6 = r6.substring(r7, r5)     // Catch: java.lang.NumberFormatException -> L7d
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.NumberFormatException -> L7d
            r7 = 3
            r9 = r9[r7]     // Catch: java.lang.NumberFormatException -> L7d
            int r8 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.NumberFormatException -> L7d
            if (r1 == 0) goto L3d
            java.lang.String r8 = "Unknown AV1 profile: "
            java.lang.String r8 = androidx.media3.common.util.a.a(r1, r8)
            androidx.media3.common.util.Log.w(r4, r8)
            androidx.media3.common.util.CodecSpecificDataUtil$MediaCodecProfileAndLevel r8 = androidx.media3.common.util.CodecSpecificDataUtil.MediaCodecProfileAndLevel.UNSUPPORTABLE
            return r8
        L3d:
            r9 = 8
            if (r8 == r9) goto L64
            r9 = 10
            if (r8 != r9) goto L58
            if (r10 == 0) goto L56
            byte[] r8 = r10.hdrStaticInfo
            r0 = 4096(0x1000, float:5.74E-42)
            if (r8 != 0) goto L64
            int r8 = r10.colorTransfer
            r9 = 7
            if (r8 == r9) goto L64
            r9 = 6
            if (r8 != r9) goto L56
            goto L64
        L56:
            r0 = r5
            goto L64
        L58:
            java.lang.String r9 = "Unknown AV1 bit depth: "
            java.lang.String r8 = androidx.media3.common.util.a.a(r8, r9)
            androidx.media3.common.util.Log.w(r4, r8)
            androidx.media3.common.util.CodecSpecificDataUtil$MediaCodecProfileAndLevel r8 = androidx.media3.common.util.CodecSpecificDataUtil.MediaCodecProfileAndLevel.UNSUPPORTABLE
            return r8
        L64:
            int r8 = av1LevelNumberToConst(r6)
            r9 = -1
            if (r8 != r9) goto L77
            java.lang.String r8 = "Unknown AV1 level: "
            java.lang.String r8 = androidx.media3.common.util.a.a(r6, r8)
            androidx.media3.common.util.Log.w(r4, r8)
            androidx.media3.common.util.CodecSpecificDataUtil$MediaCodecProfileAndLevel r8 = androidx.media3.common.util.CodecSpecificDataUtil.MediaCodecProfileAndLevel.UNSUPPORTABLE
            return r8
        L77:
            androidx.media3.common.util.CodecSpecificDataUtil$MediaCodecProfileAndLevel r9 = new androidx.media3.common.util.CodecSpecificDataUtil$MediaCodecProfileAndLevel
            r9.<init>(r0, r8)
            return r9
        L7d:
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r8 = r3.concat(r8)
            androidx.media3.common.util.Log.w(r4, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.util.CodecSpecificDataUtil.getAv1ProfileAndLevel(java.lang.String, java.lang.String[], androidx.media3.common.ColorInfo):androidx.media3.common.util.CodecSpecificDataUtil$MediaCodecProfileAndLevel");
    }

    private static MediaCodecProfileAndLevel getAvcProfileAndLevel(String str, String[] strArr) throws NumberFormatException {
        int i2;
        int i3;
        int length = strArr.length;
        if (length < 2) {
            Log.w(TAG, "Ignoring malformed AVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i2 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i3 = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (length < 3) {
                    Log.w(TAG, "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                i2 = Integer.parseInt(strArr[1]);
                i3 = Integer.parseInt(strArr[2]);
            }
            int iAvcProfileNumberToConst = avcProfileNumberToConst(i2);
            if (iAvcProfileNumberToConst == -1) {
                Log.w(TAG, a.a(i2, "Unknown AVC profile: "));
                return MediaCodecProfileAndLevel.UNSUPPORTABLE;
            }
            int iAvcLevelNumberToConst = avcLevelNumberToConst(i3);
            if (iAvcLevelNumberToConst != -1) {
                return new MediaCodecProfileAndLevel(iAvcProfileNumberToConst, iAvcLevelNumberToConst);
            }
            Log.w(TAG, a.a(i3, "Unknown AVC level: "));
            return MediaCodecProfileAndLevel.UNSUPPORTABLE;
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Ignoring malformed AVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
    }

    public static Pair<Integer, Integer> getCodecProfileAndLevel(Format format) {
        MediaCodecProfileAndLevel mediaCodecProfileAndLevel = getMediaCodecProfileAndLevel(format);
        if (mediaCodecProfileAndLevel == null || !mediaCodecProfileAndLevel.isSupportableByMediaCodec()) {
            return null;
        }
        return new Pair<>(Integer.valueOf(mediaCodecProfileAndLevel.getProfile()), Integer.valueOf(mediaCodecProfileAndLevel.getLevel()));
    }

    public static String getDolbyVisionBaseLayerMimeType(Format format) {
        Pair<Integer, Integer> codecProfileAndLevel;
        if (!Objects.equals(format.sampleMimeType, MimeTypes.VIDEO_DOLBY_VISION) || (codecProfileAndLevel = getCodecProfileAndLevel(format)) == null) {
            return null;
        }
        int iIntValue = ((Integer) codecProfileAndLevel.first).intValue();
        if (iIntValue == 16 || iIntValue == 32 || iIntValue == 256) {
            return MimeTypes.VIDEO_H265;
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        if (iIntValue != 1024) {
            return null;
        }
        return MimeTypes.VIDEO_AV1;
    }

    private static MediaCodecProfileAndLevel getDolbyVisionProfileAndLevel(String str, String[] strArr) {
        if (strArr.length < 3) {
            Log.w(TAG, "Ignoring malformed Dolby Vision codec string: ".concat(String.valueOf(str)));
            return null;
        }
        Matcher matcher = PROFILE_PATTERN.matcher(strArr[1]);
        if (!matcher.matches()) {
            Log.w(TAG, "Ignoring malformed Dolby Vision codec string: ".concat(String.valueOf(str)));
            return null;
        }
        String strGroup = matcher.group(1);
        an.B(strGroup);
        Integer numDolbyVisionStringToProfile = dolbyVisionStringToProfile(strGroup);
        if (numDolbyVisionStringToProfile == null) {
            Log.w(TAG, "Unknown Dolby Vision profile string: ".concat(strGroup));
            return MediaCodecProfileAndLevel.UNSUPPORTABLE;
        }
        String str2 = strArr[2];
        Integer numDolbyVisionStringToLevel = dolbyVisionStringToLevel(str2);
        if (numDolbyVisionStringToLevel != null) {
            return new MediaCodecProfileAndLevel(numDolbyVisionStringToProfile.intValue(), numDolbyVisionStringToLevel.intValue());
        }
        Log.w(TAG, "Unknown Dolby Vision level string: ".concat(String.valueOf(str2)));
        return null;
    }

    private static MediaCodecProfileAndLevel getH263ProfileAndLevel(String str, String[] strArr) throws NumberFormatException {
        if (strArr.length < 3) {
            Log.w(TAG, "Ignoring malformed H263 codec string: ".concat(String.valueOf(str)));
            return null;
        }
        try {
            int i2 = Integer.parseInt(strArr[1]);
            int i3 = Integer.parseInt(strArr[2]);
            int iH263ProfileNumberToConst = h263ProfileNumberToConst(i2);
            if (iH263ProfileNumberToConst == -1) {
                Log.w(TAG, a.a(i2, "Unknown H263 profile: "));
                return MediaCodecProfileAndLevel.UNSUPPORTABLE;
            }
            int iH263LevelNumberToConst = h263LevelNumberToConst(i3);
            if (iH263LevelNumberToConst != -1) {
                return new MediaCodecProfileAndLevel(iH263ProfileNumberToConst, iH263LevelNumberToConst);
            }
            Log.w(TAG, a.a(i3, "Unknown H263 level: "));
            return MediaCodecProfileAndLevel.UNSUPPORTABLE;
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Ignoring malformed H263 codec string: ".concat(String.valueOf(str)));
            return null;
        }
    }

    public static MediaCodecProfileAndLevel getHevcProfileAndLevel(String str, String[] strArr, ColorInfo colorInfo) {
        if (strArr.length < 4) {
            Log.w(TAG, "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        int i2 = 1;
        Matcher matcher = PROFILE_PATTERN.matcher(strArr[1]);
        if (!matcher.matches()) {
            Log.w(TAG, "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        String strGroup = matcher.group(1);
        if (!IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(strGroup)) {
            if (!ExifInterface.GPS_MEASUREMENT_2D.equals(strGroup)) {
                Log.w(TAG, "Unknown HEVC profile string: ".concat(String.valueOf(strGroup)));
                return MediaCodecProfileAndLevel.UNSUPPORTABLE;
            }
            i2 = 2;
            if (colorInfo != null && colorInfo.colorTransfer == 6) {
                i2 = 4096;
            }
        }
        String str2 = strArr[3];
        Integer numHevcCodecStringToProfileLevel = hevcCodecStringToProfileLevel(str2);
        if (numHevcCodecStringToProfileLevel != null) {
            return new MediaCodecProfileAndLevel(i2, numHevcCodecStringToProfileLevel.intValue());
        }
        Log.w(TAG, "Unknown HEVC level string: ".concat(String.valueOf(str2)));
        return MediaCodecProfileAndLevel.UNSUPPORTABLE;
    }

    private static MediaCodecProfileAndLevel getIamfCodecProfileAndLevel(String str, String[] strArr) {
        if (strArr.length < 4) {
            Log.w(TAG, "Ignoring malformed IAMF codec string: ".concat(String.valueOf(str)));
            return null;
        }
        try {
            int iIamfProfileNumberToConst = iamfProfileNumberToConst(strArr[3], Integer.parseInt(strArr[1]));
            return iIamfProfileNumberToConst == -1 ? MediaCodecProfileAndLevel.UNSUPPORTABLE : new MediaCodecProfileAndLevel(iIamfProfileNumberToConst, 0);
        } catch (NumberFormatException e2) {
            Log.w(TAG, "Ignoring malformed primary profile in IAMF codec string: ".concat(String.valueOf(strArr[1])), e2);
            return null;
        }
    }

    public static MediaCodecProfileAndLevel getMediaCodecProfileAndLevel(Format format) {
        String str = format.codecs;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(format.sampleMimeType)) {
            return getDolbyVisionProfileAndLevel(format.codecs, strArrSplit);
        }
        String str2 = strArrSplit[0];
        switch (str2.hashCode()) {
            case 2986313:
                if (str2.equals(CODEC_ID_AC4)) {
                    return getAc4CodecProfileAndLevel(format.codecs, strArrSplit);
                }
                return null;
            case 3001066:
                if (str2.equals(CODEC_ID_APV1)) {
                    return getApvProfileAndLevel(format.codecs, strArrSplit);
                }
                return null;
            case 3004662:
                if (str2.equals(CODEC_ID_AV01)) {
                    return getAv1ProfileAndLevel(format.codecs, strArrSplit, format.colorInfo);
                }
                return null;
            case 3006243:
                if (!str2.equals(CODEC_ID_AVC1)) {
                    return null;
                }
                return getAvcProfileAndLevel(format.codecs, strArrSplit);
            case 3006244:
                if (!str2.equals(CODEC_ID_AVC2)) {
                    return null;
                }
                return getAvcProfileAndLevel(format.codecs, strArrSplit);
            case 3199032:
                if (!str2.equals(CODEC_ID_HEV1)) {
                    return null;
                }
                return getHevcProfileAndLevel(format.codecs, strArrSplit, format.colorInfo);
            case 3214780:
                if (!str2.equals(CODEC_ID_HVC1)) {
                    return null;
                }
                return getHevcProfileAndLevel(format.codecs, strArrSplit, format.colorInfo);
            case 3224753:
                if (str2.equals(CODEC_ID_IAMF)) {
                    return getIamfCodecProfileAndLevel(format.codecs, strArrSplit);
                }
                return null;
            case 3356560:
                if (str2.equals(CODEC_ID_MP4A)) {
                    return getAacCodecProfileAndLevel(format.codecs, strArrSplit);
                }
                return null;
            case 3475740:
                if (str2.equals(CODEC_ID_H263)) {
                    return getH263ProfileAndLevel(format.codecs, strArrSplit);
                }
                return null;
            case 3624515:
                if (str2.equals(CODEC_ID_VP09)) {
                    return getVp9ProfileAndLevel(format.codecs, strArrSplit);
                }
                return null;
            case 3631854:
                if (!str2.equals(CODEC_ID_VVC1)) {
                    return null;
                }
                return getVvcProfileAndLevel(format.codecs, strArrSplit, format.colorInfo);
            case 3632040:
                if (!str2.equals(CODEC_ID_VVI1)) {
                    return null;
                }
                return getVvcProfileAndLevel(format.codecs, strArrSplit, format.colorInfo);
            default:
                return null;
        }
    }

    public static byte[] getOpusInitializationData(Format format) {
        an.m(!format.initializationData.isEmpty(), "csd-0 must be present for Opus.");
        int i2 = 0;
        byte[] bArr = format.initializationData.get(0);
        int length = bArr.length;
        an.l(length >= 8);
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        String string = parsableByteArray.readString(8);
        if (string.equals("AOPUSHDR")) {
            an.l(length >= 24);
            long littleEndianLong = parsableByteArray.readLittleEndianLong();
            an.l(16 + littleEndianLong <= ((long) length));
            length = (int) littleEndianLong;
            i2 = 16;
        } else {
            an.l(string.equals("OpusHead"));
        }
        return Arrays.copyOfRange(bArr, i2, length + i2);
    }

    public static Pair<Integer, Integer> getVideoResolutionFromMpeg4VideoConfig(byte[] bArr) {
        boolean z;
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i3 + 3;
            if (i4 >= bArr.length) {
                z = false;
                break;
            }
            if (parsableByteArray.readUnsignedInt24() == 1 && (bArr[i4] & 240) == 32) {
                z = true;
                break;
            }
            parsableByteArray.setPosition(parsableByteArray.getPosition() - 2);
            i3++;
        }
        an.m(z, "Invalid input: VOL not found.");
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
        parsableBitArray.skipBits((i3 + 4) * 8);
        parsableBitArray.skipBits(1);
        parsableBitArray.skipBits(8);
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(4);
            parsableBitArray.skipBits(3);
        }
        if (parsableBitArray.readBits(4) == 15) {
            parsableBitArray.skipBits(8);
            parsableBitArray.skipBits(8);
        }
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(2);
            parsableBitArray.skipBits(1);
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(79);
            }
        }
        an.m(parsableBitArray.readBits(2) == 0, "Only supports rectangular video object layer shape.");
        an.l(parsableBitArray.readBit());
        int bits = parsableBitArray.readBits(16);
        an.l(parsableBitArray.readBit());
        if (parsableBitArray.readBit()) {
            an.l(bits > 0);
            int i5 = bits - 1;
            while (i5 > 0) {
                i5 >>= 1;
                i2++;
            }
            parsableBitArray.skipBits(i2);
        }
        an.l(parsableBitArray.readBit());
        int bits2 = parsableBitArray.readBits(13);
        an.l(parsableBitArray.readBit());
        int bits3 = parsableBitArray.readBits(13);
        an.l(parsableBitArray.readBit());
        parsableBitArray.skipBits(1);
        return Pair.create(Integer.valueOf(bits2), Integer.valueOf(bits3));
    }

    public static ByteBuffer getVorbisInitializationData(Format format) {
        an.m(format.initializationData.size() > 1, "csd-0 and csd-1 must be present for Vorbis.");
        byte[] bArr = format.initializationData.get(0);
        byte[] bArr2 = format.initializationData.get(1);
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrXiphLaceEnc = xiphLaceEnc(length);
        int length3 = bArrXiphLaceEnc.length;
        byte[] bArrXiphLaceEnc2 = xiphLaceEnc(23);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length3 + 1 + bArrXiphLaceEnc2.length + length + 23 + length2);
        byteBufferAllocate.put((byte) 2);
        byteBufferAllocate.put(bArrXiphLaceEnc);
        byteBufferAllocate.put(bArrXiphLaceEnc2);
        byteBufferAllocate.put(bArr);
        byteBufferAllocate.put(new byte[]{3, 118, 111, 114, 98, 105, 115, 7, 0, 0, 0, 97, 110, 100, 114, 111, 105, 100, 0, 0, 0, 0, 1});
        byteBufferAllocate.put(bArr2);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    private static Pair<Integer, Integer> getVp9BitdepthChromaSubSampling(ParsableBitArray parsableBitArray, int i2) {
        int i3 = 2;
        int i4 = i2 >= 2 ? true != parsableBitArray.readBit() ? 10 : 12 : 8;
        if (parsableBitArray.readBits(3) != 7) {
            parsableBitArray.skipBits(1);
            if (i2 == 1 || i2 == 3) {
                int bits = parsableBitArray.readBits(1);
                int bits2 = parsableBitArray.readBits(1);
                if (bits == 1) {
                    if (bits2 == 1) {
                        return null;
                    }
                    bits = 1;
                }
                if (bits != 1) {
                    if (bits != 0 || bits2 != 0) {
                        return null;
                    }
                    i3 = 3;
                } else if (bits2 != 0) {
                    return null;
                }
            } else {
                i3 = 0;
            }
        } else {
            i3 = 3;
        }
        return Pair.create(Integer.valueOf(i4), Integer.valueOf(i3));
    }

    private static MediaCodecProfileAndLevel getVp9ProfileAndLevel(String str, String[] strArr) throws NumberFormatException {
        if (strArr.length < 3) {
            Log.w(TAG, "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str)));
            return null;
        }
        try {
            int i2 = Integer.parseInt(strArr[1]);
            int i3 = Integer.parseInt(strArr[2]);
            int iVp9ProfileNumberToConst = vp9ProfileNumberToConst(i2);
            if (iVp9ProfileNumberToConst == -1) {
                Log.w(TAG, a.a(i2, "Unknown VP9 profile: "));
                return MediaCodecProfileAndLevel.UNSUPPORTABLE;
            }
            int iVp9LevelNumberToConst = vp9LevelNumberToConst(i3);
            if (iVp9LevelNumberToConst != -1) {
                return new MediaCodecProfileAndLevel(iVp9ProfileNumberToConst, iVp9LevelNumberToConst);
            }
            Log.w(TAG, a.a(i3, "Unknown VP9 level: "));
            return MediaCodecProfileAndLevel.UNSUPPORTABLE;
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str)));
            return null;
        }
    }

    private static MediaCodecProfileAndLevel getVvcProfileAndLevel(String str, String[] strArr, ColorInfo colorInfo) throws NumberFormatException {
        if (strArr.length < 3) {
            Log.w(TAG, "Ignoring malformed VVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        int i2 = 1;
        try {
            int i3 = Integer.parseInt(strArr[1]);
            if (i3 == 1) {
                if (colorInfo != null && colorInfo.colorTransfer == 6) {
                    i2 = 4096;
                } else if (colorInfo == null || colorInfo.lumaBitdepth != 8) {
                    i2 = 2;
                }
            } else {
                if (i3 != 65) {
                    Log.w(TAG, "Unknown VVC profile IDC: ".concat(String.valueOf(strArr[1])));
                    return MediaCodecProfileAndLevel.UNSUPPORTABLE;
                }
                i2 = 4;
            }
            String str2 = strArr[2];
            Integer numVvcCodecStringToProfileLevel = vvcCodecStringToProfileLevel(str2);
            if (numVvcCodecStringToProfileLevel != null) {
                return new MediaCodecProfileAndLevel(i2, numVvcCodecStringToProfileLevel.intValue());
            }
            Log.w(TAG, "Unknown VVC level string: ".concat(String.valueOf(str2)));
            return MediaCodecProfileAndLevel.UNSUPPORTABLE;
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Ignoring malformed VVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
    }

    public static int h263ConstToLevelNumber(int i2) {
        if (i2 == 1) {
            return 10;
        }
        if (i2 == 2) {
            return 20;
        }
        if (i2 == 4) {
            return 30;
        }
        if (i2 == 8) {
            return 40;
        }
        if (i2 == 16) {
            return 45;
        }
        if (i2 == 32) {
            return 50;
        }
        if (i2 != 64) {
            return i2 != 128 ? -1 : 70;
        }
        return 60;
    }

    public static int h263ConstToProfileNumber(int i2) {
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 32) {
            return 5;
        }
        if (i2 == 64) {
            return 6;
        }
        if (i2 != 128) {
            return i2 != 256 ? -1 : 8;
        }
        return 7;
    }

    private static int h263LevelNumberToConst(int i2) {
        if (i2 == 10) {
            return 1;
        }
        if (i2 == 20) {
            return 2;
        }
        if (i2 == 30) {
            return 4;
        }
        if (i2 == 40) {
            return 8;
        }
        if (i2 == 45) {
            return 16;
        }
        if (i2 == 50) {
            return 32;
        }
        if (i2 != 60) {
            return i2 != 70 ? -1 : 128;
        }
        return 64;
    }

    private static int h263ProfileNumberToConst(int i2) {
        switch (i2) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            default:
                return -1;
        }
    }

    private static Integer hevcCodecStringToProfileLevel(String str) {
        switch (str.hashCode()) {
            case 70821:
                return str.equals("H30") ? 2 : null;
            case 70914:
                return str.equals("H60") ? 8 : null;
            case 70917:
                return str.equals("H63") ? 32 : null;
            case 71007:
                return str.equals("H90") ? 128 : null;
            case 71010:
                return str.equals("H93") ? 512 : null;
            case 74665:
                return str.equals("L30") ? 1 : null;
            case 74758:
                return str.equals("L60") ? 4 : null;
            case 74761:
                return str.equals("L63") ? 16 : null;
            case 74851:
                return str.equals("L90") ? 64 : null;
            case 74854:
                return str.equals("L93") ? 256 : null;
            case 2193639:
                return str.equals("H120") ? 2048 : null;
            case 2193642:
                return str.equals("H123") ? 8192 : null;
            case 2193732:
                return str.equals("H150") ? 32768 : null;
            case 2193735:
                return str.equals("H153") ? 131072 : null;
            case 2193738:
                return str.equals("H156") ? 524288 : null;
            case 2193825:
                return str.equals("H180") ? 2097152 : null;
            case 2193828:
                return str.equals("H183") ? 8388608 : null;
            case 2193831:
                if (str.equals("H186")) {
                    return Integer.valueOf(GroupFlagsKt.HasAuxSlotFlag);
                }
                return null;
            case 2312803:
                return str.equals("L120") ? 1024 : null;
            case 2312806:
                return str.equals("L123") ? 4096 : null;
            case 2312896:
                return str.equals("L150") ? 16384 : null;
            case 2312899:
                return str.equals("L153") ? 65536 : null;
            case 2312902:
                return str.equals("L156") ? 262144 : null;
            case 2312989:
                return str.equals("L180") ? 1048576 : null;
            case 2312992:
                return str.equals("L183") ? 4194304 : null;
            case 2312995:
                return str.equals("L186") ? 16777216 : null;
            default:
                return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int iamfProfileNumberToConst(String str, int i2) {
        switch (str.hashCode()) {
            case 2464863:
                if (str.equals("Opus")) {
                    if (i2 == 0) {
                        return R.attr.label;
                    }
                    if (i2 == 1) {
                        return R.id.checkbox;
                    }
                    if (i2 == 2) {
                        return R.string.copy;
                    }
                    Log.w(TAG, a.a(i2, "Unrecognized IAMF Opus profile: "));
                    return -1;
                }
                break;
            case 3114792:
                if (str.equals("fLaC")) {
                    if (i2 == 0) {
                        return R.attr.manageSpaceActivity;
                    }
                    if (i2 == 1) {
                        return R.id.empty;
                    }
                    if (i2 == 2) {
                        return R.string.defaultVoiceMailAlphaTag;
                    }
                    Log.w(TAG, a.a(i2, "Unrecognized IAMF FLAC profile: "));
                    return -1;
                }
                break;
            case 3238865:
                if (str.equals("ipcm")) {
                    if (i2 == 0) {
                        return R.attr.writePermission;
                    }
                    if (i2 == 1) {
                        return R.id.icon2;
                    }
                    if (i2 == 2) {
                        return R.string.httpErrorUnsupportedScheme;
                    }
                    Log.w(TAG, a.a(i2, "Unrecognized IAMF PCM profile: "));
                    return -1;
                }
                break;
            case 3356560:
                if (str.equals(CODEC_ID_MP4A)) {
                    if (i2 == 0) {
                        return R.attr.icon;
                    }
                    if (i2 == 1) {
                        return R.id.content;
                    }
                    if (i2 == 2) {
                        return R.string.copyUrl;
                    }
                    Log.w(TAG, a.a(i2, "Unrecognized IAMF AAC profile: "));
                    return -1;
                }
                break;
        }
        Log.w(TAG, "Unrecognized codec identifier for IAMF auxiliary profile: ".concat(String.valueOf(str)));
        return -1;
    }

    private static boolean isNalStartCode(byte[] bArr, int i2) {
        if (bArr.length - i2 <= NAL_START_CODE.length) {
            return false;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr2 = NAL_START_CODE;
            if (i3 >= bArr2.length) {
                return true;
            }
            if (bArr[i2 + i3] != bArr2[i3]) {
                return false;
            }
            i3++;
        }
    }

    private static int mp4aAudioObjectTypeToProfile(int i2) {
        int i3 = 17;
        if (i2 != 17) {
            i3 = 20;
            if (i2 != 20) {
                i3 = 23;
                if (i2 != 23) {
                    i3 = 29;
                    if (i2 != 29) {
                        i3 = 39;
                        if (i2 != 39) {
                            i3 = 42;
                            if (i2 != 42) {
                                switch (i2) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i3;
    }

    public static int[] parseAlacAudioSpecificConfig(byte[] bArr) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        parsableByteArray.setPosition(5);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        parsableByteArray.setPosition(9);
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        parsableByteArray.setPosition(20);
        return new int[]{parsableByteArray.readUnsignedIntToInt(), unsignedByte2, unsignedByte};
    }

    public static boolean parseCea708InitializationData(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    public static byte[][] splitNalUnits(byte[] bArr) {
        if (!isNalStartCode(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iFindNalStartCode = 0;
        do {
            arrayList.add(Integer.valueOf(iFindNalStartCode));
            iFindNalStartCode = findNalStartCode(bArr, iFindNalStartCode + NAL_START_CODE.length);
        } while (iFindNalStartCode != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i2 = 0;
        while (i2 < arrayList.size()) {
            int i3 = i2 + 1;
            int iIntValue = ((Integer) arrayList.get(i2)).intValue();
            int iIntValue2 = (i2 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i3)).intValue() : bArr.length) - iIntValue;
            byte[] bArr3 = new byte[iIntValue2];
            System.arraycopy(bArr, iIntValue, bArr3, 0, iIntValue2);
            bArr2[i2] = bArr3;
            i2 = i3;
        }
        return bArr2;
    }

    private static int vp9LevelNumberToConst(int i2) {
        if (i2 == 10) {
            return 1;
        }
        if (i2 == 11) {
            return 2;
        }
        if (i2 == 20) {
            return 4;
        }
        if (i2 == 21) {
            return 8;
        }
        if (i2 == 30) {
            return 16;
        }
        if (i2 == 31) {
            return 32;
        }
        if (i2 == 40) {
            return 64;
        }
        if (i2 == 41) {
            return 128;
        }
        if (i2 == 50) {
            return 256;
        }
        if (i2 == 51) {
            return 512;
        }
        switch (i2) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    private static int vp9ProfileNumberToConst(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        if (i2 != 2) {
            return i2 != 3 ? -1 : 8;
        }
        return 4;
    }

    private static Integer vvcCodecStringToProfileLevel(String str) {
        switch (str.hashCode()) {
            case 70918:
                return str.equals("H64") ? 64 : null;
            case 70921:
                return str.equals("H67") ? 256 : null;
            case 70976:
                return str.equals("H80") ? 1024 : null;
            case 70979:
                return str.equals("H83") ? 4096 : null;
            case 70982:
                return str.equals("H86") ? 16384 : null;
            case 71013:
                return str.equals("H96") ? 65536 : null;
            case 74609:
                return str.equals("L16") ? 1 : null;
            case 74667:
                return str.equals("L32") ? 2 : null;
            case 74670:
                return str.equals("L35") ? 4 : null;
            case 74704:
                return str.equals("L48") ? 8 : null;
            case 74728:
                return str.equals("L51") ? 16 : null;
            case 74762:
                return str.equals("L64") ? 32 : null;
            case 74765:
                return str.equals("L67") ? 128 : null;
            case 74820:
                return str.equals("L80") ? 512 : null;
            case 74823:
                return str.equals("L83") ? 2048 : null;
            case 74826:
                return str.equals("L86") ? 8192 : null;
            case 74857:
                return str.equals("L96") ? 32768 : null;
            case 2193610:
                return str.equals("H112") ? 262144 : null;
            case 2193647:
                return str.equals("H128") ? 1048576 : null;
            case 2193705:
                return str.equals("H144") ? 4194304 : null;
            case 2312774:
                return str.equals("L112") ? 131072 : null;
            case 2312811:
                return str.equals("L128") ? 524288 : null;
            case 2312869:
                return str.equals("L144") ? 2097152 : null;
            default:
                return null;
        }
    }

    private static byte[] xiphLaceEnc(int i2) {
        int i3 = i2 / 255;
        byte[] bArr = new byte[i3 + 1];
        Arrays.fill(bArr, (byte) -1);
        bArr[i3] = (byte) (i2 % 255);
        return bArr;
    }

    /* compiled from: WazeSource */
    public final class MediaCodecProfileAndLevel {
        public static final MediaCodecProfileAndLevel UNSUPPORTABLE = new MediaCodecProfileAndLevel(0, 0, false);
        private final boolean isSupportableByMediaCodec;
        private final int level;
        private final int profile;

        private MediaCodecProfileAndLevel(int i2, int i3, boolean z) {
            this.isSupportableByMediaCodec = z;
            this.profile = i2;
            this.level = i3;
        }

        public int getLevel() {
            an.u(this.isSupportableByMediaCodec);
            return this.level;
        }

        public int getProfile() {
            an.u(this.isSupportableByMediaCodec);
            return this.profile;
        }

        public boolean isSupportableByMediaCodec() {
            return this.isSupportableByMediaCodec;
        }

        public MediaCodecProfileAndLevel(int i2, int i3) {
            this(i2, i3, true);
        }
    }
}
