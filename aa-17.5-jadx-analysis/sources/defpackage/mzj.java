package defpackage;

import android.view.View;
import com.google.android.apps.auto.components.system.dashboard.media.MediaPlayerFragment;
import com.google.android.apps.auto.components.ui.media.PlayPauseStopCoolwalkButton;

/* loaded from: classes2.dex */
public final class mzj implements View.OnLayoutChangeListener {
    final /* synthetic */ MediaPlayerFragment a;
    final /* synthetic */ affq b;
    final /* synthetic */ PlayPauseStopCoolwalkButton c;
    final /* synthetic */ PlayPauseStopCoolwalkButton d;

    public mzj(MediaPlayerFragment mediaPlayerFragment, affq affqVar, PlayPauseStopCoolwalkButton playPauseStopCoolwalkButton, PlayPauseStopCoolwalkButton playPauseStopCoolwalkButton2) {
        this.a = mediaPlayerFragment;
        this.b = affqVar;
        this.c = playPauseStopCoolwalkButton;
        this.d = playPauseStopCoolwalkButton2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.getClass();
        view.removeOnLayoutChangeListener(this);
        MediaPlayerFragment mediaPlayerFragment = this.a;
        eqj eqjVar = mediaPlayerFragment.c().g;
        PlayPauseStopCoolwalkButton playPauseStopCoolwalkButton = this.c;
        affq affqVar = this.b;
        MediaPlayerFragment.d(eqjVar, mediaPlayerFragment, new gln(playPauseStopCoolwalkButton, affqVar, this.d, 10, null));
        affqVar.a = true;
    }
}
