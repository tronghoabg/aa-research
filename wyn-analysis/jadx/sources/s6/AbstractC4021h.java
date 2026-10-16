package s6;

import android.text.Html;
import java.util.regex.Pattern;

/* renamed from: s6.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4021h {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f45181a = Pattern.compile("(&#13;)?&#10;");

    public static String a(CharSequence charSequence) {
        return f45181a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
