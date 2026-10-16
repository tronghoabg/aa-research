package okhttp3.internal.connection;

import hf.C2819a;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.CipherSuite;
import okhttp3.CipherSuite$Companion$ORDER_BY_NAME$1;
import okhttp3.ConnectionSpec;
import okhttp3.internal.Util;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/ConnectionSpecSelector;", "", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConnectionSpecSelector {

    /* renamed from: a, reason: collision with root package name */
    public final List f42546a;

    /* renamed from: b, reason: collision with root package name */
    public int f42547b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f42548c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f42549d;

    public ConnectionSpecSelector(List connectionSpecs) {
        AbstractC3340k.e(connectionSpecs, "connectionSpecs");
        this.f42546a = connectionSpecs;
    }

    public final ConnectionSpec a(SSLSocket sSLSocket) throws UnknownServiceException {
        ConnectionSpec connectionSpec;
        int i5;
        boolean z2;
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        int i10 = this.f42547b;
        List list = this.f42546a;
        int size = list.size();
        while (true) {
            if (i10 >= size) {
                connectionSpec = null;
                break;
            }
            int i11 = i10 + 1;
            connectionSpec = (ConnectionSpec) list.get(i10);
            if (connectionSpec.b(sSLSocket)) {
                this.f42547b = i11;
                break;
            }
            i10 = i11;
        }
        if (connectionSpec == null) {
            StringBuilder sb2 = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb2.append(this.f42549d);
            sb2.append(", modes=");
            sb2.append(list);
            sb2.append(", supported protocols=");
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            AbstractC3340k.b(enabledProtocols);
            String string = Arrays.toString(enabledProtocols);
            AbstractC3340k.d(string, "toString(this)");
            sb2.append(string);
            throw new UnknownServiceException(sb2.toString());
        }
        int i12 = this.f42547b;
        int size2 = list.size();
        while (true) {
            i5 = 0;
            if (i12 >= size2) {
                z2 = false;
                break;
            }
            int i13 = i12 + 1;
            if (((ConnectionSpec) list.get(i12)).b(sSLSocket)) {
                z2 = true;
                break;
            }
            i12 = i13;
        }
        this.f42548c = z2;
        boolean z10 = this.f42549d;
        String[] strArr = connectionSpec.f42227c;
        if (strArr != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            AbstractC3340k.d(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            CipherSuite.f42203b.getClass();
            cipherSuitesIntersection = Util.o(enabledCipherSuites, strArr, CipherSuite.f42204c);
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        String[] strArr2 = connectionSpec.f42228d;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            AbstractC3340k.d(enabledProtocols2, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = Util.o(enabledProtocols2, strArr2, C2819a.f36430b);
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        AbstractC3340k.d(supportedCipherSuites, "supportedCipherSuites");
        CipherSuite.f42203b.getClass();
        CipherSuite$Companion$ORDER_BY_NAME$1 comparator = CipherSuite.f42204c;
        byte[] bArr = Util.f42438a;
        AbstractC3340k.e(comparator, "comparator");
        int length = supportedCipherSuites.length;
        while (true) {
            if (i5 >= length) {
                i5 = -1;
                break;
            }
            if (comparator.compare(supportedCipherSuites[i5], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i5++;
        }
        if (z10 && i5 != -1) {
            AbstractC3340k.d(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i5];
            AbstractC3340k.d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] objArrCopyOf = Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length + 1);
            AbstractC3340k.d(objArrCopyOf, "copyOf(this, newSize)");
            cipherSuitesIntersection = (String[]) objArrCopyOf;
            cipherSuitesIntersection[cipherSuitesIntersection.length - 1] = str;
        }
        ConnectionSpec.Builder builder = new ConnectionSpec.Builder();
        builder.f42229a = connectionSpec.f42225a;
        builder.f42230b = strArr;
        builder.f42231c = strArr2;
        builder.f42232d = connectionSpec.f42226b;
        AbstractC3340k.d(cipherSuitesIntersection, "cipherSuitesIntersection");
        builder.b((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        AbstractC3340k.d(tlsVersionsIntersection, "tlsVersionsIntersection");
        builder.d((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length));
        ConnectionSpec connectionSpecA = builder.a();
        if (connectionSpecA.c() != null) {
            sSLSocket.setEnabledProtocols(connectionSpecA.f42228d);
        }
        if (connectionSpecA.a() != null) {
            sSLSocket.setEnabledCipherSuites(connectionSpecA.f42227c);
        }
        return connectionSpec;
    }
}
