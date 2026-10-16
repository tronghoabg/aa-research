package com.bytedance.sdk.openadsdk.core.xs;

import android.content.Context;
import com.bytedance.sdk.openadsdk.core.xs.yo;

/* loaded from: classes3.dex */
public class uef extends yo {
    private static volatile uef uef;

    private uef(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.xs.yo
    public /* bridge */ /* synthetic */ yo.C0111yo uef() {
        return super.uef();
    }

    public static uef uef(Context context) {
        if (uef == null) {
            synchronized (uef.class) {
                try {
                    if (uef == null) {
                        uef = new uef(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return uef;
    }
}
