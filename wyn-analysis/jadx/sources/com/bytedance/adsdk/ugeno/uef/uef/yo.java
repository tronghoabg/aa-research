package com.bytedance.adsdk.ugeno.uef.uef;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class yo extends uef {
    private Paint bcc;
    private PorterDuffXfermode cz;
    private Matrix dj;
    private View ivm;
    private float lw;
    private float moa;
    private Paint xs;
    private String yo;
    private LinearGradient zjm;

    public yo(com.bytedance.adsdk.ugeno.oa.yo yoVar, JSONObject jSONObject) {
        super(yoVar, jSONObject);
        this.ivm = this.f24771oa.dj();
        Paint paint = new Paint();
        this.xs = paint;
        paint.setAntiAlias(true);
        this.ivm.setLayerType(2, null);
        this.cz = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.bcc = new Paint();
        this.dj = new Matrix();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void yo(android.graphics.Canvas r23) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.uef.uef.yo.yo(android.graphics.Canvas):void");
    }

    @Override // com.bytedance.adsdk.ugeno.uef.uef.uef
    public void oa() {
        this.yo = this.uef.optString("direction", "left");
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
        this.moa = i5;
        this.lw = i10;
        String str = this.yo;
        str.getClass();
        switch (str) {
            case "bottom":
                this.zjm = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -this.lw, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "top":
                this.zjm = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.lw, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "left":
                this.zjm = new LinearGradient(this.moa, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "right":
                this.zjm = new LinearGradient(-this.moa, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.lw, 0, -1, Shader.TileMode.CLAMP);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.uef.uef.uef
    public List<PropertyValuesHolder> yo() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PropertyValuesHolder.ofFloat("rubIn", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
        arrayList.add(PropertyValuesHolder.ofFloat(com.bytedance.adsdk.ugeno.uef.lw.ALPHA.oa(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
        return arrayList;
    }
}
