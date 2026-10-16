package com.waze.uid.c;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import com.waze.R;
import com.waze.car_lib.r.cr;
import com.waze.feedback.FeedbackScreenOrigin;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bl extends be {

    /* renamed from: a, reason: collision with root package name */
    private Integer f44276a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f44277b;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f44278d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f44279e;

    public bl() {
        super(0, FeedbackScreenOrigin.VERIFY_EMAIL_SCREEN_SHOWN, com.waze.uid.activities.e.f44087a, false, null, 24);
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("VerifyEmailFragment");
        h.g.b.x.e(eVarD, "create(...)");
        this.f44277b = eVarD;
        this.f44278d = com.waze.shared_infra.o.b.a();
        this.f44279e = ck.b(false);
    }

    public static /* synthetic */ h.ab b(final bl blVar, Composer composer, int i2) {
        boolean z = false;
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1629339309, i2, -1, "com.waze.uid.fragments.VerifyEmailFragment.onCreateView.<anonymous>.<anonymous> (VerifyEmailFragment.kt:62)");
            }
            final com.waze.sharedui.web.aq aqVar = new com.waze.sharedui.web.aq(com.waze.uid.d.q.f44463a.a().a().a(), new com.waze.sharedui.web.ao(blVar.f44278d.c(R.string.LOGIN_CHANGE_EMAIL, new Object[0]), z, z, 14), ((Boolean) SnapshotStateKt.collectAsState(blVar.f44279e, null, composer, 0, 1).getValue()).booleanValue(), 42);
            cr.d(false, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1978073620, true, new h.g.a.p() { // from class: com.waze.uid.c.bg
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1978073620, iIntValue, -1, "com.waze.uid.fragments.VerifyEmailFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (VerifyEmailFragment.kt:71)");
                        }
                        Modifier modifierStatusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(WindowInsetsPadding_androidKt.imePadding(BackgroundKt.m1972backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), com.waze.bz.a.d(composer2, 0).h(), null, 2, null)));
                        if (((Configuration) composer2.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 1) {
                            modifierStatusBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(modifierStatusBarsPadding);
                        }
                        Modifier modifier = modifierStatusBarsPadding;
                        bl blVar2 = blVar;
                        boolean zChangedInstance = composer2.changedInstance(blVar2);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                            objRememberedValue = (h.l.f) new bk(blVar2);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        com.waze.sharedui.views.ap.f(modifier, aqVar, (h.g.a.l) objRememberedValue, new com.waze.sharedui.web.m(new bi(blVar2), "changeEmailInterface"), composer2, 0, 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return h.ab.f48028a;
                }
            }, composer, 54), composer, 24576);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    public static final /* synthetic */ void c(bl blVar, com.waze.sharedui.web.y yVar) {
        if (h.g.b.x.n(yVar, com.waze.sharedui.web.t.f39369a)) {
            blVar.f();
            return;
        }
        if (h.g.b.x.n(yVar, com.waze.sharedui.web.u.f39370a)) {
            blVar.f();
            return;
        }
        if (!(yVar instanceof com.waze.sharedui.web.v)) {
            if (!h.g.b.x.n(yVar, com.waze.sharedui.web.w.f39372a) && !h.g.b.x.n(yVar, com.waze.sharedui.web.x.f39373a)) {
                throw new h.i();
            }
        } else if (((com.waze.sharedui.web.v) yVar).a()) {
            blVar.f44279e.e(false);
        } else {
            blVar.j(new com.waze.uid.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        this.f44277b.a("2FA auth cancelled");
        this.f44279e.e(true);
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.g.b.x.f(layoutInflater, "inflater");
        this.f44277b.a("2FA auth shown");
        com.waze.ad.a.j.r(this, this, new bj(this, 0));
        Context contextRequireContext = requireContext();
        h.g.b.x.e(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1629339309, true, new com.waze.navigate.location_preview.an(this, 4)));
        return composeView;
    }

    @Override // com.waze.uid.c.be, android.support.v4.app.ar
    public final void onPause() {
        Window window;
        super.onPause();
        Integer num = this.f44276a;
        if (num != null) {
            int iIntValue = num.intValue();
            android.support.v4.app.av activity = getActivity();
            if (activity == null || (window = activity.getWindow()) == null) {
                return;
            }
            window.setSoftInputMode(iIntValue);
        }
    }

    @Override // com.waze.uid.c.be, android.support.v4.app.ar
    public final void onResume() {
        Window window;
        super.onResume();
        android.support.v4.app.av activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        if (this.f44276a == null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            this.f44276a = attributes != null ? Integer.valueOf(attributes.softInputMode) : null;
        }
        window.setSoftInputMode(16);
    }
}
