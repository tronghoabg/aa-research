package defpackage;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class vc implements Runnable {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ MediaPlayer b;
    public final /* synthetic */ AudioManager c;
    public final /* synthetic */ AudioFocusRequest d;
    public final /* synthetic */ r9 e;

    public vc(boolean[] zArr, MediaPlayer mediaPlayer, AudioManager audioManager, AudioFocusRequest audioFocusRequest, r9 r9Var) {
        this.a = zArr;
        this.b = mediaPlayer;
        this.c = audioManager;
        this.d = audioFocusRequest;
        this.e = r9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ec.i(this.a, this.b, this.c, this.d, this.e, 350L);
    }
}
