package com.bytedance.sdk.openadsdk.core.dj;

import android.content.Context;
import android.text.TextUtils;
import cb.AbstractC1593a;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.ab.uef.lw;
import com.bytedance.sdk.openadsdk.core.gsd;
import com.bytedance.sdk.openadsdk.core.settings.dj;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.wk;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.bytedance.sdk.openadsdk.utils.gzw;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class uef {
    private boolean yo;
    private final AtomicInteger uef = new AtomicInteger(0);

    /* renamed from: oa, reason: collision with root package name */
    private moa f25568oa = null;
    private final Runnable moa = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.dj.uef.3
        @Override // java.lang.Runnable
        public void run() {
            uef.this.uef();
        }
    };

    public uef(boolean z2) {
        this.yo = false;
        this.yo = z2;
    }

    private JSONObject yo() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tcstring", dj.oa(sy.uef()));
            jSONObject.put("tcf_gdpr", dj.uef(sy.uef()));
            jSONObject.put("gaid", com.bytedance.sdk.openadsdk.tpx.uef.oa.uef.uef().oa());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oa() {
        if (!oa.uef().zjm()) {
            uef(false);
            return;
        }
        if (this.uef.incrementAndGet() > 3) {
            uef(false);
        } else {
            wk.oa().removeCallbacks(this.moa);
            wk.oa().postDelayed(this.moa, r0 * 10000);
        }
    }

    public void uef(moa moaVar) {
        this.f25568oa = moaVar;
    }

    public void uef() {
        try {
            if (!this.yo) {
                String strOa = dj.oa(sy.uef());
                int iUef = dj.uef(sy.uef());
                if (TextUtils.equals(strOa, dj.moa) && iUef == dj.lw && oa.uef().cz()) {
                    uef(true);
                    return;
                }
            }
            JSONObject jSONObjectYo = yo();
            com.bytedance.sdk.component.xs.oa.moa moaVarOa = com.bytedance.sdk.openadsdk.dhk.oa.oa().yo().oa();
            final String strUef = gb.uef("/api/ad/union/sdk/compliance_status/", false, true);
            moaVarOa.yo(strUef);
            moaVarOa.oa("User-Agent", "");
            moaVarOa.lw(oa(jSONObjectYo).toString());
            moaVarOa.uef(6);
            moaVarOa.oa("compliance_stats");
            com.bytedance.sdk.openadsdk.sy.yo.uef(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.dj.uef.1
                @Override // com.bytedance.sdk.openadsdk.sy.moa
                public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                    com.bytedance.sdk.openadsdk.sy.oa.uef uefVarF = AbstractC1593a.f("compliance_status");
                    uefVarF.xs(uef.this.uef(sy.uef()).toString());
                    return uefVarF;
                }
            });
            moaVarOa.oa(new com.bytedance.sdk.component.xs.uef.uef() { // from class: com.bytedance.sdk.openadsdk.core.dj.uef.2
                @Override // com.bytedance.sdk.component.xs.uef.uef
                public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar, com.bytedance.sdk.component.xs.oa oaVar) {
                    String strMoa = oaVar.moa();
                    if (!oaVar.ivm() || TextUtils.isEmpty(strMoa)) {
                        uef.this.oa();
                        com.bytedance.sdk.openadsdk.sy.yo.yo(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.dj.uef.2.2
                            @Override // com.bytedance.sdk.openadsdk.sy.moa
                            public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                                com.bytedance.sdk.openadsdk.sy.oa.uef uefVarF = AbstractC1593a.f("compliance_status");
                                uefVarF.xs(uef.this.uef(sy.uef()).toString());
                                return uefVarF;
                            }
                        });
                        if (yoVar != null) {
                            gzw.uef(yoVar.ivm());
                            lw.uef("compliance_status", strUef, oaVar.uef(), oaVar.oa(), null, null);
                            return;
                        }
                        return;
                    }
                    try {
                        com.bytedance.sdk.openadsdk.sy.yo.oa(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.dj.uef.2.1
                            @Override // com.bytedance.sdk.openadsdk.sy.moa
                            public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                                com.bytedance.sdk.openadsdk.sy.oa.uef uefVarF = AbstractC1593a.f("compliance_status");
                                uefVarF.xs(uef.this.uef(sy.uef()).toString());
                                return uefVarF;
                            }
                        });
                        gzw.oa();
                        JSONObject jSONObject = new JSONObject(strMoa);
                        String strUef2 = gsd.uef(jSONObject.optInt("cypher", -1), jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
                        if (TextUtils.isEmpty(strUef2)) {
                            uef.this.oa();
                            return;
                        }
                        if (!uef.this.uef(new JSONObject(strUef2))) {
                            uef.this.uef(false);
                        } else if (!uef.this.yo || TextUtils.isEmpty(dj.oa().dor())) {
                            uef.this.uef(true);
                        } else {
                            uef.this.uef(false);
                        }
                    } catch (Throwable unused) {
                        uef.this.oa();
                    }
                }

                @Override // com.bytedance.sdk.component.xs.uef.uef
                public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar, IOException iOException) {
                    uef.this.oa();
                    com.bytedance.sdk.openadsdk.sy.yo.yo(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.dj.uef.2.3
                        @Override // com.bytedance.sdk.openadsdk.sy.moa
                        public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                            com.bytedance.sdk.openadsdk.sy.oa.uef uefVarF = AbstractC1593a.f("compliance_status");
                            uefVarF.xs(uef.this.uef(sy.uef()).toString());
                            return uefVarF;
                        }
                    });
                    if (yoVar != null) {
                        gzw.uef(yoVar.ivm());
                        lw.uef("compliance_status", yoVar.ivm(), -1, iOException != null ? iOException.getMessage() : null, null, null);
                    }
                }
            });
        } catch (Throwable unused) {
            oa();
        }
    }

    private JSONObject oa(JSONObject jSONObject) {
        return gsd.uef(PangleEncryptConstant.CryptDataScene.REGISTER_STATUS, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(boolean z2) {
        moa moaVar = this.f25568oa;
        if (moaVar != null) {
            moaVar.uef(z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean uef(JSONObject jSONObject) {
        int iBcc = oa.uef().bcc();
        if (jSONObject.has("user_compliance_status")) {
            iBcc = jSONObject.optInt("user_compliance_status", -1);
            oa.uef().oa(iBcc);
        }
        if (jSONObject.has("user_compliance_status_reason")) {
            oa.uef().uef(jSONObject.optString("user_compliance_status_reason", ""));
        }
        if (jSONObject.has("allow_req_time")) {
            oa.uef().uef(jSONObject.optLong("allow_req_time", oa.uef.longValue()));
        }
        return iBcc == 1 || iBcc == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject uef(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("net_status", com.bytedance.sdk.component.utils.sy.uef(context) ? 1 : 0);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
