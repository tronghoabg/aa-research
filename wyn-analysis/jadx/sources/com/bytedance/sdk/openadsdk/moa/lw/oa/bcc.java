package com.bytedance.sdk.openadsdk.moa.lw.oa;

import com.bytedance.sdk.component.utils.dhk;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class bcc extends yo {
    private int moa;

    /* renamed from: oa, reason: collision with root package name */
    private long f25952oa;
    private final com.bykv.vk.openvk.uef.uef.uef.yo.yo uef;
    private long yo;

    public bcc(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar) {
        this.uef = yoVar;
    }

    public void oa(long j8) {
        this.yo = j8;
    }

    public void uef(long j8) {
        this.f25952oa = j8;
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
            jSONObject.put("video_start_duration", this.f25952oa);
            jSONObject.put("video_cache_size", this.yo);
            jSONObject.put("is_auto_play", this.moa);
        } catch (Throwable th) {
            dhk.yo("FeedPlayModel", th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.moa.lw.oa.yo
    public void uef(uef uefVar) throws Throwable {
        if (this.uef.gr()) {
            String strLw = this.uef.lw();
            String strBs = this.uef.bs();
            File fileOa = com.bykv.vk.openvk.uef.uef.oa.moa.oa.oa(strLw, strBs);
            File fileYo = com.bykv.vk.openvk.uef.uef.oa.moa.oa.yo(strLw, strBs);
            if (fileYo.exists()) {
                fileOa = fileYo;
            }
            try {
                uefVar.moa().put("moov_box_pos", com.bykv.vk.openvk.uef.uef.uef.xs.moa.uef(fileOa));
            } catch (JSONException unused) {
            }
        }
    }
}
