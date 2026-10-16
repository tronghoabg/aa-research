package okhttp3;

import com.waze.strings.DisplayStrings;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f56315a;

    /* renamed from: b, reason: collision with root package name */
    public static final o f56316b;

    /* renamed from: c, reason: collision with root package name */
    private static final m[] f56317c;

    /* renamed from: d, reason: collision with root package name */
    private static final m[] f56318d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f56319e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f56320f;

    /* renamed from: g, reason: collision with root package name */
    private final String[] f56321g;

    /* renamed from: h, reason: collision with root package name */
    private final String[] f56322h;

    static {
        m mVar = m.n;
        m mVar2 = m.o;
        m mVar3 = m.p;
        m mVar4 = m.f56306h;
        m mVar5 = m.f56308j;
        m mVar6 = m.f56307i;
        m mVar7 = m.f56309k;
        m mVar8 = m.m;
        m mVar9 = m.f56310l;
        m[] mVarArr = {mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9};
        f56317c = mVarArr;
        m[] mVarArr2 = {mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, m.f56304f, m.f56305g, m.f56302d, m.f56303e, m.f56300b, m.f56301c, m.f56299a};
        f56318d = mVarArr2;
        new n(true).b((m[]) Arrays.copyOf(mVarArr, 9)).d(av.f55925a, av.f55926b).f().e();
        f56315a = new n(true).b((m[]) Arrays.copyOf(mVarArr2, 16)).d(av.f55925a, av.f55926b).f().e();
        new n(true).b((m[]) Arrays.copyOf(mVarArr2, 16)).d(av.f55925a, av.f55926b, av.f55927c, av.f55928d).f().e();
        f56316b = new n(false).e();
    }

    public o(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.f56319e = z;
        this.f56320f = z2;
        this.f56321g = strArr;
        this.f56322h = strArr2;
    }

    public final List a() {
        String[] strArr = this.f56321g;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(m.q.i(str));
        }
        return h.a.i.ao(arrayList);
    }

    public final List b() {
        String[] strArr = this.f56322h;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            av avVar = av.f55925a;
            arrayList.add(kotlinx.b.d.aa.e(str));
        }
        return h.a.i.ao(arrayList);
    }

    public final void c(SSLSocket sSLSocket, boolean z) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        h.g.b.x.f(sSLSocket, "sslSocket");
        String[] strArr = this.f56321g;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            h.g.b.x.e(enabledCipherSuites2, "getEnabledCipherSuites(...)");
            enabledCipherSuites = okhttp3.internal.b.A(enabledCipherSuites2, strArr, m.r);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        String[] strArr2 = this.f56322h;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            h.g.b.x.e(enabledProtocols2, "getEnabledProtocols(...)");
            enabledProtocols = okhttp3.internal.b.A(enabledProtocols2, strArr2, h.b.a.c());
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        h.g.b.x.c(supportedCipherSuites);
        Comparator comparator = m.r;
        byte[] bArr = okhttp3.internal.b.f55955a;
        h.g.b.x.f(supportedCipherSuites, "<this>");
        h.g.b.x.f("TLS_FALLBACK_SCSV", "value");
        h.g.b.x.f(comparator, "comparator");
        int length = supportedCipherSuites.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            } else if (comparator.compare(supportedCipherSuites[i2], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i2++;
            }
        }
        if (z && i2 != -1) {
            h.g.b.x.c(enabledCipherSuites);
            String str = supportedCipherSuites[i2];
            h.g.b.x.e(str, "get(...)");
            h.g.b.x.f(enabledCipherSuites, "<this>");
            h.g.b.x.f(str, "value");
            Object[] objArrCopyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            h.g.b.x.e(objArrCopyOf, "copyOf(...)");
            enabledCipherSuites = (String[]) objArrCopyOf;
            enabledCipherSuites[h.a.c.A(enabledCipherSuites)] = str;
        }
        o oVarE = new n(this).a((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length)).c((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)).e();
        if (oVarE.b() != null) {
            sSLSocket.setEnabledProtocols(oVarE.f56322h);
        }
        if (oVarE.a() != null) {
            sSLSocket.setEnabledCipherSuites(oVarE.f56321g);
        }
    }

    public final boolean d(SSLSocket sSLSocket) {
        h.g.b.x.f(sSLSocket, "socket");
        if (!this.f56319e) {
            return false;
        }
        String[] strArr = this.f56322h;
        if (strArr != null && !okhttp3.internal.b.w(strArr, sSLSocket.getEnabledProtocols(), h.b.a.c())) {
            return false;
        }
        String[] strArr2 = this.f56321g;
        return strArr2 == null || okhttp3.internal.b.w(strArr2, sSLSocket.getEnabledCipherSuites(), m.r);
    }

    public final boolean e() {
        return this.f56319e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.f56319e;
        o oVar = (o) obj;
        if (z != oVar.f56319e) {
            return false;
        }
        return !z || (Arrays.equals(this.f56321g, oVar.f56321g) && Arrays.equals(this.f56322h, oVar.f56322h) && this.f56320f == oVar.f56320f);
    }

    public final boolean f() {
        return this.f56320f;
    }

    public final int hashCode() {
        if (!this.f56319e) {
            return 17;
        }
        String[] strArr = this.f56321g;
        int iHashCode = strArr != null ? Arrays.hashCode(strArr) : 0;
        String[] strArr2 = this.f56322h;
        return ((((iHashCode + DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_ON_SHOULDER_LABEL) * 31) + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f56320f ? 1 : 0);
    }

    public final String toString() {
        if (!this.f56319e) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(b(), "[all enabled]") + ", supportsTlsExtensions=" + this.f56320f + ")";
    }
}
