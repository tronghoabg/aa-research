package com.bytedance.adsdk.ugeno.uef.uef;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.xs.bcc;
import com.bytedance.adsdk.ugeno.xs.uef;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class moa extends uef {

    /* renamed from: ab, reason: collision with root package name */
    private static final float f24770ab;
    private static final float bs;
    private static final float dz;
    private static final float wk;
    private int bcc;
    private Path cq;
    private float cz;
    private int dj;
    private uef.C0046uef ivm;
    private Path lw;
    private Paint moa;
    private float sy;
    private boolean wrv;
    private int xs;
    private int yo;
    private int zjm;

    static {
        float radians = (float) Math.toRadians(30.0d);
        dz = radians;
        wk = (float) Math.tan(radians);
        f24770ab = (float) Math.cos(radians);
        bs = (float) Math.sin(radians);
    }

    public moa(com.bytedance.adsdk.ugeno.oa.yo yoVar, JSONObject jSONObject) {
        super(yoVar, jSONObject);
        this.wrv = true;
        Paint paint = new Paint();
        this.moa = paint;
        paint.setAntiAlias(true);
        this.lw = new Path();
        this.cz = this.f24771oa.gzw();
        this.cq = new Path();
    }

    private void yo(Canvas canvas) {
        LinearGradient linearGradient;
        try {
            if (this.f24771oa.au() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                int i5 = this.zjm;
                float f10 = wk;
                float fAu = ((i5 * f10) + i5) * this.f24771oa.au();
                this.cq.reset();
                this.cq.moveTo(fAu, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                int i10 = this.dj;
                float f11 = fAu - (i10 * f10);
                this.cq.lineTo(f11, i10);
                this.cq.lineTo(f11 + this.yo, this.dj);
                this.cq.lineTo(this.yo + fAu, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.cq.close();
                float f12 = this.sy;
                float f13 = f24770ab * f12;
                float f14 = f12 * bs;
                if (!this.wrv || this.ivm == null) {
                    int i11 = this.bcc;
                    linearGradient = new LinearGradient(fAu, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fAu + f13, f14, new int[]{i11, this.xs, i11}, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    linearGradient = new LinearGradient(fAu, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fAu + f13, f14, this.ivm.f24777oa, (float[]) null, Shader.TileMode.CLAMP);
                }
                this.moa.setShader(linearGradient);
                Path path = this.lw;
                if (path != null) {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                canvas.drawPath(this.cq, this.moa);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.uef.uef.uef
    public void oa() {
        this.yo = (int) bcc.uef(this.f24771oa.dj().getContext(), this.uef.optInt("shineWidth", 30));
        String strOptString = this.uef.optString("backgroundColor", "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))");
        String str = TextUtils.isEmpty(strOptString) ? "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))" : strOptString;
        if (str.startsWith("linear")) {
            this.ivm = com.bytedance.adsdk.ugeno.xs.uef.oa(str);
        } else {
            int iUef = com.bytedance.adsdk.ugeno.xs.uef.uef(str);
            this.xs = iUef;
            this.bcc = com.bytedance.adsdk.ugeno.xs.uef.uef(iUef, 32);
            this.wrv = false;
        }
        this.sy = f24770ab * this.yo;
    }

    @Override // com.bytedance.adsdk.ugeno.uef.uef.uef
    public void uef(Canvas canvas) {
        yo(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.uef.uef.uef
    public void uef(int i5, int i10) {
        this.zjm = i5;
        this.dj = i10;
        try {
            RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i5, i10);
            Path path = this.lw;
            float f10 = this.cz;
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.uef.uef.uef
    public void oa(Canvas canvas) {
        yo(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.uef.uef.uef
    public List<PropertyValuesHolder> yo() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(moa(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }
}
