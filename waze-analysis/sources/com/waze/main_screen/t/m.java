package com.waze.main_screen.t;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.waze.car_lib.r.cq;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class m implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f27595a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27596b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27597c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f27598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f27599e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f27600f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f27601g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ int f27602h;

    public /* synthetic */ m(Modifier modifier, am amVar, as asVar, boolean z, h.g.a.a aVar, h.g.a.l lVar, int i2, int i3) {
        this.f27602h = i3;
        this.f27597c = modifier;
        this.f27598d = amVar;
        this.f27599e = asVar;
        this.f27595a = z;
        this.f27600f = aVar;
        this.f27601g = lVar;
        this.f27596b = i2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.waze.ui.r.a.c.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.waze.as.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.waze.ui.r.a.a.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.waze.ui.r.a.c.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.waze.ui.r.a.e.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.waze.ui.r.a.a.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.waze.ui.r.a.e.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [h.g.a.p, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f27602h;
        if (i2 == 0) {
            Composer composer = (Composer) obj;
            ((Integer) obj2).intValue();
            int i3 = this.f27596b;
            ?? r5 = this.f27601g;
            ?? r4 = this.f27600f;
            boolean z = this.f27595a;
            Object obj3 = this.f27599e;
            return al.o(this.f27597c, (am) this.f27598d, (as) obj3, z, r4, r5, i3, composer);
        }
        if (i2 != 1) {
            Composer composer2 = (Composer) obj;
            ((Integer) obj2).intValue();
            int i4 = this.f27596b;
            ?? r7 = this.f27601g;
            ?? r6 = this.f27599e;
            ?? r52 = this.f27597c;
            Object obj4 = this.f27600f;
            com.waze.ui.r.a.e.e.f(this.f27595a, this.f27598d, (com.waze.ui.r.a.e.b.a) obj4, r52, r6, r7, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1));
            return h.ab.f48028a;
        }
        Composer composer3 = (Composer) obj;
        ((Integer) obj2).intValue();
        int i5 = this.f27596b;
        ?? r53 = this.f27601g;
        ?? r42 = this.f27600f;
        ?? r3 = this.f27598d;
        ?? r2 = this.f27597c;
        cq.k(this.f27595a, this.f27599e, r2, r3, r42, r53, composer3, RecomposeScopeImplKt.updateChangedFlags(i5 | 1));
        return h.ab.f48028a;
    }

    public /* synthetic */ m(boolean z, com.waze.ui.r.a.c.b bVar, com.waze.as.a aVar, com.waze.ui.r.a.a.q qVar, com.waze.ui.r.a.e.a aVar2, h.g.a.p pVar, int i2, int i3) {
        this.f27602h = i3;
        this.f27595a = z;
        this.f27599e = bVar;
        this.f27597c = aVar;
        this.f27598d = qVar;
        this.f27600f = aVar2;
        this.f27601g = pVar;
        this.f27596b = i2;
    }

    public /* synthetic */ m(boolean z, com.waze.ui.r.a.c.b bVar, com.waze.ui.r.a.e.b.a aVar, com.waze.ui.r.a.a.q qVar, com.waze.ui.r.a.e.a aVar2, h.g.a.p pVar, int i2, int i3) {
        this.f27602h = i3;
        this.f27595a = z;
        this.f27598d = bVar;
        this.f27600f = aVar;
        this.f27597c = qVar;
        this.f27599e = aVar2;
        this.f27601g = pVar;
        this.f27596b = i2;
    }
}
