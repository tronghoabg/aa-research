package com.airbnb.lottie.b;

import androidx.compose.runtime.MutableState;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class a extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f1945a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f1946b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f1947c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ b f1948d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.airbnb.lottie.h f1949e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f1950f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f1951g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ float f1952h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ t f1953i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ MutableState f1954j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(boolean z, boolean z2, b bVar, com.airbnb.lottie.h hVar, int i2, boolean z3, float f2, t tVar, MutableState mutableState, h.c.e eVar) {
        super(2, eVar);
        this.f1946b = z;
        this.f1947c = z2;
        this.f1948d = bVar;
        this.f1949e = hVar;
        this.f1950f = i2;
        this.f1951g = z3;
        this.f1952h = f2;
        this.f1953i = tVar;
        this.f1954j = mutableState;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new a(this.f1946b, this.f1947c, this.f1948d, this.f1949e, this.f1950f, this.f1951g, this.f1952h, this.f1953i, this.f1954j, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((a) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (android.support.v7.widget.ej.k(r2, r3, r4, r5, r6, null, r2.d(), r9, r12, com.waze.strings.DisplayStrings.DS_REPORT_MENU_V2_ALERTER_SUCCESS_FEEDBACK_WITH_TYPE_PS) == r0) goto L20;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r12.f1945a
            r2 = 1
            if (r1 == 0) goto L11
            if (r1 == r2) goto Ld
            e.b.c.b(r13)
            goto L5b
        Ld:
            e.b.c.b(r13)
            goto L32
        L11:
            e.b.c.b(r13)
            boolean r13 = r12.f1946b
            if (r13 == 0) goto L32
            androidx.compose.runtime.MutableState r13 = r12.f1954j
            boolean r13 = a.a.n(r13)
            if (r13 != 0) goto L32
            boolean r13 = r12.f1947c
            if (r13 == 0) goto L32
            com.airbnb.lottie.b.b r13 = r12.f1948d
            r1 = r12
            h.c.e r1 = (h.c.e) r1
            r12.f1945a = r2
            java.lang.Object r13 = com.airbnb.lottie.b.o.f(r13, r1)
            if (r13 != r0) goto L32
            goto L5a
        L32:
            androidx.compose.runtime.MutableState r13 = r12.f1954j
            boolean r1 = r12.f1946b
            a.a.m(r13, r1)
            if (r1 == 0) goto L5b
            com.airbnb.lottie.b.b r2 = r12.f1948d
            com.airbnb.lottie.h r3 = r12.f1949e
            int r4 = r12.f1950f
            boolean r5 = r12.f1951g
            float r6 = r12.f1952h
            com.airbnb.lottie.b.t r9 = r12.f1953i
            float r8 = r2.d()
            r10 = r12
            h.c.e r10 = (h.c.e) r10
            r13 = 2
            r12.f1945a = r13
            r11 = 514(0x202, float:7.2E-43)
            r7 = 0
            java.lang.Object r12 = android.support.v7.widget.ej.k(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r12 != r0) goto L5b
        L5a:
            return r0
        L5b:
            h.ab r12 = h.ab.f48028a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
