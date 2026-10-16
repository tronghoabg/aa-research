package db;

import R8.C0805a;
import android.media.AudioManager;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0805a f34204a;

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i5) {
        C0805a c0805a = this.f34204a;
        if (i5 == -1) {
            c0805a.d();
        }
        c0805a.m("onAudioFocusChanged", Integer.valueOf(i5));
    }
}
