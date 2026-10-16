package defpackage;

import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* loaded from: classes2.dex */
public final class ajmf implements ajmg {
    private ajmg a;
    private final ajmd b;

    public ajmf(ajmd ajmdVar) {
        this.b = ajmdVar;
    }

    private final synchronized ajmg e(SSLSocket sSLSocket) {
        if (this.a == null && this.b.a(sSLSocket)) {
            Class<?> cls = sSLSocket.getClass();
            Class<?> superclass = cls;
            while (superclass != null && !affa.f(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    Objects.toString(cls);
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type ".concat(String.valueOf(cls)));
                }
            }
            superclass.getClass();
            this.a = new ajme(superclass);
        }
        return this.a;
    }

    @Override // defpackage.ajmg
    public final String a(SSLSocket sSLSocket) {
        ajmg ajmgVarE = e(sSLSocket);
        if (ajmgVarE != null) {
            return ajmgVarE.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.ajmg
    public final void b(SSLSocket sSLSocket, String str, List list) {
        ajmg ajmgVarE = e(sSLSocket);
        if (ajmgVarE != null) {
            ajmgVarE.b(sSLSocket, str, list);
        }
    }

    @Override // defpackage.ajmg
    public final boolean c() {
        return true;
    }

    @Override // defpackage.ajmg
    public final boolean d(SSLSocket sSLSocket) {
        return this.b.a(sSLSocket);
    }
}
