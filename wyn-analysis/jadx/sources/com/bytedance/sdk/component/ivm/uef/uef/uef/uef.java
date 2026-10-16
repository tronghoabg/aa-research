package com.bytedance.sdk.component.ivm.uef.uef.uef;

import android.content.Context;
import com.bytedance.sdk.component.ivm.uef.uef.uef.oa;

/* loaded from: classes.dex */
public class uef extends oa {
    private static volatile uef uef;

    private uef(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.component.ivm.uef.uef.uef.oa
    public /* bridge */ /* synthetic */ oa.C0061oa uef() {
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
