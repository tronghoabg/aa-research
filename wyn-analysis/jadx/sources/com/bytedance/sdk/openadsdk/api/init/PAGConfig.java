package com.bytedance.sdk.openadsdk.api.init;

import android.text.TextUtils;
import com.bykv.vk.openvk.uef.uef.uef.xs.yo;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.component.utils.wk;
import com.bytedance.sdk.component.xs.yo.moa;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.api.PAGConstant;
import com.bytedance.sdk.openadsdk.core.dxx;
import com.bytedance.sdk.openadsdk.utils.gb;

/* loaded from: classes3.dex */
public final class PAGConfig implements InitConfig {
    private static String xs;
    private String bcc;
    private String ivm;
    private String lw;

    /* renamed from: oa, reason: collision with root package name */
    private boolean f25273oa;
    private String uef;
    private int yo = -1;
    private int moa = 0;

    public static class Builder {
        private String ivm;
        private String[] lw;

        /* renamed from: oa, reason: collision with root package name */
        private boolean f25274oa;
        private String uef;
        private String xs;
        private int yo = -1;
        private int moa = 0;
        private String bcc = "";

        @Deprecated
        public Builder appIcon(int i5) {
            return this;
        }

        public Builder appId(String str) {
            this.uef = str;
            return this;
        }

        public PAGConfig build() {
            PAGConfig pAGConfig = new PAGConfig();
            pAGConfig.oa(this.uef);
            pAGConfig.oa(this.moa);
            pAGConfig.uef(this.yo);
            pAGConfig.uef(this.f25274oa);
            pAGConfig.yo(this.ivm);
            pAGConfig.uef(this.xs);
            pAGConfig.moa(this.bcc);
            return pAGConfig;
        }

        public Builder debugLog(boolean z2) {
            this.f25274oa = z2;
            return this;
        }

        public Builder needClearTaskReset(String... strArr) {
            this.lw = strArr;
            return this;
        }

        public Builder setAdxId(String str) {
            this.bcc = str;
            return this;
        }

        public Builder setPAConsent(@PAGConstant.PAGPAConsentType int i5) {
            if (i5 == 0 || i5 == 1) {
                this.yo = i5;
                return this;
            }
            this.yo = -2;
            return this;
        }

        public Builder setPackageName(String str) {
            this.ivm = str;
            return this;
        }

        public Builder setUserData(String str) {
            this.xs = str;
            return this;
        }

        public Builder supportMultiProcess(boolean z2) {
            return this;
        }

        public Builder titleBarTheme(int i5) {
            this.moa = i5;
            return this;
        }

        public Builder useTextureView(boolean z2) {
            return this;
        }
    }

    public static void debugLog(boolean z2) {
        if (dxx.uef() != null) {
            if (z2) {
                dxx.uef().oa(1);
                dxx.uef().oa();
                return;
            }
            dxx.uef().oa(0);
            moa.uef(moa.uef.OFF);
            wk.oa();
            yo.oa();
            dhk.oa();
        }
    }

    public static int getPAConsent() {
        if (gb.dj("getPAConsent")) {
            return dxx.uef().lw();
        }
        return -1;
    }

    public static void setAppIconId(int i5) {
        if (dxx.uef() != null) {
            dxx.uef().yo(i5);
        }
    }

    public static void setPAConsent(@PAGConstant.PAGPAConsentType int i5) {
        if (gb.dj("setPAConsent")) {
            if (i5 == 1 || i5 == 0) {
                dxx.uef().moa(i5);
            } else {
                dxx.uef().moa(-2);
            }
        }
    }

    public static void setPackageName(String str) {
        xs = str;
    }

    public static void setUserData(String str) {
        if (dxx.uef() != null) {
            dxx.uef().oa(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getAdxId() {
        return this.bcc;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getAppId() {
        return this.uef;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getData() {
        return this.ivm;
    }

    public boolean getDebugLog() {
        return this.f25273oa;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getPA() {
        return this.yo;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getPackageName() {
        return TextUtils.isEmpty(this.lw) ? xs : this.lw;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getTitleBarTheme() {
        return this.moa;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isSupportMultiProcess() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isUseTextureView() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void moa(String str) {
        this.bcc = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yo(String str) {
        this.lw = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oa(String str) {
        this.uef = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oa(int i5) {
        this.moa = i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(String str) {
        this.ivm = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(boolean z2) {
        this.f25273oa = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(int i5) {
        this.yo = i5;
    }
}
