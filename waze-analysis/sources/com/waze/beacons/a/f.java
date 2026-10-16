package com.waze.beacons.a;

import com.waze.beacons.l;
import com.waze.iw;
import com.waze.l.r;
import com.waze.l.t;
import com.waze.l.u;
import com.waze.l.v;
import com.waze.tide.x;
import h.ab;
import h.i;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f implements com.waze.ui.r.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final l f16246a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.beacons.b f16247b;

    /* renamed from: c, reason: collision with root package name */
    private final x f16248c;

    /* renamed from: d, reason: collision with root package name */
    private final af f16249d;

    /* renamed from: e, reason: collision with root package name */
    private final bn f16250e;

    /* renamed from: f, reason: collision with root package name */
    private final ch f16251f;

    /* renamed from: g, reason: collision with root package name */
    private final v f16252g;

    public f(l lVar, com.waze.beacons.b bVar, x xVar, u uVar) {
        h.g.b.x.f(lVar, "beaconsManager");
        h.g.b.x.f(bVar, "beaconConfig");
        h.g.b.x.f(xVar, "statSender");
        h.g.b.x.f(uVar, "wazeBluetoothPermissionsStateHolderFactory");
        this.f16246a = lVar;
        this.f16247b = bVar;
        this.f16248c = xVar;
        this.f16249d = com.waze.ui.a.l.p(this, "BeaconBluetoothPermissionStateHolder");
        int i2 = 0;
        bn bnVarB = ck.b(false);
        this.f16250e = bnVarB;
        this.f16251f = ai.U(bnVarB);
        int i3 = 1;
        this.f16252g = u.a(new a(this, i3), new iw(4), new b(this, i3), new a(this, i2), new b(this, i2), new a(this, 2), new c(this, i2));
    }

    static final ab c(f fVar, boolean z) {
        fVar.f16247b.a(z);
        return ab.f48028a;
    }

    static final ab d(f fVar) {
        fVar.f16248c.c(t.f25123a);
        return ab.f48028a;
    }

    static final ab e(f fVar, boolean z) {
        fVar.f16248c.d(z, t.f25123a);
        return ab.f48028a;
    }

    static final ab f(f fVar) {
        fVar.f16248c.b(t.f25123a);
        return ab.f48028a;
    }

    static final ab g(f fVar, r rVar, boolean z) {
        com.waze.tide.v vVar;
        h.g.b.x.f(rVar, "action");
        r rVar2 = r.f25115a;
        int iOrdinal = rVar.ordinal();
        if (iOrdinal == 0) {
            vVar = com.waze.tide.v.f40964a;
        } else if (iOrdinal == 1) {
            vVar = com.waze.tide.v.f40965b;
        } else {
            if (iOrdinal != 2) {
                throw new i();
            }
            vVar = com.waze.tide.v.f40967d;
        }
        fVar.f16248c.a(vVar, t.f25123a, z);
        return ab.f48028a;
    }

    static final boolean m(f fVar) {
        return fVar.f16247b.b();
    }

    public final v b() {
        return this.f16252g;
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        aj.h(this.f16249d, null);
    }

    public final ch i() {
        return this.f16251f;
    }

    public final void j() {
        this.f16250e.e(false);
        this.f16246a.onBluetoothConnectionRequirementHandled();
    }

    public final void k(boolean z) {
        this.f16246a.onBluetoothTurnedOn(z);
    }

    public final void l() {
        aj.z(this.f16249d, null, null, new e(this, null), 3);
    }
}
