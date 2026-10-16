package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.audiopolicy.AudioMix;
import android.media.audiopolicy.AudioMixingRule;
import android.media.audiopolicy.AudioPolicy;
import android.os.RemoteException;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes.dex */
public final class iti implements ite {
    private final AudioPolicy a;
    private final yfq b;
    private final Context c;

    static {
        yph.c("CAR.AUDIO");
    }

    public iti(AudioPolicy audioPolicy, yfq yfqVar, Context context) {
        this.a = audioPolicy;
        this.b = yfqVar;
        this.c = jfj.c(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static AudioMix e(int i, int i2, yfq yfqVar) {
        AudioMixingRule.Builder builder = new AudioMixingRule.Builder();
        for (int i3 = 0; i3 < ((yls) yfqVar).c; i3++) {
            Integer num = (Integer) yfqVar.get(i3);
            num.getClass();
            builder.addRule(new AudioAttributes.Builder().setUsage(num.intValue()).build(), 1);
        }
        AudioMixingRule audioMixingRuleBuild = builder.build();
        return new AudioMix.Builder(audioMixingRuleBuild).setFormat(new AudioFormat.Builder().setEncoding(2).setChannelMask(i2).setSampleRate(i).build()).setRouteFlags(2).build();
    }

    static AudioMix f(int i) throws IllegalArgumentException {
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        try {
            builder = (AudioAttributes.Builder) builder.getClass().getMethod("addTag", String.class).invoke(builder, "fixedVolume");
        } catch (ReflectiveOperationException unused) {
        }
        builder.getClass();
        builder.setUsage(12);
        AudioAttributes audioAttributesBuild = builder.build();
        AudioFormat.Builder builder2 = new AudioFormat.Builder();
        builder2.setEncoding(2);
        builder2.setSampleRate(i);
        builder2.setChannelMask(16);
        return new AudioMix.Builder(new AudioMixingRule.Builder().addRule(audioAttributesBuild, 1).build()).setFormat(builder2.build()).setRouteFlags(2).build();
    }

    @Override // defpackage.ite
    @ResultIgnorabilityUnspecified
    public final int a() {
        AudioManager audioManager = (AudioManager) this.c.getSystemService("audio");
        audioManager.getClass();
        return audioManager.registerAudioPolicy(this.a);
    }

    @Override // defpackage.ite
    public final /* bridge */ /* synthetic */ itf b(int i) throws RemoteException {
        if (i >= 0) {
            yfq yfqVar = this.b;
            if (i < yfqVar.size()) {
                AudioRecord audioRecordCreateAudioRecordSink = this.a.createAudioRecordSink((AudioMix) yfqVar.get(i));
                yph yphVar = itj.a;
                if (audioRecordCreateAudioRecordSink != null) {
                    return new itj(audioRecordCreateAudioRecordSink);
                }
                return null;
            }
        }
        throw new IllegalArgumentException(a.bp(i, "AudioPolicy not configured with token "));
    }

    @Override // defpackage.ite
    public final /* bridge */ /* synthetic */ itf c(int i, yfq yfqVar) throws RemoteException {
        AudioMix audioMixE = e(i, 12, yfqVar);
        yfq yfqVarQ = yfq.q(audioMixE);
        AudioPolicy audioPolicy = this.a;
        audioPolicy.attachMixes(yfqVarQ);
        AudioRecord audioRecordCreateAudioRecordSink = audioPolicy.createAudioRecordSink(audioMixE);
        yph yphVar = itj.a;
        if (audioRecordCreateAudioRecordSink != null) {
            return new itj(audioRecordCreateAudioRecordSink);
        }
        return null;
    }

    @Override // defpackage.ite
    public final void d() {
        AudioManager audioManager = (AudioManager) this.c.getSystemService("audio");
        audioManager.getClass();
        audioManager.unregisterAudioPolicyAsync(this.a);
    }
}
