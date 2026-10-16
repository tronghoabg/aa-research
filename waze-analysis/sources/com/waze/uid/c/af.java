package com.waze.uid.c;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.autofill.HintConstants;
import com.waze.R;
import com.waze.feedback.FeedbackScreenOrigin;
import com.waze.sharedui.views.OvalButton;
import com.waze.uid.flow_views.AuthLayoutHeader;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class af extends be {

    /* renamed from: a, reason: collision with root package name */
    private String f44199a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f44200b;

    public af() {
        super(R.layout.auth_verify_email_error, FeedbackScreenOrigin.OB_EMAIL_NOT_VERIFIED_SHOWN, null, false, null, 28);
        this.f44200b = com.waze.shared_infra.o.b.a();
    }

    @Override // android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        h.g.b.x.f(view, "view");
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null && (string = arguments.getString("ARG_EMAIL_ADDRESS", "")) != null) {
            str = string;
        }
        this.f44199a = str;
        AuthLayoutHeader authLayoutHeader = (AuthLayoutHeader) view.findViewById(R.id.header);
        com.waze.shared_infra.o.a aVar = this.f44200b;
        String str2 = this.f44199a;
        if (str2 == null) {
            h.g.b.x.j(HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS);
            str2 = null;
        }
        authLayoutHeader.b(aVar.c(R.string.VERIFY_EMAIL_ERROR_TITLE, str2));
        ((OvalButton) view.findViewById(R.id.resendEmailButton)).setOnClickListener(new ab(this, 3));
        TextView textView = (TextView) view.findViewById(R.id.resendEmailContactSupport);
        textView.setPaintFlags(textView.getPaintFlags() | 8);
        textView.setOnClickListener(new ab(this, 4));
    }
}
