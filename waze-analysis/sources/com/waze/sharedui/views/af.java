package com.waze.sharedui.views;

import android.view.View;
import android.widget.EditText;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class af implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f39204a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f39205b;

    public /* synthetic */ af(Object obj, int i2) {
        this.f39205b = i2;
        this.f39204a = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (this.f39205b != 0) {
            for (int i2 = 0; i2 <= 0; i2++) {
                if (((EditText[]) this.f39204a)[i2].hasFocus()) {
                    return;
                }
            }
            com.google.android.material.internal.t.c(view);
            return;
        }
        ad adVar = (ad) this.f39204a;
        if (adVar.h() == ac.ERROR || adVar.h() == ac.DISABLED) {
            return;
        }
        if (z) {
            adVar.t(ac.FOCUS);
        } else if (adVar.g().getText().length() == 0) {
            adVar.t(ac.EMPTY);
        } else {
            adVar.t(ac.FULL);
        }
    }
}
