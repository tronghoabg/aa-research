package G3;

import android.content.Context;
import android.text.TextUtils;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public abstract class h {
    public static SidecarInterface a(Context context) {
        AbstractC3340k.e(context, "context");
        return SidecarProvider.getSidecarImpl(context.getApplicationContext());
    }

    public static A3.h b() {
        try {
            String apiVersion = SidecarProvider.getApiVersion();
            if (TextUtils.isEmpty(apiVersion)) {
                return null;
            }
            A3.h hVar = A3.h.f295f;
            return Ba.c.H(apiVersion);
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return null;
        }
    }
}
