package com.waze.view.timer;

import android.view.View;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TimerBar f45395a;

    a(TimerBar timerBar) {
        Objects.requireNonNull(timerBar);
        this.f45395a = timerBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        TimerBar timerBar = this.f45395a;
        timerBar.q = 1.0f - (jCurrentTimeMillis / (timerBar.f45376b * 1000.0f));
        if (timerBar.q < 0.0f) {
            timerBar.q = 0.0f;
        }
        if (((int) (timerBar.f45376b - (jCurrentTimeMillis / 1000))) <= 0) {
            timerBar.g(true);
        }
        if (timerBar.q > 0.0f) {
            timerBar.f45375a.postDelayed(this, 25L);
        } else if (timerBar.f45382h) {
            ((View) timerBar.getParent()).performClick();
        }
        timerBar.invalidate();
    }
}
