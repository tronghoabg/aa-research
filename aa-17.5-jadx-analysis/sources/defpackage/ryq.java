package defpackage;

import android.hardware.usb.UsbManager;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes2.dex */
final class ryq {
    public static final /* synthetic */ int a = 0;
    private static final ypf b = ols.R("CAR.SERVICE");

    @ResultIgnorabilityUnspecified
    static ryv a(UsbManager usbManager, ryt rytVar) {
        Object objF = roc.f(UsbManager.class, "getPortStatus", usbManager, new Object[]{roc.e("android.hardware.usb.UsbPort").cast(rytVar.a)}, roc.e("android.hardware.usb.UsbPort"));
        if (objF == null) {
            return null;
        }
        if (!roc.e("android.hardware.usb.UsbPortStatus").isInstance(objF)) {
            throw new IllegalArgumentException("usbPortStatus is not android.hardware.usb.UsbPortStatus");
        }
        ryu ryuVar = new ryu();
        Object objF2 = roc.f(objF.getClass(), "isConnected", objF, new Object[0], new Class[0]);
        ryuVar.b(objF2 != null ? ((Boolean) objF2).booleanValue() : false);
        ryuVar.c(ryv.a(objF, "getCurrentDataRole"));
        ryuVar.e(ryv.a(objF, "getCurrentPowerRole"));
        ryuVar.f(ryv.a(objF, "getSupportedRoleCombinations"));
        ryuVar.d(ryv.a(objF, "getCurrentMode"));
        return ryuVar.a();
    }

    static void b(UsbManager usbManager) {
        b.f().ai(8559).u("Resetting connection via setCurrentFunction on UsbManager");
        roc.f(UsbManager.class, "setCurrentFunction", usbManager, new Object[]{"ptp", false}, String.class, Boolean.TYPE);
    }

    static ryt[] c(UsbManager usbManager) {
        Object[] objArr = (Object[]) roc.f(UsbManager.class, "getPorts", usbManager, new Object[0], new Class[0]);
        if (objArr == null) {
            return new ryt[0];
        }
        int length = objArr.length;
        ryt[] rytVarArr = new ryt[length];
        for (int i = 0; i < length; i++) {
            rytVarArr[i] = new ryt(objArr[i]);
        }
        return rytVarArr;
    }
}
