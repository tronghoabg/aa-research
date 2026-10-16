package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fml {
    public static final java.lang.String a = defpackage.fjv.b("SystemJobInfoConverter");
    public final android.content.ComponentName b;

    public fml(android.content.Context context) {
        this.b = new android.content.ComponentName(context.getApplicationContext(), (java.lang.Class<?>) androidx.work.impl.background.systemjob.SystemJobService.class);
    }
}
