package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.component.utils.oa;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdTransActivity;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.wk;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.fz;
import com.bytedance.sdk.openadsdk.utils.ue;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class moa extends PAGAppOpenAd {
    private boolean bcc;
    private boolean cz;
    private com.bytedance.sdk.openadsdk.uef.moa.oa moa;

    /* renamed from: oa, reason: collision with root package name */
    private final gzw f25345oa;
    private final Context uef;
    private final boolean xs;
    private final AdSlot yo;
    private final AtomicBoolean lw = new AtomicBoolean(false);
    private final String ivm = ue.uef();

    public moa(Context context, gzw gzwVar, boolean z2, AdSlot adSlot) {
        this.uef = context;
        this.f25345oa = gzwVar;
        this.xs = z2;
        this.yo = adSlot;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        gzw gzwVar = this.f25345oa;
        if (gzwVar == null || gzwVar.hjx() == null) {
            return null;
        }
        try {
            return this.f25345oa.hjx().get(str);
        } catch (Throwable th) {
            dhk.yo("TTAppOpenAdImpl", th.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        gzw gzwVar = this.f25345oa;
        if (gzwVar != null) {
            return gzwVar.hjx();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public boolean isReady() {
        return this.f25345oa != null && System.currentTimeMillis() / 1000 <= this.f25345oa.gk();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d3, String str, String str2) {
        if (this.cz) {
            return;
        }
        fz.uef(this.f25345oa, d3, str, str2);
        this.cz = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void setAdInteractionCallback(PAGAppOpenAdInteractionCallback pAGAppOpenAdInteractionCallback) {
        this.moa = new lw(pAGAppOpenAdInteractionCallback);
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void setAdInteractionListener(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.moa = new lw(pAGAppOpenAdInteractionListener);
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void show(Activity activity) {
        int rotation;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        if (this.lw.getAndSet(true)) {
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Cannot be called in a child thread ---- TTAppOpenAdImpl.showAppOpenAd");
        }
        IPBroadcastReceiver.oa(this.uef, this.f25345oa);
        Context contextUef = activity != null ? activity : this.uef;
        if (contextUef == null) {
            contextUef = sy.uef();
        }
        try {
            rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        } catch (Exception unused) {
            rotation = 0;
        }
        Intent intent = this.f25345oa.fz() ? new Intent(contextUef, (Class<?>) TTAppOpenAdTransActivity.class) : new Intent(contextUef, (Class<?>) TTAppOpenAdActivity.class);
        intent.putExtra("orientation_angle", rotation);
        intent.putExtra("ad_source", this.xs ? 1 : 2);
        boolean zCz = com.bytedance.sdk.openadsdk.gzw.lw.cz();
        intent.putExtra("enable_new_arch", zCz);
        cp.uef().lw();
        intent.putExtra("meta_index", cp.uef().uef(this.f25345oa));
        if (zCz) {
            intent.putExtra("single_process_listener_key", this.ivm);
            cp.uef().uef(this.ivm, (String) this.moa);
        } else {
            cp.uef().uef(this.moa);
        }
        this.moa = null;
        intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
        AdSlot adSlot = this.yo;
        if (adSlot != null) {
            long cacheTime = adSlot.getCacheTime();
            if (cacheTime == 0 && this.f25345oa.cl() != null) {
                cacheTime = this.f25345oa.cl().getCacheTime();
            }
            intent.putExtra("cache_time", cacheTime);
        }
        com.bytedance.sdk.component.utils.oa.uef(contextUef, intent, new oa.InterfaceC0066oa() { // from class: com.bytedance.sdk.openadsdk.component.moa.1
            @Override // com.bytedance.sdk.component.utils.oa.InterfaceC0066oa
            public void uef() {
            }

            @Override // com.bytedance.sdk.component.utils.oa.InterfaceC0066oa
            public void uef(Throwable th) {
            }
        });
        wk.oa().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.moa.2
            @Override // java.lang.Runnable
            public void run() {
                if (moa.this.yo != null) {
                    try {
                        if (moa.this.f25345oa == null || gzw.ivm(moa.this.f25345oa) || moa.this.f25345oa.tpq()) {
                            return;
                        }
                        ivm.uef(moa.this.uef).uef(Integer.parseInt(moa.this.yo.getCodeId()), moa.this.f25345oa.ofp());
                    } catch (Throwable unused2) {
                    }
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d3) {
        if (this.bcc) {
            return;
        }
        fz.uef(this.f25345oa, d3);
        this.bcc = true;
    }
}
