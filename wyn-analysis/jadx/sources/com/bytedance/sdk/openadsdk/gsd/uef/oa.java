package com.bytedance.sdk.openadsdk.gsd.uef;

import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.bytedance.sdk.openadsdk.utils.km;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class oa {

    /* renamed from: oa, reason: collision with root package name */
    private final gzw f25915oa;
    private int uef = yo.f25919oa;
    private final AtomicBoolean yo = new AtomicBoolean(false);
    private final AtomicBoolean moa = new AtomicBoolean(true);
    private final AtomicInteger lw = new AtomicInteger(0);
    private long ivm = 0;
    private long xs = 0;
    private final Runnable bcc = new Runnable() { // from class: com.bytedance.sdk.openadsdk.gsd.uef.oa.3
        @Override // java.lang.Runnable
        public void run() {
            oa.this.moa();
        }
    };

    public oa(gzw gzwVar) {
        this.f25915oa = gzwVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ivm() {
        if (this.lw.get() != 1 || this.ivm == 0) {
            return;
        }
        Handler handlerUef = uef.uef();
        if (handlerUef != null) {
            handlerUef.removeCallbacks(this.bcc);
        }
        this.xs = (SystemClock.elapsedRealtime() - this.ivm) + this.xs;
        this.ivm = 0L;
        this.lw.set(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lw() {
        if (this.lw.get() == 2) {
            this.ivm = SystemClock.elapsedRealtime();
            Handler handlerUef = uef.uef();
            if (handlerUef != null) {
                handlerUef.postDelayed(this.bcc, this.uef - this.xs);
            }
            this.lw.set(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void moa() {
        if (this.yo.compareAndSet(false, true)) {
            oa();
            final long jElapsedRealtime = (SystemClock.elapsedRealtime() - this.ivm) + this.xs;
            this.xs = jElapsedRealtime;
            km.oa(new com.bytedance.sdk.component.bcc.oa.yo("ev_tracker") { // from class: com.bytedance.sdk.openadsdk.gsd.uef.oa.1
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    String strUef = gb.uef(oa.this.f25915oa);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("ev_wait_time_server", oa.this.f25915oa.atl() * 1000);
                        jSONObject.put("ev_wait_time_client", jElapsedRealtime);
                    } catch (JSONException e7) {
                        dhk.yo("EvTracker", e7.getMessage());
                    }
                    com.bytedance.sdk.openadsdk.moa.yo.oa(oa.this.f25915oa, strUef, oa.this.f25915oa.omp(), jSONObject);
                }
            });
        }
    }

    public void oa() {
        this.lw.set(3);
        Handler handlerUef = uef.uef();
        if (handlerUef != null) {
            handlerUef.removeCallbacks(this.bcc);
        }
    }

    public void uef() {
        if (this.lw.get() != 0) {
            return;
        }
        this.uef = this.f25915oa.atl() * 1000;
        this.lw.set(1);
        this.ivm = SystemClock.elapsedRealtime();
        Handler handlerUef = uef.uef();
        if (handlerUef != null) {
            handlerUef.postDelayed(this.bcc, this.uef);
        }
    }

    public boolean yo() {
        return this.lw.get() == 3;
    }

    public void uef(final int i5) {
        Handler handlerUef;
        if (this.lw.get() == 3 || (handlerUef = uef.uef()) == null) {
            return;
        }
        handlerUef.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gsd.uef.oa.2
            @Override // java.lang.Runnable
            public void run() {
                if (i5 == 4 && oa.this.moa.get()) {
                    oa.this.lw();
                    return;
                }
                int i10 = i5;
                if (i10 == 8) {
                    oa.this.ivm();
                } else if (i10 == 5) {
                    oa.this.moa();
                }
            }
        });
    }

    public void uef(boolean z2) {
        this.moa.set(z2);
    }
}
