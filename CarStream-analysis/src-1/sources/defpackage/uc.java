package defpackage;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class uc implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ MediaPlayer c;
    public final /* synthetic */ AudioManager d;
    public final /* synthetic */ AudioFocusRequest e;
    public final /* synthetic */ sc f;
    public final /* synthetic */ r9 g;

    public uc(boolean[] zArr, boolean[] zArr2, MediaPlayer mediaPlayer, AudioManager audioManager, AudioFocusRequest audioFocusRequest, sc scVar, r9 r9Var) {
        this.a = zArr;
        this.b = zArr2;
        this.c = mediaPlayer;
        this.d = audioManager;
        this.e = audioFocusRequest;
        this.f = scVar;
        this.g = r9Var;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        ec.i(this.b, this.c, this.d, this.e, !this.a[0] ? this.f : this.g, 0L);
        return true;
    }
}
