package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextDelegateKt {
    public static final int ceilToIntPx(float f2) {
        return Math.round((float) Math.ceil(f2));
    }

    /* renamed from: updateTextDelegate-rm0N8CA, reason: not valid java name */
    public static final TextDelegate m3383updateTextDelegaterm0N8CA(TextDelegate textDelegate, AnnotatedString annotatedString, TextStyle textStyle, Density density, FontFamily.Resolver resolver, boolean z, int i2, int i3, int i4, List<AnnotatedString.Range<Placeholder>> list) {
        FontFamily.Resolver resolver2;
        boolean z2;
        int i5;
        int i6;
        int i7;
        List<AnnotatedString.Range<Placeholder>> list2;
        if (x.n(textDelegate.getText(), annotatedString) && x.n(textDelegate.getStyle(), textStyle)) {
            z2 = z;
            if (textDelegate.getSoftWrap() == z2) {
                i5 = i2;
                if (!TextOverflow.m11059equalsimpl0(textDelegate.m3381getOverflowgIe3tQ8(), i5)) {
                    resolver2 = resolver;
                    i6 = i3;
                    i7 = i4;
                    list2 = list;
                    return new TextDelegate(annotatedString, textStyle, i6, i7, z2, i5, density, resolver2, list2, null);
                }
                i6 = i3;
                if (textDelegate.getMaxLines() != i6) {
                    resolver2 = resolver;
                    i7 = i4;
                    list2 = list;
                    return new TextDelegate(annotatedString, textStyle, i6, i7, z2, i5, density, resolver2, list2, null);
                }
                i7 = i4;
                if (textDelegate.getMinLines() != i7 || !x.n(textDelegate.getDensity(), density)) {
                    resolver2 = resolver;
                    list2 = list;
                    return new TextDelegate(annotatedString, textStyle, i6, i7, z2, i5, density, resolver2, list2, null);
                }
                list2 = list;
                if (x.n(textDelegate.getPlaceholders(), list2)) {
                    resolver2 = resolver;
                    if (textDelegate.getFontFamilyResolver() == resolver2) {
                        return textDelegate;
                    }
                } else {
                    resolver2 = resolver;
                }
                return new TextDelegate(annotatedString, textStyle, i6, i7, z2, i5, density, resolver2, list2, null);
            }
            resolver2 = resolver;
        } else {
            resolver2 = resolver;
            z2 = z;
        }
        i5 = i2;
        i6 = i3;
        i7 = i4;
        list2 = list;
        return new TextDelegate(annotatedString, textStyle, i6, i7, z2, i5, density, resolver2, list2, null);
    }

    /* renamed from: updateTextDelegate-rm0N8CA$default, reason: not valid java name */
    public static /* synthetic */ TextDelegate m3384updateTextDelegaterm0N8CA$default(TextDelegate textDelegate, AnnotatedString annotatedString, TextStyle textStyle, Density density, FontFamily.Resolver resolver, boolean z, int i2, int i3, int i4, List list, int i5, Object obj) {
        int i6;
        TextDelegate textDelegate2;
        AnnotatedString annotatedString2;
        TextStyle textStyle2;
        Density density2;
        FontFamily.Resolver resolver2;
        List list2;
        int iM11068getClipgIe3tQ8 = (i5 & 64) != 0 ? TextOverflow.Companion.m11068getClipgIe3tQ8() : i2;
        boolean z2 = (!((i5 & 32) == 0)) | z;
        int i7 = (i5 & 128) != 0 ? Integer.MAX_VALUE : i3;
        if ((i5 & 256) != 0) {
            i6 = 1;
            annotatedString2 = annotatedString;
            textStyle2 = textStyle;
            density2 = density;
            resolver2 = resolver;
            list2 = list;
            textDelegate2 = textDelegate;
        } else {
            i6 = i4;
            textDelegate2 = textDelegate;
            annotatedString2 = annotatedString;
            textStyle2 = textStyle;
            density2 = density;
            resolver2 = resolver;
            list2 = list;
        }
        return m3383updateTextDelegaterm0N8CA(textDelegate2, annotatedString2, textStyle2, density2, resolver2, z2, iM11068getClipgIe3tQ8, i7, i6, list2);
    }
}
