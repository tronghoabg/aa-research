package com.waze.reports;

import android.widget.EditText;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ao implements com.waze.sharedui.views.w {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aq f33618a;

    ao(aq aqVar) {
        Objects.requireNonNull(aqVar);
        this.f33618a = aqVar;
    }

    @Override // com.waze.sharedui.views.w
    public final void a(boolean z) {
        aq aqVar = this.f33618a;
        boolean z2 = !z;
        aqVar.n.setEnabled(z2);
        EditText editText = aqVar.n;
        float f2 = true != z ? 1.0f : 0.5f;
        editText.setAlpha(f2);
        aqVar.n.setText(true != z ? "19:00" : "00:00");
        aqVar.m.setEnabled(z2);
        aqVar.m.setAlpha(f2);
        aqVar.m.setText(true != z ? "10:00" : "00:00");
    }
}
