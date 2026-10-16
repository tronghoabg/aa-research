package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vbl {
    private static final defpackage.sbk b = new defpackage.sbk(2);
    private static final java.util.concurrent.atomic.AtomicBoolean a = new java.util.concurrent.atomic.AtomicBoolean(false);

    public static final boolean a() {
        return a.get();
    }

    public static defpackage.sbk b(java.lang.String str) {
        if (a()) {
            return d(str);
        }
        return null;
    }

    public static final defpackage.sbk c(java.lang.String str, java.lang.Enum r2) {
        if (a()) {
            return d(str.concat(java.lang.String.valueOf(r2.name())));
        }
        return null;
    }

    private static defpackage.sbk d(java.lang.String str) {
        if (a()) {
            android.opengl.GLES32.glPushDebugGroup(33354, 1, str.length(), str);
        }
        return b;
    }
}
