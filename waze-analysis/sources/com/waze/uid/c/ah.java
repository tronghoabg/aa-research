package com.waze.uid.c;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.feedback.FeedbackScreenOrigin;
import com.waze.sharedui.api.EmailConsent;
import com.waze.sharedui.views.CheckBoxView;
import com.waze.sharedui.views.OvalButton;
import com.waze.sharedui.views.WazeEditTextBase;
import com.waze.sharedui.views.WazeValidatedEditText;
import java.io.Serializable;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ah extends be {

    /* renamed from: a, reason: collision with root package name */
    private final String f44204a;

    /* renamed from: b, reason: collision with root package name */
    private EmailConsent f44205b;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f44206d;

    public ah() {
        super(R.layout.auth_enter_email, FeedbackScreenOrigin.OB_ENTER_EMAIL_SHOWN, null, false, null, 28);
        String strB = ConfigValues.CONFIG_VALUE_SIGNUP_EMAIL_CONSENT_DEFAULT.b();
        h.g.b.x.e(strB, "getValue(...)");
        Locale locale = Locale.getDefault();
        h.g.b.x.e(locale, "getDefault(...)");
        String lowerCase = strB.toLowerCase(locale);
        h.g.b.x.e(lowerCase, "toLowerCase(...)");
        this.f44204a = lowerCase;
        com.waze.sharedui.api.i iVar = EmailConsent.Companion;
        h.g.b.x.f(lowerCase, "consentState");
        EmailConsent emailConsent = h.g.b.x.n(lowerCase, EmailConsent.NotShown.getConfigString()) ? EmailConsent.NotShown : (!h.g.b.x.n(lowerCase, EmailConsent.Denied.getConfigString()) && h.g.b.x.n(lowerCase, EmailConsent.Given.getConfigString())) ? EmailConsent.Given : EmailConsent.Denied;
        this.f44205b = emailConsent;
        this.f44206d = com.waze.shared_infra.o.b.a();
    }

    static final void b(CheckBoxView checkBoxView, ah ahVar) {
        checkBoxView.d();
        ahVar.f44205b = checkBoxView.e() ? EmailConsent.Given : EmailConsent.Denied;
    }

    static final void c(ah ahVar) {
        ahVar.l();
    }

    static final boolean e(ah ahVar, int i2) {
        if (!com.waze.shared_infra.s.h.b(i2)) {
            return false;
        }
        ahVar.l();
        return true;
    }

    private final WazeValidatedEditText f() {
        View viewFindViewById = requireView().findViewById(R.id.emailEditText);
        h.g.b.x.e(viewFindViewById, "findViewById(...)");
        return (WazeValidatedEditText) viewFindViewById;
    }

    private final String k() {
        String strI = f().i();
        h.g.b.x.e(strI, "getText(...)");
        return strI;
    }

    private final void l() {
        if (f().a() == com.waze.sharedui.views.y.f39288b) {
            j(new com.waze.uid.state_impl.email.z(h.n.o.v(k()).toString(), this.f44205b));
        } else {
            f().A();
        }
    }

    @Override // android.support.v4.app.ar
    public final void onDestroyView() {
        super.onDestroyView();
        f();
    }

    @Override // com.waze.uid.c.be, android.support.v4.app.ar
    public final void onPause() {
        android.support.v4.app.av activity = getActivity();
        InputMethodManager inputMethodManager = (InputMethodManager) (activity != null ? activity.getSystemService("input_method") : null);
        android.support.v4.app.av activity2 = getActivity();
        View currentFocus = activity2 != null ? activity2.getCurrentFocus() : null;
        if (currentFocus == null) {
            currentFocus = new View(getActivity());
        }
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 1);
        }
        super.onPause();
    }

    @Override // com.waze.uid.c.be, android.support.v4.app.ar
    public final void onResume() {
        super.onResume();
        WazeEditTextBase wazeEditTextBaseG = f().g();
        h.g.b.x.e(wazeEditTextBaseG, "getInput(...)");
        com.waze.sharedui.utils.f.i(wazeEditTextBaseG);
    }

    @Override // android.support.v4.app.ar
    /* renamed from: onSaveInstanceState */
    public final void m47x22bc4f96(Bundle bundle) {
        h.g.b.x.f(bundle, "outState");
        bundle.putString("ARG_EMAIL_ADDRESS", k());
        bundle.putSerializable("ARG_PROMOS_ENABLED", this.f44205b);
    }

    @Override // android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        h.g.b.x.f(view, "view");
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("ARG_EMAIL_ADDRESS", "") : null;
        if (bundle != null) {
            string = bundle.getString("ARG_EMAIL_ADDRESS", "");
            Serializable serializable = bundle.getSerializable("ARG_PROMOS_ENABLED");
            h.g.b.x.d(serializable, "null cannot be cast to non-null type com.waze.sharedui.api.EmailConsent");
            this.f44205b = (EmailConsent) serializable;
        }
        if (!TextUtils.isEmpty(string)) {
            f().u(string);
        }
        CheckBoxView checkBoxView = (CheckBoxView) requireView().findViewById(R.id.emailConsentCheckbox);
        LinearLayout linearLayout = (LinearLayout) requireView().findViewById(R.id.consentContainer);
        EmailConsent emailConsent = this.f44205b;
        com.waze.sharedui.api.i iVar = EmailConsent.Companion;
        int iOrdinal = emailConsent.ordinal();
        int i2 = 0;
        if (iOrdinal == 1) {
            linearLayout.setVisibility(8);
        } else if (iOrdinal == 2) {
            checkBoxView.c(true);
        } else if (iOrdinal != 3) {
            checkBoxView.c(false);
        } else {
            checkBoxView.c(false);
        }
        CheckBoxView checkBoxView2 = (CheckBoxView) view.findViewById(R.id.emailConsentCheckbox);
        checkBoxView2.setOnClickListener(new ag(checkBoxView2, this, i2));
        ((OvalButton) view.findViewById(R.id.emailNextButton)).setOnClickListener(new ab(this, 5));
        f().b(new ap(this, 1));
        f().D();
        f().q(new an(this, 1));
    }
}
