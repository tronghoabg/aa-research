package androidx.compose.ui.text.font;

import h.g.b.x;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FontFamilyKt {
    public static final FontFamily FontFamily(Font... fontArr) {
        x.f(fontArr, "<this>");
        List listAsList = Arrays.asList(fontArr);
        x.e(listAsList, "asList(...)");
        return new FontListFontFamily(listAsList);
    }

    public static final FontFamily FontFamily(List<? extends Font> list) {
        return new FontListFontFamily(list);
    }

    public static final FontFamily FontFamily(Typeface typeface) {
        return new LoadedFontFamily(typeface);
    }
}
