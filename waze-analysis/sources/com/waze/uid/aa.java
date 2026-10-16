package com.waze.uid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ar;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.ConfigManager;
import com.waze.MainActivity;
import com.waze.MoodManager;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.iu;
import com.waze.kn;
import com.waze.lm;
import com.waze.mywaze.MyWazeNativeManager;
import com.waze.navigate.DriveToNativeManager;
import com.waze.profile.ForgotPasswordActivity;
import com.waze.uid.c.ay;
import com.waze.uid.c.bo;
import com.waze.uid.c.bt;
import com.waze.uid.state_impl.util.InstallParameters;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aa implements com.waze.uid.d.i {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.app_nav.hub.ah f44039a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.b.u f44040b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.b.y f44041c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.b.o f44042d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.sharedui.e.g f44043e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f44044f;

    /* renamed from: g, reason: collision with root package name */
    private final ConfigManager f44045g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.cb.j f44046h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.authentication.l f44047i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.authentication.al f44048j;

    /* renamed from: k, reason: collision with root package name */
    private final DriveToNativeManager f44049k;

    public aa(com.waze.app_nav.hub.ah ahVar, com.waze.b.u uVar, com.waze.b.y yVar, com.waze.b.o oVar, com.waze.sharedui.e.g gVar, com.waze.shared_infra.o.a aVar, ConfigManager configManager, com.waze.cb.j jVar, com.waze.authentication.l lVar, com.waze.authentication.al alVar, DriveToNativeManager driveToNativeManager) {
        h.g.b.x.f(ahVar, "hubManager");
        h.g.b.x.f(uVar, "ageRestrictionRepository");
        h.g.b.x.f(yVar, "preLoginAadcAgeRestrictionRepository");
        h.g.b.x.f(oVar, "ageRestrictionApi");
        h.g.b.x.f(gVar, "wazeLocationService");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(configManager, "configManager");
        h.g.b.x.f(jVar, "u16BlockScreenController");
        h.g.b.x.f(lVar, "credentialProvider");
        h.g.b.x.f(alVar, "credentialsRepositoryProvider");
        h.g.b.x.f(driveToNativeManager, "driveToNativeManager");
        this.f44039a = ahVar;
        this.f44040b = uVar;
        this.f44041c = yVar;
        this.f44042d = oVar;
        this.f44043e = gVar;
        this.f44044f = aVar;
        this.f44045g = configManager;
        this.f44046h = jVar;
        this.f44047i = lVar;
        this.f44048j = alVar;
        this.f44049k = driveToNativeManager;
    }

    static final void r(boolean z, FlowType flowType, aa aaVar) {
        NativeManager.getInstance().OpenProgressIconPopup((z || flowType == FlowType.LOGIN) ? aaVar.f44044f.c(R.string.AUTH_FLOW_COMPLETE_MSG, new Object[0]) : aaVar.f44044f.c(R.string.AUTH_FLOW_COMPLETE_NEW_MSG, new Object[0]), R.drawable.sign_up_big_v, 2000);
    }

    @Override // com.waze.uid.d.i
    public final ar a() {
        return new ay();
    }

    @Override // com.waze.uid.d.i
    public final ar b(boolean z) {
        if (this.f44045g.getConfigValueBool(ConfigValues.CONFIG_VALUE_SIGNUP_ONBOARDING_VISUAL_ALIGNMENT_ENABLED)) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("ARG_SHOW_TERMS_AND_SERVICE", z);
            bo boVar = new bo();
            boVar.setArguments(bundle);
            return boVar;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean(bt.f44302a, z);
        bt btVar = new bt();
        btVar.setArguments(bundle2);
        return btVar;
    }

    @Override // com.waze.uid.d.i
    public final com.waze.app_nav.hub.ah c() {
        return this.f44039a;
    }

    @Override // com.waze.uid.d.i
    public final com.waze.uid.e.f e() {
        return new com.waze.uid.state_impl.c.c(new com.waze.uid.e.b(), com.waze.uid.b.ab.f44136a.a(), this.f44040b, this.f44041c, this.f44042d, this.f44043e, this.f44046h);
    }

    @Override // com.waze.uid.d.i
    public final InstallParameters.Result f() {
        return InstallParameters.Result.GUEST;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        if (r7 != r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.uid.d.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.Long r6, h.c.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.waze.uid.x
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.uid.x r0 = (com.waze.uid.x) r0
            int r1 = r0.f44805c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f44805c = r1
            goto L18
        L13:
            com.waze.uid.x r0 = new com.waze.uid.x
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f44803a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f44805c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r7)
            goto L71
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            e.b.c.b(r7)
            return r7
        L36:
            e.b.c.b(r7)
            com.waze.authentication.al r5 = r5.f44048j
            com.waze.authentication.ak r7 = com.waze.authentication.ak.f15722d
            com.waze.authentication.aj r5 = r5.a(r7)
            boolean r7 = r5 instanceof com.waze.authentication.aw
            r2 = 0
            if (r7 == 0) goto L49
            com.waze.authentication.aw r5 = (com.waze.authentication.aw) r5
            goto L4a
        L49:
            r5 = r2
        L4a:
            if (r5 != 0) goto L51
            java.util.List r5 = h.a.i.h()
            return r5
        L51:
            if (r6 != 0) goto L5d
            r0.f44805c = r4
            java.lang.Object r5 = r5.d(r0)
            if (r5 != r1) goto L5c
            goto L7b
        L5c:
            return r5
        L5d:
            r6.longValue()
            com.waze.uid.ak r6 = new com.waze.uid.ak
            r6.<init>(r5, r2, r4)
            h.g.a.p r6 = (h.g.a.p) r6
            r0.f44805c = r3
            r2 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r7 = kotlinx.coroutines.aj.I(r2, r6, r0)
            if (r7 == r1) goto L7b
        L71:
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L7a
            java.util.List r5 = h.a.i.h()
            return r5
        L7a:
            return r7
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.uid.aa.g(java.lang.Long, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.uid.d.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(h.c.e r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.waze.uid.z
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.uid.z r0 = (com.waze.uid.z) r0
            int r1 = r0.f44810c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f44810c = r1
            goto L18
        L13:
            com.waze.uid.z r0 = new com.waze.uid.z
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f44808a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f44810c
            r3 = 1
            if (r2 == 0) goto L2c
            if (r2 != r3) goto L24
            goto L2c
        L24:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2c:
            e.b.c.b(r7)
        L2f:
            r7 = r6
            com.waze.uid.aa r7 = (com.waze.uid.aa) r7     // Catch: java.lang.Throwable -> L39
            com.waze.authentication.l r7 = r6.f44047i     // Catch: java.lang.Throwable -> L39
            com.waze.authentication.ax r7 = r7.a()     // Catch: java.lang.Throwable -> L39
            goto L3e
        L39:
            r7 = move-exception
            java.lang.Object r7 = e.b.c.a(r7)
        L3e:
            boolean r7 = h.m.e(r7)
            if (r7 != 0) goto L4f
            r0.f44810c = r3
            r4 = 100
            java.lang.Object r7 = kotlinx.coroutines.aj.q(r4, r0)
            if (r7 != r1) goto L2f
            return r1
        L4f:
            h.ab r6 = h.ab.f48028a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.uid.aa.h(h.c.e):java.lang.Object");
    }

    @Override // com.waze.uid.d.i
    public final void i() {
        NativeManager.getInstance().LogOutAccount();
    }

    @Override // com.waze.uid.d.i
    public final void j() {
        NativeManager.getInstance().shutDown();
    }

    @Override // com.waze.uid.d.i
    public final void k(com.waze.uid.b.k kVar) {
        h.g.b.x.f(kVar, "listener");
        com.waze.uid.b.z zVar = com.waze.uid.b.ab.f44136a;
        FlowType flowType = ((UidModel) zVar.a().b()).getFlowType();
        if (flowType != FlowType.ADD_ID && flowType != FlowType.EDIT_ID) {
            MainActivity mainActivityC = lm.d().c();
            UidModel uidModel = (UidModel) zVar.a().b();
            final boolean zIsExistingUser = uidModel.getInstallParameters().isExistingUser();
            final FlowType flowType2 = uidModel.getFlowType();
            if (mainActivityC != null) {
                mainActivityC.aF(new Runnable() { // from class: com.waze.uid.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        aa.r(zIsExistingUser, flowType2, this);
                    }
                });
            }
        }
        if (flowType != FlowType.EDIT_ID) {
            lm.d().n();
        }
        kVar.a(true);
    }

    @Override // com.waze.uid.d.i
    public final void l() {
        com.waze.sharedui.a.e eVarE = lm.d().e();
        if (eVarE != null) {
            eVarE.startActivity(new Intent(eVarE, (Class<?>) ForgotPasswordActivity.class));
        }
    }

    @Override // com.waze.uid.d.i
    public final void m(Context context, int i2, h.g.a.l lVar) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(lVar, "callback");
        lVar.invoke(MoodManager.getInstance().getMoodDrawableById(i2));
    }

    @Override // com.waze.uid.d.i
    public final void n(com.waze.sharedui.api.b bVar) {
        h.g.b.x.f(bVar, "callback");
        com.waze.sharedui.api.t.f38827b.e(new y(bVar, this));
    }

    @Override // com.waze.uid.d.i
    public final void o(Runnable runnable) {
        h.g.b.x.f(runnable, "onLogin");
        if (NativeManager.getInstance().isLoggedIn()) {
            runnable.run();
        } else {
            NativeManager.runOnUserLoggedIn(runnable);
        }
    }

    @Override // com.waze.uid.d.a
    public final void p(com.waze.uid.d.b bVar) {
        h.g.b.x.f(bVar, "runnable");
        MainActivity.B(new kn(bVar, 1));
    }

    @Override // com.waze.uid.d.i
    public final void q(VehicleType vehicleType) {
        h.g.b.x.f(vehicleType, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        ConfigValues.CONFIG_VALUE_ROUTING_VEHICLE_TYPE_CHOICE.d(vehicleType.getValue());
    }

    @Override // com.waze.uid.d.i
    public final void s() {
        NativeManager nativeManager = NativeManager.getInstance();
        h.g.b.x.e(nativeManager, "getInstance(...)");
        iu.SilentLogOut$default(nativeManager, null, 1, null);
    }

    @Override // com.waze.uid.d.i
    public final boolean t() {
        return MyWazeNativeManager.getInstance().isGuestUser();
    }

    @Override // com.waze.uid.d.i
    public final void u(com.waze.uid.state_impl.c.a aVar) {
        h.g.b.x.f(aVar, "shouldExitListener");
        if (NativeManager.getInstance().isLoggedIn()) {
            aVar.a(true);
        }
        this.f44039a.b().b(com.waze.ui.r.a.d.d.e(new com.waze.ui.o.ac(17), new com.waze.speech.l(aVar, 4)));
    }
}
