package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class uef {
    private String ivm;
    private long lw;
    private long moa;

    /* renamed from: oa, reason: collision with root package name */
    private float f24690oa;
    private String uef;
    private List<C0038uef> yo;

    /* renamed from: com.bytedance.adsdk.ugeno.core.uef$uef, reason: collision with other inner class name */
    public static class C0038uef {
        private float[] bcc;
        private String cz;
        private float ivm;
        private String lw;
        private long moa;

        /* renamed from: oa, reason: collision with root package name */
        private float f24691oa;
        private long uef;
        private float xs;
        private String yo;
        private String zjm;

        public float[] bcc() {
            return this.bcc;
        }

        public String cz() {
            return this.cz;
        }

        public float ivm() {
            return this.ivm;
        }

        public String lw() {
            return this.lw;
        }

        public long moa() {
            return this.moa;
        }

        public float oa() {
            return this.f24691oa;
        }

        public long uef() {
            return this.uef;
        }

        public float xs() {
            return this.xs;
        }

        public String yo() {
            return this.yo;
        }

        public String zjm() {
            return this.zjm;
        }

        public void moa(String str) {
            this.cz = str;
        }

        public void oa(long j8) {
            this.moa = j8;
        }

        public void uef(long j8) {
            this.uef = j8;
        }

        public void yo(float f10) {
            this.xs = f10;
        }

        public void oa(String str) {
            this.lw = str;
        }

        public void uef(float f10) {
            this.f24691oa = f10;
        }

        public void yo(String str) {
            this.zjm = str;
        }

        public void oa(float f10) {
            this.ivm = f10;
        }

        public void uef(String str) {
            this.yo = str;
        }

        public void uef(float[] fArr) {
            this.bcc = fArr;
        }

        public static C0038uef uef(JSONObject jSONObject, com.bytedance.adsdk.ugeno.oa.yo yoVar) {
            if (jSONObject == null) {
                return null;
            }
            C0038uef c0038uef = new C0038uef();
            c0038uef.uef(jSONObject.optLong("duration"));
            String strOptString = jSONObject.optString("loop");
            if (TextUtils.equals("infinite", strOptString)) {
                c0038uef.uef(-1.0f);
            } else {
                try {
                    c0038uef.uef(Float.parseFloat(strOptString));
                } catch (NumberFormatException unused) {
                    c0038uef.uef(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
            }
            c0038uef.uef(jSONObject.optString("loopMode"));
            c0038uef.oa(jSONObject.optString("type"));
            if (TextUtils.equals(c0038uef.lw(), "ripple")) {
                c0038uef.yo(jSONObject.optString("rippleColor"));
            }
            View viewDj = yoVar.dj();
            Context context = viewDj != null ? viewDj.getContext() : null;
            if (TextUtils.equals(c0038uef.lw(), "backgroundColor")) {
                String strUef = com.bytedance.adsdk.ugeno.yo.oa.uef(jSONObject.optString("valueTo"), yoVar.wrv());
                int iUef = com.bytedance.adsdk.ugeno.xs.uef.uef(jSONObject.optString("valueFrom"));
                int iUef2 = com.bytedance.adsdk.ugeno.xs.uef.uef(strUef);
                c0038uef.oa(iUef);
                c0038uef.yo(iUef2);
            } else if ((TextUtils.equals(c0038uef.lw(), "translateX") || TextUtils.equals(c0038uef.lw(), "translateY")) && context != null) {
                try {
                    float fUef = com.bytedance.adsdk.ugeno.xs.bcc.uef(context, (float) jSONObject.optDouble("valueFrom"));
                    float fUef2 = com.bytedance.adsdk.ugeno.xs.bcc.uef(context, (float) jSONObject.optDouble("valueTo"));
                    c0038uef.oa(fUef);
                    c0038uef.yo(fUef2);
                } catch (Exception unused2) {
                    Log.e("animation", "animation ");
                }
            } else {
                c0038uef.oa((float) jSONObject.optDouble("valueFrom"));
                c0038uef.yo((float) jSONObject.optDouble("valueTo"));
            }
            c0038uef.moa(jSONObject.optString("interpolator"));
            String strUef2 = com.bytedance.adsdk.ugeno.yo.oa.uef(jSONObject.optString("startDelay"), yoVar.wrv());
            Log.d("TAG", "createAnimationModel: ");
            c0038uef.oa(com.bytedance.adsdk.ugeno.xs.yo.uef(strUef2, 0L));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("values");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                float[] fArr = new float[jSONArrayOptJSONArray.length()];
                int i5 = 0;
                if ((TextUtils.equals(c0038uef.lw(), "translateX") || TextUtils.equals(c0038uef.lw(), "translateY")) && context != null) {
                    while (i5 < jSONArrayOptJSONArray.length()) {
                        fArr[i5] = com.bytedance.adsdk.ugeno.xs.bcc.uef(context, (float) uef.uef(jSONArrayOptJSONArray.optString(i5), yoVar.wrv()));
                        i5++;
                    }
                } else {
                    while (i5 < jSONArrayOptJSONArray.length()) {
                        fArr[i5] = (float) uef.uef(jSONArrayOptJSONArray.optString(i5), yoVar.wrv());
                        i5++;
                    }
                }
                c0038uef.uef(fArr);
            }
            return c0038uef;
        }
    }

    public String ivm() {
        return this.ivm;
    }

    public long lw() {
        return this.lw;
    }

    public long moa() {
        return this.moa;
    }

    public float oa() {
        return this.f24690oa;
    }

    public String uef() {
        return this.uef;
    }

    public List<C0038uef> yo() {
        return this.yo;
    }

    public void oa(long j8) {
        this.lw = j8;
    }

    public void uef(String str) {
        this.uef = str;
    }

    public void oa(String str) {
        this.ivm = str;
    }

    public void uef(float f10) {
        this.f24690oa = f10;
    }

    public void uef(List<C0038uef> list) {
        this.yo = list;
    }

    public void uef(long j8) {
        this.moa = j8;
    }

    public static uef uef(String str, com.bytedance.adsdk.ugeno.oa.yo yoVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return uef(new JSONObject(str), yoVar);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static uef uef(JSONObject jSONObject, com.bytedance.adsdk.ugeno.oa.yo yoVar) {
        return uef(jSONObject, null, yoVar);
    }

    public static uef uef(JSONObject jSONObject, JSONObject jSONObject2, com.bytedance.adsdk.ugeno.oa.yo yoVar) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        uef uefVar = new uef();
        uefVar.uef(jSONObject.optString("ordering"));
        String strOptString = jSONObject.optString("loop");
        if (TextUtils.equals("infinite", strOptString)) {
            uefVar.uef(-1.0f);
        } else {
            try {
                uefVar.uef(Float.parseFloat(strOptString));
            } catch (NumberFormatException unused) {
                uefVar.uef(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
        uefVar.uef(jSONObject.optLong("duration", 0L));
        uefVar.oa(com.bytedance.adsdk.ugeno.xs.yo.uef(com.bytedance.adsdk.ugeno.yo.oa.uef(jSONObject.optString("startDelay"), yoVar.wrv()), 0L));
        uefVar.oa(jSONObject.optString("loopMode"));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animators");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i5);
                if (jSONObject2 != null) {
                    com.bytedance.adsdk.ugeno.xs.oa.uef(jSONObject2, jSONObjectOptJSONObject);
                }
                arrayList.add(C0038uef.uef(jSONObjectOptJSONObject, yoVar));
            }
            uefVar.uef(arrayList);
        }
        return uefVar;
    }

    public static double uef(Object obj, JSONObject jSONObject) {
        if (obj instanceof String) {
            return com.bytedance.adsdk.ugeno.xs.yo.uef(com.bytedance.adsdk.ugeno.yo.oa.uef((String) obj, jSONObject), 0.0d);
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Long) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Integer) {
            return ((Double) obj).doubleValue();
        }
        return 0.0d;
    }
}
