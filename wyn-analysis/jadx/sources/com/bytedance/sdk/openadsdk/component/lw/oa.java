package com.bytedance.sdk.openadsdk.component.lw;

import A7.AbstractC0279p0;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.Comparator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class oa {
    public static final Comparator<oa> uef = new Comparator<oa>() { // from class: com.bytedance.sdk.openadsdk.component.lw.oa.1
        @Override // java.util.Comparator
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public int compare(oa oaVar, oa oaVar2) {
            return oaVar.lw() != oaVar2.lw() ? Long.compare(oaVar2.lw(), oaVar.lw()) : Long.compare(oaVar2.yo(), oaVar.yo());
        }
    };
    private final long ivm;
    private final long lw;
    private final long moa;

    /* renamed from: oa, reason: collision with root package name */
    private final String f25342oa;
    private final String xs;
    private final String yo;

    public oa(String str, String str2, long j8, long j10, long j11, String str3) {
        this.f25342oa = str;
        this.yo = str2;
        this.moa = j8;
        this.lw = j10;
        this.ivm = j11;
        this.xs = str3;
    }

    public static oa uef(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new oa(jSONObject.optString("rit"), jSONObject.optString("material"), jSONObject.optLong("expire_time"), jSONObject.optLong("create_time"), jSONObject.optLong(InAppPurchaseMetaData.KEY_PRICE), jSONObject.optString("req_id"));
        } catch (Exception unused) {
            return null;
        }
    }

    public String ivm() {
        return this.xs;
    }

    public long lw() {
        return this.ivm;
    }

    public long moa() {
        return this.lw;
    }

    public String oa() {
        return this.yo;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdCache{mRit=");
        sb2.append(this.f25342oa);
        sb2.append(", mExpireTime=");
        sb2.append(this.moa);
        sb2.append(", mCreateTime=");
        sb2.append(this.lw);
        sb2.append(", mPrice=");
        sb2.append(this.ivm);
        sb2.append(", mReqId='");
        return AbstractC0279p0.n(sb2, this.xs, '}');
    }

    public long yo() {
        return this.moa;
    }

    public JSONObject uef() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("rit", this.f25342oa);
            jSONObject.putOpt("material", this.yo);
            jSONObject.putOpt("expire_time", Long.valueOf(this.moa));
            jSONObject.putOpt("create_time", Long.valueOf(this.lw));
            jSONObject.putOpt(InAppPurchaseMetaData.KEY_PRICE, Long.valueOf(this.ivm));
            jSONObject.putOpt("req_id", this.xs);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
