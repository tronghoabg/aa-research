package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class qie implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ qie(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // java.lang.Runnable
    public final void run() throws wfo {
        defpackage.yxo yxoVar;
        int i = this.b;
        if (i == 0) {
            defpackage.wfp.b();
            ((defpackage.qif) this.a).b();
            return;
        }
        if (i == 1) {
            ((com.google.android.gearhead.appdecor.StatusBarView) this.a).e.setVisibility(8);
            return;
        }
        if (i == 2) {
            ((defpackage.yqj) com.google.android.gearhead.demand.DemandClientService.a.l().ai((char) 7290)).u("closeDemandSpace");
            com.google.android.gearhead.demand.DemandClientService demandClientService = (com.google.android.gearhead.demand.DemandClientService) this.a;
            if (demandClientService.b.m()) {
                demandClientService.b.j(defpackage.yxp.UNKNOWN_CANCEL_TRIGGER);
                return;
            }
            return;
        }
        int i2 = 3;
        if (i == 3) {
            ((defpackage.qio) this.a).a();
            return;
        }
        android.media.MediaPlayer mediaPlayer = null;
        if (i == 4) {
            defpackage.qit qitVar = (defpackage.qit) this.a;
            if (qitVar.q()) {
                i2 = qitVar.r() ? 2 : 1;
            }
            defpackage.eqs eqsVar = qitVar.e;
            int iIntValue = ((java.lang.Integer) new defpackage.nub((java.lang.Integer) eqsVar.e()).i(0)).intValue();
            defpackage.eqs eqsVar2 = qitVar.f;
            defpackage.kxh kxhVar = (defpackage.kxh) new defpackage.nub((defpackage.kxh) eqsVar2.e()).i(defpackage.kxh.a);
            if (i2 == iIntValue) {
                defpackage.lam.a();
                if (iIntValue != 1) {
                    yxoVar = iIntValue != 2 ? defpackage.yxo.DEMAND_SPACE_REDUNDANT_STATE_CHANGE_UNAVAILABLE : defpackage.yxo.DEMAND_SPACE_REDUNDANT_STATE_CHANGE_OPEN;
                } else {
                    yxoVar = defpackage.yxo.DEMAND_SPACE_REDUNDANT_STATE_CHANGE_CLOSED;
                }
                defpackage.lam.e(yxoVar, null);
                if (qitVar.i == kxhVar) {
                    ((defpackage.yqj) defpackage.qit.a.l().ai((char) 7326)).M("No state update. Still state %s, open trigger %s", defpackage.qit.o(iIntValue), kxhVar);
                    return;
                }
            }
            ((defpackage.yqj) defpackage.qit.a.l().ai(7325)).T("New demand space state %s->%s, open trigger %s->%s. internal state: %s", defpackage.qit.o(iIntValue), defpackage.qit.o(i2), kxhVar, qitVar.i, qitVar.d);
            eqsVar.m(java.lang.Integer.valueOf(i2));
            eqsVar2.m(qitVar.i);
            return;
        }
        if (i != 5) {
            android.content.SharedPreferences sharedPreferences = ((defpackage.qjc) this.a).h;
            android.content.SharedPreferences.Editor editorPutBoolean = sharedPreferences.edit().putBoolean("rating_prompt_shown", true).putBoolean("ignored_last_prompt", true);
            defpackage.ojm.a();
            editorPutBoolean.putLong("last_rating_prompt_time", j$.time.Instant.now().toEpochMilli()).putInt("prompt_shown_count", sharedPreferences.getInt("prompt_shown_count", 0) + 1).apply();
            return;
        }
        defpackage.yqm yqmVar = qja.a;
        defpackage.yqm yqmVar2 = qiw.a;
        java.lang.Object obj = this.a;
        android.content.Context context = (android.content.Context) obj;
        android.net.Uri uri = android.net.Uri.parse("android.resource://" + context.getPackageName() + "/raw/car_feedback_notify");
        android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
        android.media.MediaPlayer mediaPlayer2 = new android.media.MediaPlayer();
        mediaPlayer2.reset();
        mediaPlayer2.setAudioStreamType(3);
        try {
            mediaPlayer2.setDataSource((android.content.Context) obj, uri);
            mediaPlayer2.setOnCompletionListener(new qiv(audioManager, 1));
            mediaPlayer2.prepare();
            mediaPlayer = mediaPlayer2;
        } catch (java.io.IOException unused) {
            ((defpackage.yqj) ((defpackage.yqj) qiw.a.g()).ai((char) 7331)).u("Couldn't load feedback sound. Fail whale! No feedback sounds for you.");
            mediaPlayer2.release();
        }
        defpackage.yqm yqmVar3 = qiw.a;
        ((defpackage.yqj) yqmVar3.l().ai(7332)).y("maybePlaySound: %s play", mediaPlayer != null ? "will" : "will not");
        if (mediaPlayer != null) {
            java.util.concurrent.Semaphore semaphore = new java.util.concurrent.Semaphore(0);
            mediaPlayer.setOnCompletionListener(new qiv(semaphore, 0));
            if (audioManager.requestAudioFocus(qiw.b, 3, 3) == 0) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar3.g()).ai((char) 7333)).u("Couldn't obtain audio focus.");
            }
            mediaPlayer.seekTo(0);
            mediaPlayer.start();
            try {
                semaphore.acquire();
            } catch (java.lang.InterruptedException unused2) {
            }
        }
        if (mediaPlayer == null) {
            return;
        }
        audioManager.abandonAudioFocus(qiw.b);
        mediaPlayer.release();
    }

    public qie(java.lang.Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
