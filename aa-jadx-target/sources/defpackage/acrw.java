package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acrw implements acrv {
    private static final defpackage.wdf a;
    private static final defpackage.wdf b;

    static {
        defpackage.rkq rkqVar = defpackage.acmi.b;
        a = rkqVar.u("FirstDrive__first_drive_notification_enabled", false);
        b = rkqVar.t("FirstDrive__notification_url", "https://android.com/auto");
    }

    public final java.lang.String a() {
        return (java.lang.String) b.fF();
    }

    public final boolean b() {
        return ((java.lang.Boolean) a.fF()).booleanValue();
    }
}
