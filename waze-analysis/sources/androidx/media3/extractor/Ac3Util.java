package androidx.media3.extractor;

import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.OpusUtil;
import com.waze.strings.DisplayStrings;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class Ac3Util {
    public static final int AC3_MAX_RATE_BYTES_PER_SECOND = 80000;
    private static final int AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT = 1536;
    private static final int AUDIO_SAMPLES_PER_AUDIO_BLOCK = 256;
    public static final int E_AC3_MAX_RATE_BYTES_PER_SECOND = 768000;
    public static final int TRUEHD_MAX_RATE_BYTES_PER_SECOND = 3062500;
    public static final int TRUEHD_RECHUNK_SAMPLE_COUNT = 16;
    public static final int TRUEHD_SYNCFRAME_PREFIX_LENGTH = 10;
    private static final int[] BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD = {1, 2, 3, 6};
    private static final int[] SAMPLE_RATE_BY_FSCOD = {OpusUtil.SAMPLE_RATE, 44100, 32000};
    private static final int[] SAMPLE_RATE_BY_FSCOD2 = {24000, 22050, 16000};
    private static final int[] CHANNEL_COUNT_BY_ACMOD = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] BITRATE_BY_HALF_FRMSIZECOD = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, DisplayStrings.DS_TRIP_OVERVIEW_PREFERRED_ROUTE_IS_SLOWER_POPUP_BUTTON_TEXT, 384, DisplayStrings.DS_ACCIDENT, 512, DisplayStrings.DS_REPORT_MENU_V2_MAP_ISSUE_TURN_NOT_ALLOWED_LABEL, 640};
    private static final int[] SYNCFRAME_SIZE_WORDS_BY_HALF_FRMSIZECOD_44_1 = {69, 87, 104, 121, 139, 174, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_DEFAULT_7, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_PREFERENCES_6, DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_LABEL_TRAFFIC_STATUS_USUAL, DisplayStrings.DS_ROUTE_SETTINGS_SHEET_TITLE, DisplayStrings.DS_START_STATE_SETTINGS_TITLE, DisplayStrings.DS_REPORT_MENU_V2_SHEET_TITLE, DisplayStrings.DS_REPORT_INCAR_CLOSURE_REPORT_TITLE, DisplayStrings.DS_HURRICANE, DisplayStrings.DS_YOU_NEED_TO_BE_A_REGISTERED_USER_IN_ORDER_TO_SEND_PING__CHITHCHAT_OR_COMMENT_, DisplayStrings.DS_ONBOARDING_ADD_HOME_WORK_SET_BUTTON, DisplayStrings.DS_TAP_TO_ADD_CATEGORIES, DisplayStrings.DS_LOCATION_PREVIEW_GO_BUTTON, DisplayStrings.DS_FUTURE_DRIVES_LIST_ITEM_DRIVE_MINUTES_PD};

    /* compiled from: WazeSource */
    public final class SyncFrameInfo {
        public static final int STREAM_TYPE_TYPE0 = 0;
        public static final int STREAM_TYPE_TYPE1 = 1;
        public static final int STREAM_TYPE_TYPE2 = 2;
        public static final int STREAM_TYPE_UNDEFINED = -1;
        public final int bitrate;
        public final int channelCount;
        public final int frameSize;
        public final String mimeType;
        public final int sampleCount;
        public final int sampleRate;
        public final int streamType;

        /* compiled from: WazeSource */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface StreamType {
        }

        private SyncFrameInfo(String str, int i2, int i3, int i4, int i5, int i6, int i7) {
            this.mimeType = str;
            this.streamType = i2;
            this.channelCount = i3;
            this.sampleRate = i4;
            this.frameSize = i5;
            this.sampleCount = i6;
            this.bitrate = i7;
        }
    }

    private Ac3Util() {
    }

    private static int calculateEac3Bitrate(int i2, int i3, int i4) {
        return (i2 * i3) / (i4 * 32);
    }

    public static int findTrueHdSyncframeOffset(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i2 = iPosition; i2 <= iLimit; i2++) {
            if ((Util.getBigEndianInt(byteBuffer, i2 + 4) & (-2)) == -126718022) {
                return i2 - iPosition;
            }
        }
        return -1;
    }

    private static int getAc3SyncframeSize(int i2, int i3) {
        if (i2 < 0) {
            return -1;
        }
        int[] iArr = SAMPLE_RATE_BY_FSCOD;
        if (i2 >= iArr.length || i3 < 0) {
            return -1;
        }
        int i4 = i3 >> 1;
        int[] iArr2 = SYNCFRAME_SIZE_WORDS_BY_HALF_FRMSIZECOD_44_1;
        if (i4 >= iArr2.length) {
            return -1;
        }
        int i5 = iArr[i2];
        if (i5 == 44100) {
            int i6 = iArr2[i4] + (i3 & 1);
            return i6 + i6;
        }
        int i7 = BITRATE_BY_HALF_FRMSIZECOD[i4];
        return i5 == 32000 ? i7 * 6 : i7 * 4;
    }

    public static Format parseAc3AnnexFFormat(ParsableByteArray parsableByteArray, String str, String str2, DrmInitData drmInitData) {
        ParsableBitArray parsableBitArray = new ParsableBitArray();
        parsableBitArray.reset(parsableByteArray);
        int i2 = SAMPLE_RATE_BY_FSCOD[parsableBitArray.readBits(2)];
        parsableBitArray.skipBits(8);
        int i3 = CHANNEL_COUNT_BY_ACMOD[parsableBitArray.readBits(3)];
        if (parsableBitArray.readBits(1) != 0) {
            i3++;
        }
        int i4 = BITRATE_BY_HALF_FRMSIZECOD[parsableBitArray.readBits(5)] * 1000;
        parsableBitArray.byteAlign();
        parsableByteArray.setPosition(parsableBitArray.getBytePosition());
        Format.Builder builder = new Format.Builder();
        builder.setId(str);
        builder.setSampleMimeType(MimeTypes.AUDIO_AC3);
        builder.setChannelCount(i3);
        builder.setSampleRate(i2);
        builder.setDrmInitData(drmInitData);
        builder.setLanguage(str2);
        builder.setAverageBitrate(i4);
        builder.setPeakBitrate(i4);
        return builder.build();
    }

    public static int parseAc3SyncframeAudioSampleCount(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & StylePropertiesKt.LetterSpacingId) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static SyncFrameInfo parseAc3SyncframeInfo(ParsableBitArray parsableBitArray) {
        int ac3SyncframeSize;
        int i2;
        int i3;
        int i4;
        String str;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int position = parsableBitArray.getPosition();
        parsableBitArray.skipBits(40);
        int bits = parsableBitArray.readBits(5);
        parsableBitArray.setPosition(position);
        int i10 = -1;
        if (bits > 10) {
            parsableBitArray.skipBits(16);
            int bits2 = parsableBitArray.readBits(2);
            if (bits2 == 0) {
                i10 = 0;
            } else if (bits2 == 1) {
                i10 = 1;
            } else if (bits2 == 2) {
                i10 = 2;
            }
            parsableBitArray.skipBits(3);
            int bits3 = parsableBitArray.readBits(11) + 1;
            int bits4 = parsableBitArray.readBits(2);
            if (bits4 == 3) {
                i2 = SAMPLE_RATE_BY_FSCOD2[parsableBitArray.readBits(2)];
                i7 = 6;
                i6 = 3;
            } else {
                int bits5 = parsableBitArray.readBits(2);
                int i11 = BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD[bits5];
                i6 = bits5;
                i2 = SAMPLE_RATE_BY_FSCOD[bits4];
                i7 = i11;
            }
            ac3SyncframeSize = bits3 + bits3;
            int iCalculateEac3Bitrate = calculateEac3Bitrate(ac3SyncframeSize, i2, i7);
            int bits6 = parsableBitArray.readBits(3);
            boolean bit = parsableBitArray.readBit();
            i3 = CHANNEL_COUNT_BY_ACMOD[bits6] + (bit ? 1 : 0);
            parsableBitArray.skipBits(10);
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(8);
            }
            if (bits6 == 0) {
                parsableBitArray.skipBits(5);
                if (parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(8);
                }
                i8 = 0;
                bits6 = 0;
            } else {
                i8 = bits6;
            }
            if (i10 == 1) {
                if (parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(16);
                }
                i9 = 1;
            } else {
                i9 = i10;
            }
            if (parsableBitArray.readBit()) {
                if (i8 > 2) {
                    parsableBitArray.skipBits(2);
                }
                if ((i8 & 1) != 0 && i8 > 2) {
                    parsableBitArray.skipBits(6);
                }
                if ((i8 & 4) != 0) {
                    parsableBitArray.skipBits(6);
                }
                if (bit && parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(5);
                }
                if (i9 == 0) {
                    if (parsableBitArray.readBit()) {
                        parsableBitArray.skipBits(6);
                    }
                    if (i8 == 0 && parsableBitArray.readBit()) {
                        parsableBitArray.skipBits(6);
                    }
                    if (parsableBitArray.readBit()) {
                        parsableBitArray.skipBits(6);
                    }
                    int bits7 = parsableBitArray.readBits(2);
                    if (bits7 == 1) {
                        parsableBitArray.skipBits(5);
                    } else if (bits7 == 2) {
                        parsableBitArray.skipBits(12);
                    } else if (bits7 == 3) {
                        int bits8 = parsableBitArray.readBits(5);
                        if (parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(5);
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray.skipBits(4);
                                }
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray.skipBits(4);
                                }
                            }
                        }
                        if (parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(5);
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(7);
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray.skipBits(8);
                                }
                            }
                        }
                        parsableBitArray.skipBits((bits8 + 2) * 8);
                        parsableBitArray.byteAlign();
                    }
                    if (i8 < 2) {
                        if (parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(14);
                        }
                        if (bits6 == 0 && parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(14);
                        }
                    }
                    if (!parsableBitArray.readBit()) {
                        i9 = 0;
                    } else if (i6 == 0) {
                        parsableBitArray.skipBits(5);
                        i9 = 0;
                        i6 = 0;
                    } else {
                        for (int i12 = 0; i12 < i7; i12++) {
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(5);
                            }
                        }
                        i9 = 0;
                    }
                }
            }
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(5);
                if (i8 == 2) {
                    parsableBitArray.skipBits(4);
                    i8 = 2;
                }
                if (i8 >= 6) {
                    parsableBitArray.skipBits(2);
                }
                if (parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(8);
                }
                if (i8 == 0 && parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(8);
                }
                if (bits4 < 3) {
                    parsableBitArray.skipBit();
                }
            }
            if (i9 == 0 && i6 != 3) {
                parsableBitArray.skipBit();
            }
            if (i9 == 2 && (i6 == 3 || parsableBitArray.readBit())) {
                parsableBitArray.skipBits(6);
            }
            i4 = i7 * 256;
            str = (parsableBitArray.readBit() && parsableBitArray.readBits(6) == 1 && parsableBitArray.readBits(8) == 1) ? MimeTypes.AUDIO_E_AC3_JOC : MimeTypes.AUDIO_E_AC3;
            i5 = iCalculateEac3Bitrate;
        } else {
            parsableBitArray.skipBits(32);
            int bits9 = parsableBitArray.readBits(2);
            String str2 = bits9 == 3 ? null : MimeTypes.AUDIO_AC3;
            int bits10 = parsableBitArray.readBits(6);
            int i13 = BITRATE_BY_HALF_FRMSIZECOD[bits10 / 2] * 1000;
            ac3SyncframeSize = getAc3SyncframeSize(bits9, bits10);
            parsableBitArray.skipBits(8);
            int bits11 = parsableBitArray.readBits(3);
            if ((bits11 & 1) != 0 && bits11 != 1) {
                parsableBitArray.skipBits(2);
            }
            if ((bits11 & 4) != 0) {
                parsableBitArray.skipBits(2);
            }
            if (bits11 == 2) {
                parsableBitArray.skipBits(2);
            }
            int[] iArr = SAMPLE_RATE_BY_FSCOD;
            i2 = bits9 < iArr.length ? iArr[bits9] : -1;
            i3 = CHANNEL_COUNT_BY_ACMOD[bits11] + (parsableBitArray.readBit() ? 1 : 0);
            i4 = 1536;
            str = str2;
            i5 = i13;
        }
        return new SyncFrameInfo(str, i10, i3, i2, ac3SyncframeSize, i4, i5);
    }

    public static int parseAc3SyncframeSize(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b2 = bArr[4];
            return getAc3SyncframeSize((b2 & 192) >> 6, b2 & 63);
        }
        int i2 = bArr[2] & 7;
        int i3 = ((bArr[3] & 255) | (i2 << 8)) + 1;
        return i3 + i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.media3.common.Format parseEAc3AnnexFFormat(androidx.media3.common.util.ParsableByteArray r7, java.lang.String r8, java.lang.String r9, androidx.media3.common.DrmInitData r10) {
        /*
            androidx.media3.common.util.ParsableBitArray r0 = new androidx.media3.common.util.ParsableBitArray
            r0.<init>()
            r0.reset(r7)
            r1 = 13
            int r1 = r0.readBits(r1)
            int r1 = r1 * 1000
            r2 = 3
            r0.skipBits(r2)
            r3 = 2
            int r3 = r0.readBits(r3)
            int[] r4 = androidx.media3.extractor.Ac3Util.SAMPLE_RATE_BY_FSCOD
            r3 = r4[r3]
            r4 = 10
            r0.skipBits(r4)
            int[] r4 = androidx.media3.extractor.Ac3Util.CHANNEL_COUNT_BY_ACMOD
            int r5 = r0.readBits(r2)
            r4 = r4[r5]
            r5 = 1
            int r6 = r0.readBits(r5)
            if (r6 == 0) goto L33
            int r4 = r4 + 1
        L33:
            r0.skipBits(r2)
            r2 = 4
            int r2 = r0.readBits(r2)
            r0.skipBits(r5)
            if (r2 <= 0) goto L4f
            r2 = 6
            r0.skipBits(r2)
            int r2 = r0.readBits(r5)
            if (r2 == 0) goto L4c
            int r4 = r4 + 2
        L4c:
            r0.skipBits(r5)
        L4f:
            int r2 = r0.bitsLeft()
            r6 = 7
            if (r2 <= r6) goto L62
            r0.skipBits(r6)
            int r2 = r0.readBits(r5)
            if (r2 == 0) goto L62
            java.lang.String r2 = "audio/eac3-joc"
            goto L64
        L62:
            java.lang.String r2 = "audio/eac3"
        L64:
            r0.byteAlign()
            int r0 = r0.getBytePosition()
            r7.setPosition(r0)
            androidx.media3.common.Format$Builder r7 = new androidx.media3.common.Format$Builder
            r7.<init>()
            r7.setId(r8)
            r7.setSampleMimeType(r2)
            r7.setChannelCount(r4)
            r7.setSampleRate(r3)
            r7.setDrmInitData(r10)
            r7.setLanguage(r9)
            r7.setPeakBitrate(r1)
            androidx.media3.common.Format r7 = r7.build()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.Ac3Util.parseEAc3AnnexFFormat(androidx.media3.common.util.ParsableByteArray, java.lang.String, java.lang.String, androidx.media3.common.DrmInitData):androidx.media3.common.Format");
    }

    public static int parseTrueHdSyncframeAudioSampleCount(byte[] bArr) {
        if (bArr[4] != -8 || bArr[5] != 114 || bArr[6] != 111) {
            return 0;
        }
        byte b2 = bArr[7];
        if ((b2 & 254) != 186) {
            return 0;
        }
        return 40 << ((bArr[(b2 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
    }

    public static int parseTrueHdSyncframeAudioSampleCount(ByteBuffer byteBuffer, int i2) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i2) + ((byteBuffer.get((byteBuffer.position() + i2) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }
}
