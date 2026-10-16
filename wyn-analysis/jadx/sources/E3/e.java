package e3;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.InputEvent;
import g3.C2697b;
import kotlin.jvm.internal.AbstractC3340k;
import p8.p;

/* loaded from: classes.dex */
public abstract class e {
    public static final d a(Context context) {
        AbstractC3340k.e(context, "context");
        StringBuilder sb2 = new StringBuilder("AdServicesInfo.version=");
        int i5 = Build.VERSION.SDK_INT;
        c3.a aVar = c3.a.f19583a;
        sb2.append(i5 >= 30 ? aVar.a() : 0);
        Log.d("MeasurementManager", sb2.toString());
        C2697b c2697b = (i5 >= 30 ? aVar.a() : 0) >= 5 ? new C2697b(context) : null;
        if (c2697b != null) {
            return new d(c2697b);
        }
        return null;
    }

    public abstract p b(Uri uri, InputEvent inputEvent);
}
