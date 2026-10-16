package defpackage;

import java.net.InetAddress;
import java.util.Collections;

@Deprecated
/* loaded from: classes2.dex */
public final class ajxj implements ajth {
    protected final ajtt a;

    public ajxj(ajtt ajttVar) {
        ahgm.e(ajttVar, "Scheme registry");
        this.a = ajttVar;
    }

    @Override // defpackage.ajth
    public final ajtg a(ajpe ajpeVar, ajph ajphVar) throws ajpd {
        ahgm.e(ajphVar, "HTTP request");
        akas akasVarHX = ajphVar.hX();
        ajpe ajpeVar2 = ajtf.a;
        ahgm.e(akasVarHX, "Parameters");
        ajtg ajtgVar = (ajtg) akasVarHX.a("http.route.forced-route");
        if (ajtgVar != null && ajtf.b.equals(ajtgVar)) {
            ajtgVar = null;
        }
        if (ajtgVar != null) {
            return ajtgVar;
        }
        ahkp.c(ajpeVar, "Target host");
        akas akasVarHX2 = ajphVar.hX();
        ahgm.e(akasVarHX2, "Parameters");
        InetAddress inetAddress = (InetAddress) akasVarHX2.a("http.route.local-address");
        akas akasVarHX3 = ajphVar.hX();
        ahgm.e(akasVarHX3, "Parameters");
        ajpe ajpeVar3 = (ajpe) akasVarHX3.a("http.route.default-proxy");
        ajpe ajpeVar4 = (ajpeVar3 == null || !ajtf.a.equals(ajpeVar3)) ? ajpeVar3 : null;
        try {
            boolean z = this.a.a(ajpeVar.d).d;
            if (ajpeVar4 == null) {
                return new ajtg(ajpeVar, inetAddress, Collections.EMPTY_LIST, z, ajtj.a, ajti.a);
            }
            return new ajtg(ajpeVar, inetAddress, Collections.singletonList(ajpeVar4), z, z ? ajtj.b : ajtj.a, z ? ajti.b : ajti.a);
        } catch (IllegalStateException e) {
            throw new ajpd(e.getMessage());
        }
    }
}
