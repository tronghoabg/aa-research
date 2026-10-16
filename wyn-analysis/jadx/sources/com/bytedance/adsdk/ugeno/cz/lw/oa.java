package com.bytedance.adsdk.ugeno.cz.lw;

import android.content.Context;
import android.graphics.Color;
import com.bytedance.adsdk.ugeno.oa.yo;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONException;

/* loaded from: classes.dex */
public class oa extends yo<uef> {
    private float aje;
    private float lo;
    private int qn;
    private float syr;
    private int uef;

    /* renamed from: uf, reason: collision with root package name */
    private static final int f24703uf = Color.parseColor("#FFC642");
    private static final int nj = Color.parseColor("#e3e3e4");

    public oa(Context context) {
        super(context);
        this.uef = f24703uf;
        this.qn = nj;
        this.lo = 4.0f;
        this.aje = 20.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    public void oa() throws JSONException {
        super.oa();
        if (fz()) {
            ((uef) this.lw).uef(this.lo, this.uef, this.qn, this.aje, (int) this.syr);
        } else {
            ((uef) this.lw).uef(this.lo, this.uef, this.qn, this.aje, 5);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    /* renamed from: yo, reason: merged with bridge method [inline-methods] */
    public uef uef() {
        uef uefVar = new uef(this.f24755oa);
        uefVar.uef(this);
        return uefVar;
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    public void uef(String str, String str2) {
        super.uef(str, str2);
        str.getClass();
        switch (str) {
            case "highLightColor":
            case "highlightColor":
                this.uef = com.bytedance.adsdk.ugeno.xs.uef.uef(str2);
                break;
            case "lowLightColor":
            case "lowlightColor":
                this.qn = com.bytedance.adsdk.ugeno.xs.uef.uef(str2, nj);
                break;
            case "gap":
                this.syr = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "size":
                this.aje = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, 20.0f);
                break;
            case "score":
                this.lo = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, 4.0f);
                break;
        }
    }
}
