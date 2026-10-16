package com.waze.o.d.b.b;

import androidx.core.app.NotificationCompat;
import com.waze.car_lib.r.cq;
import com.waze.o.b.b.k;
import com.waze.t.b.bw;
import com.waze.t.c.l;
import com.waze.ui.f.s;
import com.waze.ui.f.t;
import com.waze.ui.f.u;
import com.waze.ui.f.v;
import h.g.b.x;
import java.util.Objects;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h implements com.waze.ui.r.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f32894a;

    /* renamed from: b, reason: collision with root package name */
    private final l f32895b;

    /* renamed from: c, reason: collision with root package name */
    private final af f32896c;

    /* renamed from: d, reason: collision with root package name */
    private final ch f32897d;

    /* renamed from: e, reason: collision with root package name */
    private final k f32898e;

    public /* synthetic */ h(com.waze.shared_infra.i.e eVar, k kVar, l lVar) {
        this.f32894a = eVar;
        this.f32898e = kVar;
        this.f32895b = lVar;
        af afVarP = com.waze.ui.a.l.p(this, null);
        this.f32896c = afVarP;
        kotlinx.coroutines.b.k kVarY = ai.y(new g(kVar.d()));
        int i2 = bz.f51630a;
        this.f32897d = ai.V(kVarY, afVarP, by.b(), cq.l((bw) kVar.d().d()));
    }

    public final l a() {
        return this.f32895b;
    }

    public final ch b() {
        return this.f32897d;
    }

    public final void c(v vVar) {
        x.f(vVar, NotificationCompat.CATEGORY_EVENT);
        Objects.toString(vVar);
        this.f32894a.a("handleEvent: ".concat(vVar.toString()));
        if (x.n(vVar, u.f42313a)) {
            this.f32898e.g();
        } else if (x.n(vVar, t.f42312a)) {
            this.f32898e.f();
        } else {
            if (!(vVar instanceof s)) {
                throw new h.i();
            }
            this.f32898e.e();
        }
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f32894a.a("close");
        aj.h(this.f32896c, null);
    }
}
