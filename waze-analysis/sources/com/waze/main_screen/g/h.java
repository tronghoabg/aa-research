package com.waze.main_screen.g;

import android.content.Context;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.navigate.DriveToNativeManager;
import com.waze.navigate.bc;
import com.waze.web.r;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class h extends e implements bc {

    /* renamed from: a, reason: collision with root package name */
    private boolean f26395a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context) {
        super(context, null);
        x.f(context, "context");
    }

    static final void f(h hVar) {
        ((DriveToNativeManager) r.m(DriveToNativeManager.class)).addCurrentStreetUpdateListener(hVar);
        hVar.f26395a = true;
    }

    @Override // com.waze.navigate.bc
    public final void bC(String str, boolean z) {
        x.f(str, "streetName");
        d(str);
        if (z) {
            c(R.drawable.hov_icon_current_street_label);
        } else {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NativeManager.runOnNativeManagerReady(new g(this, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f26395a) {
            ((DriveToNativeManager) r.m(DriveToNativeManager.class)).removeCurrentStreetUpdateListener(this);
        }
    }
}
