package com.waze.sharedrive.g;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.waze.search.v2.cu;
import com.waze.search.v2.dt;
import com.waze.ui.m.dl;
import kotlinx.coroutines.b.bm;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class u implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38735a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38736b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38737c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f38738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f38739e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f38740f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f38741g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f38742h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f38743i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f38744j;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ int f38745k;

    public /* synthetic */ u(dt dtVar, dl dlVar, com.waze.search.v2.h hVar, com.waze.search.v2.b bVar, com.waze.search.v2.b bVar2, bm bmVar, h.g.a.l lVar, h.g.a.l lVar2, h.g.a.p pVar, int i2, int i3) {
        this.f38745k = i3;
        this.f38741g = dtVar;
        this.f38742h = dlVar;
        this.f38739e = hVar;
        this.f38737c = bVar;
        this.f38736b = bVar2;
        this.f38740f = bmVar;
        this.f38743i = lVar;
        this.f38744j = lVar2;
        this.f38738d = pVar;
        this.f38735a = i2;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlinx.coroutines.b.bm] */
    /* JADX WARN: Type inference failed for: r5v2, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [h.g.a.a, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f38745k;
        if (i2 == 0) {
            Composer composer = (Composer) obj;
            ((Integer) obj2).intValue();
            int i3 = this.f38735a;
            ?? r8 = this.f38744j;
            ?? r7 = this.f38743i;
            ?? r6 = this.f38742h;
            ?? r5 = this.f38741g;
            ?? r4 = this.f38740f;
            ?? r3 = this.f38739e;
            return bf.o((com.waze.ui.p.i) this.f38736b, (aa) this.f38737c, this.f38738d, r3, r4, r5, r6, r7, r8, i3, composer);
        }
        if (i2 != 1) {
            Composer composer2 = (Composer) obj;
            ((Integer) obj2).intValue();
            int i4 = this.f38735a;
            ?? r10 = this.f38744j;
            ?? r9 = this.f38743i;
            ?? r82 = this.f38740f;
            ?? r72 = this.f38738d;
            ?? r62 = this.f38742h;
            ?? r52 = this.f38741g;
            ?? r42 = this.f38739e;
            com.waze.ui.z.as.b((com.waze.ui.z.d) this.f38736b, this.f38737c, r42, r52, r62, r72, r82, r9, r10, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1));
            return h.ab.f48028a;
        }
        Composer composer3 = (Composer) obj;
        ((Integer) obj2).intValue();
        int i5 = this.f38735a;
        ?? r83 = this.f38738d;
        ?? r73 = this.f38744j;
        ?? r63 = this.f38743i;
        ?? r53 = this.f38740f;
        Object obj3 = this.f38736b;
        Object obj4 = this.f38737c;
        Object obj5 = this.f38739e;
        cu.h((dt) this.f38741g, (dl) this.f38742h, (com.waze.search.v2.h) obj5, (com.waze.search.v2.b) obj4, (com.waze.search.v2.b) obj3, r53, r63, r73, r83, composer3, RecomposeScopeImplKt.updateChangedFlags(i5 | 1));
        return h.ab.f48028a;
    }

    public /* synthetic */ u(com.waze.ui.p.i iVar, aa aaVar, h.g.a.l lVar, h.g.a.a aVar, h.g.a.l lVar2, h.g.a.a aVar2, h.g.a.a aVar3, h.g.a.a aVar4, h.g.a.a aVar5, int i2, int i3) {
        this.f38745k = i3;
        this.f38736b = iVar;
        this.f38737c = aaVar;
        this.f38738d = lVar;
        this.f38739e = aVar;
        this.f38740f = lVar2;
        this.f38741g = aVar2;
        this.f38742h = aVar3;
        this.f38743i = aVar4;
        this.f38744j = aVar5;
        this.f38735a = i2;
    }

    public /* synthetic */ u(com.waze.ui.z.d dVar, Modifier modifier, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, h.g.a.l lVar, h.g.a.l lVar2, h.g.a.a aVar4, h.g.a.a aVar5, int i2, int i3) {
        this.f38745k = i3;
        this.f38736b = dVar;
        this.f38737c = modifier;
        this.f38739e = aVar;
        this.f38741g = aVar2;
        this.f38742h = aVar3;
        this.f38738d = lVar;
        this.f38740f = lVar2;
        this.f38743i = aVar4;
        this.f38744j = aVar5;
        this.f38735a = i2;
    }
}
