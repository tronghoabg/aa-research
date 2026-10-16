package com.waze.rtalerts;

import android.view.View;
import android.widget.EditText;
import com.waze.R;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class g implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RtAlertsComments f35122a;

    g(RtAlertsComments rtAlertsComments) {
        Objects.requireNonNull(rtAlertsComments);
        this.f35122a = rtAlertsComments;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RtAlertsComments rtAlertsComments = this.f35122a;
        com.waze.ui.x.u.j(rtAlertsComments, (EditText) rtAlertsComments.findViewById(R.id.rtalerts_comments_comment_text));
        rtAlertsComments.setResult(-1);
        rtAlertsComments.finish();
    }
}
