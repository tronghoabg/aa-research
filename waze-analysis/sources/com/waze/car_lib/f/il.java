package com.waze.car_lib.f;

import com.waze.NativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class il extends com.waze.shared_infra.coordinators.s implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.login.m f19714a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.authentication.l f19715b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.car_lib.login.a f19716c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f19717d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f19718e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.install.a f19719f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f19720g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ il(com.waze.car_lib.login.m mVar, com.waze.authentication.l lVar, com.waze.car_lib.login.a aVar, boolean z, com.waze.install.a aVar2, com.waze.mywaze.n nVar, h.g.a.l lVar2, final kotlinx.coroutines.af afVar, int i2) {
        super(is.f19727a, afVar);
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("StartAppCoordinatorController");
        h.g.b.x.e(eVarD, "create(...)");
        h.g.b.x.f(mVar, "loginController");
        h.g.b.x.f(lVar, "credentialProvider");
        h.g.b.x.f(aVar, "guestSignupConfiguration");
        h.g.b.x.f(aVar2, "geoConfigControllerInterface");
        h.g.b.x.f(nVar, "myWazeInterface");
        h.g.b.x.f(lVar2, "runOnNativeManagerReady");
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(eVarD, "logger");
        this.f19714a = mVar;
        this.f19715b = lVar;
        this.f19716c = aVar;
        this.f19717d = z;
        this.f19718e = (i2 & 16) != 0;
        this.f19719f = aVar2;
        this.f19720g = eVarD;
        lVar2.invoke(new Runnable() { // from class: com.waze.car_lib.f.ii
            @Override // java.lang.Runnable
            public final void run() {
                kotlinx.coroutines.aj.z(afVar, null, null, new ge(this, (h.c.e) null, 6), 3);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object c(com.waze.car_lib.f.il r6, h.c.e r7) {
        /*
            boolean r0 = r7 instanceof com.waze.car_lib.f.ij
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.car_lib.f.ij r0 = (com.waze.car_lib.f.ij) r0
            int r1 = r0.f19710c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19710c = r1
            goto L18
        L13:
            com.waze.car_lib.f.ij r0 = new com.waze.car_lib.f.ij
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f19708a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f19710c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r7)
            goto L4c
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            e.b.c.b(r7)
            com.waze.car_lib.login.m r7 = r6.f19714a
            kotlinx.coroutines.b.ch r7 = r7.d()
            kotlinx.coroutines.b.k r7 = (kotlinx.coroutines.b.k) r7
            com.waze.car_lib.f.ik r2 = new com.waze.car_lib.f.ik
            r4 = 0
            r5 = 0
            r2.<init>(r6, r4, r5)
            h.g.a.p r2 = (h.g.a.p) r2
            r0.f19710c = r3
            java.lang.Object r7 = kotlinx.coroutines.b.ai.i(r7, r2, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            com.waze.car_lib.login.LoginController$LoginState r7 = (com.waze.car_lib.login.LoginController$LoginState) r7
            com.waze.car_lib.login.i r6 = r7.getState()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.f.il.c(com.waze.car_lib.f.il, h.c.e):java.lang.Object");
    }

    public static final /* synthetic */ void e(il ilVar) {
        ilVar.f19720g.a("waiting for login state");
        ilVar.m(it.f19728a);
        kotlinx.coroutines.aj.z(ilVar.G(), null, null, new ge(ilVar, (h.c.e) null, 7, (byte[]) null), 3);
    }

    public static final /* synthetic */ boolean k(il ilVar) {
        Object objA;
        try {
            objA = ilVar.f19715b.a();
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        return h.m.e(objA) && NativeManager.isAppStarted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        m(io.f19723a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(com.waze.beacons.n nVar) {
        if (this.f19717d) {
            H(ip.f19724a);
        } else {
            H(nVar);
        }
    }

    public final void g(boolean z) {
        this.f19716c.a();
        if (z) {
            H(new ir());
        } else {
            l();
        }
    }

    public final void h() {
        H(in.f19722a);
        l();
    }

    public final void i() {
        this.f19719f.b();
    }
}
