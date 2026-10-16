package defpackage;

import android.companion.virtual.VirtualDeviceManager;

/* loaded from: classes.dex */
final /* synthetic */ class jmb extends afey implements afec {
    public static final jmb a = new jmb();

    public jmb() {
        super(1, VirtualDeviceManager.VirtualDevice.class, "close", "close()V", 0);
    }

    @Override // defpackage.afec
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        VirtualDeviceManager.VirtualDevice virtualDevice = (VirtualDeviceManager.VirtualDevice) obj;
        virtualDevice.getClass();
        virtualDevice.close();
        return afak.a;
    }
}
