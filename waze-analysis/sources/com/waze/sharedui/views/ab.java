package com.waze.sharedui.views;

import android.view.MotionEvent;
import android.view.View;
import com.waze.trip_overview.dy;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class ab implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f39178a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f39179b;

    public /* synthetic */ ab(Object obj, int i2) {
        this.f39179b = i2;
        this.f39178a = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i2 = this.f39179b;
        if (i2 == 0) {
            ((ad) this.f39178a).k(false);
            return false;
        }
        if (i2 == 1) {
            com.waze.destination_cell.view.c.s((com.waze.destination_cell.view.c) this.f39178a, motionEvent);
            return false;
        }
        Object obj = this.f39178a;
        if (i2 != 2) {
            ((com.waze.trip_overview.c.a.ab) obj).h().l(dy.f41423a);
            return false;
        }
        ((com.waze.trip_overview.c.a.ab) obj).h().l(dy.f41423a);
        return false;
    }
}
