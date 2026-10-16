package defpackage;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class qdq extends qdo {
    private final qdc a;

    public qdq(qdc qdcVar) {
        this.a = qdcVar;
    }

    @Override // defpackage.qdo
    public final void a(long j, int i, int i2, byte[] bArr) throws RemoteException {
        this.a.f(j, i, i2, bArr);
    }

    @Override // defpackage.qdo
    public final byte[] b(long j, int i, byte[] bArr) throws RemoteException {
        this.a.e(j, i, bArr);
        return new byte[0];
    }

    @Override // defpackage.qdo
    public final byte[] c(long j, int i) throws RemoteException {
        throw new IllegalStateException();
    }

    @Override // defpackage.qdo
    public final Bundle d(long j) throws RemoteException {
        throw new IllegalStateException();
    }

    @Override // defpackage.qdo
    public final void e(long j, Bundle bundle) throws RemoteException {
        this.a.h(j, bundle);
    }
}
