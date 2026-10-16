package com.bytedance.sdk.component.ivm.uef.yo;

import com.bytedance.sdk.component.ivm.uef.lw;
import com.bytedance.sdk.component.ivm.uef.xs;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class oa {
    public static void uef(AtomicLong atomicLong, int i5) {
        lw lwVarWk = xs.ivm().wk();
        if (lwVarWk == null || !lwVarWk.xs() || atomicLong == null) {
            return;
        }
        atomicLong.getAndAdd(i5);
    }
}
