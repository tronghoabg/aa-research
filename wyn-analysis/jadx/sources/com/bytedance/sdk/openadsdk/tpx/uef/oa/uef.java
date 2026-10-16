package com.bytedance.sdk.openadsdk.tpx.uef.oa;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.ab.oa;
import com.bytedance.sdk.openadsdk.ab.uef.moa;
import com.bytedance.sdk.openadsdk.ab.yo;
import com.bytedance.sdk.openadsdk.core.cq;
import com.bytedance.sdk.openadsdk.core.settings.dj;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.utils.km;
import com.bytedance.sdk.openadsdk.utils.ue;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.unity3d.ads.BuildConfig;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class uef {
    private static volatile uef bcc;
    private volatile Boolean uef = null;

    /* renamed from: oa, reason: collision with root package name */
    private AtomicLong f26099oa = new AtomicLong(0);
    private int yo = 0;
    private String moa = "";
    private final CountDownLatch lw = new CountDownLatch(1);
    private volatile boolean ivm = false;
    private String xs = "";

    private uef() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean yo() {
        if (this.uef == null) {
            synchronized (this) {
                try {
                    if (this.uef == null) {
                        this.uef = Boolean.valueOf(((int) ((Math.random() * 100.0d) + 1.0d)) <= yo.oa("gid_status", 100));
                        if (this.uef.booleanValue()) {
                            try {
                                this.xs = ue.uef();
                            } catch (Throwable unused) {
                                this.xs = BuildConfig.FLAVOR;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.uef.booleanValue();
    }

    public String oa() {
        if (sy.moa().vep() != 1) {
            return this.moa;
        }
        if (km.ivm()) {
            return this.moa;
        }
        if (!this.ivm) {
            try {
                this.lw.await(4L, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                this.ivm = true;
                this.lw.countDown();
                throw th;
            }
            this.ivm = true;
            this.lw.countDown();
        }
        return this.moa;
    }

    public static uef uef() {
        if (bcc == null) {
            synchronized (uef.class) {
                try {
                    if (bcc == null) {
                        bcc = new uef();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return bcc;
    }

    public void uef(boolean z2) {
        if (this.yo == 1 || !TextUtils.isEmpty(this.moa)) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (z2 || this.f26099oa.get() <= jElapsedRealtime) {
            this.f26099oa.set(jElapsedRealtime + 300000);
            final long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            km.uef(new com.bytedance.sdk.component.bcc.oa.yo("pag_gaid") { // from class: com.bytedance.sdk.openadsdk.tpx.uef.oa.uef.1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v5, types: [com.bytedance.sdk.openadsdk.core.yo] */
                /* JADX WARN: Type inference failed for: r4v0 */
                /* JADX WARN: Type inference failed for: r4v1, types: [int] */
                /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
                @Override // java.lang.Runnable
                public void run() {
                    ?? IsLimitAdTrackingEnabled;
                    try {
                        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(sy.uef());
                        if (advertisingIdInfo != null) {
                            IsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
                            if (IsLimitAdTrackingEnabled != 0) {
                                uef.this.yo = 1;
                                uef.this.uef(2, "lmt", SystemClock.elapsedRealtime() - jElapsedRealtime2);
                            }
                            if (IsLimitAdTrackingEnabled == 0) {
                                String id2 = advertisingIdInfo.getId();
                                String str = uef.this.moa;
                                if (TextUtils.isEmpty(id2)) {
                                    uef.this.uef(4, "empty gaid", SystemClock.elapsedRealtime() - jElapsedRealtime2);
                                } else {
                                    uef.this.moa = id2;
                                    uef.this.uef(true, SystemClock.elapsedRealtime() - jElapsedRealtime2);
                                }
                                if (!str.equals(id2)) {
                                    cq.uef();
                                }
                            }
                        } else {
                            IsLimitAdTrackingEnabled = -1;
                        }
                        if (IsLimitAdTrackingEnabled != -1) {
                            com.bytedance.sdk.openadsdk.core.yo.uef().uef("limit_ad_track", IsLimitAdTrackingEnabled);
                        }
                    } finally {
                        try {
                        } finally {
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String oa(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(th.toString());
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                sb2.append("\n\tat ");
                sb2.append(stackTraceElement.toString());
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public void uef(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("gaid", oa());
        } catch (JSONException unused) {
        }
    }

    public void uef(boolean z2, long j8) {
        uef(z2, 0, "", null, j8);
    }

    public void uef(int i5, String str, long j8) {
        uef(false, i5, str, null, j8);
    }

    public void uef(int i5, Throwable th, long j8) {
        uef(false, i5, "", th, j8);
    }

    public void uef(final boolean z2, final int i5, final String str, final Throwable th, final long j8) {
        if ((this.uef == null || this.uef.booleanValue()) && sy.uef() != null) {
            sy.lw().uef(new oa() { // from class: com.bytedance.sdk.openadsdk.tpx.uef.oa.uef.2
                @Override // com.bytedance.sdk.openadsdk.ab.oa
                public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                    if (!uef.this.yo()) {
                        return null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("session_id", uef.this.xs);
                    jSONObject.put("is_success", z2);
                    jSONObject.put("error_code", i5);
                    jSONObject.put("error_msg", TextUtils.isEmpty(str) ? uef.oa(th) : str);
                    jSONObject.put("duration", j8);
                    jSONObject.put("has_setting", dj.oa().ggp() > 0);
                    return moa.oa().uef("gid_status").oa(jSONObject.toString());
                }
            }, false);
        }
    }
}
