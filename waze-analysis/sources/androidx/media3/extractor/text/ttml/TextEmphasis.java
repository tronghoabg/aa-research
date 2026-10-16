package androidx.media3.extractor.text.ttml;

import android.text.TextUtils;
import com.google.d.b.an;
import com.google.d.d.ci;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class TextEmphasis {
    public static final int MARK_SHAPE_AUTO = -1;
    public static final int POSITION_OUTSIDE = -2;
    public final int markFill;
    public final int markShape;
    public final int position;
    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\s+");
    private static final ci<String> SINGLE_STYLE_VALUES = ci.q(TtmlNode.TEXT_EMPHASIS_AUTO, "none");
    private static final ci<String> MARK_SHAPE_VALUES = ci.r(TtmlNode.TEXT_EMPHASIS_MARK_DOT, TtmlNode.TEXT_EMPHASIS_MARK_SESAME, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
    private static final ci<String> MARK_FILL_VALUES = ci.q(TtmlNode.TEXT_EMPHASIS_MARK_FILLED, TtmlNode.TEXT_EMPHASIS_MARK_OPEN);
    private static final ci<String> POSITION_VALUES = ci.r(TtmlNode.ANNOTATION_POSITION_AFTER, TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_OUTSIDE);

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @interface MarkShape {
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Position {
    }

    private TextEmphasis(int i2, int i3, int i4) {
        this.markShape = i2;
        this.markFill = i3;
        this.position = i4;
    }

    public static TextEmphasis parse(String str) {
        if (str == null) {
            return null;
        }
        String strK = an.K(str.trim());
        if (strK.isEmpty()) {
            return null;
        }
        return parseWords(ci.n(TextUtils.split(strK, WHITESPACE_PATTERN)));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.media3.extractor.text.ttml.TextEmphasis parseWords(com.google.d.d.ci<java.lang.String> r7) {
        /*
            com.google.d.d.ci<java.lang.String> r0 = androidx.media3.extractor.text.ttml.TextEmphasis.POSITION_VALUES
            com.google.d.d.fl r0 = com.google.d.d.fo.c(r0, r7)
            java.lang.String r1 = "outside"
            java.lang.Object r0 = com.google.d.d.fo.P(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            int r2 = r0.hashCode()
            r3 = -1106037339(0xffffffffbe1335a5, float:-0.14375933)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L29
            r1 = 92734940(0x58705dc, float:1.2697491E-35)
            if (r2 == r1) goto L1f
            goto L31
        L1f:
            java.lang.String r1 = "after"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L31
            r0 = r4
            goto L32
        L29:
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L31
            r0 = -2
            goto L32
        L31:
            r0 = r5
        L32:
            com.google.d.d.ci<java.lang.String> r1 = androidx.media3.extractor.text.ttml.TextEmphasis.SINGLE_STYLE_VALUES
            com.google.d.d.fl r1 = com.google.d.d.fo.c(r1, r7)
            boolean r2 = r1.isEmpty()
            r3 = -1
            r6 = 0
            if (r2 != 0) goto L5f
            java.util.Iterator r7 = r1.iterator()
            java.lang.Object r7 = r7.next()
            java.lang.String r7 = (java.lang.String) r7
            int r1 = r7.hashCode()
            r2 = 3387192(0x33af38, float:4.746467E-39)
            if (r1 == r2) goto L54
            goto L77
        L54:
            java.lang.String r1 = "none"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L77
            r4 = r6
            goto Lc1
        L5f:
            com.google.d.d.ci<java.lang.String> r1 = androidx.media3.extractor.text.ttml.TextEmphasis.MARK_FILL_VALUES
            com.google.d.d.fl r1 = com.google.d.d.fo.c(r1, r7)
            com.google.d.d.ci<java.lang.String> r2 = androidx.media3.extractor.text.ttml.TextEmphasis.MARK_SHAPE_VALUES
            com.google.d.d.fl r7 = com.google.d.d.fo.c(r2, r7)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L79
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L79
        L77:
            r4 = r3
            goto Lc1
        L79:
            java.lang.String r2 = "filled"
            java.lang.Object r1 = com.google.d.d.fo.P(r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.hashCode()
            r3 = 3417674(0x34264a, float:4.789181E-39)
            if (r2 == r3) goto L8b
            goto L95
        L8b:
            java.lang.String r2 = "open"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L95
            r6 = r4
            goto L96
        L95:
            r6 = r5
        L96:
            java.lang.String r1 = "circle"
            java.lang.Object r7 = com.google.d.d.fo.P(r7, r1)
            java.lang.String r7 = (java.lang.String) r7
            int r1 = r7.hashCode()
            r2 = -905816648(0xffffffffca0255b8, float:-2135406.0)
            if (r1 == r2) goto Lb6
            r2 = 99657(0x18549, float:1.39649E-40)
            if (r1 == r2) goto Lad
            goto Lc0
        Lad:
            java.lang.String r1 = "dot"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto Lc0
            goto Lc1
        Lb6:
            java.lang.String r1 = "sesame"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto Lc0
            r4 = 3
            goto Lc1
        Lc0:
            r4 = r5
        Lc1:
            androidx.media3.extractor.text.ttml.TextEmphasis r7 = new androidx.media3.extractor.text.ttml.TextEmphasis
            r7.<init>(r4, r6, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.ttml.TextEmphasis.parseWords(com.google.d.d.ci):androidx.media3.extractor.text.ttml.TextEmphasis");
    }
}
