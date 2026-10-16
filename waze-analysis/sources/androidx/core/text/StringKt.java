package androidx.core.text;

import android.text.TextUtils;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class StringKt {
    public static final String htmlEncode(String str) {
        x.f(str, "<this>");
        String strHtmlEncode = TextUtils.htmlEncode(str);
        x.e(strHtmlEncode, "htmlEncode(...)");
        return strHtmlEncode;
    }
}
