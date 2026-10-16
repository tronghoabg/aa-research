package com.bytedance.sdk.openadsdk.moa.uef;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes3.dex */
public class moa implements com.bytedance.sdk.component.ivm.uef.uef.lw {
    public static final moa uef = new moa();

    /* renamed from: oa, reason: collision with root package name */
    private volatile SQLiteDatabase f25997oa;

    @Override // com.bytedance.sdk.component.ivm.uef.uef.lw
    public String ivm() {
        return null;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.uef.lw
    public String lw() {
        return "logstatsbatch";
    }

    @Override // com.bytedance.sdk.component.ivm.uef.uef.lw
    public String moa() {
        return "logstats";
    }

    @Override // com.bytedance.sdk.component.ivm.uef.uef.lw
    public String oa() {
        return "adevent";
    }

    @Override // com.bytedance.sdk.component.ivm.uef.uef.lw
    public SQLiteDatabase uef(Context context) {
        if (this.f25997oa == null) {
            synchronized (this) {
                try {
                    if (this.f25997oa == null) {
                        this.f25997oa = com.bytedance.sdk.openadsdk.core.ivm.uef(context).uef().uef();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f25997oa;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.uef.lw
    public String yo() {
        return null;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.uef.lw
    public String uef() {
        return "loghighpriority";
    }
}
