package com.bytedance.sdk.openadsdk.core.widget.uef;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.component.utils.ue;
import com.bytedance.sdk.openadsdk.ab.uef.uef;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.wk;
import com.bytedance.sdk.openadsdk.utils.af;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class ivm implements ue.uef {

    /* renamed from: ab, reason: collision with root package name */
    long f25770ab;
    boolean bcc;
    boolean bs;
    float cq;
    String cz;
    float dj;
    float dz;
    private boolean fz;
    private long ku;
    WebView moa;

    /* renamed from: oa, reason: collision with root package name */
    gzw f25771oa;
    long oib;
    boolean sy;

    /* renamed from: ue, reason: collision with root package name */
    private final boolean f25772ue;
    Context uef;
    float wk;
    float wrv;
    boolean xs;
    int zjm;
    private final Handler gr = new ue(wk.oa().getLooper(), this);
    String yo = "landingpage";
    int ivm = 0;
    private final String pz = ".*\\/serp\\?sc=.*&clkt=\\d+$";
    private final String cp = ".*\\/\\?caf_results=.*&clkt=\\d+$";
    uef gsd = new uef() { // from class: com.bytedance.sdk.openadsdk.core.widget.uef.ivm.1
        @Override // com.bytedance.sdk.openadsdk.core.widget.uef.ivm.uef
        public void uef() {
            ivm ivmVar = ivm.this;
            ivmVar.bcc = true;
            ivmVar.ivm();
            ivm ivmVar2 = ivm.this;
            ivmVar2.uef(2, ivmVar2.cz, ivmVar2.zjm);
        }
    };
    GestureDetector rt = new GestureDetector(sy.uef(), new GestureDetector.SimpleOnGestureListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.uef.ivm.2
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            ivm.this.bs = true;
            return false;
        }
    });
    int lw = sy.moa().tpx();
    Map<Integer, Long> dhk = new HashMap();
    Map<Integer, Float> tpx = new HashMap();
    Map<Integer, Long> orq = new HashMap();
    List<Integer> gzw = new ArrayList();

    public interface uef {
        void uef();
    }

    public ivm(WebView webView, gzw gzwVar, Context context, boolean z2) {
        this.f25771oa = gzwVar;
        this.moa = webView;
        this.uef = context;
        this.f25772ue = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bcc() {
        WebBackForwardList webBackForwardListCopyBackForwardList = this.moa.copyBackForwardList();
        if (webBackForwardListCopyBackForwardList != null) {
            int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
            this.zjm = currentIndex + 1;
            if (this.f25772ue) {
                this.zjm = currentIndex + 2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ivm() {
        if (this.tpx.get(Integer.valueOf(this.zjm)) != null) {
            return;
        }
        float height = this.moa.getHeight() / af.oa(this.uef, this.moa.getContentHeight());
        if (height < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || height > 1.0f) {
            height = 0.0f;
        }
        this.tpx.put(Integer.valueOf(this.zjm), Float.valueOf(height));
    }

    private boolean lw() {
        try {
            int i5 = this.zjm;
            if (i5 != 2 && i5 != 3) {
                return false;
            }
            if (Pattern.matches(".*\\/serp\\?sc=.*&clkt=\\d+$", this.cz)) {
                return true;
            }
            return Pattern.matches(".*\\/\\?caf_results=.*&clkt=\\d+$", this.cz);
        } catch (Throwable th) {
            dhk.yo("WebArbitrageBehavior", th.toString());
            return false;
        }
    }

    private void moa(String str) {
        if (xs()) {
            return;
        }
        com.bytedance.sdk.openadsdk.moa.yo.uef(this.f25771oa, new uef.C0070uef().uef(this.cz).oa(Uri.decode(str)).uef(), this.yo);
    }

    private boolean xs() {
        int i5 = this.ivm + 1;
        this.ivm = i5;
        if (i5 > this.lw) {
            return true;
        }
        return ("landingpage".equals(this.yo) || "landingpage_endcard".equals(this.yo) || "landingpage_split_screen".equals(this.yo) || "landingpage_direct".equals(this.yo) || "landingpage_split_ceiling".equals(this.yo)) ? false : true;
    }

    public void oa(String str) {
        this.cz = str;
        bcc();
        this.dhk.put(Integer.valueOf(this.zjm), Long.valueOf(SystemClock.elapsedRealtime()));
        this.orq.put(Integer.valueOf(this.zjm), Long.valueOf(SystemClock.elapsedRealtime()));
        this.fz = lw();
    }

    public void yo(String str) {
        if (this.xs) {
            this.sy = true;
        }
        if (this.zjm == 1 && !TextUtils.isEmpty(str) && str.contains("query=")) {
            int iIndexOf = str.indexOf("query=") + 6;
            int iIndexOf2 = str.indexOf("&", iIndexOf);
            if (iIndexOf < 0 || iIndexOf2 >= str.length() || iIndexOf2 <= iIndexOf) {
                return;
            }
            moa(str.substring(iIndexOf, iIndexOf2));
        }
    }

    public void uef(String str) {
        this.yo = str;
    }

    public void uef() {
        oa(this.zjm);
    }

    public void uef(int i5) {
        float height = (this.moa.getHeight() + i5) / af.oa(this.uef, this.moa.getContentHeight());
        Float f10 = this.tpx.get(Integer.valueOf(this.zjm));
        if (height > (f10 == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f10.floatValue())) {
            this.tpx.put(Integer.valueOf(this.zjm), Float.valueOf(height));
        }
    }

    public void oa() {
        this.moa.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.uef.ivm.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z2) {
                if (!z2) {
                    ivm ivmVar = ivm.this;
                    if (!ivmVar.bcc) {
                        ivmVar.ivm();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        if (jElapsedRealtime - ivm.this.ku >= 50) {
                            ivm ivmVar2 = ivm.this;
                            ivmVar2.uef(3, ivmVar2.cz, ivmVar2.zjm);
                            ivm.this.ku = jElapsedRealtime;
                            return;
                        }
                        return;
                    }
                    ivmVar.bcc = false;
                }
                if (z2) {
                    ivm.this.bcc();
                    ivm ivmVar3 = ivm.this;
                    ivmVar3.dhk.put(Integer.valueOf(ivmVar3.zjm), Long.valueOf(SystemClock.elapsedRealtime()));
                }
            }
        });
    }

    private void moa() {
        if (xs()) {
            return;
        }
        com.bytedance.sdk.openadsdk.ab.uef.uef uefVarUef = new uef.C0070uef().uef(this.cz).uef(this.zjm).moa(this.dj).lw(this.wrv).ivm(this.wk).xs(this.oib).uef();
        Message messageObtain = Message.obtain();
        messageObtain.what = 100;
        messageObtain.obj = uefVarUef;
        this.gr.sendMessageDelayed(messageObtain, 20L);
    }

    private void oa(int i5) {
        if (xs() || this.gzw.contains(Integer.valueOf(i5))) {
            return;
        }
        this.gzw.add(Integer.valueOf(i5));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.moa.yo.oa(this.f25771oa, new uef.C0070uef().uef(this.cz).uef(this.zjm).zjm(jElapsedRealtime - (this.orq.get(Integer.valueOf(i5)) != null ? r6.longValue() : jElapsedRealtime)).uef(), this.yo);
    }

    public uef yo() {
        return this.gsd;
    }

    private void yo(int i5) {
        if (xs()) {
            return;
        }
        ivm();
        this.xs = true;
        com.bytedance.sdk.openadsdk.ab.uef.uef uefVarUef = new uef.C0070uef().uef(this.cz).uef(this.zjm).uef(this.dj).oa(this.wrv).yo(this.oib).yo(i5).uef();
        try {
            if (this.fz) {
                WebView.HitTestResult hitTestResult = this.moa.getHitTestResult();
                uefVarUef.uef(hitTestResult.getExtra());
                uefVarUef.uef(hitTestResult.getType());
            }
        } catch (Throwable unused) {
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 200;
        messageObtain.obj = uefVarUef;
        this.gr.sendMessageDelayed(messageObtain, 100L);
    }

    public void uef(MotionEvent motionEvent) {
        this.rt.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.dj = motionEvent.getX();
            this.wrv = motionEvent.getY();
            this.f25770ab = SystemClock.elapsedRealtime();
        } else if (action != 1) {
            if (action != 3) {
                return;
            }
            yo(2);
        } else {
            this.oib = SystemClock.elapsedRealtime() - this.f25770ab;
            if (oa(motionEvent)) {
                moa();
            } else {
                yo(1);
            }
        }
    }

    private boolean oa(MotionEvent motionEvent) {
        this.cq = motionEvent.getX();
        float y10 = motionEvent.getY();
        this.dz = y10;
        float f10 = this.wrv;
        if (y10 - f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return false;
        }
        this.wk = y10 - f10;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(int i5, String str, int i10) {
        if (xs()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long l10 = this.dhk.get(Integer.valueOf(i10));
        long jLongValue = l10 != null ? l10.longValue() : jElapsedRealtime;
        Float f10 = this.tpx.get(Integer.valueOf(i10));
        com.bytedance.sdk.openadsdk.moa.yo.yo(this.f25771oa, new uef.C0070uef().uef(str).uef(i10).bcc(jElapsedRealtime - jLongValue).cz(f10 == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f10.floatValue()).oa(i5).uef(), this.yo);
    }

    @Override // com.bytedance.sdk.component.utils.ue.uef
    public void uef(Message message) {
        int i5 = message.what;
        com.bytedance.sdk.openadsdk.ab.uef.uef uefVar = (com.bytedance.sdk.openadsdk.ab.uef.uef) message.obj;
        if (i5 == 100) {
            uefVar.moa(this.bs ? 2 : 1);
            com.bytedance.sdk.openadsdk.moa.yo.moa(this.f25771oa, uefVar, this.yo);
            this.bs = false;
        } else if (i5 == 200) {
            if (this.sy) {
                uef(1, uefVar.yo(), uefVar.moa());
            }
            uefVar.yo(this.sy ? 1 : 0);
            com.bytedance.sdk.openadsdk.moa.yo.lw(this.f25771oa, uefVar, this.yo);
            this.xs = false;
            this.sy = false;
        }
    }
}
