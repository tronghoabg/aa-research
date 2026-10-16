package com.bytedance.sdk.openadsdk.core.zjm;

import android.content.Context;

/* loaded from: classes3.dex */
public class cz extends com.bytedance.sdk.openadsdk.core.yo.uef {
    public cz(Context context, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, String str, int i5) {
        super(context, gzwVar, str, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    @Override // com.bytedance.sdk.openadsdk.core.yo.oa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.sdk.openadsdk.core.model.wrv uef(float r12, float r13, float r14, float r15, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.yo.yo.uef> r16, long r17, long r19, android.view.View r21, java.lang.String r22, float r23, int r24, float r25, int r26, org.json.JSONObject r27, org.json.JSONObject r28) {
        /*
            r11 = this;
            int[] r0 = com.bytedance.sdk.openadsdk.utils.af.uef(r21)
            r1 = 1
            r2 = 0
            r3 = 2
            if (r0 == 0) goto L3b
            int r4 = r0.length
            if (r4 != r3) goto L3b
            r4 = r0[r2]
            r5 = r0[r1]
            int r6 = r11.oib
            if (r6 != 0) goto L3b
            android.content.Context r6 = r11.moa
            int r12 = com.bytedance.sdk.openadsdk.utils.af.oa(r6, r12)
            int r12 = r12 + r4
            float r12 = (float) r12
            r6 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 - r6
            android.content.Context r7 = r11.moa
            int r13 = com.bytedance.sdk.openadsdk.utils.af.oa(r7, r13)
            int r13 = r13 + r5
            float r13 = (float) r13
            float r13 = r13 - r6
            android.content.Context r7 = r11.moa
            int r7 = com.bytedance.sdk.openadsdk.utils.af.oa(r7, r14)
            int r7 = r7 + r4
            float r4 = (float) r7
            float r4 = r4 - r6
            android.content.Context r7 = r11.moa
            int r7 = com.bytedance.sdk.openadsdk.utils.af.oa(r7, r15)
            int r7 = r7 + r5
            float r5 = (float) r7
            float r5 = r5 - r6
            goto L3d
        L3b:
            r4 = r14
            r5 = r15
        L3d:
            com.bytedance.sdk.openadsdk.core.model.ab r6 = r11.lw
            if (r6 == 0) goto L46
            long r7 = r6.lw
            long r9 = r6.ivm
            goto L4a
        L46:
            r7 = r17
            r9 = r19
        L4a:
            r11.oib = r2
            com.bytedance.sdk.openadsdk.core.model.wrv$uef r2 = new com.bytedance.sdk.openadsdk.core.model.wrv$uef
            r2.<init>()
            com.bytedance.sdk.openadsdk.core.model.wrv$uef r12 = r2.ivm(r12)
            com.bytedance.sdk.openadsdk.core.model.wrv$uef r12 = r12.lw(r13)
            com.bytedance.sdk.openadsdk.core.model.wrv$uef r12 = r12.moa(r4)
            com.bytedance.sdk.openadsdk.core.model.wrv$uef r12 = r12.yo(r5)
            com.bytedance.sdk.openadsdk.core.model.wrv$uef r12 = r12.oa(r7)
            com.bytedance.sdk.openadsdk.core.model.wrv$uef r12 = r12.uef(r9)
            com.bytedance.sdk.openadsdk.core.model.wrv$uef r12 = r12.uef(r0)
            int[] r13 = com.bytedance.sdk.openadsdk.utils.af.yo(r21)
            com.bytedance.sdk.openadsdk.core.model.wrv$uef r12 = r12.oa(r13)
            int r13 = r11.gr
            com.bytedance.sdk.openadsdk.core.model.wrv$uef r12 = r12.moa(r13)
            int r13 = r11.f25836ue
            com.bytedance.sdk.openadsdk.core.model.wrv$uef r12 = r12.lw(r13)
            int r13 = r11.pz
            com.bytedance.sdk.openadsdk.core.model.wrv$uef r12 = r12.ivm(r13)
            com.bytedance.sdk.openadsdk.core.zjm r13 = com.bytedance.sdk.openadsdk.core.zjm.oa()
            boolean r13 = r13.uef()
            if (r13 == 0) goto L92
            goto L93
        L92:
            r1 = r3
        L93:
            com.bytedance.sdk.openadsdk.core.model.wrv$uef r12 = r12.oa(r1)
            r13 = r16
            com.bytedance.sdk.openadsdk.core.model.wrv$uef r12 = r12.uef(r13)
            r13 = r22
            com.bytedance.sdk.openadsdk.core.model.wrv$uef r12 = r12.uef(r13)
            r13 = r23
            com.bytedance.sdk.openadsdk.core.model.wrv$uef r12 = r12.uef(r13)
            r13 = r24
            com.bytedance.sdk.openadsdk.core.model.wrv$uef r12 = r12.yo(r13)
            r13 = r25
            com.bytedance.sdk.openadsdk.core.model.wrv$uef r12 = r12.oa(r13)
            r13 = r26
            com.bytedance.sdk.openadsdk.core.model.wrv$uef r12 = r12.uef(r13)
            r13 = r27
            com.bytedance.sdk.openadsdk.core.model.wrv$uef r12 = r12.uef(r13)
            r13 = r28
            com.bytedance.sdk.openadsdk.core.model.wrv$uef r12 = r12.oa(r13)
            com.bytedance.sdk.openadsdk.core.model.wrv r12 = r12.uef()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.zjm.cz.uef(float, float, float, float, android.util.SparseArray, long, long, android.view.View, java.lang.String, float, int, float, int, org.json.JSONObject, org.json.JSONObject):com.bytedance.sdk.openadsdk.core.model.wrv");
    }

    public void uef(com.bytedance.sdk.openadsdk.core.model.ab abVar) {
        ((com.bytedance.sdk.openadsdk.core.yo.oa) this).lw = abVar;
    }
}
