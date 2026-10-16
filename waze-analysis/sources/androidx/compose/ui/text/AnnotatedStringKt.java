package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.intl.LocaleList;
import h.a.ac;
import h.a.i;
import h.a.u;
import h.ab;
import h.b.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.x;
import h.k.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AnnotatedStringKt {
    private static final AnnotatedString EmptyAnnotatedString = new AnnotatedString("", null, 2, 0 == true ? 1 : 0);

    public static final AnnotatedString AnnotatedString(String str, SpanStyle spanStyle, ParagraphStyle paragraphStyle) {
        ac acVarSingletonList;
        List listSingletonList = Collections.singletonList(new AnnotatedString.Range(spanStyle, 0, str.length()));
        x.e(listSingletonList, "singletonList(...)");
        if (paragraphStyle == null) {
            acVarSingletonList = ac.f47967a;
        } else {
            acVarSingletonList = Collections.singletonList(new AnnotatedString.Range(paragraphStyle, 0, str.length()));
            x.e(acVarSingletonList, "singletonList(...)");
        }
        return new AnnotatedString(str, listSingletonList, acVarSingletonList);
    }

    public static /* synthetic */ AnnotatedString AnnotatedString$default(String str, SpanStyle spanStyle, ParagraphStyle paragraphStyle, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            paragraphStyle = null;
        }
        return AnnotatedString(str, spanStyle, paragraphStyle);
    }

    public static final AnnotatedString buildAnnotatedString(l<? super AnnotatedString.Builder, ab> lVar) {
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        lVar.invoke(builder);
        return builder.toAnnotatedString();
    }

    public static final AnnotatedString capitalize(AnnotatedString annotatedString, final LocaleList localeList) {
        return JvmAnnotatedString_jvmAndAndroidKt.transform(annotatedString, new q() { // from class: androidx.compose.ui.text.AnnotatedStringKt$$ExternalSyntheticLambda1
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AnnotatedStringKt.capitalize$lambda$0(localeList, (String) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        });
    }

    public static /* synthetic */ AnnotatedString capitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return capitalize(annotatedString, localeList);
    }

    static final String capitalize$lambda$0(LocaleList localeList, String str, int i2, int i3) {
        if (i2 == 0) {
            String strSubstring = str.substring(0, i3);
            x.e(strSubstring, "substring(...)");
            return StringKt.capitalize(strSubstring, localeList);
        }
        String strSubstring2 = str.substring(i2, i3);
        x.e(strSubstring2, "substring(...)");
        return strSubstring2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> constructAnnotationsFromSpansAndParagraphs(List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<ParagraphStyle>> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        if (list2.isEmpty()) {
            return list;
        }
        if (list.isEmpty()) {
            return list2;
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(list.get(i2));
        }
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            arrayList.add(list2.get(i3));
        }
        return arrayList;
    }

    public static final boolean contains(int i2, int i3, int i4, int i5) {
        if (i2 > i4 || i5 > i3) {
            return false;
        }
        if (i3 == i5) {
            if ((i4 == i5) != (i2 == i3)) {
                return false;
            }
        }
        return true;
    }

    public static final AnnotatedString decapitalize(AnnotatedString annotatedString, final LocaleList localeList) {
        return JvmAnnotatedString_jvmAndAndroidKt.transform(annotatedString, new q() { // from class: androidx.compose.ui.text.AnnotatedStringKt$$ExternalSyntheticLambda0
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AnnotatedStringKt.decapitalize$lambda$0(localeList, (String) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        });
    }

    public static /* synthetic */ AnnotatedString decapitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return decapitalize(annotatedString, localeList);
    }

    static final String decapitalize$lambda$0(LocaleList localeList, String str, int i2, int i3) {
        if (i2 == 0) {
            String strSubstring = str.substring(0, i3);
            x.e(strSubstring, "substring(...)");
            return StringKt.decapitalize(strSubstring, localeList);
        }
        String strSubstring2 = str.substring(i2, i3);
        x.e(strSubstring2, "substring(...)");
        return strSubstring2;
    }

    public static final AnnotatedString emptyAnnotatedString() {
        return EmptyAnnotatedString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> List<AnnotatedString.Range<T>> filterRanges(List<? extends AnnotatedString.Range<? extends T>> list, int i2, int i3) {
        if (i2 > i3) {
            InlineClassHelperKt.throwIllegalArgumentException("start (" + i2 + ") should be less than or equal to end (" + i3 + ')');
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            AnnotatedString.Range<? extends T> range = list.get(i4);
            if (intersect(i2, i3, range.getStart(), range.getEnd())) {
                arrayList.add(new AnnotatedString.Range(range.getItem(), Math.max(i2, range.getStart()) - i2, Math.min(i3, range.getEnd()) - i2, range.getTag()));
            }
        }
        ArrayList arrayList2 = arrayList;
        return true != arrayList2.isEmpty() ? arrayList2 : null;
    }

    private static final List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> getLocalAnnotations(AnnotatedString annotatedString, int i2, int i3, l<? super AnnotatedString.Annotation, Boolean> lVar) {
        List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> annotations$ui_text;
        if (i2 == i3 || (annotations$ui_text = annotatedString.getAnnotations$ui_text()) == null) {
            return null;
        }
        int i4 = 0;
        if (i2 == 0) {
            if (i3 >= annotatedString.getText().length()) {
                if (lVar == null) {
                    return annotations$ui_text;
                }
                ArrayList arrayList = new ArrayList(annotations$ui_text.size());
                int size = annotations$ui_text.size();
                while (i4 < size) {
                    AnnotatedString.Range<? extends AnnotatedString.Annotation> range = annotations$ui_text.get(i4);
                    if (lVar.invoke(range.getItem()).booleanValue()) {
                        arrayList.add(range);
                    }
                    i4++;
                }
                return arrayList;
            }
            i2 = 0;
        }
        ArrayList arrayList2 = new ArrayList(annotations$ui_text.size());
        int size2 = annotations$ui_text.size();
        while (i4 < size2) {
            AnnotatedString.Range<? extends AnnotatedString.Annotation> range2 = annotations$ui_text.get(i4);
            if ((lVar == null || lVar.invoke(range2.getItem()).booleanValue()) && intersect(i2, i3, range2.getStart(), range2.getEnd())) {
                arrayList2.add(new AnnotatedString.Range(range2.getItem(), n.j(range2.getStart(), i2, i3) - i2, n.j(range2.getEnd(), i2, i3) - i2, range2.getTag()));
            }
            i4++;
        }
        return arrayList2;
    }

    static /* synthetic */ List getLocalAnnotations$default(AnnotatedString annotatedString, int i2, int i3, l lVar, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            lVar = null;
        }
        return getLocalAnnotations(annotatedString, i2, i3, lVar);
    }

    private static final List<AnnotatedString.Range<ParagraphStyle>> getLocalParagraphStyles(AnnotatedString annotatedString, int i2, int i3) {
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text;
        if (i2 == i3 || (paragraphStylesOrNull$ui_text = annotatedString.getParagraphStylesOrNull$ui_text()) == null) {
            return null;
        }
        if (i2 == 0) {
            if (i3 >= annotatedString.getText().length()) {
                return paragraphStylesOrNull$ui_text;
            }
            i2 = 0;
        }
        ArrayList arrayList = new ArrayList(paragraphStylesOrNull$ui_text.size());
        int size = paragraphStylesOrNull$ui_text.size();
        for (int i4 = 0; i4 < size; i4++) {
            AnnotatedString.Range<ParagraphStyle> range = paragraphStylesOrNull$ui_text.get(i4);
            if (intersect(i2, i3, range.getStart(), range.getEnd())) {
                ArrayList arrayList2 = arrayList;
                ParagraphStyle item = range.getItem();
                int start = range.getStart();
                if (start < i2) {
                    start = i2;
                }
                if (start > i3) {
                    start = i3;
                }
                int i5 = start - i2;
                int end = range.getEnd();
                if (end < i2) {
                    end = i2;
                }
                if (end > i3) {
                    end = i3;
                }
                arrayList2.add(new AnnotatedString.Range(item, i5, end - i2));
            }
        }
        return arrayList;
    }

    public static final boolean intersect(int i2, int i3, int i4, int i5) {
        return ((i2 < i5) & (i4 < i3)) | (((i2 == i3) | (i4 == i5)) & (i2 == i4));
    }

    public static final <T> List<T> mapEachParagraphStyle(AnnotatedString annotatedString, ParagraphStyle paragraphStyle, p<? super AnnotatedString, ? super AnnotatedString.Range<ParagraphStyle>, ? extends T> pVar) {
        List<AnnotatedString.Range<ParagraphStyle>> listNormalizedParagraphStyles = normalizedParagraphStyles(annotatedString, paragraphStyle);
        ArrayList arrayList = new ArrayList(listNormalizedParagraphStyles.size());
        int size = listNormalizedParagraphStyles.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range<ParagraphStyle> range = listNormalizedParagraphStyles.get(i2);
            arrayList.add(pVar.invoke(substringWithoutParagraphStyles(annotatedString, range.getStart(), range.getEnd()), range));
        }
        return arrayList;
    }

    public static final List<AnnotatedString.Range<ParagraphStyle>> normalizedParagraphStyles(AnnotatedString annotatedString, ParagraphStyle paragraphStyle) {
        ac acVarAl;
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text = annotatedString.getParagraphStylesOrNull$ui_text();
        if (paragraphStylesOrNull$ui_text == null || (acVarAl = i.al(paragraphStylesOrNull$ui_text, new Comparator() { // from class: androidx.compose.ui.text.AnnotatedStringKt$normalizedParagraphStyles$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return a.a(Integer.valueOf(((AnnotatedString.Range) t).getStart()), Integer.valueOf(((AnnotatedString.Range) t2).getStart()));
            }
        })) == null) {
            acVarAl = ac.f47967a;
        }
        ArrayList arrayList = new ArrayList();
        u uVar = new u();
        int size = acVarAl.size();
        int end = 0;
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range range = (AnnotatedString.Range) acVarAl.get(i2);
            AnnotatedString.Range rangeCopy$default = AnnotatedString.Range.copy$default(range, paragraphStyle.merge((ParagraphStyle) range.getItem()), 0, 0, null, 14, null);
            while (end < rangeCopy$default.getStart()) {
                u uVar2 = uVar;
                if (uVar2.isEmpty()) {
                    break;
                }
                AnnotatedString.Range range2 = (AnnotatedString.Range) uVar.c();
                if (rangeCopy$default.getStart() < range2.getEnd()) {
                    arrayList.add(new AnnotatedString.Range(range2.getItem(), end, rangeCopy$default.getStart()));
                    end = rangeCopy$default.getStart();
                } else {
                    arrayList.add(new AnnotatedString.Range(range2.getItem(), end, range2.getEnd()));
                    end = range2.getEnd();
                    while (!uVar2.isEmpty() && end == ((AnnotatedString.Range) uVar.c()).getEnd()) {
                        uVar.removeLast();
                    }
                }
            }
            if (end < rangeCopy$default.getStart()) {
                arrayList.add(new AnnotatedString.Range(paragraphStyle, end, rangeCopy$default.getStart()));
                end = rangeCopy$default.getStart();
            }
            AnnotatedString.Range range3 = (AnnotatedString.Range) uVar.d();
            if (range3 == null) {
                uVar.add(new AnnotatedString.Range(rangeCopy$default.getItem(), rangeCopy$default.getStart(), rangeCopy$default.getEnd()));
            } else if (range3.getStart() == rangeCopy$default.getStart() && range3.getEnd() == rangeCopy$default.getEnd()) {
                uVar.removeLast();
                uVar.add(new AnnotatedString.Range(((ParagraphStyle) range3.getItem()).merge((ParagraphStyle) rangeCopy$default.getItem()), rangeCopy$default.getStart(), rangeCopy$default.getEnd()));
            } else if (range3.getStart() == range3.getEnd()) {
                arrayList.add(new AnnotatedString.Range(range3.getItem(), range3.getStart(), range3.getEnd()));
                uVar.removeLast();
                uVar.add(new AnnotatedString.Range(rangeCopy$default.getItem(), rangeCopy$default.getStart(), rangeCopy$default.getEnd()));
            } else {
                if (range3.getEnd() < rangeCopy$default.getEnd()) {
                    throw new IllegalArgumentException();
                }
                uVar.add(new AnnotatedString.Range(((ParagraphStyle) range3.getItem()).merge((ParagraphStyle) rangeCopy$default.getItem()), rangeCopy$default.getStart(), rangeCopy$default.getEnd()));
            }
        }
        while (end <= annotatedString.getText().length()) {
            u uVar3 = uVar;
            if (uVar3.isEmpty()) {
                break;
            }
            AnnotatedString.Range range4 = (AnnotatedString.Range) uVar.c();
            arrayList.add(new AnnotatedString.Range(range4.getItem(), end, range4.getEnd()));
            end = range4.getEnd();
            while (!uVar3.isEmpty() && end == ((AnnotatedString.Range) uVar.c()).getEnd()) {
                uVar.removeLast();
            }
        }
        if (end < annotatedString.getText().length()) {
            arrayList.add(new AnnotatedString.Range(paragraphStyle, end, annotatedString.getText().length()));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new AnnotatedString.Range(paragraphStyle, 0, 0));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString substringWithoutParagraphStyles(AnnotatedString annotatedString, int i2, int i3) {
        String strSubstring;
        if (i2 != i3) {
            strSubstring = annotatedString.getText().substring(i2, i3);
            x.e(strSubstring, "substring(...)");
        } else {
            strSubstring = "";
        }
        ac localAnnotations = getLocalAnnotations(annotatedString, i2, i3, new l() { // from class: androidx.compose.ui.text.AnnotatedStringKt$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AnnotatedStringKt.substringWithoutParagraphStyles$lambda$0((AnnotatedString.Annotation) obj));
            }
        });
        if (localAnnotations == null) {
            localAnnotations = ac.f47967a;
        }
        return new AnnotatedString(strSubstring, localAnnotations);
    }

    static final boolean substringWithoutParagraphStyles$lambda$0(AnnotatedString.Annotation annotation) {
        return !(annotation instanceof ParagraphStyle);
    }

    public static final AnnotatedString toLowerCase(AnnotatedString annotatedString, final LocaleList localeList) {
        return JvmAnnotatedString_jvmAndAndroidKt.transform(annotatedString, new q() { // from class: androidx.compose.ui.text.AnnotatedStringKt$$ExternalSyntheticLambda4
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AnnotatedStringKt.toLowerCase$lambda$0(localeList, (String) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        });
    }

    public static /* synthetic */ AnnotatedString toLowerCase$default(AnnotatedString annotatedString, LocaleList localeList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return toLowerCase(annotatedString, localeList);
    }

    static final String toLowerCase$lambda$0(LocaleList localeList, String str, int i2, int i3) {
        String strSubstring = str.substring(i2, i3);
        x.e(strSubstring, "substring(...)");
        return StringKt.toLowerCase(strSubstring, localeList);
    }

    public static final AnnotatedString toUpperCase(AnnotatedString annotatedString, final LocaleList localeList) {
        return JvmAnnotatedString_jvmAndAndroidKt.transform(annotatedString, new q() { // from class: androidx.compose.ui.text.AnnotatedStringKt$$ExternalSyntheticLambda2
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AnnotatedStringKt.toUpperCase$lambda$0(localeList, (String) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        });
    }

    public static /* synthetic */ AnnotatedString toUpperCase$default(AnnotatedString annotatedString, LocaleList localeList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return toUpperCase(annotatedString, localeList);
    }

    static final String toUpperCase$lambda$0(LocaleList localeList, String str, int i2, int i3) {
        String strSubstring = str.substring(i2, i3);
        x.e(strSubstring, "substring(...)");
        return StringKt.toUpperCase(strSubstring, localeList);
    }

    public static final <R> R withAnnotation(AnnotatedString.Builder builder, TtsAnnotation ttsAnnotation, l<? super AnnotatedString.Builder, ? extends R> lVar) {
        int iPushTtsAnnotation = builder.pushTtsAnnotation(ttsAnnotation);
        try {
            return lVar.invoke(builder);
        } finally {
            builder.pop(iPushTtsAnnotation);
        }
    }

    public static final <R> R withLink(AnnotatedString.Builder builder, LinkAnnotation linkAnnotation, l<? super AnnotatedString.Builder, ? extends R> lVar) {
        int iPushLink = builder.pushLink(linkAnnotation);
        try {
            return lVar.invoke(builder);
        } finally {
            builder.pop(iPushLink);
        }
    }

    public static final <R> R withStyle(AnnotatedString.Builder builder, ParagraphStyle paragraphStyle, l<? super AnnotatedString.Builder, ? extends R> lVar) {
        int iPushStyle = builder.pushStyle(paragraphStyle);
        try {
            return lVar.invoke(builder);
        } finally {
            builder.pop(iPushStyle);
        }
    }

    public static final <R> R withAnnotation(AnnotatedString.Builder builder, UrlAnnotation urlAnnotation, l<? super AnnotatedString.Builder, ? extends R> lVar) {
        int iPushUrlAnnotation = builder.pushUrlAnnotation(urlAnnotation);
        try {
            return lVar.invoke(builder);
        } finally {
            builder.pop(iPushUrlAnnotation);
        }
    }

    public static final <R> R withStyle(AnnotatedString.Builder builder, SpanStyle spanStyle, l<? super AnnotatedString.Builder, ? extends R> lVar) {
        int iPushStyle = builder.pushStyle(spanStyle);
        try {
            return lVar.invoke(builder);
        } finally {
            builder.pop(iPushStyle);
        }
    }

    public static final <R> R withAnnotation(AnnotatedString.Builder builder, String str, String str2, l<? super AnnotatedString.Builder, ? extends R> lVar) {
        int iPushStringAnnotation = builder.pushStringAnnotation(str, str2);
        try {
            return lVar.invoke(builder);
        } finally {
            builder.pop(iPushStringAnnotation);
        }
    }

    public static final AnnotatedString AnnotatedString(String str, ParagraphStyle paragraphStyle) {
        ac acVar = ac.f47967a;
        List listSingletonList = Collections.singletonList(new AnnotatedString.Range(paragraphStyle, 0, str.length()));
        x.e(listSingletonList, "singletonList(...)");
        return new AnnotatedString(str, acVar, listSingletonList);
    }
}
