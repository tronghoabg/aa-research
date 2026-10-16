package defpackage;

import java.net.URI;

@Deprecated
/* loaded from: classes2.dex */
final class ajwn implements ajre {
    public final ajrd a;

    public ajwn(ajrd ajrdVar) {
        this.a = ajrdVar;
    }

    @Override // defpackage.ajre
    public final ajrt a(ajph ajphVar, ajpj ajpjVar, akba akbaVar) throws ajps {
        URI uriA = this.a.a(ajpjVar, akbaVar);
        return ajphVar.p().b.equalsIgnoreCase("HEAD") ? new ajrr(uriA) : new ajrq(uriA);
    }

    @Override // defpackage.ajre
    public final boolean b(ajph ajphVar, ajpj ajpjVar, akba akbaVar) throws ajps {
        return this.a.b(ajpjVar, akbaVar);
    }
}
