package com.waze.closure.d;

import android.support.v4.app.bv;
import androidx.compose.animation.core.TransitionState;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import com.waze.ab.a.l;
import com.waze.ab.ab;
import com.waze.bw.c.d.cw;
import com.waze.bw.c.d.v;
import com.waze.c.e.al;
import com.waze.c.e.cl;
import com.waze.closure.c.i;
import com.waze.install.ah;
import com.waze.main_screen.v.n;
import com.waze.main_screen.v.o;
import com.waze.n.ac;
import com.waze.n.aq;
import com.waze.navigate.location_preview.LocationPreviewActivity;
import com.waze.q.j;
import com.waze.reports_v2.presentation.a.at;
import com.waze.ui.b.f;
import com.waze.ui.j.h;
import com.waze.ui.m.ci;
import com.waze.ui.m.dc;
import com.waze.ui.o.aa;
import com.waze.z.a.be;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class b implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22485a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22486b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22487c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f22489e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f22490f;

    public /* synthetic */ b(n nVar, TransitionState transitionState, o oVar, Modifier modifier, int i2, int i3) {
        this.f22490f = i3;
        this.f22488d = nVar;
        this.f22486b = transitionState;
        this.f22489e = oVar;
        this.f22487c = modifier;
        this.f22485a = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.waze.ui.ac.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v26, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v28, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlinx.coroutines.af] */
    /* JADX WARN: Type inference failed for: r2v0, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.waze.main_screen.v.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.foundation.layout.WindowInsets, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v38, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f22490f) {
            case 0:
                Composer composer = (Composer) obj;
                ((Integer) obj2).intValue();
                int i2 = this.f22485a;
                ?? r3 = this.f22489e;
                ac.n(this.f22486b, (at) this.f22487c, this.f22488d, r3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i3 = this.f22485a;
                ?? r32 = this.f22488d;
                ?? r2 = this.f22487c;
                cl.m((al) this.f22486b, this.f22489e, r2, r32, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
                break;
            case 2:
                Composer composer3 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i4 = this.f22485a;
                ?? r33 = this.f22489e;
                ?? r22 = this.f22488d;
                e.b((i) this.f22486b, this.f22487c, r22, r33, composer3, RecomposeScopeImplKt.updateChangedFlags(i4 | 1));
                break;
            case 3:
                Composer composer4 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i5 = this.f22485a;
                ?? r34 = this.f22488d;
                ?? r23 = this.f22489e;
                aq.g((j) this.f22486b, this.f22487c, r23, r34, composer4, RecomposeScopeImplKt.updateChangedFlags(i5 | 1));
                break;
            case 4:
                Composer composer5 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i6 = this.f22485a;
                Object obj3 = this.f22488d;
                ?? r24 = this.f22487c;
                be.D(this.f22489e, this.f22486b, r24, (Color) obj3, composer5, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
                break;
            case 5:
                Composer composer6 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i7 = this.f22485a;
                ?? r35 = this.f22486b;
                ?? r25 = this.f22487c;
                be.k(this.f22488d, this.f22489e, r25, r35, composer6, RecomposeScopeImplKt.updateChangedFlags(i7 | 1));
                break;
            case 6:
                Composer composer7 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i8 = this.f22485a;
                ?? r36 = this.f22488d;
                ?? r26 = this.f22487c;
                l.d((ModalBottomSheetState) this.f22486b, this.f22489e, r26, r36, composer7, RecomposeScopeImplKt.updateChangedFlags(i8 | 1));
                break;
            case 7:
                Composer composer8 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i9 = this.f22485a;
                ?? r37 = this.f22489e;
                Object obj4 = this.f22488d;
                ah.b((com.waze.ui.ac.n) this.f22486b, (com.waze.ui.ac.n) this.f22487c, (com.waze.ui.ac.n) obj4, r37, composer8, RecomposeScopeImplKt.updateChangedFlags(i9 | 1));
                break;
            case 8:
                Composer composer9 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i10 = this.f22485a;
                ?? r38 = this.f22487c;
                com.waze.main_screen.v.ac.b((n) this.f22488d, (TransitionState) this.f22486b, this.f22489e, r38, composer9, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                break;
            case 9:
                Composer composer10 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i11 = this.f22485a;
                ?? r39 = this.f22486b;
                ?? r27 = this.f22489e;
                com.waze.ad.c.b.d(this.f22487c, this.f22488d, r27, r39, composer10, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                break;
            case 10:
                Composer composer11 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i12 = this.f22485a;
                ?? r310 = this.f22489e;
                ab.k((String) this.f22486b, (String) this.f22487c, this.f22488d, r310, composer11, RecomposeScopeImplKt.updateChangedFlags(i12 | 1));
                break;
            case 11:
                Composer composer12 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i13 = this.f22485a;
                ?? r311 = this.f22489e;
                Object obj5 = this.f22486b;
                ((LocationPreviewActivity) this.f22488d).q(this.f22487c, (bv) obj5, r311, composer12, RecomposeScopeImplKt.updateChangedFlags(i13 | 1));
                break;
            case 12:
                Composer composer13 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i14 = this.f22485a;
                ?? r312 = this.f22489e;
                v.l((com.waze.bw.c.d.l) this.f22487c, (com.waze.z.a.b.ab) this.f22486b, this.f22488d, r312, composer13, RecomposeScopeImplKt.updateChangedFlags(i14 | 1));
                break;
            case 13:
                Composer composer14 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i15 = this.f22485a;
                ?? r313 = this.f22489e;
                ?? r28 = this.f22488d;
                com.waze.sharedui.api.c.f((cw) this.f22487c, this.f22486b, r28, r313, composer14, RecomposeScopeImplKt.updateChangedFlags(i15 | 1));
                break;
            case 14:
                Composer composer15 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i16 = this.f22485a;
                ?? r314 = this.f22489e;
                com.waze.sharedui.profile.c.i((String) this.f22486b, (String) this.f22487c, this.f22488d, r314, composer15, RecomposeScopeImplKt.updateChangedFlags(i16 | 1));
                break;
            case 15:
                Composer composer16 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i17 = this.f22485a;
                ?? r315 = this.f22489e;
                com.waze.sharedui.profile.c.m((String) this.f22486b, (String) this.f22487c, this.f22488d, r315, composer16, RecomposeScopeImplKt.updateChangedFlags(i17 | 1));
                break;
            case 16:
                Composer composer17 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i18 = this.f22485a;
                ?? r316 = this.f22489e;
                Object obj6 = this.f22488d;
                com.waze.ui.b.d.d(this.f22486b, (com.waze.ui.b.a) this.f22487c, (f) obj6, r316, composer17, RecomposeScopeImplKt.updateChangedFlags(i18 | 1));
                break;
            case 17:
                Composer composer18 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i19 = this.f22485a;
                ?? r317 = this.f22489e;
                ?? r29 = this.f22488d;
                h.d((com.waze.ui.j.i) this.f22487c, this.f22486b, r29, r317, composer18, RecomposeScopeImplKt.updateChangedFlags(i19 | 1));
                break;
            case 18:
                Composer composer19 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i20 = this.f22485a;
                ?? r318 = this.f22489e;
                ?? r210 = this.f22488d;
                dc.D((ci) this.f22486b, this.f22487c, r210, r318, composer19, RecomposeScopeImplKt.updateChangedFlags(i20 | 1));
                break;
            case 19:
                Composer composer20 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i21 = this.f22485a;
                ?? r4 = this.f22486b;
                ?? r319 = this.f22489e;
                aa.h(this.f22487c, this.f22488d, r319, r4, composer20, RecomposeScopeImplKt.updateChangedFlags(i21 | 1));
                break;
            default:
                Composer composer21 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i22 = this.f22485a;
                ?? r320 = this.f22489e;
                ?? r211 = this.f22488d;
                com.waze.ui.s.c.e((com.waze.ui.t.b) this.f22486b, this.f22487c, r211, r320, composer21, RecomposeScopeImplKt.updateChangedFlags(i22 | 1));
                break;
        }
        return h.ab.f48028a;
    }

    public /* synthetic */ b(LocationPreviewActivity locationPreviewActivity, Modifier modifier, bv bvVar, p pVar, int i2, int i3) {
        this.f22490f = i3;
        this.f22488d = locationPreviewActivity;
        this.f22487c = modifier;
        this.f22486b = bvVar;
        this.f22489e = pVar;
        this.f22485a = i2;
    }

    public /* synthetic */ b(j jVar, h.g.a.a aVar, h.g.a.l lVar, h.g.a.a aVar2, int i2, int i3) {
        this.f22490f = i3;
        this.f22486b = jVar;
        this.f22487c = aVar;
        this.f22489e = lVar;
        this.f22488d = aVar2;
        this.f22485a = i2;
    }

    public /* synthetic */ b(com.waze.ui.ac.i iVar, Modifier modifier, Modifier modifier2, Color color, int i2, int i3) {
        this.f22490f = i3;
        this.f22489e = iVar;
        this.f22486b = modifier;
        this.f22487c = modifier2;
        this.f22488d = color;
        this.f22485a = i2;
    }

    public /* synthetic */ b(h.g.a.a aVar, h.g.a.a aVar2, Modifier modifier, WindowInsets windowInsets, int i2, int i3) {
        this.f22490f = i3;
        this.f22488d = aVar;
        this.f22489e = aVar2;
        this.f22487c = modifier;
        this.f22486b = windowInsets;
        this.f22485a = i2;
    }

    public /* synthetic */ b(Object obj, Object obj2, h.g.a.a aVar, h.g.a.a aVar2, int i2, int i3) {
        this.f22490f = i3;
        this.f22486b = obj;
        this.f22489e = obj2;
        this.f22487c = aVar;
        this.f22488d = aVar2;
        this.f22485a = i2;
    }

    public /* synthetic */ b(Object obj, Object obj2, h.g.a.l lVar, Modifier modifier, int i2, int i3) {
        this.f22490f = i3;
        this.f22487c = obj;
        this.f22488d = obj2;
        this.f22489e = lVar;
        this.f22486b = modifier;
        this.f22485a = i2;
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, int i2, int i3) {
        this.f22490f = i3;
        this.f22486b = obj;
        this.f22487c = obj2;
        this.f22488d = obj3;
        this.f22489e = obj4;
        this.f22485a = i2;
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, int i2, int i3, byte[] bArr) {
        this.f22490f = i3;
        this.f22487c = obj;
        this.f22486b = obj2;
        this.f22488d = obj3;
        this.f22489e = obj4;
        this.f22485a = i2;
    }
}
