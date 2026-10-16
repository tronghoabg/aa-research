package com.bytedance.adsdk.ugeno.uef.uef;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class uef {

    /* renamed from: oa, reason: collision with root package name */
    protected com.bytedance.adsdk.ugeno.oa.yo f24771oa;
    protected JSONObject uef;
    private String yo;

    /* renamed from: com.bytedance.adsdk.ugeno.uef.uef.uef$uef, reason: collision with other inner class name */
    public static class C0045uef {
        public static uef uef(com.bytedance.adsdk.ugeno.oa.yo yoVar, JSONObject jSONObject) {
            if (yoVar == null || jSONObject == null) {
                return null;
            }
            String strOptString = jSONObject.optString("type");
            strOptString.getClass();
            switch (strOptString) {
                case "stretch":
                    return new lw(yoVar, jSONObject);
                case "ripple":
                    return new oa(yoVar, jSONObject);
                case "rub_in":
                    return new yo(yoVar, jSONObject);
                case "shine":
                    return new moa(yoVar, jSONObject);
                default:
                    return null;
            }
        }
    }

    public uef(com.bytedance.adsdk.ugeno.oa.yo yoVar, JSONObject jSONObject) {
        this.uef = jSONObject;
        this.f24771oa = yoVar;
        uef();
    }

    public String moa() {
        return this.yo;
    }

    public abstract void oa();

    public abstract void oa(Canvas canvas);

    public void uef() {
        this.yo = this.uef.optString("type");
        oa();
    }

    public abstract void uef(int i5, int i10);

    public abstract void uef(Canvas canvas);

    public abstract List<PropertyValuesHolder> yo();
}
