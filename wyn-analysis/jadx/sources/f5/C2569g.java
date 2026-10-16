package f5;

import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: f5.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2569g implements BluetoothProfile.ServiceListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2570h f34839a;

    public C2569g(C2570h c2570h) {
        this.f34839a = c2570h;
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceConnected(int i5, BluetoothProfile proxy) {
        AbstractC3340k.e(proxy, "proxy");
        if (i5 == 1) {
            C2570h c2570h = this.f34839a;
            c2570h.f34863u = (BluetoothHeadset) proxy;
            c2570h.c("Found a headset: " + c2570h.f34863u);
        }
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceDisconnected(int i5) {
        if (i5 == 1) {
            C2570h c2570h = this.f34839a;
            c2570h.c("Clearing headset: ");
            c2570h.f34863u = null;
        }
    }
}
