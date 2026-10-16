package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class kyb extends android.media.AudioDeviceCallback {
    final /* synthetic */ defpackage.kyd a;

    public kyb(defpackage.kyd kydVar) {
        this.a = kydVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
        this.a.a();
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
        this.a.a();
    }
}
