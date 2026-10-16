package com.waze.z.a;

import android.app.Activity;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.waze.navigate.location_preview.LocationPreviewActivity;
import com.waze.sound.bp;
import com.waze.ui.m.dc;
import com.waze.ui.m.dj;
import com.waze.ui.m.dl;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class ag implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45626a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f45627b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f45628c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f45629d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f45630e;

    public /* synthetic */ ag(dl dlVar, h.g.a.l lVar, LocationPreviewActivity locationPreviewActivity, int i2, int i3) {
        this.f45630e = i3;
        this.f45628c = dlVar;
        this.f45629d = lVar;
        this.f45627b = locationPreviewActivity;
        this.f45626a = i2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.waze.z.a.ad, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v26, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v27, types: [com.waze.shared_infra.j.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v15, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v30, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v32, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v40, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.List] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f45630e) {
            case 0:
                ((Integer) obj2).intValue();
                int i2 = this.f45626a;
                ?? r0 = this.f45629d;
                ?? r1 = this.f45628c;
                break;
            case 1:
                ((Integer) obj2).intValue();
                int i3 = this.f45626a;
                ?? r02 = this.f45629d;
                Object obj3 = this.f45627b;
                com.waze.sound.e.h.b(this.f45628c, (bp) obj3, r02, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                int i4 = this.f45626a;
                ?? r03 = this.f45629d;
                Object obj4 = this.f45627b;
                com.waze.ui.d.s.d(this.f45628c, (LazyGridState) obj4, r03, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i4 | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                int i5 = this.f45626a;
                ?? r04 = this.f45629d;
                ?? r12 = this.f45628c;
                com.waze.ui.g.w.f((com.waze.ui.g.m) this.f45627b, r12, r04, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i5 | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                int i6 = this.f45626a;
                ?? r05 = this.f45629d;
                Object obj5 = this.f45627b;
                com.waze.ui.g.w.e(this.f45628c, (String) obj5, r05, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                int i7 = this.f45626a;
                ?? r06 = this.f45629d;
                ?? r13 = this.f45628c;
                com.waze.ui.g.w.a((com.waze.ui.g.x) this.f45627b, r13, r06, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i7 | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                int i8 = this.f45626a;
                ?? r07 = this.f45629d;
                Object obj6 = this.f45628c;
                com.waze.ui.k.q.j(this.f45627b, (com.waze.ui.m.a) obj6, r07, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i8 | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                int i9 = this.f45626a;
                Object obj7 = this.f45627b;
                ?? r14 = this.f45629d;
                dc.n((dl) this.f45628c, r14, (LocationPreviewActivity) obj7, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i9 | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                int i10 = this.f45626a;
                ?? r08 = this.f45629d;
                Object obj8 = this.f45627b;
                dj.c(this.f45628c, (String) obj8, r08, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                int i11 = this.f45626a;
                ?? r09 = this.f45629d;
                Object obj9 = this.f45627b;
                dj.c(this.f45628c, (String) obj9, r09, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                int i12 = this.f45626a;
                ?? r010 = this.f45629d;
                ?? r15 = this.f45628c;
                com.waze.ui.n.e.a((com.waze.ui.n.i) this.f45627b, r15, r010, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i12 | 1));
                break;
            case 11:
                ((Integer) obj2).intValue();
                int i13 = this.f45626a;
                ?? r011 = this.f45629d;
                ?? r16 = this.f45628c;
                com.waze.ui.o.aa.f((com.waze.ui.o.x) this.f45627b, r16, r011, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i13 | 1));
                break;
            case 12:
                ((Integer) obj2).intValue();
                int i14 = this.f45626a;
                ?? r012 = this.f45629d;
                Object obj10 = this.f45628c;
                com.waze.ui.v.f.h(this.f45627b, (com.waze.ui.f.ak) obj10, r012, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i14 | 1));
                break;
            case 13:
                ((Integer) obj2).intValue();
                int i15 = this.f45626a;
                ?? r013 = this.f45629d;
                Object obj11 = this.f45628c;
                com.waze.ui.w.a.b.c(this.f45627b, (com.waze.ui.d.s) obj11, r013, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i15 | 1));
                break;
            case 14:
                ((Integer) obj2).intValue();
                int i16 = this.f45626a;
                ?? r014 = this.f45629d;
                Object obj12 = this.f45628c;
                com.waze.ui.x.u.i((com.waze.ui.x.g) this.f45627b, (com.waze.ui.x.g) obj12, r014, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i16 | 1));
                break;
            case 15:
                ((Integer) obj2).intValue();
                int i17 = this.f45626a;
                ?? r015 = this.f45629d;
                ?? r17 = this.f45628c;
                com.waze.ui.p.t.i((com.waze.ui.ab.l) this.f45627b, r17, r015, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i17 | 1));
                break;
            case 16:
                ((Integer) obj2).intValue();
                int i18 = this.f45626a;
                ?? r016 = this.f45629d;
                ?? r18 = this.f45628c;
                com.waze.ui.s.c.g(this.f45627b, r18, r016, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i18 | 1));
                break;
            case 17:
                ((Integer) obj2).intValue();
                int i19 = this.f45626a;
                ?? r017 = this.f45629d;
                ?? r19 = this.f45628c;
                com.waze.ui.s.c.f((String) this.f45627b, r19, r017, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i19 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                int i20 = this.f45626a;
                ?? r018 = this.f45629d;
                ?? r110 = this.f45628c;
                com.waze.ui.ad.b.f((Activity) this.f45627b, r110, r018, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i20 | 1));
                break;
        }
        return h.ab.f48028a;
    }

    public /* synthetic */ ag(Object obj, Object obj2, Object obj3, int i2, int i3) {
        this.f45630e = i3;
        this.f45627b = obj;
        this.f45628c = obj2;
        this.f45629d = obj3;
        this.f45626a = i2;
    }

    public /* synthetic */ ag(List list, Object obj, h.g.a.l lVar, int i2, int i3) {
        this.f45630e = i3;
        this.f45628c = list;
        this.f45627b = obj;
        this.f45629d = lVar;
        this.f45626a = i2;
    }
}
