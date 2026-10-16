package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class tnd {
    public static final /* synthetic */ int a = 0;
    private static final String b = "tnd";

    private tnd() {
    }

    public static void a(String str, String str2) {
        if (new File(str, str2).delete()) {
            Log.w(b, "Marker deleted: ".concat(String.valueOf(str2)));
        } else {
            Log.w(b, "Couldn't delete marker: ".concat(String.valueOf(str2)));
        }
    }

    public static boolean b(String str, String str2) {
        try {
            if (new File(str, str2).createNewFile()) {
                Log.w(b, a.bz(str2, "File created: "));
                return true;
            }
            Log.w(b, a.bz(str2, "Couldn't create marker: "));
            return false;
        } catch (IOException e) {
            Log.e(b, "Exception creating marker.", e);
            return false;
        }
    }
}
