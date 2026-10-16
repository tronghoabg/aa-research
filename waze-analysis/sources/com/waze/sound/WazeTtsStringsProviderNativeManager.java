package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class WazeTtsStringsProviderNativeManager extends ks implements kq {
    public static final int $stable = 0;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.sound.kq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getTranslatedString(java.lang.String r5, h.c.e<? super java.lang.String> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.waze.sound.kr
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.sound.kr r0 = (com.waze.sound.kr) r0
            int r1 = r0.f40395c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40395c = r1
            goto L18
        L13:
            com.waze.sound.kr r0 = new com.waze.sound.kr
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f40393a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f40395c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r6)
            goto L4a
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r6)
            com.waze.sound.ks r4 = (com.waze.sound.ks) r4
            r0.f40395c = r3
            kotlinx.coroutines.CompletableDeferred r6 = kotlinx.coroutines.bo.j()
            com.waze.r.d r2 = new com.waze.r.d
            r3 = 20
            r2.<init>(r6, r3)
            r4.getTranslationActual(r5, r2)
            java.lang.Object r6 = r6.c(r0)
            if (r6 == r1) goto L5b
        L4a:
            r4 = r6
            java.lang.String r4 = (java.lang.String) r4
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto L59
            int r4 = r4.length()
            if (r4 != 0) goto L58
            goto L59
        L58:
            return r6
        L59:
            r4 = 0
            return r4
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.WazeTtsStringsProviderNativeManager.getTranslatedString(java.lang.String, h.c.e):java.lang.Object");
    }

    public final native String getTranslationActualNTV(String str);

    public final native void initNativeLayerNTV();
}
