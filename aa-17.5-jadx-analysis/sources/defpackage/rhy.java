package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.hardware.usb.UsbManager;
import android.hardware.usb.UsbPort;
import android.hardware.usb.UsbPortStatus;
import android.os.Build;
import com.google.android.gms.carsetup.CarSetupServiceImpl;
import com.google.android.gms.carsetup.setup.UsbConnectionHelper;
import com.google.android.projection.gearhead.GhApplication;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final /* synthetic */ class rhy implements xyc {
    private final /* synthetic */ int a;

    public /* synthetic */ rhy(int i) {
        this.a = i;
    }

    @Override // defpackage.xyc
    public final Object gu() {
        int i = 0;
        switch (this.a) {
            case 0:
                xyc xycVar = rhz.a;
                return Build.VERSION.SDK_INT >= 30 ? new ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.carservice.gmscorecompat.CarSetupServiceImpl") : new ComponentName("com.google.android.gms", "com.google.android.gms.carsetup.CarSetupService");
            case 1:
                xyc xycVar2 = rhz.a;
                return Build.VERSION.SDK_INT >= 30 ? new ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.carservice.gmscorecompat.CarChimeraService") : new ComponentName("com.google.android.gms", "com.google.android.gms.car.CarService");
            case 2:
                xyc xycVar3 = rhz.a;
                return Build.VERSION.SDK_INT >= 30 ? new ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.carservice.gmscorecompat.FirstActivityImpl") : new ComponentName("com.google.android.gms", "com.google.android.gms.car.FirstActivity");
            case 3:
                xyc xycVar4 = rhz.a;
                return Build.VERSION.SDK_INT >= 30 ? new ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.carservice.gmscorecompat.CarStartupServiceImpl") : new ComponentName("com.google.android.gms", "com.google.android.gms.carsetup.wifi.CarWifiConnectionService");
            case 4:
                return Long.valueOf(adbr.a.gu().a());
            case 5:
                return Long.valueOf(adbr.a.gu().d());
            case 6:
                return Long.valueOf(adbr.a.gu().i());
            case 7:
                ypf ypfVar = CarSetupServiceImpl.a;
                adal adalVar = adal.a;
                return Boolean.valueOf(adalVar.gu().c() && !adalVar.gu().b());
            case 8:
                Context context = UsbConnectionHelper.TrackedParcelFileDescriptor.h;
                context.getClass();
                UsbManager usbManager = (UsbManager) context.getSystemService("usb");
                usbManager.getClass();
                Iterator it = usbManager.getPorts().iterator();
                while (true) {
                    if (it.hasNext()) {
                        UsbPortStatus status = ((UsbPort) it.next()).getStatus();
                        if (status == null || !status.isConnected()) {
                        }
                    } else {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 9:
                ypf ypfVar2 = sgp.a;
                return new rju(yfq.r("com.google.android.gms", "com.google.android.projection.gearhead"));
            case 10:
                int i2 = spp.a;
                return Pattern.compile("\\((?:eng-)?(\\d+)-(.+?)[-)$]");
            case 11:
                return vvp.a();
            case 12:
                AtomicReference atomicReference = wae.a;
                return yrm.aJ(Executors.newSingleThreadScheduledExecutor(new wad(i)));
            case 13:
                wgn.a.gu();
                return null;
            case 14:
                xyc xycVar5 = wgn.a;
                System.loadLibrary("mappedcountercacheversionjni");
                return null;
            default:
                int i3 = GhApplication.b;
                return yrm.aJ(Executors.newSingleThreadScheduledExecutor());
        }
    }
}
