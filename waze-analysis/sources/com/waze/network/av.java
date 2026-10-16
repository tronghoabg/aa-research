package com.waze.network;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class av implements okhttp3.g {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aw f31901a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f31902b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f31903c;

    av(aw awVar, long j2, int i2) {
        this.f31903c = i2;
        this.f31901a = awVar;
        this.f31902b = j2;
    }

    @Override // okhttp3.g
    public final void a(okhttp3.f fVar, IOException iOException) {
        int i2 = this.f31903c;
        if (i2 == 0) {
            h.g.b.x.f(fVar, NotificationCompat.CATEGORY_CALL);
            h.g.b.x.f(iOException, "e");
            Objects.toString(iOException);
            com.waze.shared_infra.i.h.a("HTTPPost failed ".concat(iOException.toString()));
            this.f31901a.f31904a.a(this.f31902b, 1, -1);
            return;
        }
        if (i2 == 1) {
            h.g.b.x.f(fVar, NotificationCompat.CATEGORY_CALL);
            h.g.b.x.f(iOException, "e");
            this.f31901a.f31904a.a(this.f31902b, 1, -1);
            return;
        }
        h.g.b.x.f(fVar, NotificationCompat.CATEGORY_CALL);
        h.g.b.x.f(iOException, "e");
        aw awVar = this.f31901a;
        com.waze.shared_infra.i.e eVar = awVar.f31906c;
        Objects.toString(iOException);
        eVar.a("HTTPPostFile failed ".concat(iOException.toString()));
        awVar.f31904a.a(this.f31902b, 1, -1);
    }

    @Override // okhttp3.g
    public final void b(okhttp3.f fVar, okhttp3.aq aqVar) {
        int i2 = this.f31903c;
        if (i2 == 0) {
            h.g.b.x.f(fVar, NotificationCompat.CATEGORY_CALL);
            h.g.b.x.f(aqVar, "response");
            if (aqVar.o()) {
                com.waze.shared_infra.i.h.a("HTTPPost success");
                at atVar = this.f31901a.f31904a;
                okhttp3.at atVarM = aqVar.m();
                atVar.b(atVarM != null ? atVarM.d() : null, null, this.f31902b);
                return;
            }
            com.waze.shared_infra.i.h.a("HTTPPost not successful " + aqVar.a());
            this.f31901a.f31904a.a(this.f31902b, 0, aqVar.a());
            return;
        }
        if (i2 != 1) {
            h.g.b.x.f(fVar, NotificationCompat.CATEGORY_CALL);
            h.g.b.x.f(aqVar, "response");
            boolean zO = aqVar.o();
            aw awVar = this.f31901a;
            if (!zO) {
                awVar.f31904a.a(this.f31902b, 0, aqVar.a());
                return;
            }
            awVar.f31906c.a("HTTPPostFile success");
            at atVar2 = awVar.f31904a;
            okhttp3.at atVarM2 = aqVar.m();
            atVar2.b(atVarM2 != null ? atVarM2.d() : null, null, this.f31902b);
            return;
        }
        h.g.b.x.f(fVar, NotificationCompat.CATEGORY_CALL);
        h.g.b.x.f(aqVar, "response");
        boolean zO2 = aqVar.o();
        aw awVar2 = this.f31901a;
        if (!zO2) {
            awVar2.f31904a.a(this.f31902b, 0, aqVar.a());
            return;
        }
        String strP = okhttp3.aq.p(aqVar, awVar2.f31907d);
        at atVar3 = awVar2.f31904a;
        okhttp3.at atVarM3 = aqVar.m();
        atVar3.b(atVarM3 != null ? atVarM3.d() : null, strP, this.f31902b);
    }
}
