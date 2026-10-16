package pd;

import cg.C1621j;
import com.unity3d.services.core.network.model.HttpRequest;
import od.AbstractC3669a0;
import rd.C3967b;

/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final C3967b f43483a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3967b f43484b;

    /* renamed from: c, reason: collision with root package name */
    public static final C3967b f43485c;

    /* renamed from: d, reason: collision with root package name */
    public static final C3967b f43486d;

    /* renamed from: e, reason: collision with root package name */
    public static final C3967b f43487e;

    /* renamed from: f, reason: collision with root package name */
    public static final C3967b f43488f;

    static {
        C1621j c1621j = C3967b.f44757g;
        f43483a = new C3967b(c1621j, HttpRequest.DEFAULT_SCHEME);
        f43484b = new C3967b(c1621j, "http");
        C1621j c1621j2 = C3967b.f44755e;
        f43485c = new C3967b(c1621j2, "POST");
        f43486d = new C3967b(c1621j2, "GET");
        f43487e = new C3967b(AbstractC3669a0.f41893i.f40607a, "application/grpc");
        f43488f = new C3967b("te", "trailers");
    }
}
