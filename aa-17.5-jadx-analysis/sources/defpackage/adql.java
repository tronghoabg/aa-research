package defpackage;

/* loaded from: classes.dex */
enum adql {
    BIND_SERVICE("bindService"),
    BIND_SERVICE_AS_USER("bindServiceAsUser"),
    DEVICE_POLICY_BIND_SEVICE_ADMIN("DevicePolicyManager.bindDeviceAdminServiceAsUser");

    public final String d;

    adql(String str) {
        this.d = str;
    }
}
