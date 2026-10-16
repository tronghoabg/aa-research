package androidx.media3.extractor.text.subrip;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.media3.common.C;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.d.b.an;
import com.google.d.d.bn;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SubripParser implements SubtitleParser {
    private static final String ALIGN_BOTTOM_LEFT = "{\\an1}";
    private static final String ALIGN_BOTTOM_MID = "{\\an2}";
    private static final String ALIGN_BOTTOM_RIGHT = "{\\an3}";
    private static final String ALIGN_MID_LEFT = "{\\an4}";
    private static final String ALIGN_MID_MID = "{\\an5}";
    private static final String ALIGN_MID_RIGHT = "{\\an6}";
    private static final String ALIGN_TOP_LEFT = "{\\an7}";
    private static final String ALIGN_TOP_MID = "{\\an8}";
    private static final String ALIGN_TOP_RIGHT = "{\\an9}";
    public static final int CUE_REPLACEMENT_BEHAVIOR = 1;
    private static final float END_FRACTION = 0.92f;
    private static final float MID_FRACTION = 0.5f;
    private static final float START_FRACTION = 0.08f;
    private static final String SUBRIP_ALIGNMENT_TAG = "\\{\\\\an[1-9]\\}";
    private static final String SUBRIP_TIMECODE = "(?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?";
    private static final String TAG = "SubripParser";
    private static final Pattern SUBRIP_TIMING_LINE = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    private static final Pattern SUBRIP_TAG_PATTERN = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder textBuilder = new StringBuilder();
    private final ArrayList<String> tags = new ArrayList<>();
    private final ParsableByteArray parsableByteArray = new ParsableByteArray();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private androidx.media3.common.text.Cue buildCue(android.text.Spanned r8, java.lang.String r9) {
        /*
            r7 = this;
            androidx.media3.common.text.Cue$Builder r7 = new androidx.media3.common.text.Cue$Builder
            r7.<init>()
            r7.setText(r8)
            if (r9 != 0) goto Lf
            androidx.media3.common.text.Cue r7 = r7.build()
            return r7
        Lf:
            int r8 = r9.hashCode()
            r0 = 2
            java.lang.String r1 = "{\\an9}"
            java.lang.String r2 = "{\\an7}"
            java.lang.String r3 = "{\\an3}"
            java.lang.String r4 = "{\\an1}"
            r5 = 1
            r6 = 0
            switch(r8) {
                case -685620710: goto L4c;
                case -685620648: goto L42;
                case -685620617: goto L39;
                case -685620555: goto L30;
                case -685620524: goto L29;
                case -685620462: goto L22;
                default: goto L21;
            }
        L21:
            goto L56
        L22:
            boolean r8 = r9.equals(r1)
            if (r8 == 0) goto L56
            goto L48
        L29:
            boolean r8 = r9.equals(r2)
            if (r8 == 0) goto L56
            goto L52
        L30:
            java.lang.String r8 = "{\\an6}"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L56
            goto L48
        L39:
            java.lang.String r8 = "{\\an4}"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L56
            goto L52
        L42:
            boolean r8 = r9.equals(r3)
            if (r8 == 0) goto L56
        L48:
            r7.setPositionAnchor(r0)
            goto L59
        L4c:
            boolean r8 = r9.equals(r4)
            if (r8 == 0) goto L56
        L52:
            r7.setPositionAnchor(r6)
            goto L59
        L56:
            r7.setPositionAnchor(r5)
        L59:
            int r8 = r9.hashCode()
            switch(r8) {
                case -685620710: goto L8b;
                case -685620679: goto L82;
                case -685620648: goto L7b;
                case -685620524: goto L71;
                case -685620493: goto L68;
                case -685620462: goto L61;
                default: goto L60;
            }
        L60:
            goto L95
        L61:
            boolean r8 = r9.equals(r1)
            if (r8 == 0) goto L95
            goto L77
        L68:
            java.lang.String r8 = "{\\an8}"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L95
            goto L77
        L71:
            boolean r8 = r9.equals(r2)
            if (r8 == 0) goto L95
        L77:
            r7.setLineAnchor(r6)
            goto L98
        L7b:
            boolean r8 = r9.equals(r3)
            if (r8 == 0) goto L95
            goto L91
        L82:
            java.lang.String r8 = "{\\an2}"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L95
            goto L91
        L8b:
            boolean r8 = r9.equals(r4)
            if (r8 == 0) goto L95
        L91:
            r7.setLineAnchor(r0)
            goto L98
        L95:
            r7.setLineAnchor(r5)
        L98:
            int r8 = r7.getPositionAnchor()
            float r8 = getFractionalPositionForAnchorType(r8)
            r7.setPosition(r8)
            int r8 = r7.getLineAnchor()
            float r8 = getFractionalPositionForAnchorType(r8)
            r7.setLine(r8, r6)
            androidx.media3.common.text.Cue r7 = r7.build()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.subrip.SubripParser.buildCue(android.text.Spanned, java.lang.String):androidx.media3.common.text.Cue");
    }

    private Charset detectUtfCharset(ParsableByteArray parsableByteArray) {
        Charset utfCharsetFromBom = parsableByteArray.readUtfCharsetFromBom();
        return utfCharsetFromBom != null ? utfCharsetFromBom : StandardCharsets.UTF_8;
    }

    public static float getFractionalPositionForAnchorType(int i2) {
        if (i2 == 0) {
            return 0.08f;
        }
        if (i2 == 1) {
            return 0.5f;
        }
        if (i2 == 2) {
            return END_FRACTION;
        }
        throw new IllegalArgumentException();
    }

    private static long parseTimecode(Matcher matcher, int i2) {
        String strGroup = matcher.group(i2 + 1);
        long j2 = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i2 + 2);
        an.B(strGroup2);
        long j3 = Long.parseLong(strGroup2) * 60000;
        String strGroup3 = matcher.group(i2 + 3);
        an.B(strGroup3);
        long j4 = Long.parseLong(strGroup3) * 1000;
        String strGroup4 = matcher.group(i2 + 4);
        long j5 = j2 + j3 + j4;
        if (strGroup4 != null) {
            j5 += Long.parseLong(strGroup4);
        }
        return j5 * 1000;
    }

    private String processLine(String str, ArrayList<String> arrayList) {
        String strTrim = str.trim();
        StringBuilder sb = new StringBuilder(strTrim);
        Matcher matcher = SUBRIP_TAG_PATTERN.matcher(strTrim);
        int i2 = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i2;
            int length = strGroup.length();
            sb.replace(iStart, iStart + length, "");
            i2 += length;
        }
        return sb.toString();
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 1;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i2, int i3, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) throws NumberFormatException {
        int i4;
        long j2;
        StringBuilder sb;
        String str;
        this.parsableByteArray.reset(bArr, i2 + i3);
        this.parsableByteArray.setPosition(i2);
        Charset charsetDetectUtfCharset = detectUtfCharset(this.parsableByteArray);
        long j3 = outputOptions.startTimeUs;
        long j4 = C.TIME_UNSET;
        ArrayList arrayList = (j3 == C.TIME_UNSET || !outputOptions.outputAllCues) ? null : new ArrayList();
        while (true) {
            String line = this.parsableByteArray.readLine(charsetDetectUtfCharset);
            i4 = 0;
            if (line == null) {
                break;
            }
            if (line.isEmpty()) {
                j2 = j4;
            } else {
                try {
                    Integer.parseInt(line);
                    String line2 = this.parsableByteArray.readLine(charsetDetectUtfCharset);
                    if (line2 == null) {
                        Log.w(TAG, "Unexpected end");
                        break;
                    }
                    Matcher matcher = SUBRIP_TIMING_LINE.matcher(line2);
                    if (matcher.matches()) {
                        long timecode = parseTimecode(matcher, 1);
                        long timecode2 = parseTimecode(matcher, 6);
                        this.textBuilder.setLength(0);
                        this.tags.clear();
                        String line3 = this.parsableByteArray.readLine(charsetDetectUtfCharset);
                        while (true) {
                            boolean zIsEmpty = TextUtils.isEmpty(line3);
                            sb = this.textBuilder;
                            if (zIsEmpty) {
                                break;
                            }
                            if (sb.length() > 0) {
                                this.textBuilder.append("<br>");
                            }
                            this.textBuilder.append(processLine(line3, this.tags));
                            line3 = this.parsableByteArray.readLine(charsetDetectUtfCharset);
                        }
                        Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                        while (true) {
                            if (i4 >= this.tags.size()) {
                                str = null;
                                break;
                            }
                            str = this.tags.get(i4);
                            if (str.matches(SUBRIP_ALIGNMENT_TAG)) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                        j2 = j4;
                        long j5 = outputOptions.startTimeUs;
                        if (j5 == j2 || timecode2 >= j5) {
                            consumer.accept(new CuesWithTiming(bn.q(buildCue(spannedFromHtml, str)), timecode, timecode2 - timecode));
                        } else if (arrayList != null) {
                            arrayList.add(new CuesWithTiming(bn.q(buildCue(spannedFromHtml, str)), timecode, timecode2 - timecode));
                        }
                    } else {
                        j2 = j4;
                        Log.w(TAG, "Skipping invalid timing: ".concat(line2));
                    }
                } catch (NumberFormatException unused) {
                    j2 = j4;
                    Log.w(TAG, "Skipping invalid index: ".concat(line));
                }
            }
            j4 = j2;
        }
        if (arrayList != null) {
            int size = arrayList.size();
            while (i4 < size) {
                consumer.accept((CuesWithTiming) arrayList.get(i4));
                i4++;
            }
        }
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public /* synthetic */ Subtitle parseToLegacySubtitle(byte[] bArr, int i2, int i3) {
        return SubtitleParser.CC.$default$parseToLegacySubtitle(this, bArr, i2, i3);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public /* synthetic */ void reset() {
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public /* synthetic */ void parse(byte[] bArr, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        parse(bArr, 0, bArr.length, outputOptions, consumer);
    }
}
