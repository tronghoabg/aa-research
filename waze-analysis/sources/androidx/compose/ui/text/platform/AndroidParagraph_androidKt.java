package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.AndroidParagraph;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidParagraph_androidKt {
    public static final Paragraph ActualParagraph(String str, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, List<AnnotatedString.Range<Placeholder>> list2, int i2, boolean z, float f2, Density density, Font.ResourceLoader resourceLoader) {
        return new AndroidParagraph(new AndroidParagraphIntrinsics(str, textStyle, list, list2, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader), density), i2, z ? TextOverflow.Companion.m11069getEllipsisgIe3tQ8() : TextOverflow.Companion.m11068getClipgIe3tQ8(), ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f2), 0, 0, 13, null), null);
    }

    /* renamed from: ActualParagraph-4FmOz70, reason: not valid java name */
    public static final Paragraph m10841ActualParagraph4FmOz70(ParagraphIntrinsics paragraphIntrinsics, int i2, int i3, long j2) {
        x.d(paragraphIntrinsics, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidParagraphIntrinsics");
        return new AndroidParagraph((AndroidParagraphIntrinsics) paragraphIntrinsics, i2, i3, j2, null);
    }

    /* renamed from: ActualParagraph-XGqx6AY, reason: not valid java name */
    public static final Paragraph m10842ActualParagraphXGqx6AY(String str, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, List<AnnotatedString.Range<Placeholder>> list2, int i2, int i3, long j2, Density density, FontFamily.Resolver resolver) {
        return new AndroidParagraph(new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density), i2, i3, j2, null);
    }
}
