package androidx.core.text;

import android.text.Html;
import android.text.Spanned;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class HtmlKt {
    public static final Spanned parseAsHtml(String str, int i2, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
        x.f(str, "<this>");
        Spanned spannedFromHtml = HtmlCompat.fromHtml(str, i2, imageGetter, tagHandler);
        x.e(spannedFromHtml, "fromHtml(...)");
        return spannedFromHtml;
    }

    public static /* synthetic */ Spanned parseAsHtml$default(String str, int i2, Html.ImageGetter imageGetter, Html.TagHandler tagHandler, int i3, Object obj) {
        x.f(str, "<this>");
        if (1 == (i3 & 1)) {
            i2 = 0;
        }
        if ((i3 & 2) != 0) {
            imageGetter = null;
        }
        if ((i3 & 4) != 0) {
            tagHandler = null;
        }
        Spanned spannedFromHtml = HtmlCompat.fromHtml(str, i2, imageGetter, tagHandler);
        x.e(spannedFromHtml, "fromHtml(...)");
        return spannedFromHtml;
    }

    public static final String toHtml(Spanned spanned, int i2) {
        x.f(spanned, "<this>");
        String html = HtmlCompat.toHtml(spanned, i2);
        x.e(html, "toHtml(...)");
        return html;
    }

    public static /* synthetic */ String toHtml$default(Spanned spanned, int i2, int i3, Object obj) {
        x.f(spanned, "<this>");
        if (1 == (i3 & 1)) {
            i2 = 0;
        }
        String html = HtmlCompat.toHtml(spanned, i2);
        x.e(html, "toHtml(...)");
        return html;
    }
}
