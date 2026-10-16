package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.cp;
import com.bytedance.sdk.openadsdk.core.gb;
import com.bytedance.sdk.openadsdk.utils.ab;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class TTAdActivity extends TTBaseActivity {

    /* renamed from: oa, reason: collision with root package name */
    private boolean f25157oa;
    private oa uef;
    private int yo = -1;
    private final AtomicBoolean moa = new AtomicBoolean(false);

    private void lw() {
        oa oaVar = this.uef;
        if (oaVar == null) {
            super.onBackPressed();
        } else {
            oaVar.cz();
        }
    }

    private void yo() {
        if (!this.f25157oa) {
            cp.uef().uef((com.bytedance.sdk.openadsdk.uef.lw.uef) null);
            cp.uef().uef((com.bytedance.sdk.openadsdk.uef.yo.oa) null);
        } else if (!TextUtils.isEmpty(this.zjm)) {
            cp.uef().uef(this.zjm, isFinishing(), isChangingConfigurations());
        }
        ab.uef();
        gb.uef().uef(String.valueOf(hashCode()));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    public void a_() {
        lw();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    public boolean moa() {
        return true;
    }

    public com.bytedance.sdk.openadsdk.uef.yo.oa oa(String str) {
        if (!this.f25157oa) {
            return cp.uef().yo();
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (com.bytedance.sdk.openadsdk.uef.yo.oa) cp.uef().uef(str, com.bytedance.sdk.openadsdk.uef.yo.oa.class);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        oa oaVar = this.uef;
        if (oaVar != null) {
            oaVar.uef((Activity) this);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        lw();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            java.lang.String r0 = "activity_recreate"
            super.onCreate(r8)
            android.content.Intent r1 = r7.getIntent()
            r2 = 0
            java.lang.String r3 = "enable_new_arch"
            java.lang.String r4 = "single_process_listener_key"
            if (r8 == 0) goto L1d
            java.lang.String r1 = r8.getString(r4)
            r7.zjm = r1
            boolean r1 = r8.getBoolean(r3, r2)
            r7.f25157oa = r1
            goto L36
        L1d:
            if (r1 == 0) goto L36
            java.lang.String r4 = r1.getStringExtra(r4)
            r7.zjm = r4
            boolean r2 = r1.getBooleanExtra(r3, r2)
            r7.f25157oa = r2
            java.lang.String r2 = "start_show_time"
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r1 = r1.getLongExtra(r2, r3)
            goto L38
        L36:
            r1 = 0
        L38:
            java.lang.String r3 = r7.zjm
            com.bytedance.sdk.openadsdk.uef.lw.uef r3 = r7.uef(r3)
            java.lang.String r4 = r7.zjm
            com.bytedance.sdk.openadsdk.uef.yo.oa r4 = r7.oa(r4)
            android.content.Intent r5 = r7.getIntent()
            r6 = 0
            com.bytedance.sdk.openadsdk.core.model.gzw r5 = com.bytedance.sdk.openadsdk.component.reward.uef.yo.uef(r5, r8, r6)
            if (r5 != 0) goto L53
            r7.finish()
            return
        L53:
            r5.uef(r1)     // Catch: java.lang.Throwable -> L6d
            com.bytedance.sdk.openadsdk.activity.single.oa r1 = new com.bytedance.sdk.openadsdk.activity.single.oa     // Catch: java.lang.Throwable -> L6d
            boolean r2 = r7.f25157oa     // Catch: java.lang.Throwable -> L6d
            r1.<init>(r7, r5, r2)     // Catch: java.lang.Throwable -> L6d
            r7.uef = r1     // Catch: java.lang.Throwable -> L6d
            if (r8 == 0) goto L6f
            boolean r1 = r5.sk()     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L6f
            com.bytedance.sdk.openadsdk.activity.single.oa r1 = r7.uef     // Catch: java.lang.Throwable -> L6d
            r1.sy()     // Catch: java.lang.Throwable -> L6d
            goto L6f
        L6d:
            r8 = move-exception
            goto L81
        L6f:
            com.bytedance.sdk.openadsdk.activity.single.oa r1 = r7.uef     // Catch: java.lang.Throwable -> L6d
            r1.uef(r7, r8, r3, r4)     // Catch: java.lang.Throwable -> L6d
            if (r8 == 0) goto L7d
            java.lang.String r8 = r5.lw()     // Catch: java.lang.Throwable -> L6d
            com.bytedance.sdk.openadsdk.moa.zjm.uef(r5, r0, r8, r0, r6)     // Catch: java.lang.Throwable -> L6d
        L7d:
            com.bytedance.sdk.openadsdk.utils.oa.uef(r5)     // Catch: java.lang.Throwable -> L6d
            return
        L81:
            java.lang.String r0 = "BVA"
            java.lang.String r1 = "onCreate: "
            com.bytedance.sdk.component.utils.dhk.uef(r0, r1, r8)
            java.lang.String r8 = r5.lw()
            java.lang.String r0 = "init_view_crash"
            java.lang.String r1 = "show_ad_fail"
            com.bytedance.sdk.openadsdk.moa.zjm.uef(r5, r1, r8, r0)
            r7.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.single.TTAdActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        oa();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onPause() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onPause();
        oa oaVar = this.uef;
        if (oaVar != null) {
            oaVar.yo(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onResume();
        oa oaVar = this.uef;
        if (oaVar != null) {
            oaVar.oa(this);
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!TextUtils.isEmpty(this.zjm)) {
            bundle.putString("single_process_listener_key", this.zjm);
        }
        bundle.putBoolean("enable_new_arch", this.f25157oa);
        oa oaVar = this.uef;
        if (oaVar != null) {
            int iUef = cp.uef().uef(oaVar.uef());
            this.yo = iUef;
            this.uef.uef(this, bundle, iUef);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.yo >= 0) {
            cp.uef().yo(this.yo);
            this.yo = -1;
        }
        oa oaVar = this.uef;
        if (oaVar != null) {
            oaVar.uef(this);
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        oa oaVar = this.uef;
        if (oaVar != null) {
            oaVar.moa(this);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        oa oaVar = this.uef;
        if (oaVar != null) {
            oaVar.uef(z2);
        }
    }

    public com.bytedance.sdk.openadsdk.uef.lw.uef uef(String str) {
        if (!this.f25157oa) {
            return cp.uef().oa();
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (com.bytedance.sdk.openadsdk.uef.lw.uef) cp.uef().uef(str, com.bytedance.sdk.openadsdk.uef.lw.uef.class);
    }

    private void oa() {
        if (this.moa.compareAndSet(false, true)) {
            oa oaVar = this.uef;
            if (oaVar != null) {
                oaVar.lw(this);
            }
            yo();
        }
    }
}
