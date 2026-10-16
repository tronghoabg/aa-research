package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qem extends defpackage.qel {
    private final defpackage.qdz a;

    public qem(defpackage.qdz qdzVar) {
        this.a = qdzVar;
    }

    @Override // defpackage.qel
    public final void a(long j, int i, int i2, byte[] bArr) throws android.os.RemoteException {
        this.a.f(j, i, i2, bArr);
    }

    @Override // defpackage.qel
    public final byte[] b(long j, int i, byte[] bArr) throws android.os.RemoteException {
        this.a.g(j, i, bArr);
        return new byte[0];
    }

    @Override // defpackage.qel
    public final byte[] c(long j, int i) throws android.os.RemoteException {
        throw new java.lang.IllegalStateException();
    }

    @Override // defpackage.qel
    public final android.os.Bundle d(long j) throws android.os.RemoteException {
        throw new java.lang.IllegalStateException();
    }

    @Override // defpackage.qel
    public final void e(long j, android.os.Bundle bundle) throws android.os.RemoteException {
        this.a.h(j, bundle);
    }
}
