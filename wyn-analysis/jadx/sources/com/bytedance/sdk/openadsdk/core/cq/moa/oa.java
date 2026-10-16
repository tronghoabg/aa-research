package com.bytedance.sdk.openadsdk.core.cq.moa;

import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.ab;
import com.bytedance.adsdk.ugeno.core.cq;
import com.bytedance.adsdk.ugeno.oa.yo;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.cq.moa.uef;
import com.bytedance.sdk.openadsdk.core.cq.uef.oa;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.pu;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.tpx.uef.uef.moa;
import com.bytedance.sdk.openadsdk.utils.gb;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class oa implements ab, uef.InterfaceC0082uef {
    protected static int uef = 8;

    /* renamed from: ab, reason: collision with root package name */
    private float f25520ab;
    private String bcc;
    private float bs;
    private View cq;
    private JSONObject cz;
    private boolean dhk = true;
    private com.bytedance.sdk.openadsdk.core.cq.xs.uef dj;
    private float dz;
    private String ivm;
    private final com.bytedance.sdk.openadsdk.core.cq.bcc.uef lw;
    private final gzw moa;

    /* renamed from: oa, reason: collision with root package name */
    private uef f25521oa;
    private long oib;
    private long sy;
    private float wk;
    private String wrv;
    private String xs;
    private final Activity yo;
    private final com.bytedance.sdk.openadsdk.core.cq.xs.oa zjm;

    public oa(Activity activity, gzw gzwVar, com.bytedance.sdk.openadsdk.core.cq.bcc.uef uefVar, String str, com.bytedance.sdk.openadsdk.core.cq.xs.oa oaVar) {
        this.yo = activity;
        this.wrv = str;
        this.moa = gzwVar;
        this.zjm = oaVar;
        this.lw = uefVar;
    }

    private void oa() {
        int iYkf = this.moa.ykf();
        if (iYkf != 2 && iYkf != 3) {
            if (iYkf == 4) {
                moa.uef(this.yo, this.wrv).uef(this.moa);
                return;
            } else {
                if (iYkf != 5) {
                    return;
                }
                gb.oa(this.yo, this.moa.wp());
                return;
            }
        }
        if (iYkf == 3) {
            String strCc = this.moa.cc();
            if (!TextUtils.isEmpty(strCc) && strCc.contains("play.google.com/store")) {
                if (com.bytedance.sdk.openadsdk.tpx.uef.uef.oa.uef(this.yo, strCc, strCc.substring(strCc.indexOf("?id=") + 4), this.wrv, this.moa)) {
                    return;
                }
            }
        }
        Activity activity = this.yo;
        gzw gzwVar = this.moa;
        int iUef = gb.uef(this.wrv);
        String str = this.wrv;
        pu.uef(activity, gzwVar, iUef, null, null, str, moa.uef(this.yo, str), true, 0);
    }

    public void uef() {
        if (this.moa == null) {
            this.zjm.uef(1, "material is null", "net");
            return;
        }
        if (this.lw == null) {
            this.zjm.uef(1, "material ugen template is null", "net");
            return;
        }
        this.f25521oa = new uef(this.yo);
        this.bcc = this.lw.yo();
        this.ivm = this.lw.uef();
        this.xs = this.lw.oa();
        this.cz = this.moa.cq(true);
        this.zjm.uef("endcard");
        com.bytedance.sdk.openadsdk.core.cq.uef.oa.uef().uef("endcard", this.bcc, this.ivm, this.xs, "", new oa.uef() { // from class: com.bytedance.sdk.openadsdk.core.cq.moa.oa.1
            @Override // com.bytedance.sdk.openadsdk.core.cq.uef.oa.uef
            public void uef(JSONObject jSONObject, String str) throws JSONException {
                oa oaVar = oa.this;
                oaVar.uef(jSONObject, oaVar.cz);
                oa.this.zjm.oa(str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.cq.uef.oa.uef
            public void uef(int i5, String str, String str2) {
                oa.this.zjm.uef(i5, str, str2);
            }
        });
    }

    public void uef(View view) {
        this.cq = view;
    }

    public void uef(com.bytedance.sdk.openadsdk.core.cq.xs.uef uefVar) {
        this.dj = uefVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        this.f25521oa.uef((uef.InterfaceC0082uef) this);
        this.f25521oa.uef((ab) this);
        this.zjm.uef();
        this.f25521oa.uef(jSONObject, jSONObject2, new com.bytedance.sdk.openadsdk.core.cq.xs.moa() { // from class: com.bytedance.sdk.openadsdk.core.cq.moa.oa.2
            @Override // com.bytedance.sdk.openadsdk.core.cq.xs.moa
            public void uef(int i5, String str) {
                if (oa.this.zjm != null) {
                    oa.this.zjm.uef(i5, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.cq.xs.moa
            public void uef(yo<View> yoVar) {
                if (oa.this.zjm != null) {
                    oa.this.zjm.uef(yoVar);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.cq.moa.uef.InterfaceC0082uef
    public void uef(cq cqVar) throws JSONException {
        String strOptString = cqVar.yo().optString("type");
        strOptString.getClass();
        switch (strOptString) {
            case "privacy":
                if (this.yo != null && !TextUtils.isEmpty(sy.moa().swd())) {
                    TTWebsiteActivity.uef(this.yo, this.moa, this.wrv);
                    break;
                }
                break;
            case "close":
                com.bytedance.sdk.openadsdk.core.cq.xs.uef uefVar = this.dj;
                if (uefVar != null) {
                    uefVar.oa();
                    break;
                }
                break;
            case "creative":
                if (this.yo != null && this.moa != null) {
                    oa();
                    ComponentCallbacks2 componentCallbacks2 = this.yo;
                    if (componentCallbacks2 instanceof com.bytedance.sdk.openadsdk.core.wk.moa.oa) {
                        ((com.bytedance.sdk.openadsdk.core.wk.moa.oa) componentCallbacks2).hts();
                    }
                    uef(cqVar, this.moa);
                    break;
                }
                break;
        }
    }

    private void uef(cq cqVar, gzw gzwVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("down_x", this.dz);
            jSONObject.put("down_y", this.wk);
            jSONObject.put("down_time", this.sy);
            jSONObject.put("up_x", this.f25520ab);
            jSONObject.put("up_y", this.bs);
            jSONObject.put("up_time", this.oib);
            View viewDj = cqVar.uef().dj();
            int i5 = 1;
            if (viewDj != null) {
                JSONObject jSONObject2 = new JSONObject();
                int[] iArr = new int[2];
                float width = viewDj.getWidth();
                float height = viewDj.getHeight();
                viewDj.getLocationOnScreen(iArr);
                float f10 = iArr[0];
                float f11 = iArr[1];
                jSONObject2.put("width", width);
                jSONObject2.put("height", height);
                jSONObject2.put("left", f10);
                jSONObject2.put("top", f11);
                jSONObject.put("rectInfo", jSONObject2);
            }
            View view = this.cq;
            if (view != null) {
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                jSONObject.put("button_x", iArr2[0]);
                jSONObject.put("button_y", iArr2[1]);
                jSONObject.put("button_width", this.cq.getWidth());
                jSONObject.put("button_height", this.cq.getHeight());
            }
            View viewFindViewById = this.yo.findViewById(R.id.content);
            if (viewFindViewById != null) {
                int[] iArr3 = new int[2];
                viewFindViewById.getLocationOnScreen(iArr3);
                jSONObject.put("ad_x", iArr3[0]);
                jSONObject.put("ad_y", iArr3[1]);
                jSONObject.put("width", viewFindViewById.getWidth());
                jSONObject.put("height", viewFindViewById.getHeight());
            }
            jSONObject.put("click_area_type", cqVar.uef().oyt());
            jSONObject.put("brick_id", cqVar.uef().lz());
            jSONObject.put("endcard_id", this.ivm);
            jSONObject.put("click_scence", 2);
            if (!this.dhk) {
                i5 = 2;
            }
            jSONObject.put("user_behavior_type", i5);
            com.bytedance.sdk.openadsdk.core.cq.xs.uef uefVar = this.dj;
            if (uefVar != null) {
                jSONObject.put("endcard_type", uefVar.uef());
            }
            com.bytedance.sdk.openadsdk.moa.yo.uef(gzwVar, this.wrv, "click", jSONObject);
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.ab
    public void uef(yo yoVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.sy = System.currentTimeMillis();
            this.dz = motionEvent.getRawX();
            this.wk = motionEvent.getRawY();
            this.dhk = true;
            return;
        }
        if (action != 1) {
            if (action != 2) {
                return;
            }
            if (Math.abs(motionEvent.getRawX() - this.dz) >= uef || Math.abs(motionEvent.getRawY() - this.wk) >= uef) {
                this.dhk = false;
                return;
            }
            return;
        }
        this.f25520ab = motionEvent.getRawX();
        this.bs = motionEvent.getRawY();
        if (Math.abs(this.f25520ab - this.dz) >= uef || Math.abs(this.bs - this.wk) >= uef) {
            this.dhk = false;
        }
        this.oib = System.currentTimeMillis();
    }
}
