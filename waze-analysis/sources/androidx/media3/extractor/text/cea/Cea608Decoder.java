package androidx.media3.extractor.text.cea;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.core.internal.view.SupportMenu;
import androidx.media3.common.C;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleInputBuffer;
import androidx.media3.extractor.text.SubtitleOutputBuffer;
import com.google.d.b.an;
import com.waze.strings.DisplayStrings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class Cea608Decoder extends CeaDecoder {
    private static final int CC_FIELD_FLAG = 1;
    private static final byte CC_IMPLICIT_DATA_HEADER = -4;
    private static final int CC_MODE_PAINT_ON = 3;
    private static final int CC_MODE_POP_ON = 2;
    private static final int CC_MODE_ROLL_UP = 1;
    private static final int CC_MODE_UNKNOWN = 0;
    private static final int CC_TYPE_FLAG = 2;
    private static final int CC_VALID_FLAG = 4;
    private static final byte CTRL_BACKSPACE = 33;
    private static final byte CTRL_CARRIAGE_RETURN = 45;
    private static final byte CTRL_DELETE_TO_END_OF_ROW = 36;
    private static final byte CTRL_END_OF_CAPTION = 47;
    private static final byte CTRL_ERASE_DISPLAYED_MEMORY = 44;
    private static final byte CTRL_ERASE_NON_DISPLAYED_MEMORY = 46;
    private static final byte CTRL_RESUME_CAPTION_LOADING = 32;
    private static final byte CTRL_RESUME_DIRECT_CAPTIONING = 41;
    private static final byte CTRL_RESUME_TEXT_DISPLAY = 43;
    private static final byte CTRL_ROLL_UP_CAPTIONS_2_ROWS = 37;
    private static final byte CTRL_ROLL_UP_CAPTIONS_3_ROWS = 38;
    private static final byte CTRL_ROLL_UP_CAPTIONS_4_ROWS = 39;
    private static final byte CTRL_TEXT_RESTART = 42;
    private static final int DEFAULT_CAPTIONS_ROW_COUNT = 4;
    public static final long MIN_DATA_CHANNEL_TIMEOUT_MS = 16000;
    private static final int NTSC_CC_CHANNEL_1 = 0;
    private static final int NTSC_CC_CHANNEL_2 = 1;
    private static final int NTSC_CC_FIELD_1 = 0;
    private static final int NTSC_CC_FIELD_2 = 1;
    private static final int STYLE_ITALICS = 7;
    private static final int STYLE_UNCHANGED = 8;
    private static final String TAG = "Cea608Decoder";
    private int captionMode;
    private int captionRowCount;
    private List<Cue> cues;
    private boolean isCaptionValid;
    private boolean isInCaptionService;
    private long lastCueUpdateUs;
    private List<Cue> lastCues;
    private final int packetLength;
    private byte repeatableControlCc1;
    private byte repeatableControlCc2;
    private boolean repeatableControlSet;
    private final int selectedChannel;
    private final int selectedField;
    private final long validDataChannelTimeoutUs;
    private static final int[] ROW_INDICES = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] COLUMN_INDICES = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] STYLE_COLORS = {-1, -16711936, -16776961, -16711681, SupportMenu.CATEGORY_MASK, -256, -65281};
    private static final int[] BASIC_CHARACTER_SET = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_PRIVATE_1, 93, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_PRIVATE_5, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_PREFERENCES_6, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_DEFAULT_8, 241, 9632};
    private static final int[] SPECIAL_CHARACTER_SET = {174, 176, 189, DisplayStrings.DS_TRIP_OVERVIEW_LICENSE_PLATE_RESTRICTION_ALERT, 8482, 162, 163, 9834, 224, 32, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_2W_4, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_TWO_WHEELER_5, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_PRIVATE_2, 238, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_DEFAULT_1, 251};
    private static final int[] SPECIAL_ES_FR_CHARACTER_SET = {DisplayStrings.DS_TRIP_OVERVIEW_BADGE_POLICE, 201, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_2, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_9, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_11, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_5, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, DisplayStrings.DS_TRIP_OVERVIEW_BADGE_POLICE_PLURAL, DisplayStrings.DS_TRIP_OVERVIEW_BADGE_USUAL_ROUTE, 200, 202, 203, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_PRIVATE_3, 206, 207, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_PREFERENCES_2, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_3, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_8, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_2, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_10, 171, 187};
    private static final int[] SPECIAL_PT_DE_CHARACTER_SET = {DisplayStrings.DS_TRIP_OVERVIEW_BADGE_HAZARD, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_TWO_WHEELER_6, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_DEFAULT_4, 204, 236, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_1, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_PREFERENCES_5, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_4, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_DEFAULT_2, 123, 125, 92, 94, 95, 124, 126, DisplayStrings.DS_TRIP_OVERVIEW_BADGE_HAZARD_PLURAL, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_TWO_WHEELER_7, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_5, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_DEFAULT_3, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_TWO_WHEELER_2, 165, 164, 9474, DisplayStrings.DS_TRIP_OVERVIEW_BADGE_CRASH, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_2W_1, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_7, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_1, 9484, 9488, 9492, 9496};
    private static final boolean[] ODD_PARITY_BYTE_TABLE = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    private final ParsableByteArray ccData = new ParsableByteArray();
    private final ArrayList<CueBuilder> cueBuilders = new ArrayList<>();
    private CueBuilder currentCueBuilder = new CueBuilder(0, 4);
    private int currentChannel = 0;

    /* compiled from: WazeSource */
    final class CueBuilder {
        private static final int BASE_ROW = 15;
        private static final int SCREEN_CHARWIDTH = 32;
        private int captionMode;
        private int captionRowCount;
        private int indent;
        private int row;
        private int tabOffset;
        private final List<CueStyle> cueStyles = new ArrayList();
        private final List<SpannableString> rolledUpCaptions = new ArrayList();
        private final StringBuilder captionStringBuilder = new StringBuilder();

        /* compiled from: WazeSource */
        class CueStyle {
            public int start;
            public final int style;
            public final boolean underline;

            public CueStyle(int i2, boolean z, int i3) {
                this.style = i2;
                this.underline = z;
                this.start = i3;
            }
        }

        public CueBuilder(int i2, int i3) {
            reset(i2);
            this.captionRowCount = i3;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0076 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0014 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private android.text.SpannableString buildCurrentLine() {
            /*
                r15 = this;
                android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
                java.lang.StringBuilder r1 = r15.captionStringBuilder
                r0.<init>(r1)
                int r1 = r0.length()
                r2 = 0
                r3 = -1
                r4 = r2
                r7 = r4
                r9 = r7
                r5 = r3
                r6 = r5
                r8 = r6
                r10 = r8
            L14:
                java.util.List<androidx.media3.extractor.text.cea.Cea608Decoder$CueBuilder$CueStyle> r11 = r15.cueStyles
                int r11 = r11.size()
                if (r4 >= r11) goto L7c
                java.util.List<androidx.media3.extractor.text.cea.Cea608Decoder$CueBuilder$CueStyle> r11 = r15.cueStyles
                java.lang.Object r11 = r11.get(r4)
                androidx.media3.extractor.text.cea.Cea608Decoder$CueBuilder$CueStyle r11 = (androidx.media3.extractor.text.cea.Cea608Decoder.CueBuilder.CueStyle) r11
                boolean r12 = r11.underline
                int r13 = r11.style
                r14 = 8
                if (r13 == r14) goto L3b
                r9 = 7
                if (r13 != r9) goto L31
                r14 = 1
                goto L32
            L31:
                r14 = r2
            L32:
                if (r13 == r9) goto L3a
                int[] r9 = androidx.media3.extractor.text.cea.Cea608Decoder.m13175$$Nest$sfgetSTYLE_COLORS()
                r10 = r9[r13]
            L3a:
                r9 = r14
            L3b:
                int r11 = r11.start
                int r4 = r4 + 1
                java.util.List<androidx.media3.extractor.text.cea.Cea608Decoder$CueBuilder$CueStyle> r13 = r15.cueStyles
                int r13 = r13.size()
                if (r4 >= r13) goto L52
                java.util.List<androidx.media3.extractor.text.cea.Cea608Decoder$CueBuilder$CueStyle> r13 = r15.cueStyles
                java.lang.Object r13 = r13.get(r4)
                androidx.media3.extractor.text.cea.Cea608Decoder$CueBuilder$CueStyle r13 = (androidx.media3.extractor.text.cea.Cea608Decoder.CueBuilder.CueStyle) r13
                int r13 = r13.start
                goto L53
            L52:
                r13 = r1
            L53:
                if (r11 != r13) goto L56
                goto L14
            L56:
                if (r5 == r3) goto L5f
                if (r12 != 0) goto L60
                setUnderlineSpan(r0, r5, r11)
                r5 = r3
                goto L65
            L5f:
                r5 = r3
            L60:
                if (r5 != r3) goto L65
                if (r12 == 0) goto L65
                r5 = r11
            L65:
                if (r6 == r3) goto L6e
                if (r9 != 0) goto L6f
                setItalicSpan(r0, r6, r11)
                r6 = r3
                goto L74
            L6e:
                r6 = r3
            L6f:
                if (r6 != r3) goto L74
                if (r9 == 0) goto L74
                r6 = r11
            L74:
                if (r10 == r8) goto L14
                setColorSpan(r0, r7, r11, r8)
                r8 = r10
                r7 = r11
                goto L14
            L7c:
                if (r5 == r3) goto L83
                if (r5 == r1) goto L83
                setUnderlineSpan(r0, r5, r1)
            L83:
                if (r6 == r3) goto L8a
                if (r6 == r1) goto L8a
                setItalicSpan(r0, r6, r1)
            L8a:
                if (r7 == r1) goto L8f
                setColorSpan(r0, r7, r1, r8)
            L8f:
                android.text.SpannableString r15 = new android.text.SpannableString
                r15.<init>(r0)
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.cea.Cea608Decoder.CueBuilder.buildCurrentLine():android.text.SpannableString");
        }

        private static void setColorSpan(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4) {
            if (i4 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i4), i2, i3, 33);
        }

        private static void setItalicSpan(SpannableStringBuilder spannableStringBuilder, int i2, int i3) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i2, i3, 33);
        }

        private static void setUnderlineSpan(SpannableStringBuilder spannableStringBuilder, int i2, int i3) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i2, i3, 33);
        }

        public void append(char c2) {
            if (this.captionStringBuilder.length() < 32) {
                this.captionStringBuilder.append(c2);
            }
        }

        public void backspace() {
            CueStyle cueStyle;
            int i2;
            int length = this.captionStringBuilder.length();
            if (length <= 0) {
                return;
            }
            this.captionStringBuilder.delete(length - 1, length);
            int size = this.cueStyles.size();
            while (true) {
                size--;
                if (size < 0 || (i2 = (cueStyle = this.cueStyles.get(size)).start) != length) {
                    return;
                } else {
                    cueStyle.start = i2 - 1;
                }
            }
        }

        public Cue build(int i2) {
            float f2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i3 = 0; i3 < this.rolledUpCaptions.size(); i3++) {
                spannableStringBuilder.append((CharSequence) this.rolledUpCaptions.get(i3));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) buildCurrentLine());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i4 = this.indent + this.tabOffset;
            int length = (32 - i4) - spannableStringBuilder.length();
            if (i2 == Integer.MIN_VALUE) {
                int i5 = i4 - length;
                i2 = (this.captionMode != 2 || (Math.abs(i5) >= 3 && length >= 0)) ? (this.captionMode != 2 || i5 <= 0) ? 0 : 2 : 1;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    i4 = 32 - length;
                }
                f2 = ((i4 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f2 = 0.5f;
            }
            int i6 = this.row;
            if (i6 > 7) {
                i6 -= 17;
            } else if (this.captionMode == 1) {
                i6 -= this.captionRowCount - 1;
            }
            Cue.Builder builder = new Cue.Builder();
            builder.setText(spannableStringBuilder);
            builder.setTextAlignment(Layout.Alignment.ALIGN_NORMAL);
            builder.setLine(i6, 1);
            builder.setPosition(f2);
            builder.setPositionAnchor(i2);
            return builder.build();
        }

        public boolean isEmpty() {
            return this.cueStyles.isEmpty() && this.rolledUpCaptions.isEmpty() && this.captionStringBuilder.length() == 0;
        }

        public void reset(int i2) {
            this.captionMode = i2;
            this.cueStyles.clear();
            this.rolledUpCaptions.clear();
            this.captionStringBuilder.setLength(0);
            this.row = 15;
            this.indent = 0;
            this.tabOffset = 0;
        }

        public void rollUp() {
            this.rolledUpCaptions.add(buildCurrentLine());
            this.captionStringBuilder.setLength(0);
            this.cueStyles.clear();
            int iMin = Math.min(this.captionRowCount, this.row);
            while (this.rolledUpCaptions.size() >= iMin) {
                this.rolledUpCaptions.remove(0);
            }
        }

        public void setCaptionMode(int i2) {
            this.captionMode = i2;
        }

        public void setCaptionRowCount(int i2) {
            this.captionRowCount = i2;
        }

        public void setStyle(int i2, boolean z) {
            this.cueStyles.add(new CueStyle(i2, z, this.captionStringBuilder.length()));
        }
    }

    public Cea608Decoder(String str, int i2, long j2) {
        if (j2 != C.TIME_UNSET) {
            an.l(j2 >= MIN_DATA_CHANNEL_TIMEOUT_MS);
            this.validDataChannelTimeoutUs = j2 * 1000;
        } else {
            this.validDataChannelTimeoutUs = C.TIME_UNSET;
        }
        this.packetLength = true != MimeTypes.APPLICATION_MP4CEA608.equals(str) ? 3 : 2;
        if (i2 == 1) {
            this.selectedChannel = 0;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    this.selectedChannel = 0;
                } else {
                    if (i2 != 4) {
                        Log.w(TAG, "Invalid channel. Defaulting to CC1.");
                        this.selectedChannel = 0;
                        this.selectedField = 0;
                        setCaptionMode(0);
                        resetCueBuilders();
                        this.isInCaptionService = true;
                        this.lastCueUpdateUs = C.TIME_UNSET;
                    }
                    this.selectedChannel = 1;
                }
                this.selectedField = 1;
                setCaptionMode(0);
                resetCueBuilders();
                this.isInCaptionService = true;
                this.lastCueUpdateUs = C.TIME_UNSET;
            }
            this.selectedChannel = 1;
        }
        this.selectedField = 0;
        setCaptionMode(0);
        resetCueBuilders();
        this.isInCaptionService = true;
        this.lastCueUpdateUs = C.TIME_UNSET;
    }

    private static char getBasicChar(byte b2) {
        return (char) BASIC_CHARACTER_SET[(b2 & 127) - 32];
    }

    private static int getChannel(byte b2) {
        return (b2 >> 3) & 1;
    }

    private List<Cue> getDisplayCues() {
        int size = this.cueBuilders.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i2 = 0; i2 < size; i2++) {
            Cue cueBuild = this.cueBuilders.get(i2).build(Integer.MIN_VALUE);
            arrayList.add(cueBuild);
            if (cueBuild != null) {
                iMin = Math.min(iMin, cueBuild.positionAnchor);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            Cue cueBuild2 = (Cue) arrayList.get(i3);
            if (cueBuild2 != null) {
                if (cueBuild2.positionAnchor != iMin) {
                    cueBuild2 = this.cueBuilders.get(i3).build(iMin);
                    an.B(cueBuild2);
                }
                arrayList2.add(cueBuild2);
            }
        }
        return arrayList2;
    }

    private static char getExtendedEsFrChar(byte b2) {
        return (char) SPECIAL_ES_FR_CHARACTER_SET[b2 & StylePropertiesKt.ClipId];
    }

    private static char getExtendedPtDeChar(byte b2) {
        return (char) SPECIAL_PT_DE_CHARACTER_SET[b2 & StylePropertiesKt.ClipId];
    }

    private static char getExtendedWestEuropeanChar(byte b2, byte b3) {
        return (b2 & 1) == 0 ? getExtendedEsFrChar(b3) : getExtendedPtDeChar(b3);
    }

    private static char getSpecialNorthAmericanChar(byte b2) {
        return (char) SPECIAL_CHARACTER_SET[b2 & StylePropertiesKt.RightId];
    }

    private void handleMidrowCtrl(byte b2) {
        this.currentCueBuilder.append(' ');
        this.currentCueBuilder.setStyle((b2 >> 1) & 7, 1 == (b2 & 1));
    }

    private void handleMiscCode(byte b2) {
        if (b2 == 32) {
            setCaptionMode(2);
            return;
        }
        if (b2 == 41) {
            setCaptionMode(3);
            return;
        }
        switch (b2) {
            case 37:
                setCaptionMode(1);
                setCaptionRowCount(2);
                break;
            case 38:
                setCaptionMode(1);
                setCaptionRowCount(3);
                break;
            case 39:
                setCaptionMode(1);
                setCaptionRowCount(4);
                break;
            default:
                int i2 = this.captionMode;
                if (i2 != 0) {
                    if (b2 == 33) {
                        this.currentCueBuilder.backspace();
                        break;
                    } else {
                        switch (b2) {
                            case 44:
                                this.cues = Collections.EMPTY_LIST;
                                int i3 = this.captionMode;
                                if (i3 == 1 || i3 == 3) {
                                    resetCueBuilders();
                                    break;
                                }
                            case 45:
                                if (i2 == 1 && !this.currentCueBuilder.isEmpty()) {
                                    this.currentCueBuilder.rollUp();
                                    break;
                                }
                                break;
                            case 46:
                                resetCueBuilders();
                                break;
                            case 47:
                                this.cues = getDisplayCues();
                                resetCueBuilders();
                                break;
                        }
                    }
                }
                break;
        }
    }

    private void handlePreambleAddressCode(byte b2, byte b3) {
        int i2 = ROW_INDICES[b2 & 7];
        if ((b3 & 32) != 0) {
            i2++;
        }
        if (i2 != this.currentCueBuilder.row) {
            if (this.captionMode != 1 && !this.currentCueBuilder.isEmpty()) {
                CueBuilder cueBuilder = new CueBuilder(this.captionMode, this.captionRowCount);
                this.currentCueBuilder = cueBuilder;
                this.cueBuilders.add(cueBuilder);
            }
            this.currentCueBuilder.row = i2;
        }
        int i3 = b3 & StylePropertiesKt.BottomId;
        int i4 = b3 & 1;
        int i5 = (b3 >> 1) & 7;
        this.currentCueBuilder.setStyle(i3 == 16 ? 8 : i5, 1 == i4);
        if (i3 == 16) {
            this.currentCueBuilder.indent = COLUMN_INDICES[i5];
        }
    }

    private static boolean isCtrlCode(byte b2) {
        return (b2 & 224) == 0;
    }

    private static boolean isExtendedWestEuropeanChar(byte b2, byte b3) {
        return (b2 & 246) == 18 && (b3 & 224) == 32;
    }

    private static boolean isMidrowCtrlCode(byte b2, byte b3) {
        return (b2 & 247) == 17 && (b3 & 240) == 32;
    }

    private static boolean isMiscCode(byte b2, byte b3) {
        return (b2 & 246) == 20 && (b3 & 240) == 32;
    }

    private static boolean isPreambleAddressCode(byte b2, byte b3) {
        return (b2 & 240) == 16 && (b3 & 192) == 64;
    }

    private static boolean isRepeatable(byte b2) {
        return (b2 & 240) == 16;
    }

    private boolean isRepeatedCommand(boolean z, byte b2, byte b3) {
        if (!z || !isRepeatable(b2)) {
            this.repeatableControlSet = false;
        } else {
            if (this.repeatableControlSet && this.repeatableControlCc1 == b2 && this.repeatableControlCc2 == b3) {
                this.repeatableControlSet = false;
                return true;
            }
            this.repeatableControlSet = true;
            this.repeatableControlCc1 = b2;
            this.repeatableControlCc2 = b3;
        }
        return false;
    }

    private static boolean isServiceSwitchCommand(byte b2) {
        return (b2 & 246) == 20;
    }

    private static boolean isSpecialNorthAmericanChar(byte b2, byte b3) {
        return (b2 & 247) == 17 && (b3 & 240) == 48;
    }

    private static boolean isTabCtrlCode(byte b2, byte b3) {
        return (b2 & 247) == 23 && b3 >= 33 && b3 <= 35;
    }

    private static boolean isXdsControlCode(byte b2) {
        return b2 > 0 && b2 <= 15;
    }

    private void maybeUpdateIsInCaptionService(byte b2, byte b3) {
        if (isXdsControlCode(b2)) {
            this.isInCaptionService = false;
            return;
        }
        if (isServiceSwitchCommand(b2)) {
            if (b3 != 32 && b3 != 47) {
                switch (b3) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b3) {
                            case 42:
                            case 43:
                                this.isInCaptionService = false;
                                break;
                        }
                        return;
                }
            }
            this.isInCaptionService = true;
        }
    }

    private void resetCueBuilders() {
        this.currentCueBuilder.reset(this.captionMode);
        this.cueBuilders.clear();
        this.cueBuilders.add(this.currentCueBuilder);
    }

    private void setCaptionMode(int i2) {
        int i3 = this.captionMode;
        if (i3 == i2) {
            return;
        }
        this.captionMode = i2;
        if (i2 == 3) {
            for (int i4 = 0; i4 < this.cueBuilders.size(); i4++) {
                this.cueBuilders.get(i4).setCaptionMode(3);
            }
            return;
        }
        resetCueBuilders();
        if (i3 == 3 || i2 == 1 || i2 == 0) {
            this.cues = Collections.EMPTY_LIST;
        }
    }

    private void setCaptionRowCount(int i2) {
        this.captionRowCount = i2;
        this.currentCueBuilder.setCaptionRowCount(i2);
    }

    private boolean shouldClearStuckCaptions() {
        long j2 = this.validDataChannelTimeoutUs;
        if (j2 != C.TIME_UNSET) {
            long j3 = this.lastCueUpdateUs;
            if (j3 != C.TIME_UNSET && getPositionUs() - j3 >= j2) {
                return true;
            }
        }
        return false;
    }

    private boolean updateAndVerifyCurrentChannel(byte b2) {
        if (isCtrlCode(b2)) {
            this.currentChannel = getChannel(b2);
        }
        return this.currentChannel == this.selectedChannel;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    protected Subtitle createSubtitle() {
        List<Cue> list = this.cues;
        this.lastCues = list;
        an.B(list);
        return new CeaSubtitle(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void decode(androidx.media3.extractor.text.SubtitleInputBuffer r10) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.cea.Cea608Decoder.decode(androidx.media3.extractor.text.SubtitleInputBuffer):void");
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    public /* bridge */ /* synthetic */ SubtitleInputBuffer dequeueInputBuffer() {
        return super.dequeueInputBuffer();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    public SubtitleOutputBuffer dequeueOutputBuffer() {
        SubtitleOutputBuffer availableOutputBuffer;
        SubtitleOutputBuffer subtitleOutputBufferDequeueOutputBuffer = super.dequeueOutputBuffer();
        if (subtitleOutputBufferDequeueOutputBuffer != null) {
            return subtitleOutputBufferDequeueOutputBuffer;
        }
        if (!shouldClearStuckCaptions() || (availableOutputBuffer = getAvailableOutputBuffer()) == null) {
            return null;
        }
        this.cues = Collections.EMPTY_LIST;
        this.lastCueUpdateUs = C.TIME_UNSET;
        availableOutputBuffer.setContent(getPositionUs(), createSubtitle(), Long.MAX_VALUE);
        return availableOutputBuffer;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    public void flush() {
        super.flush();
        this.cues = null;
        this.lastCues = null;
        setCaptionMode(0);
        setCaptionRowCount(4);
        resetCueBuilders();
        this.isCaptionValid = false;
        this.repeatableControlSet = false;
        this.repeatableControlCc1 = (byte) 0;
        this.repeatableControlCc2 = (byte) 0;
        this.currentChannel = 0;
        this.isInCaptionService = true;
        this.lastCueUpdateUs = C.TIME_UNSET;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    public String getName() {
        return TAG;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    protected boolean isNewSubtitleDataAvailable() {
        return this.cues != this.lastCues;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    public /* bridge */ /* synthetic */ void queueInputBuffer(SubtitleInputBuffer subtitleInputBuffer) {
        super.queueInputBuffer(subtitleInputBuffer);
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    public void release() {
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.extractor.text.SubtitleDecoder
    public /* bridge */ /* synthetic */ void setPositionUs(long j2) {
        super.setPositionUs(j2);
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    public /* bridge */ /* synthetic */ SubtitleOutputBuffer dequeueOutputBuffer() {
        return dequeueOutputBuffer();
    }
}
