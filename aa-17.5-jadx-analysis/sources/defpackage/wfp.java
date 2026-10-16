package defpackage;

import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class wfp {
    public static final Pattern a = Pattern.compile("(\\w+).*");

    public static String a(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return "transform=".concat(new xxd("+").b(list));
    }
}
