package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class waq {
    public static final java.util.concurrent.ConcurrentMap a = new j$.util.concurrent.ConcurrentHashMap();
    public static final java.lang.String[] b = {"key", "value"};
    public final android.content.ContentResolver c;
    public final android.net.Uri d;
    public volatile java.util.Map h;
    public android.database.ContentObserver e = null;
    public volatile boolean f = true;
    public final java.lang.Object g = new java.lang.Object();
    public final java.util.List i = new java.util.ArrayList();

    public waq(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        contentResolver.getClass();
        this.c = contentResolver;
        this.d = uri;
    }
}
