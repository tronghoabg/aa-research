package com.bytedance.sdk.openadsdk.core.dj;

import android.content.Context;
import android.text.TextUtils;
import cb.AbstractC1593a;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.ab.uef.lw;
import com.bytedance.sdk.openadsdk.core.gsd;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.wk;
import com.bytedance.sdk.openadsdk.core.zjm;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.bytedance.sdk.openadsdk.utils.gzw;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class yo {

    /* renamed from: oa, reason: collision with root package name */
    private moa f25570oa;
    private final AtomicInteger uef = new AtomicInteger(0);
    private final Runnable yo = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.dj.yo.3
        @Override // java.lang.Runnable
        public void run() {
            yo.this.uef();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void oa() {
        if (!oa.uef().xs()) {
            uef(false);
            return;
        }
        if (this.uef.incrementAndGet() > 3) {
            uef(false);
        } else {
            wk.oa().removeCallbacks(this.yo);
            wk.oa().postDelayed(this.yo, r0 * 10000);
        }
    }

    private JSONObject yo() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_id", zjm.oa().moa());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public void uef(moa moaVar) {
        this.f25570oa = moaVar;
    }

    public void uef() {
        try {
            if (oa.uef().ivm()) {
                uef(true);
                return;
            }
            JSONObject jSONObjectYo = yo();
            com.bytedance.sdk.component.xs.oa.moa moaVarOa = com.bytedance.sdk.openadsdk.dhk.oa.oa().yo().oa();
            final String strUef = gb.uef("/api/ad/union/sdk/register_status/", false, true);
            moaVarOa.yo(strUef);
            moaVarOa.oa("User-Agent", "");
            moaVarOa.lw(oa(jSONObjectYo).toString());
            moaVarOa.uef(6);
            moaVarOa.oa("register_stats");
            com.bytedance.sdk.openadsdk.sy.yo.uef(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.dj.yo.1
                @Override // com.bytedance.sdk.openadsdk.sy.moa
                public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                    com.bytedance.sdk.openadsdk.sy.oa.uef uefVarF = AbstractC1593a.f("register_status");
                    uefVarF.xs(yo.this.uef(sy.uef()).toString());
                    return uefVarF;
                }
            });
            moaVarOa.oa(new com.bytedance.sdk.component.xs.uef.uef() { // from class: com.bytedance.sdk.openadsdk.core.dj.yo.2
                @Override // com.bytedance.sdk.component.xs.uef.uef
                public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar, com.bytedance.sdk.component.xs.oa oaVar) {
                    String strMoa = oaVar.moa();
                    if (!oaVar.ivm() || TextUtils.isEmpty(strMoa)) {
                        yo.this.oa();
                        com.bytedance.sdk.openadsdk.sy.yo.yo(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.dj.yo.2.2
                            @Override // com.bytedance.sdk.openadsdk.sy.moa
                            public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                                com.bytedance.sdk.openadsdk.sy.oa.uef uefVarF = AbstractC1593a.f("register_status");
                                uefVarF.xs(yo.this.uef(sy.uef()).toString());
                                return uefVarF;
                            }
                        });
                        if (yoVar != null) {
                            gzw.uef(yoVar.ivm());
                            lw.uef("register_status", strUef, oaVar.uef(), oaVar.oa(), null, null);
                            return;
                        }
                        return;
                    }
                    try {
                        com.bytedance.sdk.openadsdk.sy.yo.oa(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.dj.yo.2.1
                            @Override // com.bytedance.sdk.openadsdk.sy.moa
                            public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                                com.bytedance.sdk.openadsdk.sy.oa.uef uefVarF = AbstractC1593a.f("register_status");
                                uefVarF.xs(yo.this.uef(sy.uef()).toString());
                                return uefVarF;
                            }
                        });
                        gzw.oa();
                        JSONObject jSONObject = new JSONObject(strMoa);
                        String strUef2 = gsd.uef(jSONObject.optInt("cypher", -1), jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
                        if (TextUtils.isEmpty(strUef2)) {
                            yo.this.oa();
                            return;
                        }
                        yo.this.uef(yo.this.uef(new JSONObject(strUef2)));
                    } catch (Throwable unused) {
                        yo.this.oa();
                    }
                }

                @Override // com.bytedance.sdk.component.xs.uef.uef
                public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar, IOException iOException) {
                    yo.this.oa();
                    com.bytedance.sdk.openadsdk.sy.yo.yo(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.core.dj.yo.2.3
                        @Override // com.bytedance.sdk.openadsdk.sy.moa
                        public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                            com.bytedance.sdk.openadsdk.sy.oa.uef uefVarF = AbstractC1593a.f("register_status");
                            uefVarF.xs(yo.this.uef(sy.uef()).toString());
                            return uefVarF;
                        }
                    });
                    if (yoVar != null) {
                        gzw.uef(yoVar.ivm());
                        lw.uef("register_status", yoVar.ivm(), -1, iOException != null ? iOException.getMessage() : null, null, null);
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
        moa moaVar = this.f25570oa;
        if (moaVar != null) {
            moaVar.uef(z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean uef(JSONObject jSONObject) {
        int iYo = oa.uef().yo();
        if (jSONObject.has("app_reg")) {
            iYo = jSONObject.optInt("app_reg", -1);
            oa.uef().uef(iYo);
        }
        return iYo == 1;
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
