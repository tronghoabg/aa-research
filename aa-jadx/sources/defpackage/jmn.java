package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jmn {
    public final android.companion.CompanionDeviceManager a;

    public jmn(android.companion.CompanionDeviceManager companionDeviceManager) {
        this.a = companionDeviceManager;
    }

    public final java.util.List a() {
        java.util.List myAssociations = this.a.getMyAssociations();
        myAssociations.getClass();
        return myAssociations;
    }

    public final void b(int i) {
        this.a.notifyDeviceDisappeared(i);
    }
}
