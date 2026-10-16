package com.bytedance.sdk.openadsdk.common;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.ue;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.utils.km;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class lw implements ue.uef {

    /* renamed from: ab, reason: collision with root package name */
    private boolean f25307ab;
    private float bcc;
    private int cq;
    private int cz;
    private String dhk;
    private boolean dz;
    private moa lw;
    private final com.bytedance.sdk.component.cz.ivm moa;

    /* renamed from: oa, reason: collision with root package name */
    private final boolean f25308oa;
    private int oib;
    private final gzw uef;
    private long wk;
    private WebView yo;
    private long zjm;
    private String ivm = "landingpage";
    private final Handler xs = new ue(com.bytedance.sdk.openadsdk.core.wk.oa().getLooper(), this);
    private final AtomicBoolean dj = new AtomicBoolean(false);
    private Pattern wrv = null;
    private long sy = -1;
    private final List<Integer> bs = new ArrayList();

    public lw(gzw gzwVar, com.bytedance.sdk.component.cz.ivm ivmVar, String str, boolean z2) {
        this.uef = gzwVar;
        this.moa = ivmVar;
        this.f25308oa = z2;
        oa();
    }

    private void bcc() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("loading_show_interval", SystemClock.elapsedRealtime() - this.sy);
            jSONObject.put("loading_show_timestamp", this.wk);
            WebView webView = this.yo;
            jSONObject.put("arbi_current_url", webView != null ? webView.getUrl() : "");
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.moa.yo.uef(this.uef, this.ivm, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ivm() {
        return xs() > 0 && !this.dj.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lw() {
        this.dz = false;
        if (this.dj.getAndSet(true)) {
            return;
        }
        this.zjm = SystemClock.elapsedRealtime();
        this.wk = System.currentTimeMillis();
        bcc();
        if (this.lw == null) {
            return;
        }
        WebView webView = this.yo;
        if (webView != null) {
            this.dhk = webView.getUrl();
        }
        this.lw.setVisibility(0);
        this.lw.uef(this.uef);
        this.lw.uef();
        this.lw.setAlpha(this.bcc);
        this.lw.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.common.lw.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        moa();
        yo();
    }

    private void moa() {
        Handler handler = this.xs;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    private void oa() {
        com.bytedance.sdk.component.cz.ivm ivmVar = this.moa;
        if (ivmVar != null) {
            this.yo = ivmVar.getWebView();
            View arbitrageLoadingView = this.moa.getArbitrageLoadingView();
            if (arbitrageLoadingView instanceof moa) {
                this.lw = (moa) arbitrageLoadingView;
            }
        }
        this.cz = com.bytedance.sdk.openadsdk.core.settings.dj.oa().rt();
        this.bcc = com.bytedance.sdk.openadsdk.core.settings.dj.oa().gr();
    }

    private int xs() {
        try {
            return this.yo.copyBackForwardList().getCurrentIndex() + 1;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public void yo(WebView webView, String str, boolean z2) {
        this.bs.clear();
        this.f25307ab = z2;
        if (z2) {
            this.dz = true;
        }
        this.oib = xs();
    }

    public void uef(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.ivm = str;
    }

    public void uef(WebView webView, String str, boolean z2) {
        if (z2 && ivm()) {
            uef();
        }
    }

    private void yo() {
        Handler handler = this.xs;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(1, this.cz);
        }
    }

    public void uef(WebView webView, String str) {
        gzw gzwVar = this.uef;
        if (gzwVar == null || !com.bytedance.sdk.component.cz.oa.uef(gzwVar.rt().yo(), str)) {
            return;
        }
        this.cq++;
        com.bytedance.sdk.component.utils.cz.oa().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.lw.1
            @Override // java.lang.Runnable
            public void run() {
                if (lw.this.ivm()) {
                    lw.this.uef();
                }
            }
        });
    }

    public void oa(WebView webView, String str, boolean z2) {
        if (!z2 || this.lw == null) {
            return;
        }
        uef(1);
    }

    public void uef(WebView webView, int i5) {
        moa moaVar = this.lw;
        if (moaVar != null) {
            moaVar.uef(i5);
        }
        if (this.f25307ab) {
            if (uef(i5, 30)) {
                uef(30, webView);
            }
            if (uef(i5, 50)) {
                uef(50, webView);
            }
            if (uef(i5, 70)) {
                uef(70, webView);
            }
        }
        if (this.lw == null || i5 != 100) {
            return;
        }
        uef(1);
    }

    public void uef() {
        if (km.ivm()) {
            lw();
        } else {
            com.bytedance.sdk.component.utils.cz.oa().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.lw.2
                @Override // java.lang.Runnable
                public void run() {
                    lw.this.lw();
                }
            });
        }
    }

    private void uef(final int i5) {
        WebView webView = this.yo;
        if (webView != null && i5 == 1) {
            String url = webView.getUrl();
            if (TextUtils.isEmpty(url) || url.equals(this.dhk)) {
                return;
            }
        }
        com.bytedance.sdk.component.utils.cz.oa().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.lw.4
            @Override // java.lang.Runnable
            public void run() {
                if (lw.this.lw != null) {
                    lw.this.dj.set(false);
                    lw.this.lw.uef(lw.this.uef, lw.this.ivm, i5, lw.this.dhk, lw.this.zjm, lw.this.dz, lw.this.cq, lw.this.wk);
                    lw.this.cq = 0;
                }
            }
        });
        moa();
    }

    @Override // com.bytedance.sdk.component.utils.ue.uef
    public void uef(Message message) {
        if (message.what == 1) {
            uef(0);
        }
    }

    public void uef(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.sy = SystemClock.elapsedRealtime();
        }
    }

    private boolean uef(int i5, int i10) {
        if (i5 < i10 || this.bs.contains(Integer.valueOf(i10)) || this.oib < 2) {
            return false;
        }
        this.bs.add(Integer.valueOf(i10));
        return true;
    }

    private void uef(int i5, WebView webView) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("load_progress", i5);
            jSONObject.put("progress_timestamp", System.currentTimeMillis());
            jSONObject.put("arbi_current_url", webView.getUrl());
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.moa.yo.oa(this.uef, this.ivm, jSONObject);
    }
}
