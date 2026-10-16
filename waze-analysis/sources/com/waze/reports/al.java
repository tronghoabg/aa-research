package com.waze.reports;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ToggleButton;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class al implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aq f33615a;

    al(aq aqVar) {
        Objects.requireNonNull(aqVar);
        this.f33615a = aqVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            ToggleButton toggleButton = (ToggleButton) view;
            int iIntValue = ((Integer) view.getTag()).intValue();
            aq aqVar = this.f33615a;
            aqVar.f33633k[iIntValue] = !aqVar.f33633k[iIntValue];
            toggleButton.setChecked(aqVar.f33633k[iIntValue]);
            aqVar.i();
        }
        return true;
    }
}
