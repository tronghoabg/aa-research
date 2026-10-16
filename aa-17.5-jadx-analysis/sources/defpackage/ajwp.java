package defpackage;

import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes2.dex */
public final class ajwp extends ajvx {
    @Override // defpackage.ajqq
    public final Map b(ajpj ajpjVar) throws ajqm {
        return e(ajpjVar.m("WWW-Authenticate"));
    }

    @Override // defpackage.ajqq
    public final boolean c(ajpj ajpjVar) {
        return ajpjVar.p().b == 401;
    }

    @Override // defpackage.ajvx
    protected final List d(ajpj ajpjVar) {
        List list = (List) ajpjVar.hX().a("http.auth.target-scheme-pref");
        return list != null ? list : ajvx.a;
    }
}
