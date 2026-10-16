package com.waze.t.c;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.waze.bv.s;
import com.waze.bw.c.d.cv;
import com.waze.bw.c.d.df;
import com.waze.bw.c.d.dh;
import com.waze.main_screen.k.a.w;
import com.waze.parking.q;
import com.waze.parking.y;
import com.waze.ui.o.aa;
import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class h implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f40850a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f40851b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f40852c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f40853d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f40854e;

    public /* synthetic */ h(Modifier modifier, s sVar, boolean z, int i2, int i3) {
        this.f40854e = i3;
        this.f40852c = modifier;
        this.f40853d = sVar;
        this.f40850a = z;
        this.f40851b = i2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.waze.bv.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [com.waze.main_screen.q.b.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [com.waze.main_screen.q.b.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.waze.main_screen.b.a.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [h.g.a.a, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f40854e) {
            case 0:
                ((Integer) obj2).intValue();
                int i2 = this.f40851b;
                ?? r0 = this.f40853d;
                boolean z = this.f40850a;
                break;
            case 1:
                ((Integer) obj2).intValue();
                int i3 = this.f40851b;
                boolean z2 = this.f40850a;
                ?? r1 = this.f40852c;
                com.waze.main_screen.a.a.f.f(this.f40853d, r1, z2, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                int i4 = this.f40851b;
                boolean z3 = this.f40850a;
                ?? r12 = this.f40853d;
                com.waze.main_screen.i.a.d.e(this.f40852c, r12, z3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i4 | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                int i5 = this.f40851b;
                boolean z4 = this.f40850a;
                ?? r13 = this.f40852c;
                w.b(this.f40853d, r13, z4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i5 | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                int i6 = this.f40851b;
                ?? r02 = this.f40852c;
                boolean z5 = this.f40850a;
                com.waze.main_screen.q.b.b.b(this.f40853d, z5, r02, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                int i7 = this.f40851b;
                ?? r03 = this.f40852c;
                boolean z6 = this.f40850a;
                com.waze.main_screen.p.b.a.a.c.d(this.f40853d, z6, r03, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i7 | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                int i8 = this.f40851b;
                ?? r04 = this.f40852c;
                boolean z7 = this.f40850a;
                com.waze.main_screen.ac.b.c((com.waze.main_screen.ad.a.h) this.f40853d, z7, r04, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i8 | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                int i9 = this.f40851b;
                ?? r05 = this.f40853d;
                boolean z8 = this.f40850a;
                q.b((y) this.f40852c, z8, r05, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i9 | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                int i10 = this.f40851b;
                ?? r06 = this.f40853d;
                boolean z9 = this.f40850a;
                com.waze.sharedui.e.e.m((df) this.f40852c, z9, r06, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                int i11 = this.f40851b;
                ?? r07 = this.f40853d;
                boolean z10 = this.f40850a;
                com.waze.sharedui.e.e.l((dh) this.f40852c, z10, r07, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                int i12 = this.f40851b;
                ?? r08 = this.f40853d;
                boolean z11 = this.f40850a;
                com.waze.sharedui.f.n.h((df) this.f40852c, z11, r08, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i12 | 1));
                break;
            case 11:
                ((Integer) obj2).intValue();
                int i13 = this.f40851b;
                ?? r09 = this.f40853d;
                boolean z12 = this.f40850a;
                com.waze.sharedui.f.n.g((cv) this.f40852c, z12, r09, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i13 | 1));
                break;
            case 12:
                ((Integer) obj2).intValue();
                int i14 = this.f40851b;
                ?? r010 = this.f40853d;
                boolean z13 = this.f40850a;
                com.waze.sharedui.f.n.f((cv) this.f40852c, z13, r010, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i14 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                int i15 = this.f40851b;
                ?? r011 = this.f40853d;
                boolean z14 = this.f40850a;
                aa.a((String) this.f40852c, z14, r011, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i15 | 1));
                break;
        }
        return ab.f48028a;
    }

    public /* synthetic */ h(Object obj, Modifier modifier, boolean z, int i2, int i3) {
        this.f40854e = i3;
        this.f40853d = obj;
        this.f40852c = modifier;
        this.f40850a = z;
        this.f40851b = i2;
    }

    public /* synthetic */ h(Object obj, boolean z, Modifier modifier, int i2, int i3) {
        this.f40854e = i3;
        this.f40853d = obj;
        this.f40850a = z;
        this.f40852c = modifier;
        this.f40851b = i2;
    }

    public /* synthetic */ h(Object obj, boolean z, Object obj2, int i2, int i3) {
        this.f40854e = i3;
        this.f40852c = obj;
        this.f40850a = z;
        this.f40853d = obj2;
        this.f40851b = i2;
    }
}
