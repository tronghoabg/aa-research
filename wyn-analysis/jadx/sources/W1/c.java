package W1;

import J9.C0656o;
import N1.C0754c;
import R8.C0805a;
import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import ff.AbstractC2641B;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class c extends AudioDeviceCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14949a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14950b;

    public /* synthetic */ c(Object obj, int i5) {
        this.f14949a = i5;
        this.f14950b = obj;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] addedDevices) {
        Object obj = this.f14950b;
        switch (this.f14949a) {
            case 0:
                C0656o c0656o = (C0656o) obj;
                c0656o.g(b.b((Context) c0656o.f5962b, (C0754c) c0656o.f5970j, (Y9.c) c0656o.f5969i));
                break;
            default:
                AbstractC3340k.e(addedDevices, "addedDevices");
                ArrayList arrayList = new ArrayList(addedDevices.length);
                for (AudioDeviceInfo audioDeviceInfo : addedDevices) {
                    arrayList.add(AbstractC2641B.r(audioDeviceInfo));
                }
                ((C0805a) obj).m("onAudioDevicesAdded", arrayList);
                break;
        }
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] removedDevices) {
        Object obj = this.f14950b;
        switch (this.f14949a) {
            case 0:
                C0656o c0656o = (C0656o) obj;
                if (Q1.x.k((Y9.c) c0656o.f5969i, removedDevices)) {
                    c0656o.f5969i = null;
                }
                c0656o.g(b.b((Context) c0656o.f5962b, (C0754c) c0656o.f5970j, (Y9.c) c0656o.f5969i));
                break;
            default:
                AbstractC3340k.e(removedDevices, "removedDevices");
                ArrayList arrayList = new ArrayList(removedDevices.length);
                for (AudioDeviceInfo audioDeviceInfo : removedDevices) {
                    arrayList.add(AbstractC2641B.r(audioDeviceInfo));
                }
                ((C0805a) obj).m("onAudioDevicesRemoved", arrayList);
                break;
        }
    }
}
