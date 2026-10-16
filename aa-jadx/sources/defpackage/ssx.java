package defpackage;

/* JADX INFO: loaded from: classes2.dex */
abstract class ssx extends defpackage.smr {
    public ssx(defpackage.slz slzVar) {
        super(slzVar);
    }

    @Override // defpackage.smr
    protected final /* bridge */ /* synthetic */ void b(defpackage.slm slmVar) throws android.os.RemoteException {
        defpackage.stb stbVar = (defpackage.stb) slmVar;
        android.content.Context context = stbVar.b;
        l((defpackage.std) stbVar.v());
    }

    protected abstract void l(defpackage.std stdVar) throws android.os.RemoteException;
}
