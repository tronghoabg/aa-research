package e.a.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class jx {

    /* renamed from: b, reason: collision with root package name */
    private static final e.a.dm f47257b;

    /* renamed from: c, reason: collision with root package name */
    private static final e.a.dm f47258c;

    /* renamed from: d, reason: collision with root package name */
    private static final e.a.dm f47259d;

    /* renamed from: e, reason: collision with root package name */
    private static final e.a.dm f47260e;

    /* renamed from: a, reason: collision with root package name */
    private final e.a.cs f47261a;

    static {
        e.a.cr crVarA = e.a.cr.a();
        f47257b = crVarA.d("grpc.subchannel.disconnections", com.google.d.d.fo.E("grpc.target"), com.google.d.d.fo.E("grpc.lb.backend_service", "grpc.lb.locality", "grpc.disconnect_error"));
        f47258c = crVarA.d("grpc.subchannel.connection_attempts_succeeded", com.google.d.d.fo.E("grpc.target"), com.google.d.d.fo.E("grpc.lb.backend_service", "grpc.lb.locality"));
        f47259d = crVarA.d("grpc.subchannel.connection_attempts_failed", com.google.d.d.fo.E("grpc.target"), com.google.d.d.fo.E("grpc.lb.backend_service", "grpc.lb.locality"));
        f47260e = crVarA.b(com.google.d.d.fo.E("grpc.target"), com.google.d.d.fo.E("grpc.security_level", "grpc.lb.backend_service", "grpc.lb.locality"));
    }

    public jx(e.a.cs csVar) {
        this.f47261a = csVar;
    }

    public final void a(String str, String str2, String str3) {
        this.f47261a.a(f47259d, com.google.d.d.bn.q(str), com.google.d.d.bn.r(str2, str3));
    }

    public final void b(String str, String str2, String str3, String str4) {
        e.a.cs csVar = this.f47261a;
        csVar.a(f47258c, com.google.d.d.bn.q(str), com.google.d.d.bn.r(str2, str3));
        csVar.b(f47260e, com.google.d.d.bn.q(str), com.google.d.d.bn.s(str4, str2, str3));
    }

    public final void c(String str, String str2, String str3, String str4, String str5) {
        e.a.cs csVar = this.f47261a;
        csVar.a(f47257b, com.google.d.d.bn.q(str), com.google.d.d.bn.s(str2, str3, str4));
        csVar.b(f47260e, com.google.d.d.bn.q(str), com.google.d.d.bn.s(str5, str2, str3));
    }
}
