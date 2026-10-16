package com.waze.z.a;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class au implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45677a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f45678b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f45679c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f45680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f45681e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f45682f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f45683g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f45684h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ int f45685i;

    public /* synthetic */ au(Modifier modifier, com.waze.main_screen.p.a.b.a.t tVar, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, PaddingValues paddingValues, int i2, int i3, int i4) {
        this.f45685i = i4;
        this.f45680d = modifier;
        this.f45684h = tVar;
        this.f45679c = aVar;
        this.f45681e = aVar2;
        this.f45683g = aVar3;
        this.f45682f = paddingValues;
        this.f45677a = i2;
        this.f45678b = i3;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [h.g.a.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.waze.z.a.c.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.compose.foundation.layout.WindowInsets, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.waze.z.a.c.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [h.g.a.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.compose.foundation.layout.WindowInsets, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.compose.foundation.layout.PaddingValues, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f45685i;
        if (i2 == 0) {
            Composer composer = (Composer) obj;
            ((Integer) obj2).intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f45677a | 1);
            int i3 = this.f45678b;
            Object obj3 = this.f45684h;
            ?? r4 = this.f45683g;
            ?? r3 = this.f45682f;
            ?? r2 = this.f45681e;
            be.h((String) this.f45679c, this.f45680d, r2, r3, r4, (com.waze.design_components.b.d) obj3, composer, iUpdateChangedFlags, i3);
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            Composer composer2 = (Composer) obj;
            ((Integer) obj2).intValue();
            int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.f45677a | 1);
            int i4 = this.f45678b;
            ?? r5 = this.f45683g;
            ?? r42 = this.f45681e;
            Object obj4 = this.f45679c;
            be.E((String) this.f45684h, (com.waze.design_components.b.d) this.f45680d, this.f45682f, (String) obj4, r42, r5, composer2, iUpdateChangedFlags2, i4);
            return h.ab.f48028a;
        }
        if (i2 == 2) {
            Composer composer3 = (Composer) obj;
            ((Integer) obj2).intValue();
            int i5 = this.f45678b;
            int i6 = this.f45677a;
            Object obj5 = this.f45684h;
            ?? r43 = this.f45682f;
            ?? r32 = this.f45680d;
            ?? r22 = this.f45683g;
            return be.j((String) this.f45679c, this.f45681e, r22, r32, r43, (com.waze.design_components.b.d) obj5, i6, i5, composer3);
        }
        if (i2 == 3) {
            Composer composer4 = (Composer) obj;
            ((Integer) obj2).intValue();
            int i7 = this.f45677a;
            int i8 = this.f45678b;
            Object obj6 = this.f45684h;
            ?? r44 = this.f45683g;
            ?? r33 = this.f45680d;
            Object obj7 = this.f45682f;
            com.waze.z.a.c.q.d((String) this.f45679c, (String) this.f45681e, (com.waze.z.a.c.c) obj7, r33, r44, (com.waze.z.a.c.h) obj6, composer4, RecomposeScopeImplKt.updateChangedFlags(i7 | 1), i8);
            return h.ab.f48028a;
        }
        if (i2 != 4) {
            ((Integer) obj2).intValue();
            int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(this.f45677a | 1);
            int i9 = this.f45678b;
            ?? r8 = this.f45682f;
            ?? r7 = this.f45683g;
            ?? r6 = this.f45681e;
            ?? r52 = this.f45679c;
            com.waze.main_screen.p.a.b.a.ab.j(this.f45680d, (com.waze.main_screen.p.a.b.a.t) this.f45684h, r52, r6, r7, r8, (Composer) obj, iUpdateChangedFlags3, i9);
            return h.ab.f48028a;
        }
        Composer composer5 = (Composer) obj;
        ((Integer) obj2).intValue();
        int i10 = this.f45677a;
        int i11 = this.f45678b;
        ?? r53 = this.f45683g;
        Object obj8 = this.f45684h;
        ?? r34 = this.f45681e;
        com.waze.z.a.c.q.c((String) this.f45679c, (com.waze.z.a.c.c) this.f45682f, this.f45680d, r34, (com.waze.z.a.c.h) obj8, r53, composer5, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return h.ab.f48028a;
    }

    public /* synthetic */ au(String str, Modifier modifier, h.g.a.a aVar, WindowInsets windowInsets, h.g.a.q qVar, com.waze.design_components.b.d dVar, int i2, int i3, int i4) {
        this.f45685i = i4;
        this.f45679c = str;
        this.f45680d = modifier;
        this.f45681e = aVar;
        this.f45682f = windowInsets;
        this.f45683g = qVar;
        this.f45684h = dVar;
        this.f45677a = i2;
        this.f45678b = i3;
    }

    public /* synthetic */ au(String str, com.waze.design_components.b.d dVar, Modifier modifier, String str2, h.g.a.a aVar, h.g.a.a aVar2, int i2, int i3, int i4) {
        this.f45685i = i4;
        this.f45684h = str;
        this.f45680d = dVar;
        this.f45682f = modifier;
        this.f45679c = str2;
        this.f45681e = aVar;
        this.f45683g = aVar2;
        this.f45677a = i2;
        this.f45678b = i3;
    }

    public /* synthetic */ au(String str, com.waze.z.a.c.c cVar, com.waze.z.a.c.g gVar, h.g.a.a aVar, com.waze.z.a.c.h hVar, h.g.a.p pVar, int i2, int i3, int i4) {
        this.f45685i = i4;
        this.f45679c = str;
        this.f45682f = cVar;
        this.f45680d = gVar;
        this.f45681e = aVar;
        this.f45684h = hVar;
        this.f45683g = pVar;
        this.f45677a = i2;
        this.f45678b = i3;
    }

    public /* synthetic */ au(String str, h.g.a.a aVar, h.g.a.q qVar, Modifier modifier, WindowInsets windowInsets, com.waze.design_components.b.d dVar, int i2, int i3, int i4) {
        this.f45685i = i4;
        this.f45679c = str;
        this.f45681e = aVar;
        this.f45683g = qVar;
        this.f45680d = modifier;
        this.f45682f = windowInsets;
        this.f45684h = dVar;
        this.f45677a = i2;
        this.f45678b = i3;
    }

    public /* synthetic */ au(String str, String str2, com.waze.z.a.c.c cVar, com.waze.z.a.c.g gVar, h.g.a.a aVar, com.waze.z.a.c.h hVar, int i2, int i3, int i4) {
        this.f45685i = i4;
        this.f45679c = str;
        this.f45681e = str2;
        this.f45682f = cVar;
        this.f45680d = gVar;
        this.f45683g = aVar;
        this.f45684h = hVar;
        this.f45677a = i2;
        this.f45678b = i3;
    }
}
