package androidx.compose.ui.text;

import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import h.a.ac;
import h.a.i;
import h.b.a;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import h.k;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AnnotatedString implements CharSequence {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<AnnotatedString, ?> Saver = SaversKt.getAnnotatedStringSaver();
    private final List<Range<? extends Annotation>> annotations;
    private final List<Range<ParagraphStyle>> paragraphStylesOrNull;
    private final List<Range<SpanStyle>> spanStylesOrNull;
    private final String text;

    /* compiled from: WazeSource */
    public interface Annotation {
    }

    /* compiled from: WazeSource */
    final class ExhaustiveAnnotation implements Annotation {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnnotatedString(List<? extends Range<? extends Annotation>> list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.annotations = list;
        this.text = str;
        if (list != 0) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i2 = 0; i2 < size; i2++) {
                Range<SpanStyle> range = (Range) list.get(i2);
                if (range.getItem() instanceof SpanStyle) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    x.d(range, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>");
                    arrayList.add(range);
                } else if (range.getItem() instanceof ParagraphStyle) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    x.d(range, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.ParagraphStyle>");
                    arrayList2.add(range);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.spanStylesOrNull = arrayList;
        this.paragraphStylesOrNull = arrayList2;
        List listAl = arrayList2 != null ? i.al(arrayList2, new Comparator() { // from class: androidx.compose.ui.text.AnnotatedString$special$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return a.a(Integer.valueOf(((AnnotatedString.Range) t).getStart()), Integer.valueOf(((AnnotatedString.Range) t2).getStart()));
            }
        }) : null;
        List list2 = listAl;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        MutableIntList mutableIntListMutableIntListOf = IntListKt.mutableIntListOf(((Range) i.P(listAl)).getEnd());
        int size2 = listAl.size();
        for (int i3 = 1; i3 < size2; i3++) {
            Range range2 = (Range) listAl.get(i3);
            while (true) {
                if (mutableIntListMutableIntListOf._size == 0) {
                    break;
                }
                int iLast = mutableIntListMutableIntListOf.last();
                if (range2.getStart() >= iLast) {
                    mutableIntListMutableIntListOf.removeAt(r2._size - 1);
                } else if (range2.getEnd() > iLast) {
                    InlineClassHelperKt.throwIllegalArgumentException("Paragraph overlap not allowed, end " + range2.getEnd() + " should be less than or equal to " + iLast);
                }
            }
            mutableIntListMutableIntListOf.add(range2.getEnd());
        }
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i2) {
        return get(i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnnotatedString)) {
            return false;
        }
        AnnotatedString annotatedString = (AnnotatedString) obj;
        return x.n(this.text, annotatedString.text) && x.n(this.annotations, annotatedString.annotations);
    }

    public final AnnotatedString flatMapAnnotations(l<? super Range<? extends Annotation>, ? extends List<? extends Range<? extends Annotation>>> lVar) {
        Builder builder = new Builder(this);
        builder.flatMapAnnotations$ui_text(lVar);
        return builder.toAnnotatedString();
    }

    public char get(int i2) {
        return this.text.charAt(i2);
    }

    public final List<Range<? extends Annotation>> getAnnotations$ui_text() {
        return this.annotations;
    }

    public int getLength() {
        return this.text.length();
    }

    public final List<Range<LinkAnnotation>> getLinkAnnotations(int i2, int i3) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list == null) {
            return ac.f47967a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            Range<? extends Annotation> range = list.get(i4);
            Range<? extends Annotation> range2 = range;
            if ((range2.getItem() instanceof LinkAnnotation) && AnnotatedStringKt.intersect(i2, i3, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        return arrayList;
    }

    public final List<Range<ParagraphStyle>> getParagraphStyles() {
        List<Range<ParagraphStyle>> list = this.paragraphStylesOrNull;
        return list == null ? ac.f47967a : list;
    }

    public final List<Range<ParagraphStyle>> getParagraphStylesOrNull$ui_text() {
        return this.paragraphStylesOrNull;
    }

    public final List<Range<SpanStyle>> getSpanStyles() {
        List<Range<SpanStyle>> list = this.spanStylesOrNull;
        return list == null ? ac.f47967a : list;
    }

    public final List<Range<SpanStyle>> getSpanStylesOrNull$ui_text() {
        return this.spanStylesOrNull;
    }

    public final List<Range<String>> getStringAnnotations(String str, int i2, int i3) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list == null) {
            return ac.f47967a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            Range<? extends Annotation> range = list.get(i4);
            if ((range.getItem() instanceof StringAnnotation) && x.n(str, range.getTag()) && AnnotatedStringKt.intersect(i2, i3, range.getStart(), range.getEnd())) {
                arrayList.add(StringAnnotationKt.unbox(range));
            }
        }
        return arrayList;
    }

    public final String getText() {
        return this.text;
    }

    public final List<Range<TtsAnnotation>> getTtsAnnotations(int i2, int i3) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list == null) {
            return ac.f47967a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            Range<? extends Annotation> range = list.get(i4);
            Range<? extends Annotation> range2 = range;
            if ((range2.getItem() instanceof TtsAnnotation) && AnnotatedStringKt.intersect(i2, i3, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        return arrayList;
    }

    public final List<Range<UrlAnnotation>> getUrlAnnotations(int i2, int i3) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list == null) {
            return ac.f47967a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            Range<? extends Annotation> range = list.get(i4);
            Range<? extends Annotation> range2 = range;
            if ((range2.getItem() instanceof UrlAnnotation) && AnnotatedStringKt.intersect(i2, i3, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        return arrayList;
    }

    public final boolean hasEqualAnnotations(AnnotatedString annotatedString) {
        return x.n(this.annotations, annotatedString.annotations);
    }

    public final boolean hasLinkAnnotations(int i2, int i3) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                Range<? extends Annotation> range = list.get(i4);
                if ((range.getItem() instanceof LinkAnnotation) && AnnotatedStringKt.intersect(i2, i3, range.getStart(), range.getEnd())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean hasStringAnnotations(String str, int i2, int i3) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                Range<? extends Annotation> range = list.get(i4);
                if ((range.getItem() instanceof StringAnnotation) && x.n(str, range.getTag()) && AnnotatedStringKt.intersect(i2, i3, range.getStart(), range.getEnd())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        List<Range<? extends Annotation>> list = this.annotations;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    public final AnnotatedString mapAnnotations(l<? super Range<? extends Annotation>, ? extends Range<? extends Annotation>> lVar) {
        Builder builder = new Builder(this);
        builder.mapAnnotations$ui_text(lVar);
        return builder.toAnnotatedString();
    }

    public final AnnotatedString plus(AnnotatedString annotatedString) {
        Builder builder = new Builder(this);
        builder.append(annotatedString);
        return builder.toAnnotatedString();
    }

    @Override // java.lang.CharSequence
    public AnnotatedString subSequence(int i2, int i3) {
        if (i2 > i3) {
            InlineClassHelperKt.throwIllegalArgumentException("start (" + i2 + ") should be less or equal to end (" + i3 + ')');
        }
        if (i2 == 0 && i3 == this.text.length()) {
            return this;
        }
        String strSubstring = this.text.substring(i2, i3);
        x.e(strSubstring, "substring(...)");
        return new AnnotatedString((List<? extends Range<? extends Annotation>>) AnnotatedStringKt.filterRanges(this.annotations, i2, i3), strSubstring);
    }

    /* renamed from: subSequence-5zc-tL8, reason: not valid java name */
    public final AnnotatedString m10381subSequence5zctL8(long j2) {
        return subSequence(TextRange.m10544getMinimpl(j2), TextRange.m10543getMaximpl(j2));
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.text;
    }

    /* compiled from: WazeSource */
    public final class Builder implements Appendable {
        public static final int $stable = 8;
        private final List<MutableRange<? extends Annotation>> annotations;
        private final BulletScope bulletScope;
        private final List<MutableRange<? extends Object>> styleStack;
        private final StringBuilder text;

        /* compiled from: WazeSource */
        public final class BulletScope {
            public static final int $stable = 8;
            private final Builder builder;
            private final List<k<TextUnit, Bullet>> bulletListSettingStack = new ArrayList();

            public BulletScope(Builder builder) {
                this.builder = builder;
            }

            public final Builder getBuilder$ui_text() {
                return this.builder;
            }

            public final List<k<TextUnit, Bullet>> getBulletListSettingStack$ui_text() {
                return this.bulletListSettingStack;
            }
        }

        public Builder(int i2) {
            this.text = new StringBuilder(i2);
            this.styleStack = new ArrayList();
            this.annotations = new ArrayList();
            this.bulletScope = new BulletScope(this);
        }

        /* renamed from: withBulletList-o2QH7mI$default, reason: not valid java name */
        public static /* synthetic */ Object m10382withBulletListo2QH7mI$default(Builder builder, long j2, Bullet bullet, l lVar, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j2 = Bullet.Companion.m10390getDefaultIndentationXSAIIZE();
            }
            if ((i2 & 2) != 0) {
                bullet = Bullet.Companion.getDefault();
            }
            return builder.m10384withBulletListo2QH7mI(j2, bullet, lVar);
        }

        public static /* synthetic */ Object withBulletListItem$default(Builder builder, BulletScope bulletScope, Bullet bullet, l lVar, int i2, Object obj) {
            if (1 == (i2 & 1)) {
                bullet = null;
            }
            return builder.withBulletListItem(bulletScope, bullet, lVar);
        }

        public final void addBullet(Bullet bullet, int i2, int i3) {
            this.annotations.add(new MutableRange<>(bullet, i2, i3, null, 8, null));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: addBullet-r9BaKPg, reason: not valid java name */
        public final void m10383addBulletr9BaKPg(Bullet bullet, long j2, int i2, int i3) {
            Object[] objArr = 0 == true ? 1 : 0;
            String str = null;
            this.annotations.add(new MutableRange<>(new ParagraphStyle(0, 0, 0L, new TextIndent(j2, j2, null), (PlatformParagraphStyle) objArr, (LineHeightStyle) null, 0, 0, (TextMotion) null, 503, (o) null), i2, i3, str, 8, 0 == true ? 1 : 0));
            this.annotations.add(new MutableRange<>(bullet, i2, i3, null, 8, null));
        }

        public final void addLink(LinkAnnotation.Clickable clickable, int i2, int i3) {
            this.annotations.add(new MutableRange<>(clickable, i2, i3, null, 8, null));
        }

        public final void addStringAnnotation(String str, String str2, int i2, int i3) {
            this.annotations.add(new MutableRange<>(StringAnnotation.m10494boximpl(str2), i2, i3, str));
        }

        public final void addStyle(ParagraphStyle paragraphStyle, int i2, int i3) {
            this.annotations.add(new MutableRange<>(paragraphStyle, i2, i3, null, 8, null));
        }

        public final void addTtsAnnotation(TtsAnnotation ttsAnnotation, int i2, int i3) {
            this.annotations.add(new MutableRange<>(ttsAnnotation, i2, i3, null, 8, null));
        }

        public final void addUrlAnnotation(UrlAnnotation urlAnnotation, int i2, int i3) {
            this.annotations.add(new MutableRange<>(urlAnnotation, i2, i3, null, 8, null));
        }

        public final void append(AnnotatedString annotatedString, int i2, int i3) {
            int length = this.text.length();
            this.text.append((CharSequence) annotatedString.getText(), i2, i3);
            List localAnnotations$default = AnnotatedStringKt.getLocalAnnotations$default(annotatedString, i2, i3, null, 4, null);
            if (localAnnotations$default != null) {
                int size = localAnnotations$default.size();
                for (int i4 = 0; i4 < size; i4++) {
                    Range range = (Range) localAnnotations$default.get(i4);
                    this.annotations.add(new MutableRange<>(range.getItem(), range.getStart() + length, range.getEnd() + length, range.getTag()));
                }
            }
        }

        public final void flatMapAnnotations$ui_text(l<? super Range<? extends Annotation>, ? extends List<? extends Range<? extends Annotation>>> lVar) {
            List<MutableRange<? extends Annotation>> list = this.annotations;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                List<? extends Range<? extends Annotation>> listInvoke = lVar.invoke(MutableRange.toRange$default(list.get(i2), 0, 1, null));
                ArrayList arrayList2 = new ArrayList(listInvoke.size());
                int size2 = listInvoke.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    arrayList2.add(MutableRange.Companion.fromRange(listInvoke.get(i3)));
                }
                i.aD(arrayList, arrayList2);
            }
            this.annotations.clear();
            this.annotations.addAll(arrayList);
        }

        public final int getLength() {
            return this.text.length();
        }

        public final void mapAnnotations$ui_text(l<? super Range<? extends Annotation>, ? extends Range<? extends Annotation>> lVar) {
            int size = this.annotations.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.annotations.set(i2, MutableRange.Companion.fromRange(lVar.invoke(MutableRange.toRange$default(this.annotations.get(i2), 0, 1, null))));
            }
        }

        public final void pop(int i2) {
            if (i2 >= this.styleStack.size()) {
                InlineClassHelperKt.throwIllegalStateException(i2 + " should be less than " + this.styleStack.size());
            }
            while (this.styleStack.size() - 1 >= i2) {
                pop();
            }
        }

        public final int pushBullet(Bullet bullet) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(bullet, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushLink(LinkAnnotation linkAnnotation) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(linkAnnotation, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushStringAnnotation(String str, String str2) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(StringAnnotation.m10494boximpl(str2), this.text.length(), 0, str, 4, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushStyle(ParagraphStyle paragraphStyle) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(paragraphStyle, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushTtsAnnotation(TtsAnnotation ttsAnnotation) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(ttsAnnotation, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushUrlAnnotation(UrlAnnotation urlAnnotation) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(urlAnnotation, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final AnnotatedString toAnnotatedString() {
            String string = this.text.toString();
            List<MutableRange<? extends Annotation>> list = this.annotations;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(list.get(i2).toRange(this.text.length()));
            }
            return new AnnotatedString(string, arrayList);
        }

        /* renamed from: withBulletList-o2QH7mI, reason: not valid java name */
        public final <R> R m10384withBulletListo2QH7mI(long j2, Bullet bullet, l<? super BulletScope, ? extends R> lVar) {
            long sp;
            k kVar = (k) i.U(this.bulletScope.getBulletListSettingStack$ui_text());
            if (kVar != null) {
                long jM11371unboximpl = ((TextUnit) kVar.c()).m11371unboximpl();
                if (!TextUnitType.m11390equalsimpl0(TextUnit.m11361getTypeUIouoOA(jM11371unboximpl), TextUnit.m11361getTypeUIouoOA(j2))) {
                    InlineClassHelperKt.throwIllegalStateException("Indentation unit types of nested bullet lists must match. Current " + ((Object) TextUnit.m11369toStringimpl(jM11371unboximpl)) + " and previous is " + ((Object) TextUnit.m11369toStringimpl(j2)));
                }
                long jM11361getTypeUIouoOA = TextUnit.m11361getTypeUIouoOA(j2);
                sp = TextUnitType.m11390equalsimpl0(jM11361getTypeUIouoOA, TextUnitType.Companion.m11395getSpUIouoOA()) ? TextUnitKt.getSp(TextUnit.m11362getValueimpl(j2) + TextUnit.m11362getValueimpl(jM11371unboximpl)) : TextUnitType.m11390equalsimpl0(jM11361getTypeUIouoOA, TextUnitType.Companion.m11394getEmUIouoOA()) ? TextUnitKt.getEm(TextUnit.m11362getValueimpl(j2) + TextUnit.m11362getValueimpl(jM11371unboximpl)) : j2;
            } else {
                sp = j2;
            }
            int iPushStyle = pushStyle(new ParagraphStyle(0, 0, 0L, new TextIndent(sp, sp, null), (PlatformParagraphStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 503, (o) null));
            this.bulletScope.getBulletListSettingStack$ui_text().add(new k<>(TextUnit.m11352boximpl(sp), bullet));
            try {
                R rInvoke = lVar.invoke(this.bulletScope);
                if (!this.bulletScope.getBulletListSettingStack$ui_text().isEmpty()) {
                    BulletScope bulletScope = this.bulletScope;
                    List<k<TextUnit, Bullet>> bulletListSettingStack$ui_text = bulletScope.getBulletListSettingStack$ui_text();
                    x.f(bulletScope.getBulletListSettingStack$ui_text(), "<this>");
                    bulletListSettingStack$ui_text.remove(r4.size() - 1);
                }
                pop(iPushStyle);
                return rInvoke;
            } catch (Throwable th) {
                if (!this.bulletScope.getBulletListSettingStack$ui_text().isEmpty()) {
                    BulletScope bulletScope2 = this.bulletScope;
                    List<k<TextUnit, Bullet>> bulletListSettingStack$ui_text2 = bulletScope2.getBulletListSettingStack$ui_text();
                    x.f(bulletScope2.getBulletListSettingStack$ui_text(), "<this>");
                    bulletListSettingStack$ui_text2.remove(r4.size() - 1);
                }
                pop(iPushStyle);
                throw th;
            }
        }

        public final <R> R withBulletListItem(BulletScope bulletScope, Bullet bullet, l<? super Builder, ? extends R> lVar) {
            Bullet bullet2;
            k kVar = (k) i.U(bulletScope.getBulletListSettingStack$ui_text());
            long jM11371unboximpl = kVar != null ? ((TextUnit) kVar.c()).m11371unboximpl() : Bullet.Companion.m10390getDefaultIndentationXSAIIZE();
            if (bullet != null) {
                bullet2 = bullet;
            } else if (kVar == null || (bullet2 = (Bullet) kVar.d()) == null) {
                bullet2 = Bullet.Companion.getDefault();
            }
            int iPushStyle = bulletScope.getBuilder$ui_text().pushStyle(new ParagraphStyle(0, 0, 0L, new TextIndent(jM11371unboximpl, jM11371unboximpl, null), (PlatformParagraphStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 503, (o) null));
            int iPushBullet = bulletScope.getBuilder$ui_text().pushBullet(bullet2);
            try {
                return lVar.invoke(bulletScope.getBuilder$ui_text());
            } finally {
                bulletScope.getBuilder$ui_text().pop(iPushBullet);
                bulletScope.getBuilder$ui_text().pop(iPushStyle);
            }
        }

        /* compiled from: WazeSource */
        final class MutableRange<T> {
            public static final Companion Companion = new Companion(null);
            private int end;
            private final T item;
            private final int start;
            private final String tag;

            public /* synthetic */ MutableRange(Object obj, int i2, int i3, String str, int i4, o oVar) {
                this(obj, i2, (i4 & 4) != 0 ? Integer.MIN_VALUE : i3, (i4 & 8) != 0 ? "" : str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ MutableRange copy$default(MutableRange mutableRange, Object obj, int i2, int i3, String str, int i4, Object obj2) {
                if ((i4 & 1) != 0) {
                    obj = mutableRange.item;
                }
                if ((i4 & 2) != 0) {
                    i2 = mutableRange.start;
                }
                if ((i4 & 4) != 0) {
                    i3 = mutableRange.end;
                }
                if ((i4 & 8) != 0) {
                    str = mutableRange.tag;
                }
                return mutableRange.copy(obj, i2, i3, str);
            }

            public static /* synthetic */ Range toRange$default(MutableRange mutableRange, int i2, int i3, Object obj) {
                if (1 == (i3 & 1)) {
                    i2 = Integer.MIN_VALUE;
                }
                return mutableRange.toRange(i2);
            }

            public final T component1() {
                return this.item;
            }

            public final int component2() {
                return this.start;
            }

            public final int component3() {
                return this.end;
            }

            public final String component4() {
                return this.tag;
            }

            public final MutableRange<T> copy(T t, int i2, int i3, String str) {
                return new MutableRange<>(t, i2, i3, str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MutableRange)) {
                    return false;
                }
                MutableRange mutableRange = (MutableRange) obj;
                return x.n(this.item, mutableRange.item) && this.start == mutableRange.start && this.end == mutableRange.end && x.n(this.tag, mutableRange.tag);
            }

            public final int getEnd() {
                return this.end;
            }

            public final T getItem() {
                return this.item;
            }

            public final int getStart() {
                return this.start;
            }

            public final String getTag() {
                return this.tag;
            }

            public int hashCode() {
                T t = this.item;
                return ((((((t == null ? 0 : t.hashCode()) * 31) + this.start) * 31) + this.end) * 31) + this.tag.hashCode();
            }

            public final void setEnd(int i2) {
                this.end = i2;
            }

            public final <R> Range<R> toRange(l<? super T, ? extends R> lVar, int i2) {
                int i3 = this.end;
                if (i3 != Integer.MIN_VALUE) {
                    i2 = i3;
                }
                if (i2 == Integer.MIN_VALUE) {
                    InlineClassHelperKt.throwIllegalStateException("Item.end should be set first");
                }
                return new Range<>(lVar.invoke(this.item), this.start, i2, this.tag);
            }

            public String toString() {
                return "MutableRange(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final <T> MutableRange<T> fromRange(Range<T> range) {
                    return new MutableRange<>(range.getItem(), range.getStart(), range.getEnd(), range.getTag());
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public static /* synthetic */ Range toRange$default(MutableRange mutableRange, l lVar, int i2, int i3, Object obj) {
                if ((i3 & 2) != 0) {
                    i2 = Integer.MIN_VALUE;
                }
                return mutableRange.toRange(lVar, i2);
            }

            public MutableRange(T t, int i2, int i3, String str) {
                this.item = t;
                this.start = i2;
                this.end = i3;
                this.tag = str;
            }

            public final Range<T> toRange(int i2) {
                int i3 = this.end;
                if (i3 != Integer.MIN_VALUE) {
                    i2 = i3;
                }
                if (i2 == Integer.MIN_VALUE) {
                    InlineClassHelperKt.throwIllegalStateException("Item.end should be set first");
                }
                return new Range<>(this.item, this.start, i2, this.tag);
            }
        }

        public final void addLink(LinkAnnotation.Url url, int i2, int i3) {
            this.annotations.add(new MutableRange<>(url, i2, i3, null, 8, null));
        }

        public final void addStyle(SpanStyle spanStyle, int i2, int i3) {
            this.annotations.add(new MutableRange<>(spanStyle, i2, i3, null, 8, null));
        }

        public Builder() {
            this(0, 1, null);
        }

        public final int pushStyle(SpanStyle spanStyle) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(spanStyle, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public /* synthetic */ Builder(int i2, int i3, o oVar) {
            this(1 == (i3 & 1) ? 16 : i2);
        }

        public Builder(AnnotatedString annotatedString) {
            this(0, 1, null);
            append(annotatedString);
        }

        public Builder(String str) {
            this(0, 1, null);
            append(str);
        }

        public final void pop() {
            if (this.styleStack.isEmpty()) {
                InlineClassHelperKt.throwIllegalStateException("Nothing to pop.");
            }
            this.styleStack.remove(r0.size() - 1).setEnd(this.text.length());
        }

        @Override // java.lang.Appendable
        public /* bridge */ /* synthetic */ Appendable append(char c2) {
            append(c2);
            return this;
        }

        public final void append(AnnotatedString annotatedString) {
            StringBuilder sb = this.text;
            int length = sb.length();
            sb.append(annotatedString.getText());
            List<Range<? extends Annotation>> annotations$ui_text = annotatedString.getAnnotations$ui_text();
            if (annotations$ui_text != null) {
                int size = annotations$ui_text.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Range<? extends Annotation> range = annotations$ui_text.get(i2);
                    this.annotations.add(new MutableRange<>(range.getItem(), range.getStart() + length, range.getEnd() + length, range.getTag()));
                }
            }
        }

        @Override // java.lang.Appendable
        public Builder append(char c2) {
            this.text.append(c2);
            return this;
        }

        @Override // java.lang.Appendable
        public Builder append(CharSequence charSequence) {
            if (charSequence instanceof AnnotatedString) {
                append((AnnotatedString) charSequence);
                return this;
            }
            this.text.append(charSequence);
            return this;
        }

        @Override // java.lang.Appendable
        public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
            append(charSequence);
            return this;
        }

        @Override // java.lang.Appendable
        public Builder append(CharSequence charSequence, int i2, int i3) {
            if (charSequence instanceof AnnotatedString) {
                append((AnnotatedString) charSequence, i2, i3);
                return this;
            }
            this.text.append(charSequence, i2, i3);
            return this;
        }

        @Override // java.lang.Appendable
        public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i2, int i3) {
            append(charSequence, i2, i3);
            return this;
        }

        public final void append(String str) {
            this.text.append(str);
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Saver<AnnotatedString, ?> getSaver() {
            return AnnotatedString.Saver;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    public final class Range<T> {
        public static final int $stable = 0;
        private final int end;
        private final T item;
        private final int start;
        private final String tag;

        public Range(T t, int i2, int i3, String str) {
            this.item = t;
            this.start = i2;
            this.end = i3;
            this.tag = str;
            if (i2 <= i3) {
                return;
            }
            InlineClassHelperKt.throwIllegalArgumentException("Reversed range is not supported");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Range copy$default(Range range, Object obj, int i2, int i3, String str, int i4, Object obj2) {
            if ((i4 & 1) != 0) {
                obj = range.item;
            }
            if ((i4 & 2) != 0) {
                i2 = range.start;
            }
            if ((i4 & 4) != 0) {
                i3 = range.end;
            }
            if ((i4 & 8) != 0) {
                str = range.tag;
            }
            return range.copy(obj, i2, i3, str);
        }

        public final T component1() {
            return this.item;
        }

        public final int component2() {
            return this.start;
        }

        public final int component3() {
            return this.end;
        }

        public final String component4() {
            return this.tag;
        }

        public final Range<T> copy(T t, int i2, int i3, String str) {
            return new Range<>(t, i2, i3, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Range)) {
                return false;
            }
            Range range = (Range) obj;
            return x.n(this.item, range.item) && this.start == range.start && this.end == range.end && x.n(this.tag, range.tag);
        }

        public final int getEnd() {
            return this.end;
        }

        public final T getItem() {
            return this.item;
        }

        public final int getStart() {
            return this.start;
        }

        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            T t = this.item;
            return ((((((t == null ? 0 : t.hashCode()) * 31) + this.start) * 31) + this.end) * 31) + this.tag.hashCode();
        }

        public String toString() {
            return "Range(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
        }

        public Range(T t, int i2, int i3) {
            this(t, i2, i3, "");
        }
    }

    public final List<Range<String>> getStringAnnotations(int i2, int i3) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                Range<? extends Annotation> range = list.get(i4);
                if ((range.getItem() instanceof StringAnnotation) && AnnotatedStringKt.intersect(i2, i3, range.getStart(), range.getEnd())) {
                    arrayList.add(StringAnnotationKt.unbox(range));
                }
            }
            return arrayList;
        }
        return ac.f47967a;
    }

    public /* synthetic */ AnnotatedString(String str, ac acVar, int i2, o oVar) {
        this(str, (List<? extends Range<? extends Annotation>>) ((i2 & 2) != 0 ? ac.f47967a : acVar));
    }

    public AnnotatedString(String str, List<Range<SpanStyle>> list, List<Range<ParagraphStyle>> list2) {
        this((List<? extends Range<? extends Annotation>>) AnnotatedStringKt.constructAnnotationsFromSpansAndParagraphs(list, list2), str);
    }

    public /* synthetic */ AnnotatedString(String str, ac acVar, ac acVar2, int i2, o oVar) {
        this(str, (i2 & 2) != 0 ? ac.f47967a : acVar, (i2 & 4) != 0 ? ac.f47967a : acVar2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AnnotatedString(String str, List<? extends Range<? extends Annotation>> list) {
        List<? extends Range<? extends Annotation>> list2 = list;
        this(true == list2.isEmpty() ? null : list2, str);
    }
}
