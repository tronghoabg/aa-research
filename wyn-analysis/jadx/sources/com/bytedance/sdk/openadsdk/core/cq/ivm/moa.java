package com.bytedance.sdk.openadsdk.core.cq.ivm;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.ab;
import com.bytedance.adsdk.ugeno.core.cq;
import com.bytedance.adsdk.ugeno.core.wk;
import com.bytedance.adsdk.ugeno.core.wrv;
import com.bytedance.adsdk.ugeno.moa.ivm;
import com.bytedance.sdk.component.adexpress.oa.dz;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.openadsdk.core.model.ab;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.settings.dj;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.yo.yo;
import com.bytedance.sdk.openadsdk.core.zjm.tpx;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.km;
import com.qonversion.android.sdk.internal.Constants;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.MimeTypes;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class moa implements ab, wk, com.bytedance.sdk.component.adexpress.dynamic.moa, com.bytedance.sdk.component.adexpress.oa.moa<View> {
    protected static int tpx = 24;

    /* renamed from: ab, reason: collision with root package name */
    protected float f25508ab;
    protected com.bytedance.sdk.component.adexpress.oa.bcc bcc;
    protected float bs;
    protected com.bytedance.adsdk.ugeno.oa.yo cq;
    protected com.bytedance.sdk.openadsdk.core.zjm.ab cz;
    private lw dxx;
    protected float dz;
    private boolean gr;
    protected JSONObject gsd;
    protected uef ivm;
    protected gzw lw;
    private tpx lz;
    protected JSONObject moa;

    /* renamed from: oa, reason: collision with root package name */
    protected Context f25509oa;
    protected long oib;
    protected String orq;
    private com.bytedance.sdk.component.adexpress.oa.xs rt;
    protected long sy;
    protected wrv uef;
    protected float wk;
    protected com.bytedance.adsdk.ugeno.oa.yo wrv;
    protected FrameLayout xs;
    protected com.bytedance.adsdk.ugeno.oa.yo<View> yo;
    protected dz zjm;
    protected boolean dhk = true;

    /* renamed from: ue, reason: collision with root package name */
    private long f25510ue = 0;
    private float pz = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private float cp = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private float ku = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private float fz = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public SparseArray<yo.uef> gzw = new SparseArray<>();
    private String oyt = "";
    private final com.bytedance.sdk.component.bcc.oa.yo km = new com.bytedance.sdk.component.bcc.oa.yo("ugen_render_template") { // from class: com.bytedance.sdk.openadsdk.core.cq.ivm.moa.1
        @Override // java.lang.Runnable
        public void run() {
            moa moaVar = moa.this;
            moaVar.moa = moaVar.uef();
            moa moaVar2 = moa.this;
            moaVar2.gsd = moaVar2.oa();
            moa moaVar3 = moa.this;
            moaVar3.dxx = new lw(moaVar3.f25509oa, moaVar3.lw, moaVar3.orq, moaVar3.gsd);
            if (moa.this.lz != null) {
                moa moaVar4 = moa.this;
                moaVar4.oyt = moaVar4.lz.getUgenTemplateErrorReason();
            } else {
                moa.this.oyt = "expressView is null";
            }
            com.bytedance.sdk.openadsdk.core.wk.yo().post(moa.this.pu);
        }
    };
    private final Runnable pu = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cq.ivm.moa.2
        @Override // java.lang.Runnable
        public void run() throws JSONException {
            if (moa.this.rt != null) {
                moa moaVar = moa.this;
                moaVar.oa(moaVar.rt);
            }
        }
    };
    private boolean gb = false;
    protected AtomicBoolean dj = new AtomicBoolean(false);

    static {
        if (sy.uef() != null) {
            tpx = sy.oa();
        }
    }

    public moa(Context context, gzw gzwVar, boolean z2, uef uefVar, ViewGroup viewGroup) {
        this.f25509oa = context;
        this.gr = z2;
        this.uef = new wrv(context);
        this.lw = gzwVar;
        this.ivm = uefVar;
        this.xs = new FrameLayout(context);
        if (viewGroup instanceof tpx) {
            this.lz = (tpx) viewGroup;
        }
        this.orq = uefVar.moa();
    }

    private void cz() throws JSONException {
        com.bytedance.adsdk.ugeno.oa.yo<T> yoVarLw;
        if (this.yo == null) {
            return;
        }
        if (this.lw.sjj() && (yoVarLw = this.yo.lw("tvskip")) != 0) {
            yoVarLw.yo(8);
        }
        com.bytedance.adsdk.ugeno.oa.yo<T> yoVarLw2 = this.yo.lw("skip");
        if (yoVarLw2 != 0 && (yoVarLw2 instanceof com.bytedance.adsdk.ugeno.cz.moa.yo)) {
            if (!dj.oa().wk(String.valueOf(this.lw.jnk())) || this.lw.wxf() == 5 || this.lw.wxf() == 6 || this.lw.epe() == 3) {
                ((com.bytedance.adsdk.ugeno.cz.moa.yo) yoVarLw2).dz("local://tt_close_btn");
                yoVarLw2.oa();
            }
        }
    }

    public com.bytedance.adsdk.ugeno.oa.yo bcc() {
        com.bytedance.adsdk.ugeno.oa.yo<View> yoVar = this.yo;
        if (yoVar == null) {
            return null;
        }
        return yoVar.lw(MimeTypes.BASE_TYPE_VIDEO);
    }

    public com.bytedance.adsdk.ugeno.oa.yo ivm() {
        com.bytedance.adsdk.ugeno.oa.yo<View> yoVar = this.yo;
        if (yoVar == null) {
            return null;
        }
        return yoVar.ivm("PlayableComponent");
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.moa
    public View lw() {
        return this.xs;
    }

    public int moa() throws JSONException {
        this.uef.uef((wk) this);
        this.uef.uef((ab) this);
        com.bytedance.adsdk.ugeno.oa.yo<View> yoVarUef = this.uef.uef(this.moa);
        this.yo = yoVarUef;
        lw lwVar = this.dxx;
        if (lwVar != null && yoVarUef != null) {
            lwVar.uef(yoVarUef);
        }
        if (!(this instanceof com.bytedance.sdk.openadsdk.core.cq.ivm.uef.ivm)) {
            this.ivm.dxx().oa();
            this.ivm.dxx().yo();
        }
        this.uef.oa(this.gsd);
        return 0;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.moa
    public void onvideoComplate() {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.moa
    public void setSoundMute(boolean z2) throws JSONException {
        com.bytedance.adsdk.ugeno.oa.yo<T> yoVarLw;
        com.bytedance.adsdk.ugeno.oa.yo<View> yoVar = this.yo;
        if (yoVar == null || (yoVarLw = yoVar.lw("mute")) == 0) {
            return;
        }
        if (z2) {
            ((com.bytedance.adsdk.ugeno.cz.moa.yo) yoVarLw).dz("local://tt_reward_full_mute");
        } else {
            ((com.bytedance.adsdk.ugeno.cz.moa.yo) yoVarLw).dz("local://tt_reward_full_unmute");
        }
        yoVarLw.oa();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.moa
    public void setTime(CharSequence charSequence, int i5, int i10, boolean z2) {
        if (this.yo == null) {
            return;
        }
        boolean z10 = i5 == 1;
        uef(charSequence, z10, i10, z2);
        oa(charSequence, z10, i10, z2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.moa
    public void setTimeUpdate(int i5) {
    }

    public void uef(long j8, long j10) {
    }

    public com.bytedance.adsdk.ugeno.oa.yo xs() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oa(com.bytedance.sdk.component.adexpress.oa.xs xsVar) throws JSONException {
        if (this instanceof com.bytedance.sdk.openadsdk.core.cq.ivm.uef.ivm) {
            this.ivm.lw().xs(1);
        } else {
            this.ivm.dxx().uef();
        }
        if (this.moa == null) {
            xsVar.uef(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, "ugen template is null real reason is " + this.oyt);
            return;
        }
        if (this.gsd == null) {
            xsVar.uef(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, "ugen data is null");
            return;
        }
        int iMoa = moa();
        if (this.uef.uef()) {
            List<String> listOa = this.uef.oa();
            if (listOa == null) {
                xsVar.uef(Sdk.SDKError.Reason.CONFIG_REFRESH_FAILED_VALUE, "unknow widget");
                return;
            }
            xsVar.uef(Sdk.SDKError.Reason.CONFIG_REFRESH_FAILED_VALUE, "unknow widget;" + listOa.toString());
            return;
        }
        if (iMoa != 0) {
            xsVar.uef(iMoa, "ugen render fail");
            return;
        }
        if (this.yo == null) {
            xsVar.uef(Sdk.SDKError.Reason.CONFIG_REFRESH_FAILED_VALUE, "ugen render error");
            return;
        }
        oa oaVar = new oa();
        this.zjm = oaVar;
        oaVar.uef(true);
        this.zjm.uef(yo());
        setSoundMute(this.gr);
        cz();
        com.bytedance.adsdk.ugeno.oa.yo yoVarBcc = bcc();
        this.wrv = yoVarBcc;
        if (yoVarBcc != null && (yoVarBcc instanceof com.bytedance.sdk.openadsdk.core.cq.oa.ivm.oa)) {
            ((oa) this.zjm).uef((FrameLayout) ((com.bytedance.sdk.openadsdk.core.cq.oa.ivm.oa) yoVarBcc).moa());
        }
        lw lwVar = this.dxx;
        if (lwVar != null) {
            lwVar.uef();
        }
        com.bytedance.adsdk.ugeno.oa.yo yoVarIvm = ivm();
        this.cq = yoVarIvm;
        if (yoVarIvm != null && (yoVarIvm instanceof com.bytedance.adsdk.ugeno.cz.oa.oa)) {
            ((oa) this.zjm).oa((FrameLayout) yoVarIvm.dj());
        }
        if (cp.yo(this.lw)) {
            com.bytedance.adsdk.ugeno.oa.yo yoVarXs = xs();
            if (yoVarXs instanceof com.bytedance.sdk.openadsdk.core.cq.oa.yo.oa) {
                ((oa) this.zjm).yo(((com.bytedance.sdk.openadsdk.core.cq.oa.yo.oa) yoVarXs).moa());
            }
        }
        int iKm = this.yo.km();
        int iPu = this.yo.pu();
        this.xs.removeAllViews();
        this.xs.addView(this.yo.dj(), new FrameLayout.LayoutParams(iKm, iPu));
        float fCp = this.ivm.cp();
        float fKu = this.ivm.ku();
        float fOa = af.oa(this.f25509oa, fCp);
        float fOa2 = af.oa(this.f25509oa, fKu);
        if (yo() != 7) {
            this.xs.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        } else if (fKu <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.xs.setLayoutParams(new FrameLayout.LayoutParams((int) fOa, -2));
        } else {
            this.xs.setLayoutParams(new FrameLayout.LayoutParams((int) fOa, (int) fOa2));
        }
        if (fKu <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fCp <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.xs.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            int iYo = af.yo(this.f25509oa, this.xs.getMeasuredWidth());
            int iYo2 = af.yo(this.f25509oa, this.xs.getMeasuredHeight());
            this.zjm.uef(iYo);
            this.zjm.oa(iYo2);
        } else {
            this.zjm.uef(fCp);
            this.zjm.oa(fKu);
        }
        if (this.dj.get()) {
            xsVar.uef(Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, "ugen render timeout");
        } else {
            this.uef.uef(this.yo, "renderDidFinish", new Object[0]);
            xsVar.uef(this.xs, this.zjm);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.wk
    public void uef(com.bytedance.adsdk.ugeno.oa.yo yoVar, String str, ivm.uef uefVar) {
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.moa
    public int yo() {
        return this.lw.ix();
    }

    public void uef(gzw gzwVar, boolean z2, uef uefVar, ViewGroup viewGroup) {
        this.lw = gzwVar;
        this.ivm = uefVar;
        this.orq = uefVar.moa();
        if (viewGroup instanceof tpx) {
            this.lz = (tpx) viewGroup;
        }
        this.gr = z2;
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.moa
    public void uef(com.bytedance.sdk.component.adexpress.oa.xs xsVar) {
        this.rt = xsVar;
        km.yo((Runnable) this.km);
    }

    public JSONObject uef() {
        return this.ivm.yo();
    }

    public void uef(boolean z2) {
        this.dj.set(z2);
    }

    public void uef(com.bytedance.sdk.component.adexpress.oa.bcc bccVar) {
        this.bcc = bccVar;
    }

    public void uef(com.bytedance.sdk.openadsdk.core.zjm.ab abVar) {
        this.cz = abVar;
    }

    public void uef(com.bytedance.sdk.openadsdk.core.widget.lw lwVar) {
        lw lwVar2 = this.dxx;
        if (lwVar2 != null) {
            lwVar2.uef(lwVar);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.wk
    public void uef(cq cqVar, wk.oa oaVar, wk.uef uefVar) {
        if (cqVar == null) {
            return;
        }
        if (cqVar.oa() == 1 || cqVar.oa() == 4) {
            uef(cqVar);
        }
        if (cqVar.oa() == 10) {
            uef(cqVar.yo());
        }
        if (oaVar == null || cqVar.moa() == null) {
            return;
        }
        oaVar.uef(cqVar.moa());
    }

    private void uef(JSONObject jSONObject) {
        com.bytedance.adsdk.ugeno.oa.yo<T> yoVarLw;
        if (this.yo == null || jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("type");
        String strOptString2 = jSONObject.optString("nodeId");
        if (TextUtils.isEmpty(strOptString2) || (yoVarLw = this.yo.lw(strOptString2)) == 0) {
            return;
        }
        if (TextUtils.equals(strOptString, "onShow")) {
            yoVarLw.yo(0);
        } else if (TextUtils.equals(strOptString, "onDismiss")) {
            yoVarLw.yo(8);
        }
    }

    private void uef(cq cqVar) {
        JSONObject jSONObjectMoa;
        boolean zUef;
        int i5;
        String str;
        lw lwVar;
        lw lwVar2;
        lw lwVar3;
        int i10 = 5;
        boolean z2 = true;
        if (this.bcc == null) {
            return;
        }
        String strOptString = cqVar.yo().optString("type");
        if ("swiperLeft".equals(strOptString) && (lwVar3 = this.dxx) != null) {
            lwVar3.oa();
            return;
        }
        if ("swiperRight".equals(strOptString) && (lwVar2 = this.dxx) != null) {
            lwVar2.yo();
            return;
        }
        if (!"swiperClick".equals(strOptString) || (lwVar = this.dxx) == null) {
            jSONObjectMoa = null;
            zUef = false;
            i5 = 0;
        } else {
            zUef = lwVar.uef(cqVar);
            jSONObjectMoa = this.dxx.moa();
            i5 = 2;
        }
        strOptString.getClass();
        switch (strOptString) {
            case "privacy":
                i10 = 7;
                break;
            case "feedback":
                i10 = 3;
                break;
            case "mute":
                break;
            case "skip":
                i10 = 6;
                break;
            case "video":
                i10 = 4;
                break;
            case "creative":
                i10 = 2;
                break;
            default:
                i10 = i5;
                break;
        }
        com.bytedance.adsdk.ugeno.oa.yo yoVarUef = cqVar.uef();
        ab.uef uefVarUef = new ab.uef().moa(this.dz).yo(this.wk).oa(this.f25508ab).uef(this.bs).oa(this.sy).uef(this.oib).uef(this.gzw);
        if (cqVar.oa() == 1 && !this.dhk) {
            z2 = false;
        }
        ab.uef uefVarUef2 = uefVarUef.uef(z2);
        if (yoVarUef == null) {
            str = "";
        } else {
            str = yoVarUef.oyt() + Constants.USER_ID_SEPARATOR + yoVarUef.lz();
        }
        this.bcc.uef(cqVar.uef().dj(), i10, uefVarUef2.uef(str).oa(zUef).oa(jSONObjectMoa).uef());
    }

    public JSONObject oa() {
        return this.ivm.fz();
    }

    private void oa(CharSequence charSequence, boolean z2, int i5, boolean z10) {
        com.bytedance.adsdk.ugeno.oa.yo<T> yoVarLw;
        View viewDj;
        com.bytedance.adsdk.ugeno.oa.yo<View> yoVar = this.yo;
        if (yoVar == null || (yoVarLw = yoVar.lw("skip")) == 0 || (viewDj = yoVarLw.dj()) == null) {
            return;
        }
        int i10 = 0;
        if (!z2 && !z10) {
            i10 = 8;
        }
        viewDj.setVisibility(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    @Override // com.bytedance.adsdk.ugeno.core.ab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void uef(com.bytedance.adsdk.ugeno.oa.yo r10, android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.cq.ivm.moa.uef(com.bytedance.adsdk.ugeno.oa.yo, android.view.MotionEvent):void");
    }

    private void uef(CharSequence charSequence, boolean z2, int i5, boolean z10) throws NumberFormatException {
        com.bytedance.adsdk.ugeno.oa.yo<T> yoVarLw;
        int i10;
        com.bytedance.adsdk.ugeno.oa.yo<View> yoVar = this.yo;
        if (yoVar == null || (yoVarLw = yoVar.lw("countdown")) == 0) {
            return;
        }
        View viewDj = yoVarLw.dj();
        if (viewDj instanceof TextView) {
            try {
                i10 = Integer.parseInt((String) charSequence);
            } catch (Exception unused) {
                dhk.yo("UGenRender", "parse duration exception", charSequence);
                i10 = 0;
            }
            if (!z10 && i10 > 0 && !this.gb) {
                viewDj.setVisibility(0);
                if (!z2 && this.ivm.uef() && com.bytedance.sdk.component.adexpress.moa.ivm.oa(this.ivm.moa())) {
                    ((TextView) viewDj).setText(String.format(orq.uef(com.bytedance.sdk.component.adexpress.moa.uef(), "tt_reward_full_skip"), Integer.valueOf(i5)));
                    return;
                }
                if (!"open_ad".equals(this.ivm.moa()) && this.ivm.uef()) {
                    this.gb = true;
                    viewDj.setVisibility(8);
                    return;
                } else {
                    ((TextView) viewDj).setText(((Object) charSequence) + "s");
                    return;
                }
            }
            viewDj.setVisibility(8);
        }
    }
}
