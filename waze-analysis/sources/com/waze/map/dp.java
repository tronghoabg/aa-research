package com.waze.map;

import android.view.MotionEvent;
import android.view.View;
import androidx.core.app.NotificationCompat;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dp {

    /* renamed from: a, reason: collision with root package name */
    private final gc f28761a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f28762b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f28763c;

    public dp(gc gcVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(gcVar, "systemTouchArea");
        h.g.b.x.f(eVar, "logger");
        this.f28761a = gcVar;
        this.f28762b = eVar;
    }

    public final void a() {
        this.f28763c = false;
    }

    public final boolean b(MotionEvent motionEvent, View view) {
        h.g.b.x.f(motionEvent, NotificationCompat.CATEGORY_EVENT);
        h.g.b.x.f(view, "view");
        if (motionEvent.getAction() == 0) {
            this.f28763c = this.f28761a.b(motionEvent, view);
            this.f28762b.g("notice touch started from OS-Navigation system area, will might block this touch if it will start moving");
        }
        if (!this.f28763c || motionEvent.getAction() != 2) {
            return true;
        }
        com.waze.shared_infra.i.e eVar = this.f28762b;
        Objects.toString(motionEvent);
        eVar.g("Ignoring movement touch since it started from OS-Navigation system area. event:".concat(String.valueOf(motionEvent)));
        return false;
    }
}
