package defpackage;

import android.content.res.Resources;
import android.view.View;

/* loaded from: classes2.dex */
public final class rbz {
    public static final rbz a = new rbz();

    public static final String a(View view) {
        String simpleName = view.getClass().getSimpleName();
        xxd xxdVar = new xxd(", ");
        String strE = new xxb(xxdVar, xxdVar).e(true != view.isShown() ? null : "shown", true != view.isFocusable() ? null : "focusable", true != view.hasFocus() ? null : "hasFocus", true != view.isFocused() ? null : "focused", true == view.hasWindowFocus() ? "hasWindowFocus" : null);
        try {
            return String.format("%s (%s) [%s]", view.getResources().getResourceEntryName(view.getId()), simpleName, strE);
        } catch (Resources.NotFoundException unused) {
            return String.format("%s [%s]", simpleName, strE);
        }
    }
}
