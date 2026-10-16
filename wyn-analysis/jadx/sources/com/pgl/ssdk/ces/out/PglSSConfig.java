package com.pgl.ssdk.ces.out;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes4.dex */
public final class PglSSConfig {
    public static final int COLLECT_MODE_DEFAULT = 0;
    public static final int COLLECT_MODE_ML_MINIMIZE = 1;
    public static final String CUSTOMINFO_KEY_ADS_URL_BACKUP = "key_ads_url_backup";
    public static final String CUSTOMINFO_KEY_ALLOWED_FIELDS = "fields_allowed";
    public static final String CUSTOMINFO_KEY_CHECKCLAZZ = "check_clz";
    public static final String CUSTOMINFO_KEY_IPV6 = "key_ipv6";
    public static final String CUSTOMINFO_KEY_SEC_CONFIG_STR = "sec_config";
    public static final String CUSTOMINFO_KEY_TARGET_IDC = "target-idc";
    public static final String CUSTOMINFO_KEY_TRANSFER_HOST = "key_transfer_host";
    public static final int OVREGION_TYPE_SG = 2;
    public static final int OVREGION_TYPE_UNKNOWN = -1;
    public static final int OVREGION_TYPE_VA = 1;

    /* renamed from: a, reason: collision with root package name */
    private String f32573a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32574b;

    /* renamed from: c, reason: collision with root package name */
    private final int f32575c;

    /* renamed from: d, reason: collision with root package name */
    private String f32576d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, Object> f32577e;

    /* renamed from: f, reason: collision with root package name */
    private PglSSCallBack f32578f;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f32579a;

        /* renamed from: b, reason: collision with root package name */
        private int f32580b = -1;

        /* renamed from: c, reason: collision with root package name */
        private int f32581c = 0;

        /* renamed from: d, reason: collision with root package name */
        private String f32582d;

        public PglSSConfig build() {
            if (TextUtils.isEmpty(this.f32579a)) {
                return null;
            }
            return new PglSSConfig(this.f32579a, this.f32580b, this.f32581c, this.f32582d);
        }

        public Builder setAdsdkVersion(String str) {
            this.f32582d = str;
            return this;
        }

        public Builder setAppId(String str) {
            this.f32579a = str;
            return this;
        }

        public Builder setCollectMode(int i5) {
            this.f32581c = i5;
            return this;
        }

        public Builder setOVRegionType(int i5) {
            this.f32580b = i5;
            return this;
        }
    }

    private PglSSConfig(String str, int i5, int i10, String str2) {
        this.f32573a = str;
        this.f32574b = i5;
        this.f32575c = i10;
        this.f32576d = str2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getAdSdkVersion() {
        return this.f32576d;
    }

    public String getAppId() {
        return this.f32573a;
    }

    public PglSSCallBack getCallBack() {
        return this.f32578f;
    }

    public int getCollectMode() {
        return this.f32575c;
    }

    public Map<String, Object> getCustomInfo() {
        return this.f32577e;
    }

    public int getOVRegionType() {
        return this.f32574b;
    }

    public void setCallBack(PglSSCallBack pglSSCallBack) {
        this.f32578f = pglSSCallBack;
    }

    public void setCustomInfo(Map<String, Object> map) {
        this.f32577e = map;
    }
}
