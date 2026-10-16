package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import java.io.File;

/* loaded from: classes.dex */
public final class wac {
    public static final /* synthetic */ int a = 0;
    private static Boolean b;
    private static final yw c = new yw();

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized Uri a(String str) {
        yw ywVar = c;
        Uri uri = (Uri) ywVar.get(str);
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode(str))));
        ywVar.put(str, uri2);
        return uri2;
    }

    public static File b(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return filesDir;
        }
        SystemClock.sleep(100L);
        File filesDir2 = context.getFilesDir();
        if (filesDir2 != null) {
            return filesDir2;
        }
        throw new IllegalStateException("getFilesDir returned null twice.");
    }

    public static boolean c() {
        Boolean boolValueOf = b;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(Process.isIsolated());
            b = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static String d(Context context, String str) {
        if (str.contains("#")) {
            throw new IllegalArgumentException("The passed in package cannot already have a subpackage: ".concat(String.valueOf(str)));
        }
        return str + "#" + context.getPackageName();
    }
}
