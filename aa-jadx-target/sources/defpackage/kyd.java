package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class kyd extends defpackage.eqs {
    private final android.media.AudioManager a;
    private final int h;
    private final android.media.AudioDeviceCallback i = new kyb(this);

    public kyd(android.content.Context context) {
        android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
        audioManager.getClass();
        this.a = audioManager;
        this.h = 1;
    }

    public final void a() {
        android.media.AudioDeviceInfo[] devices = this.a.getDevices(this.h);
        defpackage.yhv yhvVar = new defpackage.yhv();
        for (android.media.AudioDeviceInfo audioDeviceInfo : devices) {
            yhvVar.c(new kyc(audioDeviceInfo.getProductName().toString(), jx$.ExternalSyntheticApiModelOutline3.m(audioDeviceInfo), audioDeviceInfo.getType(), audioDeviceInfo));
        }
        m(yhvVar.g());
    }

    @Override // defpackage.eqp
    protected final void c() {
        a();
        this.a.registerAudioDeviceCallback(this.i, null);
    }

    @Override // defpackage.eqp
    protected final void d() {
        this.a.unregisterAudioDeviceCallback(this.i);
        m(defpackage.ynd.a);
    }
}
