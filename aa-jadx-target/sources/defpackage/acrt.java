package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acrt implements acrs {
    private static final defpackage.wdr a = new defpackage.wdr(defpackage.acmi.b, 6);

    public final long a() {
        return ((java.lang.Long) a.b(0, "Feedback__max_attachments_size", 30408704L).fF()).longValue();
    }

    public final long b() {
        return ((java.lang.Long) a.b(1, "Feedback__notification_cooldown_secs", 86400L).fF()).longValue();
    }

    public final long c() {
        return ((java.lang.Long) a.b(5, "Feedback__user_education_nth_run_count", 5L).fF()).longValue();
    }

    public final boolean d() {
        return ((java.lang.Boolean) a.d(2, "Feedback__send_feedback_launcher_item_enabled", false).fF()).booleanValue();
    }

    public final boolean e() {
        return ((java.lang.Boolean) a.d(3, "Feedback__user_education_enabled", false).fF()).booleanValue();
    }

    public final boolean f() {
        return ((java.lang.Boolean) a.d(4, "Feedback__user_education_is_dry_run", false).fF()).booleanValue();
    }
}
