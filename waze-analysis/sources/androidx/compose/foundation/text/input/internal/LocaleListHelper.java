package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import h.a.i;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LocaleListHelper {
    public static final int $stable = 0;
    public static final LocaleListHelper INSTANCE = new LocaleListHelper();

    private LocaleListHelper() {
    }

    public final void setHintLocales(EditorInfo editorInfo, LocaleList localeList) {
        if (x.n(localeList, LocaleList.Companion.getEmpty())) {
            editorInfo.hintLocales = null;
            return;
        }
        LocaleList localeList2 = localeList;
        ArrayList arrayList = new ArrayList(i.q(localeList2, 10));
        Iterator<Locale> it = localeList2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPlatformLocale());
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        editorInfo.hintLocales = new android.os.LocaleList((java.util.Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
