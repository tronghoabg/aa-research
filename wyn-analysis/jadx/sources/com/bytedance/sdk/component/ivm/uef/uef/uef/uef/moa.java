package com.bytedance.sdk.component.ivm.uef.uef.uef.uef;

import A7.AbstractC0279p0;
import android.content.Context;

/* loaded from: classes.dex */
public class moa extends uef {
    public moa(Context context, com.bytedance.sdk.component.ivm.uef.moa.oa.uef uefVar) {
        super(context, uefVar);
    }

    @Override // com.bytedance.sdk.component.ivm.uef.uef.uef.uef.yo
    public long ivm() {
        return com.bytedance.sdk.component.ivm.uef.xs.uef.oa();
    }

    @Override // com.bytedance.sdk.component.ivm.uef.uef.uef.uef.uef
    public byte moa() {
        return (byte) 0;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.uef.uef.uef.uef, com.bytedance.sdk.component.ivm.uef.uef.uef.uef.yo
    public String oa() {
        com.bytedance.sdk.component.ivm.uef.uef.lw lwVarYo = com.bytedance.sdk.component.ivm.uef.xs.ivm().yo();
        if (lwVarYo != null) {
            return lwVarYo.uef();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.uef.uef.uef.uef
    public byte yo() {
        return (byte) 1;
    }

    public static String yo(String str) {
        return AbstractC0279p0.l("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }
}
