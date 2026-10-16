package com.bytedance.sdk.openadsdk.core.cq.ivm;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.cq;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.oib;
import com.bytedance.sdk.openadsdk.utils.gb;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class lw {

    /* renamed from: ab, reason: collision with root package name */
    private JSONArray f25506ab;
    private final gzw bcc;
    private boolean cq;
    private final String cz;
    private JSONObject dj;
    private boolean dz;
    private com.bytedance.adsdk.ugeno.oa.yo lw;
    private com.bytedance.adsdk.ugeno.oa.yo moa;
    private boolean wk;
    private final JSONObject wrv;
    private final Context xs;
    private com.bytedance.adsdk.ugeno.oa.yo yo;
    private com.bytedance.sdk.openadsdk.core.widget.lw zjm;
    private int uef = -1;

    /* renamed from: oa, reason: collision with root package name */
    private int f25507oa = -1;
    private final String ivm = "UGenSwiperEvent";

    public lw(Context context, gzw gzwVar, String str, JSONObject jSONObject) {
        this.xs = context;
        this.bcc = gzwVar;
        this.cz = str;
        this.wrv = jSONObject;
    }

    public JSONObject moa() {
        return this.dj;
    }

    public void oa() {
        int i5;
        com.bytedance.adsdk.ugeno.oa.yo yoVar = this.lw;
        if (!(yoVar instanceof com.bytedance.adsdk.ugeno.yo) || (i5 = this.uef) == -1) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.yo) yoVar).uef(i5 - 1);
    }

    public void yo() {
        int i5;
        com.bytedance.adsdk.ugeno.oa.yo yoVar = this.lw;
        if (!(yoVar instanceof com.bytedance.adsdk.ugeno.yo) || (i5 = this.uef) == -1) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.yo) yoVar).uef(i5 + 1);
    }

    public void uef(com.bytedance.adsdk.ugeno.oa.yo<View> yoVar) {
        com.bytedance.adsdk.ugeno.oa.yo<T> yoVarLw = yoVar.lw("swiperLayout");
        this.lw = yoVarLw;
        if (yoVarLw instanceof com.bytedance.adsdk.ugeno.yo) {
            this.f25506ab = this.wrv.optJSONArray("dpa_data");
            this.yo = yoVar.lw("swiperLeftArrow");
            this.moa = yoVar.lw("swiperRightArrow");
            ((com.bytedance.adsdk.ugeno.yo) this.lw).uef(new com.bytedance.adsdk.ugeno.ivm.yo() { // from class: com.bytedance.sdk.openadsdk.core.cq.ivm.lw.1
                @Override // com.bytedance.adsdk.ugeno.ivm.yo
                public void uef(boolean z2, int i5) {
                }

                @Override // com.bytedance.adsdk.ugeno.ivm.yo
                public void uef(boolean z2, int i5, float f10, int i10) {
                }

                @Override // com.bytedance.adsdk.ugeno.ivm.yo
                public void uef(boolean z2, int i5, int i10, boolean z10, boolean z11) {
                    lw.this.f25507oa = i5;
                    lw.this.uef = i10;
                    lw.this.cq = z2;
                    lw.this.dz = z10;
                    lw.this.wk = z11;
                    lw.this.uef(z2, z10, z11);
                    lw.this.uef(i5);
                }
            });
        }
    }

    public void uef() {
        uef(this.cq, this.dz, this.wk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(boolean z2, boolean z10, boolean z11) {
        com.bytedance.adsdk.ugeno.oa.yo yoVar = this.yo;
        if (yoVar == null || this.moa == null) {
            return;
        }
        View viewDj = yoVar.dj();
        View viewDj2 = this.moa.dj();
        JSONArray jSONArray = this.f25506ab;
        if (jSONArray != null && jSONArray.length() == 1) {
            viewDj.setVisibility(8);
            viewDj2.setVisibility(8);
            return;
        }
        if (z2) {
            return;
        }
        if (z10) {
            if (viewDj instanceof TextView) {
                uef((TextView) viewDj, 90);
            }
            if (viewDj2 instanceof TextView) {
                uef((TextView) viewDj2, 255);
                return;
            }
            return;
        }
        if (z11) {
            if (viewDj instanceof TextView) {
                uef((TextView) viewDj, 255);
            }
            if (viewDj2 instanceof TextView) {
                uef((TextView) viewDj2, 90);
                return;
            }
            return;
        }
        if (viewDj instanceof TextView) {
            uef((TextView) viewDj, 255);
        }
        if (viewDj2 instanceof TextView) {
            uef((TextView) viewDj2, 255);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(int i5) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("index", i5);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.moa.yo.oa(this.bcc, this.cz, "carousel_show", jSONObject);
    }

    private void uef(TextView textView, int i5) {
        int currentTextColor = textView.getCurrentTextColor();
        textView.setTextColor(Color.argb(i5, Color.red(currentTextColor), Color.green(currentTextColor), Color.blue(currentTextColor)));
    }

    public void uef(com.bytedance.sdk.openadsdk.core.widget.lw lwVar) {
        this.zjm = lwVar;
    }

    public boolean uef(cq cqVar) {
        JSONObject jSONObjectOptJSONObject;
        this.dj = null;
        int i5 = this.f25507oa;
        if (i5 != -1 && i5 != 0) {
            try {
                JSONObject jSONObjectYo = cqVar.yo();
                if (jSONObjectYo != null && (jSONObjectOptJSONObject = jSONObjectYo.optJSONObject("related_dpa_click")) != null) {
                    boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("enableOpenExternalUrl");
                    int iOptInt = jSONObjectOptJSONObject.optInt("landingStyle");
                    if (zOptBoolean && iOptInt != -1) {
                        if (this.f25506ab != null) {
                            String strUef = com.bytedance.adsdk.ugeno.yo.oa.uef(jSONObjectOptJSONObject.optString("url"), this.f25506ab.optJSONObject(this.f25507oa));
                            String strUef2 = com.bytedance.adsdk.ugeno.yo.oa.uef(jSONObjectOptJSONObject.optString("fallback_url"), this.f25506ab.optJSONObject(this.f25507oa));
                            jSONObjectOptJSONObject.put("url", strUef);
                            jSONObjectOptJSONObject.put("fallback_url", strUef2);
                            uef(jSONObjectOptJSONObject, this.f25506ab.optJSONObject(this.f25507oa));
                        }
                        uef(jSONObjectOptJSONObject, cqVar.uef().dj());
                        return true;
                    }
                    return false;
                }
            } catch (Throwable th) {
                dhk.yo("UGenSwiperEvent", th.getMessage());
            }
        }
        return false;
    }

    private void uef(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("clickInfo");
        this.dj = jSONObjectOptJSONObject;
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    this.dj.putOpt(next, com.bytedance.adsdk.ugeno.yo.oa.uef((String) this.dj.opt(next), jSONObject2));
                } catch (Throwable unused) {
                }
            }
            try {
                jSONObject.putOpt("clickInfo", this.dj);
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean uef(int r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            r0 = 0
            r1 = 1
            if (r4 == r1) goto L1f
            r2 = 2
            if (r4 == r2) goto Lb
            r6 = 3
            if (r4 == r6) goto L1f
            goto L26
        Lb:
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 == 0) goto L18
            boolean r4 = android.text.TextUtils.isEmpty(r6)
            if (r4 == 0) goto L18
            return r0
        L18:
            boolean r4 = com.bytedance.sdk.component.utils.sy.uef(r6)
            if (r4 != 0) goto L26
            return r0
        L1f:
            boolean r4 = com.bytedance.sdk.component.utils.sy.uef(r5)
            if (r4 != 0) goto L26
            return r0
        L26:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.cq.ivm.lw.uef(int, java.lang.String, java.lang.String):boolean");
    }

    private void uef(JSONObject jSONObject, View view) {
        if (uef(jSONObject.optInt("landingStyle"), jSONObject.optString("url"), jSONObject.optString("fallback_url"))) {
            oib.uef(uef(view), this.xs instanceof Activity, jSONObject, this.bcc, this.cz, gb.uef(this.cz), null, this.zjm);
        }
    }

    private Context uef(View view) {
        Activity activityUef = view != null ? com.bytedance.sdk.component.utils.oa.uef(view) : null;
        return activityUef == null ? this.xs : activityUef;
    }
}
