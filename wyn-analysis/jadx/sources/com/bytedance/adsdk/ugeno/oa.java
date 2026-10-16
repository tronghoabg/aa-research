package com.bytedance.adsdk.ugeno;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.core.wrv;
import com.bytedance.adsdk.ugeno.moa.cz;
import com.bytedance.adsdk.ugeno.moa.ivm;
import com.bytedance.adsdk.ugeno.xs.bcc;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class oa extends com.bytedance.adsdk.ugeno.oa.uef<com.bytedance.adsdk.ugeno.ivm.oa> implements com.bytedance.adsdk.ugeno.ivm.yo {
    private boolean aje;
    private int az;

    /* renamed from: cc, reason: collision with root package name */
    private int f24743cc;

    /* renamed from: df, reason: collision with root package name */
    private JSONArray f24744df;
    private float dy;
    private float efa;
    private int ej;
    private boolean ifk;
    private boolean iou;
    private String jp;
    private boolean jx;
    private int kik;
    private boolean lo;
    private String lpy;
    private float meb;
    private float nj;
    private int no;
    private int qn;
    private float syr;

    /* renamed from: try, reason: not valid java name */
    private boolean f1try;

    /* renamed from: uf, reason: collision with root package name */
    private float f24745uf;
    private boolean up;
    private float uxr;

    /* renamed from: wd, reason: collision with root package name */
    private float f24746wd;

    /* renamed from: wf, reason: collision with root package name */
    private String f24747wf;
    private float wp;
    private float xw;
    private float ykf;

    public oa(Context context) {
        super(context);
        this.qn = 0;
        this.lo = true;
        this.aje = true;
        this.syr = 500.0f;
        this.f24745uf = -1.0f;
        this.nj = 2000.0f;
        this.jp = "slide";
        this.f24747wf = "dot";
        this.ykf = 8.0f;
        this.meb = 8.0f;
        this.dy = 50.0f;
        this.f24746wd = 90.0f;
        this.ifk = false;
        this.ej = Color.parseColor("#666666");
        this.f24743cc = Color.parseColor("#ffffff");
        this.lpy = "row";
        this.wp = 1.0f;
        this.uxr = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.efa = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.xw = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.az = 0;
        this.kik = 0;
        this.up = true;
        this.iou = false;
        this.f1try = true;
        float fUef = bcc.uef(this.f24755oa, 8.0f);
        this.ykf = fUef;
        this.meb = fUef;
    }

    private void bcc(int i5) {
        cz czVar = this.uu;
        if (czVar == null) {
            return;
        }
        czVar.uef("SwiperView://slide", Integer.valueOf(this.no), Integer.valueOf(i5), Integer.valueOf(!this.jx ? 1 : 0));
    }

    private void dv() {
        List<com.bytedance.adsdk.ugeno.oa.yo<View>> list = ((com.bytedance.adsdk.ugeno.oa.uef) this).uef;
        if (list == null || list.isEmpty()) {
            return;
        }
        com.bytedance.adsdk.ugeno.oa.yo<View> yoVar = ((com.bytedance.adsdk.ugeno.oa.uef) this).uef.get(0);
        if (this.f24744df == null) {
            return;
        }
        for (int i5 = 0; i5 < this.f24744df.length(); i5++) {
            wrv wrvVar = new wrv(this.f24755oa);
            uef(wrvVar);
            wrvVar.uef(this.hdd);
            try {
                JSONObject jSONObjectOptJSONObject = this.f24744df.optJSONObject(i5);
                if (jSONObjectOptJSONObject != null) {
                    if (jSONObjectOptJSONObject.has("$chunk")) {
                        this.moa.put("$item", jSONObjectOptJSONObject.optJSONArray("$chunk"));
                    } else {
                        this.moa.put("$item", jSONObjectOptJSONObject);
                    }
                    ((com.bytedance.adsdk.ugeno.ivm.oa) this.lw).uef((com.bytedance.adsdk.ugeno.ivm.oa) wrvVar.uef(yoVar.ku(), this.moa, (JSONObject) null));
                }
            } catch (Throwable unused) {
            }
        }
    }

    private int nkh() {
        if (this.az == 1) {
            List<com.bytedance.adsdk.ugeno.oa.yo<View>> list = ((com.bytedance.adsdk.ugeno.oa.uef) this).uef;
            if (list != null) {
                return list.size();
            }
            return 0;
        }
        JSONArray jSONArray = this.f24744df;
        if (jSONArray != null) {
            return jSONArray.length();
        }
        return 0;
    }

    private void xs(int i5) {
        if (this.uu == null) {
            return;
        }
        if (this.no == 0 && i5 == nkh() - 1) {
            this.uu.uef("SwiperView://reloop", 1);
            Log.d("BaseSwiper", "onPageSelected: reloop monitor FIRST_TO_LAST");
        }
        if (this.no == nkh() - 1 && i5 == 0) {
            this.uu.uef("SwiperView://reloop", 0);
            Log.d("BaseSwiper", "onPageSelected: reloop monitor LAST_TO_FIRST");
        }
    }

    private void zou() throws JSONException {
        for (int i5 = 0; i5 < ((com.bytedance.adsdk.ugeno.oa.uef) this).uef.size(); i5++) {
            com.bytedance.adsdk.ugeno.oa.yo<View> yoVar = ((com.bytedance.adsdk.ugeno.oa.uef) this).uef.get(i5);
            if (yoVar != null) {
                wrv wrvVar = new wrv(this.f24755oa);
                uef(wrvVar);
                wrvVar.uef(this.hdd);
                ((com.bytedance.adsdk.ugeno.ivm.oa) this.lw).uef((com.bytedance.adsdk.ugeno.ivm.oa) wrvVar.uef(yoVar.ku(), this.moa, (JSONObject) null));
            }
        }
    }

    public void moa() throws Resources.NotFoundException {
        ((com.bytedance.adsdk.ugeno.ivm.oa) this.lw).dz(((com.bytedance.adsdk.ugeno.ivm.oa) this.lw).getCurrentItem() - 1);
    }

    public void yo() throws Resources.NotFoundException {
        ((com.bytedance.adsdk.ugeno.ivm.oa) this.lw).dz(((com.bytedance.adsdk.ugeno.ivm.oa) this.lw).getCurrentItem() + 1);
    }

    @Override // com.bytedance.adsdk.ugeno.oa.uef, com.bytedance.adsdk.ugeno.oa.yo
    public void oa() throws JSONException, Resources.NotFoundException {
        super.oa();
        ((com.bytedance.adsdk.ugeno.ivm.oa) this.lw).yo((int) this.syr).lw(this.iou).uef(this.f24747wf).uef(this.ykf).oa(this.meb).yo(this.dy).moa(this.f24746wd).oa(this.lpy).uef(this.qn).oa().moa(this.lo).uef(this.aje).oa((int) this.syr).moa((int) this.nj).lw((int) this.f24745uf).oa(this.up).yo(this.ifk).xs(this.ej).ivm(this.f24743cc).cz((int) this.efa).zjm((int) this.xw).bcc((int) this.uxr).lw(this.wp).yo(this.jp).dz(this.kik);
        ((com.bytedance.adsdk.ugeno.ivm.oa) this.lw).setOnPageChangeListener(this);
        if (this.az == 1) {
            zou();
        } else {
            dv();
        }
        ((com.bytedance.adsdk.ugeno.ivm.oa) this.lw).yo();
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    public View uef() {
        com.bytedance.adsdk.ugeno.ivm.oa oaVar = new com.bytedance.adsdk.ugeno.ivm.oa(this.f24755oa);
        this.lw = oaVar;
        oaVar.uef((moa) this);
        return this.lw;
    }

    @Override // com.bytedance.adsdk.ugeno.oa.uef
    public void uef(com.bytedance.adsdk.ugeno.oa.yo yoVar) {
        if (yoVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.oa.uef) this).uef.add(yoVar);
    }

    @Override // com.bytedance.adsdk.ugeno.oa.uef
    public void uef(com.bytedance.adsdk.ugeno.oa.yo yoVar, ViewGroup.LayoutParams layoutParams) {
        if (yoVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.oa.uef) this).uef.add(yoVar);
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    public void uef(String str, String str2) {
        super.uef(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "startDelay":
                this.f24745uf = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, -1.0f);
                break;
            case "startIndex":
                this.kik = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, 0);
                break;
            case "indicatorColor":
                this.ej = com.bytedance.adsdk.ugeno.xs.uef.uef(str2, this.ej);
                break;
            case "indicatorStyle":
                this.f24747wf = str2;
                break;
            case "indicatorWidth":
                this.ykf = bcc.uef(this.f24755oa, com.bytedance.adsdk.ugeno.xs.yo.uef(str2, 8.0f));
                break;
            case "indicatorHeight":
                this.meb = bcc.uef(this.f24755oa, com.bytedance.adsdk.ugeno.xs.yo.uef(str2, 8.0f));
                break;
            case "nextMargin":
                this.xw = bcc.uef(this.f24755oa, com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "driveMode":
                this.az = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, 0);
                break;
            case "effect":
                this.jp = str2;
                break;
            case "direction":
                if (TextUtils.equals(str2, "vertical")) {
                    this.qn = 1;
                    break;
                } else {
                    this.qn = 0;
                    break;
                }
            case "disableOnInteraction":
                this.iou = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, false);
                break;
            case "indicator":
                this.ifk = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, false);
                break;
            case "indicatorX":
                this.dy = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, 50.0f);
                break;
            case "indicatorY":
                this.f24746wd = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, 90.0f);
                break;
            case "previousMargin":
                this.efa = bcc.uef(this.f24755oa, com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "loop":
                this.lo = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, true);
                break;
            case "delay":
                this.nj = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, 2000.0f);
                break;
            case "speed":
                this.syr = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, 500.0f);
                break;
            case "indicatorDirection":
                this.lpy = str2;
                break;
            case "allowTouchMove":
                this.up = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, true);
                break;
            case "pageCount":
                this.wp = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, 1.0f);
                break;
            case "pageMargin":
                this.uxr = bcc.uef(this.f24755oa, com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "indicatorSelectedColor":
                this.f24743cc = com.bytedance.adsdk.ugeno.xs.uef.uef(str2, this.f24743cc);
                break;
            case "autoplay":
                this.aje = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, true);
                break;
            case "dataList":
                this.f24744df = com.bytedance.adsdk.ugeno.xs.oa.uef(str2, (JSONArray) null);
                break;
        }
    }

    public void uef(int i5) throws Resources.NotFoundException {
        if (((com.bytedance.adsdk.ugeno.ivm.oa) this.lw).getCurrentItem() != i5) {
            ((com.bytedance.adsdk.ugeno.ivm.oa) this.lw).dz(i5);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ivm.yo
    public void uef(boolean z2, int i5, float f10, int i10) {
        Log.d("BaseSwiper", "onPageScrolled: loop=" + z2 + "; position=" + i5 + "; positionOffset=" + f10 + "; positionOffsetPixels=" + i10);
        uef(z2, i5, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.ivm.yo
    public void uef(boolean z2, int i5, int i10, boolean z10, boolean z11) {
        if (this.no != i5) {
            xs(i5);
            bcc(i5);
            this.no = i5;
        }
        Log.d("BaseSwiper", "onPageSelected: loop=" + z2 + "; position=" + i5 + "; loopPosition=" + i10 + "; isFirst=" + z10 + "; isLast=" + z11);
    }

    @Override // com.bytedance.adsdk.ugeno.ivm.yo
    public void uef(boolean z2, int i5) {
        if (i5 == 0) {
            if (!z2) {
                this.f1try = true;
            }
            this.jx = false;
        } else if (i5 == 1) {
            this.jx = true;
        }
        Log.d("BaseSwiper", "onPageScrollStateChanged: loop=" + z2 + "; state=" + i5);
    }

    private void uef(boolean z2, int i5, float f10) {
        if (this.uu != null && !z2 && i5 == nkh() - 1 && f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.f1try) {
            this.uu.uef("SwiperView://finish", new Object[0]);
            Log.d("BaseSwiper", "onPageScrolled: finish monitor");
            this.f1try = false;
        }
    }

    private void uef(wrv wrvVar) {
        if (this.iou) {
            wrvVar.uef(new com.bytedance.adsdk.ugeno.core.lw() { // from class: com.bytedance.adsdk.ugeno.oa.1
                @Override // com.bytedance.adsdk.ugeno.core.lw
                public void uef(com.bytedance.adsdk.ugeno.oa.yo yoVar, String str, List<ivm.uef> list) {
                    if ((TextUtils.equals(str, "tap") || TextUtils.equals(str, "slide") || TextUtils.equals(str, "touchStart") || TextUtils.equals(str, "touchEnd")) && ((com.bytedance.adsdk.ugeno.oa.yo) oa.this).lw != null) {
                        ((com.bytedance.adsdk.ugeno.ivm.oa) ((com.bytedance.adsdk.ugeno.oa.yo) oa.this).lw).ivm();
                    }
                }
            });
        }
    }
}
