package com.waze.c.e;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.waze.car_lib.r.co;
import com.waze.search.v2.SearchV2Activity;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class w implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18704a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18705b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18706c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18707d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f18708e;

    public /* synthetic */ w(com.waze.main_screen.p.b.a.b.t tVar, Modifier modifier, com.waze.main_screen.p.b.a.b.k kVar, int i2, int i3) {
        this.f18708e = i3;
        this.f18707d = tVar;
        this.f18706c = modifier;
        this.f18705b = kVar;
        this.f18704a = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.ui.unit.Density, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v27, types: [com.waze.main_screen.u.b.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29, types: [com.waze.main_screen.af.b.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v31, types: [com.waze.notifications.b.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v39, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v44, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v49, types: [com.waze.br.c.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v51, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18708e) {
            case 0:
                ((Integer) obj2).intValue();
                int i2 = this.f18704a;
                ?? r0 = this.f18707d;
                Object obj3 = this.f18706c;
                break;
            case 1:
                ((Integer) obj2).intValue();
                int i3 = this.f18704a;
                ?? r02 = this.f18707d;
                ?? r1 = this.f18705b;
                cl.n((al) this.f18706c, r1, r02, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                int i4 = this.f18704a;
                ?? r03 = this.f18707d;
                ?? r12 = this.f18705b;
                cl.o((al) this.f18706c, r12, r03, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i4 | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                int i5 = this.f18704a;
                Object obj4 = this.f18707d;
                ?? r13 = this.f18705b;
                break;
            case 4:
                ((Integer) obj2).intValue();
                int i6 = this.f18704a;
                ?? r04 = this.f18707d;
                ?? r14 = this.f18705b;
                co.d((com.waze.ui.f.ak) this.f18706c, r14, r04, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                int i7 = this.f18704a;
                ?? r05 = this.f18707d;
                ?? r15 = this.f18705b;
                com.waze.x.g.e((String) this.f18706c, r15, r05, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i7 | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                int i8 = this.f18704a;
                ?? r06 = this.f18707d;
                ?? r16 = this.f18706c;
                com.waze.z.a.b.y.g((String) this.f18705b, r16, r06, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i8 | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                int i9 = this.f18704a;
                ?? r07 = this.f18706c;
                ?? r17 = this.f18707d;
                com.waze.z.a.e.b.a((com.waze.z.a.e.c) this.f18705b, r17, r07, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i9 | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                int i10 = this.f18704a;
                Object obj5 = this.f18705b;
                ?? r18 = this.f18706c;
                com.waze.main_screen.p.b.a.a.c.c((com.waze.main_screen.p.b.a.b.t) this.f18707d, r18, (com.waze.main_screen.p.b.a.b.k) obj5, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                int i11 = this.f18704a;
                ?? r08 = this.f18706c;
                ?? r19 = this.f18707d;
                com.waze.main_screen.u.b.f.c(this.f18705b, r19, r08, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                int i12 = this.f18704a;
                ?? r09 = this.f18706c;
                ?? r110 = this.f18707d;
                com.waze.main_screen.af.b.h.a(this.f18705b, r110, r09, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i12 | 1));
                break;
            case 11:
                ((Integer) obj2).intValue();
                int i13 = this.f18704a;
                Object obj6 = this.f18707d;
                ?? r111 = this.f18706c;
                com.waze.notifications.c.k.o(this.f18705b, r111, (com.waze.reports_v2.presentation.k) obj6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i13 | 1));
                break;
            case 12:
                ((Integer) obj2).intValue();
                int i14 = this.f18704a;
                ?? r010 = this.f18706c;
                ?? r112 = this.f18707d;
                com.waze.reports_v2.presentation.a.an.q((com.waze.reports_v2.presentation.a.at) this.f18705b, r112, r010, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i14 | 1));
                break;
            case 13:
                ((Integer) obj2).intValue();
                int i15 = this.f18704a;
                ?? r011 = this.f18707d;
                ?? r113 = this.f18705b;
                com.waze.reports_v2.presentation.a.an.n((com.waze.reports_v2.presentation.a.g) this.f18706c, r113, r011, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i15 | 1));
                break;
            case 14:
                ((Integer) obj2).intValue();
                int i16 = this.f18704a;
                ?? r012 = this.f18707d;
                Object obj7 = this.f18705b;
                com.waze.reports_v2.presentation.a.an.g(this.f18706c, (com.waze.reports_v2.presentation.a.ab) obj7, r012, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i16 | 1));
                break;
            case 15:
                ((Integer) obj2).intValue();
                int i17 = this.f18704a;
                ?? r013 = this.f18707d;
                ?? r114 = this.f18706c;
                com.waze.search.ai.i((String) this.f18705b, r114, r013, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i17 | 1));
                break;
            case 16:
                ((Integer) obj2).intValue();
                int i18 = this.f18704a;
                ?? r014 = this.f18707d;
                Object obj8 = this.f18705b;
                com.waze.search.d.a.b.b(this.f18706c, (com.waze.search.d.a.a.a) obj8, r014, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i18 | 1));
                break;
            case 17:
                ((Integer) obj2).intValue();
                int i19 = this.f18704a;
                ?? r015 = this.f18707d;
                ?? r115 = this.f18706c;
                ((SearchV2Activity) this.f18705b).r(r115, r015, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i19 | 1));
                break;
            case 18:
                ((Integer) obj2).intValue();
                int i20 = this.f18704a;
                ?? r016 = this.f18706c;
                Object obj9 = this.f18707d;
                com.waze.br.c.d.d(this.f18705b, (com.waze.br.c.x) obj9, r016, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i20 | 1));
                break;
            case 19:
                ((Integer) obj2).intValue();
                int i21 = this.f18704a;
                ?? r017 = this.f18707d;
                Object obj10 = this.f18705b;
                com.waze.settings.h.c.a(this.f18706c, (String) obj10, r017, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i21 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                int i22 = this.f18704a;
                ?? r018 = this.f18707d;
                ?? r116 = this.f18705b;
                com.waze.sharedrive.g.bf.i((com.waze.sharedrive.e.n) this.f18706c, r116, r018, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i22 | 1));
                break;
        }
        return h.ab.f48028a;
    }

    public /* synthetic */ w(Object obj, Object obj2, Modifier modifier, int i2, int i3) {
        this.f18708e = i3;
        this.f18705b = obj;
        this.f18707d = obj2;
        this.f18706c = modifier;
        this.f18704a = i2;
    }

    public /* synthetic */ w(Object obj, Object obj2, Object obj3, int i2, int i3) {
        this.f18708e = i3;
        this.f18705b = obj;
        this.f18706c = obj2;
        this.f18707d = obj3;
        this.f18704a = i2;
    }

    public /* synthetic */ w(Object obj, Object obj2, Object obj3, int i2, int i3, byte[] bArr) {
        this.f18708e = i3;
        this.f18706c = obj;
        this.f18705b = obj2;
        this.f18707d = obj3;
        this.f18704a = i2;
    }
}
