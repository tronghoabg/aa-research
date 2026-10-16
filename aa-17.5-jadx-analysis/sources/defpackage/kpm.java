package defpackage;

import j$.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class kpm implements zge {
    final /* synthetic */ UUID a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;
    final /* synthetic */ kpn d;

    public kpm(kpn kpnVar, UUID uuid, long j, long j2) {
        this.a = uuid;
        this.b = j;
        this.c = j2;
        this.d = kpnVar;
    }

    @Override // defpackage.zge
    public final void a(Throwable th) {
        kpn kpnVar = this.d;
        UUID uuidR = kpn.r((knb) kpnVar.e.get());
        UUID uuid = this.a;
        if (!Objects.equals(uuid, uuidR)) {
            ((ype) ((ype) kpn.a.f()).ai((char) 3338)).y("dropped heartbeat failure. session %s obsolete.", uuid);
        } else {
            ((ype) ((ype) ((ype) kpn.a.g()).p(th)).ai((char) 3337)).u("Error checking connection status");
            kpnVar.t(yxi.CONNECTION_STATUS_QUERY_FAILURE);
        }
    }

    @Override // defpackage.zge
    public final /* synthetic */ void b(Object obj) {
        kpn kpnVar = this.d;
        AtomicReference atomicReference = kpnVar.e;
        Boolean bool = (Boolean) obj;
        UUID uuidR = kpn.r((knb) atomicReference.get());
        UUID uuid = this.a;
        if (!Objects.equals(uuid, uuidR)) {
            ((ype) ((ype) kpn.a.f()).ai((char) 3340)).y("dropped heartbeat callback. session %s obsolete.", uuid);
            return;
        }
        if (this.b > kpnVar.j) {
            kpnVar.n = bool.booleanValue();
        }
        if (bool.booleanValue()) {
            kpnVar.t(yxi.SESSION_CONNECTED);
        } else {
            if (kpnVar.g != this.c) {
                return;
            }
            ((ype) ((ype) kpn.a.f()).ai(3339)).y("Stopped session %s", ((knb) atomicReference.get()).a);
            kpnVar.t(yxi.SESSION_STOPPED);
            kpnVar.p = 3;
        }
    }
}
