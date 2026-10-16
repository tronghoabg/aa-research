package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jmn {
    public final android.companion.CompanionDeviceManager a;

    public jmn(android.companion.CompanionDeviceManager companionDeviceManager) {
        this.a = companionDeviceManager;
    }

    public final java.util.List a() {
        java.util.List listM = ag$.ExternalSyntheticApiModelOutline0.m(this.a);
        listM.getClass();
        return listM;
    }

    public final void b(int i) {
        this.a.notifyDeviceDisappeared(i);
    }
}
