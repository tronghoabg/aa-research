package androidx.media3.extractor.text.ttml;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import androidx.media3.common.C;
import androidx.media3.common.text.Cue;
import com.google.d.b.an;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class TtmlNode {
    public static final String ANNOTATION_POSITION_AFTER = "after";
    public static final String ANNOTATION_POSITION_BEFORE = "before";
    public static final String ANNOTATION_POSITION_OUTSIDE = "outside";
    public static final String ANONYMOUS_REGION_ID = "";
    public static final String ATTR_EBUTTS_MULTI_ROW_ALIGN = "multiRowAlign";
    public static final String ATTR_ID = "id";
    public static final String ATTR_STYLE = "style";
    public static final String ATTR_TTS_BACKGROUND_COLOR = "backgroundColor";
    public static final String ATTR_TTS_COLOR = "color";
    public static final String ATTR_TTS_DISPLAY_ALIGN = "displayAlign";
    public static final String ATTR_TTS_EXTENT = "extent";
    public static final String ATTR_TTS_FONT_FAMILY = "fontFamily";
    public static final String ATTR_TTS_FONT_SIZE = "fontSize";
    public static final String ATTR_TTS_FONT_STYLE = "fontStyle";
    public static final String ATTR_TTS_FONT_WEIGHT = "fontWeight";
    public static final String ATTR_TTS_ORIGIN = "origin";
    public static final String ATTR_TTS_RUBY = "ruby";
    public static final String ATTR_TTS_RUBY_POSITION = "rubyPosition";
    public static final String ATTR_TTS_SHEAR = "shear";
    public static final String ATTR_TTS_TEXT_ALIGN = "textAlign";
    public static final String ATTR_TTS_TEXT_COMBINE = "textCombine";
    public static final String ATTR_TTS_TEXT_DECORATION = "textDecoration";
    public static final String ATTR_TTS_TEXT_EMPHASIS = "textEmphasis";
    public static final String ATTR_TTS_WRITING_MODE = "writingMode";
    public static final String BOLD = "bold";
    public static final String CENTER = "center";
    public static final String COMBINE_ALL = "all";
    public static final String COMBINE_NONE = "none";
    public static final String END = "end";
    public static final String ITALIC = "italic";
    public static final String LEFT = "left";
    public static final String LINETHROUGH = "linethrough";
    public static final String NO_LINETHROUGH = "nolinethrough";
    public static final String NO_UNDERLINE = "nounderline";
    public static final String RIGHT = "right";
    public static final String RUBY_BASE = "base";
    public static final String RUBY_BASE_CONTAINER = "baseContainer";
    public static final String RUBY_CONTAINER = "container";
    public static final String RUBY_DELIMITER = "delimiter";
    public static final String RUBY_TEXT = "text";
    public static final String RUBY_TEXT_CONTAINER = "textContainer";
    public static final String START = "start";
    public static final String TAG_BODY = "body";
    public static final String TAG_BR = "br";
    public static final String TAG_DATA = "data";
    public static final String TAG_DIV = "div";
    public static final String TAG_HEAD = "head";
    public static final String TAG_IMAGE = "image";
    public static final String TAG_INFORMATION = "information";
    public static final String TAG_LAYOUT = "layout";
    public static final String TAG_METADATA = "metadata";
    public static final String TAG_P = "p";
    public static final String TAG_REGION = "region";
    public static final String TAG_SPAN = "span";
    public static final String TAG_STYLE = "style";
    public static final String TAG_STYLING = "styling";
    public static final String TAG_TT = "tt";
    public static final String TEXT_EMPHASIS_AUTO = "auto";
    public static final String TEXT_EMPHASIS_MARK_CIRCLE = "circle";
    public static final String TEXT_EMPHASIS_MARK_DOT = "dot";
    public static final String TEXT_EMPHASIS_MARK_FILLED = "filled";
    public static final String TEXT_EMPHASIS_MARK_OPEN = "open";
    public static final String TEXT_EMPHASIS_MARK_SESAME = "sesame";
    public static final String TEXT_EMPHASIS_NONE = "none";
    public static final String UNDERLINE = "underline";
    public static final String VERTICAL = "tb";
    public static final String VERTICAL_LR = "tblr";
    public static final String VERTICAL_RL = "tbrl";
    private List<TtmlNode> children;
    public final long endTimeUs;
    public final String imageId;
    public final boolean isTextNode;
    private final HashMap<String, Integer> nodeEndsByRegion;
    private final HashMap<String, Integer> nodeStartsByRegion;
    public final TtmlNode parent;
    public final String regionId;
    public final long startTimeUs;
    public final TtmlStyle style;
    private final String[] styleIds;
    public final String tag;
    public final String text;

    private TtmlNode(String str, String str2, long j2, long j3, TtmlStyle ttmlStyle, String[] strArr, String str3, String str4, TtmlNode ttmlNode) {
        this.tag = str;
        this.text = str2;
        this.imageId = str4;
        this.style = ttmlStyle;
        this.styleIds = strArr;
        this.isTextNode = str2 != null;
        this.startTimeUs = j2;
        this.endTimeUs = j3;
        an.B(str3);
        this.regionId = str3;
        this.parent = ttmlNode;
        this.nodeStartsByRegion = new HashMap<>();
        this.nodeEndsByRegion = new HashMap<>();
    }

    private void applyStyleToOutput(Map<String, TtmlStyle> map, Cue.Builder builder, int i2, int i3, int i4) {
        TtmlStyle ttmlStyleResolveStyle = TtmlRenderUtil.resolveStyle(this.style, this.styleIds, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) builder.getText();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            builder.setText(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (ttmlStyleResolveStyle != null) {
            TtmlRenderUtil.applyStylesToSpan(spannableStringBuilder2, i2, i3, ttmlStyleResolveStyle, this.parent, map, i4);
            if (TAG_P.equals(this.tag)) {
                if (ttmlStyleResolveStyle.getShearPercentage() != Float.MAX_VALUE) {
                    builder.setShearDegrees((ttmlStyleResolveStyle.getShearPercentage() * (-90.0f)) / 100.0f);
                }
                if (ttmlStyleResolveStyle.getTextAlign() != null) {
                    builder.setTextAlignment(ttmlStyleResolveStyle.getTextAlign());
                }
                if (ttmlStyleResolveStyle.getMultiRowAlign() != null) {
                    builder.setMultiRowAlignment(ttmlStyleResolveStyle.getMultiRowAlign());
                }
            }
        }
    }

    public static TtmlNode buildNode(String str, long j2, long j3, TtmlStyle ttmlStyle, String[] strArr, String str2, String str3, TtmlNode ttmlNode) {
        return new TtmlNode(str, null, j2, j3, ttmlStyle, strArr, str2, str3, ttmlNode);
    }

    public static TtmlNode buildTextNode(String str) {
        return new TtmlNode(null, TtmlRenderUtil.applyTextElementSpacePolicy(str), C.TIME_UNSET, C.TIME_UNSET, null, null, "", null, null);
    }

    private static void cleanUpText(SpannableStringBuilder spannableStringBuilder) {
        int i2 = 0;
        for (DeleteTextSpan deleteTextSpan : (DeleteTextSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), DeleteTextSpan.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(deleteTextSpan), spannableStringBuilder.getSpanEnd(deleteTextSpan), "");
        }
        int i3 = 0;
        while (i3 < spannableStringBuilder.length()) {
            int i4 = i3 + 1;
            if (spannableStringBuilder.charAt(i3) == ' ') {
                int i5 = i4;
                while (i5 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i5) == ' ') {
                    i5++;
                }
                int i6 = i5 - i4;
                if (i6 > 0) {
                    spannableStringBuilder.delete(i3, i6 + i3);
                }
            }
            i3 = i4;
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        int i7 = 0;
        while (i7 < spannableStringBuilder.length() - 1) {
            int i8 = i7 + 1;
            if (spannableStringBuilder.charAt(i7) == '\n' && spannableStringBuilder.charAt(i8) == ' ') {
                spannableStringBuilder.delete(i8, i7 + 2);
            }
            i7 = i8;
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        while (i2 < spannableStringBuilder.length() - 1) {
            int i9 = i2 + 1;
            if (spannableStringBuilder.charAt(i2) == ' ' && spannableStringBuilder.charAt(i9) == '\n') {
                spannableStringBuilder.delete(i2, i9);
            }
            i2 = i9;
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    private void getEventTimes(TreeSet<Long> treeSet, boolean z) {
        String str = this.tag;
        boolean zEquals = TAG_P.equals(str);
        if (z || zEquals || (TAG_DIV.equals(str) && this.imageId != null)) {
            long j2 = this.startTimeUs;
            if (j2 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j2));
            }
            long j3 = this.endTimeUs;
            if (j3 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j3));
            }
        }
        if (this.children != null) {
            for (int i2 = 0; i2 < this.children.size(); i2++) {
                TtmlNode ttmlNode = this.children.get(i2);
                boolean z2 = true;
                if (!z && !zEquals) {
                    z2 = false;
                }
                ttmlNode.getEventTimes(treeSet, z2);
            }
        }
    }

    private static SpannableStringBuilder getRegionOutputText(String str, Map<String, Cue.Builder> map) {
        if (!map.containsKey(str)) {
            Cue.Builder builder = new Cue.Builder();
            builder.setText(new SpannableStringBuilder());
            map.put(str, builder);
        }
        CharSequence text = map.get(str).getText();
        an.B(text);
        return (SpannableStringBuilder) text;
    }

    private void traverseForImage(long j2, String str, List<Pair<String, String>> list) {
        String str2;
        String str3 = this.regionId;
        boolean zEquals = "".equals(str3);
        boolean zIsActive = isActive(j2);
        if (true != zEquals) {
            str = str3;
        }
        if (zIsActive && TAG_DIV.equals(this.tag) && (str2 = this.imageId) != null) {
            list.add(new Pair<>(str, str2));
            return;
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            getChild(i2).traverseForImage(j2, str, list);
        }
    }

    private void traverseForStyle(long j2, Map<String, TtmlStyle> map, Map<String, TtmlRegion> map2, String str, Map<String, Cue.Builder> map3) {
        int iIntValue;
        if (isActive(j2)) {
            String str2 = this.regionId;
            String str3 = true != "".equals(str2) ? str2 : str;
            Iterator<Map.Entry<String, Integer>> it = this.nodeEndsByRegion.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                iIntValue = this.nodeStartsByRegion.containsKey(key) ? this.nodeStartsByRegion.get(key).intValue() : 0;
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    Cue.Builder builder = map3.get(key);
                    an.B(builder);
                    TtmlRegion ttmlRegion = map2.get(str3);
                    an.B(ttmlRegion);
                    applyStyleToOutput(map, builder, iIntValue, iIntValue2, ttmlRegion.verticalType);
                }
            }
            while (iIntValue < getChildCount()) {
                getChild(iIntValue).traverseForStyle(j2, map, map2, str3, map3);
                iIntValue++;
            }
        }
    }

    private void traverseForText(long j2, boolean z, String str, Map<String, Cue.Builder> map) {
        boolean zEquals;
        long j3;
        Map<String, Cue.Builder> map2;
        boolean z2;
        this.nodeStartsByRegion.clear();
        this.nodeEndsByRegion.clear();
        String str2 = this.tag;
        if (TAG_METADATA.equals(str2)) {
            return;
        }
        String str3 = this.regionId;
        String str4 = true != "".equals(str3) ? str3 : str;
        if (this.isTextNode && z) {
            SpannableStringBuilder regionOutputText = getRegionOutputText(str4, map);
            String str5 = this.text;
            an.B(str5);
            regionOutputText.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z) {
            getRegionOutputText(str4, map).append('\n');
            return;
        }
        if (isActive(j2)) {
            for (Map.Entry<String, Cue.Builder> entry : map.entrySet()) {
                HashMap<String, Integer> map3 = this.nodeStartsByRegion;
                String key = entry.getKey();
                CharSequence text = entry.getValue().getText();
                an.B(text);
                map3.put(key, Integer.valueOf(text.length()));
            }
            String str6 = this.tag;
            int i2 = 0;
            while (true) {
                zEquals = TAG_P.equals(str6);
                if (i2 >= getChildCount()) {
                    break;
                }
                TtmlNode child = getChild(i2);
                if (z || zEquals) {
                    j3 = j2;
                    map2 = map;
                    z2 = true;
                } else {
                    j3 = j2;
                    map2 = map;
                    z2 = false;
                }
                child.traverseForText(j3, z2, str4, map2);
                i2++;
                j2 = j3;
                map = map2;
            }
            Map<String, Cue.Builder> map4 = map;
            if (zEquals) {
                TtmlRenderUtil.endParagraph(getRegionOutputText(str4, map4));
            }
            for (Map.Entry<String, Cue.Builder> entry2 : map4.entrySet()) {
                HashMap<String, Integer> map5 = this.nodeEndsByRegion;
                String key2 = entry2.getKey();
                CharSequence text2 = entry2.getValue().getText();
                an.B(text2);
                map5.put(key2, Integer.valueOf(text2.length()));
            }
        }
    }

    public void addChild(TtmlNode ttmlNode) {
        if (this.children == null) {
            this.children = new ArrayList();
        }
        this.children.add(ttmlNode);
    }

    public TtmlNode getChild(int i2) {
        List<TtmlNode> list = this.children;
        if (list != null) {
            return list.get(i2);
        }
        throw new IndexOutOfBoundsException();
    }

    public int getChildCount() {
        List<TtmlNode> list = this.children;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<Cue> getCues(long j2, Map<String, TtmlStyle> map, Map<String, TtmlRegion> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        traverseForImage(j2, this.regionId, arrayList);
        TreeMap treeMap = new TreeMap();
        traverseForText(j2, false, this.regionId, treeMap);
        traverseForStyle(j2, map, map2, this.regionId, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Pair<String, String> pair = arrayList.get(i2);
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                TtmlRegion ttmlRegion = map2.get(pair.first);
                an.B(ttmlRegion);
                Cue.Builder builder = new Cue.Builder();
                builder.setBitmap(bitmapDecodeByteArray);
                builder.setPosition(ttmlRegion.position);
                builder.setPositionAnchor(0);
                builder.setLine(ttmlRegion.line, 0);
                builder.setLineAnchor(ttmlRegion.lineAnchor);
                builder.setSize(ttmlRegion.width);
                builder.setBitmapHeight(ttmlRegion.height);
                builder.setVerticalType(ttmlRegion.verticalType);
                arrayList2.add(builder.build());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            TtmlRegion ttmlRegion2 = map2.get(entry.getKey());
            an.B(ttmlRegion2);
            Cue.Builder builder2 = (Cue.Builder) entry.getValue();
            CharSequence text = builder2.getText();
            an.B(text);
            cleanUpText((SpannableStringBuilder) text);
            builder2.setLine(ttmlRegion2.line, ttmlRegion2.lineType);
            builder2.setLineAnchor(ttmlRegion2.lineAnchor);
            builder2.setPosition(ttmlRegion2.position);
            builder2.setSize(ttmlRegion2.width);
            builder2.setTextSize(ttmlRegion2.textSize, ttmlRegion2.textSizeType);
            builder2.setVerticalType(ttmlRegion2.verticalType);
            arrayList2.add(builder2.build());
        }
        return arrayList2;
    }

    public long[] getEventTimesUs() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i2 = 0;
        getEventTimes(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i2] = it.next().longValue();
            i2++;
        }
        return jArr;
    }

    public String[] getStyleIds() {
        return this.styleIds;
    }

    public boolean isActive(long j2) {
        long j3 = this.startTimeUs;
        if (j3 == C.TIME_UNSET) {
            if (this.endTimeUs == C.TIME_UNSET) {
                return true;
            }
            j3 = -9223372036854775807L;
        }
        if (j3 <= j2 && this.endTimeUs == C.TIME_UNSET) {
            return true;
        }
        if (j3 != C.TIME_UNSET || j2 >= this.endTimeUs) {
            return j3 <= j2 && j2 < this.endTimeUs;
        }
        return true;
    }
}
