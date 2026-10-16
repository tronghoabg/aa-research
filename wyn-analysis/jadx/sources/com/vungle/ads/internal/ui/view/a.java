package com.vungle.ads.internal.ui.view;

import android.media.MediaPlayer;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f33754a;

    public a(d adVideoView) {
        AbstractC3340k.e(adVideoView, "adVideoView");
        this.f33754a = new WeakReference(adVideoView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaPlayer mediaPlayer;
        d dVar = (d) this.f33754a.get();
        if (dVar == null) {
            return;
        }
        dVar.b();
        if (!dVar.f33764i.get() || (mediaPlayer = dVar.f33762g) == null || !mediaPlayer.isPlaying() || dVar.f33771q) {
            return;
        }
        dVar.f33777w.postDelayed(this, 1000L);
    }
}
