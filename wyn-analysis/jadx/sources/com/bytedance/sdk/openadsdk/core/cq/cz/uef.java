package com.bytedance.sdk.openadsdk.core.cq.cz;

import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.ab;
import com.bytedance.adsdk.ugeno.core.cq;
import com.bytedance.adsdk.ugeno.core.dj;
import com.bytedance.adsdk.ugeno.core.wk;
import com.bytedance.adsdk.ugeno.core.wrv;
import com.bytedance.adsdk.ugeno.moa.ivm;
import com.bytedance.adsdk.ugeno.oa.yo;
import com.bytedance.sdk.openadsdk.core.cq.xs.moa;
import com.bytedance.sdk.openadsdk.utils.km;
import com.vungle.ads.internal.protos.Sdk;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class uef implements ab, wk {

    /* renamed from: oa, reason: collision with root package name */
    private wrv f25503oa;
    private Context uef;
    private yo yo;

    public uef(Context context) {
        this.uef = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oa(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, moa moaVar) {
        this.f25503oa = new wrv(this.uef);
        uef();
        this.f25503oa.uef((wk) this);
        this.f25503oa.uef((ab) this);
        if (jSONObject == null || jSONObject2 == null) {
            if (moaVar != null) {
                moaVar.uef(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, "template or data is null");
                return;
            }
            return;
        }
        try {
            yo<View> yoVarUef = this.f25503oa.uef(jSONObject, jSONObject2, jSONObject3);
            this.yo = yoVarUef;
            if (yoVarUef != null) {
                moaVar.uef(yoVarUef);
            } else if (moaVar != null) {
                moaVar.uef(3000, "ugen render fail");
            }
        } catch (NoClassDefFoundError unused) {
            if (moaVar != null) {
                moaVar.uef(Sdk.SDKError.Reason.CONFIG_REFRESH_FAILED_VALUE, "ugen render yoga error");
            }
        } catch (UnsatisfiedLinkError unused2) {
            if (moaVar != null) {
                moaVar.uef(139, "ugen render yoga error");
            }
        } catch (Throwable unused3) {
            if (moaVar != null) {
                moaVar.uef(Sdk.SDKError.Reason.CONFIG_REFRESH_FAILED_VALUE, "ugen render error");
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.wk
    public void uef(cq cqVar, wk.oa oaVar, wk.uef uefVar) {
    }

    @Override // com.bytedance.adsdk.ugeno.core.ab
    public void uef(yo yoVar, MotionEvent motionEvent) {
    }

    @Override // com.bytedance.adsdk.ugeno.core.wk
    public void uef(yo yoVar, String str, ivm.uef uefVar) {
    }

    public void uef(final JSONObject jSONObject, final JSONObject jSONObject2, final JSONObject jSONObject3, final moa moaVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            oa(jSONObject, jSONObject2, jSONObject3, moaVar);
        } else {
            km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cq.cz.uef.1
                @Override // java.lang.Runnable
                public void run() {
                    uef.this.oa(jSONObject, jSONObject2, jSONObject3, moaVar);
                }
            });
        }
    }

    private void uef() {
        dj djVar = new dj();
        djVar.uef(this.uef);
        this.f25503oa.uef("page", djVar);
    }
}
