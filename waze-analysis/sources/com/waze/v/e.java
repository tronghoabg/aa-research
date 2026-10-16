package com.waze.v;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import com.waze.R;
import com.waze.av.b.n;
import com.waze.car_lib.r.cq;
import com.waze.lm;
import com.waze.modules.navigation.ah;
import com.waze.modules.navigation.ai;
import com.waze.modules.navigation.ao;
import com.waze.modules.navigation.bp;
import com.waze.navigate.AddressItem;
import com.waze.navigate.cs;
import com.waze.strings.DisplayStrings;
import com.waze.view.popups.m;
import com.waze.web.r;
import h.ab;
import h.g.b.x;
import l.a.bht;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e extends m {

    /* renamed from: a, reason: collision with root package name */
    private final i f44917a;

    /* renamed from: b, reason: collision with root package name */
    private final ah f44918b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.main_screen.ab.a.e f44919c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, com.waze.main_screen.ab.a.e eVar, ah ahVar, i iVar) {
        super(context);
        x.f(context, "context");
        x.f(eVar, "callbacks");
        x.f(iVar, "stateHolder");
        this.f44919c = eVar;
        this.f44917a = iVar;
        this.f44918b = ahVar == null ? ah.B : ahVar;
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 48;
        composeView.setLayoutParams(layoutParams);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(573787159, true, new b(this, 0)));
        addView(composeView);
    }

    static final ab b(e eVar, Composer composer, int i2) {
        int i3 = 0;
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(573787159, i2, -1, "com.waze.crisis_response.CrisisResponsePopup.<anonymous>.<anonymous> (CrisisResponsePopup.kt:48)");
            }
            f fVar = (f) SnapshotStateKt.collectAsState(eVar.f44917a.c(), null, composer, 0, 1).getValue();
            if (fVar == null) {
                composer.startReplaceGroup(-276494286);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-276494285);
                cq.k(false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1559347917, true, new a(eVar, fVar, i3), composer, 54), composer, 196608);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    public static final /* synthetic */ void c(e eVar) {
        n nVarA;
        eVar.f44919c.d();
        i iVar = eVar.f44917a;
        f fVar = (f) iVar.c().d();
        if (fVar != null && (nVarA = fVar.a()) != null) {
            ((bp) r.m(bp.class)).b(new ao(eVar.f44918b, new ai(nVarA), null, false, null, null, false, null, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_5));
        }
        iVar.f(bht.TAKEOVER_ACTION_DRIVE_THERE);
        iVar.d();
    }

    public static final /* synthetic */ void d(e eVar) {
        n nVarA;
        com.waze.sharedui.a.e eVarE = lm.d().e();
        if (eVarE == null) {
            return;
        }
        if (eVar.f45326d.a().d() == com.waze.ui.r.a.e.b.a.f43359a) {
            com.waze.design_components.d.a(eVarE, com.waze.design_components.g.b.d(eVar).c(R.string.LOCK_SCREEN_NAVIGATION_BANNER_CLICK_MESSAGE, new Object[0]), null);
            return;
        }
        i iVar = eVar.f44917a;
        f fVar = (f) iVar.c().d();
        AddressItem addressItemB = null;
        if (fVar != null && (nVarA = fVar.a()) != null) {
            addressItemB = com.waze.ac.e.B(nVarA);
        }
        cs csVar = new cs(addressItemB);
        csVar.e(true);
        csVar.c(eVar.f44918b);
        csVar.b(eVarE, 32791);
        iVar.f(bht.TAKEOVER_ACTION_INFO);
        iVar.d();
        eVar.f44919c.d();
    }

    public final i a() {
        return this.f44917a;
    }

    @Override // com.waze.view.popups.m
    public final void e() {
        this.f44919c.e(this);
        removeAllViews();
        this.f44917a.d();
    }

    @Override // com.waze.view.popups.m
    public final void f() {
        this.f44919c.d();
        this.f44917a.d();
    }
}
