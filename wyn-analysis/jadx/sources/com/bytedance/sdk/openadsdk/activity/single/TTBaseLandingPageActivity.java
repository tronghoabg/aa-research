package com.bytedance.sdk.openadsdk.activity.single;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public class TTBaseLandingPageActivity extends TTBaseActivity {

    /* renamed from: oa, reason: collision with root package name */
    private long f25162oa;
    private long uef;

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        long j8 = this.uef;
        if (j8 > 0) {
            com.bytedance.sdk.openadsdk.utils.lw.uef(j8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onPause() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onPause();
        if (this.f25162oa > 0) {
            this.uef = (SystemClock.elapsedRealtime() - this.f25162oa) + this.uef;
            this.f25162oa = 0L;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onResume();
        if (com.bytedance.sdk.openadsdk.utils.lw.yo()) {
            this.f25162oa = SystemClock.elapsedRealtime();
        }
    }
}
