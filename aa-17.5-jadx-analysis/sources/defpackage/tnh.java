package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.File;

/* loaded from: classes3.dex */
public final class tnh {
    private static final String a = "tnh";
    private final yfq b;

    public tnh(yfq yfqVar) {
        this.b = yfqVar;
    }

    @ResultIgnorabilityUnspecified
    public final synchronized boolean a(Context context) {
        String absolutePath = context.getFilesDir().getAbsolutePath();
        int i = tnd.a;
        if (!new File(absolutePath, "_google_maps_sdk_recovery_needed_").exists()) {
            return false;
        }
        String str = a;
        Log.w(str, "Invoking recovery actions due to previous crash loop detection.");
        try {
            ynp ynpVarListIterator = this.b.listIterator(0);
            while (ynpVarListIterator.hasNext()) {
                ((tni) ynpVarListIterator.next()).a(context);
            }
            tnd.a(absolutePath, "_google_maps_sdk_recovery_needed_");
            for (String str2 : new File(absolutePath).list(new tnc(0))) {
                tnd.a(absolutePath, str2);
            }
            Log.w(str, "Crash loop detection recovery actions completed.");
            return true;
        } catch (RuntimeException unused) {
            Log.w(a, "Crash loop detection recovery actions failed");
            return false;
        }
    }
}
