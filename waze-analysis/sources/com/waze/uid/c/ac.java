package com.waze.uid.c;

import android.os.Bundle;
import com.waze.R;
import com.waze.feedback.FeedbackScreenOrigin;
import com.waze.sharedui.profile.UserProfile;
import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ac extends be {

    /* renamed from: a, reason: collision with root package name */
    private final String f44195a;

    /* renamed from: b, reason: collision with root package name */
    private UserProfile f44196b;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f44197d;

    public ac() {
        super(R.layout.auth_account_exists, FeedbackScreenOrigin.CONFIRM_ACCOUNT_SHOWN, null, false, null, 28);
        this.f44195a = "ConfirmAccountFragment";
        this.f44197d = com.waze.shared_infra.o.b.a();
    }

    static final void a(ac acVar) {
        com.waze.shared_infra.i.h.b(acVar.f44195a, "confirmClicked");
        acVar.j(new com.waze.uid.state_impl.email.a());
    }

    static final void b(ac acVar) {
        com.waze.shared_infra.i.h.b(acVar.f44195a, "supportClicked");
        android.support.v4.app.av activity = acVar.getActivity();
        if (activity != null) {
            com.waze.ad.a.j.k(activity, com.waze.feedback.f.f23861a, com.waze.feedback.g.f23865a, acVar.i());
        }
    }

    @Override // android.support.v4.app.ar
    /* renamed from: onCreate */
    public final void m37lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m37lambda$performCreate$3$androidsupportv4appFragment(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("ARG_USER_PROFILE");
            h.g.b.x.d(serializable, "null cannot be cast to non-null type com.waze.sharedui.profile.UserProfile");
            this.f44196b = (UserProfile) serializable;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3  */
    @Override // android.support.v4.app.ar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.uid.c.ac.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
