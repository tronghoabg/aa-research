package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aixc {
    public static final boolean a;
    public static final java.lang.StackTraceElement b;
    public static final java.lang.StackTraceElement c;
    public static final java.lang.StackTraceElement d;
    public static final java.lang.StackTraceElement e;

    static {
        boolean z = defpackage.ajcn.a;
        boolean z2 = true;
        if (!defpackage.ajcn.a && defpackage.aiuy.b) {
            z2 = false;
        }
        a = z2;
        b = new java.lang.StackTraceElement("kotlinx.coroutines", "launch", null, -1);
        c = new java.lang.StackTraceElement("kotlinx.coroutines", "async", null, -1);
        d = new java.lang.StackTraceElement("kotlinx.coroutines.guava", "future", null, -1);
        e = new java.lang.StackTraceElement("kotlinx.coroutines", "runBlocking", null, -1);
    }
}
