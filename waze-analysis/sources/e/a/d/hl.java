package e.a.d;

import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class hl extends e.a.bv {

    /* renamed from: a, reason: collision with root package name */
    static final boolean f47097a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f47098b = 0;

    static {
        e.a.ch chVar = dh.f46791a;
        f47097a = e.a.dt.j("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST", false);
    }

    @Override // e.a.bj
    public final e.a.bt a(e.a.bl blVar) {
        return f47097a ? new hf(blVar) : new hk(blVar);
    }

    @Override // e.a.bv
    public final e.a.cy b(Map map) {
        try {
            Boolean boolE = jm.e(map, "shuffleAddressList");
            return e.a.cy.a(f47097a ? new ha(boolE) : new hh(boolE));
        } catch (RuntimeException e2) {
            return e.a.cy.b(e.a.ee.f47411k.f(e2).g("Failed parsing configuration for pick_first"));
        }
    }

    @Override // e.a.bv
    public final String c() {
        return "pick_first";
    }

    @Override // e.a.bv
    public final void d() {
    }

    @Override // e.a.bv
    public final void e() {
    }
}
