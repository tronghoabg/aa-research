package com.waze.main_screen.p;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class p implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f27320a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27321b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f27322c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f27323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f27324e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f27325f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f27326g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f27327h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f27328i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ int f27329j;

    public /* synthetic */ p(bm bmVar, com.waze.map.canvas.bj bjVar, bf bfVar, Modifier modifier, h.g.a.l lVar, h.g.a.l lVar2, h.g.a.l lVar3, int i2, int i3, int i4) {
        this.f27329j = i4;
        this.f27323d = bmVar;
        this.f27324e = bjVar;
        this.f27325f = bfVar;
        this.f27320a = modifier;
        this.f27326g = lVar;
        this.f27327h = lVar2;
        this.f27328i = lVar3;
        this.f27321b = i2;
        this.f27322c = i3;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [h.g.a.p, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f27329j == 0) {
            Composer composer = (Composer) obj;
            ((Integer) obj2).intValue();
            int i2 = this.f27322c;
            int i3 = this.f27321b;
            ?? r6 = this.f27328i;
            ?? r5 = this.f27327h;
            ?? r4 = this.f27326g;
            Modifier modifier = this.f27320a;
            Object obj3 = this.f27325f;
            return bi.v((bm) this.f27323d, (com.waze.map.canvas.bj) this.f27324e, (bf) obj3, modifier, r4, r5, r6, i3, i2, composer);
        }
        Composer composer2 = (Composer) obj;
        ((Integer) obj2).intValue();
        int i4 = this.f27321b;
        int i5 = this.f27322c;
        ?? r7 = this.f27328i;
        ?? r62 = this.f27327h;
        Object obj4 = this.f27323d;
        Object obj5 = this.f27324e;
        com.waze.z.a.c.q.f((String) this.f27326g, (com.waze.z.a.c.c) this.f27325f, this.f27320a, (com.waze.z.a.c.h) obj5, (com.waze.z.a.c.f) obj4, r62, r7, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
        return h.ab.f48028a;
    }

    public /* synthetic */ p(String str, com.waze.z.a.c.c cVar, Modifier modifier, com.waze.z.a.c.h hVar, com.waze.z.a.c.f fVar, h.g.a.p pVar, h.g.a.p pVar2, int i2, int i3, int i4) {
        this.f27329j = i4;
        this.f27326g = str;
        this.f27325f = cVar;
        this.f27320a = modifier;
        this.f27324e = hVar;
        this.f27323d = fVar;
        this.f27327h = pVar;
        this.f27328i = pVar2;
        this.f27321b = i2;
        this.f27322c = i3;
    }
}
