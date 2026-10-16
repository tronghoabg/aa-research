package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class obe extends android.database.ContentObserver {
    final /* synthetic */ defpackage.obf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public obe(defpackage.obf obfVar, android.os.Handler handler) {
        super(handler);
        this.a = obfVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.j(java.lang.Boolean.valueOf(defpackage.obf.a()));
    }
}
