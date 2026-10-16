package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nzv extends android.content.BroadcastReceiver {
    final /* synthetic */ defpackage.bwx a;
    final /* synthetic */ defpackage.byl b;

    public nzv(defpackage.byl bylVar, defpackage.bwx bwxVar) {
        this.b = bylVar;
        this.a = bwxVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        context.getClass();
        intent.getClass();
        j$.time.Duration duration = defpackage.nzt.a;
        this.b.h(java.lang.System.currentTimeMillis());
        if (defpackage.afga.f(intent.getAction(), "android.intent.action.TIME_SET") || defpackage.afga.f(intent.getAction(), "android.intent.action.TIMEZONE_CHANGED")) {
            this.a.b(java.lang.Boolean.valueOf(android.text.format.DateFormat.is24HourFormat(context)));
        }
    }
}
