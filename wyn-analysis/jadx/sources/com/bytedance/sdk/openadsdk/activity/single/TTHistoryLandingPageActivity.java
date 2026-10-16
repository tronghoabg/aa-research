package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.cz.ivm;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.bs;
import com.bytedance.sdk.openadsdk.common.cq;
import com.bytedance.sdk.openadsdk.common.tpx;
import com.bytedance.sdk.openadsdk.common.wk;
import com.bytedance.sdk.openadsdk.common.wrv;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.oyt;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.widget.uef.ivm;
import com.bytedance.sdk.openadsdk.dz.uef.uef.yo;
import com.bytedance.sdk.openadsdk.moa.yo;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.cz;
import com.bytedance.sdk.openadsdk.utils.dj;
import com.bytedance.sdk.openadsdk.utils.dz;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.bytedance.sdk.openadsdk.utils.km;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class TTHistoryLandingPageActivity extends TTBaseLandingPageActivity {
    private static final LinkedList<WeakReference<Activity>> ivm = new LinkedList<>();

    /* renamed from: ab, reason: collision with root package name */
    private int f25175ab;
    private cq af;
    private Context bcc;
    private String bs;
    private wrv cp;
    private String cq;
    private com.bytedance.sdk.openadsdk.core.ivm.ivm dhk;
    private wk dj;
    private com.bytedance.sdk.openadsdk.common.lw dxx;
    private String dz;
    private ivm.uef fz;
    private ImageView gb;
    private com.bytedance.sdk.openadsdk.dz.uef.uef gem;
    private int gr;
    private ILoader gzw;
    private ImageView km;
    private dz ku;
    private com.bytedance.sdk.openadsdk.core.widget.uef.lw lz;

    /* renamed from: oa, reason: collision with root package name */
    bs f25176oa;
    private com.bytedance.sdk.openadsdk.tpx.uef.uef.yo oib;
    private String orq;
    private boolean oyt;
    private ImageView pu;
    private ImageView swd;
    private gzw sy;
    private String tpx;

    /* renamed from: ue, reason: collision with root package name */
    private int f25177ue;
    com.bytedance.sdk.openadsdk.moa.cq uef;
    private oyt wk;
    private Button wrv;
    private com.bytedance.sdk.component.cz.ivm xs;
    TTAdDislikeToast yo;
    private final AtomicInteger gsd = new AtomicInteger(0);
    private final AtomicInteger rt = new AtomicInteger(0);
    private final AtomicInteger pz = new AtomicInteger(0);
    final AtomicBoolean moa = new AtomicBoolean(false);
    final AtomicBoolean lw = new AtomicBoolean(false);
    private boolean sk = false;
    private long rl = 0;
    private String cop = "DOWNLOAD";

    /* renamed from: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity$1, reason: invalid class name */
    public class AnonymousClass1 implements yo.InterfaceC0120yo {

        /* renamed from: oa, reason: collision with root package name */
        final /* synthetic */ long f25178oa;
        final /* synthetic */ int uef;

        public AnonymousClass1(int i5, long j8) {
            this.uef = i5;
            this.f25178oa = j8;
        }

        @Override // com.bytedance.sdk.openadsdk.dz.uef.uef.yo.InterfaceC0120yo
        public void oa(String str) {
            TTHistoryLandingPageActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.dz.uef.uef.yo.InterfaceC0120yo
        public void uef(final String str) {
            km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.1.1
                @Override // java.lang.Runnable
                public void run() {
                    List<gzw> listOa = com.bytedance.sdk.openadsdk.dz.uef.uef.yo.oa(str);
                    TTHistoryLandingPageActivity.this.sy = (listOa == null || listOa.isEmpty()) ? null : listOa.get(AnonymousClass1.this.uef);
                    if (TTHistoryLandingPageActivity.this.sy == null) {
                        TTHistoryLandingPageActivity.this.finish();
                        return;
                    }
                    TTHistoryLandingPageActivity tTHistoryLandingPageActivity = TTHistoryLandingPageActivity.this;
                    tTHistoryLandingPageActivity.cq = tTHistoryLandingPageActivity.sy.iou();
                    TTHistoryLandingPageActivity tTHistoryLandingPageActivity2 = TTHistoryLandingPageActivity.this;
                    tTHistoryLandingPageActivity2.dz = tTHistoryLandingPageActivity2.sy.em();
                    TTHistoryLandingPageActivity tTHistoryLandingPageActivity3 = TTHistoryLandingPageActivity.this;
                    tTHistoryLandingPageActivity3.orq = tTHistoryLandingPageActivity3.sy.vup();
                    TTHistoryLandingPageActivity tTHistoryLandingPageActivity4 = TTHistoryLandingPageActivity.this;
                    tTHistoryLandingPageActivity4.f25175ab = tTHistoryLandingPageActivity4.sy.cq();
                    TTHistoryLandingPageActivity tTHistoryLandingPageActivity5 = TTHistoryLandingPageActivity.this;
                    tTHistoryLandingPageActivity5.bs = tTHistoryLandingPageActivity5.sy.wrv();
                    try {
                        TTHistoryLandingPageActivity tTHistoryLandingPageActivity6 = TTHistoryLandingPageActivity.this;
                        tTHistoryLandingPageActivity6.setContentView(tTHistoryLandingPageActivity6.ivm());
                        TTHistoryLandingPageActivity.this.yo();
                        TTHistoryLandingPageActivity tTHistoryLandingPageActivity7 = TTHistoryLandingPageActivity.this;
                        tTHistoryLandingPageActivity7.bcc = tTHistoryLandingPageActivity7;
                        if (TTHistoryLandingPageActivity.this.xs != null) {
                            com.bytedance.sdk.openadsdk.core.widget.uef.yo.uef(TTHistoryLandingPageActivity.this.bcc).uef(false).oa(false).uef(TTHistoryLandingPageActivity.this.xs.getWebView());
                        }
                        TTHistoryLandingPageActivity.this.af.uef(true);
                        if (TTHistoryLandingPageActivity.this.xs != null && TTHistoryLandingPageActivity.this.xs.getWebView() != null) {
                            uef uefVar = new uef(TTHistoryLandingPageActivity.this.gr, TTHistoryLandingPageActivity.this.sy, "landingpage", TTHistoryLandingPageActivity.this);
                            TTHistoryLandingPageActivity tTHistoryLandingPageActivity8 = TTHistoryLandingPageActivity.this;
                            tTHistoryLandingPageActivity8.uef = new com.bytedance.sdk.openadsdk.moa.cq(tTHistoryLandingPageActivity8.sy, TTHistoryLandingPageActivity.this.xs.getWebView(), uefVar, TTHistoryLandingPageActivity.this.f25177ue).oa(true);
                            TTHistoryLandingPageActivity tTHistoryLandingPageActivity9 = TTHistoryLandingPageActivity.this;
                            tTHistoryLandingPageActivity9.fz = tTHistoryLandingPageActivity9.uef.uef;
                            TTHistoryLandingPageActivity tTHistoryLandingPageActivity10 = TTHistoryLandingPageActivity.this;
                            tTHistoryLandingPageActivity10.dxx = gb.uef(tTHistoryLandingPageActivity10.sy, TTHistoryLandingPageActivity.this.xs, TTHistoryLandingPageActivity.this.bcc, TTHistoryLandingPageActivity.this.bs);
                            TTHistoryLandingPageActivity tTHistoryLandingPageActivity11 = TTHistoryLandingPageActivity.this;
                            tTHistoryLandingPageActivity11.uef.lw(tTHistoryLandingPageActivity11.sk);
                            TTHistoryLandingPageActivity.this.sy.oib(TTHistoryLandingPageActivity.this.sk);
                        }
                        TTHistoryLandingPageActivity.this.dj();
                        if (TTHistoryLandingPageActivity.this.xs != null) {
                            TTHistoryLandingPageActivity.this.xs.setLandingPage(true);
                            TTHistoryLandingPageActivity.this.xs.setTag("landingpage");
                            TTHistoryLandingPageActivity.this.xs.setMaterialMeta(TTHistoryLandingPageActivity.this.sy.cuu());
                        }
                        TTHistoryLandingPageActivity.this.lw();
                        TTHistoryLandingPageActivity.this.bcc();
                        TTHistoryLandingPageActivity tTHistoryLandingPageActivity12 = TTHistoryLandingPageActivity.this;
                        tTHistoryLandingPageActivity12.ku = com.bytedance.sdk.openadsdk.utils.cz.uef(tTHistoryLandingPageActivity12, new cz.uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.1.1.1
                            @Override // com.bytedance.sdk.openadsdk.utils.cz.uef
                            public void oa() {
                            }

                            @Override // com.bytedance.sdk.openadsdk.utils.cz.uef
                            public View uef() {
                                return TTHistoryLandingPageActivity.this.swd;
                            }
                        });
                        TTHistoryLandingPageActivity.this.ku.uef(0L);
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        yo.uef.uef(jElapsedRealtime - anonymousClass1.f25178oa, TTHistoryLandingPageActivity.this.sy, "landingpage", TTHistoryLandingPageActivity.this.gzw, TTHistoryLandingPageActivity.this.orq);
                    } catch (Throwable unused) {
                        TTHistoryLandingPageActivity.this.finish();
                    }
                }
            });
        }
    }

    public static class oa implements View.OnScrollChangeListener {
        private final WeakReference<com.bytedance.sdk.openadsdk.moa.cq> uef;

        public oa(com.bytedance.sdk.openadsdk.moa.cq cqVar) {
            this.uef = new WeakReference<>(cqVar);
        }

        @Override // android.view.View.OnScrollChangeListener
        public void onScrollChange(View view, int i5, int i10, int i11, int i12) {
            com.bytedance.sdk.openadsdk.moa.cq cqVar = this.uef.get();
            if (cqVar != null) {
                cqVar.oa(i10);
            }
        }
    }

    public static class uef implements com.bytedance.sdk.openadsdk.moa.wrv {
        private final WeakReference<TTHistoryLandingPageActivity> moa;

        /* renamed from: oa, reason: collision with root package name */
        private final gzw f25183oa;
        private final int uef;
        private final String yo;

        public uef(int i5, gzw gzwVar, String str, TTHistoryLandingPageActivity tTHistoryLandingPageActivity) {
            this.uef = i5;
            this.f25183oa = gzwVar;
            this.yo = str;
            this.moa = new WeakReference<>(tTHistoryLandingPageActivity);
        }

        @Override // com.bytedance.sdk.openadsdk.moa.wrv
        public void uef(int i5) {
            TTHistoryLandingPageActivity tTHistoryLandingPageActivity = this.moa.get();
            if (tTHistoryLandingPageActivity != null) {
                yo.uef.uef(this.uef, tTHistoryLandingPageActivity.rt.get(), tTHistoryLandingPageActivity.pz.get(), tTHistoryLandingPageActivity.gsd.get() - tTHistoryLandingPageActivity.pz.get(), this.f25183oa, this.yo, i5);
            }
        }
    }

    public static class yo implements View.OnTouchListener {

        /* renamed from: oa, reason: collision with root package name */
        private final WeakReference<com.bytedance.sdk.openadsdk.common.lw> f25184oa;
        private final WeakReference<com.bytedance.sdk.openadsdk.moa.cq> uef;

        public yo(com.bytedance.sdk.openadsdk.moa.cq cqVar, com.bytedance.sdk.openadsdk.common.lw lwVar) {
            this.uef = new WeakReference<>(cqVar);
            this.f25184oa = new WeakReference<>(lwVar);
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            com.bytedance.sdk.openadsdk.moa.cq cqVar = this.uef.get();
            if (cqVar != null) {
                cqVar.uef(motionEvent);
            }
            com.bytedance.sdk.openadsdk.common.lw lwVar = this.f25184oa.get();
            if (lwVar == null) {
                return false;
            }
            lwVar.uef(motionEvent);
            return false;
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        try {
            super.onConfigurationChanged(configuration);
        } catch (Throwable unused) {
        }
        bcc();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.wk.lw()) {
            finish();
            return;
        }
        try {
            sy.oa(this);
        } catch (Throwable unused) {
        }
        LinkedList<WeakReference<Activity>> linkedList = ivm;
        linkedList.add(new WeakReference<>(this));
        if (linkedList.size() > 30) {
            zjm();
        }
        com.bytedance.sdk.openadsdk.dz.oa.uef(this);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("material_key");
        this.tpx = intent.getStringExtra("landing_url");
        int intExtra = intent.getIntExtra("landing_index", 0);
        if (stringExtra == null || intExtra < 0) {
            finish();
        } else {
            com.bytedance.sdk.openadsdk.dz.uef.uef.yo.uef().uef(stringExtra, new AnonymousClass1(intExtra, jElapsedRealtime));
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Iterator<WeakReference<Activity>> it = ivm.iterator();
        while (it.hasNext()) {
            Activity activity = it.next().get();
            if (activity == this || activity == null) {
                it.remove();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onPause() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onPause();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onResume();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.utils.moa.uef(this, this.sy);
        gzw gzwVar = this.sy;
        if (gzwVar != null) {
            gzwVar.hg(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bcc() {
        gzw gzwVar = this.sy;
        if (gzwVar == null || gzwVar.ykf() != 4) {
            return;
        }
        wk wkVar = this.dj;
        if (wkVar != null) {
            wkVar.setVisibility(0);
        }
        Button button = (Button) findViewById(com.bytedance.sdk.openadsdk.utils.bs.us);
        this.wrv = button;
        if (button != null) {
            uef(cz());
            if (this.oib == null) {
                this.oib = com.bytedance.sdk.openadsdk.tpx.uef.uef.moa.uef(this, TextUtils.isEmpty(this.bs) ? gb.oa(this.f25175ab) : this.bs);
            }
            com.bytedance.sdk.openadsdk.core.yo.uef uefVar = new com.bytedance.sdk.openadsdk.core.yo.uef(this, this.sy, this.bs, this.f25175ab);
            uefVar.uef(false);
            this.wrv.setOnClickListener(uefVar);
            this.wrv.setOnTouchListener(uefVar);
            uefVar.yo(true);
            uefVar.uef(this.oib);
        }
    }

    private void cq() {
        TTAdDislikeToast tTAdDislikeToast = this.yo;
        if (tTAdDislikeToast == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
    }

    private String cz() {
        gzw gzwVar = this.sy;
        if (gzwVar != null && !TextUtils.isEmpty(gzwVar.kik())) {
            this.cop = this.sy.kik();
        }
        return this.cop;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dj() {
        oyt oytVar = new oyt(this);
        this.wk = oytVar;
        oytVar.oa(this.xs).yo(this.cq).moa(this.dz).uef(this.sy).oa(this.f25175ab).uef(this.sy.us()).lw(this.sy.kid()).uef(this.xs).oa("landingpage");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dz() {
        TTAdDislikeToast tTAdDislikeToast;
        if (isFinishing() || (tTAdDislikeToast = this.yo) == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View ivm() {
        com.bytedance.sdk.openadsdk.core.ivm.yo yoVar = new com.bytedance.sdk.openadsdk.core.ivm.yo(this);
        if (Build.VERSION.SDK_INT >= 35) {
            yoVar.setFitsSystemWindows(true);
        }
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar = new com.bytedance.sdk.openadsdk.core.ivm.lw(this);
        lwVar.setOrientation(1);
        yoVar.addView(lwVar, new FrameLayout.LayoutParams(-1, -1));
        this.af = new cq(this, this.sy, this.bs, false);
        View wkVar = new wk(this, new wk.uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.3
            @Override // com.bytedance.sdk.openadsdk.common.wk.uef
            public View uef(Context context) {
                return TTHistoryLandingPageActivity.this.af.moa();
            }
        });
        wkVar.setId(com.bytedance.sdk.openadsdk.utils.bs.wxf);
        lwVar.addView(wkVar, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.ivm.yo yoVar2 = new com.bytedance.sdk.openadsdk.core.ivm.yo(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        lwVar.addView(yoVar2, layoutParams);
        com.bytedance.sdk.component.cz.ivm ivmVar = new com.bytedance.sdk.component.cz.ivm(this, ivm.yo.LANDING_PAGE);
        this.xs = ivmVar;
        ivmVar.setId(com.bytedance.sdk.openadsdk.utils.bs.au);
        yoVar2.addView(ivmVar, new FrameLayout.LayoutParams(-1, -1));
        wk wkVar2 = new wk(this, new wk.uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.4
            @Override // com.bytedance.sdk.openadsdk.common.wk.uef
            public View uef(Context context) {
                return new com.bytedance.sdk.openadsdk.common.bcc(context);
            }
        });
        wkVar2.setId(com.bytedance.sdk.openadsdk.utils.bs.hts);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 81;
        yoVar2.addView(wkVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.ivm.ivm ivmVar2 = new com.bytedance.sdk.openadsdk.core.ivm.ivm(this, null, R.style.Widget.ProgressBar.Horizontal);
        ivmVar2.setId(com.bytedance.sdk.openadsdk.utils.bs.ix);
        ivmVar2.setProgress(1);
        ivmVar2.setVisibility(8);
        ivmVar2.setProgressDrawable(dj.uef(this, "tt_browser_progress_style"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, af.oa(this, 3.0f));
        layoutParams3.gravity = 49;
        yoVar2.addView(ivmVar2, layoutParams3);
        wrv wrvVar = new wrv(this);
        wrvVar.setOnlyLoading(this.oyt);
        wrvVar.setId(520093721);
        yoVar.addView(wrvVar, new FrameLayout.LayoutParams(-1, -1));
        return yoVar;
    }

    private void wrv() {
        try {
            if (this.f25176oa == null) {
                bs bsVar = new bs(this.bcc, this.sy);
                this.f25176oa = bsVar;
                bsVar.setDislikeSource("landing_page");
                this.f25176oa.setCallback(new bs.uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.5
                    @Override // com.bytedance.sdk.openadsdk.common.bs.uef
                    public void oa(View view) {
                        TTHistoryLandingPageActivity.this.moa.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.bs.uef
                    public void uef(View view) {
                        TTHistoryLandingPageActivity.this.moa.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.bs.uef
                    public void uef(FilterWord filterWord) {
                        if (TTHistoryLandingPageActivity.this.lw.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        TTHistoryLandingPageActivity.this.lw.set(true);
                        TTHistoryLandingPageActivity.this.dz();
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            frameLayout.addView(this.f25176oa);
            if (this.yo == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.bcc);
                this.yo = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "LandingPageActivity", th);
        }
    }

    private void zjm() {
        while (true) {
            LinkedList<WeakReference<Activity>> linkedList = ivm;
            if (linkedList.isEmpty()) {
                return;
            }
            Activity activity = linkedList.pollFirst().get();
            if (activity != null && !activity.isFinishing()) {
                activity.finish();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lw() {
        com.bytedance.sdk.openadsdk.core.widget.uef.lw lwVar = new com.bytedance.sdk.openadsdk.core.widget.uef.lw(this.bcc, this.wk, this.cq, this.dxx, this.uef, true) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.12
            @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                try {
                    if (TTHistoryLandingPageActivity.this.dhk != null && !TTHistoryLandingPageActivity.this.isFinishing()) {
                        TTHistoryLandingPageActivity.this.dhk.setVisibility(8);
                    }
                } catch (Throwable unused) {
                }
                if (TTHistoryLandingPageActivity.this.cp != null) {
                    TTHistoryLandingPageActivity.this.cp.oa();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                try {
                    if (TextUtils.isEmpty(TTHistoryLandingPageActivity.this.orq)) {
                        return super.shouldInterceptRequest(webView, str);
                    }
                    TTHistoryLandingPageActivity.this.gsd.incrementAndGet();
                    WebResourceResponseModel webResourceResponseModelUef = com.bytedance.sdk.openadsdk.xs.oa.uef().uef(TTHistoryLandingPageActivity.this.gzw, TTHistoryLandingPageActivity.this.orq, str);
                    if (webResourceResponseModelUef != null && webResourceResponseModelUef.getWebResourceResponse() != null) {
                        TTHistoryLandingPageActivity.this.pz.incrementAndGet();
                        return webResourceResponseModelUef.getWebResourceResponse();
                    }
                    if (webResourceResponseModelUef != null && webResourceResponseModelUef.getMsg() == 2) {
                        TTHistoryLandingPageActivity.this.rt.incrementAndGet();
                    }
                    return super.shouldInterceptRequest(webView, str);
                } catch (Throwable th) {
                    dhk.uef("TTAD.HistoryLandingPageAct", "shouldInterceptRequest url error", th);
                    return super.shouldInterceptRequest(webView, str);
                }
            }
        };
        this.lz = lwVar;
        lwVar.uef(this.sy);
        this.lz.uef("landingpage");
        com.bytedance.sdk.component.cz.ivm ivmVar = this.xs;
        if (ivmVar != null) {
            ivmVar.setWebViewClient(this.lz);
            com.bytedance.sdk.component.cz.ivm ivmVar2 = this.xs;
            if (ivmVar2 != null) {
                ivmVar2.setUserAgentString(com.bytedance.sdk.openadsdk.utils.dhk.uef(ivmVar2.getWebView(), BuildConfig.VERSION_CODE));
            }
            com.bytedance.sdk.component.cz.ivm ivmVar3 = this.xs;
            if (ivmVar3 != null) {
                ivmVar3.setMixedContentMode(0);
            }
        }
        com.bytedance.sdk.openadsdk.moa.yo.uef(this.sy, "landingpage", this.f25177ue);
        com.bytedance.sdk.component.cz.ivm ivmVar4 = this.xs;
        if (ivmVar4 != null) {
            com.bytedance.sdk.openadsdk.utils.gzw.uef(ivmVar4, this.tpx);
            this.xs.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.uef.moa(this.wk, this.uef, this.dxx) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.13
                @Override // com.bytedance.sdk.openadsdk.core.widget.uef.moa, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i5) {
                    super.onProgressChanged(webView, i5);
                    if (TTHistoryLandingPageActivity.this.cp != null) {
                        TTHistoryLandingPageActivity.this.cp.uef(i5);
                    }
                    if (TTHistoryLandingPageActivity.this.dhk != null && !TTHistoryLandingPageActivity.this.isFinishing()) {
                        if (i5 == 100 && TTHistoryLandingPageActivity.this.dhk.isShown()) {
                            TTHistoryLandingPageActivity.this.dhk.setVisibility(8);
                        } else {
                            TTHistoryLandingPageActivity.this.dhk.setProgress(i5);
                        }
                    }
                    if (TTHistoryLandingPageActivity.this.af != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (jCurrentTimeMillis - TTHistoryLandingPageActivity.this.rl >= 200 || i5 == 100) {
                            TTHistoryLandingPageActivity.this.af.uef(webView, TTHistoryLandingPageActivity.this.fz);
                            TTHistoryLandingPageActivity.this.rl = jCurrentTimeMillis;
                        }
                    }
                }

                @Override // android.webkit.WebChromeClient
                public void onReceivedTitle(WebView webView, String str) {
                    super.onReceivedTitle(webView, str);
                    TTHistoryLandingPageActivity.this.af.uef(str);
                    TTHistoryLandingPageActivity.this.af.oa(webView.getUrl());
                    try {
                        if (TextUtils.isEmpty(str)) {
                            str = TTHistoryLandingPageActivity.this.tpx;
                        }
                        TTHistoryLandingPageActivity.this.gem = new com.bytedance.sdk.openadsdk.dz.uef.uef();
                        com.bytedance.sdk.openadsdk.core.model.uef uefVarMoa = TTHistoryLandingPageActivity.this.sy.moa();
                        TTHistoryLandingPageActivity.this.gem.uef(com.bytedance.sdk.openadsdk.dz.uef.uef.yo.uef().yo(TTHistoryLandingPageActivity.this.sy.cd()));
                        TTHistoryLandingPageActivity.this.gem.oa(uefVarMoa.oa());
                        TTHistoryLandingPageActivity.this.gem.yo(String.valueOf(System.currentTimeMillis()));
                        TTHistoryLandingPageActivity.this.gem.lw(webView.getUrl());
                        TTHistoryLandingPageActivity.this.gem.oa(TTHistoryLandingPageActivity.this.sy.bn());
                        TTHistoryLandingPageActivity.this.gem.moa(str);
                        com.bytedance.sdk.openadsdk.dz.uef.uef.yo.uef().uef(TTHistoryLandingPageActivity.this.gem);
                    } catch (Exception e7) {
                        dhk.uef("TTAD.HistoryLandingPageAct", "page start: miabhistory index = " + TTHistoryLandingPageActivity.this.sy.bn() + "model = " + TTHistoryLandingPageActivity.this.gem, e7);
                    }
                }
            });
            if (this.xs.getWebView() != null) {
                this.xs.getWebView().setOnScrollChangeListener(new oa(this.uef));
                this.xs.getWebView().setOnTouchListener(new yo(this.uef, this.dxx) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.14
                    private long lw;
                    private float moa;
                    private float yo;

                    /* renamed from: oa, reason: collision with root package name */
                    private final int f25181oa = sy.oa();
                    private float ivm = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    private float xs = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

                    @Override // com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.yo, android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        try {
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked == 0) {
                                this.yo = motionEvent.getRawX();
                                this.moa = motionEvent.getRawY();
                                this.lw = System.currentTimeMillis();
                            } else if (actionMasked == 2) {
                                float rawX = motionEvent.getRawX();
                                float rawY = motionEvent.getRawY();
                                if (Math.abs(rawX - this.yo) < this.f25181oa) {
                                    Math.abs(rawY - this.moa);
                                }
                                this.ivm += Math.abs(motionEvent.getX() - this.yo);
                                this.xs += Math.abs(motionEvent.getY() - this.moa);
                                System.currentTimeMillis();
                                if (rawY - this.moa > this.f25181oa) {
                                    TTHistoryLandingPageActivity.this.af.uef();
                                }
                                if (rawY - this.moa < (-this.f25181oa)) {
                                    TTHistoryLandingPageActivity.this.af.oa();
                                }
                            }
                        } catch (Throwable th) {
                            Log.e("TTAD.HistoryLandingPageAct", "TouchRecordTool onTouch error", th);
                        }
                        return super.onTouch(view, motionEvent);
                    }
                });
            }
            this.xs.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.2
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j8) {
                    if (TTHistoryLandingPageActivity.this.oib != null) {
                        TTHistoryLandingPageActivity.this.oib.uef(TTHistoryLandingPageActivity.this.sy);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yo() {
        gb.uef(this.sy, this.xs);
        this.dj = (wk) findViewById(com.bytedance.sdk.openadsdk.utils.bs.hts);
        wk wkVar = (wk) findViewById(com.bytedance.sdk.openadsdk.utils.bs.wxf);
        wrv wrvVar = (wrv) findViewById(520093721);
        this.cp = wrvVar;
        if (wrvVar != null) {
            wrvVar.uef(this.sy);
            this.cp.uef();
        }
        if (wkVar != null) {
            wkVar.setVisibility(0);
        }
        ImageView imageView = (ImageView) findViewById(com.bytedance.sdk.openadsdk.utils.bs.hdd);
        this.km = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTHistoryLandingPageActivity.this.xs != null) {
                        if (TTHistoryLandingPageActivity.this.fz != null) {
                            TTHistoryLandingPageActivity.this.fz.uef();
                        }
                        if (TTHistoryLandingPageActivity.this.xs.cz()) {
                            TTHistoryLandingPageActivity.this.xs.zjm();
                            if (TTHistoryLandingPageActivity.this.af != null) {
                                TTHistoryLandingPageActivity.this.af.uef(TTHistoryLandingPageActivity.this.xs.getWebView(), TTHistoryLandingPageActivity.this.fz);
                            }
                        }
                    }
                }
            });
        }
        ImageView imageView2 = (ImageView) findViewById(com.bytedance.sdk.openadsdk.utils.bs.f26138tc);
        this.pu = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTHistoryLandingPageActivity.this.xs == null || !TTHistoryLandingPageActivity.this.xs.dj()) {
                        return;
                    }
                    TTHistoryLandingPageActivity.this.xs.wrv();
                    if (TTHistoryLandingPageActivity.this.af != null) {
                        TTHistoryLandingPageActivity.this.af.uef(TTHistoryLandingPageActivity.this.xs.getWebView(), TTHistoryLandingPageActivity.this.fz);
                    }
                }
            });
        }
        ImageView imageView3 = (ImageView) findViewById(520093716);
        this.swd = imageView3;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTHistoryLandingPageActivity.this.finish();
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.ivm.ivm ivmVar = (com.bytedance.sdk.openadsdk.core.ivm.ivm) findViewById(com.bytedance.sdk.openadsdk.utils.bs.ix);
        this.dhk = ivmVar;
        if (ivmVar != null) {
            ivmVar.setVisibility(0);
        }
        this.gb = (ImageView) findViewById(520093740);
        final tpx tpxVar = new tpx(this, false);
        ImageView imageView4 = this.gb;
        if (imageView4 != null) {
            imageView4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.10
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    tpxVar.setOnMenuItemClickListener(new tpx.uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.10.1
                        @Override // com.bytedance.sdk.openadsdk.common.tpx.uef
                        public void ivm() throws JSONException {
                            TTHistoryLandingPageActivity tTHistoryLandingPageActivity = TTHistoryLandingPageActivity.this;
                            TTWebsiteActivity.uef(tTHistoryLandingPageActivity, tTHistoryLandingPageActivity.sy, TTHistoryLandingPageActivity.this.bs);
                            TTHistoryLandingPageActivity.this.oa("onSelectPrivacy");
                            tpxVar.uef();
                        }

                        @Override // com.bytedance.sdk.openadsdk.common.tpx.uef
                        public void lw() throws JSONException {
                            TTHistoryLandingPageActivity.this.oa();
                            TTHistoryLandingPageActivity.this.oa("onSelectReport");
                            tpxVar.uef();
                        }

                        @Override // com.bytedance.sdk.openadsdk.common.tpx.uef
                        public void moa() throws JSONException {
                            if (TTHistoryLandingPageActivity.this.xs != null) {
                                Intent intent = new Intent("android.intent.action.VIEW");
                                String url = TTHistoryLandingPageActivity.this.xs.getUrl();
                                if (!TextUtils.isEmpty(url)) {
                                    intent.setData(Uri.parse(url));
                                    com.bytedance.sdk.component.utils.oa.uef(TTHistoryLandingPageActivity.this, intent, null);
                                }
                                TTHistoryLandingPageActivity.this.oa("onSelectOpenInBrowser");
                                tpxVar.uef();
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.common.tpx.uef
                        public void oa() throws JSONException {
                            if (TTHistoryLandingPageActivity.this.xs == null || TTHistoryLandingPageActivity.this.xs.getUrl() == null) {
                                return;
                            }
                            if (TTHistoryLandingPageActivity.this.dhk != null) {
                                TTHistoryLandingPageActivity.this.dhk.setVisibility(0);
                                TTHistoryLandingPageActivity.this.dhk.setProgress(0);
                            }
                            TTHistoryLandingPageActivity.this.xs.xs();
                            TTHistoryLandingPageActivity.this.xs.a_(TTHistoryLandingPageActivity.this.xs.getUrl());
                            TTHistoryLandingPageActivity.this.oa("onSelectRetry");
                            tpxVar.uef();
                        }

                        @Override // com.bytedance.sdk.openadsdk.common.tpx.uef
                        public void uef() throws JSONException {
                            if (TTHistoryLandingPageActivity.this.sy != null) {
                                com.bytedance.sdk.openadsdk.dz.uef.uef.yo.uef().uef(TTHistoryLandingPageActivity.this.sy);
                            }
                            com.bytedance.sdk.component.utils.oa.uef(TTHistoryLandingPageActivity.this, new Intent(TTHistoryLandingPageActivity.this, (Class<?>) TTHistoryActivity.class), null);
                            TTHistoryLandingPageActivity.this.oa("onSelectHistory");
                            tpxVar.uef();
                        }

                        @Override // com.bytedance.sdk.openadsdk.common.tpx.uef
                        public void yo() throws JSONException {
                            ClipboardManager clipboardManager;
                            if (TTHistoryLandingPageActivity.this.xs != null) {
                                String url = TTHistoryLandingPageActivity.this.xs.getUrl();
                                if (!TextUtils.isEmpty(url) && (clipboardManager = (ClipboardManager) TTHistoryLandingPageActivity.this.getSystemService("clipboard")) != null) {
                                    clipboardManager.setPrimaryClip(ClipData.newPlainText("URL", url));
                                }
                            }
                            TTHistoryLandingPageActivity.this.oa("onSelectCopyLink");
                            tpxVar.uef();
                        }
                    });
                    tpxVar.uef(view);
                }
            });
        }
        View viewFindViewById = findViewById(com.bytedance.sdk.openadsdk.utils.bs.vep);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.11
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTHistoryLandingPageActivity.this.oa();
                }
            });
        }
    }

    public void oa() {
        if (isFinishing()) {
            return;
        }
        if (this.lw.get()) {
            cq();
            return;
        }
        if (this.f25176oa == null) {
            wrv();
        }
        bs bsVar = this.f25176oa;
        if (bsVar != null) {
            bsVar.uef();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oa(String str) throws JSONException {
        try {
            final JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene", str);
            com.bytedance.sdk.openadsdk.ab.moa.uef("iab_more_options", false, new com.bytedance.sdk.openadsdk.ab.oa() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.6
                @Override // com.bytedance.sdk.openadsdk.ab.oa
                public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                    return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("iab_more_options").oa(jSONObject.toString());
                }
            });
        } catch (JSONException e7) {
            dhk.uef("TTAD.HistoryLandingPageAct", "Failed to put iab_click_time into JSON", e7);
        }
    }

    private void uef(String str) {
        if (TextUtils.isEmpty(str) || this.wrv == null || isFinishing()) {
            return;
        }
        this.wrv.setText(str);
    }

    public static void uef(Context context, String str, String str2, int i5) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) TTHistoryLandingPageActivity.class);
        intent.putExtra("material_key", str);
        intent.putExtra("landing_url", str2);
        intent.putExtra("landing_index", i5);
        com.bytedance.sdk.component.utils.oa.uef(context, intent, null);
    }
}
