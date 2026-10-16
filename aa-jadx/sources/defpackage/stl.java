package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class stl {
    public static final int a;
    private static volatile boolean b = false;
    private static volatile boolean c = false;

    static {
        a = android.os.Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
        new defpackage.ynu("android.settings.SETTINGS_EMBED_DEEP_LINK_ACTIVITY");
    }

    public static android.app.PendingIntent a(android.content.Context context, android.content.Intent intent, int i) {
        return android.app.PendingIntent.getActivity(context, 0, intent, i);
    }

    public static android.app.PendingIntent b(android.content.Context context, android.content.Intent intent, int i) {
        return android.app.PendingIntent.getBroadcast(context, 0, intent, i);
    }
}
