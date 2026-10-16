package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dcv extends android.database.ContentObserver {
    final /* synthetic */ aiyk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcv(aiyk aiykVar, android.os.Handler handler) {
        super(handler);
        this.a = aiykVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, android.net.Uri uri) {
        this.a.j(defpackage.afbk.a);
    }
}
