package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class jiq extends android.database.ContentObserver {
    final /* synthetic */ defpackage.jkr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jiq(android.os.Handler handler, defpackage.jkr jkrVar) {
        super(handler);
        this.a = jkrVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, android.net.Uri uri) {
        defpackage.jit.D(((defpackage.inh) this.a).l);
    }
}
