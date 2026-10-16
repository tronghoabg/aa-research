package defpackage;

import android.content.Context;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class pki {
    private static final Map a = new EnumMap(pkh.class);

    public static synchronized void a(Context context) {
        Iterator it = a.values().iterator();
        while (it.hasNext()) {
            ((pkj) it.next()).a(context);
        }
    }
}
