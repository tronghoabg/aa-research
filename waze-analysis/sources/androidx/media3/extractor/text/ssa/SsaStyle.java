package androidx.media3.extractor.text.ssa;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.media3.muxer.MuxerUtil;
import com.google.d.b.an;
import com.google.d.l.j;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class SsaStyle {
    public static final int SSA_ALIGNMENT_BOTTOM_CENTER = 2;
    public static final int SSA_ALIGNMENT_BOTTOM_LEFT = 1;
    public static final int SSA_ALIGNMENT_BOTTOM_RIGHT = 3;
    public static final int SSA_ALIGNMENT_MIDDLE_CENTER = 5;
    public static final int SSA_ALIGNMENT_MIDDLE_LEFT = 4;
    public static final int SSA_ALIGNMENT_MIDDLE_RIGHT = 6;
    public static final int SSA_ALIGNMENT_TOP_CENTER = 8;
    public static final int SSA_ALIGNMENT_TOP_LEFT = 7;
    public static final int SSA_ALIGNMENT_TOP_RIGHT = 9;
    public static final int SSA_ALIGNMENT_UNKNOWN = -1;
    public static final int SSA_BORDER_STYLE_BOX = 3;
    public static final int SSA_BORDER_STYLE_OUTLINE = 1;
    public static final int SSA_BORDER_STYLE_UNKNOWN = -1;
    private static final String TAG = "SsaStyle";
    public final int alignment;
    public final boolean bold;
    public final int borderStyle;
    public final float fontSize;
    public final boolean italic;
    public final String name;
    public final Integer outlineColor;
    public final Integer primaryColor;
    public final boolean strikeout;
    public final boolean underline;

    /* compiled from: WazeSource */
    final class Format {
        public final int alignmentIndex;
        public final int boldIndex;
        public final int borderStyleIndex;
        public final int fontSizeIndex;
        public final int italicIndex;
        public final int length;
        public final int nameIndex;
        public final int outlineColorIndex;
        public final int primaryColorIndex;
        public final int strikeoutIndex;
        public final int underlineIndex;

        private Format(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
            this.nameIndex = i2;
            this.alignmentIndex = i3;
            this.primaryColorIndex = i4;
            this.outlineColorIndex = i5;
            this.fontSizeIndex = i6;
            this.boldIndex = i7;
            this.italicIndex = i8;
            this.underlineIndex = i9;
            this.strikeoutIndex = i10;
            this.borderStyleIndex = i11;
            this.length = i12;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        public static Format fromFormatLine(String str) {
            String[] strArrSplit = TextUtils.split(str.substring(7), ",");
            int i2 = 0;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            while (true) {
                int length = strArrSplit.length;
                if (i2 >= length) {
                    if (i3 != -1) {
                        return new Format(i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, length);
                    }
                    return null;
                }
                String strK = an.K(strArrSplit[i2].trim());
                switch (strK.hashCode()) {
                    case -1178781136:
                        if (!strK.equals(TtmlNode.ITALIC)) {
                            break;
                        } else {
                            i9 = i2;
                            break;
                        }
                    case -1026963764:
                        if (!strK.equals(TtmlNode.UNDERLINE)) {
                            break;
                        } else {
                            i10 = i2;
                            break;
                        }
                    case -192095652:
                        if (!strK.equals("strikeout")) {
                            break;
                        } else {
                            i11 = i2;
                            break;
                        }
                    case -70925746:
                        if (!strK.equals("primarycolour")) {
                            break;
                        } else {
                            i5 = i2;
                            break;
                        }
                    case 3029637:
                        if (!strK.equals(TtmlNode.BOLD)) {
                            break;
                        } else {
                            i8 = i2;
                            break;
                        }
                    case 3373707:
                        if (!strK.equals(HintConstants.AUTOFILL_HINT_NAME)) {
                            break;
                        } else {
                            i3 = i2;
                            break;
                        }
                    case 366554320:
                        if (!strK.equals("fontsize")) {
                            break;
                        } else {
                            i7 = i2;
                            break;
                        }
                    case 767321349:
                        if (!strK.equals("borderstyle")) {
                            break;
                        } else {
                            i12 = i2;
                            break;
                        }
                    case 1767875043:
                        if (!strK.equals("alignment")) {
                            break;
                        } else {
                            i4 = i2;
                            break;
                        }
                    case 1988365454:
                        if (!strK.equals("outlinecolour")) {
                            break;
                        } else {
                            i6 = i2;
                            break;
                        }
                }
                i2++;
            }
        }
    }

    /* compiled from: WazeSource */
    final class Overrides {
        private static final String TAG = "SsaStyle.Overrides";
        public final int alignment;
        public final PointF position;
        private static final Pattern BRACES_PATTERN = Pattern.compile("\\{([^}]*)\\}");
        private static final String PADDED_DECIMAL_PATTERN = "\\s*\\d+(?:\\.\\d+)?\\s*";
        private static final Pattern POSITION_PATTERN = Pattern.compile(Util.formatInvariant("\\\\pos\\((%1$s),(%1$s)\\)", PADDED_DECIMAL_PATTERN));
        private static final Pattern MOVE_PATTERN = Pattern.compile(Util.formatInvariant("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", PADDED_DECIMAL_PATTERN));
        private static final Pattern ALIGNMENT_OVERRIDE_PATTERN = Pattern.compile("\\\\an(\\d+)");

        private Overrides(int i2, PointF pointF) {
            this.alignment = i2;
            this.position = pointF;
        }

        private static int parseAlignmentOverride(String str) {
            Matcher matcher = ALIGNMENT_OVERRIDE_PATTERN.matcher(str);
            if (!matcher.find()) {
                return -1;
            }
            String strGroup = matcher.group(1);
            an.B(strGroup);
            return SsaStyle.parseAlignment(strGroup);
        }

        public static Overrides parseFromDialogue(String str) {
            Matcher matcher = BRACES_PATTERN.matcher(str);
            PointF pointF = null;
            int i2 = -1;
            while (matcher.find()) {
                String strGroup = matcher.group(1);
                an.B(strGroup);
                try {
                    PointF position = parsePosition(strGroup);
                    if (position != null) {
                        pointF = position;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int alignmentOverride = parseAlignmentOverride(strGroup);
                    if (alignmentOverride != -1) {
                        i2 = alignmentOverride;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new Overrides(i2, pointF);
        }

        private static PointF parsePosition(String str) throws NumberFormatException {
            String strGroup;
            String strGroup2;
            Matcher matcher = POSITION_PATTERN.matcher(str);
            Matcher matcher2 = MOVE_PATTERN.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    Log.i(TAG, "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            an.B(strGroup);
            float f2 = Float.parseFloat(strGroup.trim());
            an.B(strGroup2);
            return new PointF(f2, Float.parseFloat(strGroup2.trim()));
        }

        public static String stripStyleOverrides(String str) {
            return BRACES_PATTERN.matcher(str).replaceAll("");
        }
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SsaAlignment {
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SsaBorderStyle {
    }

    private SsaStyle(String str, int i2, Integer num, Integer num2, float f2, boolean z, boolean z2, boolean z3, boolean z4, int i3) {
        this.name = str;
        this.alignment = i2;
        this.primaryColor = num;
        this.outlineColor = num2;
        this.fontSize = f2;
        this.bold = z;
        this.italic = z2;
        this.underline = z3;
        this.strikeout = z4;
        this.borderStyle = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.media3.extractor.text.ssa.SsaStyle fromStyleLine(java.lang.String r19, androidx.media3.extractor.text.ssa.SsaStyle.Format r20) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.ssa.SsaStyle.fromStyleLine(java.lang.String, androidx.media3.extractor.text.ssa.SsaStyle$Format):androidx.media3.extractor.text.ssa.SsaStyle");
    }

    private static boolean isValidAlignment(int i2) {
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    private static boolean isValidBorderStyle(int i2) {
        return i2 == 1 || i2 == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int parseAlignment(String str) throws NumberFormatException {
        try {
            int i2 = Integer.parseInt(str.trim());
            if (isValidAlignment(i2)) {
                return i2;
            }
        } catch (NumberFormatException unused) {
        }
        Log.w(TAG, "Ignoring unknown alignment: ".concat(String.valueOf(str)));
        return -1;
    }

    private static boolean parseBooleanValue(String str) throws NumberFormatException {
        try {
            int i2 = Integer.parseInt(str);
            return i2 == 1 || i2 == -1;
        } catch (NumberFormatException e2) {
            Log.w(TAG, "Failed to parse boolean value: '" + str + "'", e2);
            return false;
        }
    }

    private static int parseBorderStyle(String str) throws NumberFormatException {
        try {
            int i2 = Integer.parseInt(str.trim());
            if (isValidBorderStyle(i2)) {
                return i2;
            }
        } catch (NumberFormatException unused) {
        }
        Log.w(TAG, "Ignoring unknown BorderStyle: ".concat(String.valueOf(str)));
        return -1;
    }

    public static Integer parseColor(String str) {
        try {
            long j2 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            an.l(j2 <= MuxerUtil.UNSIGNED_INT_MAX_VALUE);
            return Integer.valueOf(Color.argb(j.h(((j2 >> 24) & 255) ^ 255), j.h(j2 & 255), j.h((j2 >> 8) & 255), j.h((j2 >> 16) & 255)));
        } catch (IllegalArgumentException e2) {
            Log.w(TAG, "Failed to parse color expression: '" + str + "'", e2);
            return null;
        }
    }

    private static float parseFontSize(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e2) {
            Log.w(TAG, "Failed to parse font size: '" + str + "'", e2);
            return -3.4028235E38f;
        }
    }
}
