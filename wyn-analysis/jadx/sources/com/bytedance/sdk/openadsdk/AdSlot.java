package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bykv.vk.openvk.uef.uef.uef.xs.oa;
import com.bytedance.sdk.component.utils.wk;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class AdSlot {
    public static final int ANCHORED_BANNER = 2;
    public static final int FIX_BANNER = 1;
    public static final int INLINE_BANNER = 3;
    public static final int TYPE_BANNER = 1;
    public static final int TYPE_CACHED_SPLASH = 4;
    public static final int TYPE_FEED = 5;
    public static final int TYPE_FULL_SCREEN_VIDEO = 8;
    public static final int TYPE_INTERACTION_AD = 2;
    public static final int TYPE_OPEN_AD = 3;
    public static final int TYPE_REWARD_VIDEO = 7;

    /* renamed from: ab, reason: collision with root package name */
    private String f25122ab;
    private String bcc;
    private String bs;
    private boolean cq;
    private int cz;
    private int dhk;
    private String dj;
    private boolean dz;
    private int gr;
    private int gsd;
    private int gzw;
    private int ivm;
    private float lw;
    private float moa;

    /* renamed from: oa, reason: collision with root package name */
    private int f25123oa;
    private String oib;
    private int orq;
    private Map<String, Object> pz;
    private boolean rt;
    private String sy;
    private int tpx;

    /* renamed from: ue, reason: collision with root package name */
    private long f25124ue;
    private String uef;
    private String wk;
    private int wrv;
    private boolean xs;
    private int yo;
    private String zjm;

    public static class Builder {

        /* renamed from: ab, reason: collision with root package name */
        private String f25125ab;
        private String bcc;
        private String bs;
        private boolean cq;
        private float dj;
        private String dz;
        private String sy;
        private int tpx;
        private String uef;
        private String wk;
        private float wrv;
        private int zjm;

        /* renamed from: oa, reason: collision with root package name */
        private int f25126oa = 640;
        private int yo = Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
        private final boolean moa = true;
        private int lw = 1;
        private final String ivm = "";
        private final int xs = 0;
        private String cz = "defaultUser";
        private boolean oib = true;
        private Map<String, Object> dhk = null;
        private int orq = 1;

        public AdSlot build() {
            AdSlot adSlot = new AdSlot();
            adSlot.uef = this.uef;
            adSlot.ivm = this.lw;
            adSlot.xs = true;
            adSlot.f25123oa = this.f25126oa;
            adSlot.yo = this.yo;
            float f10 = this.dj;
            if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                adSlot.moa = this.f25126oa;
                adSlot.lw = this.yo;
            } else {
                adSlot.moa = f10;
                adSlot.lw = this.wrv;
            }
            adSlot.bcc = "";
            adSlot.cz = 0;
            adSlot.zjm = this.bcc;
            adSlot.dj = this.cz;
            adSlot.wrv = this.zjm;
            adSlot.cq = this.oib;
            adSlot.dz = this.cq;
            adSlot.wk = this.dz;
            adSlot.f25122ab = this.wk;
            adSlot.bs = this.f25125ab;
            adSlot.sy = this.bs;
            adSlot.oib = this.sy;
            adSlot.pz = this.dhk;
            adSlot.gzw = this.tpx;
            adSlot.gsd = this.orq;
            return adSlot;
        }

        public Builder isExpressAd(boolean z2) {
            this.cq = z2;
            return this;
        }

        public Builder setAdCount(int i5) {
            if (i5 <= 0) {
                i5 = 1;
            }
            if (i5 > 20) {
                i5 = 20;
            }
            this.lw = i5;
            return this;
        }

        public Builder setAdId(String str) {
            this.wk = str;
            return this;
        }

        public Builder setBannerType(int i5) {
            this.orq = i5;
            return this;
        }

        public Builder setCodeId(String str) {
            this.uef = str;
            return this;
        }

        public Builder setCreativeId(String str) {
            this.f25125ab = str;
            return this;
        }

        public Builder setDurationSlotType(int i5) {
            this.tpx = i5;
            return this;
        }

        public Builder setExpressViewAcceptedSize(float f10, float f11) {
            this.dj = f10;
            this.wrv = f11;
            return this;
        }

        public Builder setExt(String str) {
            this.bs = str;
            return this;
        }

        public Builder setImageAcceptedSize(int i5, int i10) {
            this.f25126oa = i5;
            this.yo = i10;
            return this;
        }

        public Builder setIsAutoPlay(boolean z2) {
            this.oib = z2;
            return this;
        }

        public Builder setMediaExtra(String str) {
            this.bcc = str;
            return this;
        }

        public Builder setNativeAdType(int i5) {
            this.zjm = i5;
            return this;
        }

        public Builder setRequestExtraMap(Map<String, Object> map) {
            this.dhk = map;
            return this;
        }

        public Builder setRewardAmount(int i5) {
            return this;
        }

        public Builder setRewardName(String str) {
            return this;
        }

        public Builder setSupportDeepLink(boolean z2) {
            return this;
        }

        public Builder setUserData(String str) {
            this.sy = str;
            return this;
        }

        public Builder setUserID(String str) {
            this.cz = str;
            return this;
        }

        public Builder withBid(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (wk.yo()) {
                oa.uef(str);
            }
            this.dz = str;
            return this;
        }
    }

    public static int getPosition(int i5) {
        if (i5 == 1) {
            return 2;
        }
        if (i5 != 2) {
            return (i5 == 3 || i5 == 4 || i5 == 7 || i5 == 8) ? 5 : 3;
        }
        return 4;
    }

    public static AdSlot getSlot(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Builder builder = new Builder();
        try {
            int iOptInt = jSONObject.optInt("mImgAcceptedWidth", 640);
            int iOptInt2 = jSONObject.optInt("mImgAcceptedHeight", Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE);
            double dOptDouble = jSONObject.optDouble("mExpressViewAcceptedWidth", 0.0d);
            double dOptDouble2 = jSONObject.optDouble("mExpressViewAcceptedHeight", 0.0d);
            builder.setCodeId(jSONObject.optString("mCodeId", null));
            builder.setAdCount(jSONObject.optInt("mAdCount", 1));
            builder.setIsAutoPlay(jSONObject.optBoolean("mIsAutoPlay"));
            builder.setImageAcceptedSize(iOptInt, iOptInt2);
            builder.setExpressViewAcceptedSize(Double.valueOf(dOptDouble).floatValue(), Double.valueOf(dOptDouble2).floatValue());
            builder.setSupportDeepLink(jSONObject.optBoolean("mSupportDeepLink", false));
            builder.setRewardName(jSONObject.optString("mRewardName", null));
            builder.setRewardAmount(jSONObject.optInt("mRewardAmount"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra", null));
            builder.setUserID(jSONObject.optString("mUserID", null));
            builder.setNativeAdType(jSONObject.optInt("mNativeAdType"));
            builder.isExpressAd(jSONObject.optBoolean("mIsExpressAd"));
            builder.withBid(jSONObject.optString("mBidAdm"));
            builder.setAdId(jSONObject.optString("mAdId"));
            builder.setCreativeId(jSONObject.optString("mCreativeId"));
            builder.setExt(jSONObject.optString("mExt"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra"));
            builder.setBannerType(jSONObject.optInt("mBannerType"));
        } catch (Exception unused) {
        }
        AdSlot adSlotBuild = builder.build();
        adSlotBuild.setDurationSlotType(jSONObject.optInt("mDurationSlotType"));
        return adSlotBuild;
    }

    public int getAdCount() {
        return this.ivm;
    }

    public String getAdId() {
        return this.f25122ab;
    }

    public int getBannerType() {
        return this.gsd;
    }

    public String getBidAdm() {
        return this.wk;
    }

    public int getCacheScene() {
        return this.gr;
    }

    public long getCacheTime() {
        return this.f25124ue;
    }

    public String getCodeId() {
        return this.uef;
    }

    public String getCreativeId() {
        return this.bs;
    }

    public int getDurationSlotType() {
        return this.gzw;
    }

    public float getExpressViewAcceptedHeight() {
        return this.lw;
    }

    public float getExpressViewAcceptedWidth() {
        return this.moa;
    }

    public String getExt() {
        return this.sy;
    }

    public int getImgAcceptedHeight() {
        return this.yo;
    }

    public int getImgAcceptedWidth() {
        return this.f25123oa;
    }

    public int getIsRotateBanner() {
        return this.dhk;
    }

    public String getMediaExtra() {
        return this.zjm;
    }

    public Map<String, Object> getRequestExtraMap() {
        return this.pz;
    }

    public int getRewardAmount() {
        return this.cz;
    }

    public String getRewardName() {
        return this.bcc;
    }

    public int getRotateOrder() {
        return this.orq;
    }

    public int getRotateTime() {
        return this.tpx;
    }

    public String getUserData() {
        return this.oib;
    }

    public String getUserID() {
        return this.dj;
    }

    public boolean isAutoPlay() {
        return this.cq;
    }

    public boolean isExpressAd() {
        return this.dz;
    }

    public boolean isPreload() {
        return this.rt;
    }

    public boolean isSupportDeepLink() {
        return this.xs;
    }

    public void setAdCount(int i5) {
        this.ivm = i5;
    }

    public void setCacheScene(int i5) {
        this.gr = i5;
    }

    public void setCacheTime(long j8) {
        this.f25124ue = j8;
    }

    public void setDurationSlotType(int i5) {
        this.gzw = i5;
    }

    public void setExpressViewAccepted(float f10, float f11) {
        this.moa = f10;
        this.lw = f11;
    }

    public void setIsRotateBanner(int i5) {
        this.dhk = i5;
    }

    public void setPreload(boolean z2) {
        this.rt = z2;
    }

    public void setRotateOrder(int i5) {
        this.orq = i5;
    }

    public void setRotateTime(int i5) {
        this.tpx = i5;
    }

    public void setUserData(String str) {
        this.oib = str;
    }

    public JSONObject toJsonObj() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mCodeId", this.uef);
            jSONObject.put("mAdCount", this.ivm);
            jSONObject.put("mIsAutoPlay", this.cq);
            jSONObject.put("mImgAcceptedWidth", this.f25123oa);
            jSONObject.put("mImgAcceptedHeight", this.yo);
            jSONObject.put("mExpressViewAcceptedWidth", this.moa);
            jSONObject.put("mExpressViewAcceptedHeight", this.lw);
            jSONObject.put("mSupportDeepLink", this.xs);
            jSONObject.put("mRewardName", this.bcc);
            jSONObject.put("mRewardAmount", this.cz);
            jSONObject.put("mMediaExtra", this.zjm);
            jSONObject.put("mUserID", this.dj);
            jSONObject.put("mNativeAdType", this.wrv);
            jSONObject.put("mIsExpressAd", this.dz);
            jSONObject.put("mAdId", this.f25122ab);
            jSONObject.put("mCreativeId", this.bs);
            jSONObject.put("mExt", this.sy);
            jSONObject.put("mBidAdm", this.wk);
            jSONObject.put("mUserData", this.oib);
            jSONObject.put("mDurationSlotType", this.gzw);
            jSONObject.put("mBannerType", this.gsd);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String toString() {
        return super.toString();
    }

    private AdSlot() {
        this.cq = true;
        this.dz = false;
        this.dhk = 0;
        this.tpx = 0;
        this.orq = 0;
        this.gsd = 1;
    }
}
