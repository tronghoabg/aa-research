package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class may {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.Beeper");
    static final long b = 10000;
    public final android.content.Context c;
    public final android.media.AudioManager d;
    public final android.os.Handler e = new android.os.Handler();
    private boolean f;
    private max g;

    public may(android.content.Context context) {
        this.c = context;
        android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
        audioManager.getClass();
        this.d = audioManager;
    }

    public static defpackage.may a() {
        return (defpackage.may) defpackage.mkp.a.i(defpackage.may.class);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final void b(android.net.Uri uri, int i) throws wfo {
        android.media.AudioAttributes audioAttributesBuild;
        android.media.Ringtone ringtone;
        defpackage.wfp.c();
        uri.getClass();
        boolean z = this.f;
        int i2 = true != z ? 5 : 3;
        if (z) {
            android.media.AudioAttributes.Builder builder = new android.media.AudioAttributes.Builder();
            builder.setUsage(12).setContentType(4);
            audioAttributesBuild = builder.build();
        } else {
            audioAttributesBuild = new android.media.AudioAttributes.Builder().setUsage(5).setContentType(4).build();
        }
        android.media.AudioAttributes audioAttributes = audioAttributesBuild;
        max maxVar = this.g;
        if (maxVar == null || ((maxVar.f && ((ringtone = maxVar.d) == null || !ringtone.isPlaying())) || i >= this.g.g)) {
            defpackage.wfp.c();
            max maxVar2 = this.g;
            if (maxVar2 != null) {
                maxVar2.b();
                this.g = null;
            }
            max maxVar3 = new max(this, uri, i2, audioAttributes, i);
            this.g = maxVar3;
            defpackage.wfp.c();
            defpackage.ysr.bj(!maxVar3.e);
            maxVar3.e = true;
            try {
                android.media.MediaPlayer mediaPlayer = maxVar3.c;
                mediaPlayer.setDataSource(maxVar3.h.c, maxVar3.a);
                mediaPlayer.setAudioAttributes(maxVar3.b);
                mediaPlayer.prepareAsync();
            } catch (java.io.IOException | java.lang.IllegalArgumentException | java.lang.IllegalStateException | java.lang.SecurityException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai(4661)).y("Couldn't setDataSource(%s)", maxVar3.a);
                maxVar3.a();
            }
            maxVar3.h.e.postDelayed(new defpackage.lzk(maxVar3, 6), b);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final void c(boolean z) throws wfo {
        defpackage.wfp.c();
        this.f = z;
    }
}
