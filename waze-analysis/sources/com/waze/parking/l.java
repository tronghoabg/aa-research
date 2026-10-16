package com.waze.parking;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.waze.c.e.cl;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class l implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f32973a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32974b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32975c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f32976d;

    public /* synthetic */ l(long j2, h.g.a.a aVar, int i2, int i3) {
        this.f32976d = i3;
        this.f32973a = j2;
        this.f32975c = aVar;
        this.f32974b = i2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.a, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f32976d != 0) {
            ((Integer) obj2).intValue();
            int i2 = this.f32974b;
            long j2 = this.f32973a;
            cl.C((com.waze.c.e.k) this.f32975c, j2, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            return ab.f48028a;
        }
        ((Integer) obj2).intValue();
        int i3 = this.f32974b;
        ?? r0 = this.f32975c;
        q.g(this.f32973a, r0, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return ab.f48028a;
    }

    public /* synthetic */ l(com.waze.c.e.k kVar, long j2, int i2, int i3) {
        this.f32976d = i3;
        this.f32975c = kVar;
        this.f32973a = j2;
        this.f32974b = i2;
    }
}
