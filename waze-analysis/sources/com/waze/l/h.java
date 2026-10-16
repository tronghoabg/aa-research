package com.waze.l;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.waze.car_lib.r.cr;
import com.waze.main_screen.p.a.b.b.am;
import com.waze.search.v2.cu;
import h.ab;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class h implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f25088a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25089b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25090c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f25092e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f25093f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ int f25094g;

    public /* synthetic */ h(Modifier modifier, am amVar, boolean z, h.g.a.a aVar, h.g.a.a aVar2, int i2, int i3) {
        this.f25094g = i3;
        this.f25091d = modifier;
        this.f25092e = amVar;
        this.f25088a = z;
        this.f25093f = aVar;
        this.f25090c = aVar2;
        this.f25089b = i2;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.waze.ui.r.a.c.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.waze.nav_connect.b.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.waze.main_screen.p.a.b.b.am, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.waze.ui.r.a.a.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.waze.ui.r.a.e.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f25094g;
        if (i2 == 0) {
            ((Integer) obj2).intValue();
            int i3 = this.f25089b;
            ?? r4 = this.f25093f;
            ?? r3 = this.f25092e;
            ?? r2 = this.f25091d;
            ?? r1 = this.f25090c;
            return m.e(this.f25088a, r1, r2, r3, r4, i3, (Composer) obj);
        }
        if (i2 == 1) {
            ((Integer) obj2).intValue();
            int i4 = this.f25089b;
            ?? r42 = this.f25093f;
            ?? r32 = this.f25092e;
            ?? r22 = this.f25091d;
            ?? r12 = this.f25090c;
            return m.g(this.f25088a, r12, r22, r32, r42, i4, (Composer) obj);
        }
        if (i2 == 2) {
            ((Integer) obj2).intValue();
            int i5 = this.f25089b;
            ?? r43 = this.f25093f;
            ?? r33 = this.f25092e;
            ?? r23 = this.f25091d;
            ?? r13 = this.f25090c;
            return m.f(this.f25088a, r13, r23, r33, r43, i5, (Composer) obj);
        }
        if (i2 == 3) {
            Composer composer = (Composer) obj;
            ((Integer) obj2).intValue();
            int i6 = this.f25089b;
            ?? r44 = this.f25090c;
            ?? r34 = this.f25093f;
            ?? r24 = this.f25091d;
            cr.d(this.f25088a, this.f25092e, r24, r34, r44, composer, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
            return ab.f48028a;
        }
        if (i2 == 4) {
            Composer composer2 = (Composer) obj;
            ((Integer) obj2).intValue();
            int i7 = this.f25089b;
            ?? r45 = this.f25090c;
            boolean z = this.f25088a;
            ?? r25 = this.f25093f;
            com.waze.main_screen.c.d.e.d(this.f25091d, this.f25092e, r25, z, r45, composer2, RecomposeScopeImplKt.updateChangedFlags(i7 | 1));
            return ab.f48028a;
        }
        if (i2 != 5) {
            Composer composer3 = (Composer) obj;
            ((Integer) obj2).intValue();
            int i8 = this.f25089b;
            ?? r7 = this.f25093f;
            ?? r6 = this.f25090c;
            cu.m(this.f25091d, (com.waze.ui.ac.n) this.f25092e, this.f25088a, r6, r7, composer3, RecomposeScopeImplKt.updateChangedFlags(i8 | 1));
            return ab.f48028a;
        }
        Composer composer4 = (Composer) obj;
        ((Integer) obj2).intValue();
        int i9 = this.f25089b;
        ?? r46 = this.f25090c;
        ?? r35 = this.f25093f;
        boolean z2 = this.f25088a;
        com.waze.main_screen.p.a.b.a.ab.c(this.f25091d, this.f25092e, z2, r35, r46, composer4, RecomposeScopeImplKt.updateChangedFlags(i9 | 1));
        return ab.f48028a;
    }

    public /* synthetic */ h(Modifier modifier, com.waze.nav_connect.b.j jVar, h.g.a.a aVar, boolean z, h.g.a.a aVar2, int i2, int i3) {
        this.f25094g = i3;
        this.f25091d = modifier;
        this.f25092e = jVar;
        this.f25093f = aVar;
        this.f25088a = z;
        this.f25090c = aVar2;
        this.f25089b = i2;
    }

    public /* synthetic */ h(Modifier modifier, com.waze.ui.ac.n nVar, boolean z, h.g.a.l lVar, List list, int i2, int i3) {
        this.f25094g = i3;
        this.f25091d = modifier;
        this.f25092e = nVar;
        this.f25088a = z;
        this.f25090c = lVar;
        this.f25093f = list;
        this.f25089b = i2;
    }

    public /* synthetic */ h(boolean z, com.waze.ui.r.a.c.b bVar, com.waze.ui.r.a.a.q qVar, com.waze.ui.r.a.e.a aVar, h.g.a.p pVar, int i2, int i3) {
        this.f25094g = i3;
        this.f25088a = z;
        this.f25092e = bVar;
        this.f25091d = qVar;
        this.f25093f = aVar;
        this.f25090c = pVar;
        this.f25089b = i2;
    }

    public /* synthetic */ h(boolean z, h.g.a.l lVar, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, int i2, int i3) {
        this.f25094g = i3;
        this.f25088a = z;
        this.f25090c = lVar;
        this.f25091d = aVar;
        this.f25092e = aVar2;
        this.f25093f = aVar3;
        this.f25089b = i2;
    }
}
