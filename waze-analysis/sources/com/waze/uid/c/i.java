package com.waze.uid.c;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.waze.R;
import com.waze.feedback.FeedbackScreenOrigin;
import com.waze.sharedui.views.OvalButton;
import com.waze.uid.flow_views.AuthLayoutHeader;
import com.waze.uid.widgets.CharacterPlaceholderEditText;
import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i extends be {

    /* renamed from: a, reason: collision with root package name */
    private final String f44365a;

    /* renamed from: b, reason: collision with root package name */
    private int f44366b;

    /* renamed from: d, reason: collision with root package name */
    private String f44367d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f44368e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f44369f;

    /* renamed from: g, reason: collision with root package name */
    private AuthLayoutHeader f44370g;

    /* renamed from: h, reason: collision with root package name */
    private CharacterPlaceholderEditText f44371h;

    /* renamed from: i, reason: collision with root package name */
    private OvalButton f44372i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f44373j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f44374k;

    public i() {
        super(R.layout.auth_check_pin_code, FeedbackScreenOrigin.OB_EMAIL_VERIFICATION_CODE_SHOWN, null, true, null, 20);
        this.f44365a = "CheckPinCodeFragment";
        this.f44366b = 4;
        this.f44367d = "";
        this.f44374k = com.waze.shared_infra.o.b.a();
    }

    static final void b(i iVar, com.waze.sharedui.g.s sVar) {
        Objects.toString(sVar);
        String str = iVar.f44365a;
        com.waze.shared_infra.i.h.b(str, "SimpleBottomSheet clicked ".concat(String.valueOf(sVar)));
        int i2 = sVar.f39006a;
        if (i2 == g.f44362d.ordinal()) {
            iVar.j(new com.waze.uid.state_impl.email.v());
            return;
        }
        if (i2 == g.f44359a.ordinal()) {
            iVar.j(new com.waze.uid.state_impl.email.d());
            return;
        }
        if (i2 == g.f44360b.ordinal()) {
            iVar.j(new com.waze.uid.state_impl.email.t());
            android.support.v4.app.av activity = iVar.getActivity();
            if (activity != null) {
                com.waze.ui.v.f.k(activity, iVar.f44374k, com.waze.uid.d.n.f44458a);
                return;
            }
            return;
        }
        if (i2 != g.f44361c.ordinal()) {
            com.waze.shared_infra.i.h.k(str, "unexpected id " + i2);
        } else {
            android.support.v4.app.av activity2 = iVar.getActivity();
            if (activity2 != null) {
                com.waze.ad.a.j.k(activity2, com.waze.feedback.f.f23861a, com.waze.feedback.g.f23865a, iVar.i());
            }
        }
    }

    static final void c(final i iVar) {
        int iOrdinal = g.f44362d.ordinal();
        com.waze.shared_infra.o.a aVar = iVar.f44374k;
        List listL = h.a.i.l(new com.waze.sharedui.g.r(iOrdinal, aVar.c(R.string.VERIFY_EMAIL_INBOX_RESEND, new Object[0])).c(), new com.waze.sharedui.g.r(g.f44360b.ordinal(), aVar.c(R.string.VERIFY_EMAIL_ERROR_TROUBLESHOOTING, new Object[0])).c(), new com.waze.sharedui.g.r(g.f44361c.ordinal(), aVar.c(R.string.VERIFY_EMAIL_ERROR_SUPPORT, new Object[0])).c());
        if (iVar.f44368e) {
            listL.add(1, new com.waze.sharedui.g.r(g.f44359a.ordinal(), aVar.c(R.string.VERIFY_EMAIL_INBOX_CONTINUE_AS_GUEST, new Object[0])).c());
        }
        com.waze.sharedui.g.t tVar = new com.waze.sharedui.g.t(iVar.getActivity(), com.waze.sharedui.g.f.COLUMN_TEXT, aVar.c(R.string.VERIFY_EMAIL_HAVING_TROUBLE_SHEET_TITLE, new Object[0]), (com.waze.sharedui.g.s[]) listL.toArray(new com.waze.sharedui.g.s[0]), new com.waze.sharedui.g.q() { // from class: com.waze.uid.c.f
            @Override // com.waze.sharedui.g.q
            public final void a(com.waze.sharedui.g.s sVar) {
                i.b(this.f44358a, sVar);
            }
        }, null);
        tVar.r();
        tVar.show();
    }

    @Override // android.support.v4.app.ar
    /* renamed from: onCreate */
    public final void m37lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m37lambda$performCreate$3$androidsupportv4appFragment(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f44366b = arguments.getInt("ARG_PIN_CODE_SIZE", this.f44366b);
            String string = arguments.getString("ARG_EMAIL", this.f44367d);
            h.g.b.x.e(string, "getString(...)");
            this.f44367d = string;
            this.f44368e = arguments.getBoolean("ALLOW_GUEST", this.f44368e);
            this.f44369f = arguments.getBoolean("ARG_EXISTING_USER");
        }
    }

    @Override // android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        PackageManager packageManager;
        h.g.b.x.f(view, "view");
        View viewFindViewById = requireView().findViewById(R.id.header);
        h.g.b.x.e(viewFindViewById, "findViewById(...)");
        this.f44370g = (AuthLayoutHeader) viewFindViewById;
        View viewFindViewById2 = requireView().findViewById(R.id.loginEmailSignupPIN);
        h.g.b.x.e(viewFindViewById2, "findViewById(...)");
        this.f44371h = (CharacterPlaceholderEditText) viewFindViewById2;
        View viewFindViewById3 = requireView().findViewById(R.id.loginEmailSignupOpenInboxButton);
        h.g.b.x.e(viewFindViewById3, "findViewById(...)");
        this.f44372i = (OvalButton) viewFindViewById3;
        View viewFindViewById4 = requireView().findViewById(R.id.havingTroubleText);
        h.g.b.x.e(viewFindViewById4, "findViewById(...)");
        this.f44373j = (TextView) viewFindViewById4;
        boolean z = this.f44369f;
        AuthLayoutHeader authLayoutHeader = this.f44370g;
        int i2 = 1;
        TextView textView = null;
        if (z) {
            if (authLayoutHeader == null) {
                h.g.b.x.j("header");
                authLayoutHeader = null;
            }
            com.waze.shared_infra.o.a aVar = this.f44374k;
            authLayoutHeader.b(aVar.c(R.string.VERIFY_EMAIL_LOGIN_INBOX_TITLE, new Object[0]));
            AuthLayoutHeader authLayoutHeader2 = this.f44370g;
            if (authLayoutHeader2 == null) {
                h.g.b.x.j("header");
                authLayoutHeader2 = null;
            }
            authLayoutHeader2.a(aVar.c(R.string.VERIFY_EMAIL_LOGIN_INBOX_SUBTITLE_PS, this.f44367d));
        } else {
            if (authLayoutHeader == null) {
                h.g.b.x.j("header");
                authLayoutHeader = null;
            }
            com.waze.shared_infra.o.a aVar2 = this.f44374k;
            authLayoutHeader.b(aVar2.c(R.string.VERIFY_EMAIL_INBOX_TITLE, new Object[0]));
            AuthLayoutHeader authLayoutHeader3 = this.f44370g;
            if (authLayoutHeader3 == null) {
                h.g.b.x.j("header");
                authLayoutHeader3 = null;
            }
            authLayoutHeader3.a(aVar2.c(R.string.VERIFY_EMAIL_INBOX_SUBTITLE_PS, this.f44367d));
        }
        CharacterPlaceholderEditText characterPlaceholderEditText = this.f44371h;
        if (characterPlaceholderEditText == null) {
            h.g.b.x.j("loginEmailSignupPIN");
            characterPlaceholderEditText = null;
        }
        characterPlaceholderEditText.a(this.f44366b);
        CharacterPlaceholderEditText characterPlaceholderEditText2 = this.f44371h;
        if (characterPlaceholderEditText2 == null) {
            h.g.b.x.j("loginEmailSignupPIN");
            characterPlaceholderEditText2 = null;
        }
        characterPlaceholderEditText2.addTextChangedListener(new h(this));
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.APP_EMAIL");
        intent.addFlags(268435456);
        Context context = getContext();
        if (((context == null || (packageManager = context.getPackageManager()) == null) ? null : packageManager.resolveActivity(intent, 0)) == null) {
            intent = null;
        }
        OvalButton ovalButton = this.f44372i;
        if (ovalButton == null) {
            h.g.b.x.j("loginEmailSignupOpenInboxButton");
            ovalButton = null;
        }
        ovalButton.setVisibility(intent == null ? 8 : 0);
        OvalButton ovalButton2 = this.f44372i;
        if (ovalButton2 == null) {
            h.g.b.x.j("loginEmailSignupOpenInboxButton");
            ovalButton2 = null;
        }
        ovalButton2.setOnClickListener(new ag(this, intent, i2));
        TextView textView2 = this.f44373j;
        if (textView2 == null) {
            h.g.b.x.j("havingTroubleText");
            textView2 = null;
        }
        TextView textView3 = this.f44373j;
        if (textView3 == null) {
            h.g.b.x.j("havingTroubleText");
            textView3 = null;
        }
        textView2.setPaintFlags(textView3.getPaintFlags() | 8);
        TextView textView4 = this.f44373j;
        if (textView4 == null) {
            h.g.b.x.j("havingTroubleText");
        } else {
            textView = textView4;
        }
        textView.setOnClickListener(new ab(this, i2));
    }

    @Override // com.waze.uid.c.be, com.waze.uid.b.b
    public final void p(com.waze.tide.s sVar) {
        h.g.b.x.f(sVar, "activityEvent");
        if (sVar instanceof y) {
            CharacterPlaceholderEditText characterPlaceholderEditText = this.f44371h;
            if (characterPlaceholderEditText == null) {
                h.g.b.x.j("loginEmailSignupPIN");
                characterPlaceholderEditText = null;
            }
            characterPlaceholderEditText.setText((CharSequence) null);
            return;
        }
        if (!(sVar instanceof ba)) {
            super.p(sVar);
            return;
        }
        new com.waze.sharedui.d.b(getActivity(), this.f44374k.c(((ba) sVar).a(), new Object[0]), R.drawable.toast_error).g();
    }
}
