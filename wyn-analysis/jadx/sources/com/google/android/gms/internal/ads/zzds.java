package com.google.android.gms.internal.ads;

import Va.M6;
import android.graphics.Color;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes3.dex */
public final class zzds {
    private static final Pattern zza = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern zzb = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern zzc = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
    private static final Map zzd;

    static {
        HashMap map = new HashMap();
        zzd = map;
        M6.x(-984833, map, "aliceblue", -332841, "antiquewhite");
        map.put("aqua", -16711681);
        map.put("aquamarine", -8388652);
        M6.x(-983041, map, "azure", -657956, "beige");
        M6.x(-6972, map, "bisque", -16777216, "black");
        M6.x(-5171, map, "blanchedalmond", -16776961, "blue");
        M6.x(-7722014, map, "blueviolet", -5952982, "brown");
        M6.x(-2180985, map, "burlywood", -10510688, "cadetblue");
        M6.x(-8388864, map, "chartreuse", -2987746, "chocolate");
        M6.x(-32944, map, "coral", -10185235, "cornflowerblue");
        M6.x(-1828, map, "cornsilk", -2354116, "crimson");
        map.put("cyan", -16711681);
        map.put("darkblue", -16777077);
        M6.x(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        map.put("darkgray", -5658199);
        map.put("darkgreen", -16751616);
        map.put("darkgrey", -5658199);
        map.put("darkkhaki", -4343957);
        M6.x(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        M6.x(-29696, map, "darkorange", -6737204, "darkorchid");
        M6.x(-7667712, map, "darkred", -1468806, "darksalmon");
        M6.x(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        map.put("darkturquoise", -16724271);
        map.put("darkviolet", -7077677);
        M6.x(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        map.put("dodgerblue", -14774017);
        map.put("firebrick", -5103070);
        M6.x(-1296, map, "floralwhite", -14513374, "forestgreen");
        map.put("fuchsia", -65281);
        map.put("gainsboro", -2302756);
        M6.x(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        M6.x(-16744448, map, "green", -5374161, "greenyellow");
        map.put("grey", -8355712);
        map.put("honeydew", -983056);
        M6.x(-38476, map, "hotpink", -3318692, "indianred");
        M6.x(-11861886, map, "indigo", -16, "ivory");
        M6.x(-989556, map, "khaki", -1644806, "lavender");
        M6.x(-3851, map, "lavenderblush", -8586240, "lawngreen");
        M6.x(-1331, map, "lemonchiffon", -5383962, "lightblue");
        M6.x(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        M6.x(-18751, map, "lightpink", -24454, "lightsalmon");
        M6.x(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        map.put("lightsteelblue", -5192482);
        map.put("lightyellow", -32);
        M6.x(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        M6.x(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        M6.x(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        M6.x(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        M6.x(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        M6.x(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        M6.x(-15132304, map, "midnightblue", -655366, "mintcream");
        M6.x(-6943, map, "mistyrose", -6987, "moccasin");
        M6.x(-8531, map, "navajowhite", -16777088, "navy");
        M6.x(-133658, map, "oldlace", -8355840, "olive");
        M6.x(-9728477, map, "olivedrab", -23296, "orange");
        M6.x(-47872, map, "orangered", -2461482, "orchid");
        M6.x(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        M6.x(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        M6.x(-4139, map, "papayawhip", -9543, "peachpuff");
        M6.x(-3308225, map, "peru", -16181, "pink");
        M6.x(-2252579, map, "plum", -5185306, "powderblue");
        M6.x(-8388480, map, "purple", -10079335, "rebeccapurple");
        M6.x(-65536, map, "red", -4419697, "rosybrown");
        M6.x(-12490271, map, "royalblue", -7650029, "saddlebrown");
        M6.x(-360334, map, "salmon", -744352, "sandybrown");
        M6.x(-13726889, map, "seagreen", -2578, "seashell");
        M6.x(-6270419, map, "sienna", -4144960, "silver");
        M6.x(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        map.put("snow", -1286);
        map.put("springgreen", -16711809);
        M6.x(-12156236, map, "steelblue", -2968436, "tan");
        M6.x(-16744320, map, "teal", -2572328, "thistle");
        M6.x(-40121, map, "tomato", 0, "transparent");
        M6.x(-12525360, map, "turquoise", -1146130, "violet");
        M6.x(-663885, map, "wheat", -1, "white");
        M6.x(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    public static int zza(String str) {
        return zzc(str, false);
    }

    public static int zzb(String str) {
        return zzc(str, true);
    }

    private static int zzc(String str, boolean z2) throws NumberFormatException {
        int i5;
        zzgtr.zza(!TextUtils.isEmpty(str));
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
            Matcher matcher = (z2 ? zzc : zzb).matcher(strReplace);
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
            Matcher matcher2 = zza.matcher(strReplace);
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
            Integer num = (Integer) zzd.get(zzgsz.zza(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
