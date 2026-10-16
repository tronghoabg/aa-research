package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ojh implements defpackage.affk {
    @Override // defpackage.affk
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        int iIntValue = ((java.lang.Integer) obj).intValue();
        boolean zBooleanValue = ((java.lang.Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) obj3).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) obj4).booleanValue();
        boolean zBooleanValue4 = ((java.lang.Boolean) obj5).booleanValue();
        boolean zBooleanValue5 = ((java.lang.Boolean) obj6).booleanValue();
        defpackage.afde afdeVar = new defpackage.afde();
        if (zBooleanValue2) {
            afdeVar.add(defpackage.ojj.CAMERA);
        }
        if (zBooleanValue3) {
            afdeVar.add(defpackage.ojj.FLASHLIGHT);
        }
        if (zBooleanValue4) {
            afdeVar.add(defpackage.ojj.HOTSPOT);
        }
        android.view.Display display = ((android.hardware.display.DisplayManager) defpackage.mkp.a.c.getSystemService(android.hardware.display.DisplayManager.class)).getDisplay(0);
        display.getClass();
        if (display.getState() == 2 || display.getState() == 6) {
            afdeVar.add(defpackage.ojj.DISPLAY);
        }
        if (zBooleanValue5) {
            afdeVar.add(defpackage.ojj.WIRELESS_CHARGING);
        }
        return new defpackage.ojk(iIntValue, zBooleanValue, defpackage.afga.H(afdeVar));
    }
}
