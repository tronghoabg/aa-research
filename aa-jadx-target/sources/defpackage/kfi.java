package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class kfi extends android.database.ContentObserver {
    final /* synthetic */ defpackage.kfk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfi(defpackage.kfk kfkVar, android.os.Handler handler) {
        super(handler);
        this.a = kfkVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        ((defpackage.yqj) defpackage.kfk.a.l().ai((char) 2989)).u("Content observer changed");
        this.a.a();
    }
}
