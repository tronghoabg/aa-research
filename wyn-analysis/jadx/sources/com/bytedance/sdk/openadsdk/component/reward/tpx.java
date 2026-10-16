package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class tpx {
    private static final Map<Integer, uef<?, ?>> uef = new ConcurrentHashMap();

    private static uef<?, ?> oa(Context context, int i5) {
        if (i5 == 7) {
            return new sy(context);
        }
        if (i5 == 8) {
            return new xs(context);
        }
        throw new IllegalArgumentException("Unsupported ad type: ".concat(String.valueOf(i5)));
    }

    public static uef<?, ?> uef(Context context, int i5) {
        uef<?, ?> uefVarOa;
        Map<Integer, uef<?, ?>> map = uef;
        uef<?, ?> uefVar = map.get(Integer.valueOf(i5));
        if (uefVar != null) {
            return uefVar;
        }
        synchronized (tpx.class) {
            try {
                uefVarOa = map.get(Integer.valueOf(i5));
                if (uefVarOa == null) {
                    uefVarOa = oa(context, i5);
                    map.put(Integer.valueOf(i5), uefVarOa);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return uefVarOa;
    }
}
