package com.waze.main_screen.c.b;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.waze.ac.e;
import com.waze.bw.c.d.cw;
import com.waze.bw.c.d.da;
import com.waze.bw.c.d.dc;
import com.waze.bw.c.d.dh;
import com.waze.bw.c.d.v;
import com.waze.car_lib.r.co;
import com.waze.main_screen.c.f.i;
import com.waze.parking.q;
import com.waze.ui.x.g;
import com.waze.ui.x.u;
import com.waze.ui.z.as;
import h.ab;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class b implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f26144a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26145b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26146c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f26147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f26148e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f26149f;

    public /* synthetic */ b(Object obj, Object obj2, boolean z, Object obj3, int i2, int i3) {
        this.f26149f = i3;
        this.f26147d = obj;
        this.f26146c = obj2;
        this.f26144a = z;
        this.f26148e = obj3;
        this.f26145b = i2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.waze.main_screen.b.a.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.waze.main_screen.ae.a.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.waze.main_screen.ae.a.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.waze.bw.c.d.ce, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f26149f) {
            case 0:
                Composer composer = (Composer) obj;
                ((Integer) obj2).intValue();
                int i2 = this.f26145b;
                ?? r3 = this.f26148e;
                ?? r2 = this.f26147d;
                d.b(this.f26146c, this.f26144a, r2, r3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i3 = this.f26145b;
                ?? r32 = this.f26147d;
                ?? r22 = this.f26148e;
                co.e((com.waze.o.d.b.a.d) this.f26146c, this.f26144a, r22, r32, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
                break;
            case 2:
                Composer composer3 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i4 = this.f26145b;
                ?? r33 = this.f26148e;
                ?? r23 = this.f26147d;
                com.waze.main_screen.c.f.d.a((i) this.f26146c, this.f26144a, r23, r33, composer3, RecomposeScopeImplKt.updateChangedFlags(i4 | 1));
                break;
            case 3:
                Composer composer4 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i5 = this.f26145b;
                ?? r34 = this.f26148e;
                boolean z = this.f26144a;
                e.f(this.f26147d, this.f26146c, z, r34, composer4, RecomposeScopeImplKt.updateChangedFlags(i5 | 1));
                break;
            case 4:
                Composer composer5 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i6 = this.f26145b;
                ?? r35 = this.f26148e;
                boolean z2 = this.f26144a;
                e.f(this.f26147d, this.f26146c, z2, r35, composer5, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
                break;
            case 5:
                Composer composer6 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i7 = this.f26145b;
                ?? r36 = this.f26147d;
                ?? r24 = this.f26148e;
                q.d((String) this.f26146c, this.f26144a, r24, r36, composer6, RecomposeScopeImplKt.updateChangedFlags(i7 | 1));
                break;
            case 6:
                Composer composer7 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i8 = this.f26145b;
                ?? r37 = this.f26148e;
                boolean z3 = this.f26144a;
                v.n(this.f26147d, this.f26146c, z3, r37, composer7, RecomposeScopeImplKt.updateChangedFlags(i8 | 1));
                break;
            case 7:
                Composer composer8 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i9 = this.f26145b;
                ?? r38 = this.f26148e;
                Object obj3 = this.f26146c;
                com.waze.sharedui.profile.c.f((da) this.f26147d, this.f26144a, (dh) obj3, r38, composer8, RecomposeScopeImplKt.updateChangedFlags(i9 | 1));
                break;
            case 8:
                Composer composer9 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i10 = this.f26145b;
                ?? r39 = this.f26148e;
                com.waze.sharedui.profile.c.e((cw) this.f26147d, (dc) this.f26146c, this.f26144a, r39, composer9, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                break;
            case 9:
                Composer composer10 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i11 = this.f26145b;
                ?? r310 = this.f26148e;
                Object obj4 = this.f26146c;
                com.waze.sharedui.profile.c.d((cw) this.f26147d, this.f26144a, (dh) obj4, r310, composer10, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                break;
            case 10:
                Composer composer11 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i12 = this.f26145b;
                ?? r4 = this.f26148e;
                Object obj5 = this.f26146c;
                u.h(this.f26144a, (g) this.f26147d, (g) obj5, r4, composer11, RecomposeScopeImplKt.updateChangedFlags(i12 | 1));
                break;
            default:
                Composer composer12 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i13 = this.f26145b;
                ?? r311 = this.f26148e;
                ?? r25 = this.f26146c;
                as.l(this.f26144a, this.f26147d, r25, r311, composer12, RecomposeScopeImplKt.updateChangedFlags(i13 | 1));
                break;
        }
        return ab.f48028a;
    }

    public /* synthetic */ b(Object obj, boolean z, Modifier modifier, h.g.a.a aVar, int i2, int i3) {
        this.f26149f = i3;
        this.f26146c = obj;
        this.f26144a = z;
        this.f26147d = modifier;
        this.f26148e = aVar;
        this.f26145b = i2;
    }

    public /* synthetic */ b(Object obj, boolean z, dh dhVar, l lVar, int i2, int i3) {
        this.f26149f = i3;
        this.f26147d = obj;
        this.f26144a = z;
        this.f26146c = dhVar;
        this.f26148e = lVar;
        this.f26145b = i2;
    }

    public /* synthetic */ b(Object obj, boolean z, h.g.a.a aVar, Modifier modifier, int i2, int i3) {
        this.f26149f = i3;
        this.f26146c = obj;
        this.f26144a = z;
        this.f26148e = aVar;
        this.f26147d = modifier;
        this.f26145b = i2;
    }

    public /* synthetic */ b(boolean z, Object obj, Object obj2, Object obj3, int i2, int i3) {
        this.f26149f = i3;
        this.f26144a = z;
        this.f26147d = obj;
        this.f26146c = obj2;
        this.f26148e = obj3;
        this.f26145b = i2;
    }
}
