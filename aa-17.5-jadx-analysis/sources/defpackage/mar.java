package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.net.Uri;
import android.os.Handler;
import java.io.IOException;

/* loaded from: classes.dex */
public final class mar {
    public static final yph a = yph.c("GH.Beeper");
    static final long b = 10000;
    public final Context c;
    public final AudioManager d;
    public final Handler e = new Handler();
    private boolean f;
    private maq g;

    public mar(Context context) {
        this.c = context;
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        audioManager.getClass();
        this.d = audioManager;
    }

    public static mar a() {
        return (mar) mki.a.i(mar.class);
    }

    public final void b(Uri uri, int i) {
        AudioAttributes audioAttributesBuild;
        Ringtone ringtone;
        wer.c();
        uri.getClass();
        boolean z = this.f;
        int i2 = true != z ? 5 : 3;
        if (z) {
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setUsage(12).setContentType(4);
            audioAttributesBuild = builder.build();
        } else {
            audioAttributesBuild = new AudioAttributes.Builder().setUsage(5).setContentType(4).build();
        }
        AudioAttributes audioAttributes = audioAttributesBuild;
        maq maqVar = this.g;
        if (maqVar == null || ((maqVar.f && ((ringtone = maqVar.d) == null || !ringtone.isPlaying())) || i >= this.g.g)) {
            wer.c();
            maq maqVar2 = this.g;
            if (maqVar2 != null) {
                maqVar2.b();
                this.g = null;
            }
            maq maqVar3 = new maq(this, uri, i2, audioAttributes, i);
            this.g = maqVar3;
            wer.c();
            woy.Z(!maqVar3.e);
            maqVar3.e = true;
            try {
                MediaPlayer mediaPlayer = maqVar3.c;
                mediaPlayer.setDataSource(maqVar3.h.c, maqVar3.a);
                mediaPlayer.setAudioAttributes(maqVar3.b);
                mediaPlayer.prepareAsync();
            } catch (IOException | IllegalArgumentException | IllegalStateException | SecurityException e) {
                ((ype) ((ype) ((ype) a.h()).p(e)).ai(4658)).y("Couldn't setDataSource(%s)", maqVar3.a);
                maqVar3.a();
            }
            maqVar3.h.e.postDelayed(new lqj(maqVar3, 18), b);
        }
    }

    public final void c(boolean z) {
        wer.c();
        this.f = z;
    }
}
