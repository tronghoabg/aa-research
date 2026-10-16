package com.waze.settings.tree.views;

import android.widget.SeekBar;
import com.waze.settings.de;
import java.util.Timer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class z implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.settings.tree.d.r f37652a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ de f37653b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f37654c;

    /* renamed from: d, reason: collision with root package name */
    private Timer f37655d;

    z(com.waze.settings.tree.d.r rVar, de deVar, int i2) {
        this.f37652a = rVar;
        this.f37653b = deVar;
        this.f37654c = i2;
        this.f37655d = new Timer();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
        h.g.b.x.f(seekBar, "seekBar");
        com.waze.settings.tree.d.r rVar = this.f37652a;
        rVar.d().invoke(Integer.valueOf(i2));
        this.f37655d.cancel();
        Timer timer = new Timer();
        this.f37655d = timer;
        timer.schedule(new m(rVar, this.f37653b, this.f37654c, i2), 250L);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    public z() {
        throw null;
    }
}
