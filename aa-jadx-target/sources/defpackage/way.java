package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class way {
    public static final /* synthetic */ int a = 0;
    private static java.lang.Boolean b;
    private static final defpackage.zd c = new defpackage.zd();

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized android.net.Uri a(java.lang.String str) {
        defpackage.zd zdVar = c;
        android.net.Uri uri = (android.net.Uri) zdVar.get(str);
        if (uri != null) {
            return uri;
        }
        android.net.Uri uri2 = android.net.Uri.parse("content://com.google.android.gms.phenotype/".concat(java.lang.String.valueOf(android.net.Uri.encode(str))));
        zdVar.put(str, uri2);
        return uri2;
    }

    public static java.io.File b(android.content.Context context) {
        java.io.File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return filesDir;
        }
        android.os.SystemClock.sleep(100L);
        java.io.File filesDir2 = context.getFilesDir();
        if (filesDir2 != null) {
            return filesDir2;
        }
        throw new java.lang.IllegalStateException("getFilesDir returned null twice.");
    }

    public static boolean c() {
        java.lang.Boolean boolValueOf = b;
        if (boolValueOf == null) {
            boolValueOf = java.lang.Boolean.valueOf(jx$.ExternalSyntheticApiModelOutline3.m());
            b = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static java.lang.String d(android.content.Context context, java.lang.String str) {
        if (str.contains("#")) {
            throw new java.lang.IllegalArgumentException("The passed in package cannot already have a subpackage: ".concat(java.lang.String.valueOf(str)));
        }
        return str + "#" + context.getPackageName();
    }
}
