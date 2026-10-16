package com.airbnb.lottie.b;

import android.content.Context;
import androidx.compose.runtime.MutableState;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class am extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f1983a;

    /* renamed from: b, reason: collision with root package name */
    int f1984b;

    /* renamed from: c, reason: collision with root package name */
    int f1985c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h.g.a.q f1986d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Context f1987e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ad f1988f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f1989g = "fonts/";

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f1990h = "__LottieInternalDefaultCacheKey__";

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ MutableState f1991i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    am(h.g.a.q qVar, Context context, ad adVar, MutableState mutableState, h.c.e eVar) {
        super(2, eVar);
        this.f1986d = qVar;
        this.f1987e = context;
        this.f1988f = adVar;
        this.f1991i = mutableState;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new am(this.f1986d, this.f1987e, this.f1988f, this.f1991i, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((am) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if (r13 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (((java.lang.Boolean) r13).booleanValue() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
    
        if (r13 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008c -> B:13:0x0027). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0099 -> B:34:0x009b). Please report as a decompilation issue!!! */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            h.c.a.a r1 = h.c.a.a.f48038a
            int r0 = r12.f1985c
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L21
            int r4 = r12.f1984b
            if (r0 == r3) goto L19
            java.lang.Object r0 = r12.f1983a
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            e.b.c.b(r13)     // Catch: java.lang.Throwable -> L15
            goto L8c
        L15:
            r0 = move-exception
            r13 = r0
            goto L9b
        L19:
            java.lang.Object r0 = r12.f1983a
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            e.b.c.b(r13)
            goto L4b
        L21:
            e.b.c.b(r13)
            r13 = 0
            r4 = r13
            r0 = r2
        L27:
            androidx.compose.runtime.MutableState r13 = r12.f1991i
            com.airbnb.lottie.b.w r13 = com.airbnb.lottie.b.an.a(r13)
            boolean r13 = r13.f()
            if (r13 != 0) goto L9d
            if (r4 == 0) goto L53
            h.g.a.q r13 = r12.f1986d
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            h.g.b.x.c(r0)
            r12.f1983a = r0
            r12.f1984b = r4
            r12.f1985c = r3
            java.lang.Object r13 = r13.invoke(r5, r0, r12)
            if (r13 == r1) goto L8b
        L4b:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L9d
        L53:
            android.content.Context r5 = r12.f1987e     // Catch: java.lang.Throwable -> L98
            com.airbnb.lottie.b.ad r6 = r12.f1988f     // Catch: java.lang.Throwable -> L98
            java.lang.String r7 = com.airbnb.lottie.b.an.c(r2)     // Catch: java.lang.Throwable -> L98
            java.lang.String r13 = r12.f1989g     // Catch: java.lang.Throwable -> L98
            java.lang.String r8 = com.airbnb.lottie.b.an.c(r13)     // Catch: java.lang.Throwable -> L98
            java.lang.String r13 = ".ttf"
            java.lang.String r9 = "..ttf"
            r10 = r13
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch: java.lang.Throwable -> L98
            boolean r10 = h.n.o.G(r10)     // Catch: java.lang.Throwable -> L98
            if (r10 == 0) goto L6f
            goto L78
        L6f:
            java.lang.String r10 = "."
            boolean r10 = h.n.o.ah(r13, r10)     // Catch: java.lang.Throwable -> L98
            if (r10 != 0) goto L78
            goto L79
        L78:
            r9 = r13
        L79:
            java.lang.String r10 = r12.f1990h     // Catch: java.lang.Throwable -> L98
            r11 = r12
            h.c.e r11 = (h.c.e) r11     // Catch: java.lang.Throwable -> L98
            r12.f1983a = r0     // Catch: java.lang.Throwable -> L98
            r12.f1984b = r4     // Catch: java.lang.Throwable -> L98
            r13 = 2
            r12.f1985c = r13     // Catch: java.lang.Throwable -> L98
            java.lang.Object r13 = com.airbnb.lottie.b.an.b(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L98
            if (r13 != r1) goto L8c
        L8b:
            return r1
        L8c:
            com.airbnb.lottie.h r13 = (com.airbnb.lottie.h) r13     // Catch: java.lang.Throwable -> L98
            androidx.compose.runtime.MutableState r5 = r12.f1991i     // Catch: java.lang.Throwable -> L98
            com.airbnb.lottie.b.w r5 = com.airbnb.lottie.b.an.a(r5)     // Catch: java.lang.Throwable -> L98
            r5.c(r13)     // Catch: java.lang.Throwable -> L98
            goto L27
        L98:
            r0 = move-exception
            r13 = r0
            r0 = r13
        L9b:
            int r4 = r4 + r3
            goto L27
        L9d:
            androidx.compose.runtime.MutableState r12 = r12.f1991i
            com.airbnb.lottie.b.w r13 = com.airbnb.lottie.b.an.a(r12)
            boolean r13 = r13.e()
            if (r13 != 0) goto Lb2
            if (r0 == 0) goto Lb2
            com.airbnb.lottie.b.w r12 = com.airbnb.lottie.b.an.a(r12)
            r12.d(r0)
        Lb2:
            h.ab r12 = h.ab.f48028a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.b.am.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
