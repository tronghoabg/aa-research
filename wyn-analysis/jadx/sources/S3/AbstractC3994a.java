package s3;

import android.os.Trace;

/* renamed from: s3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3994a {
    public static void a(int i5, String str) {
        Trace.beginAsyncSection(str, i5);
    }

    public static void b(int i5, String str) {
        Trace.endAsyncSection(str, i5);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }
}
