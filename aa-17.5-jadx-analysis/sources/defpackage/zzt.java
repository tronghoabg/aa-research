package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.File;

/* loaded from: classes3.dex */
public final class zzt implements tni {
    private static final String a = "zzt";

    private static final void b(String str, String str2) {
        String str3 = a;
        if (zrn.e(str3, 4)) {
            Log.i(str3, "Removing client parameters cache file: ".concat(str2));
        }
        if (new File(str, str2).delete()) {
            if (zrn.e(str3, 4)) {
                Log.i(str3, "Client parameters cache file removed successfully.");
            }
        } else if (zrn.e(str3, 4)) {
            Log.i(str3, "Client parameters cache file removed failed.");
        }
    }

    @Override // defpackage.tni
    public final void a(Context context) {
        String absolutePath = context.getFilesDir().getAbsolutePath();
        b(absolutePath, "SavedClientParameters.data.cs");
        b(absolutePath, "DATA_ServerControlledParametersManager.data.v1.".concat(String.valueOf(context.getPackageName())));
    }
}
