package com.bytedance.adsdk.ugeno;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.wrv;
import com.bytedance.adsdk.ugeno.xs.bcc;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes.dex */
public class yo extends com.bytedance.adsdk.ugeno.oa.uef<com.bytedance.adsdk.ugeno.ivm.oa> {
    private boolean aje;

    /* renamed from: cc, reason: collision with root package name */
    private float f24778cc;
    private JSONArray dy;
    private float ej;
    private float ifk;
    private boolean jp;
    private boolean lo;
    private float meb;
    private String nj;
    private String qn;
    private float syr;

    /* renamed from: uf, reason: collision with root package name */
    private float f24779uf;

    /* renamed from: wd, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.oa.yo f24780wd;

    /* renamed from: wf, reason: collision with root package name */
    private int f24781wf;
    private int ykf;

    public yo(Context context) {
        super(context);
        this.lo = true;
        this.aje = true;
        this.syr = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f24779uf = 2000.0f;
        this.nj = "normal";
        this.jp = true;
        this.f24781wf = Color.parseColor("#666666");
        this.ykf = Color.parseColor("#ffffff");
    }

    @Override // com.bytedance.adsdk.ugeno.oa.uef, com.bytedance.adsdk.ugeno.oa.yo
    public void oa() throws JSONException, Resources.NotFoundException {
        super.oa();
        JSONArray jSONArray = this.dy;
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.ivm.oa) this.lw).bcc((int) this.ifk).cz((int) this.ej).zjm((int) this.f24778cc).yo(this.jp).ivm(this.ykf).xs(this.f24781wf).yo(this.nj).moa(this.lo).lw(this.meb).uef(this.aje).moa((int) this.f24779uf).yo(this.jp);
        for (int i5 = 0; i5 < this.dy.length(); i5++) {
            wrv wrvVar = new wrv(this.f24755oa);
            wrvVar.uef(this.hdd);
            com.bytedance.adsdk.ugeno.oa.yo<View> yoVarOa = wrvVar.oa(this.f24780wd.ku(), (com.bytedance.adsdk.ugeno.oa.yo<View>) null);
            wrvVar.oa(this.dy.optJSONObject(i5));
            ((com.bytedance.adsdk.ugeno.ivm.oa) this.lw).uef((com.bytedance.adsdk.ugeno.ivm.oa) yoVarOa);
        }
        if (this.aje) {
            ((com.bytedance.adsdk.ugeno.ivm.oa) this.lw).yo();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    public void uef(JSONObject jSONObject) {
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    public View uef() {
        com.bytedance.adsdk.ugeno.ivm.oa oaVar = new com.bytedance.adsdk.ugeno.ivm.oa(this.f24755oa);
        this.lw = oaVar;
        oaVar.uef((moa) this);
        return this.lw;
    }

    public void uef(com.bytedance.adsdk.ugeno.ivm.yo yoVar) {
        T t10 = this.lw;
        if (t10 != 0) {
            ((com.bytedance.adsdk.ugeno.ivm.oa) t10).setOnPageChangeListener(yoVar);
        }
    }

    public void uef(int i5) throws Resources.NotFoundException {
        T t10 = this.lw;
        if (t10 != 0) {
            ((com.bytedance.adsdk.ugeno.ivm.oa) t10).dz(i5);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oa.uef
    public void uef(com.bytedance.adsdk.ugeno.oa.yo yoVar) {
        this.f24780wd = yoVar;
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    public void uef(String str, String str2) {
        super.uef(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "delayStart":
                this.syr = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "indicatorColor":
                this.f24781wf = com.bytedance.adsdk.ugeno.xs.uef.uef(str2);
                break;
            case "nextMargin":
                this.f24778cc = bcc.uef(this.f24755oa, com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "effect":
                this.nj = str2;
                break;
            case "direction":
                this.qn = str2;
                break;
            case "indicator":
                this.jp = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, true);
                break;
            case "previousMargin":
                this.ej = bcc.uef(this.f24755oa, com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "loop":
                this.lo = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, true);
                break;
            case "speed":
                this.f24779uf = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, 500.0f);
                break;
            case "pageCount":
                this.meb = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, 1.0f);
                break;
            case "pageMargin":
                this.ifk = bcc.uef(this.f24755oa, com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "indicatorSelectedColor":
                this.ykf = com.bytedance.adsdk.ugeno.xs.uef.uef(str2);
                break;
            case "autoplay":
                this.aje = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, true);
                break;
            case "dataList":
                this.dy = com.bytedance.adsdk.ugeno.xs.oa.uef(str2, (JSONArray) null);
                break;
        }
    }
}
