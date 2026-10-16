package com.bytedance.sdk.openadsdk.core.cq.oa.lw;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.core.wrv;
import com.bytedance.adsdk.ugeno.moa;
import com.bytedance.adsdk.ugeno.oa.yo;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class oa extends com.bytedance.adsdk.ugeno.oa.uef<uef> {
    private int aje;
    private JSONArray lo;
    private int qn;

    public oa(Context context) {
        super(context);
        this.qn = 0;
        this.aje = 0;
    }

    private void moa() throws JSONException {
        for (int i5 = 0; i5 < ((com.bytedance.adsdk.ugeno.oa.uef) this).uef.size(); i5++) {
            yo<View> yoVar = ((com.bytedance.adsdk.ugeno.oa.uef) this).uef.get(i5);
            if (yoVar != null) {
                wrv wrvVar = new wrv(this.f24755oa);
                wrvVar.uef(this.hdd);
                ((uef) this.lw).uef(wrvVar.uef(yoVar.ku(), this.moa, (JSONObject) null));
            }
        }
    }

    private void yo() {
        List<yo<View>> list = ((com.bytedance.adsdk.ugeno.oa.uef) this).uef;
        if (list == null || list.isEmpty()) {
            return;
        }
        yo<View> yoVar = ((com.bytedance.adsdk.ugeno.oa.uef) this).uef.get(0);
        if (this.lo == null) {
            return;
        }
        for (int i5 = 0; i5 < this.lo.length(); i5++) {
            wrv wrvVar = new wrv(this.f24755oa);
            wrvVar.uef(this.hdd);
            try {
                JSONObject jSONObjectOptJSONObject = this.lo.optJSONObject(i5);
                if (jSONObjectOptJSONObject != null) {
                    if (jSONObjectOptJSONObject.has("$chunk")) {
                        this.moa.put("$item", jSONObjectOptJSONObject.optJSONArray("$chunk"));
                    } else {
                        this.moa.put("$item", jSONObjectOptJSONObject);
                    }
                    ((uef) this.lw).uef(wrvVar.uef(yoVar.ku(), this.moa, (JSONObject) null));
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oa.uef, com.bytedance.adsdk.ugeno.oa.yo
    public void oa() throws JSONException {
        super.oa();
        T t10 = this.lw;
        if (t10 instanceof uef) {
            ((uef) t10).setOrientation(this.qn);
            ((uef) this.lw).uef(this);
            if (this.aje == 1) {
                moa();
            } else {
                yo();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T extends android.view.View, android.view.View] */
    @Override // com.bytedance.adsdk.ugeno.oa.yo
    public View uef() {
        try {
            uef uefVar = new uef(this.f24755oa);
            this.lw = uefVar;
            uefVar.uef((moa) this);
        } catch (Throwable unused) {
            this.lw = new View(this.f24755oa);
        }
        return this.lw;
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    public void uef(String str, String str2) {
        super.uef(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "driveMode":
                this.aje = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, 0);
                break;
            case "direction":
                if (TextUtils.equals(str2, "vertical")) {
                    this.qn = 1;
                    break;
                } else {
                    this.qn = 0;
                    break;
                }
            case "dataList":
                this.lo = com.bytedance.adsdk.ugeno.xs.oa.uef(str2, (JSONArray) null);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oa.uef
    public void uef(yo yoVar) {
        if (yoVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.oa.uef) this).uef.add(yoVar);
    }

    @Override // com.bytedance.adsdk.ugeno.oa.uef
    public void uef(yo yoVar, ViewGroup.LayoutParams layoutParams) {
        if (yoVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.oa.uef) this).uef.add(yoVar);
    }
}
