package com.bumptech.glide.load.b;

import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3281a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map f3282b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f3283c = f3282b;

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    static {
        /*
            java.lang.String r0 = "http.agent"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto Ld
            goto L3e
        Ld:
            int r1 = r0.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r0.length()
            r2.<init>(r3)
            r3 = 0
        L1b:
            if (r3 >= r1) goto L3a
            char r4 = r0.charAt(r3)
            r5 = 31
            if (r4 > r5) goto L2a
            r5 = 9
            if (r4 != r5) goto L32
            r4 = r5
        L2a:
            r5 = 127(0x7f, float:1.78E-43)
            if (r4 >= r5) goto L32
            r2.append(r4)
            goto L37
        L32:
            r4 = 63
            r2.append(r4)
        L37:
            int r3 = r3 + 1
            goto L1b
        L3a:
            java.lang.String r0 = r2.toString()
        L3e:
            com.bumptech.glide.load.b.w.f3281a = r0
            java.util.HashMap r1 = new java.util.HashMap
            r2 = 2
            r1.<init>(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L5a
            com.bumptech.glide.load.b.x r2 = new com.bumptech.glide.load.b.x
            r2.<init>(r0)
            java.util.List r0 = java.util.Collections.singletonList(r2)
            java.lang.String r2 = "User-Agent"
            r1.put(r2, r0)
        L5a:
            java.util.Map r0 = j$.util.DesugarCollections.unmodifiableMap(r1)
            com.bumptech.glide.load.b.w.f3282b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.b.w.<clinit>():void");
    }

    public final y a() {
        return new y(this.f3283c);
    }
}
