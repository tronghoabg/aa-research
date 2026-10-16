package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class sym {
    public static android.content.ContentResolver a;
    protected final java.lang.String b;
    protected final java.lang.Object c;

    protected sym(java.lang.String str, java.lang.Object obj) {
        this.b = str;
        this.c = obj;
    }

    public static void b(android.content.Context context) {
        a = context.getContentResolver();
    }

    public static defpackage.sym c(java.lang.String str) {
        return new syk(str, java.lang.Boolean.FALSE);
    }

    public abstract java.lang.Object a();
}
