package com.bytedance.sdk.openadsdk.moa.lw.oa;

import android.os.SystemClock;
import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.component.utils.dhk;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ivm extends yo {
    private int moa = 0;

    /* renamed from: oa, reason: collision with root package name */
    private long f25957oa;
    private final com.bykv.vk.openvk.uef.uef.uef.yo.yo uef;
    private long yo;

    public ivm(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar) {
        this.uef = yoVar;
    }

    public void oa(long j8) {
        this.yo = j8;
    }

    public void uef(long j8) {
        this.f25957oa = j8;
    }

    public void uef(int i5) {
        this.moa = i5;
    }

    @Override // com.bytedance.sdk.openadsdk.moa.lw.oa.yo
    public void uef(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("total_duration", this.f25957oa);
            jSONObject.put("buffers_time", this.yo);
            jSONObject.put("video_backup", this.moa);
        } catch (Throwable th) {
            dhk.yo("FeedOverModel", th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.moa.lw.oa.yo
    public void uef(uef uefVar) throws JSONException {
        super.uef(uefVar);
        JSONObject jSONObjectMoa = uefVar.moa();
        if (com.bytedance.sdk.openadsdk.gzw.lw.uef("re_vi_en_le", 0) != 1) {
            return;
        }
        File file = new File(this.uef.lw(), this.uef.bs());
        if (file.exists()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                jSONObjectMoa.put(AppLovinEventTypes.USER_COMPLETED_LEVEL, com.bykv.vk.openvk.uef.uef.uef.xs.moa.uef(file.getAbsolutePath()));
                jSONObjectMoa.put("level_cost_time", SystemClock.elapsedRealtime() - jElapsedRealtime);
            } catch (JSONException unused) {
            }
        }
    }
}
