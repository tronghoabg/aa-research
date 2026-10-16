package defpackage;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* loaded from: classes2.dex */
final class kxv extends AudioDeviceCallback {
    final /* synthetic */ kxx a;

    public kxv(kxx kxxVar) {
        this.a = kxxVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.a.a();
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.a.a();
    }
}
