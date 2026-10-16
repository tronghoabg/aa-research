package com.waze.feedback;

import android.widget.TextView;
import com.google.firebase.messaging.w;
import com.waze.R;
import com.waze.sharedui.web.WazeWebView;
import com.waze.sharedui.web.ak;
import com.waze.sharedui.web.s;
import h.g.b.x;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d implements ak {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ WazeWebView f23857a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ FeedbackActivity f23858b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f23859c;

    d(WazeWebView wazeWebView, FeedbackActivity feedbackActivity, String str) {
        this.f23857a = wazeWebView;
        this.f23858b = feedbackActivity;
        this.f23859c = str;
    }

    @Override // com.waze.sharedui.web.ak
    public final void a() {
        com.waze.shared_infra.i.h.i("FeedbackActivity", "onBlockUser");
    }

    @Override // com.waze.sharedui.web.ak
    public final void b() {
        com.waze.shared_infra.i.h.i("FeedbackActivity", "onBrowserClose");
    }

    @Override // com.waze.sharedui.web.ak
    public final void c() {
        com.waze.shared_infra.i.h.k("FeedbackActivity", "onBrowserError");
    }

    @Override // com.waze.sharedui.web.ak
    public final void d(boolean z) {
        com.waze.shared_infra.i.h.i("FeedbackActivity", "onFeedbackSent sendLogs=" + z);
        this.f23857a.post(new w(z, this.f23858b, this.f23859c, 2));
    }

    @Override // com.waze.sharedui.web.ak
    public final void e(s sVar) {
        x.f(sVar, "request");
        Objects.toString(sVar);
        com.waze.shared_infra.i.h.i("FeedbackActivity", "onMediaPickerRequest ".concat(String.valueOf(sVar)));
    }

    @Override // com.waze.sharedui.web.ak
    public final void f() {
        com.waze.shared_infra.i.h.i("FeedbackActivity", "onSendClientLogs");
        this.f23857a.post(new com.google.android.libraries.phenotype.client.stable.x(this.f23858b, this.f23859c, 14));
    }

    @Override // com.waze.sharedui.web.ak
    public final void g() {
        com.waze.shared_infra.i.h.i("FeedbackActivity", "onSendClientLogsWithConfirmation");
    }

    @Override // com.waze.sharedui.web.ak
    public final void h(String str) {
        com.waze.shared_infra.i.h.i("FeedbackActivity", "onShareRequest");
    }

    @Override // com.waze.sharedui.web.ak
    public final void i(String str) {
        TextView textView;
        com.waze.shared_infra.i.h.i("FeedbackActivity", "onUpdateHeaderRequest title=".concat(String.valueOf(str)));
        if (str == null || (textView = (TextView) this.f23857a.findViewById(R.id.pageTitle)) == null) {
            return;
        }
        textView.setText(str);
    }
}
