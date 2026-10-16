package com.waze.z.a.g;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.waze.z.a.be;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class w implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f46109a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f46110b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f46111c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f46112d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f46113e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f46114f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f46115g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f46116h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ int f46117i;

    public /* synthetic */ w(RowScope rowScope, com.waze.design_components.b.d dVar, h.g.a.a aVar, Modifier modifier, com.waze.design_components.b.e eVar, long j2, int i2, int i3, int i4) {
        this.f46117i = i4;
        this.f46113e = rowScope;
        this.f46115g = dVar;
        this.f46116h = aVar;
        this.f46110b = modifier;
        this.f46114f = eVar;
        this.f46109a = j2;
        this.f46111c = i2;
        this.f46112d = i3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.Alignment, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.foundation.layout.RowScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.waze.z.a.g.aa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [h.g.a.q, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f46117i != 0) {
            Composer composer = (Composer) obj;
            ((Integer) obj2).intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f46111c | 1);
            int i2 = this.f46112d;
            long j2 = this.f46109a;
            Object obj3 = this.f46114f;
            Modifier modifier = this.f46110b;
            be.i(this.f46113e, (com.waze.design_components.b.d) this.f46115g, this.f46116h, modifier, (com.waze.design_components.b.e) obj3, j2, composer, iUpdateChangedFlags, i2);
            return h.ab.f48028a;
        }
        Composer composer2 = (Composer) obj;
        ((Integer) obj2).intValue();
        int i3 = this.f46111c;
        int i4 = this.f46112d;
        ?? r6 = this.f46116h;
        Object obj4 = this.f46115g;
        ?? r4 = this.f46114f;
        Modifier modifier2 = this.f46110b;
        z.e(this.f46113e, this.f46109a, modifier2, r4, (o) obj4, r6, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return h.ab.f48028a;
    }

    public /* synthetic */ w(Alignment alignment, long j2, Modifier modifier, aa aaVar, o oVar, h.g.a.q qVar, int i2, int i3, int i4) {
        this.f46117i = i4;
        this.f46113e = alignment;
        this.f46109a = j2;
        this.f46110b = modifier;
        this.f46114f = aaVar;
        this.f46115g = oVar;
        this.f46116h = qVar;
        this.f46111c = i2;
        this.f46112d = i3;
    }
}
