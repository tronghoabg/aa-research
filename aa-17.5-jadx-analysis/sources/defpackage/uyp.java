package defpackage;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class uyp {
    public static final yob a = yob.c("com/google/android/libraries/geo/systems/fileutil/FileUtilInstance");
    public final xyc b;
    private final xyc c;

    public uyp(Context context, Executor executor) {
        c(context, false, "testdata", executor);
        this.c = c(context, true, "testdata", executor);
        this.b = c(context, false, "cache", executor);
    }

    public static File a(Context context, boolean z, String str) {
        File dir = null;
        if (!z && Environment.getExternalStorageState().equals("mounted")) {
            try {
                dir = context.getExternalFilesDir(null);
            } catch (Exception unused) {
            }
            dir = uym.b(dir);
        }
        if (dir == null) {
            dir = context.getDir("", 0);
        }
        return new File(dir, str);
    }

    private static xyc c(Context context, boolean z, String str, Executor executor) {
        xyc xycVarL = wub.L(new uyn(context, z, str));
        executor.execute(new uyo(xycVarL));
        return xycVarL;
    }

    public final File b() {
        return (File) this.c.gu();
    }
}
