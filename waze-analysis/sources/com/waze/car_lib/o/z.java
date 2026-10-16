package com.waze.car_lib.o;

import com.waze.car_lib.f.dn;
import com.waze.car_lib.r.at;
import com.waze.modules.c.de;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class z implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f20511a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20512b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20513c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f20514d;

    public /* synthetic */ z(y yVar, boolean z, com.waze.settings.tree.f fVar, int i2) {
        this.f20514d = i2;
        this.f20512b = yVar;
        this.f20511a = z;
        this.f20513c = fVar;
    }

    /* JADX WARN: Type inference failed for: r3v17, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f20514d;
        if (i2 == 0) {
            Object obj = this.f20513c;
            com.waze.settings.tree.c.f.c((com.waze.settings.tree.d.s) this.f20512b, !this.f20511a, obj != null ? ((com.waze.settings.tree.f) obj).r() : null, null);
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            ((at) this.f20513c).e((dn) this.f20512b, this.f20511a);
            return h.ab.f48028a;
        }
        if (i2 == 2) {
            return com.waze.car_lib.r.d.t((com.waze.car_lib.r.d) this.f20512b, (com.waze.av.b.n) this.f20513c, this.f20511a);
        }
        if (i2 == 3) {
            return com.waze.car_lib.r.d.u((com.waze.car_lib.r.d) this.f20512b, (com.waze.av.b.n) this.f20513c, this.f20511a);
        }
        boolean z = this.f20511a;
        if (i2 == 4) {
            return com.waze.car_lib.r.d.s((com.waze.car_lib.r.d) this.f20512b, (com.waze.av.b.n) this.f20513c, z);
        }
        if (!z) {
            this.f20513c.invoke(this.f20512b);
        }
        return h.ab.f48028a;
    }

    public /* synthetic */ z(at atVar, dn dnVar, boolean z, int i2) {
        this.f20514d = i2;
        this.f20513c = atVar;
        this.f20512b = dnVar;
        this.f20511a = z;
    }

    public /* synthetic */ z(com.waze.car_lib.r.d dVar, com.waze.av.b.n nVar, boolean z, int i2) {
        this.f20514d = i2;
        this.f20512b = dVar;
        this.f20513c = nVar;
        this.f20511a = z;
    }

    public /* synthetic */ z(boolean z, h.g.a.l lVar, de deVar, int i2) {
        this.f20514d = i2;
        this.f20511a = z;
        this.f20513c = lVar;
        this.f20512b = deVar;
    }
}
