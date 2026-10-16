package com.waze.bw.a.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.l f17569a;

    public b(h.g.a.l lVar) {
        x.f(lVar, "callback");
        this.f17569a = lVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action;
        if (intent == null || (action = intent.getAction()) == null) {
            return;
        }
        if (x.n(action, "com.waze.INTENT_ACTION_START_STATE_HOME")) {
            this.f17569a.invoke(a.f17566a);
        } else if (x.n(action, "com.waze.INTENT_ACTION_START_STATE_WORK")) {
            this.f17569a.invoke(a.f17567b);
        }
    }
}
