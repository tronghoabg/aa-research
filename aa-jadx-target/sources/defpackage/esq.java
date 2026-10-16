package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class esq {
    public volatile boolean c;
    public final defpackage.ebl d = new defpackage.ebl();
    public final java.util.Map a = new java.util.LinkedHashMap();
    public final java.util.Set b = new java.util.LinkedHashSet();

    public static final void a(java.lang.AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e);
            }
        }
    }
}
