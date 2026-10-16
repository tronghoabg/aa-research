package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontListFontFamily;
import androidx.compose.ui.text.font.FontLoadingStrategy;
import androidx.compose.ui.text.font.FontMatcher;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.util.ListUtilsKt;
import h.a.i;
import h.g.b.o;
import h.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidFontListTypeface implements AndroidTypeface {
    private final FontFamily fontFamily;
    private final FontMatcher fontMatcher$1;
    private final ScatterMap<Font, Typeface> loadedTypefaces;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final FontMatcher fontMatcher = new FontMatcher();

    public AndroidFontListTypeface(FontListFontFamily fontListFontFamily, Context context, List<k<FontWeight, FontStyle>> list, FontMatcher fontMatcher2) {
        ArrayList arrayList;
        this.fontMatcher$1 = fontMatcher2;
        List<Font> fonts = fontListFontFamily.getFonts();
        ArrayList arrayList2 = new ArrayList(fonts.size());
        int size = fonts.size();
        for (int i2 = 0; i2 < size; i2++) {
            Font font = fonts.get(i2);
            if (FontLoadingStrategy.m10648equalsimpl0(font.mo10603getLoadingStrategyPKNRLFQ(), FontLoadingStrategy.Companion.m10653getBlockingPKNRLFQ())) {
                arrayList2.add(font);
            }
        }
        ArrayList arrayList3 = arrayList2;
        if (list != null) {
            ArrayList arrayList4 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                k<FontWeight, FontStyle> kVar = list.get(i3);
                arrayList4.add((Font) i.R(this.fontMatcher$1.m10657matchFontRetOiIg(arrayList3, (FontWeight) kVar.a(), ((FontStyle) kVar.b()).m10664unboximpl())));
            }
            List listFastFilterNotNull = ListUtilsKt.fastFilterNotNull(arrayList4);
            MutableScatterSet mutableScatterSet = new MutableScatterSet(listFastFilterNotNull.size());
            ArrayList arrayList5 = new ArrayList(listFastFilterNotNull.size());
            int size3 = listFastFilterNotNull.size();
            for (int i4 = 0; i4 < size3; i4++) {
                Object obj = listFastFilterNotNull.get(i4);
                if (mutableScatterSet.add((Font) obj)) {
                    arrayList5.add(obj);
                }
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        arrayList3 = arrayList != null ? arrayList : arrayList3;
        ArrayList arrayList6 = arrayList3;
        if (arrayList6.isEmpty()) {
            InlineClassHelperKt.throwIllegalStateException("Could not match font");
        }
        MutableScatterMap mutableScatterMapMutableScatterMapOf = ScatterMapKt.mutableScatterMapOf();
        int size4 = arrayList6.size();
        for (int i5 = 0; i5 < size4; i5++) {
            Font font2 = (Font) arrayList3.get(i5);
            try {
                mutableScatterMapMutableScatterMapOf.set(font2, AndroidTypefaceCache.INSTANCE.getOrCreate(context, font2));
            } catch (Exception unused) {
                Objects.toString(font2);
                InlineClassHelperKt.throwIllegalStateException("Cannot create Typeface from ".concat(String.valueOf(font2)));
            }
        }
        this.loadedTypefaces = mutableScatterMapMutableScatterMapOf;
        this.fontFamily = fontListFontFamily;
    }

    @Override // androidx.compose.ui.text.font.Typeface
    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    public final FontMatcher getFontMatcher() {
        return this.fontMatcher$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    @Override // androidx.compose.ui.text.platform.AndroidTypeface
    /* renamed from: getNativeTypeface-PYhJU0U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Typeface mo10834getNativeTypefacePYhJU0U(androidx.compose.ui.text.font.FontWeight r20, int r21, int r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            androidx.collection.ScatterMap<androidx.compose.ui.text.font.Font, android.graphics.Typeface> r4 = r0.loadedTypefaces
            java.lang.Object[] r5 = r4.keys
            long[] r4 = r4.metadata
            int r6 = r4.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L55
            r7 = 0
            r8 = r7
        L18:
            r9 = r4[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L50
            int r11 = r8 - r6
            r12 = r7
        L2b:
            int r13 = ~r11
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            if (r12 >= r13) goto L4e
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r9
            r17 = 128(0x80, double:6.3E-322)
            int r13 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r13 >= 0) goto L4a
            int r13 = r8 << 3
            int r13 = r13 + r12
            r13 = r5[r13]
            androidx.compose.ui.text.font.Font r13 = (androidx.compose.ui.text.font.Font) r13
            r15 = r3
            java.util.Collection r15 = (java.util.Collection) r15
            r15.add(r13)
        L4a:
            long r9 = r9 >> r14
            int r12 = r12 + 1
            goto L2b
        L4e:
            if (r13 != r14) goto L55
        L50:
            if (r8 == r6) goto L55
            int r8 = r8 + 1
            goto L18
        L55:
            androidx.compose.ui.text.font.FontMatcher r4 = r0.fontMatcher$1
            java.util.List r3 = (java.util.List) r3
            java.util.List r3 = r4.m10657matchFontRetOiIg(r3, r1, r2)
            java.lang.Object r3 = h.a.i.R(r3)
            androidx.compose.ui.text.font.Font r3 = (androidx.compose.ui.text.font.Font) r3
            if (r3 == 0) goto L88
            androidx.collection.ScatterMap<androidx.compose.ui.text.font.Font, android.graphics.Typeface> r0 = r0.loadedTypefaces
            java.lang.Object r0 = r0.get(r3)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L7d
            r4 = r22
            java.lang.Object r0 = androidx.compose.ui.text.font.FontSynthesis_androidKt.m10683synthesizeTypefaceFxwP2eA(r4, r0, r3, r1, r2)
            java.lang.String r1 = "null cannot be cast to non-null type android.graphics.Typeface"
            h.g.b.x.d(r0, r1)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            return r0
        L7d:
            java.lang.String r0 = "Could not load typeface"
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck(r0)
            h.e r0 = new h.e
            r0.<init>()
            throw r0
        L88:
            java.lang.String r0 = "Could not load font"
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck(r0)
            h.e r0 = new h.e
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.AndroidFontListTypeface.mo10834getNativeTypefacePYhJU0U(androidx.compose.ui.text.font.FontWeight, int, int):android.graphics.Typeface");
    }

    /* compiled from: WazeSource */
    final class Companion {
        private Companion() {
        }

        public final FontMatcher getFontMatcher() {
            return AndroidFontListTypeface.fontMatcher;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ AndroidFontListTypeface(FontListFontFamily fontListFontFamily, Context context, List list, FontMatcher fontMatcher2, int i2, o oVar) {
        this(fontListFontFamily, context, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? fontMatcher : fontMatcher2);
    }
}
