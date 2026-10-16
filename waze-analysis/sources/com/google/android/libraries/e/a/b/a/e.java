package com.google.android.libraries.e.a.b.a;

import com.google.d.b.w;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5830a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f5831b = Pattern.compile("(\\w+).*");

    public static String a(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return "transform=".concat(w.b("+").d(list));
    }

    public static String b(String str) {
        Matcher matcher = f5831b.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        throw new IllegalArgumentException("Invalid fragment spec: ".concat(String.valueOf(str)));
    }
}
