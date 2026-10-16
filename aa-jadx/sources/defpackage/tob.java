package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tob {
    public static final /* synthetic */ int a = 0;
    private static final java.lang.String b = "tob";

    private tob() {
    }

    public static void a(java.lang.String str, java.lang.String str2) {
        if (new java.io.File(str, str2).delete()) {
            android.util.Log.w(b, "Marker deleted: ".concat(java.lang.String.valueOf(str2)));
        } else {
            android.util.Log.w(b, "Couldn't delete marker: ".concat(java.lang.String.valueOf(str2)));
        }
    }

    public static boolean b(java.lang.String str, java.lang.String str2) {
        try {
            if (new java.io.File(str, str2).createNewFile()) {
                android.util.Log.w(b, defpackage.a.bA(str2, "File created: "));
                return true;
            }
            android.util.Log.w(b, defpackage.a.bA(str2, "Couldn't create marker: "));
            return false;
        } catch (java.io.IOException e) {
            android.util.Log.e(b, "Exception creating marker.", e);
            return false;
        }
    }
}
