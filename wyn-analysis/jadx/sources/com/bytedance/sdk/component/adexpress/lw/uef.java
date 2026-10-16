package com.bytedance.sdk.component.adexpress.lw;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.oa.bcc;
import com.bytedance.sdk.component.adexpress.oa.cq;
import com.bytedance.sdk.component.adexpress.oa.dj;
import com.bytedance.sdk.component.adexpress.oa.dz;
import com.bytedance.sdk.component.adexpress.oa.xs;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.cz.ivm;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class uef implements dj, com.bytedance.sdk.component.adexpress.oa.moa<ivm>, com.bytedance.sdk.component.adexpress.theme.uef, com.bytedance.sdk.component.adexpress.uef {
    private String bcc;
    private boolean cq;
    private String cz;
    private bcc dj;
    private int dz;
    protected ivm moa;

    /* renamed from: oa, reason: collision with root package name */
    protected boolean f24923oa;
    protected JSONObject uef;
    private cq wrv;
    private Context xs;
    protected boolean yo;
    private volatile xs zjm;
    protected int lw = 8;
    protected AtomicBoolean ivm = new AtomicBoolean(false);
    private AtomicBoolean wk = new AtomicBoolean(false);

    public uef(Context context, cq cqVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver) {
        this.f24923oa = false;
        this.xs = context;
        this.wrv = cqVar;
        this.bcc = cqVar.moa();
        themeStatusBroadcastReceiver.uef(this);
        if (com.bytedance.sdk.component.adexpress.moa.oa()) {
            dz();
            return;
        }
        ivm ivmVarUef = uef(this.xs, this.bcc);
        this.moa = ivmVarUef;
        if (ivmVarUef != null) {
            this.f24923oa = true;
            Log.d("WebViewRender", "initWebView: reuse WebView");
        } else {
            Log.d("WebViewRender", "initWebView: create WebView");
            if (com.bytedance.sdk.component.adexpress.moa.uef() != null) {
                this.moa = new ivm(com.bytedance.sdk.component.adexpress.moa.uef(), ivm.yo.ADS);
            }
        }
    }

    private void dz() {
        if (this.xs == null && com.bytedance.sdk.component.adexpress.moa.uef() != null) {
            this.xs = com.bytedance.sdk.component.adexpress.moa.uef();
        }
        Context context = this.xs;
        if (context != null) {
            ivm ivmVarUef = uef(context, this.bcc);
            this.moa = ivmVarUef;
            if (ivmVarUef == null) {
                Log.d("WebViewRender", "initWebView: create WebView by act");
                this.moa = new ivm(new MutableContextWrapper(this.xs.getApplicationContext()), uef());
            } else {
                this.f24923oa = true;
                Log.d("WebViewRender", "initWebView: reuse WebView");
            }
        }
    }

    public void bcc() {
        if (moa() == null) {
            return;
        }
        try {
            moa().getWebView().resumeTimers();
        } catch (Exception unused) {
        }
    }

    public cq cq() {
        return this.wrv;
    }

    public abstract void cz();

    public void dj() {
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.moa
    /* renamed from: ivm, reason: merged with bridge method [inline-methods] */
    public ivm lw() {
        return moa();
    }

    public ivm moa() {
        return this.moa;
    }

    public void oa() {
        if (this.wrv.gzw()) {
            lw.uef().yo(this.moa);
        } else {
            lw.uef().moa(this.moa);
        }
    }

    public abstract void uef(int i5);

    public void wrv() {
    }

    public void xs() {
        if (this.ivm.get()) {
            return;
        }
        this.ivm.set(true);
        cz();
        if (this.moa.getParent() != null) {
            ((ViewGroup) this.moa.getParent()).removeView(this.moa);
        }
        Log.d("WebViewRender", "release: webview success = " + this.yo + "; is click backup close button = " + this.wk.get());
        if (!this.yo || this.wk.get()) {
            Log.d("WebViewRender", "release: direct destroy webview");
            lw.uef().lw(this.moa);
        } else {
            Log.d("WebViewRender", "release: recycle webview for pool");
            oa();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.moa
    public int yo() {
        return 0;
    }

    public void zjm() {
        dj();
        Activity activityUef = com.bytedance.sdk.component.utils.oa.uef(this.moa);
        if (activityUef != null) {
            this.dz = oa(activityUef);
        }
    }

    public ivm.yo uef() {
        return this.wrv.gzw() ? ivm.yo.ADS_V3 : ivm.yo.ADS;
    }

    public ivm uef(Context context, String str) {
        if (this.wrv.gzw()) {
            return lw.uef().oa(context, str);
        }
        return lw.uef().yo(context, str);
    }

    public boolean oa(dz dzVar) {
        return dzVar.oa();
    }

    private int oa(Activity activity) {
        return activity.hashCode();
    }

    public void oa(boolean z2) {
        this.wk.set(z2);
    }

    public void uef(String str) {
        this.cz = str;
    }

    public void uef(bcc bccVar) {
        this.dj = bccVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.moa
    public void uef(xs xsVar) {
        String str;
        this.zjm = xsVar;
        if (moa() != null && moa().getWebView() != null) {
            if (TextUtils.isEmpty(this.cz)) {
                this.zjm.uef(102, "url is empty");
                return;
            }
            if (!this.wrv.gzw()) {
                if (!com.bytedance.sdk.component.adexpress.uef.oa.oa.uef(this.uef)) {
                    xs xsVar2 = this.zjm;
                    StringBuilder sb2 = new StringBuilder("data null is ");
                    sb2.append(this.uef == null);
                    xsVar2.uef(103, sb2.toString());
                    return;
                }
            } else if (yo() == 9 && !com.bytedance.sdk.component.adexpress.uef.oa.oa.oa(this.uef)) {
                xs xsVar3 = this.zjm;
                StringBuilder sb3 = new StringBuilder("data null is ");
                sb3.append(this.uef == null);
                xsVar3.uef(103, sb3.toString());
                return;
            }
            this.wrv.lw().uef(this.f24923oa);
            if (this.f24923oa) {
                try {
                    int iRt = this.wrv.rt();
                    if (this.wrv.gzw() && iRt == 1) {
                        this.wrv.yo();
                        str = "javascript:window.SDK_RESET_RENDER();" + ("window.SDK_INJECT_DATA=" + this.wrv.yo() + ";") + "window.SDK_TRIGGER_RENDER();";
                    } else {
                        str = "javascript:window.SDK_RESET_RENDER();window.SDK_TRIGGER_RENDER();";
                    }
                    this.moa.bs();
                    this.wrv.lw();
                    com.bytedance.sdk.component.utils.dz.uef(this.moa.getWebView(), str);
                    return;
                } catch (Exception e7) {
                    lw.uef().lw(this.moa);
                    this.zjm.uef(102, "load exception is " + e7.getMessage());
                    return;
                }
            }
            ivm ivmVarMoa = moa();
            ivmVarMoa.bs();
            this.wrv.lw();
            ivmVarMoa.a_(this.cz);
            return;
        }
        xs xsVar4 = this.zjm;
        StringBuilder sb4 = new StringBuilder("SSWebview null is ");
        sb4.append(moa() == null);
        sb4.append(" or Webview is null");
        xsVar4.uef(102, sb4.toString());
    }

    public void uef(boolean z2) {
        this.cq = z2;
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.dj
    public void uef(final dz dzVar) {
        if (dzVar == null) {
            if (this.zjm != null) {
                this.zjm.uef(105, "renderResult is null");
                return;
            }
            return;
        }
        boolean zOa = oa(dzVar);
        final float fYo = (float) dzVar.yo();
        final float fMoa = (float) dzVar.moa();
        if (yo() == 0 && (fYo <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fMoa <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            if (this.zjm != null) {
                this.zjm.uef(105, "width is " + fYo + "height is " + fMoa);
                return;
            }
            return;
        }
        this.yo = zOa;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            uef(dzVar, fYo, fMoa);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.lw.uef.1
                @Override // java.lang.Runnable
                public void run() {
                    uef.this.uef(dzVar, fYo, fMoa);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(dz dzVar, float f10, float f11) {
        dzVar.zjm();
        boolean z2 = this.yo;
        if (z2 && !this.cq) {
            uef(f10, f11);
            uef(this.lw);
            if (this.zjm != null) {
                this.zjm.uef(moa(), dzVar);
                return;
            }
            return;
        }
        if (!z2) {
            lw.uef().lw(this.moa);
        }
        uef(dzVar.zjm(), dzVar.cz());
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.dj
    public void uef(View view, int i5, com.bytedance.sdk.component.adexpress.yo yoVar) {
        bcc bccVar = this.dj;
        if (bccVar != null) {
            bccVar.uef(view, i5, yoVar);
        }
    }

    private void uef(float f10, float f11) {
        this.wrv.lw().lw();
        if (yo() == 9) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) moa().getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            }
            layoutParams.width = -1;
            layoutParams.height = -1;
            moa().setLayoutParams(layoutParams);
            return;
        }
        int iUef = (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.xs, f10);
        int iUef2 = (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.xs, f11);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) moa().getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(iUef, iUef2);
        }
        layoutParams2.width = iUef;
        layoutParams2.height = iUef2;
        moa().setLayoutParams(layoutParams2);
    }

    private void uef(int i5, String str) {
        if (this.zjm != null) {
            this.zjm.uef(i5, str);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.uef
    public void uef(Activity activity) {
        if (this.dz == 0 || activity == null || activity.hashCode() != this.dz) {
            return;
        }
        xs();
        wrv();
    }

    public void uef(JSONObject jSONObject) {
        this.uef = jSONObject;
    }
}
