package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ocl extends defpackage.eqp {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.SevThermalStatusLD");
    private final android.os.PowerManager.OnThermalStatusChangedListener h;
    private final defpackage.afar i;

    public ocl() {
        this.h = android.os.Build.VERSION.SDK_INT >= 29 ? new defpackage.ock(this, 0) : null;
        this.i = new defpackage.afay(new defpackage.nhn(14));
    }

    private final android.os.PowerManager a() {
        java.lang.Object objA = this.i.a();
        objA.getClass();
        return (android.os.PowerManager) objA;
    }

    @Override // defpackage.eqp
    protected final void c() {
        android.os.PowerManager.OnThermalStatusChangedListener onThermalStatusChangedListener = this.h;
        if (onThermalStatusChangedListener == null || android.os.Build.VERSION.SDK_INT < 29) {
            return;
        }
        ep$.ExternalSyntheticApiModelOutline0.m$1(a(), onThermalStatusChangedListener);
    }

    @Override // defpackage.eqp
    protected final void d() {
        android.os.PowerManager.OnThermalStatusChangedListener onThermalStatusChangedListener = this.h;
        if (onThermalStatusChangedListener == null || android.os.Build.VERSION.SDK_INT < 29) {
            return;
        }
        ep$.ExternalSyntheticApiModelOutline0.m(a(), onThermalStatusChangedListener);
    }
}
