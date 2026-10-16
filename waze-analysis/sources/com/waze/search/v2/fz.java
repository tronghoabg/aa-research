package com.waze.search.v2;

import com.waze.jni.protos.navigate.DriveTo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class fz extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f36580a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ft f36581b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h.g.b.aq f36582c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f36583d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Object f36584e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f36585f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fz(ft ftVar, com.waze.av.d.k kVar, h.g.b.aq aqVar, h.g.a.l lVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f36585f = i2;
        this.f36581b = ftVar;
        this.f36584e = kVar;
        this.f36582c = aqVar;
        this.f36583d = lVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f36585f;
        if (i2 == 0) {
            return new fz(this.f36581b, (com.waze.av.d.k) this.f36584e, this.f36582c, this.f36583d, eVar, 0);
        }
        if (i2 != 1) {
            return new fz(this.f36581b, (com.waze.av.d.k) this.f36584e, this.f36582c, this.f36583d, eVar, 2, null);
        }
        return new fz(this.f36581b, (com.waze.navigate.location_preview.ay) this.f36584e, this.f36582c, this.f36583d, eVar, 1);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f36585f;
        return i2 != 0 ? i2 != 1 ? ((fz) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((fz) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((fz) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        com.waze.ui.m.t tVar;
        int i2 = this.f36585f;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f36580a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                ft ftVar = this.f36581b;
                Object obj2 = this.f36584e;
                this.f36580a = 1;
                obj = ftVar.d((com.waze.av.d.k) obj2, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            this.f36582c.f48105a = this.f36583d.invoke(new com.waze.car_lib.r.fl((h.o.a) obj, 20));
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f36580a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                ft ftVar2 = this.f36581b;
                Object obj3 = this.f36584e;
                this.f36580a = 1;
                obj = ftVar2.c((com.waze.navigate.location_preview.ay) obj3, this);
                if (obj == aVar2) {
                    return aVar2;
                }
            }
            this.f36582c.f48105a = this.f36583d.invoke(new com.waze.car_lib.r.fl((DriveTo.DangerZoneType) obj, 18));
            return h.ab.f48028a;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        if (this.f36580a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            ft ftVar3 = this.f36581b;
            Object obj4 = this.f36584e;
            this.f36580a = 1;
            obj = ftVar3.e((com.waze.av.d.k) obj4, this);
            if (obj == aVar3) {
                return aVar3;
            }
        }
        com.waze.av.d.h hVar = (com.waze.av.d.h) obj;
        if (hVar != null) {
            List<com.waze.av.d.g> listC = hVar.c();
            ArrayList arrayList = new ArrayList(h.a.i.q(listC, 10));
            for (com.waze.av.d.g gVar : listC) {
                arrayList.add(new com.waze.ui.m.s(gVar.b(), gVar.c(), gVar.a()));
            }
            tVar = new com.waze.ui.m.t(arrayList, hVar.b(), hVar.a());
        } else {
            tVar = null;
        }
        this.f36582c.f48105a = this.f36583d.invoke(new com.waze.config.cv(tVar, 1));
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fz(ft ftVar, com.waze.av.d.k kVar, h.g.b.aq aqVar, h.g.a.l lVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f36585f = i2;
        this.f36581b = ftVar;
        this.f36584e = kVar;
        this.f36582c = aqVar;
        this.f36583d = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fz(ft ftVar, com.waze.navigate.location_preview.ay ayVar, h.g.b.aq aqVar, h.g.a.l lVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f36585f = i2;
        this.f36581b = ftVar;
        this.f36584e = ayVar;
        this.f36582c = aqVar;
        this.f36583d = lVar;
    }
}
