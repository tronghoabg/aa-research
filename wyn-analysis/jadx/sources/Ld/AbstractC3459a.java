package ld;

import android.os.Trace;

/* renamed from: ld.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3459a implements AutoCloseable {
    public static String a(String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, 124) + "...";
    }

    public static void b(String str) {
        Trace.beginSection(tg.b.U(a(str)));
    }
}
