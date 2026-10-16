package com.waze.uid.c;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import com.waze.R;
import com.waze.feedback.FeedbackScreenOrigin;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class as extends be {

    /* renamed from: a, reason: collision with root package name */
    private final MutableState f44230a;

    /* renamed from: b, reason: collision with root package name */
    private final MutableState f44231b;

    public as() {
        super(0, FeedbackScreenOrigin.ENTER_PASSWORD_SHOWN, com.waze.uid.activities.e.f44088b, false, null, 24);
        this.f44230a = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.f44231b = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public static /* synthetic */ h.ab a(as asVar, String str) {
        h.g.b.x.f(str, "it");
        asVar.f44230a.setValue(str);
        asVar.f(null);
        return h.ab.f48028a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ h.ab b(as asVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1601496092, i2, -1, "com.waze.uid.fragments.LoginPasswordFragmentCompose.onCreateView.<anonymous>.<anonymous>.<anonymous> (LoginPasswordFragmentCompose.kt:37)");
            }
            String strE = asVar.e();
            boolean zChangedInstance = composer.changedInstance(asVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.ui.x.p(asVar, 19);
                composer.updateRememberedValue(objRememberedValue);
            }
            h.g.a.l lVar = (h.g.a.l) objRememberedValue;
            Integer num = (Integer) asVar.f44231b.getValue();
            boolean zChangedInstance2 = composer.changedInstance(asVar);
            bj bjVarRememberedValue = composer.rememberedValue();
            if (zChangedInstance2 || bjVarRememberedValue == Composer.Companion.getEmpty()) {
                bjVarRememberedValue = new bj(asVar, 1, null);
                composer.updateRememberedValue(bjVarRememberedValue);
            }
            h.g.a.a aVar = (h.g.a.a) bjVarRememberedValue;
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new com.waze.ui.r.a.e.c(9);
                composer.updateRememberedValue(objRememberedValue2);
            }
            cb.g(strE, lVar, num, aVar, (h.g.a.a) objRememberedValue2, composer, 24576);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    public static final /* synthetic */ void c(as asVar) {
        if (asVar.e().length() == 0) {
            asVar.f(Integer.valueOf(R.string.LOGIN_PASSWORD_EMPTY));
        } else {
            asVar.j(new com.waze.uid.state_impl.username_login.p(asVar.e()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String e() {
        return (String) this.f44230a.getValue();
    }

    private final void f(Integer num) {
        this.f44231b.setValue(num);
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.g.b.x.f(layoutInflater, "inflater");
        Context contextRequireContext = requireContext();
        h.g.b.x.e(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-734177635, true, new com.waze.navigate.location_preview.an(this, 2)));
        return composeView;
    }

    @Override // com.waze.uid.c.be, com.waze.uid.b.b
    public final void p(com.waze.tide.s sVar) {
        h.g.b.x.f(sVar, "activityEvent");
        if (sVar instanceof ba) {
            f(Integer.valueOf(((ba) sVar).a()));
        } else {
            super.p(sVar);
        }
    }
}
