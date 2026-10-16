package com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets;

import android.content.Context;
import android.widget.FrameLayout;
import com.waze.R;
import com.waze.main_screen.bottom_bars.scrollable_eta.s;
import com.waze.navigate.NavResultData;
import com.waze.navigate.fu;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public abstract class h extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    protected s f26030a;

    public h(Context context) {
        super(context);
        b();
        j();
    }

    public abstract void a(boolean z);

    public abstract void b();

    public void c() {
    }

    public abstract void d();

    public void e(fu fuVar) {
    }

    public abstract void f(NavResultData navResultData);

    public abstract void g();

    public abstract void h();

    public void i(s sVar) {
        this.f26030a = sVar;
    }

    protected void j() {
        setPadding(getResources().getDimensionPixelOffset(R.dimen.scrollable_eta_margin), getResources().getDimensionPixelOffset(R.dimen.scrollable_eta_half_margin), getResources().getDimensionPixelOffset(R.dimen.scrollable_eta_margin), getResources().getDimensionPixelOffset(R.dimen.scrollable_eta_half_margin));
        setClipToPadding(false);
    }
}
