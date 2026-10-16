package defpackage;

import android.net.LinkProperties;
import android.net.Network;
import android.net.wifi.WifiInfo;
import j$.util.Objects;
import j$.util.OptionalInt;

/* loaded from: classes2.dex */
final class peu implements ozs {
    final /* synthetic */ pew a;
    private final String b;
    private final int c;

    public peu(pew pewVar, String str, int i) {
        this.a = pewVar;
        this.b = str;
        this.c = i;
    }

    private final void d(Network network, String str, int i) {
        ((ype) ((ype) pew.a.f()).ai((char) 6420)).u("WPP on TCP connected to the WiFi network");
        pew pewVar = this.a;
        kny knyVar = pewVar.d;
        knyVar.d(yxi.WIRELESS_WIFI_PROJECTION_PROTOCOL_TCP_NETWORK_CONNECTED);
        pek pekVar = new pek(network, str, i);
        pewVar.c();
        gjv gjvVar = pewVar.j;
        woy.aa(gjvVar.v() instanceof peg, "Socket creation called from wrong lifecycle state");
        gjvVar.w(peh.a);
        pep pepVar = new pep(pewVar.b, pewVar.h, knyVar, pekVar, new pev(pewVar));
        final ajmd ajmdVar = new ajmd(pewVar);
        pewVar.g.a(pepVar, null, new tkw() { // from class: tkq
            @Override // defpackage.tkw
            public final void a(tkv tkvVar) {
                yph yphVar = tla.a;
                pet petVar = (pet) ((tkt) tkvVar).a;
                pew pewVar2 = (pew) ajmdVar.a;
                pewVar2.c();
                Objects.checkIndex(0, 4);
                if (petVar instanceof pes) {
                    try {
                        ozz ozzVar = ((pes) petVar).a;
                        ((ype) ((ype) pew.a.f()).ai((char) 6433)).u("WPP starting to listen for messages");
                        ozzVar.c();
                        gjv gjvVar2 = pewVar2.j;
                        woy.aa(gjvVar2.v() instanceof peh, "Socket connection result called from wrong lifecycle state");
                        gjvVar2.w(new pef(ozzVar));
                        pewVar2.i.c();
                        return;
                    } catch (Throwable th) {
                        throw new RuntimeException(th.toString(), th);
                    }
                }
                Object[] objArr = ped.a;
                Object obj = objArr[0];
                if (obj == null) {
                    try {
                        obj = peq.valueOf("INSTANCE");
                    } catch (Throwable unused) {
                        obj = null;
                    }
                    if (obj == null) {
                        obj = new Object();
                    }
                    objArr[0] = obj;
                }
                if (petVar == obj) {
                    ((ype) ((ype) pew.a.f()).ai((char) 6434)).u("Received failure result from WPP attempt");
                    pewVar2.d(ozr.b);
                    return;
                }
                Object[] objArr2 = ped.a;
                Object obj2 = objArr2[1];
                if (obj2 == null) {
                    try {
                        obj2 = per.valueOf("INSTANCE");
                    } catch (Throwable unused2) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        obj2 = new Object();
                    }
                    objArr2[1] = obj2;
                }
                if (petVar != obj2) {
                    throw new RuntimeException(null, null);
                }
                throw new IllegalStateException("Interrupted result was unexpectedly relayed");
            }
        });
    }

    @Override // defpackage.ozs
    public final void a(WifiInfo wifiInfo, Network network, LinkProperties linkProperties) {
        pew pewVar = this.a;
        pewVar.c();
        wer.c();
        ((ype) pgr.a.l().ai((char) 6479)).u("WPP TCP network connection available.");
        ((pgr) pewVar.k.a).z(wifiInfo);
        String str = this.b;
        if (!Objects.equals(str, "0.0.0.0")) {
            pewVar.d.d(yxi.WIRELESS_WIFI_USING_STATIC_SERVER_IP);
            d(network, str, this.c);
        } else {
            linkProperties.getClass();
            String hostAddress = linkProperties.getDhcpServerAddress().getHostAddress();
            pewVar.d.d(yxi.WIRELESS_WIFI_USING_DYNAMIC_SERVER_IP);
            d(network, hostAddress, this.c);
        }
    }

    @Override // defpackage.ozs
    public final void b(ozr ozrVar) {
        pew pewVar = this.a;
        pewVar.c();
        pewVar.d.d(yxi.WIRELESS_WIFI_PROJECTION_PROTOCOL_TCP_NETWORK_LOST);
        if ((aczv.aq() || (hrp.a() && aczv.ar())) && !ozrVar.equals(ozr.v)) {
            ((ype) ((ype) pew.a.f()).ai((char) 6422)).y("WiFi network is lost, reason: %s", ozrVar.name());
            pewVar.d(ozrVar);
        } else {
            ((ype) ((ype) pew.a.f()).ai((char) 6421)).u("WiFi network is lost, WPP on TCP should restart");
            if (pewVar.j.v() instanceof pef) {
                pewVar.d(ozr.d);
            } else {
                pewVar.d(ozr.b);
            }
        }
    }

    @Override // defpackage.ozs
    public final void c(ozr ozrVar) {
        pew pewVar = this.a;
        pewVar.c();
        ((ype) ((ype) pew.a.f()).ai((char) 6423)).y("Restarting WPP over TCP, connection failure reason: %s", ozrVar);
        pewVar.d.e(yxi.WIRELESS_WIFI_PROJECTION_PROTOCOL_TCP_NETWORK_UNAVAILABLE, OptionalInt.of(ozrVar.a()));
        pewVar.d(ozrVar);
    }

    public final String toString() {
        return "WPPMgr.Callback@".concat(String.valueOf(Integer.toHexString(hashCode())));
    }
}
