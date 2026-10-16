package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f56311a;

    /* renamed from: b, reason: collision with root package name */
    private String[] f56312b;

    /* renamed from: c, reason: collision with root package name */
    private String[] f56313c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f56314d;

    public n(o oVar) {
        h.g.b.x.f(oVar, "connectionSpec");
        this.f56311a = oVar.e();
        this.f56312b = oVar.f56321g;
        this.f56313c = oVar.f56322h;
        this.f56314d = oVar.f();
    }

    public final n a(String... strArr) {
        h.g.b.x.f(strArr, "cipherSuites");
        if (!this.f56311a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f56312b = (String[]) strArr.clone();
        return this;
    }

    public final n b(m... mVarArr) {
        h.g.b.x.f(mVarArr, "cipherSuites");
        if (!this.f56311a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(mVarArr.length);
        for (m mVar : mVarArr) {
            arrayList.add(mVar.a());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        return a((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final n c(String... strArr) {
        h.g.b.x.f(strArr, "tlsVersions");
        if (!this.f56311a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f56313c = (String[]) strArr.clone();
        return this;
    }

    public final n d(av... avVarArr) {
        h.g.b.x.f(avVarArr, "tlsVersions");
        if (!this.f56311a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(avVarArr.length);
        for (av avVar : avVarArr) {
            arrayList.add(avVar.a());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        return c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final o e() {
        return new o(this.f56311a, this.f56314d, this.f56312b, this.f56313c);
    }

    public final n f() {
        if (!this.f56311a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        this.f56314d = true;
        return this;
    }

    public n(boolean z) {
        this.f56311a = z;
    }
}
