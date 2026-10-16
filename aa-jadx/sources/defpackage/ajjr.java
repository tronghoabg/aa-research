package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ajjr implements java.util.concurrent.ThreadFactory {
    public final /* synthetic */ java.lang.String a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ ajjr(java.lang.String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.util.TimeZone timeZone = defpackage.ajjs.a;
        java.lang.Thread thread = new java.lang.Thread(runnable, this.a);
        thread.setDaemon(this.b);
        return thread;
    }
}
