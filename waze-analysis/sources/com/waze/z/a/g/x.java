package com.waze.z.a.g;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class x implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f46118a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f46119b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ aa f46120c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f46121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f46122e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f46123f;

    public /* synthetic */ x(o oVar, long j2, aa aaVar, h.g.a.q qVar, int i2, int i3) {
        this.f46123f = i3;
        this.f46118a = oVar;
        this.f46119b = j2;
        this.f46120c = aaVar;
        this.f46122e = qVar;
        this.f46121d = i2;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [h.g.a.q, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f46123f != 0) {
            Composer composer = (Composer) obj;
            ((Integer) obj2).intValue();
            int i2 = this.f46121d;
            ?? r5 = this.f46122e;
            aa aaVar = this.f46120c;
            z.g(this.f46118a, this.f46119b, aaVar, r5, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            return h.ab.f48028a;
        }
        Composer composer2 = (Composer) obj;
        ((Integer) obj2).intValue();
        int i3 = this.f46121d;
        aa aaVar2 = this.f46120c;
        long j2 = this.f46119b;
        z.d((String) this.f46122e, this.f46118a, j2, aaVar2, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return h.ab.f48028a;
    }

    public /* synthetic */ x(String str, o oVar, long j2, aa aaVar, int i2, int i3) {
        this.f46123f = i3;
        this.f46122e = str;
        this.f46118a = oVar;
        this.f46119b = j2;
        this.f46120c = aaVar;
        this.f46121d = i2;
    }
}
