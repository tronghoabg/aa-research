package com.airbnb.lottie.b;

import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ai extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.airbnb.lottie.h f1970a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f1971b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f1972c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f1973d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ai(com.airbnb.lottie.h hVar, Context context, String str, String str2, h.c.e eVar) {
        super(2, eVar);
        this.f1970a = hVar;
        this.f1971b = context;
        this.f1972c = str;
        this.f1973d = str2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ai(this.f1970a, this.f1971b, this.f1972c, this.f1973d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ai) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c A[Catch: Exception -> 0x0084, TryCatch #1 {Exception -> 0x0084, blocks: (B:7:0x0048, B:16:0x0075, B:20:0x0080, B:19:0x007c), top: B:30:0x0048 }] */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            e.b.c.b(r7)
            com.airbnb.lottie.h r7 = r6.f1970a
            java.util.Map r7 = r7.n()
            java.util.Collection r7 = r7.values()
            java.util.Iterator r7 = r7.iterator()
        L13:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L97
            java.lang.Object r0 = r7.next()
            com.airbnb.lottie.d.c r0 = (com.airbnb.lottie.d.c) r0
            android.content.Context r1 = r6.f1971b
            h.g.b.x.c(r0)
            java.lang.String r2 = r6.f1972c
            java.lang.String r3 = r6.f1973d
            int r4 = com.airbnb.lottie.b.an.f1992a
            java.lang.String r4 = r0.b()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r4)
            r5.append(r3)
            java.lang.String r2 = r5.toString()
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch: java.lang.Exception -> L90
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r1, r2)     // Catch: java.lang.Exception -> L90
            h.g.b.x.c(r1)     // Catch: java.lang.Exception -> L84
            java.lang.String r2 = r0.d()     // Catch: java.lang.Exception -> L84
            java.lang.String r3 = "getStyle(...)"
            h.g.b.x.e(r2, r3)     // Catch: java.lang.Exception -> L84
            java.lang.String r3 = "Italic"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch: java.lang.Exception -> L84
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch: java.lang.Exception -> L84
            boolean r3 = h.n.o.P(r2, r3)     // Catch: java.lang.Exception -> L84
            java.lang.String r4 = "Bold"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch: java.lang.Exception -> L84
            boolean r2 = h.n.o.P(r2, r4)     // Catch: java.lang.Exception -> L84
            r4 = 0
            if (r3 == 0) goto L6e
            if (r2 == 0) goto L6d
            r4 = 3
            goto L75
        L6d:
            r2 = r4
        L6e:
            if (r3 == 0) goto L72
            r4 = 2
            goto L75
        L72:
            if (r2 == 0) goto L75
            r4 = 1
        L75:
            int r2 = r1.getStyle()     // Catch: java.lang.Exception -> L84
            if (r2 != r4) goto L7c
            goto L80
        L7c:
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r1, r4)     // Catch: java.lang.Exception -> L84
        L80:
            r0.e(r1)     // Catch: java.lang.Exception -> L84
            goto L13
        L84:
            r1 = move-exception
            r0.b()
            r0.d()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            int r0 = com.airbnb.lottie.g.c.f2396a
            goto L13
        L90:
            r0 = move-exception
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            int r0 = com.airbnb.lottie.g.c.f2396a
            goto L13
        L97:
            h.ab r6 = h.ab.f48028a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.b.ai.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
