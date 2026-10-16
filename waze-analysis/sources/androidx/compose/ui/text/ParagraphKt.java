package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import h.a.ac;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ParagraphKt {
    public static final int DefaultMaxLines = Integer.MAX_VALUE;

    public static final Paragraph Paragraph(String str, TextStyle textStyle, float f2, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i2, boolean z) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m10842ActualParagraphXGqx6AY(str, textStyle, list, list2, i2, z ? TextOverflow.Companion.m11069getEllipsisgIe3tQ8() : TextOverflow.Companion.m11068getClipgIe3tQ8(), ConstraintsKt.Constraints$default(0, ceilToInt(f2), 0, 0, 13, null), density, resolver);
    }

    /* renamed from: Paragraph-UdtVg6A, reason: not valid java name */
    public static final /* synthetic */ Paragraph m10423ParagraphUdtVg6A(String str, TextStyle textStyle, long j2, Density density, FontFamily.Resolver resolver, List list, List list2, int i2, boolean z) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m10842ActualParagraphXGqx6AY(str, textStyle, list, list2, i2, z ? TextOverflow.Companion.m11069getEllipsisgIe3tQ8() : TextOverflow.Companion.m11068getClipgIe3tQ8(), j2, density, resolver);
    }

    /* renamed from: Paragraph-Ul8oQg4, reason: not valid java name */
    public static final Paragraph m10425ParagraphUl8oQg4(String str, TextStyle textStyle, long j2, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i2, int i3) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m10842ActualParagraphXGqx6AY(str, textStyle, list, list2, i2, i3, j2, density, resolver);
    }

    /* renamed from: Paragraph-_EkL_-Y, reason: not valid java name */
    public static final /* synthetic */ Paragraph m10427Paragraph_EkL_Y(ParagraphIntrinsics paragraphIntrinsics, long j2, int i2, boolean z) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m10841ActualParagraph4FmOz70(paragraphIntrinsics, i2, z ? TextOverflow.Companion.m11069getEllipsisgIe3tQ8() : TextOverflow.Companion.m11068getClipgIe3tQ8(), j2);
    }

    /* renamed from: Paragraph-_EkL_-Y$default, reason: not valid java name */
    public static /* synthetic */ Paragraph m10428Paragraph_EkL_Y$default(ParagraphIntrinsics paragraphIntrinsics, long j2, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return m10427Paragraph_EkL_Y(paragraphIntrinsics, j2, i2, z & ((i3 & 8) == 0));
    }

    /* renamed from: Paragraph-czeN-Hc, reason: not valid java name */
    public static final Paragraph m10429ParagraphczeNHc(ParagraphIntrinsics paragraphIntrinsics, long j2, int i2, int i3) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m10841ActualParagraph4FmOz70(paragraphIntrinsics, i2, i3, j2);
    }

    /* renamed from: Paragraph-czeN-Hc$default, reason: not valid java name */
    public static /* synthetic */ Paragraph m10430ParagraphczeNHc$default(ParagraphIntrinsics paragraphIntrinsics, long j2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            i3 = TextOverflow.Companion.m11068getClipgIe3tQ8();
        }
        if ((i4 & 4) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return m10429ParagraphczeNHc(paragraphIntrinsics, j2, i2, i3);
    }

    public static final int ceilToInt(float f2) {
        return (int) Math.ceil(f2);
    }

    public static final Paragraph Paragraph(ParagraphIntrinsics paragraphIntrinsics, int i2, boolean z, float f2) {
        int iM11068getClipgIe3tQ8;
        if (z) {
            iM11068getClipgIe3tQ8 = TextOverflow.Companion.m11069getEllipsisgIe3tQ8();
        } else {
            iM11068getClipgIe3tQ8 = TextOverflow.Companion.m11068getClipgIe3tQ8();
        }
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m10841ActualParagraph4FmOz70(paragraphIntrinsics, i2, iM11068getClipgIe3tQ8, ConstraintsKt.Constraints$default(0, ceilToInt(f2), 0, 0, 13, null));
    }

    public static final Paragraph Paragraph(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i2, boolean z, float f2, Density density, Font.ResourceLoader resourceLoader) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.ActualParagraph(str, textStyle, list, list2, i2, z, f2, density, resourceLoader);
    }

    public static /* synthetic */ Paragraph Paragraph$default(ParagraphIntrinsics paragraphIntrinsics, int i2, boolean z, float f2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return Paragraph(paragraphIntrinsics, i2, z & ((i3 & 4) == 0), f2);
    }

    public static /* synthetic */ Paragraph Paragraph$default(String str, TextStyle textStyle, List list, List list2, int i2, boolean z, float f2, Density density, Font.ResourceLoader resourceLoader, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            list = ac.f47967a;
        }
        List list3 = list;
        if ((i3 & 8) != 0) {
            list2 = ac.f47967a;
        }
        List list4 = list2;
        if ((i3 & 16) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return Paragraph(str, textStyle, (List<AnnotatedString.Range<SpanStyle>>) list3, (List<AnnotatedString.Range<Placeholder>>) list4, i2, ((i3 & 32) == 0) & z, f2, density, resourceLoader);
    }
}
