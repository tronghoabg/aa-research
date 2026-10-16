package com.bytedance.sdk.openadsdk.component.reward;

import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.utils.gb;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class wrv {
    private boolean ivm;
    private boolean lw;
    private long moa;

    /* renamed from: oa, reason: collision with root package name */
    private long f25457oa;
    private final uef uef;
    private long yo;

    public interface uef {
        void uef(int i5);
    }

    public wrv(uef uefVar) {
        this.lw = true;
        this.uef = uefVar;
        int iUef = com.bytedance.sdk.openadsdk.gzw.lw.uef("reward_callback_fallback", 0);
        if (iUef != 0) {
            this.lw = false;
            if (iUef == 2) {
                this.ivm = true;
            }
        }
    }

    public static void uef(gzw gzwVar, boolean z2, final int i5) {
        com.bytedance.sdk.openadsdk.moa.yo.uef(System.currentTimeMillis(), gzwVar, gb.uef(gzwVar), z2 ? "reward_callback" : "reward_fail_callback", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.component.reward.wrv.1
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject uef() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("reason", i5);
                    return jSONObject;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    public void moa() {
        if (this.uef != null) {
            long jElapsedRealtime = (this.moa + (this.yo > 0 ? SystemClock.elapsedRealtime() - this.yo : 0L)) / 1000;
            if (this.lw) {
                return;
            }
            if (this.ivm) {
                this.uef.uef(jElapsedRealtime < this.f25457oa ? 4 : 1);
            } else if (jElapsedRealtime >= this.f25457oa) {
                this.uef.uef(1);
            }
        }
    }

    public void oa() {
        if (this.lw) {
            return;
        }
        this.yo = SystemClock.elapsedRealtime();
    }

    public void yo() {
        this.lw = true;
    }

    public void uef(long j8) {
        if (j8 <= this.f25457oa) {
            return;
        }
        this.f25457oa = j8;
    }

    public void uef() {
        if (!this.lw && this.yo > 0) {
            this.moa = (SystemClock.elapsedRealtime() - this.yo) + this.moa;
            this.yo = 0L;
        }
    }
}
