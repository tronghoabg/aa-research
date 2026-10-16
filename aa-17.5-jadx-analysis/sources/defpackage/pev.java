package defpackage;

/* loaded from: classes2.dex */
final class pev implements paa {
    final /* synthetic */ pew a;

    public pev(pew pewVar) {
        this.a = pewVar;
    }

    @Override // defpackage.paa
    public final void a(xpr xprVar, abow abowVar) {
        pew pewVar = this.a;
        pewVar.c();
        xprVar.name();
        pewVar.i.a(pewVar, xprVar, abowVar);
    }

    @Override // defpackage.paa
    public final void b() {
        pew pewVar = this.a;
        pewVar.c();
        ((ype) ((ype) pew.a.g()).ai((char) 6425)).u("WPP on TCP connection was closed by the peer");
        pewVar.d.d(yxi.WIRELESS_WIFI_PROJECTION_PROTOCOL_TCP_TRANSPORT_CLOSED_BY_PEER);
        pewVar.d(ozr.e);
    }

    @Override // defpackage.paa
    public final void c() {
        pew pewVar = this.a;
        pewVar.c();
        ((ype) ((ype) pew.a.g()).ai((char) 6427)).u("WPP on TCP connection failed to read");
        pewVar.d.d(yxi.WIRELESS_WIFI_PROJECTION_PROTOCOL_TCP_TRANSPORT_READ_FAILURE);
        pewVar.d(ozr.d);
    }

    @Override // defpackage.paa
    public final void d(xpr xprVar, abow abowVar) {
        pew pewVar = this.a;
        pewVar.c();
        if (aczv.aI()) {
            pewVar.d.d(yxi.WIRELESS_WIFI_PROJECTION_PROTOCOL_TCP_TRANSPORT_INVALID_MESSAGE_PROTO_READ);
        }
        if (aczv.aA()) {
            ((ype) ((ype) pew.a.h()).ai((char) 6429)).y("Invalid payload read for message type %s. Restarting WPP.", xprVar.name());
            pewVar.d(ozr.d);
        } else {
            ((ype) ((ype) pew.a.h()).ai((char) 6428)).y("Invalid payload read for message type %s. Processing default message.", xprVar.name());
            a(xprVar, abowVar);
        }
    }

    @Override // defpackage.paa
    public final void e() {
        pew pewVar = this.a;
        pewVar.c();
        ((ype) ((ype) pew.a.g()).ai((char) 6430)).u("WPP on TCP connection failed to write");
        pewVar.d.d(yxi.WIRELESS_WIFI_PROJECTION_PROTOCOL_TCP_TRANSPORT_WRITE_FAILURE);
        pewVar.d(ozr.d);
    }

    @Override // defpackage.paa
    public final void f(int i) {
        pew pewVar = this.a;
        pewVar.c();
        if (aczv.aI()) {
            pewVar.d.d(i + (-1) != 0 ? yxi.WIRELESS_WIFI_PROJECTION_PROTOCOL_TCP_TRANSPORT_INVALID_MESSAGE_TYPE_READ : yxi.WIRELESS_WIFI_PROJECTION_PROTOCOL_TCP_TRANSPORT_INVALID_MESSAGE_LENGTH_READ);
        }
        if (aczv.aA() || i == 1) {
            ((ype) ((ype) pew.a.g()).ai((char) 6426)).u("WPP on TCP connection read an invalid message");
            pewVar.d(ozr.d);
        }
    }
}
