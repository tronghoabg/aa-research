package defpackage;

/* loaded from: classes.dex */
public final class acqr implements acqq {
    private static final wcv a = new wcv(aclg.b, 6);

    @Override // defpackage.acqq
    public final long a() {
        return ((Long) a.b(0, "Feedback__max_attachments_size", 30408704L).gu()).longValue();
    }

    @Override // defpackage.acqq
    public final long b() {
        return ((Long) a.b(1, "Feedback__notification_cooldown_secs", 86400L).gu()).longValue();
    }

    @Override // defpackage.acqq
    public final long c() {
        return ((Long) a.b(5, "Feedback__user_education_nth_run_count", 5L).gu()).longValue();
    }

    @Override // defpackage.acqq
    public final boolean d() {
        return ((Boolean) a.d(2, "Feedback__send_feedback_launcher_item_enabled", false).gu()).booleanValue();
    }

    @Override // defpackage.acqq
    public final boolean e() {
        return ((Boolean) a.d(3, "Feedback__user_education_enabled", false).gu()).booleanValue();
    }

    @Override // defpackage.acqq
    public final boolean f() {
        return ((Boolean) a.d(4, "Feedback__user_education_is_dry_run", false).gu()).booleanValue();
    }
}
