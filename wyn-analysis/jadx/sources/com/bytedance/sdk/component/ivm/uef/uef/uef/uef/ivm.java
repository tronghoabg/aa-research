package com.bytedance.sdk.component.ivm.uef.uef.uef.uef;

import A7.AbstractC0279p0;
import android.content.Context;

/* loaded from: classes.dex */
public class ivm extends xs {
    public ivm(Context context, com.bytedance.sdk.component.ivm.uef.moa.oa.uef uefVar) {
        super(context, uefVar);
    }

    @Override // com.bytedance.sdk.component.ivm.uef.uef.uef.uef.xs, com.bytedance.sdk.component.ivm.uef.uef.uef.uef.yo
    public String oa() {
        return com.bytedance.sdk.component.ivm.uef.xs.ivm().yo().lw();
    }

    @Override // com.bytedance.sdk.component.ivm.uef.uef.uef.uef.xs
    public byte uef() {
        return (byte) 1;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.uef.uef.uef.xs
    public byte yo() {
        return (byte) 3;
    }

    public static String uef(String str) {
        return AbstractC0279p0.l("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }
}
