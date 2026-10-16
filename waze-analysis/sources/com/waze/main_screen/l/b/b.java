package com.waze.main_screen.l.b;

import androidx.compose.runtime.State;
import com.waze.jni.protos.navigate.NavigationItem;
import com.waze.jni.protos.rtalerts.RtAlertItem;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ j f26609a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ State f26610b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ State f26611c;

    b(j jVar, State state, State state2) {
        this.f26609a = jVar;
        this.f26610b = state;
        this.f26611c = state2;
    }

    public final void a(NavigationItem navigationItem) {
        if (navigationItem != null) {
            j jVar = this.f26609a;
            h.g.a.l lVarQ = a.a.q(this.f26610b);
            if (lVarQ != null) {
                lVarQ.invoke(navigationItem);
            }
            jVar.c(navigationItem);
        }
    }

    public final void b(RtAlertItem rtAlertItem) {
        if (rtAlertItem != null) {
            j jVar = this.f26609a;
            h.g.a.l lVarQ = a.a.q(this.f26611c);
            if (lVarQ != null) {
                lVarQ.invoke(rtAlertItem);
            }
            jVar.d(rtAlertItem);
        }
    }

    public final void c() {
        this.f26609a.e();
    }

    public final void d() {
        this.f26609a.f();
    }
}
