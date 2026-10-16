package com.bytedance.adsdk.ugeno.uef.uef;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class lw extends uef {
    private boolean bcc;
    private PorterDuffXfermode cq;
    private boolean cz;
    private Path dj;
    private float ivm;
    private Paint lw;
    private float moa;
    private Path wrv;
    private String xs;
    private float yo;
    private Path zjm;

    public lw(com.bytedance.adsdk.ugeno.oa.yo yoVar, JSONObject jSONObject) {
        super(yoVar, jSONObject);
        this.bcc = true;
        this.cz = true;
        Paint paint = new Paint();
        this.lw = paint;
        paint.setAntiAlias(true);
        this.f24771oa.dj().setLayerType(2, null);
        this.cq = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.zjm = new Path();
        this.dj = new Path();
        this.wrv = new Path();
        this.lw.setXfermode(this.cq);
    }

    private void yo(Canvas canvas) {
        int iDor;
        int iDor2;
        if (this.f24771oa.dor() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.lw.setXfermode(this.cq);
            canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.yo, this.moa, this.lw);
            return;
        }
        iDor = (int) (this.f24771oa.dor() * this.yo);
        iDor2 = (int) (this.f24771oa.dor() * this.moa);
        this.lw.setXfermode(this.cq);
        String str = this.xs;
        str.getClass();
        switch (str) {
            case "bottom":
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, iDor2, this.yo, this.moa, this.lw);
                break;
            case "center":
                this.zjm.reset();
                this.dj.reset();
                this.wrv.reset();
                Path.Direction direction = Path.Direction.CW;
                this.zjm.addCircle(this.yo / 2.0f, this.moa / 2.0f, iDor, direction);
                Path path = this.dj;
                float f10 = this.yo;
                path.addRect(f10 / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, this.moa, direction);
                Path path2 = this.dj;
                Path path3 = this.zjm;
                Path.Op op = Path.Op.DIFFERENCE;
                path2.op(path3, op);
                this.wrv.addRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.yo / 2.0f, this.moa, direction);
                this.wrv.op(this.zjm, op);
                canvas.drawPath(this.dj, this.lw);
                canvas.drawPath(this.wrv, this.lw);
                break;
            case "top":
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.yo, this.moa - iDor2, this.lw);
                break;
            case "left":
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.yo - iDor, this.moa, this.lw);
                break;
            case "right":
                canvas.drawRect(iDor, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.yo, this.moa, this.lw);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.uef.uef.uef
    public void oa() {
        this.ivm = (float) this.uef.optDouble("start", 0.0d);
        this.xs = this.uef.optString("direction", "center");
    }

    @Override // com.bytedance.adsdk.ugeno.uef.uef.uef
    public void uef(Canvas canvas) {
        yo(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.uef.uef.uef
    public void uef(int i5, int i10) {
        if (i5 > 0 && this.bcc) {
            this.yo = i5;
            this.bcc = false;
        }
        if (i10 <= 0 || !this.cz) {
            return;
        }
        this.moa = i10;
        this.cz = false;
    }

    @Override // com.bytedance.adsdk.ugeno.uef.uef.uef
    public void oa(Canvas canvas) {
        yo(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.uef.uef.uef
    public List<PropertyValuesHolder> yo() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(moa(), this.ivm, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }
}
