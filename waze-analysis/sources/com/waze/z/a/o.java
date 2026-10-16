package com.waze.z.a;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.waze.ui.m.dd;
import com.waze.ui.m.dj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class o implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46155a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f46156b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f46157c;

    public /* synthetic */ o(Object obj, int i2, int i3) {
        this.f46157c = i3;
        this.f46156b = obj;
        this.f46155a = i2;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v27, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.List] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f46157c) {
            case 0:
                ((Integer) obj2).intValue();
                int i2 = this.f46155a;
                break;
            case 1:
                ((Integer) obj2).intValue();
                int i3 = this.f46155a;
                dj.d((dd) this.f46156b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                int i4 = this.f46155a;
                com.waze.ui.ai.g(this.f46156b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i4 | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                int i5 = this.f46155a;
                com.waze.ui.ai.g(this.f46156b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i5 | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                int i6 = this.f46155a;
                com.waze.ui.n.e.e(this.f46156b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                int i7 = this.f46155a;
                com.waze.ui.p.t.h((com.waze.ui.o.aj) this.f46156b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i7 | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                int i8 = this.f46155a;
                com.waze.ui.s.c.b((com.waze.ui.s.d) this.f46156b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i8 | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                int i9 = this.f46155a;
                com.waze.ui.b.d.f(this.f46156b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i9 | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                int i10 = this.f46155a;
                com.waze.ui.p.t.j((com.waze.ui.ab.j) this.f46156b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                int i11 = this.f46155a;
                com.waze.ui.ad.b.a((com.waze.ui.ad.c) this.f46156b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                int i12 = this.f46155a;
                com.waze.ui.u.g.i(this.f46156b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i12 | 1));
                break;
        }
        return h.ab.f48028a;
    }
}
