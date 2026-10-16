package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fkv extends defpackage.faq {
    private final android.content.Context c;

    public fkv(android.content.Context context, int i, int i2) {
        super(i, i2);
        this.c = context;
    }

    @Override // defpackage.faq
    public final void a(defpackage.fbs fbsVar) {
        if (this.b >= 10) {
            fbsVar.j(new java.lang.Object[]{"reschedule_needed", 1});
        } else {
            this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
