package defpackage;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class tc implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ Context a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ MediaPlayer d;
    public final /* synthetic */ AudioManager e;
    public final /* synthetic */ AudioFocusRequest f;
    public final /* synthetic */ r9 g;

    public tc(Context context, int i, boolean[] zArr, MediaPlayer mediaPlayer, AudioManager audioManager, AudioFocusRequest audioFocusRequest, r9 r9Var) {
        this.a = context;
        this.b = i;
        this.c = zArr;
        this.d = mediaPlayer;
        this.e = audioManager;
        this.f = audioFocusRequest;
        this.g = r9Var;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        xc.n(this.b, this.a, "voicePromptUsage");
        ec.i(this.c, this.d, this.e, this.f, this.g, 350L);
    }
}
