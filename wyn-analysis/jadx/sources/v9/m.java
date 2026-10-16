package v9;

import A.AbstractC0213f;
import java.util.BitSet;
import md.C3542j;
import md.W;
import md.Y;
import md.b0;
import n9.C3607b;
import n9.C3609d;
import w9.C4386e;
import x9.C4503c;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: g, reason: collision with root package name */
    public static final W f47088g;

    /* renamed from: h, reason: collision with root package name */
    public static final W f47089h;

    /* renamed from: i, reason: collision with root package name */
    public static final W f47090i;

    /* renamed from: j, reason: collision with root package name */
    public static volatile String f47091j;

    /* renamed from: a, reason: collision with root package name */
    public final C4386e f47092a;

    /* renamed from: b, reason: collision with root package name */
    public final C3609d f47093b;

    /* renamed from: c, reason: collision with root package name */
    public final C3607b f47094c;

    /* renamed from: d, reason: collision with root package name */
    public final X8.c f47095d;

    /* renamed from: e, reason: collision with root package name */
    public final String f47096e;

    /* renamed from: f, reason: collision with root package name */
    public final h f47097f;

    static {
        C3542j c3542j = b0.f40615d;
        BitSet bitSet = Y.f40606d;
        f47088g = new W("x-goog-api-client", c3542j);
        f47089h = new W("google-cloud-resource-prefix", c3542j);
        f47090i = new W("x-goog-request-params", c3542j);
        f47091j = "gl-java/";
    }

    public m(C4386e c4386e, C3609d c3609d, C3607b c3607b, s9.f fVar, h hVar, X8.c cVar) {
        this.f47092a = c4386e;
        this.f47097f = hVar;
        this.f47093b = c3609d;
        this.f47094c = c3607b;
        this.f47095d = cVar;
        this.f47096e = "projects/" + fVar.f45370a + "/databases/" + fVar.f45371b;
    }

    public final b0 a() {
        b0 b0Var = new b0();
        b0Var.f(f47088g, f47091j + " fire/25.1.1 grpc/");
        b0Var.f(f47089h, this.f47096e);
        b0Var.f(f47090i, this.f47096e);
        h hVar = this.f47097f;
        if (hVar != null) {
            O9.b bVar = hVar.f47072a;
            if (bVar.get() != null) {
                O9.b bVar2 = hVar.f47073b;
                if (bVar2.get() != null) {
                    int iF = AbstractC0213f.f(((C4503c) ((x9.f) bVar.get())).a());
                    if (iF != 0) {
                        b0Var.f(h.f47069d, Integer.toString(iF));
                    }
                    b0Var.f(h.f47070e, ((Y9.b) bVar2.get()).a());
                    s8.l lVar = hVar.f47074c;
                    if (lVar != null) {
                        String str = lVar.f45344b;
                        if (str.length() != 0) {
                            b0Var.f(h.f47071f, str);
                        }
                    }
                }
            }
        }
        return b0Var;
    }
}
