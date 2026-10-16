package androidx.media3.extractor.text.ssa;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.media3.common.C;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.ssa.SsaStyle;
import com.google.d.b.an;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SsaParser implements SubtitleParser {
    public static final int CUE_REPLACEMENT_BEHAVIOR = 1;
    private static final float DEFAULT_MARGIN = 0.05f;
    private static final String DIALOGUE_LINE_PREFIX = "Dialogue:";
    static final String FORMAT_LINE_PREFIX = "Format:";
    private static final Pattern SSA_TIMECODE_PATTERN = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    static final String STYLE_LINE_PREFIX = "Style:";
    private static final String TAG = "SsaParser";
    private final SsaDialogueFormat dialogueFormatFromInitializationData;
    private final boolean haveInitializationData;
    private final ParsableByteArray parsableByteArray;
    private float screenHeight;
    private float screenWidth;
    private Map<String, SsaStyle> styles;

    public SsaParser(List<byte[]> list) {
        this.screenWidth = -3.4028235E38f;
        this.screenHeight = -3.4028235E38f;
        this.parsableByteArray = new ParsableByteArray();
        if (list == null || list.isEmpty()) {
            this.haveInitializationData = false;
            this.dialogueFormatFromInitializationData = null;
            return;
        }
        this.haveInitializationData = true;
        String strFromUtf8Bytes = Util.fromUtf8Bytes(list.get(0));
        an.l(strFromUtf8Bytes.startsWith(FORMAT_LINE_PREFIX));
        SsaDialogueFormat ssaDialogueFormatFromFormatLine = SsaDialogueFormat.fromFormatLine(strFromUtf8Bytes);
        an.B(ssaDialogueFormatFromFormatLine);
        this.dialogueFormatFromInitializationData = ssaDialogueFormatFromFormatLine;
        parseHeader(new ParsableByteArray(list.get(1)), StandardCharsets.UTF_8);
    }

    private static int addCuePlacerholderByTime(long j2, List<Long> list, List<List<Cue>> list2) {
        int i2;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                i2 = 0;
                break;
            }
            if (list.get(size).longValue() == j2) {
                return size;
            }
            if (list.get(size).longValue() < j2) {
                i2 = size + 1;
                break;
            }
        }
        list.add(i2, Long.valueOf(j2));
        list2.add(i2, i2 == 0 ? new ArrayList() : new ArrayList(list2.get(i2 - 1)));
        return i2;
    }

    private static float computeDefaultLineOrPosition(int i2) {
        if (i2 == 0) {
            return DEFAULT_MARGIN;
        }
        if (i2 != 1) {
            return i2 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static Cue createCue(String str, int i2, SsaStyle ssaStyle, SsaStyle.Overrides overrides, float f2, float f3) {
        Integer num;
        SpannableString spannableString = new SpannableString(str);
        Cue.Builder builder = new Cue.Builder();
        builder.setText(spannableString);
        builder.setZIndex(i2);
        if (ssaStyle != null) {
            Integer num2 = ssaStyle.primaryColor;
            if (num2 != null) {
                spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
            }
            if (ssaStyle.borderStyle == 3 && (num = ssaStyle.outlineColor) != null) {
                spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
            }
            float f4 = ssaStyle.fontSize;
            if (f4 != -3.4028235E38f && f3 != -3.4028235E38f) {
                builder.setTextSize(f4 / f3, 1);
            }
            boolean z = ssaStyle.bold;
            if (z && ssaStyle.italic) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (ssaStyle.italic) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (ssaStyle.underline) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (ssaStyle.strikeout) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i3 = overrides.alignment;
        if (i3 == -1) {
            i3 = ssaStyle != null ? ssaStyle.alignment : -1;
        }
        builder.setTextAlignment(toTextAlignment(i3));
        builder.setPositionAnchor(toPositionAnchor(i3));
        builder.setLineAnchor(toLineAnchor(i3));
        PointF pointF = overrides.position;
        if (pointF == null || f3 == -3.4028235E38f || f2 == -3.4028235E38f) {
            builder.setPosition(computeDefaultLineOrPosition(builder.getPositionAnchor()));
            builder.setLine(computeDefaultLineOrPosition(builder.getLineAnchor()), 0);
        } else {
            builder.setPosition(pointF.x / f2);
            builder.setLine(overrides.position.y / f3, 0);
        }
        return builder.build();
    }

    private Charset detectUtfCharset(ParsableByteArray parsableByteArray) {
        Charset utfCharsetFromBom = parsableByteArray.readUtfCharsetFromBom();
        return utfCharsetFromBom != null ? utfCharsetFromBom : StandardCharsets.UTF_8;
    }

    private void parseDialogueLine(String str, SsaDialogueFormat ssaDialogueFormat, List<List<Cue>> list, List<Long> list2) throws NumberFormatException {
        int i2;
        an.l(str.startsWith(DIALOGUE_LINE_PREFIX));
        String[] strArrSplit = str.substring(9).split(",", ssaDialogueFormat.length);
        if (strArrSplit.length != ssaDialogueFormat.length) {
            Log.w(TAG, "Skipping dialogue line with fewer columns than format: ".concat(String.valueOf(str)));
            return;
        }
        int i3 = ssaDialogueFormat.layerIndex;
        int i4 = 0;
        if (i3 != -1) {
            try {
                i4 = Integer.parseInt(strArrSplit[i3].trim());
            } catch (RuntimeException unused) {
                Log.w(TAG, "Fail to parse layer: ".concat(String.valueOf(strArrSplit[ssaDialogueFormat.layerIndex])));
            }
        }
        int i5 = i4;
        long timecodeUs = parseTimecodeUs(strArrSplit[ssaDialogueFormat.startTimeIndex]);
        if (timecodeUs == C.TIME_UNSET) {
            Log.w(TAG, "Skipping invalid timing: ".concat(String.valueOf(str)));
            return;
        }
        long timecodeUs2 = parseTimecodeUs(strArrSplit[ssaDialogueFormat.endTimeIndex]);
        if (timecodeUs2 == C.TIME_UNSET || timecodeUs2 <= timecodeUs) {
            Log.w(TAG, "Skipping invalid timing: ".concat(String.valueOf(str)));
            return;
        }
        Map<String, SsaStyle> map = this.styles;
        SsaStyle ssaStyle = null;
        if (map != null && (i2 = ssaDialogueFormat.styleIndex) != -1) {
            ssaStyle = map.get(strArrSplit[i2].trim());
        }
        String str2 = strArrSplit[ssaDialogueFormat.textIndex];
        Cue cueCreateCue = createCue(SsaStyle.Overrides.stripStyleOverrides(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), i5, ssaStyle, SsaStyle.Overrides.parseFromDialogue(str2), this.screenWidth, this.screenHeight);
        int iAddCuePlacerholderByTime = addCuePlacerholderByTime(timecodeUs2, list2, list);
        for (int iAddCuePlacerholderByTime2 = addCuePlacerholderByTime(timecodeUs, list2, list); iAddCuePlacerholderByTime2 < iAddCuePlacerholderByTime; iAddCuePlacerholderByTime2++) {
            list.get(iAddCuePlacerholderByTime2).add(cueCreateCue);
        }
    }

    private void parseEventBody(ParsableByteArray parsableByteArray, List<List<Cue>> list, List<Long> list2, Charset charset) throws NumberFormatException {
        SsaDialogueFormat ssaDialogueFormatFromFormatLine = this.haveInitializationData ? this.dialogueFormatFromInitializationData : null;
        while (true) {
            String line = parsableByteArray.readLine(charset);
            if (line == null) {
                return;
            }
            if (line.startsWith(FORMAT_LINE_PREFIX)) {
                ssaDialogueFormatFromFormatLine = SsaDialogueFormat.fromFormatLine(line);
            } else if (line.startsWith(DIALOGUE_LINE_PREFIX)) {
                if (ssaDialogueFormatFromFormatLine == null) {
                    Log.w(TAG, "Skipping dialogue line before complete format: ".concat(line));
                } else {
                    parseDialogueLine(line, ssaDialogueFormatFromFormatLine, list, list2);
                }
            }
        }
    }

    private void parseHeader(ParsableByteArray parsableByteArray, Charset charset) {
        while (true) {
            String line = parsableByteArray.readLine(charset);
            if (line == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(line)) {
                parseScriptInfo(parsableByteArray, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(line)) {
                this.styles = parseStyles(parsableByteArray, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(line)) {
                Log.i(TAG, "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(line)) {
                return;
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
    private void parseScriptInfo(ParsableByteArray parsableByteArray, Charset charset) {
        while (true) {
            String line = parsableByteArray.readLine(charset);
            if (line == null) {
                return;
            }
            if (parsableByteArray.bytesLeft() != 0 && parsableByteArray.peekCodePoint(charset) == 91) {
                return;
            }
            String[] strArrSplit = line.split(":");
            if (strArrSplit.length == 2) {
                String strK = an.K(strArrSplit[0].trim());
                switch (strK.hashCode()) {
                    case 1879649548:
                        if (!strK.equals("playresx")) {
                            break;
                        } else {
                            this.screenWidth = Float.parseFloat(strArrSplit[1].trim());
                            break;
                        }
                    case 1879649549:
                        if (!strK.equals("playresy")) {
                            break;
                        } else {
                            try {
                                this.screenHeight = Float.parseFloat(strArrSplit[1].trim());
                                break;
                            } catch (NumberFormatException unused) {
                                break;
                            }
                        }
                }
            }
        }
    }

    private static Map<String, SsaStyle> parseStyles(ParsableByteArray parsableByteArray, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SsaStyle.Format formatFromFormatLine = null;
        while (true) {
            String line = parsableByteArray.readLine(charset);
            if (line == null || (parsableByteArray.bytesLeft() != 0 && parsableByteArray.peekCodePoint(charset) == 91)) {
                break;
            }
            if (line.startsWith(FORMAT_LINE_PREFIX)) {
                formatFromFormatLine = SsaStyle.Format.fromFormatLine(line);
            } else if (line.startsWith(STYLE_LINE_PREFIX)) {
                if (formatFromFormatLine == null) {
                    Log.w(TAG, "Skipping 'Style:' line before 'Format:' line: ".concat(line));
                } else {
                    SsaStyle ssaStyleFromStyleLine = SsaStyle.fromStyleLine(line, formatFromFormatLine);
                    if (ssaStyleFromStyleLine != null) {
                        linkedHashMap.put(ssaStyleFromStyleLine.name, ssaStyleFromStyleLine);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static long parseTimecodeUs(String str) {
        Matcher matcher = SSA_TIMECODE_PATTERN.matcher(str.trim());
        if (!matcher.matches()) {
            return C.TIME_UNSET;
        }
        String strGroup = matcher.group(1);
        int i2 = Util.SDK_INT;
        long j2 = Long.parseLong(strGroup) * 3600000000L;
        long j3 = Long.parseLong(matcher.group(2)) * 60000000;
        return j2 + j3 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    private static int toLineAnchor(int i2) {
        switch (i2) {
            case -1:
                break;
            case 0:
            default:
                Log.w(TAG, "Unknown alignment: " + i2);
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
            case 5:
            case 6:
                break;
            case 7:
            case 8:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    private static int toPositionAnchor(int i2) {
        switch (i2) {
            case -1:
                break;
            case 0:
            default:
                Log.w(TAG, "Unknown alignment: " + i2);
                break;
            case 1:
            case 4:
            case 7:
                break;
            case 2:
            case 5:
            case 8:
                break;
            case 3:
            case 6:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    private static Layout.Alignment toTextAlignment(int i2) {
        switch (i2) {
            case -1:
                return null;
            case 0:
            default:
                Log.w(TAG, "Unknown alignment: " + i2);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e A[SYNTHETIC] */
    @Override // androidx.media3.extractor.text.SubtitleParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void parse(byte[] r19, int r20, int r21, androidx.media3.extractor.text.SubtitleParser.OutputOptions r22, androidx.media3.common.util.Consumer<androidx.media3.extractor.text.CuesWithTiming> r23) throws java.lang.NumberFormatException {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r22
            r3 = r23
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r6 = r1 + r21
            androidx.media3.common.util.ParsableByteArray r7 = r0.parsableByteArray
            r8 = r19
            r7.reset(r8, r6)
            androidx.media3.common.util.ParsableByteArray r6 = r0.parsableByteArray
            r6.setPosition(r1)
            boolean r1 = r0.haveInitializationData
            androidx.media3.common.util.ParsableByteArray r6 = r0.parsableByteArray
            java.nio.charset.Charset r6 = r0.detectUtfCharset(r6)
            if (r1 != 0) goto L2f
            androidx.media3.common.util.ParsableByteArray r1 = r0.parsableByteArray
            r0.parseHeader(r1, r6)
        L2f:
            androidx.media3.common.util.ParsableByteArray r1 = r0.parsableByteArray
            r0.parseEventBody(r1, r4, r5, r6)
            long r0 = r2.startTimeUs
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L49
            boolean r0 = r2.outputAllCues
            if (r0 == 0) goto L49
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L49:
            r0 = 0
            r8 = r0
        L4b:
            int r9 = r4.size()
            if (r8 >= r9) goto La4
            java.lang.Object r9 = r4.get(r8)
            r11 = r9
            java.util.List r11 = (java.util.List) r11
            boolean r9 = r11.isEmpty()
            if (r9 == 0) goto L62
            if (r8 == 0) goto L61
            goto L9b
        L61:
            r8 = r0
        L62:
            int r9 = r4.size()
            int r9 = r9 + (-1)
            if (r8 == r9) goto L9e
            java.lang.Object r9 = r5.get(r8)
            java.lang.Long r9 = (java.lang.Long) r9
            long r12 = r9.longValue()
            int r9 = r8 + 1
            java.lang.Object r9 = r5.get(r9)
            java.lang.Long r9 = (java.lang.Long) r9
            long r16 = r9.longValue()
            long r14 = r16 - r12
            androidx.media3.extractor.text.CuesWithTiming r10 = new androidx.media3.extractor.text.CuesWithTiming
            r10.<init>(r11, r12, r14)
            long r11 = r2.startTimeUs
            int r9 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r9 == 0) goto L98
            int r9 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r9 < 0) goto L92
            goto L98
        L92:
            if (r1 == 0) goto L9b
            r1.add(r10)
            goto L9b
        L98:
            r3.accept(r10)
        L9b:
            int r8 = r8 + 1
            goto L4b
        L9e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        La4:
            if (r1 == 0) goto Lb8
            int r2 = r1.size()
        Laa:
            if (r0 >= r2) goto Lb8
            java.lang.Object r4 = r1.get(r0)
            androidx.media3.extractor.text.CuesWithTiming r4 = (androidx.media3.extractor.text.CuesWithTiming) r4
            r3.accept(r4)
            int r0 = r0 + 1
            goto Laa
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.ssa.SsaParser.parse(byte[], int, int, androidx.media3.extractor.text.SubtitleParser$OutputOptions, androidx.media3.common.util.Consumer):void");
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public /* synthetic */ Subtitle parseToLegacySubtitle(byte[] bArr, int i2, int i3) {
        return SubtitleParser.CC.$default$parseToLegacySubtitle(this, bArr, i2, i3);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public /* synthetic */ void reset() {
    }

    public SsaParser() {
        this(null);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public /* synthetic */ void parse(byte[] bArr, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        parse(bArr, 0, bArr.length, outputOptions, consumer);
    }
}
