package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class itq implements defpackage.itm {
    private final android.media.audiopolicy.AudioPolicy a;
    private final defpackage.ygw b;
    private final android.content.Context c;

    static {
        defpackage.yqm.c("CAR.AUDIO");
    }

    public itq(android.media.audiopolicy.AudioPolicy audioPolicy, defpackage.ygw ygwVar, android.content.Context context) {
        this.a = audioPolicy;
        this.b = ygwVar;
        this.c = defpackage.jfr.c(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static android.media.audiopolicy.AudioMix e(int i, int i2, defpackage.ygw ygwVar) {
        android.media.audiopolicy.AudioMixingRule.Builder builder = new android.media.audiopolicy.AudioMixingRule.Builder();
        for (int i3 = 0; i3 < ((defpackage.ymx) ygwVar).c; i3++) {
            java.lang.Integer num = (java.lang.Integer) ygwVar.get(i3);
            num.getClass();
            builder.addRule(new android.media.AudioAttributes.Builder().setUsage(num.intValue()).build(), 1);
        }
        android.media.audiopolicy.AudioMixingRule audioMixingRuleBuild = builder.build();
        return new android.media.audiopolicy.AudioMix.Builder(audioMixingRuleBuild).setFormat(new android.media.AudioFormat.Builder().setEncoding(2).setChannelMask(i2).setSampleRate(i).build()).setRouteFlags(2).build();
    }

    static android.media.audiopolicy.AudioMix f(int i) {
        android.media.AudioAttributes.Builder builder = new android.media.AudioAttributes.Builder();
        try {
            builder = (android.media.AudioAttributes.Builder) builder.getClass().getMethod("addTag", java.lang.String.class).invoke(builder, "fixedVolume");
        } catch (java.lang.ReflectiveOperationException unused) {
        }
        builder.getClass();
        builder.setUsage(12);
        android.media.AudioAttributes audioAttributesBuild = builder.build();
        android.media.AudioFormat.Builder builder2 = new android.media.AudioFormat.Builder();
        builder2.setEncoding(2);
        builder2.setSampleRate(i);
        builder2.setChannelMask(16);
        return new android.media.audiopolicy.AudioMix.Builder(new android.media.audiopolicy.AudioMixingRule.Builder().addRule(audioAttributesBuild, 1).build()).setFormat(builder2.build()).setRouteFlags(2).build();
    }

    @Override // defpackage.itm
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final int a() {
        android.media.AudioManager audioManager = (android.media.AudioManager) this.c.getSystemService("audio");
        audioManager.getClass();
        return audioManager.registerAudioPolicy(this.a);
    }

    @Override // defpackage.itm
    public final /* bridge */ /* synthetic */ defpackage.itn b(int i) throws android.os.RemoteException {
        if (i >= 0) {
            defpackage.ygw ygwVar = this.b;
            if (i < ygwVar.size()) {
                android.media.AudioRecord audioRecordCreateAudioRecordSink = this.a.createAudioRecordSink((android.media.audiopolicy.AudioMix) ygwVar.get(i));
                defpackage.yqm yqmVar = defpackage.itr.a;
                if (audioRecordCreateAudioRecordSink != null) {
                    return new defpackage.itr(audioRecordCreateAudioRecordSink);
                }
                return null;
            }
        }
        throw new java.lang.IllegalArgumentException(defpackage.a.bo(i, "AudioPolicy not configured with token "));
    }

    @Override // defpackage.itm
    public final /* bridge */ /* synthetic */ defpackage.itn c(int i, defpackage.ygw ygwVar) throws android.os.RemoteException {
        android.media.audiopolicy.AudioMix audioMixE = e(i, 12, ygwVar);
        defpackage.ygw ygwVarQ = defpackage.ygw.q(audioMixE);
        android.media.audiopolicy.AudioPolicy audioPolicy = this.a;
        audioPolicy.attachMixes(ygwVarQ);
        android.media.AudioRecord audioRecordCreateAudioRecordSink = audioPolicy.createAudioRecordSink(audioMixE);
        defpackage.yqm yqmVar = defpackage.itr.a;
        if (audioRecordCreateAudioRecordSink != null) {
            return new defpackage.itr(audioRecordCreateAudioRecordSink);
        }
        return null;
    }

    @Override // defpackage.itm
    public final void d() {
        android.media.AudioManager audioManager = (android.media.AudioManager) this.c.getSystemService("audio");
        audioManager.getClass();
        audioManager.unregisterAudioPolicyAsync(this.a);
    }
}
