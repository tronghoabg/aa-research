package com.waze.map.g;

import com.waze.map.b.Cdo;
import com.waze.map.b.dr;
import com.waze.map.b.dt;
import h.ab;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bu;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private final bm f29109a = bu.e(1, 1, null, 4);

    /* renamed from: b, reason: collision with root package name */
    private final Cdo f29110b;

    /* renamed from: c, reason: collision with root package name */
    private Cdo f29111c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f29112d;

    /* renamed from: e, reason: collision with root package name */
    private Cdo f29113e;

    /* renamed from: f, reason: collision with root package name */
    private int f29114f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.destination_cell.b.e f29115g;

    public w(boolean z) {
        Cdo cdo = z ? Cdo.f28214b : Cdo.f28213a;
        this.f29110b = cdo;
        this.f29115g = i(cdo, 0);
        this.f29112d = z;
        this.f29113e = cdo;
        this.f29114f = 0;
    }

    private static final com.waze.destination_cell.b.e i(Cdo cdo, int i2) {
        Cdo cdo2 = Cdo.f28213a;
        int iOrdinal = cdo.ordinal();
        if (iOrdinal == 0) {
            return new dr(i2);
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return new dt((byte[]) null);
        }
        throw new h.i();
    }

    public final Cdo a() {
        return this.f29113e;
    }

    public final Cdo b() {
        return this.f29110b;
    }

    public final Object c(boolean z, h.c.e eVar) {
        Cdo cdo;
        Cdo cdo2 = this.f29113e;
        this.f29112d = z;
        if (z) {
            cdo = Cdo.f28214b;
        } else {
            cdo = this.f29111c;
            if (cdo == null) {
                cdo = Cdo.f28213a;
            }
        }
        this.f29113e = cdo;
        if (cdo2 != cdo) {
            Object objEmit = this.f29109a.emit(new u(this.f29113e, i(cdo, this.f29114f)), eVar);
            if (objEmit == h.c.a.a.f48038a) {
                return objEmit;
            }
        }
        return ab.f48028a;
    }

    public final Object d(Cdo cdo, h.c.e eVar) {
        Cdo cdo2 = this.f29113e;
        this.f29111c = cdo;
        if (this.f29112d) {
            cdo = Cdo.f28214b;
        }
        this.f29113e = cdo;
        if (cdo2 != cdo) {
            Object objEmit = this.f29109a.emit(new u(this.f29113e, i(cdo, this.f29114f)), eVar);
            if (objEmit == h.c.a.a.f48038a) {
                return objEmit;
            }
        }
        return ab.f48028a;
    }

    public final Object e(int i2, h.c.e eVar) {
        if (this.f29114f != i2) {
            this.f29114f = i2;
            if (this.f29113e == Cdo.f28213a) {
                Object objEmit = this.f29109a.emit(new v(i(this.f29113e, this.f29114f)), eVar);
                if (objEmit == h.c.a.a.f48038a) {
                    return objEmit;
                }
            }
        }
        return ab.f48028a;
    }

    public final kotlinx.coroutines.b.k f() {
        return this.f29109a;
    }

    public final com.waze.destination_cell.b.e g() {
        return i(this.f29113e, this.f29114f);
    }

    public final com.waze.destination_cell.b.e h() {
        return this.f29115g;
    }
}
