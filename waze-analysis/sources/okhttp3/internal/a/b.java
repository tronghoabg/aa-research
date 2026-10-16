package okhttp3.internal.a;

import androidx.autofill.HintConstants;
import h.a.i;
import h.g.b.x;
import h.n.o;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.nio.charset.Charset;
import java.util.List;
import okhttp3.ab;
import okhttp3.ak;
import okhttp3.al;
import okhttp3.aq;
import okhttp3.au;
import okhttp3.c;
import okhttp3.k;
import okhttp3.v;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class b implements c {

    /* renamed from: b, reason: collision with root package name */
    private final v f55954b;

    public b(v vVar) {
        x.f(vVar, "defaultDns");
        this.f55954b = vVar;
    }

    private static final InetAddress b(Proxy proxy, ab abVar, v vVar) {
        Proxy.Type type = proxy.type();
        if (type != null && a.f55953a[type.ordinal()] == 1) {
            return (InetAddress) i.P(vVar.d(abVar.f()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        x.d(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        x.e(address, "getAddress(...)");
        return address;
    }

    @Override // okhttp3.c
    public final al a(au auVar, aq aqVar) {
        Proxy proxyB;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        v vVarI;
        x.f(aqVar, "response");
        List<k> listE = aqVar.e();
        al alVarI = aqVar.i();
        ab abVarG = alVarI.g();
        int iA = aqVar.a();
        if (auVar == null || (proxyB = auVar.b()) == null) {
            proxyB = Proxy.NO_PROXY;
        }
        for (k kVar : listE) {
            if (o.m("Basic", kVar.b(), true)) {
                v vVar = (auVar == null || (vVarI = auVar.c().i()) == null) ? this.f55954b : vVarI;
                boolean z = iA == 407;
                if (z) {
                    SocketAddress socketAddressAddress = proxyB.address();
                    x.d(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    x.c(proxyB);
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(proxyB, abVarG, vVar), inetSocketAddress.getPort(), abVarG.h(), kVar.a(), kVar.b(), abVarG.j(), Authenticator.RequestorType.PROXY);
                } else {
                    String strF = abVarG.f();
                    x.c(proxyB);
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strF, b(proxyB, abVarG, vVar), abVarG.a(), abVarG.h(), kVar.a(), kVar.b(), abVarG.j(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = true != z ? "Authorization" : "Proxy-Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    x.e(userName, "getUserName(...)");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    x.e(password, "getPassword(...)");
                    String str2 = new String(password);
                    Charset charsetC = kVar.c();
                    x.f(userName, HintConstants.AUTOFILL_HINT_USERNAME);
                    x.f(str2, HintConstants.AUTOFILL_HINT_PASSWORD);
                    x.f(charsetC, "charset");
                    String str3 = userName + ":" + str2;
                    k.k kVar2 = k.k.f50843a;
                    x.f(str3, "<this>");
                    x.f(charsetC, "charset");
                    byte[] bytes = str3.getBytes(charsetC);
                    x.e(bytes, "getBytes(...)");
                    return new ak(alVarI).c(str, "Basic ".concat(new k.k(bytes).g())).k();
                }
            }
        }
        return null;
    }
}
