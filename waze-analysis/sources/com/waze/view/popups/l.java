package com.waze.view.popups;

import android.widget.TextView;
import com.waze.R;
import com.waze.jni.protos.rtalerts.RtAlertItem;
import com.waze.reports.cv;
import com.waze.rtalerts.RtAlertsNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l extends f {

    /* renamed from: c, reason: collision with root package name */
    private String f45322c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f45323e;

    /* renamed from: f, reason: collision with root package name */
    private RtAlertItem f45324f;

    public static /* synthetic */ void w(l lVar) {
        lVar.f45303b.f(1);
        RtAlertsNativeManager.getInstance().reportAbuse(lVar.f45324f.getId(), -1);
    }

    public static /* synthetic */ void x(l lVar) {
        lVar.f45303b.f(1);
        RtAlertsNativeManager.getInstance().sendComment(lVar.f45324f.getId());
    }

    public final void v(RtAlertItem rtAlertItem, boolean z, String str) {
        this.f45324f = rtAlertItem;
        this.f45323e = z;
        this.f45322c = str;
        super.d();
        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        k(this.f45323e ? aVarA.c(R.string.INCOMING_MESSAGE___, new Object[0]) : aVarA.c(R.string.INCOMING_PING___, new Object[0]));
        l(this.f45324f.getReportedBy());
        String str2 = "\"" + this.f45324f.getDescription() + "\"";
        TextView textView = (TextView) findViewById(R.id.genTakeOverLine3);
        if (str2.isEmpty()) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str2);
        }
        r(this.f45322c, "", this.f45324f.getMoodName());
        p(R.drawable.message_small_icon);
        g();
        q(this.f45324f.getTimeRelative());
        t(R.drawable.reply_icon_blue, new cv(this, 17));
        u(new cv(this, 18));
        i();
    }
}
