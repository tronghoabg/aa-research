package com.waze.stats;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ab implements u {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f40496a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f40497b;

    public ab(com.waze.shared_infra.i.e eVar, int i2) {
        this.f40497b = i2;
        h.g.b.x.f(eVar, "logger");
        this.f40496a = eVar;
    }

    @Override // com.waze.stats.u
    public final /* synthetic */ long a(Object obj) {
        int i2 = this.f40497b;
        if (i2 == 0) {
            com.waze.n.z zVar = (com.waze.n.z) obj;
            h.g.b.x.f(zVar, "stat");
            return TimeUnit.SECONDS.toMillis(zVar.getMetadata().getEventClientTimestamp().getSeconds());
        }
        if (i2 != 1) {
            com.waze.n.am amVar = (com.waze.n.am) obj;
            h.g.b.x.f(amVar, "stat");
            return TimeUnit.SECONDS.toMillis(amVar.getMetadata().getEventClientTimestamp().getSeconds());
        }
        com.waze.ch.a.a.b bVar = (com.waze.ch.a.a.b) obj;
        h.g.b.x.f(bVar, "stat");
        return TimeUnit.SECONDS.toMillis(bVar.getMetadata().getEventClientTimestamp().getSeconds());
    }

    @Override // com.waze.stats.u
    public final /* synthetic */ Object b(byte[] bArr) {
        Object objA;
        Object objA2;
        Object objA3;
        int i2 = this.f40497b;
        if (i2 == 0) {
            h.g.b.x.f(bArr, "byteArray");
            try {
                objA = com.waze.n.z.parseFrom(bArr);
            } catch (Throwable th) {
                objA = e.b.c.a(th);
            }
            Throwable thC = h.m.c(objA);
            if (thC != null) {
                com.waze.shared_infra.i.e eVar = this.f40496a;
                Objects.toString(thC);
                eVar.b("Failed parsing stat from DB: ".concat(thC.toString()));
            }
            return (com.waze.n.z) (true != (objA instanceof h.l) ? objA : null);
        }
        if (i2 != 1) {
            h.g.b.x.f(bArr, "byteArray");
            try {
                objA3 = com.waze.n.am.parseFrom(bArr);
            } catch (Throwable th2) {
                objA3 = e.b.c.a(th2);
            }
            Throwable thC2 = h.m.c(objA3);
            if (thC2 != null) {
                com.waze.shared_infra.i.e eVar2 = this.f40496a;
                Objects.toString(thC2);
                eVar2.b("Failed parsing stat from DB: ".concat(thC2.toString()));
            }
            return (com.waze.n.am) (true != (objA3 instanceof h.l) ? objA3 : null);
        }
        h.g.b.x.f(bArr, "byteArray");
        try {
            objA2 = com.waze.ch.a.a.b.parseFrom(bArr);
        } catch (Throwable th3) {
            objA2 = e.b.c.a(th3);
        }
        Throwable thC3 = h.m.c(objA2);
        if (thC3 != null) {
            com.waze.shared_infra.i.e eVar3 = this.f40496a;
            Objects.toString(thC3);
            eVar3.b("Failed parsing ad event from DB: ".concat(thC3.toString()));
        }
        return (com.waze.ch.a.a.b) (true != (objA2 instanceof h.l) ? objA2 : null);
    }

    @Override // com.waze.stats.u
    public final /* synthetic */ byte[] c(Object obj) {
        int i2 = this.f40497b;
        if (i2 == 0) {
            com.waze.n.z zVar = (com.waze.n.z) obj;
            h.g.b.x.f(zVar, "stat");
            byte[] byteArray = zVar.toByteArray();
            h.g.b.x.e(byteArray, "toByteArray(...)");
            return byteArray;
        }
        if (i2 != 1) {
            com.waze.n.am amVar = (com.waze.n.am) obj;
            h.g.b.x.f(amVar, "stat");
            byte[] byteArray2 = amVar.toByteArray();
            h.g.b.x.e(byteArray2, "toByteArray(...)");
            return byteArray2;
        }
        com.waze.ch.a.a.b bVar = (com.waze.ch.a.a.b) obj;
        h.g.b.x.f(bVar, "stat");
        byte[] byteArray3 = bVar.toByteArray();
        h.g.b.x.e(byteArray3, "toByteArray(...)");
        return byteArray3;
    }

    public ab(com.waze.shared_infra.i.e eVar, int i2, byte[] bArr) {
        this.f40497b = i2;
        h.g.b.x.f(eVar, "logger");
        this.f40496a = eVar;
    }

    public ab(com.waze.shared_infra.i.e eVar, int i2, char[] cArr) {
        this.f40497b = i2;
        h.g.b.x.f(eVar, "logger");
        this.f40496a = eVar;
    }
}
