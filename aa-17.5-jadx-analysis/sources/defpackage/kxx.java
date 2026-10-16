package defpackage;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;

/* loaded from: classes.dex */
public class kxx extends eqm {
    private final AudioManager a;
    private final int h;
    private final AudioDeviceCallback i = new kxv(this);

    public kxx(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        audioManager.getClass();
        this.a = audioManager;
        this.h = 1;
    }

    public final void a() {
        AudioDeviceInfo[] devices = this.a.getDevices(this.h);
        ygp ygpVar = new ygp();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            ygpVar.c(new kxw(audioDeviceInfo.getProductName().toString(), audioDeviceInfo.getAddress(), audioDeviceInfo.getType(), audioDeviceInfo));
        }
        m(ygpVar.g());
    }

    @Override // defpackage.eqj
    protected final void c() {
        a();
        this.a.registerAudioDeviceCallback(this.i, null);
    }

    @Override // defpackage.eqj
    protected final void d() {
        this.a.unregisterAudioDeviceCallback(this.i);
        m(yly.a);
    }
}
