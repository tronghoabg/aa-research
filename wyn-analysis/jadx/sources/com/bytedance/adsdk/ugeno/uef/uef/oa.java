package com.bytedance.adsdk.ugeno.uef.uef;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class oa extends uef {
    private Paint ivm;
    private int lw;
    private int moa;
    private int yo;

    public oa(com.bytedance.adsdk.ugeno.oa.yo yoVar, JSONObject jSONObject) {
        super(yoVar, jSONObject);
        Paint paint = new Paint();
        this.ivm = paint;
        paint.setAntiAlias(true);
    }

    private void yo(Canvas canvas) {
        try {
            if (this.f24771oa.cop() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.ivm.setColor(this.yo);
                this.ivm.setAlpha((int) ((1.0f - this.f24771oa.cop()) * 255.0f));
                ((ViewGroup) this.f24771oa.dj().getParent()).setClipChildren(true);
                canvas.drawCircle(this.moa, this.lw, Math.min(r0, r2) * 2 * this.f24771oa.cop(), this.ivm);
            }
        } catch (Throwable th) {
            Log.d("BaseEffectWrapper", "ripple animation error " + th.getMessage());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.uef.uef.uef
    public void oa() {
        this.yo = com.bytedance.adsdk.ugeno.xs.uef.uef(this.uef.optString("backgroundColor"), -1);
    }

    @Override // com.bytedance.adsdk.ugeno.uef.uef.uef
    public void uef(Canvas canvas) {
        yo(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.uef.uef.uef
    public void oa(Canvas canvas) {
        yo(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.uef.uef.uef
    public void uef(int i5, int i10) {
        this.moa = i5 / 2;
        this.lw = i10 / 2;
    }

    @Override // com.bytedance.adsdk.ugeno.uef.uef.uef
    public List<PropertyValuesHolder> yo() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(moa(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }
}
