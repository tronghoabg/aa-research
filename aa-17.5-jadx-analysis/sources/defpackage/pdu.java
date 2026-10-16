package defpackage;

/* loaded from: classes2.dex */
final class pdu implements paa {
    final /* synthetic */ pdy a;

    public pdu(pdy pdyVar) {
        this.a = pdyVar;
    }

    private final void g(ozr ozrVar) {
        ((ype) pdy.a.f()).y("Retrying connection attempt on all channels due to %s", ozrVar);
        this.a.e(ozrVar);
    }

    @Override // defpackage.paa
    public final void a(xpr xprVar, abow abowVar) {
        abowVar.getClass();
        yph yphVar = pdy.a;
        xprVar.name();
        pdy pdyVar = this.a;
        pdyVar.g.a(pdyVar, xprVar, abowVar);
    }

    @Override // defpackage.paa
    public final void b() {
        this.a.d(yxi.WIRELESS_RFCOMM_CONNECTION_CLOSED_BY_PEER, null);
        g(ozr.e);
    }

    @Override // defpackage.paa
    public final void c() {
        this.a.d(yxi.WIRELESS_RFCOMM_READ_ERROR, null);
        g(ozr.d);
    }

    @Override // defpackage.paa
    public final void d(xpr xprVar, abow abowVar) {
        abowVar.getClass();
        if (aczv.aI()) {
            this.a.d(yxi.WIRELESS_WIFI_PROJECTION_PROTOCOL_RFCOMM_INVALID_MESSAGE_PROTO_READ, null);
        }
        if (aczv.aA()) {
            ((ype) pdy.a.h()).y("Invalid payload read for message type %s. Restarting WPP.", xprVar.name());
            g(ozr.d);
        } else {
            ((ype) pdy.a.h()).y("Invalid payload read for message type %s. Processing default message.", xprVar.name());
            a(xprVar, abowVar);
        }
    }

    @Override // defpackage.paa
    public final void e() {
        this.a.d(yxi.WIRELESS_RFCOMM_WRITE_ERROR, null);
        g(ozr.d);
    }

    @Override // defpackage.paa
    public final void f(int i) {
        if (aczv.aI()) {
            this.a.d(i + (-1) != 0 ? yxi.WIRELESS_WIFI_PROJECTION_PROTOCOL_RFCOMM_INVALID_MESSAGE_TYPE_READ : yxi.WIRELESS_WIFI_PROJECTION_PROTOCOL_RFCOMM_INVALID_MESSAGE_LENGTH_READ, null);
        }
        if (aczv.aA() || i == 1) {
            g(ozr.d);
        }
    }
}
