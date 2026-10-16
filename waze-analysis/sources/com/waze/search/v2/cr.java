package com.waze.search.v2;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class cr implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f36286a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f36287b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f36288c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f36289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f36290e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f36291f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ int f36292g;

    public /* synthetic */ cr(BoxScope boxScope, Modifier modifier, a aVar, float f2, h.g.a.l lVar, int i2, int i3) {
        this.f36292g = i3;
        this.f36288c = boxScope;
        this.f36289d = modifier;
        this.f36291f = aVar;
        this.f36286a = f2;
        this.f36290e = lVar;
        this.f36287b = i2;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.compose.foundation.layout.BoxScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlinx.coroutines.b.bm] */
    /* JADX WARN: Type inference failed for: r3v1, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f36292g;
        if (i2 == 0) {
            Composer composer = (Composer) obj;
            ((Integer) obj2).intValue();
            int i3 = this.f36287b;
            ?? r4 = this.f36291f;
            float f2 = this.f36286a;
            ?? r2 = this.f36290e;
            cu.d((com.waze.ui.m.dl) this.f36288c, this.f36289d, r2, f2, r4, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            Composer composer2 = (Composer) obj;
            ((Integer) obj2).intValue();
            int i4 = this.f36287b;
            ?? r42 = this.f36291f;
            ?? r3 = this.f36290e;
            cu.e((fn) this.f36289d, (h) this.f36288c, this.f36286a, r3, r42, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1));
            return h.ab.f48028a;
        }
        if (i2 == 2) {
            Composer composer3 = (Composer) obj;
            ((Integer) obj2).intValue();
            int i5 = this.f36287b;
            ?? r43 = this.f36290e;
            float f3 = this.f36286a;
            Object obj3 = this.f36291f;
            return cu.o(this.f36288c, this.f36289d, (a) obj3, f3, r43, i5, composer3);
        }
        Composer composer4 = (Composer) obj;
        ((Integer) obj2).intValue();
        int i6 = this.f36287b;
        float f4 = this.f36286a;
        ?? r6 = this.f36290e;
        ?? r5 = this.f36291f;
        com.waze.ui.m.dc.k((com.waze.ui.m.dl) this.f36288c, this.f36289d, r5, r6, f4, composer4, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
        return h.ab.f48028a;
    }

    public /* synthetic */ cr(fn fnVar, h hVar, float f2, h.g.a.p pVar, h.g.a.l lVar, int i2, int i3) {
        this.f36292g = i3;
        this.f36289d = fnVar;
        this.f36288c = hVar;
        this.f36286a = f2;
        this.f36290e = pVar;
        this.f36291f = lVar;
        this.f36287b = i2;
    }

    public /* synthetic */ cr(com.waze.ui.m.dl dlVar, h.g.a.a aVar, h.g.a.l lVar, h.g.a.l lVar2, float f2, int i2, int i3) {
        this.f36292g = i3;
        this.f36288c = dlVar;
        this.f36289d = aVar;
        this.f36291f = lVar;
        this.f36290e = lVar2;
        this.f36286a = f2;
        this.f36287b = i2;
    }

    public /* synthetic */ cr(com.waze.ui.m.dl dlVar, h.g.a.l lVar, kotlinx.coroutines.b.bm bmVar, float f2, h.g.a.l lVar2, int i2, int i3) {
        this.f36292g = i3;
        this.f36288c = dlVar;
        this.f36289d = lVar;
        this.f36290e = bmVar;
        this.f36286a = f2;
        this.f36291f = lVar2;
        this.f36287b = i2;
    }
}
