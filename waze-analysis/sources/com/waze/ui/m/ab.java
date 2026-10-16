package com.waze.ui.m;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class ab implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f42760a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42761b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f42762c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f42763d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f42764e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f42765f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f42766g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ int f42767h;

    public /* synthetic */ ab(Modifier modifier, com.waze.design_components.b.d dVar, com.waze.design_components.b.e eVar, long j2, PaddingValues paddingValues, int i2, int i3, int i4) {
        this.f42767h = i4;
        this.f42763d = modifier;
        this.f42764e = dVar;
        this.f42765f = eVar;
        this.f42760a = j2;
        this.f42766g = paddingValues;
        this.f42761b = i2;
        this.f42762c = i3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.compose.foundation.layout.PaddingValues, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [h.g.a.q, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f42767h != 0) {
            ((Integer) obj2).intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f42761b | 1);
            int i2 = this.f42762c;
            ?? r6 = this.f42765f;
            ?? r5 = this.f42764e;
            long j2 = this.f42760a;
            ?? r2 = this.f42766g;
            com.waze.ui.d.s.j(this.f42763d, r2, j2, r5, r6, (Composer) obj, iUpdateChangedFlags, i2);
            return h.ab.f48028a;
        }
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.f42761b | 1);
        int i3 = this.f42762c;
        ?? r52 = this.f42766g;
        long j3 = this.f42760a;
        Object obj3 = this.f42765f;
        com.waze.ui.l.bh.e(this.f42763d, (com.waze.design_components.b.d) this.f42764e, (com.waze.design_components.b.e) obj3, j3, r52, composer, iUpdateChangedFlags2, i3);
        return h.ab.f48028a;
    }

    public /* synthetic */ ab(h.g.a.a aVar, Modifier modifier, long j2, h.g.a.a aVar2, h.g.a.q qVar, int i2, int i3, int i4) {
        this.f42767h = i4;
        this.f42763d = aVar;
        this.f42766g = modifier;
        this.f42760a = j2;
        this.f42764e = aVar2;
        this.f42765f = qVar;
        this.f42761b = i2;
        this.f42762c = i3;
    }
}
