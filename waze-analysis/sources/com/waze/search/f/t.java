package com.waze.search.f;

import com.waze.search.h.bx;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final /* synthetic */ class t extends h.g.b.u implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f35752a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(Object obj, int i2) {
        super(1, obj, bx.class, "updateContactsPermissionState", "updateContactsPermissionState(Lcom/waze/search/model/PermissionState;)V", 0);
        this.f35752a = i2;
    }

    @Override // h.g.a.l
    public final /* synthetic */ Object invoke(Object obj) {
        if (this.f35752a != 0) {
            com.waze.search.v2.o oVar = (com.waze.search.v2.o) obj;
            h.g.b.x.f(oVar, "p0");
            ((bx) this.receiver).M(oVar);
            return ab.f48028a;
        }
        com.waze.search.v2.o oVar2 = (com.waze.search.v2.o) obj;
        h.g.b.x.f(oVar2, "p0");
        ((bx) this.receiver).N(oVar2);
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(Object obj, int i2, byte[] bArr) {
        super(1, obj, bx.class, "updateCalendarPermissionState", "updateCalendarPermissionState(Lcom/waze/search/model/PermissionState;)V", 0);
        this.f35752a = i2;
    }
}
