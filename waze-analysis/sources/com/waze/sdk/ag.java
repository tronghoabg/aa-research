package com.waze.sdk;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class ag implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f35228a;

    /* renamed from: b, reason: collision with root package name */
    private final GestureDetector f35229b;

    public ag(Context context) {
        h.g.b.x.f(context, "ctx");
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("AudioControlPanelSwipeListener");
        h.g.b.x.e(eVarD, "create(...)");
        this.f35228a = eVarD;
        this.f35229b = new GestureDetector(context, new af(this));
    }

    public boolean a() {
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        h.g.b.x.f(motionEvent, NotificationCompat.CATEGORY_EVENT);
        return this.f35229b.onTouchEvent(motionEvent);
    }
}
