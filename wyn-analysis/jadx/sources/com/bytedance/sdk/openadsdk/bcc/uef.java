package com.bytedance.sdk.openadsdk.bcc;

import android.app.Application;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.webkit.WebView;
import cb.AbstractC1593a;
import com.bytedance.sdk.component.adexpress.uef.oa.ivm;
import com.bytedance.sdk.component.cz.ivm;
import com.bytedance.sdk.component.oa;
import com.bytedance.sdk.component.utils.bcc;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.component.utils.gzw;
import com.bytedance.sdk.component.utils.oa;
import com.bytedance.sdk.component.utils.pz;
import com.bytedance.sdk.component.utils.rt;
import com.bytedance.sdk.component.utils.tpx;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.factory.SDKTypeConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGBidCallback;
import com.bytedance.sdk.openadsdk.api.init.PAGBidError;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.bytedance.sdk.openadsdk.core.ab;
import com.bytedance.sdk.openadsdk.core.dxx;
import com.bytedance.sdk.openadsdk.core.dz;
import com.bytedance.sdk.openadsdk.core.fz;
import com.bytedance.sdk.openadsdk.core.settings.dj;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.wk;
import com.bytedance.sdk.openadsdk.core.zjm;
import com.bytedance.sdk.openadsdk.core.zjm.cq;
import com.bytedance.sdk.openadsdk.gsd.oa.xs;
import com.bytedance.sdk.openadsdk.gzw.lw;
import com.bytedance.sdk.openadsdk.moa.uef.oa;
import com.bytedance.sdk.openadsdk.sy.moa;
import com.bytedance.sdk.openadsdk.sy.yo;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.bytedance.sdk.openadsdk.utils.km;
import com.bytedance.sdk.openadsdk.utils.lz;
import com.bytedance.sdk.openadsdk.utils.oib;
import com.bytedance.sdk.openadsdk.utils.orq;
import com.bytedance.sdk.openadsdk.utils.ue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class uef {
    public static final List<PAGSdk.PAGInitCallback> uef = new ArrayList();

    /* renamed from: oa, reason: collision with root package name */
    private static long f25288oa = 0;

    private static void ivm() {
        wk.uef(1);
        try {
            List<PAGSdk.PAGInitCallback> list = uef;
            synchronized (list) {
                try {
                    Iterator<PAGSdk.PAGInitCallback> it = list.iterator();
                    while (it.hasNext()) {
                        PAGSdk.PAGInitCallback next = it.next();
                        if (next != null) {
                            it.remove();
                            next.success();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            yo.oa(new moa() { // from class: com.bytedance.sdk.openadsdk.bcc.uef.8
                @Override // com.bytedance.sdk.openadsdk.sy.moa
                public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                    return AbstractC1593a.f("init");
                }
            });
        } catch (Throwable th2) {
            dhk.yo(th2.getMessage(), new Object[0]);
        }
    }

    private static void lw(final Context context, final InitConfig initConfig) {
        km.uef(new com.bytedance.sdk.component.bcc.oa.yo("init_sync") { // from class: com.bytedance.sdk.openadsdk.bcc.uef.6
            @Override // java.lang.Runnable
            public void run() throws IOException, ClassNotFoundException {
                wk.uef(initConfig.getData());
                lw.uef(context, initConfig.getAppId());
                lw.uef();
                yo.uef();
                yo.oa();
                new bs();
                ivm.uef(orq.uef() * 10);
                oa.uef(context);
                ab.uef().oa();
                com.bytedance.sdk.openadsdk.core.wrv.yo.uef();
                com.bytedance.sdk.openadsdk.core.cq.yo.uef();
                dj.lw = dj.uef(context);
                dj.moa = dj.oa(context);
                xs.oa();
                com.bykv.vk.openvk.uef.uef.oa.uef.uef((JSONObject) lw.uef("video_cache_config", (Object) null, com.bytedance.sdk.openadsdk.gzw.oa.uef));
                com.bykv.vk.openvk.uef.uef.oa.uef.uef(CacheDirFactory.getICacheDir(0));
                dj djVarMoa = sy.moa();
                if (!djVarMoa.vyg()) {
                    synchronized (djVarMoa) {
                        try {
                            if (!djVarMoa.vyg()) {
                                djVarMoa.yo();
                                djVarMoa.pu();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                wk.ivm();
                DeviceUtils.dj();
                uef.uef(context);
                DeviceUtils.uef(context);
                DeviceUtils.dj(context);
                DeviceUtils.wrv(context);
                com.bytedance.sdk.openadsdk.ab.uef.uef();
                com.bytedance.sdk.openadsdk.core.settings.moa.uef();
                com.bytedance.sdk.openadsdk.ab.moa.moa();
                gb.cz(context);
                com.bytedance.sdk.openadsdk.moa.yo.uef();
                uef.lw();
                com.bytedance.sdk.openadsdk.core.wrv.yo.oa();
                com.bytedance.sdk.openadsdk.core.lw.uef.uef().oa();
                com.bytedance.sdk.component.bcc.oa.moa.uef(wk.oa());
                if (com.bytedance.sdk.openadsdk.component.xs.uef.lw()) {
                    com.bytedance.sdk.openadsdk.common.sy.uef().moa();
                }
                com.bytedance.sdk.component.utils.oa.uef(new oa.uef() { // from class: com.bytedance.sdk.openadsdk.bcc.uef.6.1
                    @Override // com.bytedance.sdk.component.utils.oa.uef
                    public boolean oa() {
                        return lw.uef("start_act_asy", 0) == 1;
                    }

                    @Override // com.bytedance.sdk.component.utils.oa.uef
                    public boolean uef() {
                        return lw.uef("start_activity_async", 0) == 1;
                    }

                    @Override // com.bytedance.sdk.component.utils.oa.uef
                    public ExecutorService yo() {
                        return km.cz();
                    }
                });
                gb.yo();
                gzw.uef(new gzw.oa() { // from class: com.bytedance.sdk.openadsdk.bcc.uef.6.2
                    @Override // com.bytedance.sdk.component.utils.gzw.oa
                    public void uef(final String str, boolean z2, final gzw.uef uefVar) {
                        com.bytedance.sdk.openadsdk.ab.moa.uef(str, z2, new com.bytedance.sdk.openadsdk.ab.oa() { // from class: com.bytedance.sdk.openadsdk.bcc.uef.6.2.1
                            @Override // com.bytedance.sdk.openadsdk.ab.oa
                            public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                                return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef(str).oa(uefVar.oa());
                            }
                        });
                    }
                });
                pz.uef(lw.uef("webview_reuse_config", (String) null));
                com.bykv.vk.openvk.uef.uef.oa.uef.uef(lw.uef("video_play_config", (String) null));
                com.bytedance.sdk.openadsdk.ab.yo.uef();
            }
        });
    }

    private static void moa() {
        com.bytedance.sdk.openadsdk.core.yo.uef().uef("uuid", ue.uef());
    }

    public static void oa() {
        sy.moa();
        com.bytedance.sdk.openadsdk.oib.moa.uef.uef("sp_compliance_file", "a", 0);
        com.bytedance.sdk.openadsdk.oib.moa.uef.uef("ttopenadsdk", "a", 0);
        com.bytedance.sdk.openadsdk.oib.moa.uef.uef("sp_global_file", "a", 0);
        com.bytedance.sdk.openadsdk.oib.moa.uef.uef("sp_global_app_id", "a", 0);
        com.bytedance.sdk.openadsdk.oib.moa.uef.uef("tpl_fetch_model", "a", 0);
        com.bytedance.sdk.openadsdk.oib.moa.uef.uef("tt_sp", "a", 0);
        com.bytedance.sdk.openadsdk.oib.moa.uef.uef("pag_sp_bad_par", "did");
        com.bytedance.sdk.openadsdk.oib.moa.uef.uef("pag_sp_bad_par", "gaid");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lw() {
        ShortcutManager shortcutManagerB;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Context contextUef = sy.uef();
                if (contextUef == null || (shortcutManagerB = a.b(contextUef.getSystemService(a.d()))) == null) {
                    return;
                }
                zjm.oa().uef(shortcutManagerB.isRequestPinShortcutSupported());
            } catch (Throwable unused) {
            }
        }
    }

    private static void yo(Context context, InitConfig initConfig) {
        if (TextUtils.isEmpty(initConfig.getPackageName())) {
            com.bytedance.sdk.component.utils.orq.uef((String) null);
            com.bytedance.adsdk.ugeno.xs.moa.uef((String) null);
        } else {
            com.bytedance.sdk.component.utils.orq.uef(initConfig.getPackageName());
            com.bytedance.adsdk.ugeno.xs.moa.uef(initConfig.getPackageName());
        }
        com.bytedance.sdk.openadsdk.oib.uef.uef(context);
        try {
            if (oa(initConfig)) {
                dxx.uef().oa();
                oib.uef();
            }
        } catch (Throwable unused) {
        }
        sy.oa(context);
        cq.uef();
        com.bytedance.sdk.openadsdk.core.cq.yo.uef(context);
    }

    private static void moa(Context context, InitConfig initConfig) {
        if (com.bytedance.sdk.openadsdk.core.settings.xs.uef()) {
            com.bytedance.sdk.openadsdk.xs.oa.yo();
            wk.f25784oa.set(true);
            try {
                com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().uef(new com.bytedance.sdk.openadsdk.zjm.uef());
            } catch (Exception e7) {
                dhk.yo("PAGSdk", e7.getMessage());
            }
            yo(initConfig);
            oa(context, initConfig);
            com.bykv.vk.openvk.uef.uef.uef.yo.uef(context, null);
            com.bykv.vk.openvk.uef.uef.uef.yo.uef(2);
            com.bykv.vk.openvk.uef.uef.uef.yo.uef(com.bytedance.sdk.openadsdk.dhk.oa.oa().yo().bcc());
        }
    }

    public static final void uef() {
        try {
            com.bytedance.sdk.component.oa.uef(new oa.uef() { // from class: com.bytedance.sdk.openadsdk.bcc.uef.1
                @Override // com.bytedance.sdk.component.oa.uef
                public ExecutorService uef() {
                    return km.lw();
                }

                @Override // com.bytedance.sdk.component.oa.uef
                public HandlerThread uef(String str, int i5) {
                    return bcc.uef(str, i5);
                }
            });
            km.uef(new com.bytedance.sdk.component.bcc.oa.yo("tt_init_memory_data") { // from class: com.bytedance.sdk.openadsdk.bcc.uef.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.tpx.uef.oa.uef.uef().uef(false);
                    ApmHelper.initAPM();
                    uef.oa();
                }
            });
            wk.uef(System.currentTimeMillis());
            wk.oa();
            com.bytedance.sdk.component.cz.ivm.setWebViewProvider(new ivm.moa() { // from class: com.bytedance.sdk.openadsdk.bcc.uef.3
                @Override // com.bytedance.sdk.component.cz.ivm.moa
                public WebView uef(Context context, AttributeSet attributeSet, int i5, ivm.yo yoVar) {
                    if (pz.oa(yoVar)) {
                        return pz.oa(context, attributeSet, i5, yoVar);
                    }
                    if (!(context instanceof MutableContextWrapper)) {
                        context = context.getApplicationContext();
                    }
                    try {
                        return i5 == 0 ? new com.bytedance.sdk.component.cz.lw(context, attributeSet) : new com.bytedance.sdk.component.cz.lw(context, attributeSet, i5);
                    } catch (Exception unused) {
                        return i5 == 0 ? new com.bytedance.sdk.component.cz.lw(context, attributeSet) : new com.bytedance.sdk.component.cz.lw(context, attributeSet, i5);
                    }
                }
            });
        } catch (Throwable th) {
            Log.i("PAGSdk", th.getMessage());
        }
    }

    public static void uef(Context context) {
        com.bytedance.sdk.openadsdk.core.uef.uef.uef(context);
        lz.uef();
        af.uef(context);
        moa();
        sy.lw();
        String strUef = com.bytedance.sdk.openadsdk.core.cq.uef(context);
        com.bytedance.sdk.openadsdk.core.wrv.yo.oa(strUef);
        com.bytedance.sdk.openadsdk.moa.uef.oa.uef(strUef, true);
        cq.oa();
        com.bytedance.sdk.openadsdk.core.wk.yo.uef.uef().oa();
    }

    private static void oa(Context context, InitConfig initConfig) {
        wk.uef = true;
        dxx.uef().uef(initConfig.getAppId()).moa(initConfig.getPA()).yo(rt.uef(context)).uef(initConfig.getTitleBarTheme()).yo(initConfig.getAdxId());
        zjm.tpx();
        if (initConfig instanceof PAGConfig) {
            dxx.uef().oa(((PAGConfig) initConfig).getDebugLog() ? 1 : 0);
        }
        cz.uef();
    }

    private static void yo(InitConfig initConfig) {
        if (initConfig == null) {
            return;
        }
        if (!TextUtils.isEmpty(initConfig.getData())) {
            zjm.oa().yo(initConfig.getData());
        }
        zjm.oa().yo(oa(initConfig));
    }

    public static void uef(Context context, InitConfig initConfig, PAGSdk.PAGInitCallback pAGInitCallback) {
        Context applicationContext;
        int pa2;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        f25288oa = jElapsedRealtime;
        wk.yo = jElapsedRealtime;
        sy.oa(context);
        if (pAGInitCallback != null) {
            List<PAGSdk.PAGInitCallback> list = uef;
            synchronized (list) {
                if (!list.contains(pAGInitCallback)) {
                    list.add(pAGInitCallback);
                    if (wk.moa() == 3) {
                        return;
                    }
                }
            }
        }
        if (com.bytedance.sdk.openadsdk.common.ivm.uef()) {
            oa(-1, "DisableSDK is called, interrupt initialization");
            return;
        }
        if (PAGSdk.isInitSuccess()) {
            ivm();
            yo(initConfig);
            return;
        }
        if (initConfig == null) {
            oa(4000, "PAGConfig is null, please check.");
            return;
        }
        wk.uef(3);
        if (com.bytedance.sdk.openadsdk.core.dj.oa.uef().dj() && ((pa2 = initConfig.getPA()) < -1 || pa2 > 1)) {
            oa(10004, com.bytedance.sdk.openadsdk.core.cz.uef(10004));
            return;
        }
        if (context == null) {
            oa(4000, "Context is null, please check. ");
            return;
        }
        if (!(context instanceof Application) && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        yo(context, initConfig);
        try {
            ApmHelper.initApm(context, initConfig.getAppId());
            zjm.uef(new dz() { // from class: com.bytedance.sdk.openadsdk.bcc.uef.4
                @Override // com.bytedance.sdk.openadsdk.core.dz
                public void uef(int i5, String str) {
                    uef.oa(i5, str);
                }
            });
            try {
                com.bytedance.sdk.component.utils.orq.uef(sy.uef(), "tt_ad_logo_txt");
                if (com.bytedance.sdk.component.utils.orq.moa(context, "tt_ad_logo") == 0) {
                    uef(initConfig, pAGInitCallback);
                    return;
                }
                if (PAGSdk.isInitSuccess()) {
                    if (pAGInitCallback != null) {
                        ivm();
                    }
                } else {
                    final com.bytedance.sdk.openadsdk.lw.uef uefVar = new com.bytedance.sdk.openadsdk.lw.uef();
                    SDKTypeConfig.setSdkTypeFactory(new ISDKTypeFactory() { // from class: com.bytedance.sdk.openadsdk.bcc.uef.5
                        @Override // com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory
                        public IADTypeLoaderFactory createADTypeLoaderFactory(String str) {
                            return uefVar;
                        }
                    });
                    uef(context, initConfig);
                }
            } catch (Throwable unused) {
                uef(initConfig, pAGInitCallback);
            }
        } catch (Throwable unused2) {
            oa(4000, "Internal Error, setting exception. ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean oa(InitConfig initConfig) {
        return ((PAGConfig) initConfig).getDebugLog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void oa(int i5, String str) {
        wk.uef(2);
        try {
            List<PAGSdk.PAGInitCallback> list = uef;
            synchronized (list) {
                try {
                    Iterator<PAGSdk.PAGInitCallback> it = list.iterator();
                    while (it.hasNext()) {
                        PAGSdk.PAGInitCallback next = it.next();
                        if (next != null) {
                            it.remove();
                            next.fail(i5, str);
                        }
                    }
                    yo.yo(new moa() { // from class: com.bytedance.sdk.openadsdk.bcc.uef.9
                        @Override // com.bytedance.sdk.openadsdk.sy.moa
                        public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                            return AbstractC1593a.f("init");
                        }
                    });
                } finally {
                }
            }
        } catch (Throwable th) {
            dhk.yo(th.getMessage(), new Object[0]);
        }
    }

    private static void uef(InitConfig initConfig, PAGSdk.PAGInitCallback pAGInitCallback) {
        wk.uef(2);
        if (pAGInitCallback != null) {
            if (initConfig instanceof PAGConfig) {
                oa(4000, "resources not found, if you use aab please call PAGConfig.setPackageName");
            } else {
                oa(4000, "resources not found, if you use aab please call TTAdConfig.setPackageName");
            }
        }
    }

    private static void uef(Context context, InitConfig initConfig) {
        long j8;
        try {
        } catch (Throwable th) {
            th.getMessage();
            dhk.yo("PAGSdk", th.getMessage());
            long jElapsedRealtime = SystemClock.elapsedRealtime() - f25288oa;
            oa(4000, th.getMessage());
            j8 = jElapsedRealtime;
        }
        if (PAGSdk.isInitSuccess()) {
            ivm();
            return;
        }
        moa(context, initConfig);
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - f25288oa;
        ivm();
        lw(context, initConfig);
        j8 = jElapsedRealtime2;
        uef(context, PAGSdk.isInitSuccess(), initConfig, SystemClock.elapsedRealtime() - f25288oa, j8);
    }

    private static void uef(final Context context, final boolean z2, final InitConfig initConfig, final long j8, final long j10) {
        com.bytedance.sdk.openadsdk.ab.moa.uef("pangle_sdk_init", false, new com.bytedance.sdk.openadsdk.ab.oa() { // from class: com.bytedance.sdk.openadsdk.bcc.uef.7
            @Override // com.bytedance.sdk.openadsdk.ab.oa
            public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    boolean zYo = zjm.oa().yo();
                    jSONObject.put("duration", j8);
                    jSONObject.put("sdk_init_time", j10);
                    jSONObject.put("is_async", true);
                    jSONObject.put("is_multi_process", true ^ tpx.uef(context));
                    jSONObject.put("is_debug", uef.oa(initConfig));
                    jSONObject.put("is_use_texture_view", initConfig.isUseTextureView());
                    jSONObject.put("is_activate_init", zYo);
                    jSONObject.put("minSdkVersion", gb.xs(context));
                    jSONObject.put("targetSdkVersion", gb.ivm(context));
                    jSONObject.put("apm_is_init", ApmHelper.isIsInit());
                    jSONObject.put("is_success", z2);
                    jSONObject.put("support_hevc_levels", com.bykv.vk.openvk.uef.uef.uef.xs.moa.uef());
                    zjm.oa().oa(false);
                } catch (Exception e7) {
                    dhk.uef("PAGSdk", "run: ", e7);
                }
                return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("pangle_sdk_init").oa(jSONObject.toString());
            }
        });
    }

    public static void uef(PAGBiddingRequest pAGBiddingRequest, PAGBidCallback pAGBidCallback) {
        if (pAGBidCallback == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.common.ivm.uef()) {
            pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10009, com.bytedance.sdk.openadsdk.core.cz.uef(10009)));
            return;
        }
        if (sy.uef() == null) {
            pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10010, "Context is null, please check."));
            return;
        }
        fz fzVarUef = dxx.uef();
        if (fzVarUef != null) {
            fzVarUef.uef(pAGBiddingRequest, pAGBidCallback);
        } else {
            pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10010, "Internal exception"));
        }
    }
}
