package com.waze.view.popups;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class m extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private int f45325a;

    /* renamed from: d, reason: collision with root package name */
    protected final com.waze.as.a f45326d;

    public m(Context context) {
        super(context);
        this.f45325a = 0;
        this.f45326d = (com.waze.as.a) com.waze.web.r.h(com.waze.as.a.class);
    }

    public void I() {
        f();
    }

    public void K() {
    }

    public final int aj() {
        return this.f45325a;
    }

    public final void ak(int i2) {
        this.f45325a = i2;
    }

    public void bG(boolean z) {
    }

    public void bH(boolean z, float f2) {
    }

    public abstract void e();

    public abstract void f();
}
