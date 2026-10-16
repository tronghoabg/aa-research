package com.waze.ui.d;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.waze.sharedrive.g.ah;
import com.waze.sharedrive.g.bf;
import com.waze.ui.g.w;
import com.waze.ui.m.dc;
import com.waze.ui.m.x;
import com.waze.ui.w.ai;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class l implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42148a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42149b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f42150c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f42151d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f42152e;

    public /* synthetic */ l(int i2, com.waze.ui.r.a.d.c cVar, h.g.a.a aVar, int i3, int i4) {
        this.f42152e = i4;
        this.f42148a = i2;
        this.f42150c = cVar;
        this.f42151d = aVar;
        this.f42149b = i3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [h.g.a.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [com.waze.view.popups.b.m, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f42152e;
        if (i2 == 0) {
            ((Integer) obj2).intValue();
            int i3 = this.f42149b;
            ?? r0 = this.f42151d;
            int i4 = this.f42148a;
            return s.h((b) this.f42150c, i4, r0, i3, (Composer) obj);
        }
        if (i2 == 1) {
            ((Integer) obj2).intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f42148a | 1);
            int i5 = this.f42149b;
            ?? r1 = this.f42151d;
            bf.b((ah) this.f42150c, r1, (Composer) obj, iUpdateChangedFlags, i5);
            return ab.f48028a;
        }
        if (i2 == 2) {
            ((Integer) obj2).intValue();
            int i6 = this.f42149b;
            ?? r02 = this.f42151d;
            int i7 = this.f42148a;
            dc.z((x) this.f42150c, i7, r02, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
            return ab.f48028a;
        }
        if (i2 == 3) {
            ((Integer) obj2).intValue();
            int i8 = this.f42149b;
            int i9 = this.f42148a;
            ?? r2 = this.f42151d;
            ai.t((com.waze.ui.k.q) this.f42150c, r2, i9, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i8 | 1));
            return ab.f48028a;
        }
        if (i2 != 4) {
            ((Integer) obj2).intValue();
            int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.f42148a | 1);
            int i10 = this.f42149b;
            ?? r12 = this.f42150c;
            com.waze.view.popups.b.b.a(this.f42151d, r12, (Composer) obj, iUpdateChangedFlags2, i10);
            return ab.f48028a;
        }
        ((Integer) obj2).intValue();
        int i11 = this.f42149b;
        ?? r03 = this.f42151d;
        Object obj3 = this.f42150c;
        w.i(this.f42148a, (com.waze.ui.r.a.d.c) obj3, r03, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return ab.f48028a;
    }

    public /* synthetic */ l(com.waze.view.popups.b.m mVar, Modifier modifier, int i2, int i3, int i4) {
        this.f42152e = i4;
        this.f42151d = mVar;
        this.f42150c = modifier;
        this.f42148a = i2;
        this.f42149b = i3;
    }

    public /* synthetic */ l(Object obj, int i2, h.g.a.l lVar, int i3, int i4) {
        this.f42152e = i4;
        this.f42150c = obj;
        this.f42148a = i2;
        this.f42151d = lVar;
        this.f42149b = i3;
    }

    public /* synthetic */ l(Object obj, Object obj2, int i2, int i3, int i4) {
        this.f42152e = i4;
        this.f42150c = obj;
        this.f42151d = obj2;
        this.f42148a = i2;
        this.f42149b = i3;
    }
}
