package defpackage;

/* loaded from: classes.dex */
public final class acqu implements acqt {
    private static final wcj a;
    private static final wcj b;

    static {
        rju rjuVar = aclg.b;
        a = rjuVar.u("FirstDrive__first_drive_notification_enabled", false);
        b = rjuVar.t("FirstDrive__notification_url", "https://android.com/auto");
    }

    @Override // defpackage.acqt
    public final String a() {
        return (String) b.gu();
    }

    @Override // defpackage.acqt
    public final boolean b() {
        return ((Boolean) a.gu()).booleanValue();
    }
}
