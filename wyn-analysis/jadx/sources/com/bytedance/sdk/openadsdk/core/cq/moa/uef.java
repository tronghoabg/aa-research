package com.bytedance.sdk.openadsdk.core.cq.moa;

import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.ab;
import com.bytedance.adsdk.ugeno.core.cq;
import com.bytedance.adsdk.ugeno.core.wk;
import com.bytedance.adsdk.ugeno.core.wrv;
import com.bytedance.adsdk.ugeno.moa.ivm;
import com.bytedance.adsdk.ugeno.oa.yo;
import com.bytedance.sdk.openadsdk.core.cq.xs.moa;
import com.bytedance.sdk.openadsdk.utils.km;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class uef implements ab, wk {
    private ab moa;

    /* renamed from: oa, reason: collision with root package name */
    private yo<View> f25522oa;
    private final Context uef;
    private InterfaceC0082uef yo;

    /* renamed from: com.bytedance.sdk.openadsdk.core.cq.moa.uef$uef, reason: collision with other inner class name */
    public interface InterfaceC0082uef {
        void uef(cq cqVar);
    }

    public uef(Context context) {
        this.uef = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oa(JSONObject jSONObject, JSONObject jSONObject2, moa moaVar) throws JSONException {
        try {
            wrv wrvVar = new wrv(this.uef);
            yo<View> yoVarUef = wrvVar.uef(jSONObject);
            this.f25522oa = yoVarUef;
            if (yoVarUef == null) {
                if (moaVar != null) {
                    moaVar.uef(3000, "ugen render fail");
                    return;
                }
                return;
            }
            View viewDj = yoVarUef.dj();
            if (viewDj != null) {
                viewDj.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.cq.moa.uef.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                    }
                });
            }
            wrvVar.uef((wk) this);
            wrvVar.uef((ab) this);
            if (jSONObject2 != null) {
                try {
                    jSONObject2.put("language", com.bytedance.sdk.openadsdk.core.cq.oa());
                    jSONObject2.put("os", "Android");
                } catch (JSONException unused) {
                }
            }
            wrvVar.oa(jSONObject2);
            if (moaVar != null) {
                moaVar.uef(this.f25522oa);
            }
        } catch (Exception e7) {
            if (moaVar != null) {
                moaVar.uef(3000, "ugen render fail exception is" + e7.getMessage());
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.wk
    public void uef(yo yoVar, String str, ivm.uef uefVar) {
    }

    public void uef(final JSONObject jSONObject, final JSONObject jSONObject2, final moa moaVar) throws JSONException {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            oa(jSONObject, jSONObject2, moaVar);
        } else {
            km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cq.moa.uef.1
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    uef.this.oa(jSONObject, jSONObject2, moaVar);
                }
            });
        }
    }

    public void uef(InterfaceC0082uef interfaceC0082uef) {
        this.yo = interfaceC0082uef;
    }

    public void uef(ab abVar) {
        this.moa = abVar;
    }

    @Override // com.bytedance.adsdk.ugeno.core.wk
    public void uef(cq cqVar, wk.oa oaVar, wk.uef uefVar) {
        InterfaceC0082uef interfaceC0082uef;
        if (cqVar == null) {
            return;
        }
        if ((cqVar.oa() == 1 || cqVar.oa() == 4) && (interfaceC0082uef = this.yo) != null) {
            interfaceC0082uef.uef(cqVar);
        }
        if (oaVar == null || cqVar.moa() == null) {
            return;
        }
        oaVar.uef(cqVar.moa());
    }

    @Override // com.bytedance.adsdk.ugeno.core.ab
    public void uef(yo yoVar, MotionEvent motionEvent) {
        ab abVar = this.moa;
        if (abVar != null) {
            abVar.uef(yoVar, motionEvent);
        }
    }
}
