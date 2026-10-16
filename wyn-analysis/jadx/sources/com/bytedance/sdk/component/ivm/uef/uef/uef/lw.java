package com.bytedance.sdk.component.ivm.uef.uef.uef;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public class lw implements com.bytedance.sdk.component.ivm.uef.uef.lw {
    public static final lw uef = new lw();

    /* renamed from: oa, reason: collision with root package name */
    private volatile SQLiteDatabase f25012oa;

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
        if (this.f25012oa == null) {
            synchronized (this) {
                try {
                    if (this.f25012oa == null) {
                        this.f25012oa = new moa(context).getWritableDatabase();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f25012oa;
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
