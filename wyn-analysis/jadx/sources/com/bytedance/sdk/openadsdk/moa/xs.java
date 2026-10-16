package com.bytedance.sdk.openadsdk.moa;

import com.unity3d.services.UnityAdsConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class xs {
    private long lw;
    private long moa;

    /* renamed from: oa, reason: collision with root package name */
    private long f26005oa;
    private long uef;
    private long yo;

    public void lw(long j8) {
        if (this.lw <= 0) {
            this.lw = j8;
        }
    }

    public void moa(long j8) {
        if (this.moa <= 0) {
            this.moa = j8;
        }
    }

    public void oa(long j8) {
        if (this.f26005oa <= 0) {
            this.f26005oa = j8;
        }
    }

    public void uef(long j8) {
        if (this.uef <= 0) {
            this.uef = j8;
        }
    }

    public void yo(long j8) {
        if (this.yo <= 0) {
            this.yo = j8;
        }
    }

    public JSONObject oa() {
        return uef((JSONObject) null);
    }

    public boolean uef() {
        return this.uef > 0;
    }

    public void uef(long j8, float f10) {
        if (f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            uef(j8);
        }
        double d3 = f10;
        if (d3 >= 0.25d) {
            uef(j8);
            oa(j8);
        }
        if (d3 >= 0.5d) {
            uef(j8);
            oa(j8);
            yo(j8);
        }
        if (d3 >= 0.75d) {
            uef(j8);
            oa(j8);
            yo(j8);
            moa(j8);
        }
        if (f10 >= 1.0f) {
            uef(j8);
            oa(j8);
            yo(j8);
            moa(j8);
            lw(j8);
        }
    }

    public JSONObject uef(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
            }
        }
        long j8 = this.uef;
        if (j8 > 0) {
            jSONObject.put("show_start", j8);
            long j10 = this.f26005oa;
            if (j10 > 0) {
                jSONObject.put("show_firstQuartile", j10);
                long j11 = this.yo;
                if (j11 > 0) {
                    jSONObject.put("show_mid", j11);
                    long j12 = this.moa;
                    if (j12 > 0) {
                        jSONObject.put("show_thirdQuartile", j12);
                        long j13 = this.lw;
                        if (j13 > 0) {
                            jSONObject.put("show_full", j13);
                        }
                    }
                }
            }
        }
        return jSONObject;
    }
}
