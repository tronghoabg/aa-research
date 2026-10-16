package u6;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.utils.StringUtils;

/* renamed from: u6.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4257b {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f46666a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f46667b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f46668c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f46669d;

    static {
        HashMap map = new HashMap();
        f46669d = map;
        N0.a.p(-984833, map, "aliceblue", -332841, "antiquewhite");
        N0.a.s(map, "aqua", -16711681, -8388652, "aquamarine");
        N0.a.p(-983041, map, "azure", -657956, "beige");
        N0.a.p(-6972, map, "bisque", -16777216, "black");
        N0.a.p(-5171, map, "blanchedalmond", -16776961, "blue");
        N0.a.p(-7722014, map, "blueviolet", -5952982, "brown");
        N0.a.p(-2180985, map, "burlywood", -10510688, "cadetblue");
        N0.a.p(-8388864, map, "chartreuse", -2987746, "chocolate");
        N0.a.p(-32944, map, "coral", -10185235, "cornflowerblue");
        N0.a.p(-1828, map, "cornsilk", -2354116, "crimson");
        N0.a.s(map, "cyan", -16711681, -16777077, "darkblue");
        N0.a.p(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        N0.a.s(map, "darkgray", -5658199, -16751616, "darkgreen");
        N0.a.s(map, "darkgrey", -5658199, -4343957, "darkkhaki");
        N0.a.p(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        N0.a.p(-29696, map, "darkorange", -6737204, "darkorchid");
        N0.a.p(-7667712, map, "darkred", -1468806, "darksalmon");
        N0.a.p(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        N0.a.s(map, "darkturquoise", -16724271, -7077677, "darkviolet");
        N0.a.p(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        N0.a.s(map, "dodgerblue", -14774017, -5103070, "firebrick");
        N0.a.p(-1296, map, "floralwhite", -14513374, "forestgreen");
        N0.a.s(map, "fuchsia", -65281, -2302756, "gainsboro");
        N0.a.p(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        N0.a.p(-16744448, map, "green", -5374161, "greenyellow");
        N0.a.s(map, "grey", -8355712, -983056, "honeydew");
        N0.a.p(-38476, map, "hotpink", -3318692, "indianred");
        N0.a.p(-11861886, map, "indigo", -16, "ivory");
        N0.a.p(-989556, map, "khaki", -1644806, "lavender");
        N0.a.p(-3851, map, "lavenderblush", -8586240, "lawngreen");
        N0.a.p(-1331, map, "lemonchiffon", -5383962, "lightblue");
        N0.a.p(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        N0.a.p(-18751, map, "lightpink", -24454, "lightsalmon");
        N0.a.p(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        N0.a.s(map, "lightsteelblue", -5192482, -32, "lightyellow");
        N0.a.p(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        N0.a.p(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        N0.a.p(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        N0.a.p(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        N0.a.p(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        N0.a.p(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        N0.a.p(-15132304, map, "midnightblue", -655366, "mintcream");
        N0.a.p(-6943, map, "mistyrose", -6987, "moccasin");
        N0.a.p(-8531, map, "navajowhite", -16777088, "navy");
        N0.a.p(-133658, map, "oldlace", -8355840, "olive");
        N0.a.p(-9728477, map, "olivedrab", -23296, "orange");
        N0.a.p(-47872, map, "orangered", -2461482, "orchid");
        N0.a.p(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        N0.a.p(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        N0.a.p(-4139, map, "papayawhip", -9543, "peachpuff");
        N0.a.p(-3308225, map, "peru", -16181, "pink");
        N0.a.p(-2252579, map, "plum", -5185306, "powderblue");
        N0.a.p(-8388480, map, "purple", -10079335, "rebeccapurple");
        N0.a.p(-65536, map, "red", -4419697, "rosybrown");
        N0.a.p(-12490271, map, "royalblue", -7650029, "saddlebrown");
        N0.a.p(-360334, map, "salmon", -744352, "sandybrown");
        N0.a.p(-13726889, map, "seagreen", -2578, "seashell");
        N0.a.p(-6270419, map, "sienna", -4144960, "silver");
        N0.a.p(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        N0.a.s(map, "snow", -1286, -16711809, "springgreen");
        N0.a.p(-12156236, map, "steelblue", -2968436, "tan");
        N0.a.p(-16744320, map, "teal", -2572328, "thistle");
        N0.a.p(-40121, map, "tomato", 0, "transparent");
        N0.a.p(-12525360, map, "turquoise", -1146130, "violet");
        N0.a.p(-663885, map, "wheat", -1, "white");
        N0.a.p(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    public static int a(String str, boolean z2) throws NumberFormatException {
        int i5;
        AbstractC4256a.e(!TextUtils.isEmpty(str));
        String strReplace = str.replace(StringUtils.SPACE, "");
        if (strReplace.charAt(0) == '#') {
            int i10 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i10;
            }
            if (strReplace.length() == 9) {
                return ((i10 & 255) << 24) | (i10 >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z2 ? f46668c : f46667b).matcher(strReplace);
            if (matcher.matches()) {
                if (z2) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    i5 = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    String strGroup2 = matcher.group(4);
                    strGroup2.getClass();
                    i5 = Integer.parseInt(strGroup2, 10);
                }
                String strGroup3 = matcher.group(1);
                strGroup3.getClass();
                int i11 = Integer.parseInt(strGroup3, 10);
                String strGroup4 = matcher.group(2);
                strGroup4.getClass();
                int i12 = Integer.parseInt(strGroup4, 10);
                String strGroup5 = matcher.group(3);
                strGroup5.getClass();
                return Color.argb(i5, i11, i12, Integer.parseInt(strGroup5, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = f46666a.matcher(strReplace);
            if (matcher2.matches()) {
                String strGroup6 = matcher2.group(1);
                strGroup6.getClass();
                int i13 = Integer.parseInt(strGroup6, 10);
                String strGroup7 = matcher2.group(2);
                strGroup7.getClass();
                int i14 = Integer.parseInt(strGroup7, 10);
                String strGroup8 = matcher2.group(3);
                strGroup8.getClass();
                return Color.rgb(i13, i14, Integer.parseInt(strGroup8, 10));
            }
        } else {
            Integer num = (Integer) f46669d.get(A6.h.O(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
