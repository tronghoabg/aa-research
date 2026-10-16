package com.bytedance.sdk.component.ivm.uef.ivm;

import com.bytedance.sdk.component.ivm.uef.xs;

/* loaded from: classes.dex */
public class uef {
    private static volatile oa uef;

    public static oa uef() {
        if (uef == null) {
            synchronized (oa.class) {
                try {
                    if (uef == null) {
                        uef = new yo(xs.ivm().lw(), new ivm(xs.ivm().lw()));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return uef;
    }
}
