package androidx.media3.extractor.text.ttml;

import android.text.Layout;
import androidx.camera.video.AudioStats;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.common.util.XmlPullParserUtil;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.LegacySubtitleUtil;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleDecoderException;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.d.b.an;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class TtmlParser implements SubtitleParser {
    private static final String ATTR_BEGIN = "begin";
    private static final String ATTR_DURATION = "dur";
    private static final String ATTR_END = "end";
    private static final String ATTR_IMAGE = "backgroundImage";
    private static final String ATTR_REGION = "region";
    private static final String ATTR_STYLE = "style";
    public static final int CUE_REPLACEMENT_BEHAVIOR = 1;
    private static final int DEFAULT_CELL_ROWS = 15;
    private static final int DEFAULT_FRAME_RATE = 30;
    private static final String TAG = "TtmlParser";
    private static final String TTP = "http://www.w3.org/ns/ttml#parameter";
    private final XmlPullParserFactory xmlParserFactory;
    private static final Pattern CLOCK_TIME = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern OFFSET_TIME = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern FONT_SIZE = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern SIGNED_PERCENTAGE = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern PERCENTAGE_COORDINATES = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern PIXEL_COORDINATES = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern CELL_RESOLUTION = Pattern.compile("^(\\d+) (\\d+)$");
    private static final FrameAndTickRate DEFAULT_FRAME_AND_TICK_RATE = new FrameAndTickRate(30.0f, 1, 1);

    /* compiled from: WazeSource */
    final class FrameAndTickRate {
        final float effectiveFrameRate;
        final int subFrameRate;
        final int tickRate;

        FrameAndTickRate(float f2, int i2, int i3) {
            this.effectiveFrameRate = f2;
            this.subFrameRate = i2;
            this.tickRate = i3;
        }
    }

    /* compiled from: WazeSource */
    final class TtsExtent {
        final int height;
        final int width;

        TtsExtent(int i2, int i3) {
            this.width = i2;
            this.height = i3;
        }
    }

    public TtmlParser() throws XmlPullParserException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.xmlParserFactory = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    private static TtmlStyle createIfNull(TtmlStyle ttmlStyle) {
        return ttmlStyle == null ? new TtmlStyle() : ttmlStyle;
    }

    private static boolean isSupportedTag(String str) {
        return str.equals(TtmlNode.TAG_TT) || str.equals(TtmlNode.TAG_HEAD) || str.equals(TtmlNode.TAG_BODY) || str.equals(TtmlNode.TAG_DIV) || str.equals(TtmlNode.TAG_P) || str.equals(TtmlNode.TAG_SPAN) || str.equals("br") || str.equals("style") || str.equals(TtmlNode.TAG_STYLING) || str.equals("layout") || str.equals("region") || str.equals(TtmlNode.TAG_METADATA) || str.equals("image") || str.equals("data") || str.equals(TtmlNode.TAG_INFORMATION);
    }

    private static Layout.Alignment parseAlignment(String str) {
        String strK = an.K(str);
        switch (strK.hashCode()) {
            case -1364013995:
                if (strK.equals(TtmlNode.CENTER)) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                return null;
            case 100571:
                if (!strK.equals("end")) {
                    return null;
                }
                break;
            case 3317767:
                if (!strK.equals(TtmlNode.LEFT)) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            case 108511772:
                if (!strK.equals(TtmlNode.RIGHT)) {
                    return null;
                }
                break;
            case 109757538:
                if (!strK.equals(TtmlNode.START)) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
        return Layout.Alignment.ALIGN_OPPOSITE;
    }

    private static int parseCellRows(XmlPullParser xmlPullParser, int i2) throws NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue(TTP, "cellResolution");
        if (attributeValue == null) {
            return i2;
        }
        Matcher matcher = CELL_RESOLUTION.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.w(TAG, "Ignoring malformed cell resolution: ".concat(attributeValue));
            return i2;
        }
        boolean z = true;
        try {
            String strGroup = matcher.group(1);
            an.B(strGroup);
            String str = strGroup;
            int i3 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            an.B(strGroup2);
            String str2 = strGroup2;
            int i4 = Integer.parseInt(strGroup2);
            if (i3 == 0) {
                z = false;
            } else if (i4 == 0) {
                i4 = 0;
                z = false;
            }
            an.r(z, "Invalid cell resolution %s %s", i3, i4);
            return i4;
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Ignoring malformed cell resolution: ".concat(attributeValue));
            return i2;
        }
    }

    private static void parseFontSize(String str, TtmlStyle ttmlStyle) throws SubtitleDecoderException {
        Matcher matcher;
        String[] strArrSplit = Util.split(str, "\\s+");
        int length = strArrSplit.length;
        if (length == 1) {
            matcher = FONT_SIZE.matcher(str);
        } else {
            if (length != 2) {
                throw new SubtitleDecoderException("Invalid number of entries for fontSize: " + length + ".");
            }
            matcher = FONT_SIZE.matcher(strArrSplit[1]);
            Log.w(TAG, "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException("Invalid expression for fontSize: '" + str + "'.");
        }
        String strGroup = matcher.group(3);
        an.B(strGroup);
        int iHashCode = strGroup.hashCode();
        if (iHashCode == 37) {
            if (strGroup.equals("%")) {
                ttmlStyle.setFontSizeUnit(3);
                String strGroup2 = matcher.group(1);
                an.B(strGroup2);
                ttmlStyle.setFontSize(Float.parseFloat(strGroup2));
                return;
            }
            throw new SubtitleDecoderException("Invalid unit for fontSize: '" + strGroup + "'.");
        }
        if (iHashCode == 3240) {
            if (strGroup.equals("em")) {
                ttmlStyle.setFontSizeUnit(2);
                String strGroup22 = matcher.group(1);
                an.B(strGroup22);
                ttmlStyle.setFontSize(Float.parseFloat(strGroup22));
                return;
            }
            throw new SubtitleDecoderException("Invalid unit for fontSize: '" + strGroup + "'.");
        }
        if (iHashCode == 3592 && strGroup.equals("px")) {
            ttmlStyle.setFontSizeUnit(1);
            String strGroup222 = matcher.group(1);
            an.B(strGroup222);
            ttmlStyle.setFontSize(Float.parseFloat(strGroup222));
            return;
        }
        throw new SubtitleDecoderException("Invalid unit for fontSize: '" + strGroup + "'.");
    }

    private static FrameAndTickRate parseFrameAndTickRates(XmlPullParser xmlPullParser) throws NumberFormatException {
        float f2;
        String attributeValue = xmlPullParser.getAttributeValue(TTP, "frameRate");
        int i2 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue(TTP, "frameRateMultiplier");
        if (attributeValue2 != null) {
            an.m(Util.split(attributeValue2, " ").length == 2, "frameRateMultiplier doesn't have 2 parts");
            f2 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f2 = 1.0f;
        }
        FrameAndTickRate frameAndTickRate = DEFAULT_FRAME_AND_TICK_RATE;
        int i3 = frameAndTickRate.subFrameRate;
        String attributeValue3 = xmlPullParser.getAttributeValue(TTP, "subFrameRate");
        if (attributeValue3 != null) {
            i3 = Integer.parseInt(attributeValue3);
        }
        int i4 = frameAndTickRate.tickRate;
        String attributeValue4 = xmlPullParser.getAttributeValue(TTP, "tickRate");
        if (attributeValue4 != null) {
            i4 = Integer.parseInt(attributeValue4);
        }
        return new FrameAndTickRate(i2 * f2, i3, i4);
    }

    private static Map<String, TtmlStyle> parseHeader(XmlPullParser xmlPullParser, Map<String, TtmlStyle> map, int i2, TtsExtent ttsExtent, Map<String, TtmlRegion> map2, Map<String, String> map3) throws XmlPullParserException, IOException, NumberFormatException {
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "style")) {
                String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, "style");
                TtmlStyle styleAttributes = parseStyleAttributes(xmlPullParser, new TtmlStyle());
                if (attributeValue != null) {
                    for (String str : parseStyleIds(attributeValue)) {
                        styleAttributes.chain(map.get(str));
                    }
                }
                String id = styleAttributes.getId();
                if (id != null) {
                    map.put(id, styleAttributes);
                }
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "region")) {
                TtmlRegion regionAttributes = parseRegionAttributes(xmlPullParser, i2, ttsExtent, map);
                if (regionAttributes != null) {
                    map2.put(regionAttributes.id, regionAttributes);
                }
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, TtmlNode.TAG_METADATA)) {
                parseMetadata(xmlPullParser, map3);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, TtmlNode.TAG_HEAD));
        return map;
    }

    private static void parseMetadata(XmlPullParser xmlPullParser, Map<String, String> map) throws XmlPullParserException, IOException {
        String attributeValue;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "image") && (attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_ID)) != null) {
                map.put(attributeValue, xmlPullParser.nextText());
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, TtmlNode.TAG_METADATA));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[PHI: r3 r6 r10 r12 r14
  0x0066: PHI (r3v3 java.lang.String) = 
  (r3v1 java.lang.String)
  (r3v1 java.lang.String)
  (r3v1 java.lang.String)
  (r3v1 java.lang.String)
  (r3v1 java.lang.String)
  (r3v1 java.lang.String)
  (r3v1 java.lang.String)
  (r3v1 java.lang.String)
  (r3v1 java.lang.String)
  (r3v1 java.lang.String)
  (r3v1 java.lang.String)
  (r3v1 java.lang.String)
  (r3v1 java.lang.String)
  (r3v5 java.lang.String)
 binds: [B:5:0x002e, B:28:0x0089, B:25:0x007c, B:26:0x007e, B:22:0x006f, B:23:0x0071, B:18:0x0060, B:19:0x0062, B:13:0x004f, B:15:0x0056, B:16:0x0058, B:8:0x0038, B:10:0x0040, B:11:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x0066: PHI (r6v3 java.lang.String[]) = 
  (r6v2 java.lang.String[])
  (r6v2 java.lang.String[])
  (r6v2 java.lang.String[])
  (r6v2 java.lang.String[])
  (r6v2 java.lang.String[])
  (r6v2 java.lang.String[])
  (r6v2 java.lang.String[])
  (r6v2 java.lang.String[])
  (r6v2 java.lang.String[])
  (r6v2 java.lang.String[])
  (r6v5 java.lang.String[])
  (r6v2 java.lang.String[])
  (r6v2 java.lang.String[])
  (r6v2 java.lang.String[])
 binds: [B:5:0x002e, B:28:0x0089, B:25:0x007c, B:26:0x007e, B:22:0x006f, B:23:0x0071, B:18:0x0060, B:19:0x0062, B:13:0x004f, B:15:0x0056, B:16:0x0058, B:8:0x0038, B:10:0x0040, B:11:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x0066: PHI (r10v8 long) = 
  (r10v1 long)
  (r10v1 long)
  (r10v1 long)
  (r10v1 long)
  (r10v1 long)
  (r10v10 long)
  (r10v1 long)
  (r10v1 long)
  (r10v1 long)
  (r10v1 long)
  (r10v1 long)
  (r10v1 long)
  (r10v1 long)
  (r10v1 long)
 binds: [B:5:0x002e, B:28:0x0089, B:25:0x007c, B:26:0x007e, B:22:0x006f, B:23:0x0071, B:18:0x0060, B:19:0x0062, B:13:0x004f, B:15:0x0056, B:16:0x0058, B:8:0x0038, B:10:0x0040, B:11:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x0066: PHI (r12v6 long) = 
  (r12v1 long)
  (r12v1 long)
  (r12v1 long)
  (r12v1 long)
  (r12v1 long)
  (r12v1 long)
  (r12v1 long)
  (r12v8 long)
  (r12v1 long)
  (r12v1 long)
  (r12v1 long)
  (r12v1 long)
  (r12v1 long)
  (r12v1 long)
 binds: [B:5:0x002e, B:28:0x0089, B:25:0x007c, B:26:0x007e, B:22:0x006f, B:23:0x0071, B:18:0x0060, B:19:0x0062, B:13:0x004f, B:15:0x0056, B:16:0x0058, B:8:0x0038, B:10:0x0040, B:11:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x0066: PHI (r14v2 long) = 
  (r14v1 long)
  (r14v1 long)
  (r14v1 long)
  (r14v4 long)
  (r14v1 long)
  (r14v1 long)
  (r14v1 long)
  (r14v1 long)
  (r14v1 long)
  (r14v1 long)
  (r14v1 long)
  (r14v1 long)
  (r14v1 long)
  (r14v1 long)
 binds: [B:5:0x002e, B:28:0x0089, B:25:0x007c, B:26:0x007e, B:22:0x006f, B:23:0x0071, B:18:0x0060, B:19:0x0062, B:13:0x004f, B:15:0x0056, B:16:0x0058, B:8:0x0038, B:10:0x0040, B:11:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.media3.extractor.text.ttml.TtmlNode parseNode(org.xmlpull.v1.XmlPullParser r20, androidx.media3.extractor.text.ttml.TtmlNode r21, java.util.Map<java.lang.String, androidx.media3.extractor.text.ttml.TtmlRegion> r22, androidx.media3.extractor.text.ttml.TtmlParser.FrameAndTickRate r23) throws androidx.media3.extractor.text.SubtitleDecoderException, java.lang.NumberFormatException {
        /*
            r0 = r20
            r9 = r21
            r1 = r23
            int r2 = r0.getAttributeCount()
            r3 = 0
            androidx.media3.extractor.text.ttml.TtmlStyle r5 = parseStyleAttributes(r0, r3)
            r4 = 0
            java.lang.String r6 = ""
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = r7
            r12 = r10
            r14 = r12
            r16 = r14
            r7 = r6
            r6 = r3
        L1e:
            if (r4 >= r2) goto L9b
            java.lang.String r8 = r0.getAttributeName(r4)
            r18 = r2
            java.lang.String r2 = r0.getAttributeValue(r4)
            int r19 = r8.hashCode()
            switch(r19) {
                case -934795532: goto L83;
                case 99841: goto L76;
                case 100571: goto L69;
                case 93616297: goto L5a;
                case 109780401: goto L49;
                case 1292595405: goto L32;
                default: goto L31;
            }
        L31:
            goto L66
        L32:
            java.lang.String r0 = "backgroundImage"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L66
            java.lang.String r0 = "#"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L66
            r0 = 1
            java.lang.String r0 = r2.substring(r0)
            r3 = r0
            goto L66
        L49:
            java.lang.String r0 = "style"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L66
            java.lang.String[] r0 = parseStyleIds(r2)
            int r2 = r0.length
            if (r2 <= 0) goto L66
            r6 = r0
            goto L66
        L5a:
            java.lang.String r0 = "begin"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L66
            long r12 = parseTimeExpression(r2, r1)
        L66:
            r0 = r22
            goto L94
        L69:
            java.lang.String r0 = "end"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L66
            long r10 = parseTimeExpression(r2, r1)
            goto L66
        L76:
            java.lang.String r0 = "dur"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L66
            long r14 = parseTimeExpression(r2, r1)
            goto L66
        L83:
            java.lang.String r0 = "region"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L66
            r0 = r22
            boolean r8 = r0.containsKey(r2)
            if (r8 == 0) goto L94
            r7 = r2
        L94:
            int r4 = r4 + 1
            r0 = r20
            r2 = r18
            goto L1e
        L9b:
            if (r9 == 0) goto Laf
            long r0 = r9.startTimeUs
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 == 0) goto Laf
            int r2 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r2 == 0) goto La9
            long r12 = r12 + r0
            goto Laa
        La9:
            r12 = r0
        Laa:
            int r2 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r2 == 0) goto Laf
            long r10 = r10 + r0
        Laf:
            r1 = r12
            int r0 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r0 != 0) goto Lc6
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 == 0) goto Lbb
            long r10 = r1 + r14
            goto Lc6
        Lbb:
            if (r9 == 0) goto Lc4
            long r10 = r9.endTimeUs
            int r0 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r0 == 0) goto Lc4
            goto Lc6
        Lc4:
            r10 = r16
        Lc6:
            java.lang.String r0 = r20.getName()
            r8 = r3
            r3 = r10
            androidx.media3.extractor.text.ttml.TtmlNode r0 = androidx.media3.extractor.text.ttml.TtmlNode.buildNode(r0, r1, r3, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.ttml.TtmlParser.parseNode(org.xmlpull.v1.XmlPullParser, androidx.media3.extractor.text.ttml.TtmlNode, java.util.Map, androidx.media3.extractor.text.ttml.TtmlParser$FrameAndTickRate):androidx.media3.extractor.text.ttml.TtmlNode");
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0214  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.media3.extractor.text.ttml.TtmlRegion parseRegionAttributes(org.xmlpull.v1.XmlPullParser r20, int r21, androidx.media3.extractor.text.ttml.TtmlParser.TtsExtent r22, java.util.Map<java.lang.String, androidx.media3.extractor.text.ttml.TtmlStyle> r23) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.ttml.TtmlParser.parseRegionAttributes(org.xmlpull.v1.XmlPullParser, int, androidx.media3.extractor.text.ttml.TtmlParser$TtsExtent, java.util.Map):androidx.media3.extractor.text.ttml.TtmlRegion");
    }

    private static float parseShear(String str) {
        Matcher matcher = SIGNED_PERCENTAGE.matcher(str);
        if (!matcher.matches()) {
            Log.w(TAG, "Invalid value for shear: ".concat(String.valueOf(str)));
            return Float.MAX_VALUE;
        }
        try {
            String strGroup = matcher.group(1);
            an.B(strGroup);
            String str2 = strGroup;
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
        } catch (NumberFormatException e2) {
            Log.w(TAG, "Failed to parse shear: ".concat(String.valueOf(str)), e2);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.media3.extractor.text.ttml.TtmlStyle parseStyleAttributes(org.xmlpull.v1.XmlPullParser r9, androidx.media3.extractor.text.ttml.TtmlStyle r10) {
        /*
            Method dump skipped, instructions count: 798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.ttml.TtmlParser.parseStyleAttributes(org.xmlpull.v1.XmlPullParser, androidx.media3.extractor.text.ttml.TtmlStyle):androidx.media3.extractor.text.ttml.TtmlStyle");
    }

    private static String[] parseStyleIds(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : Util.split(strTrim, "\\s+");
    }

    private static long parseTimeExpression(String str, FrameAndTickRate frameAndTickRate) throws SubtitleDecoderException, NumberFormatException {
        double d2;
        double d3;
        Matcher matcher = CLOCK_TIME.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            an.B(strGroup);
            long j2 = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            an.B(strGroup2);
            long j3 = Long.parseLong(strGroup2) * 60;
            String strGroup3 = matcher.group(3);
            an.B(strGroup3);
            double d4 = Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d5 = AudioStats.AUDIO_AMPLITUDE_NONE;
            double d6 = strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d;
            double d7 = j2 + j3 + d4;
            double d8 = matcher.group(5) != null ? Long.parseLong(r0) / frameAndTickRate.effectiveFrameRate : 0.0d;
            double d9 = d7 + d6;
            if (matcher.group(6) != null) {
                d5 = (Long.parseLong(r0) / frameAndTickRate.subFrameRate) / frameAndTickRate.effectiveFrameRate;
            }
            return (long) ((d9 + d8 + d5) * 1000000.0d);
        }
        Matcher matcher2 = OFFSET_TIME.matcher(str);
        if (!matcher2.matches()) {
            throw new SubtitleDecoderException("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String strGroup5 = matcher2.group(1);
        an.B(strGroup5);
        double d10 = Double.parseDouble(strGroup5);
        String strGroup6 = matcher2.group(2);
        an.B(strGroup6);
        int iHashCode = strGroup6.hashCode();
        if (iHashCode != 102) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 3494) {
                        if (iHashCode == 115) {
                            strGroup6.equals(CmcdData.STREAMING_FORMAT_SS);
                        } else if (iHashCode == 116 && strGroup6.equals("t")) {
                            d2 = frameAndTickRate.tickRate;
                            d10 /= d2;
                        }
                    } else if (strGroup6.equals(AccessibilityNodeInfoCompat.MathInfoCompat.MATH_TAG_STRING_LITERAL)) {
                        d2 = 1000.0d;
                        d10 /= d2;
                    }
                } else if (strGroup6.equals(CmcdData.OBJECT_TYPE_MANIFEST)) {
                    d3 = 60.0d;
                    d10 *= d3;
                }
            } else if (strGroup6.equals(CmcdData.STREAMING_FORMAT_HLS)) {
                d3 = 3600.0d;
                d10 *= d3;
            }
        } else if (strGroup6.equals("f")) {
            d2 = frameAndTickRate.effectiveFrameRate;
            d10 /= d2;
        }
        return (long) (d10 * 1000000.0d);
    }

    private static TtsExtent parseTtsExtent(XmlPullParser xmlPullParser) throws NumberFormatException {
        String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
        if (attributeValue == null) {
            return null;
        }
        Matcher matcher = PIXEL_COORDINATES.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.w(TAG, "Ignoring non-pixel tts extent: ".concat(attributeValue));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            an.B(strGroup);
            String str = strGroup;
            int i2 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            an.B(strGroup2);
            String str2 = strGroup2;
            return new TtsExtent(i2, Integer.parseInt(strGroup2));
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Ignoring malformed tts extent: ".concat(attributeValue));
            return null;
        }
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 1;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i2, int i3, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        LegacySubtitleUtil.toCuesWithTiming(parseToLegacySubtitle(bArr, i2, i3), outputOptions, consumer);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public Subtitle parseToLegacySubtitle(byte[] bArr, int i2, int i3) throws XmlPullParserException, NumberFormatException, IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.xmlParserFactory.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new TtmlRegion(""));
            TtmlSubtitle ttmlSubtitle = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i2, i3), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int i4 = 0;
            int cellRows = 15;
            FrameAndTickRate frameAndTickRates = DEFAULT_FRAME_AND_TICK_RATE;
            TtsExtent ttsExtent = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                TtmlNode ttmlNode = (TtmlNode) arrayDeque.peek();
                if (i4 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if (TtmlNode.TAG_TT.equals(name)) {
                            frameAndTickRates = parseFrameAndTickRates(xmlPullParserNewPullParser);
                            cellRows = parseCellRows(xmlPullParserNewPullParser, 15);
                            ttsExtent = parseTtsExtent(xmlPullParserNewPullParser);
                        }
                        FrameAndTickRate frameAndTickRate = frameAndTickRates;
                        TtsExtent ttsExtent2 = ttsExtent;
                        int i5 = cellRows;
                        if (isSupportedTag(name)) {
                            if (TtmlNode.TAG_HEAD.equals(name)) {
                                parseHeader(xmlPullParserNewPullParser, map, i5, ttsExtent2, map2, map3);
                            } else {
                                try {
                                    TtmlNode node = parseNode(xmlPullParserNewPullParser, ttmlNode, map2, frameAndTickRate);
                                    arrayDeque.push(node);
                                    if (ttmlNode != null) {
                                        ttmlNode.addChild(node);
                                    }
                                } catch (SubtitleDecoderException e2) {
                                    Log.w(TAG, "Suppressing parser error", e2);
                                }
                            }
                            cellRows = i5;
                            ttsExtent = ttsExtent2;
                            frameAndTickRates = frameAndTickRate;
                        } else {
                            Log.i(TAG, "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                        }
                        cellRows = i5;
                        ttsExtent = ttsExtent2;
                        frameAndTickRates = frameAndTickRate;
                        i4 = 1;
                    } else if (eventType == 4) {
                        an.B(ttmlNode);
                        ttmlNode.addChild(TtmlNode.buildTextNode(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals(TtmlNode.TAG_TT)) {
                            TtmlNode ttmlNode2 = (TtmlNode) arrayDeque.peek();
                            an.B(ttmlNode2);
                            ttmlSubtitle = new TtmlSubtitle(ttmlNode2, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i4++;
                } else if (eventType == 3) {
                    i4--;
                }
                xmlPullParserNewPullParser.next();
            }
            an.B(ttmlSubtitle);
            return ttmlSubtitle;
        } catch (IOException e3) {
            throw new IllegalStateException("Unexpected error when reading input.", e3);
        } catch (XmlPullParserException e4) {
            throw new IllegalStateException("Unable to decode source", e4);
        }
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public /* synthetic */ void reset() {
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public /* synthetic */ void parse(byte[] bArr, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        parse(bArr, 0, bArr.length, outputOptions, consumer);
    }
}
