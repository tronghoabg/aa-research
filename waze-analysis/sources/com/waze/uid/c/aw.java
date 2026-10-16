package com.waze.uid.c;

import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.TextView;
import androidx.autofill.HintConstants;
import com.waze.R;
import com.waze.feedback.FeedbackScreenOrigin;
import com.waze.sharedui.views.OvalButton;
import com.waze.sharedui.views.WazeEditTextBase;
import com.waze.sharedui.views.WazeValidatedEditText;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aw extends be {

    /* renamed from: a, reason: collision with root package name */
    private WazeValidatedEditText f44233a;

    /* renamed from: b, reason: collision with root package name */
    private OvalButton f44234b;

    /* renamed from: d, reason: collision with root package name */
    private TextView f44235d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f44236e;

    public aw() {
        super(R.layout.auth_username_login_password, FeedbackScreenOrigin.ENTER_PASSWORD_SHOWN, com.waze.uid.activities.e.f44088b, false, null, 24);
        this.f44236e = com.waze.shared_infra.o.b.a();
    }

    static final void b(aw awVar) {
        awVar.e();
    }

    static final boolean c(aw awVar, int i2) {
        if (!com.waze.shared_infra.s.h.b(i2)) {
            return false;
        }
        awVar.e();
        return true;
    }

    private final void e() {
        WazeValidatedEditText wazeValidatedEditText = this.f44233a;
        if (wazeValidatedEditText == null) {
            h.g.b.x.j(HintConstants.AUTOFILL_HINT_PASSWORD);
            wazeValidatedEditText = null;
        }
        String strI = wazeValidatedEditText.i();
        h.g.b.x.e(strI, "getText(...)");
        j(new com.waze.uid.state_impl.username_login.p(strI));
    }

    @Override // com.waze.uid.c.be, android.support.v4.app.ar
    public final void onResume() {
        super.onResume();
        WazeValidatedEditText wazeValidatedEditText = this.f44233a;
        if (wazeValidatedEditText == null) {
            h.g.b.x.j(HintConstants.AUTOFILL_HINT_PASSWORD);
            wazeValidatedEditText = null;
        }
        WazeEditTextBase wazeEditTextBaseG = wazeValidatedEditText.g();
        h.g.b.x.e(wazeEditTextBaseG, "getInput(...)");
        WazeEditTextBase wazeEditTextBase = wazeEditTextBaseG;
        h.g.b.x.f(wazeEditTextBase, "view");
        wazeEditTextBase.requestFocus();
        wazeEditTextBase.post(new com.google.firebase.messaging.m(this, wazeEditTextBase, 9));
    }

    @Override // android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        h.g.b.x.f(view, "view");
        View viewFindViewById = view.findViewById(R.id.password);
        h.g.b.x.e(viewFindViewById, "findViewById(...)");
        this.f44233a = (WazeValidatedEditText) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.emailNextButton);
        h.g.b.x.e(viewFindViewById2, "findViewById(...)");
        this.f44234b = (OvalButton) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.forgotPassword);
        h.g.b.x.e(viewFindViewById3, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById3;
        this.f44235d = textView;
        WazeValidatedEditText wazeValidatedEditText = null;
        if (textView == null) {
            h.g.b.x.j("forgotPassword");
            textView = null;
        }
        com.waze.shared_infra.o.a aVar = this.f44236e;
        com.waze.sharedui.views.ap.a(textView, aVar.c(R.string.LOGIN_PASSWORD_LINK_HTML_PL, ""), new au(requireActivity()));
        WazeValidatedEditText wazeValidatedEditText2 = this.f44233a;
        if (wazeValidatedEditText2 == null) {
            h.g.b.x.j(HintConstants.AUTOFILL_HINT_PASSWORD);
            wazeValidatedEditText2 = null;
        }
        wazeValidatedEditText2.v(PasswordTransformationMethod.getInstance());
        WazeValidatedEditText wazeValidatedEditText3 = this.f44233a;
        if (wazeValidatedEditText3 == null) {
            h.g.b.x.j(HintConstants.AUTOFILL_HINT_PASSWORD);
            wazeValidatedEditText3 = null;
        }
        wazeValidatedEditText3.o(aVar.c(R.string.LOGIN_PASSWORD_PLACEHOLDER, new Object[0]));
        WazeValidatedEditText wazeValidatedEditText4 = this.f44233a;
        if (wazeValidatedEditText4 == null) {
            h.g.b.x.j(HintConstants.AUTOFILL_HINT_PASSWORD);
            wazeValidatedEditText4 = null;
        }
        wazeValidatedEditText4.d(new av());
        WazeValidatedEditText wazeValidatedEditText5 = this.f44233a;
        if (wazeValidatedEditText5 == null) {
            h.g.b.x.j(HintConstants.AUTOFILL_HINT_PASSWORD);
            wazeValidatedEditText5 = null;
        }
        wazeValidatedEditText5.D();
        WazeValidatedEditText wazeValidatedEditText6 = this.f44233a;
        if (wazeValidatedEditText6 == null) {
            h.g.b.x.j(HintConstants.AUTOFILL_HINT_PASSWORD);
            wazeValidatedEditText6 = null;
        }
        wazeValidatedEditText6.b(new ap(this, 2));
        OvalButton ovalButton = this.f44234b;
        if (ovalButton == null) {
            h.g.b.x.j("emailNextButton");
            ovalButton = null;
        }
        ovalButton.setOnClickListener(new ab(this, 10));
        WazeValidatedEditText wazeValidatedEditText7 = this.f44233a;
        if (wazeValidatedEditText7 == null) {
            h.g.b.x.j(HintConstants.AUTOFILL_HINT_PASSWORD);
        } else {
            wazeValidatedEditText = wazeValidatedEditText7;
        }
        wazeValidatedEditText.q(new an(this, 2));
    }

    @Override // com.waze.uid.c.be, com.waze.uid.b.b
    public final void p(com.waze.tide.s sVar) {
        h.g.b.x.f(sVar, "activityEvent");
        if (!(sVar instanceof ba)) {
            super.p(sVar);
            return;
        }
        int iA = ((ba) sVar).a();
        WazeValidatedEditText wazeValidatedEditText = this.f44233a;
        WazeValidatedEditText wazeValidatedEditText2 = null;
        if (wazeValidatedEditText == null) {
            h.g.b.x.j(HintConstants.AUTOFILL_HINT_PASSWORD);
            wazeValidatedEditText = null;
        }
        wazeValidatedEditText.t(com.waze.sharedui.views.ac.ERROR);
        WazeValidatedEditText wazeValidatedEditText3 = this.f44233a;
        if (wazeValidatedEditText3 == null) {
            h.g.b.x.j(HintConstants.AUTOFILL_HINT_PASSWORD);
        } else {
            wazeValidatedEditText2 = wazeValidatedEditText3;
        }
        wazeValidatedEditText2.w(this.f44236e.c(iA, new Object[0]));
    }
}
