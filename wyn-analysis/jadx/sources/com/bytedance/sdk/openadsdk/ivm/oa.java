package com.bytedance.sdk.openadsdk.ivm;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.bcc;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.ab.moa;
import com.bytedance.sdk.openadsdk.ab.uef.yo;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.wk;
import com.bytedance.sdk.openadsdk.utils.lz;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class oa {
    private static volatile oa uef;

    /* renamed from: oa, reason: collision with root package name */
    private final ConcurrentHashMap<String, com.bytedance.sdk.openadsdk.bs.uef> f25925oa = new ConcurrentHashMap<>();
    private com.bytedance.sdk.openadsdk.bs.uef yo = null;
    private volatile boolean moa = false;
    private volatile HandlerThread lw = null;
    private volatile Handler ivm = null;
    private String xs = "";
    private int bcc = 0;
    private volatile long cz = 0;
    private final Runnable zjm = new Runnable() { // from class: com.bytedance.sdk.openadsdk.ivm.oa.6
        @Override // java.lang.Runnable
        public void run() {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    if (uef.uef().lw()) {
                        Set<String> setKeySet = oa.this.f25925oa.keySet();
                        if (setKeySet.size() > oa.this.bcc) {
                            oa.this.bcc = setKeySet.size();
                        }
                        HashSet hashSet = new HashSet(5);
                        ArrayList arrayList = new ArrayList(setKeySet.size());
                        arrayList.addAll(oa.this.f25925oa.values());
                        Collections.sort(arrayList);
                        for (int i5 = 0; i5 < arrayList.size() && i5 < 5; i5++) {
                            hashSet.add(((com.bytedance.sdk.openadsdk.bs.uef) arrayList.get(i5)).oa());
                        }
                        try {
                            for (String str : setKeySet) {
                                com.bytedance.sdk.openadsdk.bs.uef uefVar = (com.bytedance.sdk.openadsdk.bs.uef) oa.this.f25925oa.get(str);
                                if (uefVar != null) {
                                    JSONObject jSONObjectUef = uefVar.uef(jSONObject2);
                                    if (hashSet.contains(str)) {
                                        jSONObject.put(str, jSONObjectUef);
                                    }
                                }
                            }
                            jSONObject.put("common", jSONObject2);
                        } catch (JSONException e7) {
                            dhk.yo(e7.getMessage(), new Object[0]);
                        }
                    } else {
                        try {
                            if (oa.this.yo != null) {
                                jSONObject.put("common", oa.this.yo.uef(jSONObject2));
                            }
                        } catch (JSONException e10) {
                            dhk.yo(e10.getMessage(), new Object[0]);
                        }
                    }
                } catch (Throwable th) {
                    dhk.yo(th.getMessage(), new Object[0]);
                }
                oa.this.xs = jSONObject.toString();
                oa oaVar = oa.this;
                oaVar.uef(oaVar.zjm, uef.uef().moa());
            } catch (OutOfMemoryError e11) {
                dhk.yo(e11.getMessage(), new Object[0]);
            }
        }
    };

    private oa() {
    }

    private void lw() {
        if (this.moa) {
            return;
        }
        this.moa = true;
        uef(this.zjm, uef.uef().moa());
    }

    private void moa() {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.cz > 10000) {
            moa.uef("track_feature_result", false, new com.bytedance.sdk.openadsdk.ab.oa() { // from class: com.bytedance.sdk.openadsdk.ivm.oa.1
                @Override // com.bytedance.sdk.openadsdk.ab.oa
                public yo uef() throws Exception {
                    oa.this.cz = jElapsedRealtime;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("msg", String.valueOf(oa.this.bcc));
                    return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("track_feature_result").oa(jSONObject.toString());
                }
            });
        }
    }

    private Handler yo() {
        if (this.lw == null || !this.lw.isAlive()) {
            synchronized (wk.class) {
                try {
                    if (this.lw == null || !this.lw.isAlive()) {
                        this.lw = bcc.uef("pag_feature", -1);
                        this.ivm = new Handler(this.lw.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (this.ivm == null) {
            synchronized (wk.class) {
                try {
                    if (this.ivm == null) {
                        this.ivm = new Handler(this.lw.getLooper());
                    }
                } finally {
                }
            }
        }
        return this.ivm;
    }

    public void oa() {
        try {
            if (uef.uef().yo()) {
                uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ivm.oa.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!uef.uef().lw()) {
                            if (oa.this.yo != null) {
                                oa.this.yo.uef();
                            }
                        } else {
                            Iterator it = oa.this.f25925oa.keySet().iterator();
                            while (it.hasNext()) {
                                com.bytedance.sdk.openadsdk.bs.uef uefVar = (com.bytedance.sdk.openadsdk.bs.uef) oa.this.f25925oa.get((String) it.next());
                                if (uefVar != null) {
                                    uefVar.uef();
                                }
                            }
                        }
                    }
                });
            }
        } catch (OutOfMemoryError e7) {
            dhk.yo(e7.getMessage(), new Object[0]);
        }
    }

    private void uef(Runnable runnable) {
        if (lz.uef || runnable == null) {
            return;
        }
        try {
            yo().post(runnable);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(Runnable runnable, long j8) {
        if (lz.uef || runnable == null) {
            return;
        }
        try {
            yo().postDelayed(runnable, j8);
        } catch (Throwable unused) {
        }
    }

    public static oa uef() {
        if (uef == null) {
            synchronized (com.bytedance.sdk.openadsdk.core.yo.class) {
                try {
                    if (uef == null) {
                        uef = new oa();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return uef;
    }

    public void uef(JSONObject jSONObject) {
        if (uef.uef().yo()) {
            try {
                jSONObject.put("feature_data", this.xs);
                moa();
            } catch (JSONException e7) {
                dhk.yo(e7.getMessage(), new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(String str, String str2, String str3) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && uef.uef().yo()) {
                lw();
                if (uef.uef().lw()) {
                    com.bytedance.sdk.openadsdk.bs.uef uefVar = this.f25925oa.get(str2);
                    if (uefVar == null) {
                        uefVar = new com.bytedance.sdk.openadsdk.bs.uef(str2);
                    }
                    uefVar.uef(str, str3);
                    this.f25925oa.put(str2, uefVar);
                    return;
                }
                if (this.yo == null) {
                    this.yo = new com.bytedance.sdk.openadsdk.bs.uef(str2);
                }
                this.yo.uef(str, str3);
            }
        } catch (OutOfMemoryError e7) {
            dhk.yo(e7.getMessage(), new Object[0]);
        }
    }

    public void uef(final String str, final String str2, final String str3, String str4) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !uef.uef().yo()) {
            return;
        }
        if (!"show".equals(str) && !"click".equals(str) && !"dislike".equals(str)) {
            if (uef.uef().sy()) {
                if (TextUtils.isEmpty(str4)) {
                    return;
                }
                if (!"rewarded_video".equals(str4) && !"fullscreen_interstitial_ad".equals(str4) && !"open_ad".equals(str4)) {
                    return;
                }
            }
            if ("feed_play".equals(str) || "feed_pause".equals(str) || "feed_continue".equals(str) || "feed_over".equals(str) || "feed_break".equals(str) || "play_error".equals(str)) {
                uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ivm.oa.3
                    @Override // java.lang.Runnable
                    public void run() {
                        oa.this.uef(str, str2, str3);
                    }
                });
                return;
            }
            return;
        }
        uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ivm.oa.2
            @Override // java.lang.Runnable
            public void run() {
                oa.this.uef(str, str2, str3);
            }
        });
    }

    public void uef(final String str, final gzw gzwVar) {
        if (!TextUtils.isEmpty(str) && uef.uef().yo() && gzw.lw(gzwVar)) {
            if (!uef.uef().sy() || gzwVar.epe() == 8 || gzwVar.epe() == 7 || gzwVar.epe() == 3) {
                if ("videoPercent30".equals(str) || "videoForceBreak".equals(str)) {
                    uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ivm.oa.4
                        @Override // java.lang.Runnable
                        public void run() {
                            String strAu = gzwVar.au();
                            String strOfp = gzwVar.ofp();
                            if (TextUtils.isEmpty(strAu)) {
                                return;
                            }
                            oa.this.uef(str, strAu, strOfp);
                        }
                    });
                }
            }
        }
    }

    public void uef(final String str, final gzw gzwVar, final String str2) {
        if (TextUtils.isEmpty(str) || !uef.uef().yo()) {
            return;
        }
        if ("landingStart".equals(str) || "landingFinish".equals(str) || "landingContinue".equals(str) || "landingPause".equals(str)) {
            uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ivm.oa.5
                @Override // java.lang.Runnable
                public void run() {
                    gzw gzwVar2 = gzwVar;
                    if (gzwVar2 == null || TextUtils.isEmpty(gzwVar2.au())) {
                        return;
                    }
                    oa.this.uef(str, gzwVar.au(), gzwVar.ofp() + str2);
                }
            });
        }
    }
}
