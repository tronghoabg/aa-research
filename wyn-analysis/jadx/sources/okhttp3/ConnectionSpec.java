package okhttp3;

import A7.AbstractC0279p0;
import ff.o;
import hf.C2819a;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.TlsVersion;
import okhttp3.internal.Util;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/ConnectionSpec;", "", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConnectionSpec {

    /* renamed from: e, reason: collision with root package name */
    public static final ConnectionSpec f42223e;

    /* renamed from: f, reason: collision with root package name */
    public static final ConnectionSpec f42224f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f42225a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f42226b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f42227c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f42228d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/ConnectionSpec$Builder;", "", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public boolean f42229a;

        /* renamed from: b, reason: collision with root package name */
        public String[] f42230b;

        /* renamed from: c, reason: collision with root package name */
        public String[] f42231c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f42232d;

        public Builder(boolean z2) {
            this.f42229a = z2;
        }

        public final ConnectionSpec a() {
            return new ConnectionSpec(this.f42229a, this.f42232d, this.f42230b, this.f42231c);
        }

        public final void b(String... cipherSuites) {
            AbstractC3340k.e(cipherSuites, "cipherSuites");
            if (!this.f42229a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.f42230b = (String[]) cipherSuites.clone();
        }

        public final void c(CipherSuite... cipherSuites) {
            AbstractC3340k.e(cipherSuites, "cipherSuites");
            if (!this.f42229a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (CipherSuite cipherSuite : cipherSuites) {
                arrayList.add(cipherSuite.f42221a);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            String[] strArr = (String[]) array;
            b((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final void d(String... tlsVersions) {
            AbstractC3340k.e(tlsVersions, "tlsVersions");
            if (!this.f42229a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f42231c = (String[]) tlsVersions.clone();
        }

        public final void e(TlsVersion... tlsVersionArr) {
            if (!this.f42229a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersionArr.length);
            for (TlsVersion tlsVersion : tlsVersionArr) {
                arrayList.add(tlsVersion.f42437a);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            String[] strArr = (String[]) array;
            d((String[]) Arrays.copyOf(strArr, strArr.length));
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokhttp3/ConnectionSpec$Companion;", "", "()V", "APPROVED_CIPHER_SUITES", "", "Lokhttp3/CipherSuite;", "[Lokhttp3/CipherSuite;", "CLEARTEXT", "Lokhttp3/ConnectionSpec;", "COMPATIBLE_TLS", "MODERN_TLS", "RESTRICTED_CIPHER_SUITES", "RESTRICTED_TLS", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i5) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
        CipherSuite cipherSuite = CipherSuite.f42218r;
        CipherSuite cipherSuite2 = CipherSuite.f42219s;
        CipherSuite cipherSuite3 = CipherSuite.f42220t;
        CipherSuite cipherSuite4 = CipherSuite.f42212l;
        CipherSuite cipherSuite5 = CipherSuite.f42214n;
        CipherSuite cipherSuite6 = CipherSuite.f42213m;
        CipherSuite cipherSuite7 = CipherSuite.f42215o;
        CipherSuite cipherSuite8 = CipherSuite.f42217q;
        CipherSuite cipherSuite9 = CipherSuite.f42216p;
        CipherSuite[] cipherSuiteArr = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9};
        CipherSuite[] cipherSuiteArr2 = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9, CipherSuite.f42211j, CipherSuite.k, CipherSuite.f42209h, CipherSuite.f42210i, CipherSuite.f42207f, CipherSuite.f42208g, CipherSuite.f42206e};
        Builder builder = new Builder(true);
        builder.c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr, 9));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        builder.e(tlsVersion, tlsVersion2);
        if (!builder.f42229a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        builder.f42232d = true;
        builder.a();
        Builder builder2 = new Builder(true);
        builder2.c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, 16));
        builder2.e(tlsVersion, tlsVersion2);
        if (!builder2.f42229a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        builder2.f42232d = true;
        f42223e = builder2.a();
        Builder builder3 = new Builder(true);
        builder3.c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, 16));
        builder3.e(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0);
        if (!builder3.f42229a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        builder3.f42232d = true;
        builder3.a();
        f42224f = new Builder(false).a();
    }

    public ConnectionSpec(boolean z2, boolean z10, String[] strArr, String[] strArr2) {
        this.f42225a = z2;
        this.f42226b = z10;
        this.f42227c = strArr;
        this.f42228d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f42227c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(CipherSuite.f42203b.b(str));
        }
        return o.S0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f42225a) {
            return false;
        }
        String[] strArr = this.f42228d;
        if (strArr != null && !Util.i(strArr, sSLSocket.getEnabledProtocols(), C2819a.f36430b)) {
            return false;
        }
        String[] strArr2 = this.f42227c;
        if (strArr2 == null) {
            return true;
        }
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        CipherSuite.f42203b.getClass();
        return Util.i(strArr2, enabledCipherSuites, CipherSuite.f42204c);
    }

    public final List c() {
        String[] strArr = this.f42228d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            TlsVersion.f42430b.getClass();
            arrayList.add(TlsVersion.Companion.a(str));
        }
        return o.S0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConnectionSpec)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ConnectionSpec connectionSpec = (ConnectionSpec) obj;
        boolean z2 = connectionSpec.f42225a;
        boolean z10 = this.f42225a;
        if (z10 != z2) {
            return false;
        }
        if (z10) {
            return Arrays.equals(this.f42227c, connectionSpec.f42227c) && Arrays.equals(this.f42228d, connectionSpec.f42228d) && this.f42226b == connectionSpec.f42226b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f42225a) {
            return 17;
        }
        String[] strArr = this.f42227c;
        int iHashCode = (527 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        String[] strArr2 = this.f42228d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f42226b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f42225a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb2 = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb2.append((Object) Objects.toString(a(), "[all enabled]"));
        sb2.append(", tlsVersions=");
        sb2.append((Object) Objects.toString(c(), "[all enabled]"));
        sb2.append(", supportsTlsExtensions=");
        return AbstractC0279p0.p(sb2, this.f42226b, ')');
    }
}
