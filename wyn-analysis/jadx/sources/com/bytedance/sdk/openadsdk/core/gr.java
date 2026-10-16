package com.bytedance.sdk.openadsdk.core;

import android.os.Build;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class gr {
    private static final AtomicInteger moa;

    /* renamed from: oa, reason: collision with root package name */
    private static final AtomicInteger f25613oa;
    private static final AtomicInteger uef;
    private static final AtomicInteger yo;

    static {
        AtomicInteger atomicInteger = new AtomicInteger();
        uef = atomicInteger;
        AtomicInteger atomicInteger2 = new AtomicInteger();
        f25613oa = atomicInteger2;
        AtomicInteger atomicInteger3 = new AtomicInteger();
        yo = atomicInteger3;
        AtomicInteger atomicInteger4 = new AtomicInteger();
        moa = atomicInteger4;
        atomicInteger.addAndGet(com.bytedance.sdk.openadsdk.oib.moa.uef.uef("encrypt_statistics_file", "encrypt_success_count", 0));
        atomicInteger2.addAndGet(com.bytedance.sdk.openadsdk.oib.moa.uef.uef("encrypt_statistics_file", "encrypt_fail_count", 0));
        atomicInteger3.addAndGet(com.bytedance.sdk.openadsdk.oib.moa.uef.uef("encrypt_statistics_file", "decrypt_success_count", 0));
        atomicInteger4.addAndGet(com.bytedance.sdk.openadsdk.oib.moa.uef.uef("encrypt_statistics_file", "decrypt_fail_count", 0));
    }

    private static void oa() {
        final int i5 = uef.get();
        final int i10 = f25613oa.get();
        final int i11 = yo.get();
        final int i12 = moa.get();
        com.bytedance.sdk.openadsdk.ab.moa.uef("crypt_v4_statistics", false, new com.bytedance.sdk.openadsdk.ab.oa() { // from class: com.bytedance.sdk.openadsdk.core.gr.1
            @Override // com.bytedance.sdk.openadsdk.ab.oa
            public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("encrypt_success_count", i5);
                    jSONObject.put("encrypt_fail_count", i10);
                    jSONObject.put("decrypt_success_count", i11);
                    jSONObject.put("decrypt_fail_count", i12);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("crypt_v4_statistics").oa(jSONObject.toString());
            }
        });
    }

    public static void uef() {
        try {
            long jUef = com.bytedance.sdk.openadsdk.oib.moa.uef.uef("encrypt_statistics_file", "upload_time_key", 0L);
            if (jUef <= 0 || System.currentTimeMillis() - jUef < 86400000) {
                if (jUef <= 0 || jUef > System.currentTimeMillis()) {
                    com.bytedance.sdk.openadsdk.oib.moa.uef.uef("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
                    return;
                }
                return;
            }
            oa();
            synchronized (gr.class) {
                uef.set(0);
                f25613oa.set(0);
                yo.set(0);
                moa.set(0);
                com.bytedance.sdk.openadsdk.oib.moa.uef.uef("encrypt_statistics_file");
                com.bytedance.sdk.openadsdk.oib.moa.uef.uef("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
            }
        } catch (Throwable unused) {
        }
    }

    public static synchronized void oa(boolean z2) {
        if (z2) {
            com.bytedance.sdk.openadsdk.oib.moa.uef.uef("encrypt_statistics_file", "encrypt_success_count", Integer.valueOf(uef.incrementAndGet()));
        } else {
            com.bytedance.sdk.openadsdk.oib.moa.uef.uef("encrypt_statistics_file", "encrypt_fail_count", Integer.valueOf(f25613oa.incrementAndGet()));
        }
    }

    public static void uef(final int i5, final PangleEncryptConstant.CryptDataScene cryptDataScene, final int i10) {
        com.bytedance.sdk.openadsdk.ab.moa.uef("crypt_v4_fail", false, new com.bytedance.sdk.openadsdk.ab.oa() { // from class: com.bytedance.sdk.openadsdk.core.gr.2
            @Override // com.bytedance.sdk.openadsdk.ab.oa
            public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crypt", i5);
                    jSONObject.put("scene", cryptDataScene.value());
                    jSONObject.put("reason", i10);
                    if (i10 == 6) {
                        jSONObject.put("model", Build.MODEL);
                        jSONObject.put("vendor", Build.MANUFACTURER);
                    }
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("crypt_v4_fail").oa(jSONObject.toString());
            }
        });
    }

    public static synchronized void uef(boolean z2) {
        if (z2) {
            com.bytedance.sdk.openadsdk.oib.moa.uef.uef("encrypt_statistics_file", "decrypt_success_count", Integer.valueOf(yo.incrementAndGet()));
        } else {
            com.bytedance.sdk.openadsdk.oib.moa.uef.uef("encrypt_statistics_file", "decrypt_fail_count", Integer.valueOf(yo.incrementAndGet()));
        }
    }

    public static void uef(JSONObject jSONObject) {
        oa(jSONObject != null && jSONObject.optInt("cypher") == 4);
    }
}
