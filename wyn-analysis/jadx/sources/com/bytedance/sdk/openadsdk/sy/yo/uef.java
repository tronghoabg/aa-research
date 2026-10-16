package com.bytedance.sdk.openadsdk.sy.yo;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.sdk.component.utils.tpx;

/* loaded from: classes3.dex */
public class uef {
    private final SharedPreferences uef;

    public uef(Context context) {
        if (tpx.uef(context)) {
            this.uef = context.getSharedPreferences("pag_monitor_record", 0);
            return;
        }
        this.uef = context.getSharedPreferences("pag_monitor_record_" + tpx.yo(context), 0);
    }

    public long uef() {
        return this.uef.getLong("last_upload_time", 0L);
    }

    public void uef(long j8) {
        SharedPreferences.Editor editorEdit = this.uef.edit();
        editorEdit.putLong("last_upload_time", j8);
        editorEdit.apply();
    }
}
