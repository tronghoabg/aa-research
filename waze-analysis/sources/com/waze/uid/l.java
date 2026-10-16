package com.waze.uid;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l extends Scroller {

    /* renamed from: a, reason: collision with root package name */
    private int f44534a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f44535b;

    public l(Context context, Interpolator interpolator) {
        super(context, interpolator);
        this.f44534a = 0;
    }

    public final void a(boolean z) {
        this.f44535b = z;
    }

    public final void b() {
        this.f44534a = 700;
    }

    @Override // android.widget.Scroller
    public final void startScroll(int i2, int i3, int i4, int i5, int i6) {
        if (!this.f44535b) {
            i6 = this.f44534a;
        }
        super.startScroll(i2, i3, i4, i5, i6);
    }

    @Override // android.widget.Scroller
    public final void startScroll(int i2, int i3, int i4, int i5) {
        super.startScroll(i2, i3, i4, i5, this.f44534a);
    }
}
