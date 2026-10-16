package com.waze.main_screen.t;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.waze.reports_v2.presentation.bx;
import com.waze.ui.l.bh;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class p implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f27614a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27615b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27616c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f27617d;

    public /* synthetic */ p(Object obj, boolean z, int i2, int i3) {
        this.f27617d = i3;
        this.f27616c = obj;
        this.f27614a = z;
        this.f27615b = i2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f27617d) {
            case 0:
                ((Integer) obj2).intValue();
                int i2 = this.f27615b;
                boolean z = this.f27614a;
                break;
            case 1:
                ((Integer) obj2).intValue();
                int i3 = this.f27615b;
                boolean z2 = this.f27614a;
                bx.e((com.waze.reports_v2.a.a.a.b) this.f27616c, z2, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                int i4 = this.f27615b;
                ?? r0 = this.f27616c;
                com.waze.sharedui.api.i.f(this.f27614a, r0, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i4 | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                int i5 = this.f27615b;
                ?? r02 = this.f27616c;
                com.waze.sharedui.e.e.k(this.f27614a, r02, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i5 | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                int i6 = this.f27615b;
                ?? r03 = this.f27616c;
                com.waze.sharedui.e.e.j(this.f27614a, r03, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                int i7 = this.f27615b;
                ?? r04 = this.f27616c;
                com.waze.sharedui.f.n.e(this.f27614a, r04, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i7 | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                int i8 = this.f27615b;
                ?? r05 = this.f27616c;
                com.waze.ui.j.h.i(this.f27614a, r05, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i8 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                int i9 = this.f27615b;
                boolean z3 = this.f27614a;
                bh.d(this.f27616c, z3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i9 | 1));
                break;
        }
        return h.ab.f48028a;
    }

    public /* synthetic */ p(boolean z, Object obj, int i2, int i3) {
        this.f27617d = i3;
        this.f27614a = z;
        this.f27616c = obj;
        this.f27615b = i2;
    }
}
