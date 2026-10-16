package com.bytedance.sdk.component.xs.uef;

import com.bytedance.sdk.component.xs.oa.yo;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class oa extends uef {
    @Override // com.bytedance.sdk.component.xs.uef.uef
    public void uef(yo yoVar, IOException iOException) {
        uef(yoVar, iOException, null);
    }

    public abstract void uef(yo yoVar, IOException iOException, com.bytedance.sdk.component.xs.oa oaVar);
}
