package com.waze.settings;

import com.waze.sharedui.web.WazeWebView;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f37449a;

    q(gr grVar) {
        this.f37449a = grVar;
    }

    public final void a() {
        int i2 = r.f37450b;
        Object obj = this.f37449a;
        ((com.waze.sharedui.a.e) obj).aG(new m(obj, 0), 200L);
        CustomPromptsRecordingActivity customPromptsRecordingActivity = (CustomPromptsRecordingActivity) obj;
        customPromptsRecordingActivity.q = true;
        customPromptsRecordingActivity.p = null;
    }

    public final void b(Object obj, String str) {
        ((WazeWebView) this.f37449a).f39293c.addJavascriptInterface(obj, str);
    }

    public /* synthetic */ q(Object obj) {
        this.f37449a = obj;
    }
}
