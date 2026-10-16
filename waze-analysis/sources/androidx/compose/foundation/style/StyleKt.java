package androidx.compose.foundation.style;

import androidx.compose.foundation.style.Style;
import h.ab;
import h.g.a.l;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class StyleKt {
    public static final Style Style(Style style, Style style2, Style style3) {
        boolean z;
        Style.Companion companion = Style.Companion;
        if (style == companion) {
            return Style(style2, style3);
        }
        if (style2 == companion) {
            return Style(style, style3);
        }
        if (style3 == companion) {
            return Style(style, style2);
        }
        if (style instanceof CombinedStyle) {
            boolean z2 = style2 instanceof CombinedStyle;
            if (z2 && (style3 instanceof CombinedStyle)) {
                ArrayList arrayList = new ArrayList(3);
                x.q(((CombinedStyle) style).getStyles(), arrayList);
                x.q(((CombinedStyle) style2).getStyles(), arrayList);
                x.q(((CombinedStyle) style3).getStyles(), arrayList);
                return Style((Style[]) arrayList.toArray(new Style[arrayList.size()]));
            }
            if (z2) {
                ArrayList arrayList2 = new ArrayList(3);
                x.q(((CombinedStyle) style).getStyles(), arrayList2);
                x.q(((CombinedStyle) style2).getStyles(), arrayList2);
                arrayList2.add(style3);
                return Style((Style[]) arrayList2.toArray(new Style[arrayList2.size()]));
            }
            z = true;
        } else {
            z = false;
        }
        if (z && (style3 instanceof CombinedStyle)) {
            ArrayList arrayList3 = new ArrayList(3);
            x.q(((CombinedStyle) style).getStyles(), arrayList3);
            arrayList3.add(style2);
            x.q(((CombinedStyle) style3).getStyles(), arrayList3);
            return Style((Style[]) arrayList3.toArray(new Style[arrayList3.size()]));
        }
        boolean z3 = style2 instanceof CombinedStyle;
        if (z3 && (style3 instanceof CombinedStyle)) {
            ArrayList arrayList4 = new ArrayList(3);
            arrayList4.add(style);
            x.q(((CombinedStyle) style2).getStyles(), arrayList4);
            x.q(((CombinedStyle) style3).getStyles(), arrayList4);
            return Style((Style[]) arrayList4.toArray(new Style[arrayList4.size()]));
        }
        if (z) {
            ArrayList arrayList5 = new ArrayList(3);
            x.q(((CombinedStyle) style).getStyles(), arrayList5);
            arrayList5.add(style2);
            arrayList5.add(style3);
            return Style((Style[]) arrayList5.toArray(new Style[arrayList5.size()]));
        }
        if (z3) {
            ArrayList arrayList6 = new ArrayList(3);
            arrayList6.add(style);
            x.q(((CombinedStyle) style2).getStyles(), arrayList6);
            arrayList6.add(style3);
            return Style((Style[]) arrayList6.toArray(new Style[arrayList6.size()]));
        }
        if (!(style3 instanceof CombinedStyle)) {
            return Style(style, style2, style3);
        }
        ArrayList arrayList7 = new ArrayList(3);
        arrayList7.add(style);
        arrayList7.add(style2);
        x.q(((CombinedStyle) style3).getStyles(), arrayList7);
        return Style((Style[]) arrayList7.toArray(new Style[arrayList7.size()]));
    }

    private static final <T> boolean fastAny(T[] tArr, l<? super T, Boolean> lVar) {
        for (T t : tArr) {
            if (lVar.invoke(t).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    private static final <T> int fastCount(T[] tArr, l<? super T, Boolean> lVar) {
        int i2 = 0;
        for (T t : tArr) {
            if (lVar.invoke(t).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    private static final <T> T fastFirst(T[] tArr, l<? super T, Boolean> lVar) {
        for (T t : tArr) {
            if (lVar.invoke(t).booleanValue()) {
                return t;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final <T> void fastForEach(T[] tArr, l<? super T, ab> lVar) {
        for (T t : tArr) {
            lVar.invoke(t);
        }
    }

    public static final Style then(Style style, Style style2) {
        return Style(style, style2);
    }

    public static final Style Style(Style style, Style style2) {
        Style.Companion companion = Style.Companion;
        if (style == companion) {
            return style2;
        }
        if (style2 == companion) {
            return style;
        }
        boolean z = style instanceof CombinedStyle;
        if (z && (style2 instanceof CombinedStyle)) {
            ArrayList arrayList = new ArrayList(2);
            x.q(((CombinedStyle) style).getStyles(), arrayList);
            x.q(((CombinedStyle) style2).getStyles(), arrayList);
            return Style((Style[]) arrayList.toArray(new Style[arrayList.size()]));
        }
        if (z) {
            ArrayList arrayList2 = new ArrayList(2);
            x.q(((CombinedStyle) style).getStyles(), arrayList2);
            arrayList2.add(style2);
            return Style((Style[]) arrayList2.toArray(new Style[arrayList2.size()]));
        }
        if (style2 instanceof CombinedStyle) {
            ArrayList arrayList3 = new ArrayList(2);
            arrayList3.add(style);
            x.q(((CombinedStyle) style2).getStyles(), arrayList3);
            return Style((Style[]) arrayList3.toArray(new Style[arrayList3.size()]));
        }
        return new CombinedStyle(style, style2);
    }

    public static final Style Style(Style... styleArr) {
        int i2 = 0;
        for (Style style : styleArr) {
            if (style == Style.Companion) {
                int i3 = 0;
                for (Style style2 : styleArr) {
                    if (style2 != Style.Companion) {
                        i3++;
                    }
                }
                if (i3 == 0) {
                    return Style.Companion;
                }
                if (i3 != 1) {
                    Style[] styleArr2 = new Style[i3];
                    int length = styleArr.length;
                    int i4 = 0;
                    while (i2 < length) {
                        Style style3 = styleArr[i2];
                        if (style3 != Style.Companion) {
                            styleArr2[i4] = style3;
                            i4++;
                        }
                        i2++;
                    }
                    return new CombinedStyle((Style[]) Arrays.copyOf(styleArr2, i3));
                }
                int length2 = styleArr.length;
                while (i2 < length2) {
                    Style style4 = styleArr[i2];
                    if (style4 != Style.Companion) {
                        return style4;
                    }
                    i2++;
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }
        return new CombinedStyle((Style[]) Arrays.copyOf(styleArr, styleArr.length));
    }
}
