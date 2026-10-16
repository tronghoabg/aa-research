package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.model.gzw;

/* loaded from: classes3.dex */
public class moa extends wrv {
    public moa(Context context) {
        super(context);
        this.f25322oa = false;
    }

    @Override // com.bytedance.sdk.openadsdk.common.wrv
    public void uef() {
        post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.moa.1
            @Override // java.lang.Runnable
            public void run() {
                moa moaVar = moa.this;
                if (moaVar.uef != null) {
                    moaVar.setVisibility(0);
                }
            }
        });
    }

    public void uef(gzw gzwVar, String str, int i5, String str2, long j8, boolean z2, int i10, long j10) {
        if (getVisibility() != 8) {
            com.bytedance.sdk.openadsdk.moa.yo.uef(gzwVar, str, i5, str2, SystemClock.elapsedRealtime() - j8, z2, i10, j10);
            super.oa();
        }
    }
}
