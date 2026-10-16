package androidx.media3.extractor.text.webvtt;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.HorizontalTextInVerticalContextSpan;
import androidx.media3.common.text.RubySpan;
import androidx.media3.common.text.SpanUtil;
import androidx.media3.common.text.VoiceSpan;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.media3.extractor.text.webvtt.WebvttCueParser;
import com.google.d.b.an;
import j$.util.DesugarCollections;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class WebvttCueParser {
    private static final char CHAR_AMPERSAND = '&';
    private static final char CHAR_GREATER_THAN = '>';
    private static final char CHAR_LESS_THAN = '<';
    private static final char CHAR_SEMI_COLON = ';';
    private static final char CHAR_SLASH = '/';
    private static final char CHAR_SPACE = ' ';
    public static final Pattern CUE_HEADER_PATTERN = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");
    private static final Pattern CUE_SETTING_PATTERN = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map<String, Integer> DEFAULT_BACKGROUND_COLORS;
    static final float DEFAULT_POSITION = 0.5f;
    private static final Map<String, Integer> DEFAULT_TEXT_COLORS;
    private static final String ENTITY_AMPERSAND = "amp";
    private static final String ENTITY_GREATER_THAN = "gt";
    private static final String ENTITY_LESS_THAN = "lt";
    private static final String ENTITY_NON_BREAK_SPACE = "nbsp";
    private static final int STYLE_BOLD = 1;
    private static final int STYLE_ITALIC = 2;
    private static final String TAG = "WebvttCueParser";
    private static final String TAG_BOLD = "b";
    private static final String TAG_CLASS = "c";
    private static final String TAG_ITALIC = "i";
    private static final String TAG_LANG = "lang";
    private static final String TAG_RUBY = "ruby";
    private static final String TAG_RUBY_TEXT = "rt";
    private static final String TAG_UNDERLINE = "u";
    private static final String TAG_VOICE = "v";
    private static final int TEXT_ALIGNMENT_CENTER = 2;
    private static final int TEXT_ALIGNMENT_END = 3;
    private static final int TEXT_ALIGNMENT_LEFT = 4;
    private static final int TEXT_ALIGNMENT_RIGHT = 5;
    private static final int TEXT_ALIGNMENT_START = 1;

    /* compiled from: WazeSource */
    class Element {
        private static final Comparator<Element> BY_START_POSITION_ASC = new Comparator() { // from class: androidx.media3.extractor.text.webvtt.WebvttCueParser$Element$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((WebvttCueParser.Element) obj).startTag.position, ((WebvttCueParser.Element) obj2).startTag.position);
            }
        };
        private final int endPosition;
        private final StartTag startTag;

        private Element(StartTag startTag, int i2) {
            this.startTag = startTag;
            this.endPosition = i2;
        }
    }

    /* compiled from: WazeSource */
    final class StartTag {
        public final Set<String> classes;
        public final String name;
        public final int position;
        public final String voice;

        private StartTag(String str, int i2, String str2, Set<String> set) {
            this.position = i2;
            this.name = str;
            this.voice = str2;
            this.classes = set;
        }

        public static StartTag buildStartTag(String str, int i2) {
            String str2;
            String strTrim = str.trim();
            an.l(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrSplit = Util.split(strTrim, "\\.");
            String str3 = strArrSplit[0];
            HashSet hashSet = new HashSet();
            for (int i3 = 1; i3 < strArrSplit.length; i3++) {
                hashSet.add(strArrSplit[i3]);
            }
            return new StartTag(str3, i2, str2, hashSet);
        }

        public static StartTag buildWholeCueVirtualTag() {
            return new StartTag("", 0, "", Collections.EMPTY_SET);
        }
    }

    /* compiled from: WazeSource */
    final class StyleMatch implements Comparable<StyleMatch> {
        public final int score;
        public final WebvttCssStyle style;

        public StyleMatch(int i2, WebvttCssStyle webvttCssStyle) {
            this.score = i2;
            this.style = webvttCssStyle;
        }

        @Override // java.lang.Comparable
        public int compareTo(StyleMatch styleMatch) {
            return Integer.compare(this.score, styleMatch.score);
        }
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @interface TextAlignment {
    }

    /* compiled from: WazeSource */
    final class WebvttCueInfoBuilder {
        public CharSequence text;
        public long startTimeUs = 0;
        public long endTimeUs = 0;
        public int textAlignment = 2;
        public float line = -3.4028235E38f;
        public int lineType = 1;
        public int lineAnchor = 0;
        public float position = -3.4028235E38f;
        public int positionAnchor = Integer.MIN_VALUE;
        public float size = 1.0f;
        public int verticalType = Integer.MIN_VALUE;

        private static float computeLine(float f2, int i2) {
            if (f2 != -3.4028235E38f && i2 == 0) {
                if (f2 < 0.0f || f2 > 1.0f) {
                    return 1.0f;
                }
                i2 = 0;
            }
            return f2 != -3.4028235E38f ? f2 : i2 == 0 ? 1.0f : -3.4028235E38f;
        }

        private static Layout.Alignment convertTextAlignment(int i2) {
            if (i2 != 1) {
                if (i2 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            Log.w(WebvttCueParser.TAG, "Unknown textAlignment: " + i2);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        private static float deriveMaxSize(int i2, float f2) {
            if (i2 == 0) {
                return 1.0f - f2;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    return f2;
                }
                throw new IllegalStateException(String.valueOf(i2));
            }
            if (f2 <= 0.5f) {
                return f2 + f2;
            }
            float f3 = 1.0f - f2;
            return f3 + f3;
        }

        private static float derivePosition(int i2) {
            if (i2 != 4) {
                return i2 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        private static int derivePositionAnchor(int i2) {
            if (i2 == 1) {
                return 0;
            }
            if (i2 == 3) {
                return 2;
            }
            if (i2 != 4) {
                return i2 != 5 ? 1 : 2;
            }
            return 0;
        }

        public WebvttCueInfo build() {
            return new WebvttCueInfo(toCueBuilder().build(), this.startTimeUs, this.endTimeUs);
        }

        public Cue.Builder toCueBuilder() {
            float fDerivePosition = this.position;
            if (fDerivePosition == -3.4028235E38f) {
                fDerivePosition = derivePosition(this.textAlignment);
            }
            int iDerivePositionAnchor = this.positionAnchor;
            if (iDerivePositionAnchor == Integer.MIN_VALUE) {
                iDerivePositionAnchor = derivePositionAnchor(this.textAlignment);
            }
            Cue.Builder builder = new Cue.Builder();
            builder.setTextAlignment(convertTextAlignment(this.textAlignment));
            float f2 = this.line;
            int i2 = this.lineType;
            builder.setLine(computeLine(f2, i2), i2);
            builder.setLineAnchor(this.lineAnchor);
            builder.setPosition(fDerivePosition);
            builder.setPositionAnchor(iDerivePositionAnchor);
            builder.setSize(Math.min(this.size, deriveMaxSize(iDerivePositionAnchor, fDerivePosition)));
            builder.setVerticalType(this.verticalType);
            CharSequence charSequence = this.text;
            if (charSequence != null) {
                builder.setText(charSequence);
            }
            return builder;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        DEFAULT_TEXT_COLORS = DesugarCollections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        DEFAULT_BACKGROUND_COLORS = DesugarCollections.unmodifiableMap(map2);
    }

    private static void applyDefaultColors(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i2, int i3) {
        for (String str : set) {
            Map<String, Integer> map = DEFAULT_TEXT_COLORS;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str).intValue()), i2, i3, 33);
            } else {
                Map<String, Integer> map2 = DEFAULT_BACKGROUND_COLORS;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str).intValue()), i2, i3, 33);
                }
            }
        }
    }

    private static void applyEntity(String str, SpannableStringBuilder spannableStringBuilder) {
        int iHashCode = str.hashCode();
        if (iHashCode != 3309) {
            if (iHashCode != 3464) {
                if (iHashCode != 96708) {
                    if (iHashCode == 3374865 && str.equals(ENTITY_NON_BREAK_SPACE)) {
                        spannableStringBuilder.append(CHAR_SPACE);
                        return;
                    }
                } else if (str.equals(ENTITY_AMPERSAND)) {
                    spannableStringBuilder.append(CHAR_AMPERSAND);
                    return;
                }
            } else if (str.equals(ENTITY_LESS_THAN)) {
                spannableStringBuilder.append(CHAR_LESS_THAN);
                return;
            }
        } else if (str.equals(ENTITY_GREATER_THAN)) {
            spannableStringBuilder.append(CHAR_GREATER_THAN);
            return;
        }
        Log.w(TAG, "ignoring unsupported entity: '&" + str + ";'");
    }

    private static void applyRubySpans(SpannableStringBuilder spannableStringBuilder, String str, StartTag startTag, List<Element> list, List<WebvttCssStyle> list2) {
        int rubyPosition = getRubyPosition(list2, str, startTag);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, Element.BY_START_POSITION_ASC);
        int i2 = startTag.position;
        int length = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (TAG_RUBY_TEXT.equals(((Element) arrayList.get(i3)).startTag.name)) {
                Element element = (Element) arrayList.get(i3);
                int iFirstKnownRubyPosition = firstKnownRubyPosition(getRubyPosition(list2, str, element.startTag), rubyPosition, 1);
                int i4 = element.startTag.position - length;
                int i5 = element.endPosition - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i4, i5);
                spannableStringBuilder.delete(i4, i5);
                spannableStringBuilder.setSpan(new RubySpan(charSequenceSubSequence.toString(), iFirstKnownRubyPosition), i2, i4, 33);
                length += charSequenceSubSequence.length();
                i2 = i4;
            }
        }
    }

    private static void applySpansForTag(String str, StartTag startTag, List<Element> list, SpannableStringBuilder spannableStringBuilder, List<WebvttCssStyle> list2) {
        int i2 = startTag.position;
        int length = spannableStringBuilder.length();
        String str2 = startTag.name;
        int iHashCode = str2.hashCode();
        if (iHashCode != 0) {
            if (iHashCode != 105) {
                if (iHashCode != 3314158) {
                    if (iHashCode != 3511770) {
                        if (iHashCode != 98) {
                            if (iHashCode != 99) {
                                if (iHashCode != 117) {
                                    if (iHashCode != 118 || !str2.equals("v")) {
                                        return;
                                    } else {
                                        applyVoiceSpan(spannableStringBuilder, startTag.voice, i2, length);
                                    }
                                } else if (!str2.equals(TAG_UNDERLINE)) {
                                    return;
                                } else {
                                    spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
                                }
                            } else if (!str2.equals(TAG_CLASS)) {
                                return;
                            } else {
                                applyDefaultColors(spannableStringBuilder, startTag.classes, i2, length);
                            }
                        } else if (!str2.equals(TAG_BOLD)) {
                            return;
                        } else {
                            spannableStringBuilder.setSpan(new StyleSpan(1), i2, length, 33);
                        }
                    } else if (!str2.equals("ruby")) {
                        return;
                    } else {
                        applyRubySpans(spannableStringBuilder, str, startTag, list, list2);
                    }
                } else if (!str2.equals(TAG_LANG)) {
                    return;
                }
            } else if (!str2.equals("i")) {
                return;
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
            }
        } else if (!str2.equals("")) {
            return;
        }
        List<StyleMatch> applicableStyles = getApplicableStyles(list2, str, startTag);
        for (int i3 = 0; i3 < applicableStyles.size(); i3++) {
            applyStyleToText(spannableStringBuilder, applicableStyles.get(i3).style, i2, length);
        }
    }

    private static void applyStyleToText(SpannableStringBuilder spannableStringBuilder, WebvttCssStyle webvttCssStyle, int i2, int i3) {
        if (webvttCssStyle == null) {
            return;
        }
        if (webvttCssStyle.getStyle() != -1) {
            SpanUtil.addOrReplaceSpan(spannableStringBuilder, new StyleSpan(webvttCssStyle.getStyle()), i2, i3, 33);
        }
        if (webvttCssStyle.isLinethrough()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i2, i3, 33);
        }
        if (webvttCssStyle.isUnderline()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i2, i3, 33);
        }
        if (webvttCssStyle.hasFontColor()) {
            SpanUtil.addOrReplaceSpan(spannableStringBuilder, new ForegroundColorSpan(webvttCssStyle.getFontColor()), i2, i3, 33);
        }
        if (webvttCssStyle.hasBackgroundColor()) {
            SpanUtil.addOrReplaceSpan(spannableStringBuilder, new BackgroundColorSpan(webvttCssStyle.getBackgroundColor()), i2, i3, 33);
        }
        if (webvttCssStyle.getFontFamily() != null) {
            SpanUtil.addOrReplaceSpan(spannableStringBuilder, new TypefaceSpan(webvttCssStyle.getFontFamily()), i2, i3, 33);
        }
        int fontSizeUnit = webvttCssStyle.getFontSizeUnit();
        if (fontSizeUnit == 1) {
            SpanUtil.addOrReplaceSpan(spannableStringBuilder, new AbsoluteSizeSpan((int) webvttCssStyle.getFontSize(), true), i2, i3, 33);
        } else if (fontSizeUnit == 2) {
            SpanUtil.addOrReplaceSpan(spannableStringBuilder, new RelativeSizeSpan(webvttCssStyle.getFontSize()), i2, i3, 33);
        } else if (fontSizeUnit == 3) {
            SpanUtil.addOrReplaceSpan(spannableStringBuilder, new RelativeSizeSpan(webvttCssStyle.getFontSize() / 100.0f), i2, i3, 33);
        }
        if (webvttCssStyle.getCombineUpright()) {
            spannableStringBuilder.setSpan(new HorizontalTextInVerticalContextSpan(), i2, i3, 33);
        }
    }

    private static void applyVoiceSpan(SpannableStringBuilder spannableStringBuilder, String str, int i2, int i3) {
        spannableStringBuilder.setSpan(new VoiceSpan(str), i2, i3, 33);
    }

    private static int findEndOfTag(String str, int i2) {
        int iIndexOf = str.indexOf(62, i2);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    private static int firstKnownRubyPosition(int i2, int i3, int i4) {
        if (i2 != -1) {
            return i2;
        }
        if (i3 != -1) {
            return i3;
        }
        if (i4 != -1) {
            return i4;
        }
        throw new IllegalArgumentException();
    }

    private static List<StyleMatch> getApplicableStyles(List<WebvttCssStyle> list, String str, StartTag startTag) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            WebvttCssStyle webvttCssStyle = list.get(i2);
            int specificityScore = webvttCssStyle.getSpecificityScore(str, startTag.name, startTag.classes, startTag.voice);
            if (specificityScore > 0) {
                arrayList.add(new StyleMatch(specificityScore, webvttCssStyle));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static int getRubyPosition(List<WebvttCssStyle> list, String str, StartTag startTag) {
        List<StyleMatch> applicableStyles = getApplicableStyles(list, str, startTag);
        for (int i2 = 0; i2 < applicableStyles.size(); i2++) {
            WebvttCssStyle webvttCssStyle = applicableStyles.get(i2).style;
            if (webvttCssStyle.getRubyPosition() != -1) {
                return webvttCssStyle.getRubyPosition();
            }
        }
        return -1;
    }

    private static String getTagName(String str) {
        String strTrim = str.trim();
        an.l(!strTrim.isEmpty());
        return Util.splitAtFirst(strTrim, "[ \\.]")[0];
    }

    private static boolean isSupportedTag(String str) {
        int iHashCode = str.hashCode();
        return iHashCode != 98 ? iHashCode != 99 ? iHashCode != 105 ? iHashCode != 3650 ? iHashCode != 3314158 ? iHashCode != 3511770 ? iHashCode != 117 ? iHashCode == 118 && str.equals("v") : str.equals(TAG_UNDERLINE) : str.equals("ruby") : str.equals(TAG_LANG) : str.equals(TAG_RUBY_TEXT) : str.equals("i") : str.equals(TAG_CLASS) : str.equals(TAG_BOLD);
    }

    public static Cue newCueForText(CharSequence charSequence) {
        WebvttCueInfoBuilder webvttCueInfoBuilder = new WebvttCueInfoBuilder();
        webvttCueInfoBuilder.text = charSequence;
        return webvttCueInfoBuilder.toCueBuilder().build();
    }

    private static WebvttCueInfo parseCue(String str, Matcher matcher, ParsableByteArray parsableByteArray, List<WebvttCssStyle> list) {
        WebvttCueInfoBuilder webvttCueInfoBuilder = new WebvttCueInfoBuilder();
        try {
            String strGroup = matcher.group(1);
            an.B(strGroup);
            String str2 = strGroup;
            webvttCueInfoBuilder.startTimeUs = WebvttParserUtil.parseTimestampUs(strGroup);
            String strGroup2 = matcher.group(2);
            an.B(strGroup2);
            String str3 = strGroup2;
            webvttCueInfoBuilder.endTimeUs = WebvttParserUtil.parseTimestampUs(strGroup2);
            String strGroup3 = matcher.group(3);
            an.B(strGroup3);
            parseCueSettingsList(strGroup3, webvttCueInfoBuilder);
            StringBuilder sb = new StringBuilder();
            String line = parsableByteArray.readLine();
            while (!TextUtils.isEmpty(line)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(line.trim());
                line = parsableByteArray.readLine();
            }
            webvttCueInfoBuilder.text = parseCueText(str, sb.toString(), list);
            return webvttCueInfoBuilder.build();
        } catch (IllegalArgumentException unused) {
            Log.w(TAG, "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    private static void parseCueSettingsList(String str, WebvttCueInfoBuilder webvttCueInfoBuilder) {
        Matcher matcher = CUE_SETTING_PATTERN.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            an.B(strGroup);
            String strGroup2 = matcher.group(2);
            an.B(strGroup2);
            try {
                if ("line".equals(strGroup)) {
                    parseLineAttribute(strGroup2, webvttCueInfoBuilder);
                } else if ("align".equals(strGroup)) {
                    webvttCueInfoBuilder.textAlignment = parseTextAlignment(strGroup2);
                } else if ("position".equals(strGroup)) {
                    parsePositionAttribute(strGroup2, webvttCueInfoBuilder);
                } else if ("size".equals(strGroup)) {
                    webvttCueInfoBuilder.size = WebvttParserUtil.parsePercentage(strGroup2);
                } else if ("vertical".equals(strGroup)) {
                    webvttCueInfoBuilder.verticalType = parseVerticalAttribute(strGroup2);
                } else {
                    Log.w(TAG, "Unknown cue setting " + strGroup + ":" + strGroup2);
                }
            } catch (NumberFormatException unused) {
                Log.w(TAG, "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }

    static SpannedString parseCueText(String str, String str2, List<WebvttCssStyle> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < str2.length()) {
            int iFindEndOfTag = i2 + 1;
            char cCharAt = str2.charAt(i2);
            if (cCharAt == '&') {
                int iIndexOf = str2.indexOf(59, iFindEndOfTag);
                int iIndexOf2 = str2.indexOf(32, iFindEndOfTag);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    applyEntity(str2.substring(iFindEndOfTag, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i2 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
            } else if (iFindEndOfTag < str2.length()) {
                char cCharAt2 = str2.charAt(iFindEndOfTag);
                iFindEndOfTag = findEndOfTag(str2, iFindEndOfTag);
                int i3 = iFindEndOfTag - 2;
                boolean z = str2.charAt(i3) == '/';
                int i4 = i2 + (cCharAt2 == '/' ? 2 : 1);
                if (!z) {
                    i3 = iFindEndOfTag - 1;
                }
                String strSubstring = str2.substring(i4, i3);
                if (!strSubstring.trim().isEmpty()) {
                    String tagName = getTagName(strSubstring);
                    if (isSupportedTag(tagName)) {
                        if (cCharAt2 == '/') {
                            while (!arrayDeque.isEmpty()) {
                                StartTag startTag = (StartTag) arrayDeque.pop();
                                applySpansForTag(str, startTag, arrayList, spannableStringBuilder, list);
                                if (arrayDeque.isEmpty()) {
                                    arrayList.clear();
                                } else {
                                    arrayList.add(new Element(startTag, spannableStringBuilder.length()));
                                }
                                if (startTag.name.equals(tagName)) {
                                    break;
                                }
                            }
                        } else if (!z) {
                            arrayDeque.push(StartTag.buildStartTag(strSubstring, spannableStringBuilder.length()));
                        }
                    }
                }
            }
            i2 = iFindEndOfTag;
        }
        while (!arrayDeque.isEmpty()) {
            applySpansForTag(str, (StartTag) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        applySpansForTag(str, StartTag.buildWholeCueVirtualTag(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int parseLineAnchor(String str) {
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals(TtmlNode.CENTER)) {
                    return 1;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    return 1;
                }
                break;
            case 100571:
                if (str.equals(TtmlNode.END)) {
                    return 2;
                }
                break;
            case 109757538:
                if (str.equals(TtmlNode.START)) {
                    return 0;
                }
                break;
        }
        Log.w(TAG, "Invalid anchor value: ".concat(String.valueOf(str)));
        return Integer.MIN_VALUE;
    }

    private static void parseLineAttribute(String str, WebvttCueInfoBuilder webvttCueInfoBuilder) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            webvttCueInfoBuilder.lineAnchor = parseLineAnchor(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            webvttCueInfoBuilder.line = WebvttParserUtil.parsePercentage(str);
            webvttCueInfoBuilder.lineType = 0;
        } else {
            webvttCueInfoBuilder.line = Integer.parseInt(str);
            webvttCueInfoBuilder.lineType = 1;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int parsePositionAnchor(String str) {
        switch (str.hashCode()) {
            case -1842484672:
                if (str.equals("line-left")) {
                    return 0;
                }
                break;
            case -1364013995:
                if (str.equals(TtmlNode.CENTER)) {
                    return 1;
                }
                break;
            case -1276788989:
                if (str.equals("line-right")) {
                    return 2;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    return 1;
                }
                break;
            case 100571:
                if (str.equals(TtmlNode.END)) {
                    return 2;
                }
                break;
            case 109757538:
                if (str.equals(TtmlNode.START)) {
                    return 0;
                }
                break;
        }
        Log.w(TAG, "Invalid anchor value: ".concat(String.valueOf(str)));
        return Integer.MIN_VALUE;
    }

    private static void parsePositionAttribute(String str, WebvttCueInfoBuilder webvttCueInfoBuilder) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            webvttCueInfoBuilder.positionAnchor = parsePositionAnchor(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        webvttCueInfoBuilder.position = WebvttParserUtil.parsePercentage(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0037, code lost:
    
        if (r3.equals("middle") != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
    
        if (r3.equals(androidx.media3.extractor.text.ttml.TtmlNode.CENTER) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0042, code lost:
    
        return 2;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int parseTextAlignment(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r1 = 2
            switch(r0) {
                case -1364013995: goto L3a;
                case -1074341483: goto L31;
                case 100571: goto L27;
                case 3317767: goto L1d;
                case 108511772: goto L13;
                case 109757538: goto L9;
                default: goto L8;
            }
        L8:
            goto L43
        L9:
            java.lang.String r0 = "start"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L43
            r3 = 1
            return r3
        L13:
            java.lang.String r0 = "right"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L43
            r3 = 5
            return r3
        L1d:
            java.lang.String r0 = "left"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L43
            r3 = 4
            return r3
        L27:
            java.lang.String r0 = "end"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L43
            r3 = 3
            return r3
        L31:
            java.lang.String r0 = "middle"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L43
            goto L42
        L3a:
            java.lang.String r0 = "center"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L43
        L42:
            return r1
        L43:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "WebvttCueParser"
            java.lang.String r2 = "Invalid alignment value: "
            java.lang.String r3 = r2.concat(r3)
            androidx.media3.common.util.Log.w(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.webvtt.WebvttCueParser.parseTextAlignment(java.lang.String):int");
    }

    private static int parseVerticalAttribute(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 3462) {
            if (iHashCode == 3642 && str.equals("rl")) {
                return 1;
            }
        } else if (str.equals("lr")) {
            return 2;
        }
        Log.w(TAG, "Invalid 'vertical' value: ".concat(String.valueOf(str)));
        return Integer.MIN_VALUE;
    }

    public static WebvttCueInfo parseCue(ParsableByteArray parsableByteArray, List<WebvttCssStyle> list) {
        String line = parsableByteArray.readLine();
        if (line != null) {
            Pattern pattern = CUE_HEADER_PATTERN;
            Matcher matcher = pattern.matcher(line);
            if (matcher.matches()) {
                return parseCue(null, matcher, parsableByteArray, list);
            }
            String line2 = parsableByteArray.readLine();
            if (line2 != null) {
                Matcher matcher2 = pattern.matcher(line2);
                if (matcher2.matches()) {
                    return parseCue(line.trim(), matcher2, parsableByteArray, list);
                }
            }
        }
        return null;
    }

    static Cue.Builder parseCueSettingsList(String str) {
        WebvttCueInfoBuilder webvttCueInfoBuilder = new WebvttCueInfoBuilder();
        parseCueSettingsList(str, webvttCueInfoBuilder);
        return webvttCueInfoBuilder.toCueBuilder();
    }
}
