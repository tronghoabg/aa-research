package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.Intent;
import com.bytedance.sdk.component.utils.gr;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class wrv {
    private static final AtomicInteger uef = new AtomicInteger(0);

    /* renamed from: oa, reason: collision with root package name */
    private static final AtomicBoolean f25814oa = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public static void moa() {
        if (uef.getAndIncrement() <= 0) {
            com.bytedance.sdk.openadsdk.utils.km.uef().schedule(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wrv.2
                @Override // java.lang.Runnable
                public void run() {
                    wrv.oa(cq.uef(sy.uef()));
                }
            }, 10000L, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void yo() {
        uef.set(0);
    }

    public static void oa(final String str) {
        if (com.bytedance.sdk.openadsdk.core.dj.oa.uef().lw()) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.km.oa(new com.bytedance.sdk.component.bcc.oa.yo("ipv6") { // from class: com.bytedance.sdk.openadsdk.core.wrv.1
            /* JADX WARN: Removed duplicated region for block: B:61:0x013b  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() throws org.json.JSONException {
                /*
                    Method dump skipped, instructions count: 347
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.wrv.AnonymousClass1.run():void");
            }
        });
    }

    public static class uef implements gr.uef {
        private static final AtomicBoolean uef = new AtomicBoolean(false);

        /* renamed from: oa, reason: collision with root package name */
        private static volatile long f25816oa = -1;

        private uef() {
        }

        public static void uef() {
            if (uef.compareAndSet(false, true)) {
                f25816oa = System.currentTimeMillis();
                com.bytedance.sdk.component.utils.gr.uef(new uef(), sy.uef());
            }
        }

        public void oa() {
            com.bytedance.sdk.component.utils.gr.uef(this);
        }

        @Override // com.bytedance.sdk.component.utils.gr.uef
        public void uef(Context context, Intent intent, boolean z2, int i5) {
            if (System.currentTimeMillis() - f25816oa >= 2000 && i5 != 0) {
                wrv.yo();
                wrv.oa(cq.uef(sy.uef()));
                oa();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void oa(java.lang.String r13, java.lang.String r14, com.bytedance.sdk.component.xs.oa.yo r15, java.util.List<java.lang.String> r16) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.wrv.oa(java.lang.String, java.lang.String, com.bytedance.sdk.component.xs.oa.yo, java.util.List):void");
    }

    public static void uef(String str) {
        AtomicBoolean atomicBoolean = f25814oa;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (!com.bytedance.sdk.component.utils.sy.bcc(sy.uef())) {
                atomicBoolean.set(false);
            } else {
                uef.uef();
                oa(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean oa(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }
}
