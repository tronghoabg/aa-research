package com.waze.planned_drive;

import com.waze.navigate.AddressItem;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ar extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f33198a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f33199b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f33200c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f33201d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(ay ayVar, AddressItem addressItem, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f33201d = i2;
        this.f33199b = ayVar;
        this.f33200c = addressItem;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f33201d;
        Object obj2 = this.f33199b;
        if (i2 != 0) {
            return new ar((com.waze.shared_infra.s.c) obj2, (ay) this.f33200c, eVar, 1);
        }
        return new ar((ay) obj2, (AddressItem) this.f33200c, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f33201d != 0 ? ((ar) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ar) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f33201d != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f33198a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f33198a = 1;
                obj = ((com.waze.shared_infra.s.c) this.f33199b).a().c(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            if (obj == com.waze.modules.navigation.al.f30301a) {
                ((ay) this.f33200c).M();
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f33198a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            Object obj2 = this.f33199b;
            Object obj3 = this.f33200c;
            com.waze.places.g gVarG = ay.g((ay) obj2);
            String meetingId = ((AddressItem) obj3).getMeetingId();
            h.g.b.x.e(meetingId, "getMeetingId(...)");
            this.f33198a = 1;
            obj = gVarG.a(meetingId, this);
            if (obj == aVar2) {
                return aVar2;
            }
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Object obj4 = this.f33199b;
        if (zBooleanValue) {
            ((ay) obj4).N();
        } else {
            Object obj5 = this.f33200c;
            ((ay) obj4).m.g("PlannedDriveListFragment: removeCalendarEvent " + ((AddressItem) obj5).getMeetingId() + " failed");
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(com.waze.shared_infra.s.c cVar, ay ayVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f33201d = i2;
        this.f33199b = cVar;
        this.f33200c = ayVar;
    }
}
