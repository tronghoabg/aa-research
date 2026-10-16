package com.waze.uid.c;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import com.waze.feedback.FeedbackScreenOrigin;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ae extends be {

    /* renamed from: a, reason: collision with root package name */
    private String f44198a;

    public ae() {
        super(0, FeedbackScreenOrigin.OB_EMAIL_NOT_VERIFIED_SHOWN, null, false, null, 28);
    }

    public static /* synthetic */ h.ab a(ae aeVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1705712922, i2, -1, "com.waze.uid.fragments.EmailErrorComposeFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (EmailErrorComposeFragment.kt:34)");
            }
            String str = aeVar.f44198a;
            if (str == null) {
                h.g.b.x.j(HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS);
                str = null;
            }
            boolean zChangedInstance = composer.changedInstance(aeVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new a(aeVar, 7);
                composer.updateRememberedValue(objRememberedValue);
            }
            h.g.a.a aVar = (h.g.a.a) objRememberedValue;
            boolean zChangedInstance2 = composer.changedInstance(aeVar);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new a(aeVar, 8);
                composer.updateRememberedValue(objRememberedValue2);
            }
            com.waze.ui.s.c.f(str, aVar, (h.g.a.a) objRememberedValue2, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    @Override // android.support.v4.app.ar
    /* renamed from: onCreate */
    public final void m37lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        String string;
        super.m37lambda$performCreate$3$androidsupportv4appFragment(bundle);
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null && (string = arguments.getString("ARG_EMAIL_ADDRESS", "")) != null) {
            str = string;
        }
        this.f44198a = str;
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.g.b.x.f(layoutInflater, "inflater");
        Context contextRequireContext = requireContext();
        h.g.b.x.e(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(553749031, true, new com.waze.main_screen.o(this, 17)));
        return composeView;
    }
}
