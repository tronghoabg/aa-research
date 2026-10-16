package com.waze.trip_overview.c.a;

import android.content.ComponentCallbacks;
import com.waze.map.b.cj;
import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class g implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ComponentCallbacks f41214a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f41215b;

    public g(ComponentCallbacks componentCallbacks, int i2) {
        this.f41215b = i2;
        this.f41214a = componentCallbacks;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        switch (this.f41215b) {
            case 0:
                return ab.c((ab) this.f41214a);
            case 1:
                org.a.d.k.b bVarD = org.chromium.support_lib_boundary.a.b.d(this.f41214a);
                int i2 = ar.f48106a;
                return bVarD.a(new h.g.b.m(com.waze.shared_infra.i.e.class), null, null);
            case 2:
                org.a.d.k.b bVarD2 = org.chromium.support_lib_boundary.a.b.d(this.f41214a);
                int i3 = ar.f48106a;
                return bVarD2.a(new h.g.b.m(com.waze.trip_overview.c.e.class), null, null);
            case 3:
                org.a.d.k.b bVarD3 = org.chromium.support_lib_boundary.a.b.d(this.f41214a);
                int i4 = ar.f48106a;
                return bVarD3.a(new h.g.b.m(com.waze.av.b.o.class), null, null);
            case 4:
                org.a.d.k.b bVarD4 = org.chromium.support_lib_boundary.a.b.d(this.f41214a);
                int i5 = ar.f48106a;
                return bVarD4.a(new h.g.b.m(cj.class), null, null);
            case 5:
                org.a.d.k.b bVarD5 = org.chromium.support_lib_boundary.a.b.d(this.f41214a);
                int i6 = ar.f48106a;
                return bVarD5.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
            case 6:
                org.a.d.k.b bVarD6 = org.chromium.support_lib_boundary.a.b.d(this.f41214a);
                int i7 = ar.f48106a;
                return bVarD6.a(new h.g.b.m(com.waze.maplabelsposition.b.class), null, null);
            default:
                org.a.d.k.b bVarD7 = org.chromium.support_lib_boundary.a.b.d(this.f41214a);
                int i8 = ar.f48106a;
                return bVarD7.a(new h.g.b.m(com.waze.trip_overview.z.class), null, null);
        }
    }

    public /* synthetic */ g(ab abVar, int i2) {
        this.f41215b = i2;
        this.f41214a = abVar;
    }
}
