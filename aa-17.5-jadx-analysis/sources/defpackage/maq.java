package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;

/* loaded from: classes2.dex */
public final class maq implements MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnCompletionListener, AudioManager.OnAudioFocusChangeListener {
    public final Uri a;
    public final AudioAttributes b;
    public final MediaPlayer c;
    public Ringtone d;
    public final int g;
    final /* synthetic */ mar h;
    private final int i;
    private int j = 0;
    public boolean e = false;
    public boolean f = false;

    public maq(mar marVar, Uri uri, int i, AudioAttributes audioAttributes, int i2) {
        this.h = marVar;
        wer.c();
        this.a = uri;
        this.i = i;
        this.b = audioAttributes;
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.c = mediaPlayer;
        mediaPlayer.setOnPreparedListener(this);
        mediaPlayer.setOnCompletionListener(this);
        mediaPlayer.setOnErrorListener(this);
        this.g = i2;
    }

    private final void c() {
        if (this.j == 1) {
            this.h.d.abandonAudioFocus(this);
            this.j = 0;
        }
        this.c.release();
        this.f = true;
    }

    public final void a() {
        c();
        Context context = this.h.c;
        Uri uri = this.a;
        Ringtone ringtone = RingtoneManager.getRingtone(context, uri);
        this.d = ringtone;
        if (ringtone == null) {
            ((ype) ((ype) mar.a.g()).ai((char) 4659)).y("Can't play sound %s - ringtone not available", uri);
        } else {
            ringtone.setStreamType(this.i);
            this.d.play();
        }
    }

    public final void b() {
        wer.c();
        if (!this.f) {
            MediaPlayer mediaPlayer = this.c;
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
            }
        }
        Ringtone ringtone = this.d;
        if (ringtone != null) {
            ringtone.stop();
            this.d = null;
        }
        c();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        wer.c();
        c();
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        ((ype) ((ype) mar.a.h()).ai(4657)).S("BeepRecord.onError(%s, %d, %d, %d)", this.a, Integer.valueOf(this.i), Integer.valueOf(i), Integer.valueOf(i2));
        wer.c();
        a();
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) throws IllegalStateException {
        wer.c();
        woy.Z(this.e);
        if (this.f) {
            return;
        }
        mar marVar = this.h;
        int iRequestAudioFocus = marVar.d.requestAudioFocus(this, this.i, 3);
        this.j = iRequestAudioFocus;
        if (iRequestAudioFocus == 1) {
            this.c.start();
        } else {
            c();
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
    }
}
