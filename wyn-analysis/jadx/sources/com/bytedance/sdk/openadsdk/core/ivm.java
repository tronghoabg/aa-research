package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import com.bytedance.sdk.openadsdk.core.xs;

/* loaded from: classes3.dex */
public class ivm extends xs {
    private static volatile ivm uef;

    private ivm(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.xs
    public /* bridge */ /* synthetic */ xs.yo uef() {
        return super.uef();
    }

    public static ivm uef(Context context) {
        if (uef == null) {
            synchronized (ivm.class) {
                try {
                    if (uef == null) {
                        uef = new ivm(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return uef;
    }
}
