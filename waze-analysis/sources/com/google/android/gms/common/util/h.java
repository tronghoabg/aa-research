package com.google.android.gms.common.util;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class h {
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
