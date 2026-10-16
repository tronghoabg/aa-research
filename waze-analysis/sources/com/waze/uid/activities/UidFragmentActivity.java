package com.waze.uid.activities;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.ar;
import android.support.v4.app.bv;
import android.support.v4.app.ch;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelProvider;
import com.waze.R;
import com.waze.modules.c.ds;
import com.waze.reports.cv;
import com.waze.tide.s;
import com.waze.uid.b.t;
import com.waze.uid.b.u;
import com.waze.uid.b.v;
import com.waze.uid.b.w;
import com.waze.uid.c.al;
import com.waze.uid.c.bb;
import com.waze.uid.c.bc;
import com.waze.uid.c.be;
import com.waze.uid.c.bm;
import h.ab;
import h.g.b.x;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.aj;
import l.a.aoh;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class UidFragmentActivity extends com.waze.sharedui.a.e implements com.waze.uid.b.b, com.waze.uid.b.h {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f44064g = 0;

    /* renamed from: f, reason: collision with root package name */
    public q f44065f;

    /* renamed from: h, reason: collision with root package name */
    private com.waze.sharedui.d.b f44066h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f44067i;

    /* renamed from: k, reason: collision with root package name */
    private FrameLayout f44069k;
    private final f m;
    private final ActivityResultLauncher n;
    private final ActivityResultLauncher o;
    private final f p;

    /* renamed from: j, reason: collision with root package name */
    private WeakReference f44068j = new WeakReference(null);

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f44070l = com.waze.shared_infra.o.b.a();

    public UidFragmentActivity() {
        f fVar = new f(this, 0);
        this.m = fVar;
        this.n = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), fVar);
        f fVar2 = new f(this, 1);
        this.p = fVar2;
        this.o = registerForActivityResult(new ActivityResultContracts.StartIntentSenderForResult(), fVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x02f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static final h.ab g(com.waze.uid.activities.UidFragmentActivity r8, com.waze.uid.c.bb r9) {
        /*
            Method dump skipped, instructions count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.uid.activities.UidFragmentActivity.g(com.waze.uid.activities.UidFragmentActivity, com.waze.uid.c.bb):h.ab");
    }

    static final ab l(UidFragmentActivity uidFragmentActivity, bc bcVar) {
        Dialog dialog = (Dialog) uidFragmentActivity.f44068j.get();
        if (dialog != null && uidFragmentActivity.aL()) {
            dialog.dismiss();
        }
        com.waze.sharedui.d.a.d dVarI = null;
        if (bcVar != null) {
            bm bmVar = bm.f44280a;
            int i2 = 8;
            int i3 = 7;
            int i4 = 6;
            int i5 = 0;
            switch (bcVar.ordinal()) {
                case 0:
                    com.waze.sharedui.g.p pVar = new com.waze.sharedui.g.p(uidFragmentActivity);
                    com.waze.shared_infra.o.a aVar = uidFragmentActivity.f44070l;
                    pVar.h(aVar.c(R.string.LOGOUT_WARNING_GUEST_DIALOG_TITLE, new Object[0]));
                    pVar.e(aVar.c(R.string.LOGOUT_WARNING_GUEST_DIALOG_BODY, new Object[0]));
                    pVar.b(R.drawable.spaceship);
                    pVar.c(aVar.c(R.string.LOGOUT_WARNING_GUEST_DIALOG_YES, new Object[0]), new c(uidFragmentActivity, 9));
                    pVar.g(aVar.c(R.string.LOGOUT_WARNING_GUEST_DIALOG_NO, new Object[0]), new c(uidFragmentActivity, 10));
                    dVarI = pVar.i();
                    break;
                case 1:
                    com.waze.sharedui.g.p pVar2 = new com.waze.sharedui.g.p(uidFragmentActivity);
                    com.waze.shared_infra.o.a aVar2 = uidFragmentActivity.f44070l;
                    pVar2.h(aVar2.c(R.string.LOGOUT_WARNING_REGISTERED_DIALOG_TITLE, new Object[0]));
                    pVar2.e(aVar2.c(R.string.LOGOUT_WARNING_REGISTERED_DIALOG_BODY, new Object[0]));
                    pVar2.c(aVar2.c(R.string.LOGOUT_WARNING_REGISTERED_DIALOG_YES, new Object[0]), new c(uidFragmentActivity, i5));
                    pVar2.g(aVar2.c(R.string.LOGOUT_WARNING_REGISTERED_DIALOG_NO, new Object[0]), new c(uidFragmentActivity, 2));
                    dVarI = pVar2.i();
                    break;
                case 2:
                    com.waze.sharedui.g.p pVar3 = new com.waze.sharedui.g.p(uidFragmentActivity);
                    com.waze.shared_infra.o.a aVar3 = uidFragmentActivity.f44070l;
                    pVar3.h(aVar3.c(R.string.LOGOUT_WARNING_GUEST_DIALOG_TITLE, new Object[0]));
                    pVar3.e(aVar3.c(R.string.LOGOUT_WARNING_GUEST_DIALOG_BODY, new Object[0]));
                    pVar3.b(R.drawable.spaceship);
                    pVar3.c(aVar3.c(R.string.LOGOUT_WARNING_GUEST_DIALOG_YES, new Object[0]), new c(uidFragmentActivity, 3));
                    pVar3.g(aVar3.c(R.string.LOGOUT_WARNING_GUEST_DIALOG_NO, new Object[0]), new c(uidFragmentActivity, 4));
                    dVarI = pVar3.i();
                    break;
                case 3:
                    dVarI = uidFragmentActivity.q(b.f44071a);
                    break;
                case 4:
                    dVarI = uidFragmentActivity.q(b.f44072b);
                    break;
                case 5:
                    com.waze.sharedui.g.p pVar4 = new com.waze.sharedui.g.p(uidFragmentActivity);
                    com.waze.shared_infra.o.a aVar4 = uidFragmentActivity.f44070l;
                    pVar4.h(aVar4.c(R.string.ADD_ID_CONFLICT_KEEP_ACCOUNT_DIALOG_TITLE, new Object[0]));
                    pVar4.e(aVar4.c(R.string.ADD_ID_CONFLICT_KEEP_ACCOUNT_DIALOG_BODY, new Object[0]));
                    pVar4.c(aVar4.c(R.string.ADD_ID_CONFLICT_KEEP_ACCOUNT_DIALOG_YES, new Object[0]), new c(uidFragmentActivity, 5));
                    pVar4.g(aVar4.c(R.string.ADD_ID_CONFLICT_KEEP_ACCOUNT_DIALOG_NO, new Object[0]), new c(uidFragmentActivity, i4));
                    pVar4.d();
                    dVarI = pVar4.i();
                    break;
                case 6:
                    com.waze.sharedui.g.p pVar5 = new com.waze.sharedui.g.p(uidFragmentActivity);
                    com.waze.shared_infra.o.a aVar5 = uidFragmentActivity.f44070l;
                    pVar5.h(aVar5.c(R.string.ADD_ID_CONFLICT_KEEP_ACCOUNT_DIALOG_TITLE, new Object[0]));
                    pVar5.e(aVar5.c(R.string.ADD_ID_CONFLICT_SWITCH_ACCOUNT_DIALOG_BODY, new Object[0]));
                    pVar5.c(aVar5.c(R.string.ADD_ID_CONFLICT_KEEP_ACCOUNT_DIALOG_YES, new Object[0]), new c(uidFragmentActivity, i3));
                    pVar5.g(aVar5.c(R.string.ADD_ID_CONFLICT_KEEP_ACCOUNT_DIALOG_NO, new Object[0]), new c(uidFragmentActivity, i2));
                    pVar5.d();
                    dVarI = pVar5.i();
                    break;
                case 7:
                    com.waze.sharedui.g.p pVar6 = new com.waze.sharedui.g.p(uidFragmentActivity);
                    com.waze.shared_infra.o.a aVar6 = uidFragmentActivity.f44070l;
                    pVar6.h(aVar6.c(R.string.ADD_ID_CONFLICT_ANOTHER_ACCOUNT_DIALOG_TITLE, new Object[0]));
                    pVar6.e(aVar6.c(R.string.ADD_ID_CONFLICT_ANOTHER_ACCOUNT_DIALOG_BODY, new Object[0]));
                    pVar6.c(aVar6.c(R.string.ADD_ID_CONFLICT_ANOTHER_ACCOUNT_DIALOG_YES, new Object[0]), new c(uidFragmentActivity, 1));
                    pVar6.g(aVar6.c(R.string.ADD_ID_CONFLICT_ANOTHER_ACCOUNT_DIALOG_NO, new Object[0]), new cv(uidFragmentActivity, i2));
                    pVar6.d();
                    dVarI = pVar6.i();
                    break;
                case 8:
                    dVarI = uidFragmentActivity.q(b.f44073c);
                    break;
                case 9:
                    dVarI = uidFragmentActivity.q(b.f44074d);
                    break;
                case 10:
                    dVarI = uidFragmentActivity.q(b.f44075e);
                    break;
                case 11:
                    al.d(aoh.LOGIN_CONTEXT);
                    com.waze.sharedui.g.p pVar7 = new com.waze.sharedui.g.p(uidFragmentActivity);
                    com.waze.shared_infra.o.a aVar7 = uidFragmentActivity.f44070l;
                    pVar7.h(aVar7.c(R.string.LOGIN_NO_ACCOUNT_FOUND_DIALOG_TITLE, new Object[0]));
                    pVar7.e(aVar7.c(R.string.LOGIN_NO_ACCOUNT_FOUND_DIALOG_BODY, new Object[0]));
                    pVar7.b(R.drawable.t3_email_error);
                    pVar7.g(aVar7.c(R.string.LOGIN_NO_ACCOUNT_FOUND_DIALOG_ACTION_RETRY, new Object[0]), new cv(uidFragmentActivity, i4));
                    pVar7.c(aVar7.c(R.string.LOGIN_NO_ACCOUNT_FOUND_DIALOG_ACTION_CREATE, new Object[0]), new cv(uidFragmentActivity, i3));
                    pVar7.d();
                    dVarI = pVar7.i();
                    break;
            }
        }
        uidFragmentActivity.f44068j = new WeakReference(dVarI);
        return ab.f48028a;
    }

    public static final /* synthetic */ void n(UidFragmentActivity uidFragmentActivity, String str) {
        uidFragmentActivity.s();
        com.waze.sharedui.d.b bVar = new com.waze.sharedui.d.b(uidFragmentActivity, str, 0);
        bVar.setCancelable(false);
        bVar.setCanceledOnTouchOutside(false);
        bVar.f(false);
        bVar.show();
        uidFragmentActivity.f44066h = bVar;
    }

    private final Dialog q(b bVar) {
        return a.a(this, this.f44070l, bVar, new com.waze.ui.x.p(this, 14), new k(this));
    }

    private final be r(boolean z) {
        if (com.waze.uid.d.q.f44463a.a().a().h()) {
            int iA = f().a();
            String strF = f().f();
            boolean zJ = f().j();
            x.f(strF, NotificationCompat.CATEGORY_EMAIL);
            com.waze.uid.c.e eVar = new com.waze.uid.c.e();
            Bundle bundle = new Bundle();
            bundle.putInt("ARG_PIN_CODE_SIZE", iA);
            bundle.putString("ARG_EMAIL", strF);
            bundle.putBoolean("ARG_EXISTING_USER", zJ);
            bundle.putBoolean("ALLOW_GUEST", z);
            eVar.setArguments(bundle);
            return eVar;
        }
        int iA2 = f().a();
        String strF2 = f().f();
        boolean zJ2 = f().j();
        x.f(strF2, NotificationCompat.CATEGORY_EMAIL);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("ARG_PIN_CODE_SIZE", iA2);
        bundle2.putString("ARG_EMAIL", strF2);
        bundle2.putBoolean("ARG_EXISTING_USER", zJ2);
        bundle2.putBoolean("ALLOW_GUEST", z);
        com.waze.uid.c.i iVar = new com.waze.uid.c.i();
        iVar.setArguments(bundle2);
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        com.waze.sharedui.d.b bVar = this.f44066h;
        if (bVar != null) {
            bVar.e();
        }
        this.f44066h = null;
    }

    private final void v() {
        this.f44067i = true;
        FrameLayout frameLayout = this.f44069k;
        if (frameLayout == null) {
            x.j("uidFrameLayout");
            frameLayout = null;
        }
        frameLayout.setVisibility(8);
    }

    private final void w(ar arVar, String str, boolean z) {
        bv bvVarBv = bv();
        x.e(bvVarBv, "getSupportFragmentManager(...)");
        ch chVarU = bvVarBv.u();
        x.e(chVarU, "beginTransaction(...)");
        if (z) {
            chVarU.y(R.anim.uid_slide_in_left, R.anim.uid_slide_out_right);
        } else {
            chVarU.y(R.anim.uid_slide_in_right, R.anim.uid_slide_out_left);
        }
        chVarU.x(R.id.fragmentView, arVar, str);
        chVarU.a();
    }

    public final q f() {
        q qVar = this.f44065f;
        if (qVar != null) {
            return qVar;
        }
        x.j("viewModel");
        return null;
    }

    @Override // com.waze.uid.b.h
    public final void o(s sVar) {
        x.f(sVar, NotificationCompat.CATEGORY_EVENT);
        Objects.toString(sVar);
        com.waze.shared_infra.i.h.b(this.w, "delegating event to view model ".concat(sVar.toString()));
        f().o(sVar);
    }

    @Override // com.waze.sharedui.a.e, android.support.v4.app.av, androidx.activity.ComponentActivity, android.app.Activity
    protected final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        f().o(new com.waze.uid.b.q());
    }

    @Override // com.waze.sharedui.a.e, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        List<ar> listX = bv().x();
        x.e(listX, "getFragments(...)");
        for (ar arVar : listX) {
            if (arVar.isVisible() && (arVar instanceof be)) {
                ((be) arVar).d();
            }
        }
        super.onBackPressed();
    }

    @Override // com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        aE();
        super.onCreate(bundle);
        setContentView(R.layout.uid_fragment_activity);
        View viewFindViewById = findViewById(R.id.uidFrameLayout);
        x.e(viewFindViewById, "findViewById(...)");
        this.f44069k = (FrameLayout) viewFindViewById;
        final int i2 = 0;
        boolean z = bundle != null ? bundle.getBoolean("isTransparent", false) : false;
        this.f44067i = z;
        if (z) {
            v();
        }
        q qVar = (q) new ViewModelProvider(this).get(q.class);
        x.f(qVar, "<set-?>");
        this.f44065f = qVar;
        UidFragmentActivity uidFragmentActivity = this;
        final int i3 = 1;
        Transformations.distinctUntilChanged(f().c()).observe(uidFragmentActivity, new j(new h.g.a.l(this) { // from class: com.waze.uid.activities.d

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ UidFragmentActivity f44085a;

            {
                this.f44085a = this;
            }

            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                if (i3 != 0) {
                    return UidFragmentActivity.g(this.f44085a, (bb) obj);
                }
                return UidFragmentActivity.l(this.f44085a, (bc) obj);
            }
        }));
        aj.z(LifecycleOwnerKt.getLifecycleScope(uidFragmentActivity), null, null, new h(this, null), 3);
        Transformations.distinctUntilChanged(f().l()).observe(uidFragmentActivity, new j(new com.waze.ui.x.p(findViewById(R.id.uidTypingWhileDrivingView), 12)));
        Transformations.distinctUntilChanged(f().m()).observe(uidFragmentActivity, new j(new com.waze.ui.x.p(this, 13)));
        Transformations.distinctUntilChanged(f().b()).observe(uidFragmentActivity, new j(new h.g.a.l(this) { // from class: com.waze.uid.activities.d

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ UidFragmentActivity f44085a;

            {
                this.f44085a = this;
            }

            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                if (i2 != 0) {
                    return UidFragmentActivity.g(this.f44085a, (bb) obj);
                }
                return UidFragmentActivity.l(this.f44085a, (bc) obj);
            }
        }));
        getOnBackPressedDispatcher().addCallback(new i(this));
    }

    @Override // com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v7.app.o, android.support.v4.app.av, android.app.Activity
    protected final void onDestroy() {
        s();
        Dialog dialog = (Dialog) this.f44068j.get();
        if (dialog != null) {
            dialog.dismiss();
        }
        super.onDestroy();
    }

    @Override // com.waze.sharedui.a.e, android.support.v4.app.av, android.app.Activity
    protected final void onPause() {
        s();
        super.onPause();
    }

    @Override // com.waze.sharedui.a.e, android.support.v4.app.av, android.app.Activity
    protected final void onResume() {
        super.onResume();
        f().v();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        x.f(bundle, "outState");
        x.f(persistableBundle, "outPersistentState");
        super.onSaveInstanceState(bundle, persistableBundle);
        bundle.putBoolean("isTransparent", this.f44067i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.waze.uid.b.b
    public final void p(s sVar) {
        x.f(sVar, "activityEvent");
        if (sVar instanceof com.waze.uid.b.d) {
            com.waze.uid.b.d dVar = (com.waze.uid.b.d) sVar;
            if (dVar.a().isSuccess()) {
                return;
            }
            dVar.a().openErrorDialog(this, null);
            return;
        }
        if (sVar instanceof w) {
            com.waze.shared_infra.i.h.b("UidFragmentActivity", "StartActivityEvent: launch()");
            this.n.launch(((w) sVar).a(this));
            return;
        }
        if (sVar instanceof com.waze.uid.b.x) {
            com.waze.shared_infra.i.h.b("UidFragmentActivity", "StartAuthEvent: launch()");
            this.o.launch(((com.waze.uid.b.x) sVar).a(this));
            return;
        }
        if (sVar instanceof com.waze.uid.b.e) {
            com.waze.uid.b.e eVar = (com.waze.uid.b.e) sVar;
            Intent intentB = eVar.b();
            if (intentB == null) {
                intentB = new Intent();
            }
            intentB.putExtra("ACTIVITY_CLOSED_BY_PURPOSE", true);
            setResult(eVar.a(), intentB);
            aw();
            return;
        }
        if (sVar instanceof t) {
            ((t) sVar).a(this);
            return;
        }
        if (sVar instanceof v) {
            new ds(this, f(), this.f44070l).b((v) sVar);
            return;
        }
        if (sVar instanceof u) {
            new com.waze.cg.a.c(this, f()).c((u) sVar);
            return;
        }
        List<ar> listX = bv().x();
        x.e(listX, "getFragments(...)");
        for (ar arVar : listX) {
            if (arVar.isVisible() && (arVar instanceof com.waze.uid.b.b)) {
                ((com.waze.uid.b.b) arVar).p(sVar);
            }
        }
    }
}
