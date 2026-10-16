package com.waze.uid.c;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import com.waze.R;
import com.waze.feedback.FeedbackScreenOrigin;
import com.waze.sharedui.views.OvalButton;
import com.waze.sharedui.views.WazeValidatedEditText;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aq extends be {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f44217a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final h.n.l f44218b;

    /* renamed from: d, reason: collision with root package name */
    private WazeValidatedEditText f44219d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f44220e;

    /* renamed from: f, reason: collision with root package name */
    private OvalButton f44221f;

    /* renamed from: g, reason: collision with root package name */
    private OvalButton f44222g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f44223h;

    static {
        Pattern pattern = Patterns.EMAIL_ADDRESS;
        h.g.b.x.e(pattern, "EMAIL_ADDRESS");
        f44218b = new h.n.l(pattern);
    }

    public aq() {
        super(R.layout.auth_email_username_login, FeedbackScreenOrigin.LOGIN_SHOWN, null, false, null, 28);
        this.f44223h = com.waze.shared_infra.o.b.a();
    }

    static final void e(aq aqVar) {
        aqVar.k();
    }

    static final boolean f(aq aqVar, int i2) {
        if (!com.waze.shared_infra.s.h.b(i2)) {
            return false;
        }
        aqVar.k();
        return true;
    }

    private final void k() {
        WazeValidatedEditText wazeValidatedEditText = this.f44219d;
        WazeValidatedEditText wazeValidatedEditText2 = null;
        if (wazeValidatedEditText == null) {
            h.g.b.x.j("emailEditText");
            wazeValidatedEditText = null;
        }
        String strI = wazeValidatedEditText.i();
        h.g.b.x.e(strI, "getText(...)");
        String string = h.n.o.v(strI).toString();
        WazeValidatedEditText wazeValidatedEditText3 = this.f44219d;
        if (wazeValidatedEditText3 == null) {
            h.g.b.x.j("emailEditText");
        } else {
            wazeValidatedEditText2 = wazeValidatedEditText3;
        }
        if (wazeValidatedEditText2.a() == com.waze.sharedui.views.y.f39288b) {
            j(new com.waze.uid.state_impl.username_login.q(string, !f44218b.g(string) ? 1 : 0));
        }
    }

    @Override // android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        h.g.b.x.f(view, "view");
        View viewFindViewById = view.findViewById(R.id.emailEditText);
        h.g.b.x.e(viewFindViewById, "findViewById(...)");
        this.f44219d = (WazeValidatedEditText) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.havingTroubleText);
        h.g.b.x.e(viewFindViewById2, "findViewById(...)");
        this.f44220e = (TextView) viewFindViewById2;
        h.g.b.x.e(view.findViewById(R.id.loginMethodSeparatorLine), "findViewById(...)");
        View viewFindViewById3 = view.findViewById(R.id.loginMethodSeparatorText);
        h.g.b.x.e(viewFindViewById3, "findViewById(...)");
        View viewFindViewById4 = view.findViewById(R.id.googleLoginButton);
        h.g.b.x.e(viewFindViewById4, "findViewById(...)");
        this.f44221f = (OvalButton) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.emailNextButton);
        h.g.b.x.e(viewFindViewById5, "findViewById(...)");
        this.f44222g = (OvalButton) viewFindViewById5;
        OvalButton ovalButton = this.f44221f;
        WazeValidatedEditText wazeValidatedEditText = null;
        if (ovalButton == null) {
            h.g.b.x.j("googleLoginButton");
            ovalButton = null;
        }
        ovalButton.setOnClickListener(new ab(this, 7));
        TextView textView = this.f44220e;
        if (textView == null) {
            h.g.b.x.j("havingTroubleText");
            textView = null;
        }
        int i2 = 8;
        textView.setPaintFlags(textView.getPaintFlags() | 8);
        TextView textView2 = this.f44220e;
        if (textView2 == null) {
            h.g.b.x.j("havingTroubleText");
            textView2 = null;
        }
        textView2.setOnClickListener(new ab(this, i2));
        OvalButton ovalButton2 = this.f44222g;
        if (ovalButton2 == null) {
            h.g.b.x.j("emailNextButton");
            ovalButton2 = null;
        }
        ovalButton2.setOnClickListener(new ab(this, 9));
        WazeValidatedEditText wazeValidatedEditText2 = this.f44219d;
        if (wazeValidatedEditText2 == null) {
            h.g.b.x.j("emailEditText");
            wazeValidatedEditText2 = null;
        }
        wazeValidatedEditText2.q(new an(this, 0));
        WazeValidatedEditText wazeValidatedEditText3 = this.f44219d;
        if (wazeValidatedEditText3 == null) {
            h.g.b.x.j("emailEditText");
            wazeValidatedEditText3 = null;
        }
        wazeValidatedEditText3.d(new ao(this));
        WazeValidatedEditText wazeValidatedEditText4 = this.f44219d;
        if (wazeValidatedEditText4 == null) {
            h.g.b.x.j("emailEditText");
            wazeValidatedEditText4 = null;
        }
        wazeValidatedEditText4.D();
        WazeValidatedEditText wazeValidatedEditText5 = this.f44219d;
        if (wazeValidatedEditText5 == null) {
            h.g.b.x.j("emailEditText");
            wazeValidatedEditText5 = null;
        }
        wazeValidatedEditText5.b(new ap(this, 0));
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("ARG_EMAIL") : null;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("ARG_PIN_CODE_SIZE") : null;
        String str = string2;
        if (str != null && str.length() != 0) {
            WazeValidatedEditText wazeValidatedEditText6 = this.f44219d;
            if (wazeValidatedEditText6 == null) {
                h.g.b.x.j("emailEditText");
            } else {
                wazeValidatedEditText = wazeValidatedEditText6;
            }
            wazeValidatedEditText.u(string2);
            return;
        }
        String str2 = string;
        if (str2 == null || str2.length() == 0) {
            return;
        }
        WazeValidatedEditText wazeValidatedEditText7 = this.f44219d;
        if (wazeValidatedEditText7 == null) {
            h.g.b.x.j("emailEditText");
        } else {
            wazeValidatedEditText = wazeValidatedEditText7;
        }
        wazeValidatedEditText.u(string);
    }
}
