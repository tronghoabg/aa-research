package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xao extends android.os.FileObserver {
    final /* synthetic */ defpackage.xap a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xao(defpackage.xap xapVar, java.lang.String str) {
        super(str, 520);
        this.a = xapVar;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, java.lang.String str) {
        int i2 = defpackage.xap.d;
        this.a.a();
    }
}
