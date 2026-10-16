package androidx.compose.ui.text.font;

import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FontMatcher {
    public static final int $stable = 0;

    public static /* synthetic */ List filterByClosestWeight$ui_text$default(FontMatcher fontMatcher, List list, FontWeight fontWeight, boolean z, FontWeight fontWeight2, FontWeight fontWeight3, int i2, Object obj) {
        List list2 = list;
        int size = list2.size();
        int i3 = 0;
        FontWeight fontWeight4 = null;
        FontWeight fontWeight5 = null;
        while (true) {
            if (i3 >= size) {
                break;
            }
            FontWeight fontWeight6 = (i2 & 4) != 0 ? null : fontWeight2;
            FontWeight weight = ((Font) list.get(i3)).getWeight();
            if (fontWeight6 == null || weight.compareTo(fontWeight6) >= 0) {
                FontWeight fontWeight7 = (i2 & 8) != 0 ? null : fontWeight3;
                if (fontWeight7 == null || weight.compareTo(fontWeight7) <= 0) {
                    if (weight.compareTo(fontWeight) >= 0) {
                        if (weight.compareTo(fontWeight) <= 0) {
                            fontWeight4 = weight;
                            fontWeight5 = fontWeight4;
                            break;
                        }
                        if (fontWeight5 == null || weight.compareTo(fontWeight5) < 0) {
                            fontWeight5 = weight;
                        }
                    } else if (fontWeight4 == null || weight.compareTo(fontWeight4) > 0) {
                        fontWeight4 = weight;
                    }
                }
            }
            i3++;
        }
        if (!z ? fontWeight5 != null : fontWeight4 == null) {
            fontWeight4 = fontWeight5;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Object obj2 = list.get(i4);
            if (x.n(((Font) obj2).getWeight(), fontWeight4)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public final List<Font> filterByClosestWeight$ui_text(List<? extends Font> list, FontWeight fontWeight, boolean z, FontWeight fontWeight2, FontWeight fontWeight3) {
        List<? extends Font> list2 = list;
        int size = list2.size();
        FontWeight fontWeight4 = null;
        int i2 = 0;
        FontWeight fontWeight5 = null;
        while (true) {
            if (i2 >= size) {
                break;
            }
            FontWeight weight = list.get(i2).getWeight();
            if ((fontWeight2 == null || weight.compareTo(fontWeight2) >= 0) && (fontWeight3 == null || weight.compareTo(fontWeight3) <= 0)) {
                if (weight.compareTo(fontWeight) >= 0) {
                    if (weight.compareTo(fontWeight) <= 0) {
                        fontWeight4 = weight;
                        fontWeight5 = fontWeight4;
                        break;
                    }
                    if (fontWeight5 == null || weight.compareTo(fontWeight5) < 0) {
                        fontWeight5 = weight;
                    }
                } else if (fontWeight4 == null || weight.compareTo(fontWeight4) > 0) {
                    fontWeight4 = weight;
                }
            }
            i2++;
        }
        if (!z ? fontWeight5 != null : fontWeight4 == null) {
            fontWeight4 = fontWeight5;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Font font = list.get(i3);
            if (x.n(font.getWeight(), fontWeight4)) {
                arrayList.add(font);
            }
        }
        return arrayList;
    }

    /* renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final List<Font> m10657matchFontRetOiIg(List<? extends Font> list, FontWeight fontWeight, int i2) {
        ArrayList arrayList = new ArrayList(list.size());
        List<? extends Font> list2 = list;
        int size = list2.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Font font = list.get(i4);
            Font font2 = font;
            if (x.n(font2.getWeight(), fontWeight) && FontStyle.m10661equalsimpl0(font2.mo10613getStyle_LCdwA(), i2)) {
                arrayList.add(font);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList(list.size());
        int size2 = list2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            Font font3 = list.get(i5);
            if (FontStyle.m10661equalsimpl0(font3.mo10613getStyle_LCdwA(), i2)) {
                arrayList3.add(font3);
            }
        }
        ArrayList arrayList4 = arrayList3;
        if (true != arrayList4.isEmpty()) {
            list = arrayList4;
        }
        List<? extends Font> list3 = list;
        FontWeight fontWeight2 = null;
        if (fontWeight.compareTo(FontWeight.Companion.getW400()) < 0) {
            List<? extends Font> list4 = list3;
            int size3 = list4.size();
            FontWeight fontWeight3 = null;
            int i6 = 0;
            while (true) {
                if (i6 >= size3) {
                    break;
                }
                FontWeight weight = list3.get(i6).getWeight();
                if (weight.compareTo(fontWeight) >= 0) {
                    if (weight.compareTo(fontWeight) <= 0) {
                        fontWeight2 = weight;
                        fontWeight3 = fontWeight2;
                        break;
                    }
                    if (fontWeight3 == null || weight.compareTo(fontWeight3) < 0) {
                        fontWeight3 = weight;
                    }
                } else if (fontWeight2 == null || weight.compareTo(fontWeight2) > 0) {
                    fontWeight2 = weight;
                }
                i6++;
            }
            ArrayList arrayList5 = new ArrayList(list3.size());
            int size4 = list4.size();
            while (i3 < size4) {
                FontWeight fontWeight4 = fontWeight2 == null ? fontWeight3 : fontWeight2;
                Font font4 = list3.get(i3);
                if (x.n(font4.getWeight(), fontWeight4)) {
                    arrayList5.add(font4);
                }
                i3++;
            }
            return arrayList5;
        }
        if (fontWeight.compareTo(FontWeight.Companion.getW500()) > 0) {
            List<? extends Font> list5 = list3;
            int size5 = list5.size();
            FontWeight fontWeight5 = null;
            int i7 = 0;
            while (true) {
                if (i7 >= size5) {
                    break;
                }
                FontWeight weight2 = list3.get(i7).getWeight();
                if (weight2.compareTo(fontWeight) >= 0) {
                    if (weight2.compareTo(fontWeight) <= 0) {
                        fontWeight2 = weight2;
                        fontWeight5 = fontWeight2;
                        break;
                    }
                    if (fontWeight5 == null || weight2.compareTo(fontWeight5) < 0) {
                        fontWeight5 = weight2;
                    }
                } else if (fontWeight2 == null || weight2.compareTo(fontWeight2) > 0) {
                    fontWeight2 = weight2;
                }
                i7++;
            }
            ArrayList arrayList6 = new ArrayList(list3.size());
            int size6 = list5.size();
            while (i3 < size6) {
                FontWeight fontWeight6 = fontWeight5 == null ? fontWeight2 : fontWeight5;
                Font font5 = list3.get(i3);
                if (x.n(font5.getWeight(), fontWeight6)) {
                    arrayList6.add(font5);
                }
                i3++;
            }
            return arrayList6;
        }
        FontWeight w500 = FontWeight.Companion.getW500();
        List<? extends Font> list6 = list3;
        int size7 = list6.size();
        FontWeight fontWeight7 = null;
        FontWeight fontWeight8 = null;
        int i8 = 0;
        while (true) {
            if (i8 >= size7) {
                break;
            }
            FontWeight weight3 = list3.get(i8).getWeight();
            if (w500 == null || weight3.compareTo(w500) <= 0) {
                if (weight3.compareTo(fontWeight) >= 0) {
                    if (weight3.compareTo(fontWeight) <= 0) {
                        fontWeight7 = weight3;
                        fontWeight8 = fontWeight7;
                        break;
                    }
                    if (fontWeight8 == null || weight3.compareTo(fontWeight8) < 0) {
                        fontWeight8 = weight3;
                    }
                } else if (fontWeight7 == null || weight3.compareTo(fontWeight7) > 0) {
                    fontWeight7 = weight3;
                }
            }
            i8++;
        }
        ArrayList arrayList7 = new ArrayList(list3.size());
        int size8 = list6.size();
        for (int i9 = 0; i9 < size8; i9++) {
            FontWeight fontWeight9 = fontWeight8 == null ? fontWeight7 : fontWeight8;
            Font font6 = list3.get(i9);
            if (x.n(font6.getWeight(), fontWeight9)) {
                arrayList7.add(font6);
            }
        }
        ArrayList arrayList8 = arrayList7;
        if (arrayList8.isEmpty()) {
            FontWeight w5002 = FontWeight.Companion.getW500();
            int size9 = list6.size();
            FontWeight fontWeight10 = null;
            int i10 = 0;
            while (true) {
                if (i10 >= size9) {
                    break;
                }
                FontWeight weight4 = list3.get(i10).getWeight();
                if (w5002 == null || weight4.compareTo(w5002) >= 0) {
                    if (weight4.compareTo(fontWeight) >= 0) {
                        if (weight4.compareTo(fontWeight) <= 0) {
                            fontWeight2 = weight4;
                            fontWeight10 = fontWeight2;
                            break;
                        }
                        if (fontWeight10 == null || weight4.compareTo(fontWeight10) < 0) {
                            fontWeight10 = weight4;
                        }
                    } else if (fontWeight2 == null || weight4.compareTo(fontWeight2) > 0) {
                        fontWeight2 = weight4;
                    }
                }
                i10++;
            }
            ArrayList arrayList9 = new ArrayList(list3.size());
            int size10 = list6.size();
            while (i3 < size10) {
                FontWeight fontWeight11 = fontWeight10 == null ? fontWeight2 : fontWeight10;
                Font font7 = list3.get(i3);
                if (x.n(font7.getWeight(), fontWeight11)) {
                    arrayList9.add(font7);
                }
                i3++;
            }
            arrayList8 = arrayList9;
        }
        return arrayList8;
    }

    /* renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final List<Font> m10656matchFontRetOiIg(FontListFontFamily fontListFontFamily, FontWeight fontWeight, int i2) {
        return m10657matchFontRetOiIg(fontListFontFamily.getFonts(), fontWeight, i2);
    }

    /* renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final List<Font> m10655matchFontRetOiIg(FontFamily fontFamily, FontWeight fontWeight, int i2) {
        if (fontFamily instanceof FontListFontFamily) {
            return m10656matchFontRetOiIg((FontListFontFamily) fontFamily, fontWeight, i2);
        }
        throw new IllegalArgumentException("Only FontFamily instances that presents a list of Fonts can be used");
    }
}
