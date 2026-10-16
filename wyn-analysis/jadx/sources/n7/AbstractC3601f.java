package n7;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: n7.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3601f {
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    public static boolean b(String str) {
        return str == null || str.trim().isEmpty();
    }
}
