package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class piz {
    protected final android.content.ContentResolver a;
    protected final java.lang.String b;

    protected piz(android.content.ContentResolver contentResolver, java.lang.String str) {
        this.a = contentResolver;
        if (str.contains("/")) {
            throw new java.lang.IllegalArgumentException("fileName contains invalid characters: ".concat(java.lang.String.valueOf(str)));
        }
        this.b = str;
    }
}
