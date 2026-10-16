package defpackage;

import android.media.AudioManager;
import android.media.MediaPlayer;
import java.util.concurrent.Semaphore;

/* loaded from: classes2.dex */
public final class qhz implements MediaPlayer.OnCompletionListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public qhz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        if (this.b == 0) {
            ((Semaphore) this.a).release();
            return;
        }
        ((ype) qia.a.l().ai((char) 7305)).u("onCompletion");
        ((AudioManager) this.a).abandonAudioFocus(qia.b);
    }
}
